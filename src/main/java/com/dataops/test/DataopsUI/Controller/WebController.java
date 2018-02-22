package com.dataops.test.DataopsUI.Controller;

import com.dataops.test.DataopsUI.Model.UserInfo;
import com.dataops.test.DataopsUI.Repo.UserRepo;
import com.dataops.test.DataopsUI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @Autowired
    private UserRepo repo;

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserInfo LoginVerification(@RequestBody UserInfo user) {
        //System.out.println("Hey There !");
        return userService.loginValidation(user);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public boolean userRegistration(@RequestBody UserInfo user) {
        //System.out.println("Hey There !");
        //System.out.println(user);
        return userService.registerValidation(user);

    }

}
