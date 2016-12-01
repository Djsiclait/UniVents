package univents

class Category {

    String title
    String createdBy
    String modifiedBy

    Date dateCreated
    Date lastUpdated

    static hasMany = [contacts: Contact]

    static constraints = {
        title blank: false, minSize: 3, maxSize: 20
        createdBy nullable: true, display: false
        modifiedBy nullable: true, display: false
    }

    @Override
    String toString() {
        return title
    }
}
