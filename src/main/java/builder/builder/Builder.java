package builder.builder;

/**
 *
 * @author Valdenir
 */
public interface Builder {
    void setNome(String nome);
    void setIdade(Integer idade);
    void setCurso(String curso);
    void setRa(String ra);
    void setCpfCnpj(String cpfCnpj);
    String getNome();
    Integer getIdade();
    String getCurso();
    String getRa();
    String getCpfCnpj();
}
