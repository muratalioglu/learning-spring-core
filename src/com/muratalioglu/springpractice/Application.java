package com.muratalioglu.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        final String xmlConfig = "applicationContext.xml";

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlConfig);

        CarFactory carFactory = context.getBean("carFactory", CarFactory.class);
        System.out.println(carFactory.produce());
        System.out.println(carFactory.getShuttleService().run());

        Factory pcFactory = context.getBean("PCFactory", PCFactory.class);
        System.out.println(pcFactory.produce());
        System.out.println(((PCFactory) pcFactory).getContactName());
        System.out.println(((PCFactory) pcFactory).getContactEmail());

        context.close();
    }
}
