package valorFatura;

import Documentos.Fatura;

public class ValoraFatura {

	public static void main(String[] args) {

		// criando o objeto minhaFatura do tipo Fatura

		Fatura minhaFatura = new Fatura();

		// preenchendo os atributoss

		minhaFatura.setDescricao("FATURA DA COMPRA");
		minhaFatura.setNumero("000999");
		minhaFatura.setPreco(200);
		minhaFatura.setQuantidade(300);

		// emprimindo os resultados

		System.out.println("|-------------***-------------| INFOSUPORT |-------------***-------------| ");
		System.out.println("  " + minhaFatura.getDescricao() + "   ");
		System.out.println("N�mero da Fatura: " + minhaFatura.getNumero());
		System.out.printf("Pre�o do �tem: R$ %.2f\n", minhaFatura.getPreco());
		System.out.println("Quantidade(s) de �ten(s) = "+ minhaFatura.getQuantidade() + " unidade(s)");
		System.out.printf("Valor Total da Fatura: R$ %.2f\n",minhaFatura.getValorFatura());

	}

}
