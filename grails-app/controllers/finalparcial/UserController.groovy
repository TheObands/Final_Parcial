package finalparcial

class UserController {

    def index() 
    { 
    }
    def login()
    {
        if(params.username=="admin" && params.password=="123")
        {
          redirect(controller: 'Homepage', view:'index' , action:'index')
          
        }
        else
        {
          render "Wrong"
        }
    }
}
