package com.hwh.student_registration_system_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hwh.student_registration_system_api.mapper")
public class StudentRegistrationSystemApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentRegistrationSystemApiApplication.class, args);
    }

}
