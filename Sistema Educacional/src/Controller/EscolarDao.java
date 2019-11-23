/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bloco;
import Model.Conexao_bd;
import Model.Disciplina;
import Model.RegistroAlunoModel;
import Model.Sala;
import Model.Turma;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;
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
    
      public void InserirDisicplina(Disciplina disc){
        conecta();
          try {
        PreparedStatement pst= conexao.prepareStatement("insert into  disicplina (iddisc, nome_disc) values(default,?)");
      
        pst.setString(1, disc.getNome());
      
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
        
        
        
    }
    
    
      
    public void InserirResgistro(RegistroAlunoModel alu){
        conecta();
          try {
            
                
                
                
      PreparedStatement pst= conexao.prepareStatement("insert into turma_disc(idpk,turma_pk,idreg,cod_aluno,cod_prof,falta,media_final,nota1,nota2,nota3,nota4,bimestre,serie) "
              + "values(default,?,?,?,?,?,?,?,?,?,?,?,?)");
      
        pst.setString(1, alu.getTurma().getTurma_tipo());
        pst.setInt(2, alu.getMat().getIdRegistro());
         pst.setInt(3, alu.getAluno().getCod());
        
         pst.setInt(4, alu.getFalta());
         pst.setDouble(5, alu.getMediafinal());
         pst.setDouble(6, alu.getNota1());
         pst.setDouble(7, alu.getNota2());
          pst.setDouble(8, alu.getNota3());
         pst.setDouble(9, alu.getNota4());
         pst.setString(10, alu.getBimestre());
         pst.setString(11, alu.getSerie());
                 
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
}
