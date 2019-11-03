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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author Willian
 */
public class AlunoDao  {
    
    Conexao_bd c = new Conexao_bd();
    PreparedStatement pst =null;
    private AlunosModel aluno;

    public  void InserirAluno(AlunosModel aluno){
        c.conecta();
    
        try {
              //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
               PreparedStatement pst = c.conexao.prepareStatement("insert into aluno(nome_aluno,sobrenome,rg_aluno,data_nasc) values(?,?,?,?)");
   
          
               
              
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

             c.desconecta();

       }
    
   
    public ArrayList<AlunosModel> listarAlunos(String al){
            try {
                c.conecta();
                
               ArrayList<AlunosModel> lista = new ArrayList<>();
             PreparedStatement pst = c.conexao.prepareStatement("select nome_aluno,sobrenome, rg_aluno from aluno where rg_aluno like'%"+al+"%'");
              pst.executeQuery();
               c.rs.first();
               
               while(c.rs.next()){
                   aluno.setNome(c.rs.getString("nome_aluno"));
                     aluno.setSobrenome(c.rs.getString("sobrenome"));
                    aluno.setRg(c.rs.getString("rg_aluno"));
                    lista.add(aluno);
               }
             
               return lista;
             
         } catch (Exception e) {
         }
         return null;

       }
    
}
