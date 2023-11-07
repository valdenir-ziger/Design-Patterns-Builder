package builder.builder;

/**
 *
 * @author Valdenir
 */
public class Construtor {
    public void CarregarAluno(Builder builder) {
        builder.setNome("João");
        builder.setIdade(20);
        builder.setCurso("Engenharia");
        builder.setCpfCnpj(null);
        builder.setRa("12345");
    }

    public void CarregarMonitor(Builder builder) {
        builder.setNome("Maria");
        builder.setIdade(18);
        builder.setCurso("Computação");
        builder.setCpfCnpj("123.456.789-10");
        builder.setRa(null);
    }
}
