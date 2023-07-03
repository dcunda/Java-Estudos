package pessoas;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String email;
    private String telefone;

    public Pessoa(){
        System.out.print("Ola pessoal");
    }

    //metodos
    protected void salvarpessoa(){ 
        this.nome = "Davi";
        idade = 18;
        this.salvarContato("davi@gmail.com","(51) 98647-0851");
    }
    protected void salvarContato(String email, String telefone){
        this.email = email;
        this.telefone = telefone;

    }
    public void registrar(){
        this.salvarpessoa();
    }
    public String exibirpessoa(){
        return "\nNome: "+ nome +
        "\nIdade: "+ idade +
        "\nEmail: "+ email +
        "\nTelefone: "+ telefone;
    }
}
