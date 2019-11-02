package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





public class Conexao_bd {
        public  String url = "jdbc:postgresql://localhost:5432/postgres";
        public String usuario = "postgres";
        private String driver="org.postgresql.Driver";
        public  String senha = "host";



        public ResultSet rs;
        public  Connection conexao;
        private  Statement stmt;

        public  boolean conecta (){
            System.setProperty("jdbc.Drivers", driver);
            try {
                conexao = DriverManager.getConnection(url, usuario, senha);
return true;

            }
           catch (SQLException e) {
                   // JOptionPane.showMessageDialog(null, "nao deu certo a conexao");
          return false;
                }
        }


        public void executaSql(String sql){
            try {
                stmt = conexao.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
                rs = stmt.executeQuery(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Conexao_bd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public void desconecta(){

            try {
                conexao.close();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "nao encerrou");
            }
        }



    }

    








