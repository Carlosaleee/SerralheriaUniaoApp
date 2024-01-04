package financeiro.Dao;

import cliente.Beans.Cliente;
import conexao.Conexao;
import financeiro.Bens.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

     public class ProdutoDao {
         
          private Conexao conexao;
        private Connection conn;

    public ProdutoDao() {
        this.conexao = new Conexao();
        this.conn = (Connection) this.conexao.getConexao();
    }
    
    // Metodo Inserir
    
   
    
     public void inserir(Produto produto) {
    String sql = "INSERT INTO itemvenda (nomeEsquadria, quantidade, valorMetroQuadrado, altura, largura, valorUnitario, vendaId, esquadriaId, subTotal) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        
        stmt.setString(1, produto.getProduto());
        stmt.setString(2, produto.getQuantidade());
        stmt.setString(3, produto.getValorMetroQuadrado());
        stmt.setString(4, produto.getAltura());
        stmt.setString(5, produto.getLargura());
        stmt.setString(6, produto.getValorUnitario());
        stmt.setString(7, produto.getVendaId());
        stmt.setString(8, produto.getEsquadriaId());
        stmt.setString(9, produto.getSubTotal());
        
        stmt.execute();
    } catch (SQLException e) {
        System.out.println("Erro ao inserir Produto: " + e.getMessage());
    }
}
        
       public List<Produto> getProduto(String vendaId) {
                String sql = "SELECT * FROM itemvenda  WHERE vendaId LIKE ?"; 
                
                
                try {
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    stmt.setString(1,"%" + vendaId + "%");
                    
                    ResultSet rs = stmt.executeQuery();            
                    
                    List<Produto> listaProdutos = new ArrayList<>();
                    
                    while (rs.next()) { //.next retorna verdadeiro caso exista uma próxima posição dentro do array
                        Produto produto = new Produto();
                        
                        produto.setProduto(rs.getString("nomeEsquadria"));
                        produto.setQuantidade(rs.getString("quantidade"));
                        produto.setValorMetroQuadrado(rs.getString("valorMetroQuadrado"));
                        
                        produto.setAltura(rs.getString("altura"));
                        produto.setLargura(rs.getString("largura"));
                        produto.setValorUnitario(rs.getString("valorUnitario"));
                       
                        produto.setVendaId(rs.getString("vendaId"));
                        produto.setEsquadriaId(rs.getString("esquadriaId"));
                        produto.setSubTotal(rs.getString("subTotal"));
                        
                        
                        listaProdutos.add(produto);    
                    }
                    return listaProdutos;
                    
                    //Se o método entrar no "Catch" quer dizer que não encontrou nenhuma empresa, então damos um "return null"
                } catch (Exception e) {
                    return null;
                }
            }
}
