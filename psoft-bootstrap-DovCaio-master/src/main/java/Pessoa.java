
class Pessoa{

    private String nome;
    private int idade;
    private int cpf;
    private String telefone;
    private String[] endereco;
    private String proficao;


    Pessoa(String nome, int idade, int cpf, String telefone, String[] endereco, String proficao){

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.proficao = proficao;

    }

    public String getNome() {return this.nome;}
    
    public int getIdade(){return this.idade;}

    public int getCpf(){ return this.cpf;}

    public String getTelefone(){return this.telefone;}

    public String[] getEndereco(){return this.endereco;}

    public String proficao(){return this.proficao;}

    public void setIdade(int idade){this.idade = idade;}

    public void setTelefone(String telefone){this.telefone = telefone;}
    
    public void setEndereco(String[] endereco) {this.endereco = endereco;}

    public void setProficao(String proficao) {this.proficao = proficao;}


}