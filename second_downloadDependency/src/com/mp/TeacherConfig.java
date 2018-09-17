package com.mp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherConfig {
@Bean(name="teacher")
public teacher tec(){
	return new teacher();
}
}
