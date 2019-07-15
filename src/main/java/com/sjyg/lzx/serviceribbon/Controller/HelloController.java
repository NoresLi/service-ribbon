package com.sjyg.lzx.serviceribbon.Controller;

import com.sjyg.lzx.serviceribbon.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzx
 * @create 2019-07-10
 */

@RestController
public class HelloController {

    @Autowired
    HelloService service;

    @RequestMapping(value = "/hi")
    public String getHi(@RequestParam String name){
        return service.hiService(name);
    }

}
