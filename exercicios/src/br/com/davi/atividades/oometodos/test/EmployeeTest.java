package br.com.davi.atividades.oometodos.test;

import br.com.davi.atividades.oometodos.dominio.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("João");
        employee.setAge(23);
        employee.setSalary(new double[]{2500, 2700, 3000, 4500});
        employee.printInf();

        System.out.println("\nMédia salarial: " + employee.getAverage());
    }
}
