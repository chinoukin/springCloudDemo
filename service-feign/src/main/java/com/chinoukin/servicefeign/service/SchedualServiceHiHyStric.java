package com.chinoukin.servicefeign.service;


import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHyStric implements SchedualServiceHi{
    @Override
    public String sayHiFromClient(String name) {
        return "sorry, "+name;
    }
}
