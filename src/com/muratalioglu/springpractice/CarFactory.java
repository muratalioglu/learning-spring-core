package com.muratalioglu.springpractice;

public class CarFactory implements Factory {

    // Dependency.
    private SparePartService sparePartService;

    // Constructor injection.
    public CarFactory(SparePartService sparePartService) {
        this.sparePartService = sparePartService;
    }

    @Override
    public String produce() {
        return sparePartService.produceSparePart();
    }
}
