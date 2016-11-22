package univents

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class User {

    // Attributes
    String firstName
    String lastName
    String username//this is the email
    String password
    String telephone
    String address
    String job
    String cellphone

    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    static belongsTo = [Department]
    static hasMany = [departments: Department]

    Set<Roles> getAuthorities() {
        UsuarioRoles.findAllByUsuario(this)*.roles
    }



    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
    }

    static transients = ['springSecurityService']

    static constraints = {
        password (blank: false, password: true)
        username (blank: false, unique: true)
        telephone(unique: true, blank: false)
        firstName(blank: false)
        lastName(blank: false)
        address(blank: false)
        job(blank: true)
        cellphone(blank: true)
    }

    static mapping = {
        password column: '`password`'
    }
}
