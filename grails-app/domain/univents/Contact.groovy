package univents

class Contact {

    String firstname
    String lastname
    String email
    String telephone
    String address
    String job
    String cellphone
    String createdBy
    String modifiedBy

    Date dateCreated
    Date lastUpdated

    static belongsTo = [category: Category]
    static hasMany = [departments: Department]

    static constraints = {
        firstname blank: false
        lastname blank: false
        email email: true, unique: true
        telephone minSize: 10, maxSize: 14
        cellphone minSize: 10, maxSize: 14
        address nullable: true
        job nullable: true
        createdBy nullable: true, display: false
        modifiedBy nullable: true, display: false
    }

    static mapping = {
        departments joinTable: [name: 'DepartmentContacts', key: 'contact_id']
    }

    @Override
    String toString() {
        return firstname + ' ' + lastname
    }
}
