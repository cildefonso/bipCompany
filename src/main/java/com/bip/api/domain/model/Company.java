package com.bip.api.domain.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company implements Serializable {
	
	public static final long serialVersionUID = 4862991749577621407L;
	
	public static Date dataCriacao;
	public static  Date dataAtualizacao;
	public static  Long userId;
	public static  String fullnamecompany;
	public static  String email;
	public static  String cnpj;
	public static  Integer numberAddress;
	public static  String complementAddress;
	public static  String main;
	public static  String secondary;
	public static  String idaddress;
		 	
	
	public Company() {
	}


	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "fullnamecompany", nullable = false)
	public String getFullnamecompany() {
		return fullnamecompany;
	}

	public void setFullnamecompany(String fullnamecompany) {
		this.fullnamecompany = fullnamecompany;
	}
	
	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="cnpj", nullable = false)
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Column(name="numberaddress", nullable = false)
	public Integer getNumberAddress() {
		return numberAddress;
	}

	public void setNumberAddress(Integer numberAddress) {
		this.numberAddress = numberAddress;
	}

	@Column(name="complementaddress", nullable = false)
	public String getComplementAddress() {
		return complementAddress;
	}

	public void setComplementAddress(String complementAddress) {
		this.complementAddress = complementAddress;
	}
	
	@Column(name="main", nullable = false)
	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	@Column(name="secondary", nullable = false)
	public String getSecondary() {
		return secondary;
	}

	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}

	@Column(name="idaddress", nullable = false)
	public String getIdaddress() {
		return idaddress;
	}

	public void setIdaddress(String idaddress) {
		this.idaddress = idaddress;
	}

	@PreUpdate
    public void preUpdate() {
        dataAtualizacao = new Date();
    }
	
	@PrePersist
    public void prePersist() {
        final Date atual = new Date();
        dataCriacao = atual;
        dataAtualizacao = atual;
    }


	@Override
	public String toString() {
		return "Company [dataCriacao=" + dataCriacao + ", dataAtualizacao=" + dataAtualizacao + ", userId=" + userId
				+ ", fullnamecompany=" + fullnamecompany + ", email=" + email + ", cnpj=" + cnpj + ", numberAddress="
				+ numberAddress + ", complementAddress=" + complementAddress + ", main=" + main + ", secundary="
				+ secondary + ", idaddress=" + idaddress + "]";
	}
	

}
