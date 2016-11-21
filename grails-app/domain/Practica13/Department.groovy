package Practica13

class Department implements Serializable {

    String name

    // Meta Attributes
    Date dateCreated
    Date dateUpdated

    static constraints = {
        name(unique: true)
        dateCreated(Date: true)
        dateUpdated(Date: true)
    }
}