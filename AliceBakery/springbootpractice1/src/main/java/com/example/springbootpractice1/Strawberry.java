package com.example.springbootpractice1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.flavour", havingValue = "strawberry")
public class Strawberry implements Frosting, Syrup{
    @Override
    public String getFrostingType() {
        return  "strawberry frosting type cake";

    }

    @Override
    public String getSyrupType() {
        return "strawberry syrup type cake";
    }
}
