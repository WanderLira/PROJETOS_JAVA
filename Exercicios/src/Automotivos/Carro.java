package Automotivos;

public class Carro {

	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void Liga() {
		if (this.velocidadeAtual == 0){
			System.out.println("Carro desligado!!");
		}
		else {
		System.out.println("Carro ligado");
		}
	}

	public void Acelera(double variacaoDeVelocidade) {

		double velocidadeNova = this.velocidadeAtual + variacaoDeVelocidade;
		this.velocidadeAtual = velocidadeNova;

		if (this.velocidadeAtual > this.velocidadeMaxima) {

			System.out.println(" !!! Ultrapassou a velocidade m�xima !!! ");

		} else {
			System.out
					.println("Sua velocidade est� de acordo com os par�metros permitidos");

		}

	}
}
