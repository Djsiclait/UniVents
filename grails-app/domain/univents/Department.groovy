package univents

class Department {

    String name


    static hasMany = [ contacts: Contact]

    //Set<User> getUsers() { }

    //Set<Contact> getContacts() { }

    static constraints = {
        name(unique: true)
        contacts(nullable: false)
    }
}
