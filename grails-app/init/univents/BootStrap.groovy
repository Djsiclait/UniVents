package univents

class BootStrap {

    def init = { servletContext ->
        def admin = new User(username: 'admin', password: 'admin', isAdmin: true)

        def deptList = []

        for (int i = 1; i <= 5; i++) {
            def dept = new Department(title: 'Department ' + i)
            def cat = new Category(title: 'Category ' + i)

            dept.createdBy = admin.username
            cat.createdBy = admin.username

            deptList.push(dept)

            dept.save(failOnError: true, flush: true)
            cat.save(failOnError: true, flush: true)
        }

        admin.departments = deptList
        admin.save(failOnError: true, flush: true)
    }
    def destroy = {
    }
}
