/**
* @author Carlos Alexandre Da Silva
* @version 1.0
* @since Primeira versão
*/

package esquadria.View;

import distribuidor.View.FormDistribuidorView;
import esquadria.Beans.Esquadria;
import esquadria.Dao.EsquadriaDao;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class EsquadriaView extends javax.swing.JFrame {

 

    public EsquadriaView() {

        initComponents();
        geraAcessebilidade();
        setTitle("Cadastro de Esquadrias");
        
                        
    }

    public void geraAcessebilidade() {

        btnCadastrar.setMnemonic(KeyEvent.VK_C);
        btnLimpar.setMnemonic(KeyEvent.VK_L);
        btnPesquisar.setMnemonic(KeyEvent.VK_P);
        btnVoltar.setMnemonic(KeyEvent.VK_V);
        btnExcluir.setMnemonic(KeyEvent.VK_E);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane24 = new javax.swing.JLayeredPane();
        lblNome2 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtNomeEsquadria = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtDistribuidorId = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtIdEsquadria = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisaId = new javax.swing.JTextField();
        txtPesquisarNome = new javax.swing.JTextField();
        btnPesquisarNome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de Esquadrias");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLayeredPane24.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane24.setForeground(new java.awt.Color(0, 0, 0));

        lblNome2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(0, 0, 0));
        lblNome2.setText("Nome Esquadria:");

        jLabel40.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Descrição :");

        jLabel41.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Preço :");

        jLabel47.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("DistribuidorId :");

        txtNomeEsquadria.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeEsquadria.setToolTipText("Digite o Nome");
        txtNomeEsquadria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNomeEsquadria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtPreco.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco.setToolTipText("Digite o Telefone. Utilize o formato (XX)XXXXX-XXXX");
        txtPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone02ActionPerformed(evt);
            }
        });

        txtDistribuidorId.setForeground(new java.awt.Color(0, 0, 0));
        txtDistribuidorId.setToolTipText("Digite a Cidade");
        txtDistribuidorId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 0, 51));
        jLabel48.setText("Dados da Esquadria :");

        jLabel49.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 0, 51));
        jLabel49.setText("Preencha o Cadastro :");
        jLabel49.setToolTipText("Preencha o Formulário");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setViewportView(txtDescricao);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("idEsquadria :");

        txtIdEsquadria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtIdEsquadria.setEnabled(false);

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Cadastra a Esquadria");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLayeredPane24.setLayer(lblNome2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(jLabel40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(jLabel41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(jLabel47, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(txtNomeEsquadria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(txtPreco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(txtDistribuidorId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(jLabel48, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(jLabel49, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(txtIdEsquadria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane24.setLayer(btnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane24Layout = new javax.swing.GroupLayout(jLayeredPane24);
        jLayeredPane24.setLayout(jLayeredPane24Layout);
        jLayeredPane24Layout.setHorizontalGroup(
            jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane24Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane24Layout.createSequentialGroup()
                        .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane24Layout.createSequentialGroup()
                                .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNome2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane24Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel47)
                                            .addComponent(jLabel40))))
                                .addGap(32, 32, 32)
                                .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane24Layout.createSequentialGroup()
                                        .addComponent(txtDistribuidorId, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCadastrar))
                                    .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jLayeredPane24Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtIdEsquadria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                            .addComponent(txtNomeEsquadria)))))
                            .addComponent(jLabel48))
                        .addContainerGap())))
        );
        jLayeredPane24Layout.setVerticalGroup(
            jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane24Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48)
                    .addComponent(txtIdEsquadria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(41, 41, 41)
                .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEsquadria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane24Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane24Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane24Layout.createSequentialGroup()
                        .addGroup(jLayeredPane24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDistribuidorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane24Layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(21, 21, 21))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        btnPesquisar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Pesquisa a Esquadria");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pesquisar po Id: ");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pesquisar por nome:");

        txtPesquisaId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtPesquisarNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnPesquisarNome.setBackground(new java.awt.Color(0, 0, 0));
        btnPesquisarNome.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnPesquisarNome.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarNome.setText("Pesquisar");
        btnPesquisarNome.setToolTipText("Pesquisa a Esquadria");
        btnPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPesquisaId, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(txtPesquisarNome))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnPesquisar)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisarNome)
                        .addGap(14, 14, 14))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPesquisaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnPesquisarNome))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnLimpar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Limpa os Campos Digitados");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Exclui a Esquadria");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Limpa os Campos Digitados");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cadastro");
        btnCadastro.setToolTipText("Limpa os Campos Digitados");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar)
                    .addComponent(btnLimpar)
                    .addComponent(btnEditar)
                    .addComponent(btnCadastro))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLayeredPane24, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (!emptyFields()) {
            
        String nomeEsquadria = txtNomeEsquadria.getText();
        String descricao = txtDescricao.getText();
        String preco = txtPreco.getText();
        String distribuidorId = txtDistribuidorId.getText();
        

        Esquadria novaEsquadria = new Esquadria();
        
        novaEsquadria.setNomeEsquadria(nomeEsquadria);
        novaEsquadria.setDescricao(descricao);
        novaEsquadria.setPreco(preco);
        novaEsquadria.setDistribuidorId(distribuidorId);
        

        EsquadriaDao esquadriaDao = new EsquadriaDao();
        esquadriaDao.inserir(novaEsquadria);

        JOptionPane.showMessageDialog(null, "Os seguintes dados foram cadastrados com sucesso: \n"
                + "\nCargo: " + nomeEsquadria
                + "\nDescrição: " + descricao
                + "\nSalário: " + preco
                 + "\nSalário: " + distribuidorId
               
        );

        txtIdEsquadria.setText("");
        txtNomeEsquadria.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtDistribuidorId.setText("");

        txtNomeEsquadria.requestFocus();
    }
       
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtTelefone02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone02ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNomeActionPerformed
         
        String nomepesquisa = txtPesquisarNome.getText();
                  
                EsquadriaDao esquadriaDao = new EsquadriaDao();
                Esquadria esquadria = esquadriaDao.getPesquisarNome(nomepesquisa);
                
                if (esquadria == null) {
                    JOptionPane.showMessageDialog(this, "Empresa não encontrado!");
                } 
                else {      
                    txtIdEsquadria.setText(String.valueOf(esquadria.getIdEsquadria()));
                    txtNomeEsquadria.setText(esquadria.getNomeEsquadria());
                    txtDescricao.setText(esquadria.getDescricao());
                    txtPreco.setText(esquadria.getPreco());
                    txtDistribuidorId.setText(esquadria.getDistribuidorId());
                    
                }     
       
    }//GEN-LAST:event_btnPesquisarNomeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        int idEsquadria= Integer.parseInt(txtPesquisaId.getText());  
            
                EsquadriaDao esquadriaDao = new EsquadriaDao();
                Esquadria esquadria = esquadriaDao.getEsquadria(idEsquadria);
                
                if (esquadria == null) {
                    JOptionPane.showMessageDialog(this, "Curso não encontrado!");
                } 
                else {
                    
                    txtIdEsquadria.setText(String.valueOf(esquadria.getIdEsquadria()));
                    
                    txtNomeEsquadria.setText(esquadria.getNomeEsquadria());
                    txtDescricao.setText(esquadria.getDescricao());
                    txtPreco.setText(esquadria.getPreco());
                    txtDistribuidorId.setText(esquadria.getDistribuidorId());
                   
                }
       
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
          
        int idEsquadria = Integer.parseInt(txtIdEsquadria.getText());
                
                EsquadriaDao esquadriaDao = new EsquadriaDao();
                esquadriaDao.excluir(idEsquadria);
                
                JOptionPane.showMessageDialog(null, "Os Seguintes Dados foram Excluidos com Sucesso: \n"
                
                 + "\nNomeEsquadria: " + txtNomeEsquadria.getText()
                 + "\nDescrição: " + txtDescricao.getText()
                 + "\nPreço: " + txtPreco.getText()
                 + "\nDistribuidor Id: " + txtDistribuidorId.getText()
                         
           );
                
                //limpando os campos
                
                txtIdEsquadria.setText("");
                txtNomeEsquadria.setText("");
                txtDescricao.setText("");
                txtPreco.setText("");
                txtDistribuidorId.setText("");

                txtNomeEsquadria.requestFocus(); 
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        txtIdEsquadria.setText("");
        txtNomeEsquadria.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtDistribuidorId.setText("");

        txtNomeEsquadria.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        int idEsquadria = Integer.parseInt(txtIdEsquadria.getText());

        String nomeEsquadria = txtNomeEsquadria.getText();
        String descricao = txtDescricao.getText();
        String preco = txtPreco.getText();
        String distribuidorId = txtDistribuidorId.getText();

        Esquadria novaEsquadria = new Esquadria();

        novaEsquadria.setIdEsquadria(idEsquadria);
        novaEsquadria.setNomeEsquadria(nomeEsquadria);
        novaEsquadria.setDescricao(descricao);
        novaEsquadria.setPreco(preco);
        novaEsquadria.setDistribuidorId(distribuidorId);

        EsquadriaDao esquadriaDao = new EsquadriaDao();
        esquadriaDao.editar(novaEsquadria);

        JOptionPane.showMessageDialog(null, "Os seguintes dados foram Editados com sucesso: \n"
                + "\nNome Esquadria: " + nomeEsquadria
                + "\nDescrição: " + descricao
                + "\nPreço: " + preco
                + "\nDistribuidorId: " + distribuidorId
        );

        txtIdEsquadria.setText("");
        txtNomeEsquadria.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtDistribuidorId.setText("");

        txtNomeEsquadria.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        FormEsquadriaView fre = new FormEsquadriaView();
        fre.setVisible(true);                  
        
    }//GEN-LAST:event_btnCadastroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EsquadriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsquadriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsquadriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsquadriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsquadriaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarNome;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtDistribuidorId;
    private javax.swing.JTextField txtIdEsquadria;
    private javax.swing.JTextField txtNomeEsquadria;
    private javax.swing.JTextField txtPesquisaId;
    private javax.swing.JTextField txtPesquisarNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables

    // set
    private boolean emptyFields() {
        /*
      * Variável empty assume “true” por padrão e só vai mudar o seu estado
      * após verificarmos se todos os campos estão preenchidos. É ela que
      * retornamos ao final do método.
         */
        boolean empty = true;

        if (txtNomeEsquadria.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Nome da Esquadria não pode ser vazio.");
        } else if (txtDescricao.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Descrição não pode ser vazio.");
        } else if (txtPreco.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Preço não pode ser vazio.");
        } else if (txtDistribuidorId.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! DistribuidorId  não pode ser vazio.");
        } else {

            empty = false;
        }

        return empty;
    }

   

}
