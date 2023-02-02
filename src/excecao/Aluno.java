package excecao;

import java.util.Objects;

public class Aluno {
	final String nome;
	final double nota;
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	@Override
	public String toString() {
		return  this.nome +" tem nota " +this.nota;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	

}
