package univents

import grails.gorm.DetachedCriteria
import groovy.transform.ToString
import org.apache.commons.lang.builder.HashCodeBuilder

@ToString(cache=true, includeNames=true, includePackage=false)
class UserRoles implements Serializable  {



    private static final long serialVersionUID = 1

    User usuario
    Roles roles

    @Override
    boolean equals(other) {
        if (other instanceof UserRoles) {
            other.usuarioId == usuario?.id && other.rolesId == roles?.id
        }
    }

    @Override
    int hashCode() {
        def builder = new HashCodeBuilder()
        if (usuario) builder.append(usuario.id)
        if (roles) builder.append(roles.id)
        builder.toHashCode()
    }

    static UserRoles get(long usuarioId, long rolesId) {
        criteriaFor(usuarioId, rolesId).get()
    }

    static boolean exists(long usuarioId, long rolesId) {
        criteriaFor(usuarioId, rolesId).count()
    }

    private static DetachedCriteria criteriaFor(long usuarioId, long rolesId) {
        UserRoles.where {
            usuario == Usuario.load(usuarioId) &&
                    roles == Roles.load(rolesId)
        }
    }

    static UserRoles create(User usuario, Roles roles) {
        def instance = new UserRoles(usuario: usuario, roles: roles)
        instance.save()
        instance
    }

    static boolean remove(User u, Roles r) {
        if (u != null && r != null) {
            UserRoles.where { usuario == u && roles == r }.deleteAll()
        }
    }

    static int removeAll(User u) {
        u == null ? 0 : UserRoles.where { usuario == u }.deleteAll()
    }

    static int removeAll(Roles r) {
        r == null ? 0 : UserRoles.where { roles == r }.deleteAll()
    }

    static constraints = {
        roles validator: { Roles r, UserRoles ur ->
            if (ur.usuario?.id) {
                UserRoles.withNewSession {
                    if (UserRoles.exists(ur.usuario.id, r.id)) {
                        return ['userRole.exists']
                    }
                }
            }
        }
    }

    static mapping = {
        id composite: ['usuario', 'roles']
        version false
    }
}
