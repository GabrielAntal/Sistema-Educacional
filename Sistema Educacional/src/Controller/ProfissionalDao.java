
package Controller;

import Model.Conexao_bd;
import Model.ProfessorModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author Gabriel
 */
public class ProfissionalDao {
    
    Conexao_bd c = new Conexao_bd();
    
    
    
    
    public void Inserir_Profissional (ProfessorModel prof ){
        c.conecta();
        
        try {
            PreparedStatement pst = c.conexao.prepareStatement("INSERT INTO PROFISSIONAL(nome_prof, cpf, login, senha, perfil)"
                    + " values(?,?,?,?,?); ");
                    pst.setString(1, prof.getNome());
                    pst.setString(2, prof.getCpf());
                    pst.setString(3, prof.getLogin());
                    pst.setString(4, prof.getSenha());
                    pst.setString(5, prof.getPerfil());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Cadastrado!"); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Verificar"+e);
            
        }
         
    } 
        
        public void mostrar_prof(String nomeProf){
            c.conecta();
            
            try {
                PreparedStatement pst = c.conexao.prepareStatement("Select nome, cpf, login, senha, perfil from Profissional where nome_prof like ? and perfil like 'Professor%'");
                pst.setString(1, "'%"+nomeProf+"%'");
                pst.executeQuery();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verificar procura_prof "+e);
            }
            
        }
        
        
        
        
       
    
    
    
    
}
