package br.com.davi.atividades.seminario.test;

import br.com.davi.atividades.seminario.dominio.Aluno;
import br.com.davi.atividades.seminario.dominio.Local;
import br.com.davi.atividades.seminario.dominio.Professor;
import br.com.davi.atividades.seminario.dominio.Seminario;

public class AssociarTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Hugo Lens", "Geometria");
        Aluno aluno = new Aluno("Marcos", 30);
        Aluno[] alunosSeminario = {aluno};
        Local local = new Local("Bahia, Brazil");

        Seminario seminario = new Seminario("A aula mais incrível!", alunosSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminars(seminariosDisponiveis);

        professor.printInf();
    }
}
