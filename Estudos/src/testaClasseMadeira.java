
public class testaClasseMadeira {

	public static void main(String[] args) {
		
		Cadeira cadeira = new Cadeira();
		
		cadeira.setCor("preta");
		cadeira.setPeso(23);
		cadeira.tipo = "Eucalipto";
		
		System.out.println(" a cor da cadeira � " + cadeira.getCor() + 
				" e seu peso � " + cadeira.getPeso() + " kg e seu tipo � " + cadeira.tipo);
	}

}