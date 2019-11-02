/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AlunosModel;
import Model.Conexao_bd;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Willian
 */
public class AlunoDao extends AlunosModel {
    
    Conexao_bd c = new Conexao_bd();


    public void InserirAluno(AlunosModel aluno){
        c.conecta();
     
        try {
           
            PreparedStatement pst = c.conexao.prepareStatement("insert into aluno(nome_aluno,sobrenome,rg_aluno) values(?,?,?)");
            // pst.setString(1, "default");
             pst.setString(1, aluno.getNome());
               pst.setString(2, aluno.getSobrenome());
                 pst.setString(3, aluno.getRg());
                 pst.execute();
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
                c.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro no Dao" +ex);
        }
    }
    
}
