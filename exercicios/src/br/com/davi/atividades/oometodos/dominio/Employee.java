package br.com.davi.atividades.oometodos.dominio;

public class Employee {
    public String name;
    public int age;
    public double[] salary;

    public void prints() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salary == null) {
            return;
        }
        for (double sal : salary) {
            System.out.print(sal + " ");
        }
        AverageWage();
    }

    public void AverageWage() {
        if (salary == null) {
            return;
        }
        double average = 0;
        for (double sal : salary) {
            average += sal;
        }
        average /= salary.length;
        System.out.println("\nMédia salarial: " + average);
    }
}
