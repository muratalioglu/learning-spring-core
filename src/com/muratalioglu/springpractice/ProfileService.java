package com.muratalioglu.springpractice;

public class ProfileService implements SparePartService {
    @Override
    public String produceSparePart() {
        return "Profile Service is producing.";
    }
}
