import Pessoa
class GerenciaPessoa{

    private Pessoa[] pessoas;
    private int tam;

    GerenciaPessoa(){

        pessoas = new Pessoa[10];
        tam = 0;
    }

    public void criarPessoa(String nome, int idade, int cpf, String telefone, String[] endereco, String proficao){

        Pessoa pessoa = new Pessoa(nome, idade, cpf, telefone, endereco, proficao);

        if (pessoas.length == tam){

            Pessoa[] aux = new Pessoa[pessoas.length + 5];

            for (int i = 0; i< tam; i++){

                aux[i] = pessoas[i];

            }

            pessoas = aux;

            pessoas[tam + 1] = pessoa;
            
        }else{
            
            
            pessoas[tam + 1] = pessoa;
            
            
        }
        
        tam++;
    }

    private int encontraPessoa(int cpf){
        int pessoa = -1;
        for (int j = 0; j < tam; j++){

            if(pessoas[j].getCpf() == cpf){
                pessoa = j;
                break;
            }

        }
        return pessoa;
    }


    public Pessoa procurarPessoa(int cpf){
        Pessoa pessoa = null;

        pessoa = pessoas[encontraPessoa(cpf)];

        return pessoa;

    }

    public void atualizaPessoa(int cpf,int idade, String telefone, String[] endereco, String proficao){
        int pessoa = encontraPessoa(cpf);
        
        if(pessoa != -1){

            pessoas[pessoa].setIdade(idade);
            pessoas[pessoa].setTelefone(telefone);
            pessoas[pessoa].setEndereco(endereco);
            pessoas[pessoa].setProficao(proficao);

        }


    }

    public void deletarPessoa(int cpf){

        int index = encontraPessoa(cpf);

        if (index != -1){

            for (int i = index; i < tam - 1; i++){

                pessoas[i] = pessoas[i + 1];

            }

        }


    }


}
