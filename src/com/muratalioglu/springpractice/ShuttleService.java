package com.muratalioglu.springpractice;

public class ShuttleService {
    public String run() {
        return "Shuttle Service is running.";
    }

    public void initService() {
        System.out.println("Shuttle Service is initialized.");
    }

    public void destroyService() {
        System.out.println("Shuttle Service is destroyed.");
    }
}
