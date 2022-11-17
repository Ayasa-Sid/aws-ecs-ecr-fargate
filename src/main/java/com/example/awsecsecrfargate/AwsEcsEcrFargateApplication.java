package com.example.awsecsecrfargate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class AwsEcsEcrFargateApplication {

    @GetMapping
    public String applicationStatus() {
        return "application is up and running";
    }


    @GetMapping("/{name}")
    public String welcome(@PathVariable String name){
        return "Hi" + name + "pull docker image to ECS using fargate";

    }


    public static void main(String[] args) {
        SpringApplication.run(AwsEcsEcrFargateApplication.class, args);
    }

}
