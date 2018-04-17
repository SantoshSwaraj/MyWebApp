/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.sanotsh.mywebapp.controller;

import co.sanotsh.mywebapp.bean.UserBean;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Santosh Kushwaha
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public ModelAndView atFirstScreen() {
        return new ModelAndView("login", "user", new UserBean());
    }

    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    public String checkLogin(Model model, @Valid UserBean user, BindingResult result) {
        if (result.hasErrors()) {
            return "login";
        } else {
            if (user.getUSER_NAME().equals("Santosh") && user.getPASSWORD().equals("12345")) {
                model.addAttribute("msg", "Welcome");
                return "dashboard";
                
            } else{
                model.addAttribute("msg", "Invalid Username or password!!");
            }
        }
        return "login"; 
    }

}
