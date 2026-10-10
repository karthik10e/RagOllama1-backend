package com.example.projectk;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @GetMapping("/h")
    String m1()
    {
        return "hey iam charan";
    }
}
