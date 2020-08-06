package com.bip.api.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bip.api.domain.exception.NegocioException;
import com.bip.api.domain.model.Company;
import com.bip.api.domain.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public Company salvar(Company company) {
		Company companyExistente = companyRepository.findByEmail(company.getEmail());
		if (companyExistente != null && !companyExistente.equals(company)) {
			throw new NegocioException("Já existe uma empresa cadastrada com este e-mail. ");
		}
	
		return companyRepository.save(company);
	}
	
   public void deletar(Long idCompany) {
 	companyRepository.delete(idCompany);
   }
}
