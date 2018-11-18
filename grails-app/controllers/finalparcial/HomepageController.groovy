package finalparcial

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class HomepageController {

    HomepageService homepageService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond homepageService.list(params), model:[homepageCount: homepageService.count()]
    }

    def show(Long id) {
        respond homepageService.get(id)
    }

    def create() {
        respond new Homepage(params)
    }

    def save(Homepage homepage) {
        if (homepage == null) {
            notFound()
            return
        }

        try {
            homepageService.save(homepage)
        } catch (ValidationException e) {
            respond homepage.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'homepage.label', default: 'Homepage'), homepage.id])
                redirect homepage
            }
            '*' { respond homepage, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond homepageService.get(id)
    }

    def update(Homepage homepage) {
        if (homepage == null) {
            notFound()
            return
        }

        try {
            homepageService.save(homepage)
        } catch (ValidationException e) {
            respond homepage.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'homepage.label', default: 'Homepage'), homepage.id])
                redirect homepage
            }
            '*'{ respond homepage, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        homepageService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'homepage.label', default: 'Homepage'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'homepage.label', default: 'Homepage'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
