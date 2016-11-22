package univents

class Department {

    String name


    static hasMany = [ contacts: User]

    Set<User> getUsers() { }


    static constraints = {
        name(unique: true)
        contacts(nullable: false)
    }
}
