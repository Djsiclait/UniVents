package univents

class Department {

    String title
    String createdBy
    String modifiedBy

    Date dateCreated
    Date lastUpdated

    static belongsTo = [Contact, User]
    static hasMany = [contacts: Contact, users: User]

    static constraints = {
        title blank: false, minSize: 2, maxSize: 20
        createdBy nullable: true, display: false
        modifiedBy nullable: true, display: false
    }

    static mapping = {
        contacts joinTable: [name: 'DepartmentContacts', key: 'department_id']
        users joinTable: [name: 'DepartmentUsers', key: 'department_id']
    }

    @Override
    String toString() {
        return title
    }
}
