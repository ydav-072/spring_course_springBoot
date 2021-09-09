package com.springapp.springboot.spring_course_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // == @Configuration, @EnableAutoConfiguration, @ComponentScan
public class SpringCourseSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCourseSpringBootApplication.class, args);
    }

}
