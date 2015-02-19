
public class testaClasseMadeira {

	public static void main(String[] args) {
		
		Cadeira cadeira = new Cadeira();
		
		cadeira.setCor("preta");
		cadeira.setPeso(23);
		cadeira.tipo = "Eucalipto";
		
		System.out.println(" a cor da cadeira é " + cadeira.getCor() + 
				" e seu peso é " + cadeira.getPeso() + " kg e seu tipo é " + cadeira.tipo);
	}

}