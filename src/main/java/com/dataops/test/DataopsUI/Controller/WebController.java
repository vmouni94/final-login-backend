package com.dataops.test.DataopsUI.Controller;

import com.dataops.test.DataopsUI.Model.UserInfo;
import com.dataops.test.DataopsUI.Service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserInfo LoginVerification(@RequestBody UserInfo user) {
        return UserService.loginValidation(user);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String userRegistration(@RequestBody UserInfo user) {
        return UserService.registerValidation(user);

    }

}
