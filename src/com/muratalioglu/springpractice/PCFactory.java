package com.muratalioglu.springpractice;

public class PCFactory implements Factory {

    // Dependencies.
    private SparePartService sparePartService; // Setter injection.
    private String contactName; // Setter injection from properties file.
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

    @Override
    public String produce() {
        return sparePartService.produceSparePart();
    }
}
