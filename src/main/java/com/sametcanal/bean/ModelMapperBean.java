package com.sametcanal.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperBean {

    @Bean
    public ModelMapperBean modelMapper(){
        return new ModelMapperBean();
    }
}
