package finalparcial

class Person {
    
    
    String name
    String lastName
    String email

    static constraints = {
        name(display:true)
        lastName(display:true)
        email(display:true)
    }
}
