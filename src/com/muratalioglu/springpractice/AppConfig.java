package com.muratalioglu.springpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SparePartService profileService() {
        return new ProfileService();
    }

    @Bean
    public SparePartService PCSparePartService() {
        return new PowerAdapterService();
    }

    @Bean
    public ShuttleService shuttleService() {
        return new ShuttleService();
    }

    @Bean
    public Factory carFactory() {
        Factory factory = new CarFactory(profileService(), shuttleService());
        return factory;
    }

    @Bean
    public Factory PCFactory() {
        PCFactory factory = new PCFactory();
        factory.setSparePartService(PCSparePartService());
        factory.setShuttleService(shuttleService());
        return factory;
    }
}
