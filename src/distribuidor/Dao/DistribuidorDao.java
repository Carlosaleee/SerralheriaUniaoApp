package distribuidor.Dao;

import cliente.Beans.Cliente;
import conexao.Conexao;
import distribuidor.Beans.Distribuidor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class DistribuidorDao {
        
        private Conexao conexao;
        private Connection conn;

    public DistribuidorDao() {
        this.conexao = new Conexao();
        this.conn = (Connection) this.conexao.getConexao();
    }
    
    // Metodo Inserir
    
     public void inserir(Distribuidor distribuidor) {
    String sql = "INSERT INTO distribuidoraluminio (nomeEmpresa, cnpj, telefone01, telefone02, responsavel, setor, cidade) VALUES ( ?, ?, ?, ?, ?, ?, ? )";
   try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        
        stmt.setString(1, distribuidor.getNomeEmpresa());
        stmt.setString(2, distribuidor.getCnpj());
        stmt.setString(3, distribuidor.getTelefone01());
        stmt.setString(4, distribuidor.getTelefone02());
        stmt.setString(5, distribuidor.getResponsavel());
        stmt.setString(6, distribuidor.getSetor());
        stmt.setString(7, distribuidor.getCidade());
        
        stmt.execute();
    } catch (SQLException e) {
        System.out.println("Erro ao inserir Distribuidor: " + e.getMessage());
    }
}
     //Metodo getCliente
     
     public Distribuidor getDistribuidor(int idDistribuidor){
    String sql = "SELECT * FROM distribuidoraluminio WHERE idDistribuidorAluminio = ?";
      try {
                  
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          stmt.setInt(1, idDistribuidor);
          ResultSet rs = stmt.executeQuery();
        
          Distribuidor distribuidor = new Distribuidor();
          
          rs.next(); 
          distribuidor.setIdDistribuidor(idDistribuidor);
          
          distribuidor.setNomeEmpresa(rs.getString("nomeEmpresa"));
          distribuidor.setCnpj(rs.getString("cnpj"));
          distribuidor.setTelefone01(rs.getString("telefone01"));
          
          distribuidor.setTelefone02(rs.getString("telefone02"));
          distribuidor.setResponsavel(rs.getString("responsavel"));
          distribuidor.setSetor(rs.getString("setor"));
          
          distribuidor.setCidade(rs.getString("cidade"));
          
          
          return distribuidor;
          
          //tratando o erro, caso ele ocorra
      } catch (Exception e) {
          System.out.println("erro: " + e.getMessage());
          return null;
      }
  }
     
     // Metodo Pesquisa por nome
     
      public Distribuidor getNomeEmpresa (String nomeEmpresa){
                String sql = "SELECT * FROM distribuidoraluminio WHERE nomeEmpresa LIKE ?";
                try {        
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                  
                    stmt.setString(1, nomeEmpresa);
                
                    ResultSet rs = stmt.executeQuery();
              
                    Distribuidor distribuidor = new Distribuidor();
                    rs.next(); 
                    
                    distribuidor.setIdDistribuidor(rs.getInt("idDistribuidorAluminio"));
                    distribuidor.setNomeEmpresa(nomeEmpresa);
                    distribuidor.setCnpj(rs.getString("cnpj"));
                    distribuidor.setTelefone01(rs.getString("telefone01"));

                    distribuidor.setTelefone02(rs.getString("telefone02"));
                    distribuidor.setResponsavel(rs.getString("responsavel"));
                    distribuidor.setSetor(rs.getString("setor"));

                    distribuidor.setCidade(rs.getString("cidade"));    
                  
                    return distribuidor;
                  
                  //tratando o erro, caso ele ocorra
                } catch (SQLException e) {
                    System.out.println("erro: " + e.getMessage());
                    return null;
                }
            }
     // Metodo GetDistribuidor - list
     
     public List<Distribuidor> getDistribuidor() {
               
         String sql = "SELECT * FROM distribuidoraluminio ";
                
                try {
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();            
                    
                    List<Distribuidor> listaDistribuidor = new ArrayList<>();
                    
                    while (rs.next()) { 
                        
                    Distribuidor distribuidor = new Distribuidor();
                        
                    distribuidor.setIdDistribuidor(rs.getInt("idDistribuidorAluminio"));
                    
                    distribuidor.setNomeEmpresa(rs.getString("nomeEmpresa"));
                    distribuidor.setCnpj(rs.getString("cnpj"));
                    distribuidor.setTelefone01(rs.getString("Telefone01"));    
                    
                    distribuidor.setTelefone02(rs.getString("telefone02"));
                    distribuidor.setResponsavel(rs.getString("responsavel"));
                    distribuidor.setSetor(rs.getString("setor"));
                   
                    distribuidor.setCidade(rs.getString("cidade"));
                    
          
                    listaDistribuidor.add(distribuidor);    
                    
                    }
                    return listaDistribuidor;
                    
                    } catch (SQLException e) {
                    return null;
                }
            }
    
     //Metodo editar
    
     public void editar (Distribuidor distribuidor){
                //string sql com o código de update para o banco de dados
                String sql = "UPDATE distribuidoraluminio SET nomeEmpresa=?, cnpj=?, telefone01=?, telefone02=?, responsavel=?, setor=?, cidade=? WHERE idDistribuidorAluminio =?";
                try {
                    //esse trecho é igual ao método inserir
                    PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
                    //Setando os parâmetros
                   stmt.setString(1, distribuidor.getNomeEmpresa());
                   stmt.setString(2, distribuidor.getCnpj());
                   stmt.setString(3, distribuidor.getTelefone01());
                   stmt.setString(4, distribuidor.getTelefone02());
                   stmt.setString(5, distribuidor.getResponsavel());
                   stmt.setString(6, distribuidor.getSetor());
                   stmt.setString(7, distribuidor.getCidade());
                   
                   stmt.setInt(8, distribuidor.getIdDistribuidor());
                    //Executando a query
                    stmt.execute();
                    //tratando o erro, caso ele ocorra
                } catch (SQLException e) {
                    System.out.println("Erro ao editar Distribuidor: " + e.getMessage());
                }
            }
     
     
      
      //Metodo Excluir
      
      public void excluir (int idDistribuidor){
                
                String sql = "DELETE FROM distribuidoraluminio WHERE idDistribuidorAluminio = ?";
                try {
                    
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    stmt.setInt(1, idDistribuidor);
                    
                    //Executando a query
                    stmt.execute();
                    //tratando o erro, caso ele ocorra
                } catch (SQLException e) {
                    System.out.println("Erro ao excluir Distribuidor: " + e.getMessage());
                }
                
            }
    
}
