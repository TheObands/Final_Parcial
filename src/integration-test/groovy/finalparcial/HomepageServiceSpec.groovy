package finalparcial

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class HomepageServiceSpec extends Specification {

    HomepageService homepageService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Homepage(...).save(flush: true, failOnError: true)
        //new Homepage(...).save(flush: true, failOnError: true)
        //Homepage homepage = new Homepage(...).save(flush: true, failOnError: true)
        //new Homepage(...).save(flush: true, failOnError: true)
        //new Homepage(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //homepage.id
    }

    void "test get"() {
        setupData()

        expect:
        homepageService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Homepage> homepageList = homepageService.list(max: 2, offset: 2)

        then:
        homepageList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        homepageService.count() == 5
    }

    void "test delete"() {
        Long homepageId = setupData()

        expect:
        homepageService.count() == 5

        when:
        homepageService.delete(homepageId)
        sessionFactory.currentSession.flush()

        then:
        homepageService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Homepage homepage = new Homepage()
        homepageService.save(homepage)

        then:
        homepage.id != null
    }
}
