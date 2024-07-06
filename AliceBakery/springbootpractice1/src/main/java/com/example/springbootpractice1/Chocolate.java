package com.example.springbootpractice1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.flavour", havingValue = "chocolate")

public class Chocolate implements Frosting, Syrup{

    @Override
    public String getFrostingType() {
        return  "Chocolate frosting type cake";

    }

    @Override
    public String getSyrupType() {
       return "Chocolate syrup type cake";
    }
}
