package com.bsuir.controller;

import com.bsuir.entity.Company;
import com.bsuir.repository.CompanyRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyRepository repository;

    @GetMapping("/companies")
    @CrossOrigin(origins = "http://localhost:8084/")
    String all() {
        List<Company> companies = repository.findAll();
        String json = new Gson().toJson(companies);
        return json;
    }

}
