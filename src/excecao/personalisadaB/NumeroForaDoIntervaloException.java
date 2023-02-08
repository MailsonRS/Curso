package excecao.personalisadaB;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends Exception{
	String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
	}
	

}
