/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Willian
 */
public class RegistroAlunoModel {
    
    private Disciplina disciplina;
    private Turma turma;
    private AlunosModel aluno;
    private ProfessorModel professor;
    private matricula mat;
    private int falta;
    private double nota;
    private double mediafinal;
    private String bimestre;
    private String serie;

    public RegistroAlunoModel(Disciplina disciplina, Turma turma, AlunosModel aluno, ProfessorModel professor, matricula mat, int falta, double nota, double mediafinal, String bimestre, String serie) {
        this.disciplina = disciplina;
        this.turma = turma;
        this.aluno = aluno;
        this.professor = professor;
        this.mat = mat;
        this.falta = falta;
        this.nota = nota;
        this.mediafinal = mediafinal;
        this.bimestre = bimestre;
        this.serie = serie;
    }

    public RegistroAlunoModel() {
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

    public ProfessorModel getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorModel professor) {
        this.professor = professor;
    }

    public matricula getMat() {
        return mat;
    }

    public void setMat(matricula mat) {
        this.mat = mat;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    
    
}
