
package conexao.banco;

import java.sql.Connection;
import java.sql.SQLException;


public class testaConexao {
    
    public static void main(String[] args) throws SQLException{
        
        Connection conexao = CriaConexao.getConexao();
        conexao.close();
        System.out.println("Conexão encerrada");
    }
    
}
