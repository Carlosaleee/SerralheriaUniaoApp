package cliente.Dao;

import administrativo.Beans.Cargo;
import cliente.Beans.Cliente;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class ClienteDao {
    
         private Conexao conexao;
        private Connection conn;

    public ClienteDao() {
        this.conexao = new Conexao();
        this.conn = (Connection) this.conexao.getConexao();
    }
    
    // Metodo Inserir
    
     public void inserir(Cliente cliente) {
    String sql = "INSERT INTO cliente (nome, cpf, telefone01, telefone02, rua, numero, balneario, cidade, estado) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getCpf());
        stmt.setString(3, cliente.getTelefone01());
        stmt.setString(4, cliente.getTelefone02());
        stmt.setString(5, cliente.getRua());
        stmt.setString(6, cliente.getNumero());
        stmt.setString(7, cliente.getBalneario());
        stmt.setString(8, cliente.getCidade());
        stmt.setString(9, cliente.getEstado());
        
        stmt.execute();
    } catch (SQLException e) {
        System.out.println("Erro ao inserir Cliente: " + e.getMessage());
    }
}
     
     //Metodo getCliente
     
     public Cliente getCliente (int idCliente){
    String sql = "SELECT * FROM cliente WHERE idCliente = ?";
      try {
                  
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          stmt.setInt(1, idCliente);
          ResultSet rs = stmt.executeQuery();
        
          Cliente cliente = new Cliente();
          
          rs.next(); 
          cliente.setIdCliente(idCliente);
          
          cliente.setNome(rs.getString("nome"));
          cliente.setCpf(rs.getString("cpf"));
          cliente.setTelefone01(rs.getString("telefone01"));
          
          cliente.setTelefone02(rs.getString("telefone02"));
          cliente.setRua(rs.getString("rua"));
          cliente.setNumero(rs.getString("numero"));
          
          cliente.setBalneario(rs.getString("balneario"));
          cliente.setCidade(rs.getString("cidade"));
          cliente.setEstado(rs.getString("estado"));
          
          return cliente;
          
          //tratando o erro, caso ele ocorra
      } catch (Exception e) {
          System.out.println("erro: " + e.getMessage());
          return null;
      }
  }
     
     // Metodo GetCliente - list
     
     public List<Cliente> getCliente(String nome) {
               
         String sql = "SELECT * FROM cliente WHERE nome LIKE ?";
                
                try {
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    
                    stmt.setString(1,"%" + nome + "%");
                    ResultSet rs = stmt.executeQuery();            
                    
                    List<Cliente> listaClientes = new ArrayList<>();
                    
                    while (rs.next()) { 
                        
                    Cliente cliente = new Cliente();
                        
                    cliente.setIdCliente(rs.getInt("idCliente"));
                    
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setTelefone01(rs.getString("Telefone01"));    
                    
                    cliente.setTelefone02(rs.getString("telefone02"));
                    cliente.setRua(rs.getString("rua"));
                    cliente.setNumero(rs.getString("numero"));
                   
                    cliente.setBalneario(rs.getString("balneario"));
                    cliente.setCidade(rs.getString("cidade"));
                    cliente.setEstado(rs.getString("estado"));
          
                    listaClientes.add(cliente);    
                    
                    }
                    return listaClientes;
                    
                    } catch (Exception e) {
                    return null;
                }
            }
     
     //Metodo Editar
     
     public void editar (Cliente cliente){
                //string sql com o código de update para o banco de dados
                String sql = "UPDATE cliente SET nome=?, cpf=?, telefone01=?, telefone02=?, rua=?, numero=?, balneario=?, cidade=?, estado=? WHERE idCliente=?";
                try {
                    //esse trecho é igual ao método inserir
                    PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
                   
                    
                    //Setando os parâmetros
                    stmt.setString(1, cliente.getNome());
                    stmt.setString(2, cliente.getCpf());
                    stmt.setString(3, cliente.getTelefone01());
                    stmt.setString(4, cliente.getTelefone02());
                    stmt.setString(5, cliente.getRua());
                    stmt.setString(6, cliente.getNumero());
                    stmt.setString(7, cliente.getBalneario());
                    stmt.setString(8, cliente.getCidade());
                    stmt.setString(9, cliente.getEstado());
                    stmt.setInt(10, cliente.getIdCliente());

        stmt.execute();
                    
                    
                    //tratando o erro, caso ele ocorra
                } catch (Exception e) {
                    System.out.println("Erro ao editar Cliente: " + e.getMessage());
                }
            }
     
     // Metodo GetNomeCliente
     
     public Cliente getNomeCliente (String nome){
                String sql = "SELECT * FROM cliente WHERE nome LIKE ?";
                try {        
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                  
                    stmt.setString(1, nome);
                
                    ResultSet rs = stmt.executeQuery();
              
                    Cliente cliente = new Cliente();
                    rs.next(); 
                    
                    cliente.setIdCliente(rs.getInt("idCliente"));
                    
                    cliente.setNome(nome);
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setTelefone01(rs.getString("Telefone01"));    
                    
                    cliente.setTelefone02(rs.getString("telefone02"));
                    cliente.setRua(rs.getString("rua"));
                    cliente.setNumero(rs.getString("numero"));
                   
                    cliente.setBalneario(rs.getString("balneario"));
                    cliente.setCidade(rs.getString("cidade"));
                    cliente.setEstado(rs.getString("estado"));
          
          return cliente;
                  
                  //tratando o erro, caso ele ocorra
                } catch (Exception e) {
                    System.out.println("erro: " + e.getMessage());
                    return null;
                }
            }
     
     // Metodo excluir
     
          public void excluir (int idCliente){
                
                String sql = "DELETE FROM cliente WHERE idCliente = ?";
                try {
                    //esse trecho é igual ao método editar e inserir
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    stmt.setInt(1, idCliente);
                    
                    //Executando a query
                    stmt.execute();
                    //tratando o erro, caso ele ocorra
                } catch (Exception e) {
                    System.out.println("Erro ao excluir empresa: " + e.getMessage());
                }
                
            }
          
          
     
}
