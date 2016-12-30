package ua.hypson.testing.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vasiliy Zhar
 */
@RestController
public class GreetingController {

    @GetMapping("/")
    public String foo() {
        return "Hello!";
    }

    @GetMapping("/{name}")
    public String foo(@PathVariable("name") String name) {
        return "Hello, " + name + "!";
    }
}
