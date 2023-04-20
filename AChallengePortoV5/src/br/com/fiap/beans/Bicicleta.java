package br.com.fiap.beans;

public class Bicicleta {
	// var
	private String marca;
	private String modelo;
	private Float valor;
	private int ano;
	private String cor;
	private String nf;
	// vazio
	public Bicicleta() {
		super();
	}
	// cheio
	public Bicicleta(String marca, String modelo, Float valor, int ano, String cor, String nf) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.ano = ano;
		this.cor = cor;
		this.nf = nf;
	}
	// setters and getters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNf() {
		return nf;
	}
	public void setNf(String nf) {
		this.nf = nf;
	}
}

