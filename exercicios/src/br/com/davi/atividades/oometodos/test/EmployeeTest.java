package br.com.davi.atividades.oometodos.test;

import br.com.davi.atividades.oometodos.dominio.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "João";
        employee.age = 23;
        employee.salary = new double[]{2500, 2700, 3000, 4500};
        employee.prints();
    }
}
