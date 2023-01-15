package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class WelcomeController {
   /* private AuthenticationService authenticationService;


    public WelcomeController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }*/

    //private Logger logger = LoggerFactory.getLogger(getClass());
    //Model
    /*@RequestMapping("login")
    public String goToLoginPage(@RequestParam String name, ModelMap model) {

        model.put("name", name);
        logger.debug("Request param is {}", name);
        logger.info("I want this printed at info level");
        logger.warn("I want this printed at warn level");
        return "login";
    }*/

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToWelcomePage(ModelMap model) {
        model.put("name", getLoggedInUsername());
        return "welcome";
    }

private String getLoggedInUsername(){
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
     return authentication.getName();
}

    /*@RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials! Please try again.");
        return "login";
    }*/

}
