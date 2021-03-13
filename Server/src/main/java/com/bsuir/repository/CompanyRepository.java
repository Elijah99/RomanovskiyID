package com.bsuir.repository;

import com.bsuir.entity.Client;
import com.bsuir.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository  extends JpaRepository<Company, Long> {
    List<Company> findByClient(Client client);
}
