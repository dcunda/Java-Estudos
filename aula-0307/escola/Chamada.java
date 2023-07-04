package escola;

import pessoas.Aluno;
import cursos.Curso;

public class Chamada{
    // atributo
    public String Turma;
    public String Curso;

    // construtor
    public Chamada( String mensagem, String turma){
        // escreve a mensagem
        String texto = "Ola turma" +turma+" "+mensagem;
        System.out.print(texto);
        // atribui o valor
        this.Turma = turma;
        // metodo
        this.selecionarTurma();
        this.selecionarAlunos();
        //objeto
        // chamada retornar o curso da turma
        Curso curso = new Curso(this.Curso, 60, 1440);
        System.out.println(curso.exibirCurso());
    }

    private void selecionarTurma(){
        String texto = "Turma "+this.Turma+" selecionada \n";
        System.out.println(texto); 
        switch (this.Turma) {
            case "101":
                this.Curso = "PHP";
                break;
            case "201":
                this.Curso = "JAVA";
                break;
            case "301":
                this.Curso = "PYTHON";
                break;
            default:
                this.Curso = "";
                break;
        }
    }

    private void selecionarAlunos() {

        Aluno aluno = new Aluno();
        System.out.println(aluno.alunosTurma(this.Turma));
        
        
    }
}
