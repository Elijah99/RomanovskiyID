package com.bsuir.orm;

import com.bsuir.entity.Role;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.Collection;

@Controller
public class ProfileController {
//    @RequestMapping(value="/profile", method = RequestMethod.GET)
//    public ModelAndView showForm() {
//        Collection<Role> authorities = (Collection<Role>)    SecurityContextHolder.getContext().getAuthentication().getAuthorities();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("/index");
//        authorities.forEach(role -> {
//            for(int i = 0; i < 10; i++) System.err.println(role.getName());
//            if(role.getName().equals("ROLE_ADMIN")) modelAndView.setViewName("/security/admin");
//            if(role.getName().equals("ROLE_CLIENT")) modelAndView.setViewName("/security/client");
//            if(role.getName().equals("ROLE_DOCTOR")) modelAndView.setViewName("/security/doctor");
//            if(role.getName().equals("ROLE_REGISTRATOR")) modelAndView.setViewName("/security/registrator");
//        });
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/getCurrentUsername", method = RequestMethod.GET)
//    @ResponseBody
//    public String getCurrentUsername(Principal principal){
//        return principal.getName();
//    }
}
