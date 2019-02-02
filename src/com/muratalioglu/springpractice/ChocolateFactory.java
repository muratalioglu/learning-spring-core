package com.muratalioglu.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ChocolateFactory implements Factory {

    @Autowired
    @Qualifier("mixerService")
    private SparePartService sparePartService;

    @Override
    public String produce() {
        return sparePartService.produceSparePart();
    }
}
