/**
* @author Carlos Alexandre Da Silva
* @version 1.0
* @since Primeira versão
*/

package administrativo.View;

import administrativo.Beans.Funcionario;
import administrativo.Beans.Usuario;
import administrativo.Dao.FuncionariosDao;
import administrativo.Dao.UsuariosDao;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 public class FuncionarioView extends javax.swing.JFrame {
     
        
        
    public   FuncionarioView() {
             initComponents();
             geraAcessbilidade();
             setTitle("Serralheria União");
                  
    }
    
    public void geraAcessbilidade(){
        
        btnCadastrar.setMnemonic(KeyEvent.VK_C);
        btnLimpar.setMnemonic(KeyEvent.VK_L);
        btnPesquisarId.setMnemonic(KeyEvent.VK_P);
        btnVoltar.setMnemonic(KeyEvent.VK_V);
        btnExcluir.setMnemonic(KeyEvent.VK_E);
        btnListagem.setMnemonic(KeyEvent.VK_I);
        btnPesquisarNome.setMnemonic(KeyEvent.VK_R);
}
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPesquisar2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTelefone01 = new javax.swing.JTextField();
        txtTelefone02 = new javax.swing.JTextField();
        txtDataAdmissao = new javax.swing.JTextField();
        txtDataDemissao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCarteiraTrabalho = new javax.swing.JTextField();
        txtRegistroGeral = new javax.swing.JTextField();
        txtBalneario = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtCargoId = new javax.swing.JTextField();
        txtUsuarioId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIdFuncionario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        txtPesquisarId = new javax.swing.JTextField();
        txtPesquisarNome = new javax.swing.JTextField();
        btnPesquisarNome = new javax.swing.JButton();
        btnPesquisarId = new javax.swing.JButton();

        btnPesquisar2.setBackground(new java.awt.Color(0, 0, 0));
        btnPesquisar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPesquisar2.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar2.setText("Pesquisar");
        btnPesquisar2.setToolTipText("Digite o Nome do Funcionario que Deseja Pesquisar");
        btnPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisar2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane1.setForeground(new java.awt.Color(0, 0, 0));

        lblNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setLabelFor(txtNome);
        lblNome.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Telefone 01 :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Telefone  02 :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Carteira de Trab. :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("R.G. :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Endereço :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Rua :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Numero :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Balneario :");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Cidade :");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("usuarioId :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("cargoId :");

        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setToolTipText("Digite o Nome");
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtTelefone01.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefone01.setToolTipText("Digite o Numero do Telefone. Utilize o formato  (XX)XXXXX-XXXX");
        txtTelefone01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtTelefone01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone01ActionPerformed(evt);
            }
        });

        txtTelefone02.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefone02.setToolTipText("Digite o Telefone. Utilize o formato (XX)XXXXX-XXXX");
        txtTelefone02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtTelefone02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone02ActionPerformed(evt);
            }
        });

        txtDataAdmissao.setForeground(new java.awt.Color(0, 0, 0));
        txtDataAdmissao.setToolTipText("Digite a Data da Admissão XX/XX/XXXX");
        txtDataAdmissao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtDataDemissao.setForeground(new java.awt.Color(0, 0, 0));
        txtDataDemissao.setToolTipText("Digite a Data da Demissão XX/XX/XXXX");
        txtDataDemissao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Data Admissão :");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Data Demissão :");

        txtCarteiraTrabalho.setForeground(new java.awt.Color(0, 0, 0));
        txtCarteiraTrabalho.setToolTipText("Digite o numero da Carteira de Trabalho. Utilize o Formato 1234567/1234");
        txtCarteiraTrabalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtRegistroGeral.setForeground(new java.awt.Color(0, 0, 0));
        txtRegistroGeral.setToolTipText("Digite o Numero do Registro Geral. Utilize o formato XX.XXX.XXX/X");
        txtRegistroGeral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtBalneario.setForeground(new java.awt.Color(0, 0, 0));
        txtBalneario.setToolTipText("Digite o Nome do Balneario.");
        txtBalneario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtBalneario.setNextFocusableComponent(txtCidade);
        txtBalneario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalnearioActionPerformed(evt);
            }
        });

        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.setToolTipText("Digite o Numero da Residência");
        txtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNumero.setNextFocusableComponent(txtBalneario);

        txtRua.setForeground(new java.awt.Color(0, 0, 0));
        txtRua.setToolTipText("Digite o Nome da Rua.");
        txtRua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtRua.setNextFocusableComponent(txtNumero);

        txtCidade.setForeground(new java.awt.Color(0, 0, 0));
        txtCidade.setToolTipText("Digite a Cidade");
        txtCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCidade.setNextFocusableComponent(txtCargoId);

        txtCargoId.setForeground(new java.awt.Color(0, 0, 0));
        txtCargoId.setToolTipText("cargoId");
        txtCargoId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCargoId.setNextFocusableComponent(txtUsuarioId);

        txtUsuarioId.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuarioId.setToolTipText("usuarioId");
        txtUsuarioId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtUsuarioId.setNextFocusableComponent(btnCadastrar);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Preencha o Formulário :");
        jLabel1.setToolTipText("Preencha o Formulário");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("Dados Pessoais :");

        txtIdFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        txtIdFuncionario.setToolTipText("IdFuncionario");
        txtIdFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtIdFuncionario.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("IdFuncionario :");

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Cadastrar Funcionario");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(lblNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtTelefone01, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtTelefone02, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDataAdmissao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDataDemissao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCarteiraTrabalho, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtRegistroGeral, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtBalneario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtRua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCargoId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtUsuarioId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtIdFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(txtNumero)
                                        .addGap(426, 426, 426))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(txtBalneario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel16)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel17))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDataDemissao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTelefone02, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                                    .addGap(255, 255, 255)
                                                    .addComponent(jLabel12))
                                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(jLabel13))
                                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                                    .addComponent(txtCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtRegistroGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCargoId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTelefone01, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDataAdmissao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(344, 344, 344))))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(246, 246, 246))
                                    .addComponent(jLabel1))
                                .addGap(284, 284, 284))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(55, 55, 55)
                                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefone02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDataDemissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtRegistroGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCargoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBalneario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(btnCadastrar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLayeredPane2.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(" Funcionários");

        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(250, 250, 250))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnLimpar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Limpa o Cadastro");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Exclui a Linha Marcada");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Retorna ao Menu Principal");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnListagem.setBackground(new java.awt.Color(0, 0, 0));
        btnListagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnListagem.setForeground(new java.awt.Color(255, 255, 255));
        btnListagem.setText("Cadastro");
        btnListagem.setToolTipText("Acesso a Lista de Funcionarios.");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Edita o Cadastro.");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar)
                    .addComponent(btnListagem)
                    .addComponent(btnEditar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblNome1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(0, 0, 0));
        lblNome1.setLabelFor(txtNome);
        lblNome1.setText("Pesquisar por ID :");

        lblNome2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(0, 0, 0));
        lblNome2.setLabelFor(txtNome);
        lblNome2.setText("Pesquisar por Nome :");

        txtPesquisarId.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisarId.setToolTipText("Digite o ID que deseja pesquisar.");
        txtPesquisarId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPesquisarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarIdActionPerformed(evt);
            }
        });

        txtPesquisarNome.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisarNome.setToolTipText("Digite o Nome que deseja pesquisar.");
        txtPesquisarNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarNomeActionPerformed(evt);
            }
        });

        btnPesquisarNome.setBackground(new java.awt.Color(0, 0, 0));
        btnPesquisarNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPesquisarNome.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarNome.setText("Pesquisar");
        btnPesquisarNome.setToolTipText("Pesquisar");
        btnPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarNomeActionPerformed(evt);
            }
        });

        btnPesquisarId.setBackground(new java.awt.Color(0, 0, 0));
        btnPesquisarId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPesquisarId.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarId.setText("Pesquisar");
        btnPesquisarId.setToolTipText(" Pesquisar");
        btnPesquisarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome1)
                    .addComponent(lblNome2))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPesquisarId, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(txtPesquisarNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(txtPesquisarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarNome)
                    .addComponent(txtPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLayeredPane1)
                                .addComponent(jLayeredPane2))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtTelefone01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone01ActionPerformed

    private void txtTelefone02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone02ActionPerformed

    private void txtBalnearioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalnearioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalnearioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
      
        if (!emptyFields()  
               
                && validarTelefone(txtTelefone02.getText())
                && validarTelefone(txtTelefone02.getText())
                && validarData(txtDataAdmissao.getText())
                && validarData(txtDataDemissao.getText())
                && validarClt(txtCarteiraTrabalho.getText())
                && validarRegistroGeral(txtRegistroGeral.getText())
                && validarInteiro(Integer.parseInt(txtUsuarioId.getText()))
                && validarInteiro(Integer.parseInt(txtCargoId.getText())) )
     {
            
        String nome = txtNome.getText();
        String telefone01 = txtTelefone01.getText();
        String telefone02 = txtTelefone02.getText();
        
        String dataAdmissao = txtDataAdmissao.getText();
        String dataDemissao = txtDataDemissao.getText();
        String numcarteiraTrabalho = txtCarteiraTrabalho.getText();
        
        String rg = txtRegistroGeral.getText();
        String rua = txtRua.getText();
        String numero = txtNumero.getText();
        
        String balneario = txtBalneario.getText();
        String cidade = txtCidade.getText();
        String cargoId = txtCargoId.getText();
        
        String usuarioId = txtUsuarioId.getText();
       
        Funcionario funcionario = new Funcionario();

        funcionario.setNome(nome);
        funcionario.setTelefone01(telefone01);
        funcionario.setTelefone02(telefone02);
        
        funcionario.setDataAdmissao(dataAdmissao);
        funcionario.setDataDemissao(dataDemissao);
        funcionario.setNumcarteiraTrabalho(numcarteiraTrabalho);
        
        funcionario.setRg(rg);
        funcionario.setRua(rua);
        funcionario.setNumero(numero);
        
        funcionario.setBalneario(balneario);
        funcionario.setCidade(cidade);
        funcionario.setCargoId(cargoId);
        
        funcionario.setUsuarioId(usuarioId);
        
        FuncionariosDao  funcionariosDao = new  FuncionariosDao();
        funcionariosDao.inserir(funcionario);
        
        
        
           JOptionPane.showMessageDialog(null, "Os Seguintes Dados foram Cadastrados com Sucesso: \n"
                
                 + "\nNome: " + txtNome.getText()
                 + "\nTelefone01: " + txtTelefone01.getText()
                 + "\nTelefone02: " + txtTelefone02.getText()
                 
                 + "\nData Admissão: " + txtDataAdmissao.getText()
                 + "\nData Demissão: " + txtDataDemissao.getText()
                 + "\nCarteira de Trabalho: " + txtCarteiraTrabalho.getText()
                 + "\nRG: " + txtRegistroGeral.getText()
                 
                 + "\nRua: " + txtRua.getText()
                 + "\nNumero: " + txtNumero.getText()
                 + "\nBalneario: " + txtBalneario.getText()
                 + "\nCidade: " + txtCidade.getText()
                 
                 + "\nCargo ID: " + txtCargoId.getText()
                 + "\nUsúario ID: " + txtUsuarioId.getText()
                    
           );
           
    }
     
          txtIdFuncionario.setText("");
          txtNome.setText("");
          txtTelefone01.setText("");
          txtTelefone02.setText("");
          txtDataAdmissao.setText("");
          txtDataDemissao.setText("");
          txtCarteiraTrabalho.setText("");
          txtRegistroGeral.setText("");
          txtBalneario.setText("");
          txtNumero.setText("");
          txtRua.setText("");
          txtCidade.setText("");
          txtUsuarioId.setText("");
          txtCargoId.setText("");
          
          txtNome.requestFocus();
        
        
      
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNomeActionPerformed
                
                String nomepesquisa = txtPesquisarNome.getText();
                  
                FuncionariosDao funcionariosDao = new FuncionariosDao();
                Funcionario funcionario = funcionariosDao.getFuncionarioNome(nomepesquisa);
                
                if (funcionario == null) {
                    JOptionPane.showMessageDialog(this, "Funcionario não encontrado!");
                } 
                else {      
                    txtIdFuncionario.setText(String.valueOf(funcionario.getIdFuncionario()));
                    
                    txtNome.setText(funcionario.getNome());
                    txtTelefone01.setText(funcionario.getTelefone01());
                    txtTelefone02.setText(funcionario.getTelefone02());
                    
                    txtDataAdmissao.setText(funcionario.getDataAdmissao());
                    txtDataAdmissao.setText(funcionario.getDataAdmissao());
                    txtCarteiraTrabalho.setText(funcionario.getNumcarteiraTrabalho());
                    txtRegistroGeral.setText(funcionario.getRg());
                    
                    txtRua.setText(funcionario.getRua());
                    txtNumero.setText(funcionario.getNumero());
                    txtBalneario.setText(funcionario.getBalneario());
                    txtCidade.setText(funcionario.getCidade());
                    
                    txtCargoId.setText(funcionario.getCargoId());
                    txtUsuarioId.setText(funcionario.getUsuarioId());
                }          
    }//GEN-LAST:event_btnPesquisarNomeActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
          
          txtIdFuncionario.setText("");
          txtNome.setText("");
          txtTelefone01.setText("");
          txtTelefone02.setText("");
          txtDataAdmissao.setText("");
          txtDataDemissao.setText("");
          txtCarteiraTrabalho.setText("");
          txtRegistroGeral.setText("");
          txtBalneario.setText("");
          txtNumero.setText("");
          txtRua.setText("");
          txtCidade.setText("");
          txtUsuarioId.setText("");
          txtCargoId.setText("");
          txtPesquisarId.setText("");
          txtPesquisarNome.setText("");
          
          txtNome.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //Pegar o código que o usuário digitou no campo de texto, converte para inteiro e salvar da variavel id
                int idFuncionario = Integer.parseInt(txtIdFuncionario.getText());
                
                FuncionariosDao funcionariosDao  = new FuncionariosDao();
                funcionariosDao.excluir(idFuncionario);
                
                JOptionPane.showMessageDialog(null, "Os Seguintes Dados foram Excluidos com Sucesso: \n"
                
                 + "\nNome: " + txtNome.getText()
                 + "\nTelefone01: " + txtTelefone01.getText()
                 + "\nTelefone02: " + txtTelefone02.getText()
                 
                 + "\nData Admissão: " + txtDataAdmissao.getText()
                 + "\nData Demissão: " + txtDataDemissao.getText()
                 + "\nCarteira de Trabalho: " + txtCarteiraTrabalho.getText()
                 + "\nRG: " + txtRegistroGeral.getText()
                 
                 + "\nRua: " + txtRua.getText()
                 + "\nNumero: " + txtNumero.getText()
                 + "\nBalneario: " + txtBalneario.getText()
                 + "\nCidade: " + txtCidade.getText()
                 
                 + "\nCargo ID: " + txtCargoId.getText()
                 + "\nUsúario ID: " + txtUsuarioId.getText()
                    
           );
                
                //limpando os campos
          txtIdFuncionario.setText("");
          txtNome.setText("");
          txtTelefone01.setText("");
          txtTelefone02.setText("");
          txtDataAdmissao.setText("");
          txtDataDemissao.setText("");
          txtCarteiraTrabalho.setText("");
          txtRegistroGeral.setText("");
          txtBalneario.setText("");
          txtNumero.setText("");
          txtRua.setText("");
          txtCidade.setText("");
          txtUsuarioId.setText("");
          txtCargoId.setText("");
          txtPesquisarId.setText("");
          txtPesquisarNome.setText("");
          
          txtNome.requestFocus(); 
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtPesquisarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarIdActionPerformed

    private void txtPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarNomeActionPerformed

    private void btnPesquisarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarIdActionPerformed

                int idFuncionario = Integer.parseInt(txtPesquisarId.getText());  
            
                FuncionariosDao funcionariosDao = new FuncionariosDao();
                Funcionario funcionario = funcionariosDao.getFuncionario(idFuncionario);
                
                if (funcionario == null) {
                    JOptionPane.showMessageDialog(this, "Funcionario não encontrado!");
                } 
                else {
                    
                    txtIdFuncionario.setText(String.valueOf(funcionario.getIdFuncionario()));
                    
                    txtNome.setText(funcionario.getNome());
                    txtTelefone01.setText(funcionario.getTelefone01());
                    txtTelefone02.setText(funcionario.getTelefone02());
                    
                    txtDataAdmissao.setText(funcionario.getDataAdmissao());
                    txtDataAdmissao.setText(funcionario.getDataAdmissao());
                    txtCarteiraTrabalho.setText(funcionario.getNumcarteiraTrabalho());
                    txtRegistroGeral.setText(funcionario.getRg());
                    
                    txtRua.setText(funcionario.getRua());
                    txtNumero.setText(funcionario.getNumero());
                    txtBalneario.setText(funcionario.getBalneario());
                    txtCidade.setText(funcionario.getCidade());
                    
                    txtCargoId.setText(funcionario.getCargoId());
                    txtUsuarioId.setText(funcionario.getUsuarioId());
                    
                    
                }        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarIdActionPerformed

    private void btnPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisar2ActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
       
                FormFuncionarioView fre = new FormFuncionarioView();
                //Mostrando o form quando clicar no botão
                fre.setVisible(true);
    }//GEN-LAST:event_btnListagemActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
     int idFuncionario = Integer.parseInt(txtIdFuncionario.getText());
        
        String nome = txtNome.getText();
        String telefone01 = txtTelefone01.getText();
        String telefone02 = txtTelefone02.getText();
        
        String dataAdmissao = txtDataAdmissao.getText();
        String dataDemissao = txtDataDemissao.getText();
        String numcarteiraTrabalho = txtCarteiraTrabalho.getText();
        
        String rg = txtRegistroGeral.getText();
        String rua = txtRua.getText();
        String numero = txtNumero.getText();
        
        String balneario = txtBalneario.getText();
        String cidade = txtCidade.getText();
        String cargoId = txtCargoId.getText();
        String usuarioId = txtUsuarioId.getText();
                        
                Funcionario funcionario = new Funcionario();
               
        funcionario.setIdFuncionario(idFuncionario);
        funcionario.setNome(nome);
        funcionario.setTelefone01(telefone01);
        funcionario.setTelefone02(telefone02);
        
        funcionario.setDataAdmissao(dataAdmissao);
        funcionario.setDataDemissao(dataDemissao);
        funcionario.setNumcarteiraTrabalho(numcarteiraTrabalho);
        
        funcionario.setRg(rg);
        funcionario.setRua(rua);
        funcionario.setNumero(numero);
        
        funcionario.setBalneario(balneario);
        funcionario.setCidade(cidade);
        funcionario.setCargoId(cargoId);
        funcionario.setUsuarioId(usuarioId);
                        
                FuncionariosDao  funcionariosDao = new  FuncionariosDao();
                funcionariosDao.editar(funcionario);
                
                //limpando os campos
          txtIdFuncionario.setText("");
          txtNome.setText("");
          txtTelefone01.setText("");
          txtTelefone02.setText("");
          txtDataAdmissao.setText("");
          txtDataDemissao.setText("");
          txtCarteiraTrabalho.setText("");
          txtRegistroGeral.setText("");
          txtBalneario.setText("");
          txtNumero.setText("");
          txtRua.setText("");
          txtCidade.setText("");
          txtUsuarioId.setText("");
          txtCargoId.setText("");
          txtPesquisarId.setText("");
          txtPesquisarNome.setText("");
          
          txtNome.requestFocus();
                
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JButton btnPesquisar2;
    private javax.swing.JButton btnPesquisarId;
    private javax.swing.JButton btnPesquisarNome;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JTextField txtBalneario;
    private javax.swing.JTextField txtCargoId;
    private javax.swing.JTextField txtCarteiraTrabalho;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtDataAdmissao;
    private javax.swing.JTextField txtDataDemissao;
    private javax.swing.JTextField txtIdFuncionario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisarId;
    private javax.swing.JTextField txtPesquisarNome;
    private javax.swing.JTextField txtRegistroGeral;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone01;
    private javax.swing.JTextField txtTelefone02;
    private javax.swing.JTextField txtUsuarioId;
    // End of variables declaration//GEN-END:variables

    
    private boolean emptyFields(){
     /*
      * Variável empty assume “true” por padrão e só vai mudar o seu estado
      * após verificarmos se todos os campos estão preenchidos. É ela que
      * retornamos ao final do método.
     */
     boolean empty = true; 
     
     if(txtNome.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Nome não pode ser vazio.");
     } else if(txtTelefone01.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Telefone 01 não pode ser vazio.");
     } else if(txtTelefone02.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Telefone 02 não pode ser vazio.");
     }   else if(txtDataAdmissao.getText().trim().isEmpty()){
        
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data da Admissão não pode ser vazio.");
     } else if(txtDataDemissao.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data da Demissão não pode ser vazio.");
     } else if(txtCarteiraTrabalho.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Carteira Trabalho não pode ser vazio.");
     }   else if(txtRegistroGeral.getText().trim().isEmpty()){
        
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Registro Geral não pode ser vazio.");
     } else if(txtBalneario.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Rua não pode ser vazio.");
     } else if(txtNumero.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Numero não pode ser vazio.");
     }   else if(txtRua.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Registro Geral não pode ser vazio.");
     } else if(txtCidade.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Rua não pode ser vazio.");
     } else if(txtUsuarioId.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Numero não pode ser vazio.");
     }   else if(txtCargoId.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Balneario não pode ser vazio.");
     }else{
         
         empty = false;
     }
     
     return empty;
  }
  
    
   //Validar Numeros inteiros
   private boolean validarInteiro(int idFuncionario) {
    
    if (idFuncionario < 0 || idFuncionario > 999) {
        JOptionPane.showMessageDialog(null, "Formato de ID de Funcionário Inválido. Utilize um número entre 0 e 999.");
        return false;
    }
    return true;
}

   
    // Validação número de telefone
    private boolean validarTelefone(String telefone) {
    if( !telefone.matches("\\(\\d{2}\\)\\d{5}\\-\\d{4}") && !telefone.matches("\\d{11}")){
        JOptionPane.showMessageDialog(null, "Formato de TELEFONE inválido. Use o formato (XX)XXXXX-XXXX.");
        return false;
    }
    return true;
}
  // Validação de data
    private boolean validarData(String Data) {
    
    if (!Data.matches("\\d{2}-\\d{2}-\\d{4}")) {
       
    JOptionPane.showMessageDialog(null, "Formato da DATA inválido. Use o formato XXXX-XX-XX.");
        return false;
    }
    return true;
}  
   //Validar Carteira de trabalho
    private boolean validarClt(String Clt) {
    
    if (!Clt.matches("\\d{7}/\\d{4}")) {
       
    JOptionPane.showMessageDialog(null, "Formato do Numero do Documento inválido. Use o formato 1234567/1234.");
        return false;
    }
    return true;
} 
    //Validar Registro geral
    
    private boolean validarRegistroGeral(String Rg) {
    
    if (!Rg.matches("\\d{2}.\\d{3}.\\d{3}/\\d{1}")) {
       
    JOptionPane.showMessageDialog(null, "Formato do Numero do Documento inválido. Use o formato XX.XXX.XXX/X.");
        return false;
    }
    return true;
} 
 }
  
    
    
 
 
