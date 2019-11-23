
package Controller;

import Model.Conexao_bd;
import Model.ProfissionalModel;
import Views.Professores;


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
    
    
    
    
    
    public void Inserir_Profissional (ProfissionalModel prof ){
        conecta();
        
        try {
            PreparedStatement pst = conexao.prepareStatement("INSERT INTO PROFISSIONAL(cod_prof,nome_prof, cpf, login, senha, perfil)"
                    + " values(default,?,?,?,?,?); ");
                   pst.setString(1, prof.getNome());
                  pst.setString(2, prof.getCpf());
                   pst.setString(3, prof.getLogin());
                    pst.setString(4, prof.getSenha());
                    pst.setString(5, prof.getPerfil());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Cadastrado!"); 
                    pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Verificar"+e);
            
        } 
         
    } 
        
        public ArrayList<ProfissionalModel> mostrar_prof(String nomeProf){
            
            ArrayList<ProfissionalModel> list = new ArrayList<>();
            conecta();
         
            try {
                pst = conexao.prepareStatement("Select * from profissional where nome_prof ilike'"+ 
                        nomeProf+"%'");
                rs =pst.executeQuery();
                ProfissionalModel profissional = new ProfissionalModel();
                while(rs.next()){
                     profissional.setCod(rs.getInt("cod_prof"));
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
