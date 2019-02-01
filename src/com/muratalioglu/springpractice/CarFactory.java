package com.muratalioglu.springpractice;

public class CarFactory implements Factory {

    // Dependencies.
    private SparePartService sparePartService;
    private ShuttleService shuttleService;

    // Constructor injection.
    public CarFactory(SparePartService sparePartService, ShuttleService shuttleService) {
        this.sparePartService = sparePartService;
        this.shuttleService = shuttleService;
    }

    @Override
    public String produce() {
        return sparePartService.produceSparePart();
    }

    public ShuttleService getShuttleService() {
        return shuttleService;
    }
}
