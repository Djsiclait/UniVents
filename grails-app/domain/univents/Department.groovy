package univents

class Department {

    String name


    static hasMany = [users: User, contacts: Contact]

    //Set<User> getUsers() { }

    //Set<Contact> getContacts() { }

    static constraints = {
        name(unique: true)
        users(nullable: false)
        contacts(nullable: false)
    }
}
