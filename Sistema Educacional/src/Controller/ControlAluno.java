/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AlunosModel;
import Model.Conexao_bd;
import Views.Alunos;

import java.sql.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Willian
 */
public class ControlAluno extends AlunoDao {
    
    AlunosModel a = new AlunosModel();
    
    public void AlunoControl(String nome, String sobrenome, String rg, String data){

      AlunosModel a = new AlunosModel(nome, sobrenome, rg,data);


       if(nome.length()>0&&sobrenome.length()>0&&rg.length()>0&&data.length()>0){
            
           InserirAluno(a);
       
       }else{
                JOptionPane.showMessageDialog(null, "insira os campos");
        }
           
         
    }
    
    
    public void Alu(String n){
        if(n!=null){
            listarAlunos(n);
        }
    }
    
    
    
              
}
