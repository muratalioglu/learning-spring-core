package com.muratalioglu.springpractice;

public class CarFactory implements Factory {

    private SparePartService sparePartService;

    public CarFactory(SparePartService sparePartService) {
        this.sparePartService = sparePartService;
    }

    @Override
    public String produce() {
        return sparePartService.produceSparePart();
    }
}
