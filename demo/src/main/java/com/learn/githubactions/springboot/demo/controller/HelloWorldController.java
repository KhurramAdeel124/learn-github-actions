package com.learn.githubactions.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

   @Value("${db.datasource.url}")
   private String databaseUrl;

   @Value("${db.datasource.username}")
   private String username;

   @Value("${db.datasource.password}")
   private String password;

    @GetMapping( value= "/hello")
    public String helloWorld(){
        return "hello my world..";
    }

    @GetMapping( value = "/environment-details")
    public String getEnvironmentDetails(){
        StringBuilder envDetails = new StringBuilder();
        envDetails.append("URL:").append(databaseUrl);
        envDetails.append(" UserName:").append(username);
        envDetails.append(" Password:").append(password);
        return  envDetails.toString();
    }

}
