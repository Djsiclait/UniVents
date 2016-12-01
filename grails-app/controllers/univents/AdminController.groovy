package univents

class AdminController {

    def index() {

        def departmentsColumns = [['string', 'Department'], ['number', 'Contacts per Department']]
        def departmentsList = Department.findAll()

        def departmentContactsData = []

        departmentsList.each { dept ->
            def data = [dept.title, dept.contacts.size()]
            departmentContactsData.push(data);
        }

        def categoriesColumns = [['string', 'Category'], ['number', 'Contacts per Category']]
        def categoriesList = Category.findAll()

        def categoryContactsData = []

        categoriesList.each { cat ->
            def data = [cat.title, cat.contacts.size()]
            categoryContactsData.push(data)
        }

        //retornando...
        [deptColumns: departmentsColumns, deptData: departmentContactsData, catColumns: categoriesColumns, catData: categoryContactsData];
    }
}