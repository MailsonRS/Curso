package lambadas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> ParOuImpar = 
				num -> num % 2 == 0 ? "Par" :"Impar";
		
		Function<String, String> oResultaE = 
				valor -> "O resultado é: " + valor;	
				
		Function<String, String> empolgado = 
				 valor -> valor + "!!!";
				 
		System.out.println(ParOuImpar.apply(33));
		System.out.println(ParOuImpar.apply(20));
				
		String resFinal = ParOuImpar.andThen(oResultaE).apply(15);
		System.out.println(resFinal);
				
		resFinal = ParOuImpar.
				andThen(oResultaE).
				andThen(empolgado).
				apply(15);
		System.out.println(resFinal);
		
	}

}
