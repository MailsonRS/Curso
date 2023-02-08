package excecao.personalisadaA;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends RuntimeException{
	String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
	}
	

}
