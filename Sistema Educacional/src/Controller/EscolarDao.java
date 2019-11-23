/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AlunosModel;
import Model.Bloco;
import Model.Conexao_bd;
import Model.Disciplina;
import Model.ProfissionalModel;
import Model.RegistroAlunoModel;
import Model.Sala;
import Model.Turma;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        PreparedStatement pst = conexao.prepareStatement("insert into turma(turma_pk,cod_aluno,turno) values(?,?,?,?)");
             pst.setString(1,tur.getTurma_tipo());
             
             pst.setInt(2, tur.getAluno().getCod());
             pst.setString(3, tur.getTurno());
                
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
      PreparedStatement pst= conexao.prepareStatement("insert into bloco (id_bloco,turma_pk,cod_aluno,id_sala,nome ) values(default,?,?,?,?,?)");
      
        pst.setString(1, bloco.getTurma().getTurma_tipo());
       
         pst.setInt(2, bloco.getAluno().getCod());
         pst.setInt(3, bloco.getSala().getIdSala());
         pst.setString(4, bloco.getNomeBloco());
                 
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
            
                
                
                
      PreparedStatement pst= conexao.prepareStatement("insert into turma_disc(idpk,turma_pk,cod_aluno,iddisc, cod_prof,falta,media_final,nota1,nota2,nota3,nota4,bimestre) "
              + "values(default,?,?,?,?,?,?,?,?,?,?,?)");
      
        pst.setString(1, alu.getTurma().getTurma_tipo());
       
         pst.setInt(2, alu.getAluno().getCod());
        pst.setInt(3, alu.getDisciplina().getCod());
        pst.setInt(4,alu.getProfessor().getCod());
         pst.setInt(5, alu.getFalta());
         pst.setDouble(6, alu.getMediafinal());
         pst.setDouble(7, alu.getNota1());
         pst.setDouble(8, alu.getNota2());
          pst.setDouble(9, alu.getNota3());
         pst.setDouble(10, alu.getNota4());
         pst.setString(11, alu.getBimestre());
        // pst.setString(10, alu.getSerie());
                 
            pst.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "cadastrou");
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
    }
        
        public ArrayList<Disciplina> BuscarCodDisc(String nome){
       conecta();
            ArrayList<Disciplina> listaa1= new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select iddisc from disicplina where nome_disc ilike'"+
                    nome+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

                Disciplina a = new Disciplina();
                  
                    a.setCod(rs.getInt("iddisc"));
                  
                  
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
 
        }
        
        
        
        public ArrayList<Turma> BuscarCodTurma(String nome){
       conecta();
            ArrayList<Turma> listaa1= new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select turma_pk from turma where turma_pk ilike'"+
                    nome+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

                Turma a = new Turma();
                  
                    a.setTurma_tipo(rs.getString("turma_pk"));
                  
                  
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
            
            
        }
        
        
        
        public ArrayList<ProfissionalModel> BuscarCodProf(String nome){
       conecta();
            ArrayList<ProfissionalModel> listaa1= new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select cod_prof from profissional where nome_prof ilike'"+
                    nome+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

                ProfissionalModel a = new ProfissionalModel();
                  
                    a.setCod(rs.getInt("cod_prof"));
                  
                  
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
            
            
        }
        
        
        
        public ArrayList<AlunosModel> BuscarCodAluno(String rg){
       conecta();
            ArrayList<AlunosModel> listaa1= new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select * from aluno where rg_aluno ilike'"+
                    rg+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

                AlunosModel a = new AlunosModel();
                  
                    a.setCod(rs.getInt("cod_aluno"));
                    a.setNome(rs.getString("nome_aluno"));
                  a.setSexo(rs.getString("sexo"));
                  a.setSobrenome(rs.getString("sobrenome"));
                  a.setData(rs.getString("data_nasc"));
                    a.setRg(rs.getString("rg_aluno"));
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

