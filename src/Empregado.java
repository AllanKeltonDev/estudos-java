import java.util.Calendar;

public class Empregado extends Pessoa {
    //Atributos
    private static int proximaMatricula = 1;
    protected String matricula;
    private Calendar dataAdmissao;
    private Calendar dataDemissao;

    //Métodos
    public Empregado(String nome, Calendar dataNascimento, long CPF, Endereco endereco) {
        super(nome, dataNascimento, CPF, endereco);
        this.matricula = gerarMatricula();
        this.dataAdmissao = Calendar.getInstance();
    }

    public void demitirEmpregado() {
        this.dataDemissao = Calendar.getInstance();
    }

    public String gerarMatricula() {
        String ano = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        String matriculaGerada = ano + "-" + proximaMatricula;
        proximaMatricula++;
        return matriculaGerada;
    }

    public String recuperarMatricula() {
        return this.matricula;
    }

    public Calendar recuperarDataAdmissao() {
        return this.dataAdmissao;
    }

    public Calendar recuperarDataDemissao() {
        return this.dataDemissao;
    }
}
