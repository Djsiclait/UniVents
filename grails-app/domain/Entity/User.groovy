package Entity

class User implements Serializable{

    String firstName
    String lastName
    String cedula
    String email
    Date birthDate


    static belongsTo = [Event]
    static hasMany = [evento : Event]

    static constraints = {
        cedula(unique: true)
        firstName(blank: false)
        lastName(blank: false)
        email(email: true)
        birthDate(Date: true)
    }
}
