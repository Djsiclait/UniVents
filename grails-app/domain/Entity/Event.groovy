package Entity

class Event implements Serializable{

    String name
    Date startDate
    Date endDate

    Set<User> getAttendees(){

    }

    static constraints = {
    }
}
