package com.firstSpringBoot.MyfirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Myclass {

    @GetMapping("nandan")
    public String sayHello(){
        return "hello nandan welcome to spring boot";
    }

}
