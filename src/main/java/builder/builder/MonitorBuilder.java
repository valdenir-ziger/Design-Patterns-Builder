package builder.builder;

/**
 *
 * @author Valdenir
 */
public class MonitorBuilder implements Builder{

    private String nome;
    private Integer idade;
    private String curso;
    private String cpfCnpj;

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
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
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
    public String getCpfCnpj() {
        return cpfCnpj;
    }
    
    public Monitor getResult() {
        return new Monitor(this);
    }

    @Override
    public void setRa(String ra) {}

    @Override
    public String getRa() {
        return null;
    }
}
