public class Main {
    public static void main(String[] args) {
        Vetor vetorFuncionarios = new Vetor();

        Funcionario funcionario1 = new Funcionario("Stan", 2500.00);
        Funcionario funcionario2 = new Funcionario("Jacob", 2300.00);
        Funcionario funcionario3 = new Funcionario("Albert", 5000.00);
        Funcionario funcionario4 = new Funcionario("Bob", 3500.00);
        Funcionario funcionario5 = new Funcionario("Elie", 4500.00);

        vetorFuncionarios.adicionarFuncionario(funcionario1);
        vetorFuncionarios.adicionarFuncionario(funcionario2);
        vetorFuncionarios.adicionarFuncionario(funcionario3);
        vetorFuncionarios.adicionarFuncionario(funcionario4);
        vetorFuncionarios.adicionarFuncionario(funcionario5);

        System.out.println("Ordem aleátoria");
        System.out.println(vetorFuncionarios);

        System.out.println("Salário em ordem crescente");
        vetorFuncionarios.ordemCrescenteSalario();
        System.out.println(vetorFuncionarios);

        System.out.println("Salário em ordem decrescente");
        vetorFuncionarios.ordemDecrescenteSalario();
        System.out.println(vetorFuncionarios);

        System.out.println("Nomes em ordem alfabetica");
        vetorFuncionarios.ordemAlfabeticaNomes();
        System.out.println(vetorFuncionarios);



    }
}
