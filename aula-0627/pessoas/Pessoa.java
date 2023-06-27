package pessoas;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;

    public Pessoa(){
        System.out.print("Ola pessoal");
    }

    //metodos
    protected void salvarpessoa() {
        nome = "Davi";
        idade = 18;
    }
    public void registrar(){
        salvarpessoa();
    }
    public String exibirpessoa(){
        return "\nNome: "+ nome +
        "\nIdade: "+ idade;
    }
}
