package com.example.springauthprincipal;

import java.security.Principal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@AuthenticationPrincipal Principal authz, @RequestParam String what) {
        if (null == authz) {
            return "Principal is null!\n";
        } else {
            return authz.getName() + ": " + what + "\n";
        }
    }

}
