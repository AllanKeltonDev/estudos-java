import java.util.Calendar;

public class Principal {
    
    public static void main (String args[]) {
        // --- Criação do Aluno 1 ---
        Calendar data1 = Calendar.getInstance();
        data1.set(1980, Calendar.NOVEMBER, 23);
        
        Endereco endereco1 = new Endereco();
        endereco1.definirPais("Brasil");
        endereco1.definirUF("RJ");
        endereco1.definirCidade("Rio de Janeiro");
        endereco1.definirRua("Avenida Rio Branco");
        endereco1.definirNumero("156A");
        endereco1.definirCEP(20040901);
        endereco1.definirComplemento("Bloco 03 - Ap 20.005");
        
        Aluno aluno1 = new Aluno("Maria", data1, 901564098L, endereco1);

        // --- Criação do Aluno 2 ---
        Calendar data2 = Calendar.getInstance();
        data2.set(2007, Calendar.JULY, 7);

        Endereco endereco2 = new Endereco();
        endereco2.definirPais("Brasil");
        endereco2.definirUF("CE");
        endereco2.definirCidade("Fortaleza");
        endereco2.definirRua("rua Canuto de Aguiar");
        endereco2.definirNumero("176");
        endereco2.definirCEP(20252060);
        endereco2.definirComplemento("Ap 307");
        
        Aluno aluno2 = new Aluno("João", data2, 123456877L, endereco2);

        // --- Exibição dos Resultados ---
        System.out.println("--- Dados do Aluno 1 ---");
        System.out.println("Nome: " + aluno1.recuperarNome());
        System.out.println("Matrícula: " + aluno1.recuperarMatricula());
        System.out.println("Idade: " + aluno1.recuperarIdade());
        System.out.println("Endereço: " + aluno1.recuperarEndereco().getNomeRua() + ", " + aluno1.recuperarEndereco().getNumero());
        System.out.println(); // Linha em branco para separar

        System.out.println("--- Dados do Aluno 2 ---");
        System.out.println("Nome: " + aluno2.recuperarNome());
        System.out.println("Matrícula: " + aluno2.recuperarMatricula());
        System.out.println("Idade: " + aluno2.recuperarIdade());
        System.out.println("Endereço: " + aluno2.recuperarEndereco().getNomeRua() + ", n˚" + aluno2.recuperarEndereco().getNumero() + " ," + aluno2.recuperarEndereco().getComplemento());
        System.out.println("Estado: " + aluno2.recuperarEndereco().getUf() + " - Cidade: " + aluno2.recuperarEndereco().getCidade());
        System.out.println("Pais: " + aluno2.recuperarEndereco().getPais() + " - CEP: " + aluno2.recuperarEndereco().getCep()); 
    }

}
