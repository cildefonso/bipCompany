package com.bip.api.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bip.api.domain.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	   
	    Company findByUserId(Long userId);
		List<Company> findByFullnamecompany(String fullnamecompany);
		List<Company> findByFullnamecompanyContaining(String fullnamecompany);
		Company findByEmail(String email);
}
