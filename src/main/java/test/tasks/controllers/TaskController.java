package test.tasks.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/")
public class TaskController {
    @GetMapping
    String hello() {
        return "<h2>Hello, World!</h2>";
    }

    @GetMapping("admin")
    String pageAdmin(Principal principal) {
        return "<h2>This is security page " + principal.getName() +"!</h2>";
    }
}
