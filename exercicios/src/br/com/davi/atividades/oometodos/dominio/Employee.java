package br.com.davi.atividades.oometodos.dominio;

public class Employee {
    public String name;
    public int age;
    public double[] salary;
    public double average;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getAverage() {
        return average;
    }
}
