package com.muratalioglu.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        final String xmlConfig = "applicationContext.xml";

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlConfig);

        Factory carFactory = context.getBean("carFactory", CarFactory.class);
        System.out.println(carFactory.produce());

        Factory PCFactory = context.getBean("PCFactory", PCFactory.class);
        System.out.println(PCFactory.produce());

    }
}
