package univents

class ChartsController {

    def index() { }

    def charts() {
        render view: '/charts/index'
    }

    def formatter() {
        render view: '/formatter/index'
    }

    def deprecated() {
        render view: '/deprecated/index'
    }
}
