package com.bip.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bip.api.domain.model.Company;
import com.bip.api.domain.repository.CompanyRepository;
import com.bip.api.domain.service.CompanyService;

@RestController
@RequestMapping("/api/company")
public class CompanyController {
	
	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private CompanyRepository companyRepository;
	

	@GetMapping(value = "/v1/{idCompany}", produces=MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasAnyRole('ADMIN','USUARIO')")
	public ResponseEntity<Company> buscarV1(@PathVariable ("idCompany") Long idCompany) {
		Company company = companyRepository.findByUserId(idCompany);
//		Class<?> classe = company.getClass();
//		JSONObject json = new JSONObject();
//		for(Field atributo : classe.getDeclaredFields()) {
//			json.put(atributo.getName()+"", atributo.get(company));
//            System.out.println(atributo.getName() + ": " + atributo.get(company));
//        }
	   System.out.println("Número de página "+ qtdPorPagina);
	   if (!company.toString().equals(company)) {
		   return ResponseEntity.ok(company);
		}
	    
	    return ResponseEntity.ok(company);	
	}
	
	@GetMapping(value = "/v2/{idCompany}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Company> buscarV2(@PathVariable ("idCompany") Long idCompany) {
		Company company = companyRepository.findByUserId(idCompany);
		if (!company.toString().equals(company)) {
		   return ResponseEntity.ok(company);
		}
	    
	    return ResponseEntity.ok(company);	
	}
	
	@GetMapping(value = "/{idCompany}", headers = "X-API-Version=v3", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Company> buscarV3(@PathVariable ("idCompany") Long idCompany) {
		Company company = companyRepository.findByUserId(idCompany);
		if (!company.toString().equals(company)) {
		   return ResponseEntity.ok(company);
		}
	    
	    return ResponseEntity.ok(company);	
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Company adicionar(@Valid @RequestBody Company company) {
		return companyService.salvar(company); //clienteRepository.save(cliente);
	}

	@PutMapping(value = "/{idCompany}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Company> atualizar(@Valid @PathVariable Long idCompany, @RequestBody Company company){
		
		if (!companyRepository.existsById(idCompany)) {
			return ResponseEntity.notFound().build();
			
		}
		company.setUserId(idCompany);
		company = companyService.salvar(company);
		
		
		return ResponseEntity.ok(company);
	}
	
	@DeleteMapping(value = "/{idCompany}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deletar(@PathVariable Long idCompany){
		
		if (!companyRepository.existsById(idCompany)) {
			return ResponseEntity.notFound().build();
		}
		companyService.deletar(idCompany);
	
		return ResponseEntity.noContent().build();
	}
	

}
