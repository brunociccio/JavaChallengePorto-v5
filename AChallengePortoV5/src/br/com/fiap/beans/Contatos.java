package br.com.fiap.beans;

public class Contatos {
	// var
	private String telefoneFixo;
	private String telefoneCelular;
	private String contatoPrincipal;
	private String email;
	// vazio
	public Contatos() {
		super();
	}
	// cheio
	public Contatos(String telefoneFixo, String telefoneCelular, String contatoPrincipal, String email) {
		super();
		this.telefoneFixo = telefoneFixo;
		this.telefoneCelular = telefoneCelular;
		this.contatoPrincipal = contatoPrincipal;
		this.email = email;
	}
	// setters and getters
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getContatoPrincipal() {
		return contatoPrincipal;
	}
	public void setContatoPrincipal(String contatoPrincipal) {
		this.contatoPrincipal = contatoPrincipal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
