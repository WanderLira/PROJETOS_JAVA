package Banco;

public class Conta {

	protected double saldo;

	public void deposita(double valor) {

		this.saldo += this.saldo;
	}

	public void saca(double valor) {

		this.saldo -= this.saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	void atualiza(double taxa) {

		this.saldo += this.saldo * taxa;
	}

	
	}

	

