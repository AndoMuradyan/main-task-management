package am.itspace.taskmanagement.controller;

import am.itspace.taskmanagement.entity.User;
import am.itspace.taskmanagement.security.CurrentUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class MyControllerAdvice {


    //    if we put @ModelAttribute annotation from thymeleaf we can call currentUser ${ currentUser
    @ModelAttribute(name = "currentUser")
    public User currentUser(@AuthenticationPrincipal CurrentUser currentUser) {
        if (currentUser != null) {
            return currentUser.getUser();
        }
        return null;
    }


}
