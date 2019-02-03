package com.muratalioglu.springpractice;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ShuttleService {

    private List<String> shuttleHours = new ArrayList<>();

    @PostConstruct
    private void readShuttleHourseFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("shuttlehours.txt")))) {
            String hour = null;
            while ((hour = reader.readLine()) != null) {
                shuttleHours.add(hour);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String run() {
        return String.format("Shuttle Service is running: " + shuttleHours);
    }

    public void initService() {
        System.out.println("Shuttle Service is initialized.");
    }

    public void destroyService() {
        System.out.println("Shuttle Service is destroyed.");
    }
}
