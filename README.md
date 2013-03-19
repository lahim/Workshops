Workshops
=========

REST or notREST?
----------------

> Prezentation online:

    http://prezi.com/pkynlrsyx4zm/rest-or-notrest/

Simple RESTful application
---------------------------

> How to run it?

    cd rest-workshop
    mvn clean package jetty:run

<<<<<<< HEAD
> How to test it using Curl?
=======
    How to test GET method using Curl?

    curl -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/api/hello/Wilson

    How to test POST method using Curl?
>>>>>>> SimpleService was added with all demo jUnit tests
    
    curl -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{"value": "Test value"}' http://localhost:8080/api/simple
    
    How to test PUT method using Curl?

    curl -H "Accept: application/json" -H "Content-Type: application/json" -X PUT -d '{"value": "Test value", "message": "Test message"}' http://localhost:8080/api/simple/test
