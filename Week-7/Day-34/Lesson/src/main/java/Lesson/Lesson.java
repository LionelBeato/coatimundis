package Lesson;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Lesson {

    // Web Services

    // What is a Web Service fundamentally?
    // a software system designed to support interoperable machine-to-machine
    // interaction over a network
    // web: an enormous interconnected network of resources
    // service: a server-based application or softwwre that exposes a resource to clients

    // web services can provide many different formats for resources
    // XML
    // extensible markup language - it's basically HTML with user defined elements
    // XML is used extensively and is widely considered a defacto standard for representing data
    // XML can be provided as a resource
    // JSON
    // this is considered the standard for JavaScript resources
    // in fact, JavaScript objects align one-to-one with JSON
    // JSON is not directly an object, but a direct representation of your resource

    // there are many for handling web services
    // terminal tools include cUrl, whois, nslookup, wget
    // GUI include Postman, SOAPUI, etc

    // the three big API web service standards are
    // SOAP
    // REST
    // GraphQL

    // URIs are the way you identify resources
    // URLs are a kind of a URI

    // it is possible to write a pure Java Web Service
    // it's just really hard and verbose

    // Tools and frameworks like Spring and Spring Boot ease the pain...
    // ...of writing server code


    public static void main(String[] args) throws IOException {

        // this code utitlizes sockets to provide a rudimentary webservice
        // that service simply returns a date value corresponding with today's date
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080...");
        while (true) {
            try (Socket socket = server.accept()) {
                Date today = new Date();
                // this string renders static content after the 200 OK message
                // theoretically, you can render static web pages via this method
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n"+"<h1>Hello</h1> <div>I'm inside a div!<div>";
                socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
        }
    }
}






