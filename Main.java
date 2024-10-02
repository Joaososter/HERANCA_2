// Classe principal para testar os objetos
public class Main {

    public static void main(String[] args) {
        // Criando um objeto da classe Vendedor
        Vendedor vendedor1 = new Vendedor("João", "12345678910", "15/03/1990", "01/01/2020", 2000.0, 10.0);
        
        // Exibindo informações do vendedor
        System.out.println("Informações do Vendedor:");
        System.out.println("Nome: " + vendedor1.getNome());
        System.out.println("CPF: " + vendedor1.getCpf());
        System.out.println("Data de Nascimento: " + vendedor1.getDataNascimento());
        System.out.println("Data de Contratação: " + vendedor1.getDataContratacao());
        System.out.println("Salário Base: " + vendedor1.getSalarioBase());
        System.out.println("Percentual de Comissão: " + vendedor1.getPercentualComissao());

        // Criando um objeto da classe Gerente
        Gerente gerente1 = new Gerente("Maria", "98765432100", "25/08/1985", "15/05/2018", 5000.0, "Vendas");
        
        // Exibindo informações do gerente
        System.out.println("\nInformações do Gerente:");
        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("CPF: " + gerente1.getCpf());
        System.out.println("Data de Nascimento: " + gerente1.getDataNascimento());
        System.out.println("Data de Contratação: " + gerente1.getDataContratacao());
        System.out.println("Salário Base: " + gerente1.getSalarioBase());
        System.out.println("Departamento: " + gerente1.getDepartamento());

        // Criando um objeto da classe Cliente
        Cliente cliente1 = new Cliente("Ana", "11223344556", "10/11/1995", "ana@email.com", "123456789", "999999999");

        // Exibindo informações do cliente
        System.out.println("\nInformações do Cliente:");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Data de Nascimento: " + cliente1.getDataNascimento());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Número do Cartão de Fidelidade: " + cliente1.getNumeroCartaoFidelidade());
        System.out.println("Telefone: " + cliente1.getTelefone());
    }
}
