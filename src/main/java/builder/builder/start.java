package builder.builder;

/**
 *
 * @author Valdenir Ziger
 */
public class start {

    public static void main(String[] args) {
        Construtor construtor = new Construtor();
        
        // Criando um objeto Aluno usando o Builder
        AlunoBuilder alunoBuilder = new AlunoBuilder();
        construtor.CarregarAluno(alunoBuilder);

        // Criando um objeto Monitor usando o Builder
        MonitorBuilder monitorBuilder = new MonitorBuilder();
        construtor.CarregarMonitor(monitorBuilder);
        
        Aluno   aluno   = alunoBuilder.getResult();
        Monitor monitor = monitorBuilder.getResult();
        
        // Exibindo informações dos objetos Monitor e Aluno
        System.out.println("Aluno: " + aluno.getNome() + ", RA: " + aluno.getRa());
        System.out.println("Monitor: " + monitor.getNome() + ", CPF/CNPJ: " + monitor.getCpfCnpj());
    }
    
}
