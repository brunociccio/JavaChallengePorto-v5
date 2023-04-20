package br.com.fiap.beans;

public class Endereço {
	// var
	private String cep;
	private String logradouro;
	private int número;
	private String bairro;
	private String cidade;
	private String estado;
	// vazio
	public Endereço() {
		super();
	}
	// cheio
	public Endereço(String cep, String logradouro, int número, String bairro, String cidade, String estado) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.número = número;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	// setters and getters 
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNúmero() {
		return número;
	}
	public void setNúmero(int número) {
		this.número = número;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
