public class Madeira {

	//atibuto da classe madeira
	String cor;
	String tipo;

	//metodos da classe madeira
	String getCor() {
		return cor;
	}

	public void setCor(String nova_cor) {
		cor = nova_cor;
	}
	
}//fim da declara��o da superclasse

/*___________declara��o da subclasse*___________*/

class Cadeira extends Madeira {
	
	//atributos adicionais � superclasse
	
	private int peso;
	
	//m�todos adicionais a superclasse
	
	public void escreve_tela() {
		
		System.out.println(this.cor);
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	

}//fim da declara��o da subclasse
