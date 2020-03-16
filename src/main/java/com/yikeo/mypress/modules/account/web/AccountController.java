package com.yikeo.mypress.modules.account.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("account")
public class AccountController {

    @RequestMapping("login")
    public String index() {
        return "account/login";
    }

    @RequestMapping("login-error")
    public String loginError() {
        return "account/login-error";
    }
}
