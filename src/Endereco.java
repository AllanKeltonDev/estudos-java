public class Endereco {    
	
    private String nome_rua;
    private String numero;
    private String pais;
    private String uf;
    private String cidade;
    private int cep;
    private String complemento;

    public Endereco() {
		// Construtor vazio para ser usado em Principal.java
	}
    
    public Endereco (String nome_rua, String numero){
         this.definirRua(nome_rua);
         this.definirNumero(numero);
    }

	public void definirRua(String nome_rua) {
         this.nome_rua = nome_rua;
    }  
    
    public String getNomeRua () {
         return this.nome_rua;
    }
    
    public void definirNumero(String numero) {
         this.numero = numero;
    }  
    
    public String getNumero() {
         return this.numero;
    }

    public void definirPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void definirUF(String uf) {
        this.uf = uf;
    }

    public String getUf() {
        return uf;
    }

    public void definirCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void definirCEP(int cep) {
        this.cep = cep;
    }

    public int getCep() {
        return cep;
    }

    public void definirComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }
}