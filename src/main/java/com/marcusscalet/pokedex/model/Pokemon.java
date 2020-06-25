package com.marcusscalet.pokedex.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Pokemon {

	@Id
	private String id;
	private String nome;
	private String categoria;
	private String habilidade;
	private String peso;

	public Pokemon() {
		super();
	}

	public Pokemon(String id, String nome, String categoria, String habilidade, String peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.habilidade = habilidade;
		this.peso = peso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", habilidade=" + habilidade
				+ ", peso=" + peso + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, habilidade, id, nome, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pokemon))
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(habilidade, other.habilidade)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(peso, other.peso);
	}

}
