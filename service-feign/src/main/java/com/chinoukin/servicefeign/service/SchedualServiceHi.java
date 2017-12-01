package com.chinoukin.servicefeign.service;

import com.chinoukin.servicefeign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi",fallback = SchedualServiceHiHyStric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam("name") String name);

    @RequestMapping(value = "/hi2",method = RequestMethod.POST)
    String sayHiFromClient2(@RequestBody User user);
}
