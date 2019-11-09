
package Controller;

import Model.Conexao_bd;
import Model.ProfessorModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Gabriel
 */
public class ProfissionalDao {
    
    Conexao_bd c = new Conexao_bd();
    
    private ProfessorModel profissional;
    
    
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
        
        public ArrayList<ProfessorModel> mostrar_prof(String nomeProf){
            c.conecta();
            ArrayList<ProfessorModel> list = new ArrayList<>();
            try {
                PreparedStatement pst = c.conexao.prepareStatement("Select nome_prof, cpf, login, senha, perfil from Profissional where nome_prof like ? and perfil like 'Professor%'");
                pst.setString(1, "'%"+nomeProf+"%'");
                pst.executeQuery();
                
                while(c.rs.next()){
                    profissional.setNome(c.rs.getString("nome_aluno"));
                    profissional.setCpf(c.rs.getString("cpf"));
                    profissional.setLogin(c.rs.getString("login"));
                    profissional.setSenha(c.rs.getString("senha"));
                    profissional.setPerfil(c.rs.getString("perfil"));
                    list.add(profissional);
                }
                return list;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verificar procura_prof "+e);
                return null;
            }
            
        }
        
        
        
        
       
    
    
    
    
}
