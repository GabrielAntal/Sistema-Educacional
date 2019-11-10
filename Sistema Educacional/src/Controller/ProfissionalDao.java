
package Controller;

import Model.Conexao_bd;
import Model.ProfessorModel;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Gabriel
 */
public class ProfissionalDao extends Conexao_bd{
    
   PreparedStatement pst;
    
    
    
    
    
    public void Inserir_Profissional (ProfessorModel prof ){
        conecta();
        
        try {
            PreparedStatement pst = conexao.prepareStatement("INSERT INTO PROFISSIONAL(nome_prof, cpf, login, senha, perfil)"
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
            
            ArrayList<ProfessorModel> list = new ArrayList<>();
            conecta();
         
            try {
                pst = conexao.prepareStatement("Select * from profissional where nome_prof ilike'"+ 
                        nomeProf+"%'");
                rs =pst.executeQuery();
                ProfessorModel profissional = new ProfessorModel();
                while(rs.next()){
                    profissional.setNome(rs.getString("nome_prof"));
                    profissional.setCpf(rs.getString("cpf"));
                    profissional.setLogin(rs.getString("login"));
                    profissional.setSenha(rs.getString("senha"));
                    profissional.setPerfil(rs.getString("perfil"));
                    
                    list.add(profissional);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verificar mostra_prof "+e);
                
            }
            
            return list;
            
        }
        
        
        
        
       
    
    
    
    
}
