package Banco;

//criando a classe testa gerente

 class TestaGerente {

	public static void main(String[] args) {
		
		//referenciando o objeto gerente
		
	Gerente gerente = new Gerente();
		
	//chamando o metodo funcionario
	
	gerente.nome = "Lira";
	
	//chamando o metodo gerente
	
	gerente.senha = 12345;
	
	//System.out.println("Digite a senha");
	gerente.autentica(1234);
	
	//System.out.println(gerente.autentica(54321));
	
	}
	

}
