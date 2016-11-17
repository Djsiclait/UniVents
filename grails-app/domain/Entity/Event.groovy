package Entity

class Event implements Serializable{

    String name
    Date startDate
    Date endDate

    static hasMany = [usuarios : User]


    Set<User> getAttendees(){

    }

    static constraints = {
        name(blank: false)
        startDate(Date: true)
        endDate(Date: true)
        usuarios(nullable: true)
    }
}
