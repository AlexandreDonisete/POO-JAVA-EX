package entities;

public class Student {
    public String nome;
    public double n1, n2, n3;

    public Student() {

    }

    public Student(String nome, double n1, double n2, double n3) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void calculaNota() {
        double notaTotal = this.n1 + this.n2 + this.n3;

        if(notaTotal < 60) {
            System.out.println("FINAL GRADE = " + String.format("%.2f", notaTotal));
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", 60 - notaTotal) );
        } else {
            System.out.println("FINAL GRADE = " + String.format("%.2f", notaTotal));
            System.out.println("PASS");
        }
    }
}
