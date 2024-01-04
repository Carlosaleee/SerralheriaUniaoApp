package administrativo.Dao;

import administrativo.Beans.Cargo;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

    public class CargosDao {
    
        private Conexao conexao;
        private Connection conn;

    public CargosDao() {
        this.conexao = new Conexao();
        this.conn = (Connection) this.conexao.getConexao();
    }
    
    // Metodo Inserir
    
     public void inserir(Cargo cargo) {
    String sql = "INSERT INTO cargo(cargo, descricao, salario) VALUES (?, ?, ?)";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, cargo.getNomeCargo());
        stmt.setString(2, cargo.getDescricao());
        stmt.setString(3, cargo.getSalario());
        
        stmt.execute();
    } catch (SQLException e) {
        System.out.println("Erro ao inserir Cargo: " + e.getMessage());
    }
}

     //Metodo getCargo
     
     public Cargo getCargo (int idCargo){
      String sql = "SELECT * FROM cargo WHERE idCargo = ?";
      try {
                  
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          stmt.setInt(1, idCargo);
          ResultSet rs = stmt.executeQuery();
        
          Cargo cargo = new Cargo();
          
          rs.next(); 
          cargo.setIdCargo(idCargo);
          cargo.setNomeCargo(rs.getString("cargo"));
          cargo.setDescricao(rs.getString("descricao"));
          cargo.setSalario(rs.getString("salario"));
          
          return cargo;
          
          //tratando o erro, caso ele ocorra
      } catch (Exception e) {
          System.out.println("erro: " + e.getMessage());
          return null;
      }
  }
     
     //Metodo Editar
     
     public void editar (Cargo cargo){
                //string sql com o código de update para o banco de dados
                String sql = "UPDATE cargo SET cargo=?, descricao=?, salario=? WHERE idCargo=?";
                try {
                    //esse trecho é igual ao método inserir
                    PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
                    //Setando os parâmetros
                    stmt.setString(1, cargo.getNomeCargo());
                    stmt.setString(2, cargo.getDescricao());
                    stmt.setString(3, cargo.getSalario());
                    stmt.setInt(4, cargo.getIdCargo());
                    //Executando a query
                    stmt.execute();
                    //tratando o erro, caso ele ocorra
                } catch (Exception e) {
                    System.out.println("Erro ao editar empresa: " + e.getMessage());
                }
            }
     
     // metodo getNomeCargo
     
     public Cargo getNomeCargo (String nomeCargo){
                String sql = "SELECT * FROM cargo WHERE cargo LIKE ?";
                try {        
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                  
                    stmt.setString(1, nomeCargo);
                
                    ResultSet rs = stmt.executeQuery();
              
                    Cargo cargo = new Cargo();
                    rs.next(); 
                    
                    cargo.setIdCargo(rs.getInt("idCargo"));
                    cargo.setNomeCargo(nomeCargo);
                    cargo.setNomeCargo(rs.getString("cargo"));
                    cargo.setDescricao(rs.getString("descricao"));
                    cargo.setSalario(rs.getString("salario"));
                  
                    return cargo;
                  
                  //tratando o erro, caso ele ocorra
                } catch (Exception e) {
                    System.out.println("erro: " + e.getMessage());
                    return null;
                }
            }
     //Metodo Excluir
     
     public void excluir (int idCargo){
                
                String sql = "DELETE FROM cargo WHERE idCargo = ?";
                try {
                    //esse trecho é igual ao método editar e inserir
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    stmt.setInt(1, idCargo);
                    
                    //Executando a query
                    stmt.execute();
                    //tratando o erro, caso ele ocorra
                } catch (Exception e) {
                    System.out.println("Erro ao excluir empresa: " + e.getMessage());
                }
                
            }
     //Lista Empresas
     
      public List<Cargo> getCargo() {
                String sql = "SELECT * FROM cargo";
                
                try {
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();            
                    
                    List<Cargo> listaCargos = new ArrayList<>();
                    
                    while (rs.next()) { 
                        Cargo cargo = new Cargo();
                        
                        cargo.setIdCargo(rs.getInt("idCargo"));
                        cargo.setNomeCargo(rs.getString("cargo"));
                        cargo.setDescricao(rs.getString("descricao"));
                        cargo.setSalario(rs.getString("salario"));
                        
                        listaCargos.add(cargo);    
                    }
                    return listaCargos;
                    
                    //Se o método entrar no "Catch" quer dizer que não encontrou nenhuma empresa, então damos um "return null"
                } catch (Exception e) {
                    return null;
                }
            }
     
     
        
}
