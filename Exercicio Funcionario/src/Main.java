import entities.Funcionario;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();

        System.out.println("Enter the name: ");
        f1.nome = sc.nextLine();

        System.out.println("Enter the salary: ");
        f1.salarioBruto = sc.nextDouble();

        System.out.println("Enter the tax: ");
        f1.imposto = sc.nextDouble();

        System.out.println("Name: " + f1.nome);
        System.out.println("Gross Salary: " + f1.salarioBruto);
        System.out.println("Tax: " + f1.imposto );

        System.out.println();

        System.out.println(f1);

        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();

        f1.aumentarSalario(percentage);

        System.out.println("Update data: " + f1);

        sc.close();

    }
}