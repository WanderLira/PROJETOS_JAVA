package Banco;

//criando a classe funcion�rio

class Funcionario {

	// criando os aatributos da classe funcion�rio
	String nome;
	String cpf;
	double salario;

}

// criando uma classe heran�a gerente da classe funcion�rio

class Gerente extends Funcionario {

	int senha;
	int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {

			System.out.println("Acesso Negado!");
			return false;

		}

	}
}