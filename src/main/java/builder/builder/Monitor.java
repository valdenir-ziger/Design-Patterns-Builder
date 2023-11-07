package builder.builder;

/**
 *
 * @author Valdenir
 */
public class Monitor {
    private String nome;
    private int idade;
    private String curso;
    private String cpfCnpj;

    public Monitor(MonitorBuilder builder) {
        this.nome = builder.getNome();
        this.idade = builder.getIdade();
        this.curso = builder.getCurso();
        this.cpfCnpj = builder.getCpfCnpj();
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

    public String getCpfCnpj() {
        return cpfCnpj;
    }
}
