package univents

class User {

    String username
    String password
    boolean isAdmin

    static hasMany = [departments: Department]

    Date dateCreated
    Date lastUpdated

    static constraints = {
        username blank: false, unique: true
        password blank: false
    }

    static mapping = {
        departments joinTable: [name: 'DepartmentUsers', key: 'user_id']
    }

    @Override
    String toString() {
        return username
    }
}
