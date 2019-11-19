/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bloco;
import Model.Conexao_bd;
import Model.Disciplina;
import Model.Sala;
import Model.Turma;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class EscolarDao extends Conexao_bd {
    
    
    
    
    public void InserirTurma(Turma tur){
            conecta();
            
      try {
        PreparedStatement pst = conexao.prepareStatement("insert into turma(turma_pk,idreg,cod_aluno,turno) values(?,?,?,?)");
             pst.setString(1,tur.getTurma_tipo());
             pst.setInt(2, tur.getMat().getIdRegistro());
             pst.setInt(3, tur.getAluno().getCod());
             pst.setString(4, tur.getTurno());
                
             pst.executeUpdate();
             
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
        
    }
    
    public void InserirSala(Sala sala){
        conecta();
        try {
      PreparedStatement pst= conexao.prepareStatement("insert into sala (id_sala,nome_sala) values(default,?)");
      
        pst.setString(1, sala.getNome_sala());
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
        
        
    }
    
    
    
    public void InserirBloco(Bloco bloco){
        conecta();
          try {
      PreparedStatement pst= conexao.prepareStatement("insert into bloco (id_bloco,turma_pk,idreg,cod_aluno,id_sala,nome ) values(default,?,?,?,?,?)");
      
        pst.setString(1, bloco.getTurma().getTurma_tipo());
        pst.setInt(2, bloco.getMat().getIdRegistro());
         pst.setInt(3, bloco.getAluno().getCod());
         pst.setInt(4, bloco.getSala().getIdSala());
         pst.setString(5, bloco.getNomeBloco());
                 
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
}
