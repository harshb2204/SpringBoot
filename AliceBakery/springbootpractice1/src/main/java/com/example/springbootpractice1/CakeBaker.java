package com.example.springbootpractice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.IconUIResource;

@Service
public class CakeBaker {

    @Autowired
    private Frosting f1;

    @Autowired
    private Syrup s1;





    public String bakecake(){
        return "Baking a cake"+ f1.getFrostingType() + s1.getSyrupType();
    }
}
