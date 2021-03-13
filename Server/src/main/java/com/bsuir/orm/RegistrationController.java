package com.bsuir.orm;

import com.bsuir.entity.Client;
import com.bsuir.repository.ClientRepository;
import com.bsuir.service.UserDetailsServiceImpl;
import com.bsuir.dto.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

//TODO: registration Validation
@Controller
public class RegistrationController {
//    @Autowired
//    private ClientRepository clientRepository;
//    @Autowired
//    private UserDetailsServiceImpl usersService;
//    @Autowired
//    protected AuthenticationManager authenticationManager;
//
//    @RequestMapping(value = "/registration")
//    public ModelAndView showForm()
//    {
//        return new ModelAndView("/form/registration");
//    }
//
//    @RequestMapping(value = "/registration"
//            , method= RequestMethod.POST)
//    public ModelAndView registerClient(
//            @Valid @ModelAttribute("client") ClientDTO clientDTO,
//            Model model, HttpServletRequest request, HttpServletResponse response){
//        Client client = clientDTO.toEntity();
//        clientRepository.save(client);
//
//        usersService.loadUserByUsername(client.getUserInfo().getUsername());
//
//        String username = clientDTO.getUsername();
//        String password = clientDTO.getPassword();
//        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
//
//        // generate session if one doesn't exist
//        request.getSession();
//
//        token.setDetails(new WebAuthenticationDetails(request));
//        Authentication authenticatedUser = authenticationManager.authenticate(token);
//
//        SecurityContextHolder.getContext().setAuthentication(authenticatedUser);
//
//        ModelAndView modelAndView = new ModelAndView("redirect:/client.html");
//        return modelAndView;
// }
}
