package generics;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> resultadosConcurso = new Pares<>();
		resultadosConcurso.adicionar(1, "Maria");
		resultadosConcurso.adicionar(2, "Pedro");
		resultadosConcurso.adicionar(3, "Gui");
		resultadosConcurso.adicionar(4, "Ana");
		resultadosConcurso.adicionar(2, "Rebeca");
		System.out.println(resultadosConcurso.getValor(1));
		System.out.println(resultadosConcurso.getValor(2)) ;
	}

}
