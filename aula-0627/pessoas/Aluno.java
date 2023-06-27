package pessoas;

public class Aluno extends Pessoa {
    // atributos
    public String situacao;
    public double Media;

    public void salvaraluno(double media) {

        registrar();
        // atribui o valor da media
        Media = media;
        // valida o valor para gerar a situacao
        if (media >= 6.0) {
            situacao = "aprovado";
        }else{
            situacao = "reprovado";
        }
    }

    public String exibiraluno(){
        return exibirpessoa() + "\nMédia : "+ Media +"\nSituação: "+ situacao;
    }

    public String alunosTurma(String turma){

        String alunos;

        switch (turma) {
            case "301":
                alunos = "\n-Davi\n-Kaio\n-Juca\n-Fernando\n-Arthur";
                break;

            case "201":
                alunos = "\n-Lucas\n-Pedro\n-Davi\n-Fernando\n-Arthur";
                break;

            case "101":
                alunos = "\n-Pedro\n-Davi\n-Kaio\n-Fernando\n-Arthur";
                break;

            default:
                alunos = "\nsem alunos";
                break;        
        }
        return alunos;
    }
}
