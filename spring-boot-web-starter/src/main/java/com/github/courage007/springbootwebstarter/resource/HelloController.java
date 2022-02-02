package com.github.courage007.springbootwebstarter.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [Hello控制器]
 *
 * @author: courage007
 * @date: 2022/02/02 13:19
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/message")
    public String getMessage() {
        return "Hello World";
    }
}
