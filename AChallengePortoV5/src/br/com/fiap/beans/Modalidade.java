package br.com.fiap.beans;

public class Modalidade {
	// var
	private String mountainBike;
	private String urbana;
	private String performance;
	// vazio
	public Modalidade() {
		super();
	}
	// cheio
	public Modalidade(String mountainBike, String urbana, String performance) {
		super();
		this.mountainBike = mountainBike;
		this.urbana = urbana;
		this.performance = performance;
	}
	// setters and getters
	public String getMountainBike() {
		return mountainBike;
	}
	public void setMountainBike(String mountainBike) {
		this.mountainBike = mountainBike;
	}
	public String getUrbana() {
		return urbana;
	}
	public void setUrbana(String urbana) {
		this.urbana = urbana;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}

}
