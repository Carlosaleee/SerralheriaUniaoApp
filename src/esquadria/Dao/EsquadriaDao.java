package esquadria.Dao;

import cliente.Beans.Cliente;
import conexao.Conexao;
import esquadria.Beans.Esquadria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class EsquadriaDao {
        
        private Conexao conexao;
        private Connection conn;

    public EsquadriaDao() {
        this.conexao = new Conexao();
        this.conn = (Connection) this.conexao.getConexao();
    }
    
        
    // Metodo Inserir
    
     public void inserir(Esquadria esquadria) {
    String sql = "INSERT INTO esquadria (nomeEsquadria, descricao, valormetroQuadrado, distribuidorAluminioId) VALUES ( ?, ?, ?, ? )";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        
        stmt.setString(1, esquadria.getNomeEsquadria());
        stmt.setString(2, esquadria.getDescricao());
        stmt.setString(3, esquadria.getPreco());
        stmt.setString(4, esquadria.getDistribuidorId());
        
        
        stmt.execute();
    } catch (SQLException e) {
        System.out.println("Erro ao inserir Esquadria: " + e.getMessage());
    }
} 
     
      //Metodo getCliente
     
     public Esquadria getEsquadria (int idEsquadria){
    String sql = "SELECT * FROM esquadria WHERE idEsquadria = ?";
      try {
                  
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          stmt.setInt(1, idEsquadria);
          ResultSet rs = stmt.executeQuery();
        
          Esquadria esquadria = new Esquadria();
          
          rs.next(); 
          esquadria.setIdEsquadria(idEsquadria);
          
          esquadria.setNomeEsquadria(rs.getString("nomeEsquadria"));
          esquadria.setDescricao(rs.getString("descricao"));
          esquadria.setPreco(rs.getString("valormetroQuadrado"));
          esquadria.setDistribuidorId(rs.getString("distribuidorAluminioId"));
          
          
          return esquadria;
          
          //tratando o erro, caso ele ocorra
      } catch (SQLException e) {
          System.out.println("erro: " + e.getMessage());
          return null;
      }
  }
     
     // Metodo GetCliente - List
     
     public List<Esquadria> getEsquadria(String nomeEsquadria) {
                 String sql = "SELECT * FROM esquadria WHERE nomeEsquadria LIKE ?";
                
                try {
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    stmt.setString(1,"%" + nomeEsquadria + "%");
                    ResultSet rs = stmt.executeQuery();            
                    
                    List<Esquadria> listaEsquadrias = new ArrayList<>();
                    
                    while (rs.next()) { //.next retorna verdadeiro caso exista uma próxima posição dentro do array
                        Esquadria esquadria = new Esquadria();
                        
                         esquadria.setIdEsquadria(rs.getInt("idEsquadria"));
                         esquadria.setNomeEsquadria(rs.getString("nomeEsquadria"));
                         esquadria.setDescricao(rs.getString("descricao"));
                         esquadria.setPreco(rs.getString("valormetroQuadrado"));
                         esquadria.setDistribuidorId(rs.getString("distribuidorAluminioId"));
                        
                        listaEsquadrias.add(esquadria);    
                    }
                    return listaEsquadrias;
                    
                    //Se o método entrar no "Catch" quer dizer que não encontrou nenhuma empresa, então damos um "return null"
                } catch (Exception e) {
                    return null;
                }
            }
          
     //Metodo Editar
     
     public void editar (Esquadria esquadria){
                //string sql com o código de update para o banco de dados
                String sql = "UPDATE esquadria SET nomeEsquadria=?, descricao=?, valormetroQuadrado=?, distribuidorAluminioId=? WHERE idEsquadria=?";
                try {
                    //esse trecho é igual ao método inserir
                    PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
                   
                    
                    //Setando os parâmetros
                    stmt.setString(1, esquadria.getNomeEsquadria());
                    stmt.setString(2, esquadria.getDescricao());
                    stmt.setString(3, esquadria.getPreco());
                    stmt.setString(4, esquadria.getDistribuidorId());
                    
                    stmt.setInt(5, esquadria.getIdEsquadria());

                     stmt.execute();
                    
                    
                    //tratando o erro, caso ele ocorra
                } catch (SQLException e) {
                    System.out.println("Erro ao editar Cliente: " + e.getMessage());
                }
            }
     
    //Metodo prcurar empresa por nome
     
     public Esquadria getPesquisarNome (String nomeEsquadria){
                String sql = "SELECT * FROM esquadria WHERE nomeEsquadria LIKE ?";
                try {        
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                  
                    stmt.setString(1, nomeEsquadria);
                
                    ResultSet rs = stmt.executeQuery();
              
                    Esquadria esquadria = new Esquadria();
                    rs.next(); 
                    
                    esquadria.setIdEsquadria(rs.getInt("idEsquadria"));
                    
                    esquadria.setNomeEsquadria(nomeEsquadria);
                    esquadria.setNomeEsquadria(rs.getString("nomeEsquadria"));
                    esquadria.setDescricao(rs.getString("descricao"));    
                    esquadria.setPreco(rs.getString("valormetroQuadrado"));
                    esquadria.setDistribuidorId(rs.getString("distribuidorAluminioId"));    
                  
                    
                    return esquadria;
                  
                  //tratando o erro, caso ele ocorra
                } catch (SQLException e) {
                    System.out.println("erro: " + e.getMessage());
                    return null;
                }
            }
     
     // Metodo excluir
     
      public void excluir (int idEsquadria){
                
                String sql = "DELETE FROM esquadria WHERE idEsquadria = ?";
                try {
                    
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    stmt.setInt(1, idEsquadria);
                    
                    //Executando a query
                    stmt.execute();
                    //tratando o erro, caso ele ocorra
                } catch (SQLException e) {
                    System.out.println("Erro ao excluir Esquadria: " + e.getMessage());
                }
                
            }
    
}
