package com.bip.api.security.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import com.bip.api.security.enums.PerfilEnum;

@Entity
@Table(name = "user")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 306411570471828345L;

	private Long id;
	private String email;
	private String password;
	private PerfilEnum profile;
	private Date dataCriacao;
	private Date dataAtualizacao;

	public Usuario() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "profile", nullable = false)
	public PerfilEnum getProfile() {
		return profile;
	}

	public void setProfile(PerfilEnum profile) {
		this.profile = profile;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "Usuario [id=" + id + ", email=" + email + ", password=" + password + ", profile=" + profile + ", dataCriacao="
				+ dataCriacao + ", dataAtualizacao=" + dataAtualizacao + "]";
	}
	
	
}
