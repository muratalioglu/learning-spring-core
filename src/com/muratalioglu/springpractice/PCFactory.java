package com.muratalioglu.springpractice;

import org.springframework.beans.factory.annotation.Value;

public class PCFactory implements Factory {

    // Dependencies.
    private SparePartService sparePartService; // Setter injection.
    private ShuttleService shuttleService; // Setter injection.

    @Value("representative.name")
    private String contactName; // Setter injection from properties file.

    @Value("representative.email")
    private String contactEmail; // Setter injection from properties file.

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setSparePartService(SparePartService sparePartService) {
        this.sparePartService = sparePartService;
    }

    public void setShuttleService(ShuttleService shuttleService) {
        this.shuttleService = shuttleService;
    }

    @Override
    public String produce() {
        return sparePartService.produceSparePart();
    }
}
