package finalparcial

import grails.gorm.services.Service

@Service(Homepage)
interface HomepageService {

    Homepage get(Serializable id)

    List<Homepage> list(Map args)

    Long count()

    void delete(Serializable id)

    Homepage save(Homepage homepage)

}