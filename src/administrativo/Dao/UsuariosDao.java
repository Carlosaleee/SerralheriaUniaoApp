package administrativo.Dao;

import administrativo.Beans.Usuario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

public class UsuariosDao {

    /* Classe CadastroDao.java, que conterá os atributos
*  e métodos que poderão ser utilizados em cada cadastro salvo na tabela.
     */
    private Conexao conexao;
    private Connection conn;

    public UsuariosDao() {
        this.conexao = new Conexao();
        this.conn = (Connection) this.conexao.getConexao();
    }

    public static Usuario validarUsuarioSeguro(Usuario usuario) {
        // Criando consulta parametrizada
        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        Usuario usuarioEncontrado = null;

        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetointegrador", "root", "123456");
            PreparedStatement statement = conexao.prepareStatement(sql);

            // Atribuindo os valores na consulta
            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getSenha());
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                usuarioEncontrado = new Usuario();
                usuarioEncontrado.setIdUsuario(rs.getInt("idUsuario"));
                usuarioEncontrado.setLogin(rs.getString("login"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
                usuarioEncontrado.setTipo(rs.getString("tipo"));
            }
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida");
        }

        return usuarioEncontrado;
    }

    // MÉTODO INSEGURO!!!
    public static Usuario validarUsuarioInseguro(Usuario usuario) {
        String sql = "SELECT * FROM usuario WHERE login = " + usuario.getLogin() + " AND senha = " + usuario.getSenha();
        Usuario usuarioEncontrado = null;

        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetointegrador", "root", "123456");
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                usuarioEncontrado = new Usuario();

                usuarioEncontrado.setIdUsuario(rs.getInt("idUsuario"));
                usuarioEncontrado.setLogin(rs.getString("login"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
                usuarioEncontrado.setTipo(rs.getString("tipo"));

            }
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida");
        }

        return usuarioEncontrado;
    }

    // Metodo Inserir
    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO usuario (login, senha, tipo) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getTipo());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir Usuario: " + e.getMessage());
        }
    }

    public Usuario getUsuario(int idUsuario) {
        String sql = "SELECT * FROM usuario WHERE idUsuario = ?";
        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, idUsuario);
            ResultSet rs = stmt.executeQuery();

            Usuario usuario = new Usuario();

            rs.next();
            usuario.setIdUsuario(idUsuario);
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setTipo(rs.getString("tipo"));

            return usuario;

            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }

    public List<Usuario> getUsuario() {
        String sql = "SELECT * FROM usuario";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            List<Usuario> listaUsuarios = new ArrayList<>();

            while (rs.next()) { //.next retorna verdadeiro caso exista uma próxima posição dentro do array
                Usuario usuario = new Usuario();

                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipo(rs.getString("tipo"));

                listaUsuarios.add(usuario);
            }
            return listaUsuarios;

            //Se o método entrar no "Catch" quer dizer que não encontrou nenhuma empresa, então damos um "return null"
        } catch (Exception e) {
            return null;
        }
    }

    public void editar(Usuario usuario) {
        //string sql com o código de update para o banco de dados
        String sql = "UPDATE usuario SET login=?, senha=?, tipo=? WHERE idUsuario=?";
        try {
            //esse trecho é igual ao método inserir
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            //Setando os parâmetros

            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getTipo());
            stmt.setInt(4, usuario.getIdUsuario());
            //Executando a query
            stmt.execute();
            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("Erro ao editar usuario: " + e.getMessage());
        }
    }

    public Usuario getLogin(String login) {
        String sql = "SELECT * FROM usuario WHERE login LIKE ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, login);
            ResultSet rs = stmt.executeQuery();

            Usuario usuario = new Usuario();

            rs.next();

            usuario.setLogin(rs.getString("Login"));
            usuario.setSenha(rs.getString("Senha"));
            usuario.setTipo(rs.getString("Tipo"));

            return usuario;

            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }

    public void excluir(int idUsuario) {

        String sql = "DELETE FROM usuario WHERE idUsuario = ?";
        try {
            //esse trecho é igual ao método editar e inserir
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, idUsuario);

            //Executando a query
            stmt.execute();
            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("Erro ao excluir usuario: " + e.getMessage());
        }

    }

}
