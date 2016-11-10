package Entity

class EventUser implements Serializable{

    // Attributes
    User attendee
    Event event


    static EventUser get(long userId, long eventId){
        find("from EventUser where user.id = :userId and event.id = :eventId", [userId: userId, eventId: eventId])
    }


    static EventUser create(User user1, Event event1){
        new EventUser(attendee: user1, event: event1).save(flush: true);
    }

    static boolean remove(User user1, Event event1){
        EventUser instance = EventUser.findByAttendeeAndEvent(user1, event1);

        if (!instance)
            return false;

        instance.delete(flush: true);

        return true;
    }

    static constraints = {
    }
}
