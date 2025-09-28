import java.util.Calendar;

public class Aluno extends Pessoa {
    //Atributos    
    private static int proximoAluno = 1;
    private String matricula;

    //Métodos
    public Aluno(String nome, Calendar dataNascimento, long CPF, Endereco endereco){
        super (nome, dataNascimento, CPF, endereco);
        this.matricula = gerarMatricula();
    }
    
    private String gerarMatricula() {
        String ano = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        String matriculaGerada = "ALUNO-" + ano + "-" + proximoAluno;
        proximoAluno++;
        return matriculaGerada;
    }

    public String recuperarMatricula() {
        return this.matricula;
    }
}
