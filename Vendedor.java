public class Vendedor {

    // Atributos encapsulados para o vendedor
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    // Construtor da classe Vendedor
    public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
        this.nome = nome; 
        this.cpf = cpf; // Agora o cpf está sendo inicializado corretamente
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    // Métodos getter e setter para acessar e modificar os atributos

    // Retorna o nome do vendedor
    public String getNome() {
        return nome;
    }

    // Modifica o nome do vendedor
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o CPF do vendedor
    public String getCpf() {
        return cpf;
    }

    // Modifica o CPF do vendedor
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Retorna a data de nascimento do vendedor
    public String getDataNascimento() {
        return dataNascimento;
    }

    // Modifica a data de nascimento do vendedor
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Retorna a data de contratação do vendedor
    public String getDataContratacao() {
        return dataContratacao;
    }

    // Modifica a data de contratação do vendedor
    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    // Retorna o salário base do vendedor
    public double getSalarioBase() {
        return salarioBase;
    }

    // Modifica o salário base do vendedor
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Retorna o percentual de comissão do vendedor
    public double getPercentualComissao() {
        return percentualComissao;
    }

    // Modifica o percentual de comissão do vendedor
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
