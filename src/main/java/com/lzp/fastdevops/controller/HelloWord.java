package com.lzp.fastdevops.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWord {

    private  final Logger log = LoggerFactory.getLogger(HelloWord.class);

    @GetMapping(value = "/helloWord")
    public String sayHellow(){
        log.info("helloWord");
        log.debug("helloWord");
        log.error("error");
        return  "helloWord";
    }


}
