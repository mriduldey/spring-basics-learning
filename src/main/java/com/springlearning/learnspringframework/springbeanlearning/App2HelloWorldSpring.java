package com.springlearning.learnspringframework.springbeanlearning;

import com.springlearning.learnspringframework.springbeanlearning.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App2HelloWorldSpring {
    public static  void main(String[] args) {
        //1. Launch spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameter"));
        System.out.println(context.getBean("person4Qualifier"));

        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("address2"));
        // It will used the address bean marked a @Primary in configuration file
        System.out.println(context.getBean(Address.class));


        // get list of all beans in context
        System.out.println("\n\nBean List: ");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
