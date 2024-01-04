/**
* @author Carlos Alexandre
* @version 1.0
* @since Primeira versão
*/

package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

/*  Classe Conexao.java, que conterá os atributos
*   e métodos que poderão ser utilizados na conexão com o banco de dados.
*/
    
    public Connection getConexao() {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/projetoIntegrador", // linha de conexao
                    "root", // usuario do mysql
                    "123456"// senha do mysql
            );
            return conn;

        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }

    }

}


