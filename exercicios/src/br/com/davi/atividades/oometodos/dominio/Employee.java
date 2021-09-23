package br.com.davi.atividades.oometodos.dominio;

public class Employee {
    private String name;
    private int age;
    private double[] salary;
    private double average;

    public void printInf() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salary == null) {
            return;
        }
        for (double sal : salary) {
            System.out.print(sal + " ");
        }
        averageWage();
    }

    public void averageWage() {
        if (salary == null) {
            return;
        }

        for (double sal : salary) {
            average += sal;
        }
        average /= salary.length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getAverage() {
        return average;
    }
}
