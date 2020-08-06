package com.bip.api.dtos;

import java.util.Date;

public class CompanyDto {

	 private Long userid;
	 private String fullnamecompany;
	 private String email;
	 private String cnpj;
	 private Integer numberAddress;
	 private String complementAddress;
	 private String main;
	 private String secondary;
	 private String idaddress;
	 private Date datacriacao;
	 private Date dataatualizacao;
	public Long getUserId() {
		return userid;
	}
	public void setUserId(Long userId) {
		this.userid = userId;
	}
	public String getFullnamecompany() {
		return fullnamecompany;
	}
	public void setFullnamecompany(String fullnamecompany) {
		this.fullnamecompany = fullnamecompany;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Integer getNumberAddress() {
		return numberAddress;
	}
	public void setNumberAddress(Integer numberAddress) {
		this.numberAddress = numberAddress;
	}
	public String getComplementAddress() {
		return complementAddress;
	}
	public void setComplementAddress(String complementAddress) {
		this.complementAddress = complementAddress;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getSecondary() {
		return secondary;
	}
	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}
	public String getIdaddress() {
		return idaddress;
	}
	public void setIdaddress(String idaddress) {
		this.idaddress = idaddress;
	}
	public Date getDataCriacao() {
		return datacriacao;
	}
	public void setDataCriacao(Date datacriacao) {
		this.datacriacao = datacriacao;
	}
	public Date getDataAtualizacao() {
		return dataatualizacao;
	}
	public void setDataAtualizacao(Date dataatualizacao) {
		this.dataatualizacao = dataatualizacao;
	}
	@Override
	public String toString() {
		return "CompanyDto [userId=" + userid + ", fullnamecompany=" + fullnamecompany + ", email=" + email + ", cnpj="
				+ cnpj + ", numberAddress=" + numberAddress + ", complementAddress=" + complementAddress + ", main="
				+ main + ", secondary=" + secondary + ", idaddress=" + idaddress + ", datacriacao=" + datacriacao
				+ ", dataatualizacao=" + dataatualizacao + "]";
	}
	
	 
	 
	
}
