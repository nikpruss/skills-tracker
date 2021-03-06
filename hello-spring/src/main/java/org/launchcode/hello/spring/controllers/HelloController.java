package org.launchcode.hello.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }

    @RequestMapping(value="hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String coder, @RequestParam String language) {
        if(language == "english") {
            return "Hello, " + coder + "!";
        }
        return "Bonjour, " + coder + "!";
    }

    // Responds to get requests at /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping(value = "lang", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloForm() {
        return "form";
    }
}

