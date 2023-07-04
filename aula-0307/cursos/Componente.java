package cursos;

public class Componente {

    //atributo
    protected String Curso;

    //metodo
    protected String selecionarComponente(String curso){

        this.Curso = curso;

        String retorno;

        switch(this.Curso){
            case "PHP":
                retorno = "\n-Logica\n-Estrutura de repetição\n-Function";
                break;
            case "JAVA":
                retorno = "\n-OOP\n-Estrutura de decisão\n-Package";
                break;
            case "PYTHON":
                retorno = "\n-Logica\n-Estrutura\n-Automação";
                break;
            default:
                retorno = "Erro ao selecionar o curso";
                break;
        }

        return retorno;



    }

    
}
