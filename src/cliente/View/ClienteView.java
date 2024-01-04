/**
* @author Carlos Alexandre Da Silva
* @version 1.0
* @since Primeira versão
*/

package cliente.View;


import cliente.Beans.Cliente;
import cliente.Dao.ClienteDao;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class ClienteView extends javax.swing.JFrame {
    
    public ClienteView() {
        initComponents();
        geraAcessbilidade();
        setTitle("Serralheria União");
        
    }
    
    public void geraAcessbilidade(){
        
        btnCadastrar.setMnemonic(KeyEvent.VK_C);
        btnLimpar.setMnemonic(KeyEvent.VK_L);
        btnListagem.setMnemonic(KeyEvent.VK_P);
        btnVoltar.setMnemonic(KeyEvent.VK_V);
        btnExcluir.setMnemonic(KeyEvent.VK_E);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane19 = new javax.swing.JLayeredPane();
        btnLimpar = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLayeredPane22 = new javax.swing.JLayeredPane();
        lblNome = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTelefone01 = new javax.swing.JTextField();
        txtTelefone02 = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBalneario = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLayeredPane20 = new javax.swing.JLayeredPane();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblNome7 = new javax.swing.JLabel();
        lblNome8 = new javax.swing.JLabel();
        txtIdPesquisa = new javax.swing.JTextField();
        txtNomePesquisa = new javax.swing.JTextField();
        btnNomePesquisa = new javax.swing.JButton();
        btnIdPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLayeredPane19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnLimpar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Limpa os Campos Preenchidos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnListagem.setBackground(new java.awt.Color(0, 0, 0));
        btnListagem.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnListagem.setForeground(new java.awt.Color(255, 255, 255));
        btnListagem.setText("Cadastro");
        btnListagem.setToolTipText("Pesquisa um Cliente Pelo Nome");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Retorna ao Menu Principal ");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Limpa os Campos Preenchidos");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLayeredPane19.setLayer(btnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane19.setLayer(btnListagem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane19.setLayer(btnExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane19.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane19.setLayer(btnEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane19Layout = new javax.swing.GroupLayout(jLayeredPane19);
        jLayeredPane19.setLayout(jLayeredPane19Layout);
        jLayeredPane19Layout.setHorizontalGroup(
            jLayeredPane19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane19Layout.setVerticalGroup(
            jLayeredPane19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane19Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jLayeredPane19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnListagem)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar)
                    .addComponent(btnEditar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLayeredPane22.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane22.setForeground(new java.awt.Color(0, 0, 0));

        lblNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome:");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Telefone 01 :");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Telefone 02 :");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("CPF :");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 51));
        jLabel24.setText("Endereço :");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Rua :");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Numero :");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Balneario :");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Cidade :");

        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setToolTipText("Digite o Nome");
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNome.setNextFocusableComponent(txtCpf);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtTelefone01.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefone01.setToolTipText("Digite o Numero do Telefone. Utilize o formato  (XX)XXXXX-XXXX");
        txtTelefone01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtTelefone01.setNextFocusableComponent(txtTelefone02);
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

        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        txtCpf.setToolTipText("Digite o numero da CPF. Utilize o Formato XXX.XXX.XXX-XX");
        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCpf.setNextFocusableComponent(txtTelefone01);

        txtRua.setForeground(new java.awt.Color(0, 0, 0));
        txtRua.setToolTipText("Digite o Nome da Rua  ");
        txtRua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });

        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.setToolTipText("Digite o Numero da Residência");
        txtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtBalneario.setForeground(new java.awt.Color(0, 0, 0));
        txtBalneario.setToolTipText("Digite o Balneario");
        txtBalneario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCidade.setForeground(new java.awt.Color(0, 0, 0));
        txtCidade.setToolTipText("Digite a Cidade");
        txtCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 0));
        jLabel34.setText("Dados Pessoais :");

        txtIdCliente.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtIdCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtIdCliente.setToolTipText("Digite o Id do Cliente");
        txtIdCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtIdCliente.setEnabled(false);

        jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("IdCliente :");

        jLabel33.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 51));
        jLabel33.setText("Preencha o Formulário :");
        jLabel33.setToolTipText("Preencha o Formulário");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Estado :");

        txtEstado.setForeground(new java.awt.Color(0, 0, 0));
        txtEstado.setToolTipText("Digite o Balneario");
        txtEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Cadastrar Cliente");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLayeredPane22.setLayer(lblNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtTelefone01, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtTelefone02, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtRua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtBalneario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtIdCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(btnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane22Layout = new javax.swing.GroupLayout(jLayeredPane22);
        jLayeredPane22.setLayout(jLayeredPane22Layout);
        jLayeredPane22Layout.setHorizontalGroup(
            jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane22Layout.createSequentialGroup()
                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane22Layout.createSequentialGroup()
                                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 435, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane22Layout.createSequentialGroup()
                                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(lblNome)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel22))
                                .addGap(33, 33, 33)
                                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel26)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero))
                                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                        .addComponent(txtBalneario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane22Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel20))
                                                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel21)))
                                                .addGap(12, 12, 12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane22Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel35)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtTelefone01, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTelefone02, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(14, 14, 14))))
        );
        jLayeredPane22Layout.setVerticalGroup(
            jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33))
                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(8, 8, 8)
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtTelefone02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(txtBalneario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addGap(15, 15, 15))))
        );

        jLayeredPane20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Cadastro de Cliente");

        jLayeredPane20.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane20Layout = new javax.swing.GroupLayout(jLayeredPane20);
        jLayeredPane20.setLayout(jLayeredPane20Layout);
        jLayeredPane20Layout.setHorizontalGroup(
            jLayeredPane20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane20Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane20Layout.setVerticalGroup(
            jLayeredPane20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblNome7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome7.setForeground(new java.awt.Color(0, 0, 0));
        lblNome7.setText("Pesquisar por ID :");

        lblNome8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome8.setForeground(new java.awt.Color(0, 0, 0));
        lblNome8.setText("Pesquisar por Nome :");

        txtIdPesquisa.setForeground(new java.awt.Color(0, 0, 0));
        txtIdPesquisa.setToolTipText("Digite o ID que deseja pesquisar.");
        txtIdPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtIdPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPesquisaActionPerformed(evt);
            }
        });

        txtNomePesquisa.setForeground(new java.awt.Color(0, 0, 0));
        txtNomePesquisa.setToolTipText("Digite o Nome que deseja pesquisar.");
        txtNomePesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNomePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePesquisaActionPerformed(evt);
            }
        });

        btnNomePesquisa.setBackground(new java.awt.Color(0, 0, 0));
        btnNomePesquisa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNomePesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btnNomePesquisa.setText("Pesquisar");
        btnNomePesquisa.setToolTipText("Pesquisar");
        btnNomePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomePesquisaActionPerformed(evt);
            }
        });

        btnIdPesquisa.setBackground(new java.awt.Color(0, 0, 0));
        btnIdPesquisa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIdPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btnIdPesquisa.setText("Pesquisar");
        btnIdPesquisa.setToolTipText(" Pesquisar");
        btnIdPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome7)
                    .addComponent(lblNome8))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(txtNomePesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome7)
                    .addComponent(txtIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIdPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNomePesquisa)
                    .addComponent(txtNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane20)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void txtTelefone02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone02ActionPerformed

    private void txtTelefone01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone01ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        FormClienteView fre = new FormClienteView();
        fre.setVisible(true); 

    }//GEN-LAST:event_btnListagemActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        if (!emptyFields()
            
                && validarTelefone(txtTelefone01.getText())
                && validarTelefone(txtTelefone02.getText())
                && validarCpf(txtCpf.getText()))
                
     {
            
            String nome = txtNome.getText();
            String cpf = txtCpf.getText();
            String telefone01 = txtTelefone01.getText();
            
            String telefone02 = txtTelefone02.getText();
            String rua = txtRua.getText();
            String numero = txtNumero.getText();
            
            String balneario = txtBalneario.getText();
            String cidade = txtCidade.getText();
            String estado = txtEstado.getText();

            Cliente novoCliente = new Cliente();

            novoCliente.setNome(nome);
            novoCliente.setCpf(cpf);
            novoCliente.setTelefone01(telefone01);
            
            novoCliente.setTelefone02(telefone02);
            novoCliente.setRua(rua);
            novoCliente.setNumero(numero);
            
            novoCliente.setBalneario(balneario);
            novoCliente.setCidade(cidade);
            novoCliente.setEstado(estado);

            ClienteDao clienteDao = new ClienteDao();
            clienteDao.inserir(novoCliente);

            JOptionPane.showMessageDialog(null, "Os seguintes dados foram cadastrados com sucesso: \n"
                   
                    + "\nCargo: " + nome
                    + "\nDescrição: " + cpf
                    + "\nSalário: " + telefone01
                    
                    + "\nCargo: " + telefone02
                    + "\nDescrição: " + rua
                    + "\nSalário: " + numero
                    
                    + "\nCargo: " + balneario
                    + "\nDescrição: " + cidade
                    + "\nSalário: " + estado
            );

          txtIdCliente.setText("");
          txtNome.setText("");
          txtTelefone01.setText("");
          txtTelefone02.setText("");
          txtCpf.setText("");
          txtRua.setText("");
          txtNumero.setText("");
          txtBalneario.setText("");
          txtCidade.setText("");
          txtNumero.setText("");
          
          txtNome.requestFocus(); 
        }      
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
         
          txtIdCliente.setText("");
          txtNome.setText("");
          txtTelefone01.setText("");
          txtTelefone02.setText("");
          txtCpf.setText("");
          txtRua.setText("");
          txtNumero.setText("");
          txtBalneario.setText("");
          txtCidade.setText("");
          txtNumero.setText("");
          txtEstado.setText("");
          txtIdPesquisa.setText("");
          txtNomePesquisa.setText("");
          
          txtNome.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
                
        int idCliente = Integer.parseInt(txtIdCliente.getText());

        ClienteDao clienteDao = new ClienteDao();
        clienteDao.excluir(idCliente);
        
        JOptionPane.showMessageDialog(null, "Os Seguintes Dados foram Excluidos com Sucesso: \n"
                
                 + "\nNome: " + txtNome.getText()
                 + "\nTelefone01: " + txtTelefone01.getText()
                 + "\nTelefone 02: " + txtTelefone02.getText()
                
                 + "\nNomeCpf: " + txtCpf.getText()
                 + "\nRua: " + txtRua.getText()
                 + "\nNumero: " + txtNumero.getText()
                
                 + "\nBalneario: " + txtBalneario.getText()
                 + "\nCidade: " + txtCidade.getText()
                 + "\nEstado: " + txtEstado.getText()
                
           );

        //limpando os campos
        
          txtIdCliente.setText("");
          txtNome.setText("");
          txtTelefone01.setText("");
          txtTelefone02.setText("");
          txtCpf.setText("");
          txtRua.setText("");
          txtNumero.setText("");
          txtBalneario.setText("");
          txtCidade.setText("");
          txtEstado.setText("");
          txtIdPesquisa.setText("");
          txtNomePesquisa.setText("");
          
          txtNome.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtIdPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPesquisaActionPerformed

    private void txtNomePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePesquisaActionPerformed

    private void btnNomePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomePesquisaActionPerformed
                
                String nome = txtNomePesquisa.getText();
                  
                ClienteDao clienteDao = new ClienteDao();
                Cliente cliente = clienteDao.getNomeCliente(nome);
                
                if (cliente == null) {
                    JOptionPane.showMessageDialog(this, "Cliente não encontrado!");
                } 
                else {      
                    
                    txtIdCliente.setText(String.valueOf(cliente.getIdCliente())); 
                    
                    txtNome.setText(cliente.getNome());
                    txtCpf.setText(cliente.getCpf());
                    txtTelefone01.setText(cliente.getTelefone01());
                    
                    txtTelefone02.setText(cliente.getTelefone02());
                    txtRua.setText(cliente.getRua());
                    txtNumero.setText(cliente.getNumero());
                    
                    txtBalneario.setText(cliente.getBalneario());
                    txtCidade.setText(cliente.getCidade());
                    txtEstado.setText(cliente.getEstado()); 
                }       
        
    }//GEN-LAST:event_btnNomePesquisaActionPerformed

    private void btnIdPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdPesquisaActionPerformed
        
        int idPesquisa = Integer.parseInt(txtIdPesquisa.getText());  
            
                ClienteDao clienteDao = new ClienteDao();
                Cliente cliente = clienteDao.getCliente(idPesquisa);
                
                if (cliente == null) {
                    JOptionPane.showMessageDialog(this, "Cliente não Encontrado!");
                } 
                else {
                    
                    txtIdCliente.setText(String.valueOf(cliente.getIdCliente())); 
                    
                    txtNome.setText(cliente.getNome());
                    txtCpf.setText(cliente.getCpf());
                    txtTelefone01.setText(cliente.getTelefone01());
                    
                    txtTelefone02.setText(cliente.getTelefone02());
                    txtRua.setText(cliente.getRua());
                    txtNumero.setText(cliente.getNumero());
                    
                    txtBalneario.setText(cliente.getBalneario());
                    txtCidade.setText(cliente.getCidade());
                    txtEstado.setText(cliente.getEstado());
                    
                }
       
    }//GEN-LAST:event_btnIdPesquisaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        int idCliente = Integer.parseInt(txtIdCliente.getText());

        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        String telefone01 = txtTelefone01.getText();

        String telefone02 = txtTelefone02.getText();
        String rua = txtRua.getText();
        String numero = txtNumero.getText();

        String balneario = txtBalneario.getText();
        String cidade = txtCidade.getText();
        String estado = txtEstado.getText();

        Cliente novoCliente = new Cliente();
               
            novoCliente.setIdCliente(idCliente);
            novoCliente.setNome(nome);
            novoCliente.setCpf(cpf);
            novoCliente.setTelefone01(telefone01);
            
            novoCliente.setTelefone02(telefone02);
            novoCliente.setRua(rua);
            novoCliente.setNumero(numero);
            
            novoCliente.setBalneario(balneario);
            novoCliente.setCidade(cidade);
            novoCliente.setEstado(estado);
        
         ClienteDao clienteDao = new ClienteDao();
         clienteDao.editar(novoCliente);
         
          JOptionPane.showMessageDialog(null, "Os seguintes dados foram Editados com sucesso: \n"
                   
                    + "\nNome: " + nome
                    + "\nTelefone01: " + telefone01
                    + "\nTelefone02: " + telefone02
                    
                    + "\nCpf: " + cpf
                    + "\nRua: " + rua
                    + "\nNumero: " + numero
                    
                    + "\nBalneario: " + balneario
                    + "\nCidade: " + cidade
                    + "\nEstado: " + estado
            );
                
                //limpando os campos
                
          txtIdCliente.setText("");
          txtNome.setText("");
          txtTelefone01.setText("");
          txtTelefone02.setText("");
          txtCpf.setText("");
          txtRua.setText("");
          txtNumero.setText("");
          txtBalneario.setText("");
          txtCidade.setText("");
          txtNumero.setText("");
          txtEstado.setText("");
          txtIdPesquisa.setText("");
          txtNomePesquisa.setText("");
          
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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIdPesquisa;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JButton btnNomePesquisa;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLayeredPane jLayeredPane19;
    private javax.swing.JLayeredPane jLayeredPane20;
    private javax.swing.JLayeredPane jLayeredPane22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome7;
    private javax.swing.JLabel lblNome8;
    private javax.swing.JTextField txtBalneario;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdPesquisa;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomePesquisa;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone01;
    private javax.swing.JTextField txtTelefone02;
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
     }   else if(txtCpf.getText().trim().isEmpty()){
        
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! CPF não pode ser vazio.");
     } else if(txtRua.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Rua não pode ser vazio.");
     } else if(txtNumero.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Numero não pode ser vazio.");
     }   else if(txtBalneario.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Balneario não pode ser vazio.");
     } else if(txtCidade.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Cidade não pode ser vazio.");
     } else if(txtEstado.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Estado não pode ser vazio.");
     }else{
         
         empty = false;
     }
     
     return empty;
  }
   

  
   
    // Validação número de telefone
    private boolean validarTelefone(String telefone) {
    if( !telefone.matches("\\(\\d{2}\\)\\d{5}\\-\\d{4}") && !telefone.matches("\\d{11}")){
        JOptionPane.showMessageDialog(null, "Formato de TELEFONE inválido. Use o formato (XX)XXXXX-XXXX.");
        return false;
    }
    return true;
}
    
    //Validar Registro geral
    
    private boolean validarCpf(String Rg) {
    
    if (!Rg.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")) {
       
    JOptionPane.showMessageDialog(null, "Formato do Numero do Documento inválido. Use o formato XX.XXX.XXX/X.");
        return false;
    }
    return true;
} 
     //Validar Numeros inteiros
   private boolean validarInteiro(int numero) {
    
    if ( numero < 0 || numero > 999) {
        JOptionPane.showMessageDialog(null, "Formato de ID de Funcionário Inválido. Utilize um número entre 0 e 999.");
        return false;
    }
    return true;
}

}
