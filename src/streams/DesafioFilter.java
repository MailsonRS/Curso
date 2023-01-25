package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		Predicate<Produto> descontoTrinta = p -> p.getDesconto() >= 0.3;
		Predicate<Produto> freteGratis = p -> p.isFreteGratis();
		Function<Produto, String> mensagem = p -> "O produto "+ p.getNome()+" está com super desconto e frete grátis";
		
		Produto p1 = new Produto("Notebbok",5000 ,0.3, true);
		Produto p2 = new Produto("Caneta",20, 0.35, true);
		Produto p3 = new Produto("Computador",3000, 0.25, true);
		Produto p4 = new Produto("Cama box",2000, 0.4, false);
		Produto p5 = new Produto("Muchila",300, 0.1, false);
		Produto p6 = new Produto("Mesa",2000, 0.4, true);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		produtos.
			stream().
			filter(descontoTrinta).
			filter(freteGratis).
			map(mensagem).
			forEach(System.out::println);
		
	}

}
