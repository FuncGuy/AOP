package com.example.AOP.AOP.business;

import com.example.AOP.AOP.data.Dao2;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething(){
        return dao2.retrieveSomething();
    }


}
