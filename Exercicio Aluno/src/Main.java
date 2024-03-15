import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Insira o nome do Aluno: ");
        student.nome = sc.nextLine();

        System.out.println("Digite a nota do 1º trimestre: ");
        student.n1 = sc.nextDouble();

        System.out.println("Digite a nota do 2º trimestre: ");
        student.n2 = sc.nextDouble();

        System.out.println("Digite a nota do 3º trimestre: ");
        student.n3 = sc.nextDouble();

        student.calculaNota();
    }
}