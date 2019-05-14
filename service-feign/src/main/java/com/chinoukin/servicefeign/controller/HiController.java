package com.chinoukin.servicefeign.controller;

import com.chinoukin.servicefeign.entity.User;
import com.chinoukin.servicefeign.service.SchedualServiceHi;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Autowired
    Environment environment;

    @RequestMapping(value="/showEnv",method = RequestMethod.GET)
    public Map<String, String> showEnv(){
        String EUREKASERVER_PORT_80_TCP = environment.getProperty("EUREKASERVER_PORT_80_TCP");
        String HOSTNAME = environment.getProperty("HOSTNAME");
        String JAVA_HOME = environment.getProperty("JAVA_HOME");
        // from configmap
        String BOOT_JAVA_OPTS = environment.getProperty("BOOT_JAVA_OPTS");

        System.out.println("EUREKASERVER_PORT_80_TCP:" + EUREKASERVER_PORT_80_TCP);
        System.out.println("HOSTNAME:" + HOSTNAME);
        System.out.println("JAVA_HOME:" + JAVA_HOME);

        Map<String, String> map = new HashMap<>();
        map.put("EUREKASERVER_PORT_80_TCP", EUREKASERVER_PORT_80_TCP);
        map.put("HOSTNAME", HOSTNAME);
        map.put("JAVA_HOME", JAVA_HOME);
        if (StringUtils.isNotEmpty(BOOT_JAVA_OPTS)) {
            map.put("BOOT_JAVA_OPTS", BOOT_JAVA_OPTS);
        }
        return map;
    }

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
