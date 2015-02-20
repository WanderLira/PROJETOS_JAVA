package Documentos;

//criando a classe Fatura

public class Fatura {

	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
//criando os m�todos getters e setters
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	//configurando o �tem para n�o havar valores negativos
	
	public int getQuantidade() {
		if (quantidade < 0)
			quantidade = 0;
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	//configurando o pre�o para n�o haver valores negativos
	
	public double getPreco() {
		if (preco < 0)
			preco = 0.0;
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	//criando o m�todo getValorFatura
	
	public double getValorFatura() {
		return this.preco * this.quantidade;
	}

}
