package financeiro.Dao;

import conexao.Conexao;
import financeiro.Bens.Produto;
import financeiro.Bens.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import  java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

    public class VendaDao {
        
         private Conexao conexao;
        private Connection conn;

    public VendaDao() {
        this.conexao = new Conexao();
        this.conn = (Connection) this.conexao.getConexao();
    }
    
    // Metodo Inserir
    
    public void inserir(Venda venda) {
        
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        
    String sql = "INSERT INTO venda (dataVenda, dataEntrega, datapagamento, tipoPagamento, numeroCartao, numeroParcelas, clienteId, funcionarioId, valorTotal) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        
        stmt.setString(1, sdf.format(venda.getDataVenda()));
        stmt.setString(2, sdf.format(venda.getDataEntrega()));
        stmt.setString(3, sdf.format(venda.getDataPagamento()));
        stmt.setString(4, venda.getTipoPagamento());
        stmt.setString(5, venda.getNumeroCartao());
        stmt.setInt(6, venda.getNumeroParcelas());
        stmt.setInt(7, venda.getClienteId());
        stmt.setInt(8, venda.getFuncionarioId());
        stmt.setString(9,venda.getValorTotal());
        
        stmt.execute();
    } catch (SQLException e) {
        System.out.println("Erro ao inserir Venda: " + e.getMessage());
    }
}
   
    // Metodo GetVenda
    
     public Venda getVenda (int idVenda){
      String sql = "SELECT * FROM venda WHERE idVenda = ?";
      try {
                  
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          stmt.setInt(1, idVenda);
          ResultSet rs = stmt.executeQuery();
        
         Venda venda = new Venda();
          
          rs.next(); 
          
          venda.setIdVenda(idVenda);
          
          venda.setDataVenda(rs.getDate("dataVenda"));
          venda.setDataEntrega(rs.getDate("dataEntrega"));
          venda.setDataPagamento(rs.getDate("dataPagamento"));
         
          venda.setTipoPagamento(rs.getString("tipoPagamento"));
          venda.setNumeroCartao(rs.getString("numeroCartao"));
          venda.setNumeroParcelas(rs.getInt("numeroParcelas"));
          
          venda.setClienteId(rs.getInt("clienteId"));
          venda.setFuncionarioId(rs.getInt("funcionarioId"));
          venda.setValorTotal(rs.getString("valorTotal"));
          
          
          return venda;
          
          //tratando o erro, caso ele ocorra
      } catch (Exception e) {
          System.out.println("erro: " + e.getMessage());
          return null;
      }
  }
     
     // Metodo Get Venda - list
     
        public List<Venda> getVenda(String idVenda ) {
             String sql = "SELECT * FROM venda WHERE idVenda LIKE ?"; //LIKE nos permite pesquisar por partes de um nome, ao invés de pesquisarmos por todo nome
                

            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1,"%" + idVenda + "%");
                ResultSet rs = stmt.executeQuery();

                List<Venda> listaVendas = new ArrayList<>();

                while (rs.next()) { //.next retorna verdadeiro caso exista uma próxima posição dentro do array
                    
                    Venda venda = new Venda();
                    
                    venda.setIdVenda(rs.getInt("idVenda"));
                    venda.setDataVenda(rs.getDate("dataVenda"));
                    venda.setDataEntrega(rs.getDate("dataEntrega"));
                    venda.setDataPagamento(rs.getDate("dataPagamento"));

                    venda.setTipoPagamento(rs.getString("tipoPagamento"));
                    venda.setNumeroCartao(rs.getString("numeroCartao"));
                    venda.setNumeroParcelas(rs.getInt("numeroParcelas"));

                    venda.setClienteId(rs.getInt("clienteId"));
                    venda.setFuncionarioId(rs.getInt("funcionarioId"));
                    venda.setValorTotal(rs.getString("valorTotal"));

                    listaVendas.add(venda);
                }
                return listaVendas;

                //Se o método entrar no "Catch" quer dizer que não encontrou nenhuma empresa, então damos um "return null"
            } catch (SQLException e) {
                return null;
            }
        }
     
     // Metodo Editar
     
     public void editar (Venda venda){
         
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                //string sql com o código de update para o banco de dados
                String sql = "UPDATE venda SET dataVenda=?, dataEntrega=?, dataPagamento=?, tipoPagamento=?, numeroCartao=?, numeroParcelas=?, clienteId=?, funcionarioId=?, valorTotal=? WHERE idVenda=?";
                try {
                    //esse trecho é igual ao método inserir
                    PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
                    //Setando os parâmetros
                    
                    
                    stmt.setString(1, sdf.format(venda.getDataVenda()));
                    stmt.setString(2, sdf.format(venda.getDataEntrega()));
                    stmt.setString(3, sdf.format(venda.getDataPagamento()));
                    stmt.setString(4, venda.getTipoPagamento());
                    stmt.setString(5, venda.getNumeroCartao());
                    stmt.setInt(6, venda.getNumeroParcelas());
                    stmt.setInt(7, venda.getClienteId());
                    stmt.setInt(8, venda.getFuncionarioId());
                    stmt.setString(9,venda.getValorTotal());
                    
                    stmt.setInt(10, venda.getIdVenda());
                    //Executando a query
                    stmt.execute();
                    //tratando o erro, caso ele ocorra
                } catch (Exception e) {
                    System.out.println("Erro ao editar empresa: " + e.getMessage());
                }
            }
     
     //Metodo Excluir
     
     public void excluir (int idVenda){
                
                String sql = "DELETE FROM venda WHERE idVenda = ?";
                try {
                    //esse trecho é igual ao método editar e inserir
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    stmt.setInt(1, idVenda);
                    
                    //Executando a query
                    stmt.execute();
                    //tratando o erro, caso ele ocorra
                } catch (Exception e) {
                    System.out.println("Erro ao excluir Venda: " + e.getMessage());
                }
                
            }
       
}
