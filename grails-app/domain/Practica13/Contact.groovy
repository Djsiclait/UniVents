package Practica13

class Contact implements Serializable {

    // Attributes
    String firstName
    String lastName
    String email
    String telephone
    String address
    String job
    String cellphone

    // Meta Attributes
    Date dateCreated
    Date dateUpdated

    static constraints = {
        email(unique: true, email: true, blank: false)
        telephone(unique: true, blank: false)
        firstName(blank: false)
        lastName(blank: false)
        address(blank: false)
        dateCreated(Date: true)
        dateUpdated(Date: true)
    }
}
