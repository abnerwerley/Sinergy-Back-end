package com.sinergy.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Classe tema do projeto Sinergy
 *
 * @author George
 * @vs 1.0
 * 
 */

@Entity
@Table(name = "tema")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTema;
	
	@OneToMany(mappedBy = "temaRelacionado", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({"temaRelacionado"})
	private List<Postagem> postagens = new ArrayList<>();

	@NotBlank
	@Size(min = 5, max = 100)
	private String tema;

	@NotNull
	private boolean doacao;

	@NotNull
	private boolean voluntariado;

	@NotNull
	private boolean any;

	public Long getIdTema() {
		return idTema;
	}

	public void setIdTema(Long idTema) {
		this.idTema = idTema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public boolean isDoacao() {
		return doacao;
	}

	public void setDoacao(boolean doacao) {
		this.doacao = doacao;
	}

	public boolean isVoluntariado() {
		return voluntariado;
	}

	public void setVoluntariado(boolean voluntariado) {
		this.voluntariado = voluntariado;
	}

	public boolean isAny() {
		return any;
	}

	public void setAny(boolean any) {
		this.any = any;
	}

	public void setIdTema(long idTema) {
		this.idTema = idTema;
	}

}