/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gabriel
 */
public class ProfessorModel {
    
        private String nome;
        private String cpf;
        private int idProf;
        private String sobrenome;
        private String sexo;

    public ProfessorModel(String nome, String cpf, int idProf, String sobrenome, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idProf = idProf;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
    }

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


        
        
        
    public ProfessorModel() {
   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

  
        
      

        
    
    
}
