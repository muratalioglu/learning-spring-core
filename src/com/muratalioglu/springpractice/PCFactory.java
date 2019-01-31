package com.muratalioglu.springpractice;

public class PCFactory implements Factory {

    private SparePartService sparePartService;

    public PCFactory(SparePartService sparePartService) {
        this.sparePartService = sparePartService;
    }

    @Override
    public String produce() {
        return sparePartService.produceSparePart();
    }
}
