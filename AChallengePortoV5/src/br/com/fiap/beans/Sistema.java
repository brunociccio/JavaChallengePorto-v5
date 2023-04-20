package br.com.fiap.beans;

public class Sistema {
	// variáveis
	private Cliente cliente;
	private Endereço endereço;
	private Modalidade modalidade;
	private Bicicleta bicicleta;
	private Seguro seguro;
	private Pagamento pagamento;
	// const vazio
	public Sistema() {
		super();
	}
	// const cheio
	public Sistema(Cliente cliente, Endereço endereço, Modalidade modalidade, Bicicleta bicicleta, Seguro seguro,
			Pagamento pagamento) {
		super();
		this.cliente = cliente;
		this.endereço = endereço;
		this.modalidade = modalidade;
		this.bicicleta = bicicleta;
		this.seguro = seguro;
		this.pagamento = pagamento;
	}
	// setters and getters
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Endereço getEndereço() {
		return endereço;
	}
	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	public Bicicleta getBicicleta() {
		return bicicleta;
	}
	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}
	public Seguro getSeguro() {
		return seguro;
	}
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
}
