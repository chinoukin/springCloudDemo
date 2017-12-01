package com.chinoukin.servicefeign.service;


import com.chinoukin.servicefeign.entity.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
public class SchedualServiceHiHyStric implements SchedualServiceHi{
    @Override
    public String sayHiFromClient(String name) {
        return "sorry, "+name;
    }

    @Override
    public String sayHiFromClient2(User user) {

        return "sorry, "+ user;
    }
}
