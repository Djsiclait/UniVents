package Entity

class User implements Serializable{

    String firstName
    String lastName
    String cedula
    String email
    Date birthDate

    //static hasMany = [events: Event]

    //static mappedBy = [events: 'attendees']

    static constraints = {
    }
}
