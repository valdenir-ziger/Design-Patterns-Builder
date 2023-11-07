package builder.builder;

/**
 *
 * @author Valdenir
 */
public class AlunoBuilder implements Builder{

    private String nome;
    private Integer idade;
    private String curso;
    private String ra;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Integer getIdade() {
        return idade;
    }

    @Override
    public String getCurso() {
        return curso;
    }

    @Override
    public String getRa() {
        return ra;
    }
    
    public Aluno getResult() {
        return new Aluno(this);
    }

    @Override
    public void setCpfCnpj(String cpfCnpj) {}

    @Override
    public String getCpfCnpj() {
        return null;
    }
}
