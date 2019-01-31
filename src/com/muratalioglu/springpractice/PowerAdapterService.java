package com.muratalioglu.springpractice;

public class PowerAdapterService implements SparePartService {
    @Override
    public String produceSparePart() {
        return "Power Adapter service is producing.";
    }
}
