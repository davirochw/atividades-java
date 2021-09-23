package br.com.davi.atividades.seminario.dominio;

public class Professor {
    private String name;
    private String specialty;
    private Seminario[] seminars;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Professor(String name, String specialty, Seminario[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void printInf() {
        System.out.println("Professor: " + this.name);

        if (this.seminars == null) return;
        System.out.println("-- Seminários --");
        for (Seminario seminario : this.seminars) {
            System.out.println(seminario.getTitle());
            System.out.println(seminario.getLocal().getAddress());
            if (seminario.getAlunos() == null || seminario.getAlunos().length==0) continue;
            System.out.println("-- Alunos --");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getName() + " idade: " + aluno.getAge());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminario[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminario[] seminars) {
        this.seminars = seminars;
    }
}

