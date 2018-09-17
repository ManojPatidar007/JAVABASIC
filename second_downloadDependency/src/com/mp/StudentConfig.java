package com.mp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
@Bean(name="student")
public student stu(){
	return new student();
}


}
