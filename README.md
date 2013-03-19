Workshop
========
Here you can find an example of a simple RESTful application in Spring.


REST or notREST?
----------------

> My presentation about this workshop you can find [here](http://prezi.com/pkynlrsyx4zm/rest-or-notrest/?kw=view-pkynlrsyx4zm&rc=ref-34509697).

Simple RESTful application
---------------------------

> How to run it?

    cd rest-workshop
    mvn clean package jetty:run

> How to test GET method using Curl?

    curl -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/api/hello/Wilson

> How to test POST method using Curl?
    
    curl -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{"value": "Test value"}' http://localhost:8080/api/simple
    
> How to test PUT method using Curl?

    curl -H "Accept: application/json" -H "Content-Type: application/json" -X PUT -d '{"value": "Test value", "message": "Test message"}' http://localhost:8080/api/simple/test
