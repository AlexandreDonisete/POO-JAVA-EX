package entities;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public Funcionario() {
    }

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    @Override
    public String toString() {
        return "Employee: " + this.nome + ", $ " + String.format("%.2f", this.salarioLiquido());
    }
}
