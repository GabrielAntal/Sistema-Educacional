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
public class Bloco {
    private int idBloco;
    private Sala sala;
    private Turma turma;
    private AlunosModel aluno;
    private matricula mat;
    private String nomeBloco;

    public Bloco(int idBloco, Sala sala, Turma turma, AlunosModel aluno, matricula mat, String nomeBloco) {
        this.idBloco = idBloco;
        this.sala = sala;
        this.turma = turma;
        this.aluno = aluno;
        this.mat = mat;
        this.nomeBloco = nomeBloco;
    }

    public Bloco() {
    }

    public int getIdBloco() {
        return idBloco;
    }

    public void setIdBloco(int idBloco) {
        this.idBloco = idBloco;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
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

    public matricula getMat() {
        return mat;
    }

    public void setMat(matricula mat) {
        this.mat = mat;
    }

    public String getNomeBloco() {
        return nomeBloco;
    }

    public void setNomeBloco(String nomeBloco) {
        this.nomeBloco = nomeBloco;
    }
    
    
}