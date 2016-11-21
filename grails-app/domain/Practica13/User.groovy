package Practica13

class User implements Serializable {

    // Attributes
    String username
    String firstName
    String lastName

    // Meta Attributes
    Date dateCreated
    Date dateUpdated

    static belongsTo = [Department]

    static constraints = {
        username(unique: true)
        firstName(blank: false)
        lastName(blank: false)
        dateCreated(Date: true)
        dateUpdated(Date: true)
    }
}
