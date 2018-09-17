package com.mp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({teacher.class,student.class})
public class AppConfigs {

}
