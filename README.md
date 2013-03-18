Workshops
=========

REST or notREST?
----------------

> Prezentation online:

    http://prezi.com/pkynlrsyx4zm/rest-or-notrest/

Simple RESTfull application
---------------------------

> How to run it?

    cd rest-workshop
    mvn clean package jetty:run

> How to test it using Curl?
    
    curl -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{"value": "Test value"}' http://localhost:8080/api/simple
