/*
 * Jorge Sampaio de lima RA: 81513901
 * */

public class Aluno {
	private String nome;
	private int id;

	public Aluno(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
