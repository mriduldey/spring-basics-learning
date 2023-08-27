package com.springlearning.learnspringframework.springbeanlearning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}

record Address(String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
    // Configure the things that we want spring to manage -@Configuration
    @Bean
    public String name() {
        return "Mridul";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Mridul", 25, new Address("City Center", "Bangalore"));
    }

    // We can reuse existing bean
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address1()); // name, age, address
    }

    // Using existing beans as parameter
    @Bean
    public Person person3Parameter(String name, int age, Address address2) {
        return new Person(name, age, address2); // name, age, address
    }

    @Bean
    public Person person4Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address2) {
        return new Person(name, age, address2); // name, age, address
    }

    // Add name in bean to add custom bean name
    // Use @Primary to solve ambiguity while using Address.class
    @Bean(name = "address")
    @Primary
    public Address address1() {
        return new Address("Baker street", "London");
    }

    @Bean
    public Address address2() {
        return new Address("Pragatinagar, Hooghly", "Chinsurah");
    }

    @Bean
    @Qualifier("address3Qualifier")
    public Address address3() {
        return new Address("Indiranager, Bangalore", "Central bangalore");
    }
}
