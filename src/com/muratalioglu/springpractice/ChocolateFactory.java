package com.muratalioglu.springpractice;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFactory implements Factory {

    @Override
    public String produce() {
        return "Chocolate Factory is producing.";
    }
}
