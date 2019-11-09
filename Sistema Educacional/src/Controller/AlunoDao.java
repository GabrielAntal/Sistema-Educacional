/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AlunosModel;
import Model.Conexao_bd;
import Views.Alunos;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author Willian
 */
public class AlunoDao extends Conexao_bd  {
    
 
    PreparedStatement pst =null;
    private AlunosModel aluno;

    public  void InserirAluno(AlunosModel aluno){
        conecta();
    
        try {
              //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
               PreparedStatement pst = conexao.prepareStatement("insert into aluno(nome_aluno,sobrenome,rg_aluno,data_nasc) values(?,?,?,?)");
   
          
               
              
                pst.setString(1, aluno.getNome());
                pst.setString(2, aluno.getSobrenome());
                pst.setString(3, aluno.getRg());
              pst.setString(4, aluno.getData());

                pst.execute();

                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
                pst.close();

           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "erro no Dao" +ex);
           }

             desconecta();

       }
    

        public ArrayList<AlunosModel> Listar(String nome){ 
            
            ArrayList<AlunosModel> listaa1= new ArrayList<>();
            conecta();

            try {
                pst = conexao.prepareStatement("select* from aluno where nome_aluno ilike'"+nome+ "%'");
                rs =pst.executeQuery();
                while(rs.next()){

                    AlunosModel a = new AlunosModel();
                    a.setNome(rs.getString("nome_aluno"));
                    a.setRg(rs.getString("rg_aluno")); 
                    a.setSobrenome(rs.getString("sobrenome")); 
                    a.setData(rs.getString("data_nasc"));

                    listaa1.add(a);

                    
                }



            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro no dao" +ex);
            }

          
           
            return listaa1;
            
     }

     
        public ArrayList<AlunosModel> ListarRG(String rg){ 
            
            ArrayList<AlunosModel> listaa= new ArrayList<>();
            conecta();
   
            try {
                pst = conexao.prepareStatement("select* from aluno where rg_aluno='"+rg+ "'");
                rs =pst.executeQuery();
                
             
                while(rs.next()){

                    AlunosModel a = new AlunosModel();
                    a.setNome(rs.getString("nome_aluno"));
                    a.setRg(rs.getString("rg_aluno")); 
                    a.setSobrenome(rs.getString("sobrenome")); 
                    a.setData(rs.getString("data_nasc"));
                
               listaa.add(a);
                }
                
                


            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro no dao" +ex);
            }
 
       
                     return listaa;
                 
                
          
            
     }
     


    }
