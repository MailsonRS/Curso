package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double -> Double
		
		Double coisaA = (Double)caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá"); 
		//Caso faça um cast errado vai ocorrer um erro em tempo de compilação 
		String coisaB = (String)caixaB.abrir();
		System.out.println(coisaB);
	}

}
