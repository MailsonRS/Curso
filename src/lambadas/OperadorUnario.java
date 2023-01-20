package lambadas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;
		int res = maisDois.
				andThen(vezesDois).
				andThen(aoQuadrado).
				apply(1);
		System.out.println(res);
		
		res = maisDois.
				compose(vezesDois).
				compose(aoQuadrado).
				apply(1);
		System.out.println(res);
	}

}
