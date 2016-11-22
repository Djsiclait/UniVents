package univents

class User {

    // Attributes
    String username
    String firstName
    String lastName


    static belongsTo = [Department]

    static constraints = {
        username(unique: true)
        firstName(blank: false)
        lastName(blank: false)

    }
}
