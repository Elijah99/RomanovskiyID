package com.bsuir.orm;

import com.bsuir.entity.Company;
import com.bsuir.entity.User;
import com.bsuir.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CompaniesCrudController {
   /* @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/companies-crud", method = RequestMethod.GET)
    public ModelAndView showPage() {
        return new ModelAndView("/security/companies-crud");
    }

    @RequestMapping(value = "/get-companies", method = RequestMethod.GET)
    public ModelAndView getCompanies() {
        User user = usersService.getCurrentUser();
        List<Company> list = companyRepository.findByClient(usersService.findClientById(user.getId()));
        return new ModelAndView("security/companies-crud", "list", list);
    }

    @RequestMapping(value = "/delete-company", method = RequestMethod.GET)
    public ModelAndView deleteCompany(@RequestParam("idDelete") long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/security/companies-crud");
        if (companyRepository.findOne(id) != null)
            companyRepository.delete(id);
        return modelAndView;
    }

    @RequestMapping(value = "/add-company", method = RequestMethod.POST)
    public ModelAndView addCompany(@Valid @ModelAttribute("addCompany") Company company) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/security/companies-crud");
        User user = usersService.getCurrentUser();
        company.setClient(usersService.findClientById(user.getId()));
        companyRepository.save(company);
        return modelAndView;
    }

    @RequestMapping(value = "/update-company", method = RequestMethod.GET)
    public ModelAndView updateCompany(@Valid @ModelAttribute("updateCompany") Company updatedCompany) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/security/companies-crud");
        Company oldCompany = companyRepository.findOne(updatedCompany.getId());

        if (oldCompany != null) {
            oldCompany.setAddress(updatedCompany.getAddress());
            oldCompany.setName(updatedCompany.getName());
            oldCompany.setUnp(updatedCompany.getUnp());
            oldCompany.setTypeOfProperty(updatedCompany.getTypeOfProperty());
            companyRepository.save(oldCompany);
        }
        return modelAndView;
    }
*/}
