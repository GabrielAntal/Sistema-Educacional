/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Views.Professores;

/**
 *
 * @author Willian
 */
public class RegistroAlunoModel {
    
    private Disciplina disciplina;
    private Turma turma;
    private AlunosModel aluno;
    private ProfissionalModel prof;
    
    private int cod;
    private int falta;
    private double nota1;
     private double nota2;
     private double nota3;
     private double nota4;
    private double mediafinal;
    private String bimestre;
 

    public RegistroAlunoModel() {
    }

    public RegistroAlunoModel(Disciplina disciplina, Turma turma, AlunosModel aluno, ProfissionalModel prof,  int falta, double nota1, double nota2, double nota3, double nota4, double mediafinal, String bimestre, int cod) {
        this.disciplina = disciplina;
        this.turma = turma;
        this.aluno = aluno;
        this.prof = prof;
     this.cod=cod;
        this.falta = falta;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.mediafinal = mediafinal;
        this.bimestre = bimestre;
      
    }

    public ProfissionalModel getProf() {
        return prof;
    }

    public void setProf(ProfissionalModel prof) {
        this.prof = prof;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public AlunosModel getAluno() {
        return aluno;
    }

    public void setAluno(AlunosModel aluno) {
        this.aluno = aluno;
    }

    public ProfissionalModel getProfessor() {
        return prof;
    }

    public void setProfessor(ProfissionalModel prof) {
        this.prof = prof;
    }

   

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMediafinal() {
        return mediafinal;
    }

    public void setMediafinal(double mediafinal) {
        this.mediafinal = mediafinal;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

   
    
}
