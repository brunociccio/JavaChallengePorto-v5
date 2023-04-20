package br.com.fiap.beans;

public class Pagamento {
	// var
	private String boleto;
	private String cartãoCrédito;
	private String débitoAutomático;
	// vazio
	public Pagamento() {
		super();
	}
	// cheio
	public Pagamento(String boleto, String cartãoCrédito, String débitoAutomático) {
		super();
		this.boleto = boleto;
		this.cartãoCrédito = cartãoCrédito;
		this.débitoAutomático = débitoAutomático;
	}
	// setters and getters
	public String getBoleto() {
		return boleto;
	}
	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}
	public String getCartãoCrédito() {
		return cartãoCrédito;
	}
	public void setCartãoCrédito(String cartãoCrédito) {
		this.cartãoCrédito = cartãoCrédito;
	}
	public String getDébitoAutomático() {
		return débitoAutomático;
	}
	public void setDébitoAutomático(String débitoAutomático) {
		this.débitoAutomático = débitoAutomático;
	}
	
}
