package com.javapassion.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(getPersonInfo(person));
    }
      
    public static String getPersonInfo(Person person) {
        return    "Name:" + person.getName() + "\n"
                + "Age:" + person.getAge() + "\n"
                + "Height: " + person.getHeight() + "\n"
                + "Is Programmer?: " + person.isProgrammer() + "\n"
                + "Address: " + person.getAddress().getStreetNumber() + " "
                              + person.getAddress().getStreetName() + " "
                              + person.getAddress().getCity() + " "
                              + person.getAddress().getCountry();
    }
}