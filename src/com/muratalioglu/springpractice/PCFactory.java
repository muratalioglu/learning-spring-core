package com.muratalioglu.springpractice;

public class PCFactory implements Factory {

    // Dependency.
    private SparePartService sparePartService;

    // Setter injection.
    public void setSparePartService(SparePartService sparePartService) {
        this.sparePartService = sparePartService;
    }

    @Override
    public String produce() {
        return sparePartService.produceSparePart();
    }
}
