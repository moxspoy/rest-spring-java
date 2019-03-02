package hello.controller;

import hello.model.Jodoh;
import hello.model.Login;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class AuthController {

    @RequestMapping("/login")
    public Login login(@RequestParam(value = "fullname") String fullName,
                       @RequestParam(value = "password") String password)
    {
        final String UNAUTH = "unauthorized";

        Map<String, String> userData = new HashMap<>();
        userData.put("moxspoy", "pswrd");
        userData.put("admin", "admin");

        Login mLogin = new Login(fullName, password);

        if(userData.containsKey(fullName) && userData.containsValue(password)) {
            mLogin.setHasAccess(true);
        } else {
            mLogin.setFullName(UNAUTH);
            mLogin.setPassword(UNAUTH);
        }
        return mLogin;
    }
}
