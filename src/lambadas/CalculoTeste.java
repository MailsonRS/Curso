package lambadas;

public class CalculoTeste {
	public static void main(String[] args) {
		Calculo calculo = (x,y) -> {return x+y;};
		System.out.println(calculo.executar(3, 4));
		calculo = (x,y) ->  x*y;
		System.out.println(calculo.executar(3, 4));
		
	}

}
