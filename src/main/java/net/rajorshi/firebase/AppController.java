package net.rajorshi.firebase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AuthService authService;

    @GetMapping(path = "/test")
    public String test(Principal principal) throws FirebaseAuthException {
        var uid = principal.getName();
        var email = authService.getUserFromUid(uid).getEmail();
        log.info(email);
        return email;
    }
}