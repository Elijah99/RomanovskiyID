package com.bsuir.orm;

import com.bsuir.entity.Company;
import com.bsuir.entity.User;
import com.bsuir.repository.ClientRepository;
import com.bsuir.repository.CompanyRepository;
import com.bsuir.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FinAnalysisController {

//    @Autowired
//    CompanyRepository companyRepository;
//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    ClientRepository clientRepository;
//    @Autowired
//    UsersService usersService;
//
//    @RequestMapping(value = "/fin-analysis")
//    public ModelAndView showPageAnalysis(){
//        ModelAndView modelAndView;
//        User currentUser = usersService.getCurrentUser();
//        List<Company> list  = companyRepository.findByClient(clientRepository.findByUserInfo(currentUser));
//        if(list.isEmpty()){
//            modelAndView = new ModelAndView("/security/no-companies-page");
//        } else {
//            modelAndView = new ModelAndView("/security/fin-analysis");
//        }
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/business-activity")
//    public ModelAndView showPageBusinessActivity(){
//        ModelAndView modelAndView = new ModelAndView("/analysis/business-activity");
//        User currentUser = usersService.getCurrentUser();
//        modelAndView.getModelMap().addAttribute("companies",companyRepository.findByClient(clientRepository.findByUserInfo(currentUser)));
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/financial-stability")
//    public ModelAndView showPageFinancialStability(){
//        ModelAndView modelAndView = new ModelAndView("/analysis/financial-stability");
//        User currentUser = usersService.getCurrentUser();
//        modelAndView.getModelMap().addAttribute("companies",companyRepository.findByClient(clientRepository.findByUserInfo(currentUser)));
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/profitability")
//    public ModelAndView showPagePofitability(){
//        ModelAndView modelAndView = new ModelAndView("/analysis/profitability");
//        User currentUser = usersService.getCurrentUser();
//        modelAndView.getModelMap().addAttribute("companies",companyRepository.findByClient(clientRepository.findByUserInfo(currentUser)));
//        return modelAndView;
//    }
//    @RequestMapping(value = "/liquidity")
//    public ModelAndView showPageLiquidity(){
//        ModelAndView modelAndView = new ModelAndView("/analysis/liquidity");
//        User currentUser = usersService.getCurrentUser();
//        modelAndView.getModelMap().addAttribute("companies",companyRepository.findByClient(clientRepository.findByUserInfo(currentUser)));
//        return modelAndView;
//    }
}
