package com.bsuir.orm;

import com.bsuir.entity.User;
import com.bsuir.dto.UniversalUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created for JavaStudy.ru on 28.02.2016.
 */
@Controller
public class UsersController {
//
//    @Autowired
//    private UsersService usersService;
//
//    @RequestMapping(value = "/adminFindAllUsers", method= RequestMethod.GET)
//    public ModelAndView ormFindAllUsers() {
//        System.out.println("ORMController ormFindAllUsers is called");
//        List<User> users = usersService.queryFindAllUsersJPA();
//        users.forEach(System.err::println);
//        return new ModelAndView("/security/users-crud", "resultObject", users);
//    }
//
//    @RequestMapping(value = "/queryFindByIdUser/{userid}", method = RequestMethod.GET)
//    public ModelAndView queryFindByIdUser(@PathVariable("userid") long userid) {
//        System.out.println("ORMController queryFindByIdUser is called");
//        User user = usersService.queryFindUserById(userid);
//        return new ModelAndView("/security/users-crud", "resultObject", user);
//    }
//
//    @RequestMapping(value = "/adminUpdateUser/iduser/{iduser}/enabled/{enabled}", method=RequestMethod.GET)
//    public ModelAndView ormUpdateUser(
//            @PathVariable(value="iduser") int iduser,
//            @PathVariable(value="enabled") boolean enabled) {
//        System.out.println("ORMController ormUpdateUser is called");
//        boolean result = usersService.updateUser(iduser, enabled);
//        return new ModelAndView("/security/users-crud", "resultObject", result);
//    }
//
//    @RequestMapping(value = "/adminDeleteUser/idUser/{iduser}", method=RequestMethod.GET)
//    public ModelAndView ormDeleteUser(@PathVariable(value="iduser") long iduser) {
//        System.out.println("ORMController jdbcDelete is called");
//        boolean result = usersService.deleteUser(iduser);
//        ModelAndView modelAndView = new ModelAndView("redirect:/users-crud.html");
//        modelAndView.addObject("resultObject",result);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/users-crud", method = RequestMethod.POST)
//    public ModelAndView ormInsertUser(
//            @Valid @ModelAttribute(value="user") UniversalUserDTO user) {
//        System.out.println("ORMController ormInsertUser is called");
//        boolean result = usersService.insertUser(user);
//        ModelAndView modelAndView = new ModelAndView("redirect:/users-crud.html");
//        modelAndView.addObject("resultObject",result);
//        return modelAndView;
//
//    }
//    @RequestMapping(value = "/users-crud", method = RequestMethod.GET)
//    public ModelAndView showPage(){
//        return new ModelAndView("/security/users-crud");
//    }
//
//   /* @GetMapping("/registration")
//    public String registration(Model model) {
//        model.addAttribute("userForm", new User());
//
//        return "registration";
//    }*/
//
//   /* @PostMapping("/registration")
//    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
//        userValidator.validate(userForm, bindingResult);
//
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
//
//        userService.save(userForm);
//
//        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());
//
//        return "redirect:/welcome";
//    }



}
