<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'homepage.label', default: 'Homepage')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
   
    <body>
    
   
    <a href="${createLink(controller: 'Person', view:'index' , action:'index')}">Add a Person</a>
    
    <br>
    
    <a href="http://localhost:8080/person/personJson">view Person list in Json form</a>
    


    </body>
</html>