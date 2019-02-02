package com.muratalioglu.springpractice;

import org.springframework.stereotype.Component;

@Component
public class MixerService implements SparePartService {

    @Override
    public String produceSparePart() {
        return "Mixer Service is producing.";
    }
}
