package com.chinoukin.servicefeign.controller;

import com.chinoukin.servicefeign.entity.User;
import com.chinoukin.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClient(name);
    }

    @RequestMapping(value = "/hi2",method = RequestMethod.GET)
    public String sayHi2(){
        User user =new User("chinoukin",9);
        return schedualServiceHi.sayHiFromClient2(user);
    }
}
