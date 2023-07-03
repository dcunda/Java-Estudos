package cursos;

public class Curso extends Componente {

    protected String NomeCurso;
    protected int CargaHoraria;
    protected float Valor;

    public Curso( String nome, int carga, float valor){
        this.salvarCurso(nome, carga, valor);
    }

    protected void salvarCurso( String nomeCurso, int cargaHoraria, float valor){
        this.NomeCurso = nomeCurso;
        this.CargaHoraria = cargaHoraria;
        this.Valor = valor;

    }
    public String exibirCurso(){
        return "\nNome: "+ this.NomeCurso +
        "\nCarga: "+ this.CargaHoraria +
        "\nValor: "+ this.Valor;

    }
}
