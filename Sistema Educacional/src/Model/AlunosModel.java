/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import javax.swing.JTextField;

/**
 *
 * @author Willian
 */
public class AlunosModel {
   
  
    private String nome;
    private String sobrenome;
    private String rg;
    
    
    
    public AlunosModel( String nome, String sobrenome, String rg) {
      
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
    }

    public AlunosModel() {
     
    }

    public AlunosModel(JTextField nome, JTextField sobrenome, JTextField rg) {
     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
   
    



 
}
