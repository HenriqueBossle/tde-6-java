public class Vetor {
    private Funcionario[] funcionarios;
    private int tamanho;

    public Vetor() {
        funcionarios = new Funcionario[5];
        this.tamanho = 0;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        if(tamanho < funcionarios.length){
            this.funcionarios[tamanho] = funcionario;
            tamanho++;
        }else{
            System.out.println("Vetor Cheio!!!");
        }
    }

    @Override
    public String toString(){
        String s = "[";
        for(int i = 0; i < this.tamanho; i++){
            s += this.funcionarios[i].toString();
        }
        s += "]";
        return s;
    }

    public void ordemCrescenteSalario(){
        int n = this.tamanho;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (funcionarios[j].getSalario() > funcionarios[j + 1].getSalario()) {
                    Funcionario temp = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = temp;
                }
            }
        }
    }

    public void ordemDecrescenteSalario(){
        int n = this.tamanho;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (funcionarios[j].getSalario() < funcionarios[j + 1].getSalario()) {
                    Funcionario temp = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = temp;
                }
            }
        }
    }

    public void ordemAlfabeticaNomes(){
        int n = this.tamanho;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (funcionarios[j].getNome().compareTo(funcionarios[j + 1].getNome()) > 0) {
                    Funcionario temp = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = temp;
                }
            }
        }
    }
}
