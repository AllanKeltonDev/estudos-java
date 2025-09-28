import java.util.Calendar;

public class Pessoa {
//Atributos
	private String nome;
	private int idade;
	private Calendar dataNascimento;
	private long CPF;
	private Endereco endereco;
	
	//Métodos
	public Pessoa(String nome, Calendar dataNascimento, long CPF, Endereco endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.CPF = CPF;
		this.endereco = endereco;
		atualizarIdade();
	}
	
	public void atualizarNome(String nome) {
		this.nome = nome;
	}
	
	public String recuperarNome() {
		return this.nome;
	}
	
	public void atualizarIdade() {
		this.idade = calcularIdade();
	}
	
	public int recuperarIdade() {
		return this.idade;
	}
	
	public void atualizarCPF(long CPF) {
		this.CPF = CPF;
	}
	
	public long recuperarCPF() {
		return this.CPF;
	}
	
	public void atualizarEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco recuperarEndereco() {
		return this.endereco;
	}
	
	private int calcularIdade() {
		int idadeCalculada;
		Calendar hoje = Calendar.getInstance();
		idadeCalculada = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
		if((dataNascimento.get(Calendar.MONTH) > hoje.get(Calendar.MONTH)) || (dataNascimento.get(Calendar.MONTH) == hoje.get(Calendar.MONTH) && dataNascimento.get(Calendar.DATE) > hoje.get(Calendar.DATE)))
			idadeCalculada--;
		return idadeCalculada;
	}
}