package com.puzzles;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {


    public HelloController(RequestMappingHandlerAdapter requestMappingHandlerAdapter){
        List<HttpMessageConverter<?>> messageConverters =
                requestMappingHandlerAdapter.getMessageConverters();
        for (HttpMessageConverter<?> messageConverter : messageConverters) {
            if(messageConverter instanceof MappingJackson2HttpMessageConverter ){
                (((MappingJackson2HttpMessageConverter)messageConverter).getObjectMapper()).setSerializationInclusion(JsonInclude.Include.NON_NULL);
            }
        }
    }


/*
    public HelloController(WebApplicationContext webApplicationContext){


     }*/

    @GetMapping(value = "/hi1")

    public Student hi1() {
        return new Student("xiaoming", Integer.valueOf(12));
    }

    @PostMapping("/hi2")
    public Student hi2(@RequestBody Student student) {
        return student;
    }

    @PostMapping("/hi3")
    public Student hi3(@RequestBody Student student) {
        return student;
    }

}