package com.bip.api.domain.entities;

import java.io.Serializable;
import java.util.Date;

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
	
	private static final long serialVersionUID = 4862991749577621407L;
	
	private Date dataCriacao;
	private Date dataAtualizacao;
	
	 
	 private Long userId;
	 private String fullnamecompany;
	 private String email;
	 private String cnpj;
	 private Integer numberAddress;
	 private String complementAddress;
	 private String main;
	 private String secundary;
	 private String idaddress;
	  	
	
	public Company() {
	}

	//A anotação abaixo é refente ao mapeamento entre as empresas
	//e os clientes.
	//@OneToMany(mappedBy = "company", fetch= FetchType.LAZY, cascade = Cascade.ALL)
	//List<Client>
	//No cliente deverá ser gravado o enum no caso da matriz ou filial
	//@Enumerated(EnumType.STRING)
	//@Column(name="typeName", nullable = false)
	//Mapeamento dos clientes para empresa
	//@ManyToOne(fetch = FetchType.EAGER)
	//Company company
	//Mapeamento de cliente para funcionários
	//OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@Temporal()	
	
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
	public String getSecundary() {
		return secundary;
	}

	public void setSecundary(String secundary) {
		this.secundary = secundary;
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
				+ secundary + ", idaddress=" + idaddress + "]";
	}

	

}
