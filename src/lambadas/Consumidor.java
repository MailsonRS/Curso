package lambadas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = prod -> System.out.println(prod.nome +"!!!");
		Produto p1 = new Produto("Caneta", 15, 0.05);
		imprimir.accept(p1);
		 
		Produto p2 = new Produto("Camisa", 15, 0.05);
		Produto p3 = new Produto("Relógio", 500, 0.05);
		Produto p4 = new Produto("Bolsa", 1500, 0.05);
		Produto p5 = new Produto("Carro", 50000, 0.05);
		List<Produto> produtos =  Arrays.asList(p1,p2,p3,p4,p5);
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
