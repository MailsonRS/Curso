package lambadas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto produto = new Produto("Ipad", 3235.89, 0.13);
		Function<Produto, Double> valorProdutoDesconto = 
				p -> p.preco*(1-p.desconto);
				
		UnaryOperator< Double> addValorImposto = valor ->
				valor>= 2500 ? valor* 1.085:valor;
				
		UnaryOperator< Double> addValorFrete = valor ->
				valor >= 3000 ? valor + 100:valor + 50;
				
		Function<Double, String> formatValor = 
				valor -> new DecimalFormat("#,##0.00").format(valor); 
				
		UnaryOperator<String> addSimbolo = 
				valor -> "R$" + valor;
		
				String valorFinal =valorProdutoDesconto.
				andThen(addValorImposto).
				andThen(addValorFrete).
				andThen(formatValor).
				andThen(addSimbolo).
				apply(produto);
		
		
			System.out.println(valorFinal);
					
	}

}
