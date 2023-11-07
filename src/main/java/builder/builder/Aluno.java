package builder.builder;

/**
 *
 * @author Valdenir
 */
public class Aluno {
    
    private String nome;
    private int idade;
    private String curso;
    private String ra;

    public Aluno(AlunoBuilder builder) {
        this.nome = builder.getNome();
        this.idade = builder.getIdade();
        this.curso = builder.getCurso();
        this.ra = builder.getRa();
    }

    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public String getRa() {
        return ra;
    }
}
