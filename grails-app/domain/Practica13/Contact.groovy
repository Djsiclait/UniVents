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
    }
}
