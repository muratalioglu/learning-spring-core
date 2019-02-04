package com.muratalioglu.springpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        final String xmlConfig = "applicationContext.xml";

        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlConfig);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.muratalioglu.springpractice");

        CarFactory carFactory = context.getBean("carFactory", CarFactory.class);
        System.out.println(carFactory.produce());
        System.out.println(carFactory.getShuttleService().run());

        Factory pcFactory = context.getBean("PCFactory", Factory.class);
        System.out.println(pcFactory.produce());
        System.out.println(((PCFactory) pcFactory).getContactName());
        System.out.println(((PCFactory) pcFactory).getContactEmail());

        Factory chocolateFactory = context.getBean("chocolateFactory", ChocolateFactory.class);
        System.out.println(chocolateFactory.produce());

        context.close();
    }
}
