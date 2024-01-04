package administrativo.Dao;

import administrativo.Beans.Cargo;
import administrativo.Beans.Funcionario;
import conexao.Conexao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

    public class FuncionariosDao {
        
        private Conexao conexao;
        private Connection conn;

    public FuncionariosDao() {
        
        this.conexao = new Conexao();
        this.conn = (Connection) this.conexao.getConexao();
    }
    
     // Metodo Inserir
    
     public void inserir(Funcionario funcionario) {
    String sql = "INSERT INTO funcionario (nome, telefone01, telefone02, dataAdmissao, dataDemissao, numcarteiraTrabalho, rg, rua, numero, bairro, cidade, cargoId, usuarioId ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    try {
        
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        
        stmt.setString(1, funcionario.getNome());
        stmt.setString(2, funcionario.getTelefone01());
        stmt.setString(3, funcionario.getTelefone02());
        
        stmt.setString(4, funcionario.getDataAdmissao());
        stmt.setString(5, funcionario.getDataDemissao());
        stmt.setString(6, funcionario.getNumcarteiraTrabalho());
       
        stmt.setString(7, funcionario.getRg());
        stmt.setString(8, funcionario.getRua());
        stmt.setString(9, funcionario.getNumero());
        
        stmt.setString(10, funcionario.getBalneario());
        stmt.setString(11, funcionario.getCidade());
        stmt.setString(12, funcionario.getCargoId());
        
        stmt.setString(13, funcionario.getUsuarioId());
        stmt.execute();
        
    } catch (SQLException e) {
        System.out.println("Erro ao inserir Funcionario: " + e.getMessage());
    }
}
     
     // Metodo GetFuncionario
    
     public Funcionario getFuncionario (int idFuncionario){
     
         String sql = "SELECT * FROM funcionario WHERE idFuncionario =? ";
      try {
                  
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          stmt.setInt(1, idFuncionario);
          ResultSet rs = stmt.executeQuery();
        
          Funcionario funcionario = new Funcionario();
          
          rs.next(); 
          
          funcionario.setIdFuncionario(idFuncionario);
          
          funcionario.setNome(rs.getString("nome"));
          funcionario.setTelefone01(rs.getString("telefone01"));    
          funcionario.setTelefone02(rs.getString("telefone02"));
          
          funcionario.setDataAdmissao(rs.getString("dataAdmissao"));
          funcionario.setDataDemissao(rs.getString("dataDemissao"));    
          funcionario.setNumcarteiraTrabalho(rs.getString("numcarteiraTrabalho"));
          
          funcionario.setRg(rs.getString("rg"));
          funcionario.setRua(rs.getString("rua"));    
          funcionario.setNumero(rs.getString("numero"));
          
          funcionario.setBalneario(rs.getString("bairro"));
          funcionario.setCidade(rs.getString("cidade"));    
          
          funcionario.setCargoId(rs.getString("cargoId"));
          funcionario.setUsuarioId(rs.getString("usuarioId"));
          
          return funcionario;
          
          //tratando o erro, caso ele ocorra
      } catch (Exception e) {
          System.out.println("erro: " + e.getMessage());
          return null;
      }
  }
     
     // Metodo GeTFuncionario - list
     
     public List<Funcionario> getFuncionario(String nome) {
                 String sql = "SELECT * FROM funcionario WHERE nome LIKE ?";                
                
                try {
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    
                    stmt.setString(1,"%" + nome + "%"); 
                    
                    ResultSet rs = stmt.executeQuery();            
                    
                    List<Funcionario> listaFuncionarios = new ArrayList<>();
                    
                    while (rs.next()) { //.next retorna verdadeiro caso exista uma próxima posição dentro do array
                       Funcionario funcionario = new Funcionario();
                        
                    funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                    funcionario.setNome(rs.getString("nome"));
                    funcionario.setTelefone01(rs.getString("telefone01"));
                    funcionario.setTelefone02(rs.getString("telefone02"));
                    funcionario.setDataAdmissao(rs.getString("dataAdmissao"));  
                    funcionario.setDataDemissao(rs.getString("dataDemissao"));
                    funcionario.setNumcarteiraTrabalho(rs.getString("numcarteiraTrabalho"));
                    funcionario.setRg(rs.getString("rg"));
                    funcionario.setRua(rs.getString("rua"));
                    funcionario.setNumero(rs.getString("numero"));
                    funcionario.setBalneario(rs.getString("bairro"));
                    funcionario.setCidade(rs.getString("cidade"));
                    funcionario.setCargoId(rs.getString("cargoId"));
                    funcionario.setUsuarioId(rs.getString("usuarioId"));
                        
                        listaFuncionarios.add(funcionario);    
                    }
                    return listaFuncionarios;
                    
                    //Se o método entrar no "Catch" quer dizer que não encontrou nenhuma empresa, então damos um "return null"
                } catch (Exception e) {
                    return null;
                }
            }
     
     //Metodo Editar
     
    public void editar (Funcionario funcionario){
               //string sql com o código de update para o banco de dados
        String sql = "UPDATE funcionario SET nome=?, dataAdmissao=?, dataDemissao=?, numcarteiraTrabalho=?, rg=?, rua=?, numero=?, bairro=?, cidade=?, cargoId=?, usuarioId=?, telefone01=?, telefone02=?  WHERE idFuncionario=? ";
        try {
            //esse trecho é igual ao método inserir
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            //Setando os parâmetros
            stmt.setString(1, funcionario.getNome());
            

            stmt.setString(2, funcionario.getDataAdmissao());
            stmt.setString(3, funcionario.getDataDemissao());
            stmt.setString(4, funcionario.getNumcarteiraTrabalho());

            stmt.setString(5, funcionario.getRg());
            stmt.setString(6, funcionario.getRua());
            stmt.setString(7, funcionario.getNumero());

            stmt.setString(8, funcionario.getBalneario());
            stmt.setString(9, funcionario.getCidade());
            stmt.setString(10, funcionario.getCargoId());

            stmt.setString(11, funcionario.getUsuarioId());
            stmt.setString(12, funcionario.getTelefone01());
            stmt.setString(13, funcionario.getTelefone02());
            
            stmt.setInt(14, funcionario.getIdFuncionario());
            
            stmt.execute();
            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("Erro ao Editar Funcionario: " + e.getMessage());
        }
    }
    
    public Funcionario getFuncionarioNome (String nome){
                String sql = "SELECT * FROM funcionario WHERE nome LIKE ?";
                try {        
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                  
                    stmt.setString(1, nome);
                
                    ResultSet rs = stmt.executeQuery();
              
                    Funcionario funcionario = new Funcionario();
                    rs.next(); 
                    
                    funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                    funcionario.setNome(nome);
                    funcionario.setTelefone01(rs.getString("telefone01"));
                    funcionario.setTelefone02(rs.getString("telefone02"));
                    funcionario.setDataAdmissao(rs.getString("dataAdmissao"));  
                    funcionario.setDataDemissao(rs.getString("dataDemissao"));
                    funcionario.setNumcarteiraTrabalho(rs.getString("numcarteiraTrabalho"));
                    funcionario.setRg(rs.getString("rg"));
                    funcionario.setRua(rs.getString("rua"));
                    funcionario.setNumero(rs.getString("numero"));
                    funcionario.setBalneario(rs.getString("bairro"));
                    funcionario.setCidade(rs.getString("cidade"));
                    funcionario.setCargoId(rs.getString("cargoId"));
                    funcionario.setUsuarioId(rs.getString("usuarioId"));
                    
                  
                    return funcionario;
                  
                  //tratando o erro, caso ele ocorra
                } catch (Exception e) {
                    System.out.println("erro: " + e.getMessage());
                    return null;
                }
            }
    
    public void excluir (int idFuncionario){
                
                String sql = "DELETE FROM funcionario WHERE idFuncionario = ?";
                try {
                    //esse trecho é igual ao método editar e inserir
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    stmt.setInt(1, idFuncionario);
                    
                    //Executando a query
                    stmt.execute();
                    //tratando o erro, caso ele ocorra
                } catch (Exception e) {
                    System.out.println("Erro ao excluir Funcionario: " + e.getMessage());
                }
                
            }
    
   

}


    
  /*  private void salvarRegistrosEmArquivo(String nomeArquivo) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
        
        writer.write("idFuncionario, Nome, Telefone 01, Telefone 02, Data Admissao, Data Demissao, Carteira Trabalho, Registro Geral, Rua, Numero, Balneario, Cidade, UsuarioId, cargoId");
        writer.newLine();
         for (Funcionario funcionario : listaFuncionarios) {
            writer.write(funcionario.getIdFuncionario() 
                    + "," + funcionario.getNome() + ","
                    + "," + funcionario.getTelefone01() + ","
                    + "," + funcionario.getTelefone02() + ","
                    + "," + funcionario.getDataAdmissao() + ","
                    + "," + funcionario.getDataDemissao() + ","
                    + "," + funcionario.getNumcarteiraTrabalho() + ","
                    + "," + funcionario.getRg() + ","
                    + "," + funcionario.getRua() + ","
                    + "," + funcionario.getNumero() + ","
                    + "," + funcionario.getBalneario() + ","
                    + "," + funcionario.getCidade() + ","
                    + "," + funcionario.getUsuarioId() + ","
                    + "," + funcionario.getCargoId() 
            );
            writer.newLine();
        }
        JOptionPane.showMessageDialog(null, "Registros salvos com sucesso em " + nomeArquivo);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar registros em arquivo: " + e.getMessage());
    }
} */
        
        

