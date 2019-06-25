package com.demo.test.web;

import com.demo.test.annotation.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hkp
 * @create 2019-06-19 10:51
 */
@Slf4j
@RestController
public class LogController {

    @Log("123")
    @GetMapping("/")
    public String test(){
        log.info("123");
        return "123";
    }
}
