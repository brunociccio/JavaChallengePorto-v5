package br.com.fiap.beans;

public class Documentos {
	// var
	private String cpf;
	private String rg;
	private String cnh;
	private String tituloEleitor;
	// vazio
	public Documentos() {
		super();
	}
	// cheio
	public Documentos(String cpf, String rg, String cnh, String tituloEleitor) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.cnh = cnh;
		this.tituloEleitor = tituloEleitor;
	}
	// setters and getters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String getTituloEleitor() {
		return tituloEleitor;
	}
	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	
}
