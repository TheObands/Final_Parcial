package finalparcial

import crudwebapp.*

class BootStrap {

    def init = { servletContext ->
        
        new Person(name:"Juan",lastName:"Obando",
            email:"js@gmail.com").save(failOnError:true);
     
    }
    def destroy = {
    }
}
