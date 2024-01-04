package distribuidor.View;

/**
* @author Carlos Alexandre Da Silva
* @version 1.0
* @since Primeira versão
*/




import distribuidor.Beans.Distribuidor;
import distribuidor.Dao.DistribuidorDao;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DistribuidorView extends javax.swing.JFrame {
   
        
    public DistribuidorView() {
           initComponents();
           geraAcessebilidade();
           setTitle("Serralheria União - Distribuidores");
           
    }
    
    public void geraAcessebilidade() {

        btnCadastrar.setMnemonic(KeyEvent.VK_C);
        btnListagem.setMnemonic(KeyEvent.VK_L);
        btnPesquisarNome.setMnemonic(KeyEvent.VK_P);
        btnVoltar.setMnemonic(KeyEvent.VK_V);
        btnExcluir.setMnemonic(KeyEvent.VK_E);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnListagem = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLayeredPane22 = new javax.swing.JLayeredPane();
        lblNome = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtNomeEmpresa = new javax.swing.JTextField();
        txtTelefone01 = new javax.swing.JTextField();
        txtTelefone02 = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtResponsavel = new javax.swing.JTextField();
        txtSetor = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtIdDistribuidor = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        btnPesquisarNome = new javax.swing.JButton();
        btnPesquisarId = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtPesquisarId = new javax.swing.JTextField();
        txtPesquisarNome = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane1.setForeground(new java.awt.Color(0, 0, 0));

        btnListagem.setBackground(new java.awt.Color(0, 0, 0));
        btnListagem.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnListagem.setForeground(new java.awt.Color(255, 255, 255));
        btnListagem.setText("Cadastro");
        btnListagem.setToolTipText("Limpa os Campos Preenchidos");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir a linha Selecionada");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Finaliza Sistema");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnLimpar1.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpar1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnLimpar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar1.setText("Limpar");
        btnLimpar1.setToolTipText("Limpa os Campos Preenchidos");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Limpa os Campos Preenchidos");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(btnListagem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnLimpar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListagem)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar)
                    .addComponent(btnLimpar1)
                    .addComponent(btnEditar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLayeredPane22.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane22.setForeground(new java.awt.Color(0, 0, 0));

        lblNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome Empresa:");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Telefone 01 :");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Telefone  02 :");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("CNPJ :");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Responsavel:");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Setor:");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Cidade :");

        txtNomeEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeEmpresa.setToolTipText("Digite o Nome Da Empresa.");
        txtNomeEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNomeEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEmpresaActionPerformed(evt);
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

        txtCnpj.setForeground(new java.awt.Color(0, 0, 0));
        txtCnpj.setToolTipText("Digite o numero da CNPJ. Utilize o Formato XXX.XXX.XXX-XX");
        txtCnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtResponsavel.setForeground(new java.awt.Color(0, 0, 0));
        txtResponsavel.setToolTipText("Digite o Nome do Responsavel");
        txtResponsavel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsavelActionPerformed(evt);
            }
        });

        txtSetor.setForeground(new java.awt.Color(0, 0, 0));
        txtSetor.setToolTipText("Digite o Setor");
        txtSetor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 51));
        jLabel34.setText("Dados da empresa :");

        txtIdDistribuidor.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtIdDistribuidor.setForeground(new java.awt.Color(0, 0, 0));
        txtIdDistribuidor.setToolTipText("Digite o Id do Distribuidor");
        txtIdDistribuidor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtIdDistribuidor.setEnabled(false);

        jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("IdDistribuidor :");

        jLabel33.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 51));
        jLabel33.setText("Preencha o Formulário :");
        jLabel33.setToolTipText("Preencha o Formulário");

        txtCidade.setForeground(new java.awt.Color(0, 0, 0));
        txtCidade.setToolTipText("Digite a Cidade");
        txtCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Cadastrar a Empresa");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLayeredPane22.setLayer(lblNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtNomeEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtTelefone01, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtTelefone02, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtCnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtResponsavel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtSetor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtIdDistribuidor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(txtCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane22.setLayer(btnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane22Layout = new javax.swing.GroupLayout(jLayeredPane22);
        jLayeredPane22.setLayout(jLayeredPane22Layout);
        jLayeredPane22Layout.setHorizontalGroup(
            jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane22Layout.createSequentialGroup()
                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane22Layout.createSequentialGroup()
                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(lblNome)
                            .addComponent(jLabel28)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                .addComponent(txtTelefone01, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefone02, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))
                            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                .addComponent(txtNomeEmpresa)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSetor, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                    .addComponent(txtResponsavel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))))
                .addGap(14, 14, 14))
        );
        jLayeredPane22Layout.setVerticalGroup(
            jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane22Layout.createSequentialGroup()
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel34))
                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(txtTelefone02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26)))
                .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addGap(26, 26, 26))))
        );

        jLayeredPane2.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Distribuidores");

        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane3.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane3.setForeground(new java.awt.Color(0, 0, 0));

        btnPesquisarNome.setBackground(new java.awt.Color(0, 0, 0));
        btnPesquisarNome.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnPesquisarNome.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarNome.setText("Pesquisar");
        btnPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarNomeActionPerformed(evt);
            }
        });

        btnPesquisarId.setBackground(new java.awt.Color(0, 0, 0));
        btnPesquisarId.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnPesquisarId.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarId.setText("Pesquisar");
        btnPesquisarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarIdActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Pesquisar por Nome :");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Pesuisar po ID :");

        txtPesquisarId.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisarId.setToolTipText("Digite o Nome Da Empresa.");
        txtPesquisarId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPesquisarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarIdActionPerformed(evt);
            }
        });

        txtPesquisarNome.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisarNome.setToolTipText("Digite o Nome Da Empresa.");
        txtPesquisarNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarNomeActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(btnPesquisarNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(btnPesquisarId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtPesquisarId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtPesquisarNome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPesquisarId, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(txtPesquisarNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarId)
                    .addComponent(txtPesquisarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarNome)
                    .addComponent(jLabel29)
                    .addComponent(txtPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane22)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane3))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponsavelActionPerformed

    private void txtTelefone02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone02ActionPerformed

    private void txtTelefone01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone01ActionPerformed

    private void txtNomeEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEmpresaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    
        int idDistribuidor = Integer.parseInt(txtIdDistribuidor.getText());
                
                DistribuidorDao distribuidorDao = new DistribuidorDao();
                distribuidorDao.excluir(idDistribuidor);
                
                //limpando os campos
                
                txtIdDistribuidor.setText("");
                txtNomeEmpresa.setText("");
                txtTelefone01.setText("");
                txtTelefone02.setText("");
                txtCnpj.setText("");
                txtResponsavel.setText("");
                txtSetor.setText("");
                txtCidade.setText("");

                txtNomeEmpresa.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        FormDistribuidorView fre = new FormDistribuidorView();
        fre.setVisible(true);
    }//GEN-LAST:event_btnListagemActionPerformed

    private void btnPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNomeActionPerformed

                String nomeEmpresa = txtPesquisarNome.getText();
                  
                DistribuidorDao distribuidorDao = new DistribuidorDao();
                Distribuidor distribuidor = distribuidorDao.getNomeEmpresa(nomeEmpresa);
                
                if (distribuidor == null) {
                    JOptionPane.showMessageDialog(this, "Empresa não encontrado!");
                } 
                else {      
                    
                    txtIdDistribuidor.setText(String.valueOf(distribuidor.getIdDistribuidor()));
                    txtNomeEmpresa.setText(distribuidor.getNomeEmpresa());
                    txtCnpj.setText(distribuidor.getCnpj());
                    txtTelefone01.setText(distribuidor.getTelefone01());
                    txtTelefone02.setText(distribuidor.getTelefone02());
                    txtResponsavel.setText(distribuidor.getResponsavel());
                    txtSetor.setText(distribuidor.getSetor());
                    txtCidade.setText(distribuidor.getCidade());
                }        
    }//GEN-LAST:event_btnPesquisarNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
 if (!emptyFields()
            
                && validarTelefone(txtTelefone01.getText())
                && validarTelefone(txtTelefone02.getText())
                && validarCNPJ(txtCnpj.getText()))
                
     {
            
            String nomeEmpresa = txtNomeEmpresa.getText();
            String cnpj = txtCnpj.getText();
            String telefone01 = txtTelefone01.getText();
            String telefone02 = txtTelefone02.getText();
            String responsavel = txtResponsavel.getText();
            String setor = txtSetor.getText();
            String cidade = txtCidade.getText();
            
            Distribuidor novoDistribuidor = new Distribuidor();

            novoDistribuidor.setNomeEmpresa(nomeEmpresa);
            novoDistribuidor.setCnpj(cnpj);
            novoDistribuidor.setTelefone01(telefone01);
            
            novoDistribuidor.setTelefone02(telefone02);
            novoDistribuidor.setResponsavel(responsavel);
            novoDistribuidor.setSetor(setor);
            
            novoDistribuidor.setCidade(cidade);
            
            DistribuidorDao distribuidorDao = new DistribuidorDao();
            distribuidorDao.inserir(novoDistribuidor);

            JOptionPane.showMessageDialog(null, "Os seguintes dados foram cadastrados com sucesso: \n"
                   
                    + "\nDistribuidor: " + nomeEmpresa
                    + "\nCnpj: " + cnpj
                    + "\nTelefone 01: " + telefone01
                    + "\nTelefone 02: " + telefone02
                    + "\nResponsavel: " + responsavel
                    + "\nSetor: " + setor
                    + "\nCidade: " + cidade
                   
            );

          txtIdDistribuidor.setText("");
          txtNomeEmpresa.setText("");
          txtTelefone01.setText("");
          txtTelefone02.setText("");
          txtCnpj.setText("");
          txtResponsavel.setText("");
          txtSetor.setText("");
          txtCidade.setText("");
         
          txtNomeEmpresa.requestFocus(); 
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
                int idDistribuidor = Integer.parseInt(txtIdDistribuidor.getText());
                String nomeEmpresa = txtNomeEmpresa.getText();
                String cnpj = txtCnpj.getText();
                String telefone01 = txtTelefone01.getText();
                String telefone02 = txtTelefone02.getText();
                String responsavel = txtResponsavel.getText();
                String setor = txtSetor.getText();
                String cidade = txtCidade.getText();
                
                        
                Distribuidor novoDistribuidor = new Distribuidor();
                
                novoDistribuidor.setIdDistribuidor(idDistribuidor);
                novoDistribuidor.setNomeEmpresa(nomeEmpresa);
                novoDistribuidor.setCnpj(cnpj);
                novoDistribuidor.setTelefone01(telefone01);

                novoDistribuidor.setTelefone02(telefone02);
                novoDistribuidor.setResponsavel(responsavel);
                novoDistribuidor.setSetor(setor);

                novoDistribuidor.setCidade(cidade);

                DistribuidorDao distribuidorDao = new DistribuidorDao();
                distribuidorDao.editar(novoDistribuidor);

                JOptionPane.showMessageDialog(null, "Os seguintes dados foram Editados com sucesso: \n"
                   
                    + "\nDistribuidor: " + nomeEmpresa
                    + "\nCnpj: " + cnpj
                    + "\nTelefone 01: " + telefone01
                    + "\nTelefone 02: " + telefone02
                    + "\nResponsavel: " + responsavel
                    + "\nSetor: " + setor
                    + "\nCidade: " + cidade
                   
            );

          txtIdDistribuidor.setText("");
          txtNomeEmpresa.setText("");
          txtTelefone01.setText("");
          txtTelefone02.setText("");
          txtCnpj.setText("");
          txtResponsavel.setText("");
          txtSetor.setText("");
          txtCidade.setText("");
         
          txtNomeEmpresa.requestFocus(); 
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarIdActionPerformed
      
        int idDistribuidor = Integer.parseInt(txtPesquisarId.getText());  
            
                DistribuidorDao distribuidorDao = new DistribuidorDao();
                Distribuidor distribuidor = distribuidorDao.getDistribuidor(idDistribuidor);
                
                if (distribuidor == null) {
                    JOptionPane.showMessageDialog(this, "Distribuidor não encontrado!");
                } 
                else {
                    
                    txtIdDistribuidor.setText(String.valueOf(distribuidor.getIdDistribuidor()));
                    txtNomeEmpresa.setText(distribuidor.getNomeEmpresa());
                    txtCnpj.setText(distribuidor.getCnpj());
                    txtTelefone01.setText(distribuidor.getTelefone01());
                    txtTelefone02.setText(distribuidor.getTelefone02());
                    txtResponsavel.setText(distribuidor.getResponsavel());
                    txtSetor.setText(distribuidor.getSetor());
                    txtCidade.setText(distribuidor.getCidade());
                    
                }
    }//GEN-LAST:event_btnPesquisarIdActionPerformed

    private void txtPesquisarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarIdActionPerformed

    private void txtPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarNomeActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(DistribuidorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DistribuidorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DistribuidorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DistribuidorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DistribuidorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnListagem;
    private javax.swing.JButton btnPesquisarId;
    private javax.swing.JButton btnPesquisarNome;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane22;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtIdDistribuidor;
    private javax.swing.JTextField txtNomeEmpresa;
    private javax.swing.JTextField txtPesquisarId;
    private javax.swing.JTextField txtPesquisarNome;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtSetor;
    private javax.swing.JTextField txtTelefone01;
    private javax.swing.JTextField txtTelefone02;
    // End of variables declaration//GEN-END:variables

    // Metodo
    
    private boolean emptyFields(){
     /*
      * Variável empty assume “true” por padrão e só vai mudar o seu estado
      * após verificarmos se todos os campos estão preenchidos. É ela que
      * retornamos ao final do método.
     */
     boolean empty = true; 
     
     if(txtNomeEmpresa.getText().trim().isEmpty()){
         
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Nome da Empresa não pode ser vazio.");
     } else if(txtTelefone01.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Telefone 01 não pode ser vazio.");
     } else if(txtTelefone02.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Telefone 02 não pode ser vazio.");
     }   else if(txtCnpj.getText().trim().isEmpty()){
        
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Cnpj não pode ser vazio.");
     } else if(txtResponsavel.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Responsavel não pode ser vazio.");
     } else if(txtSetor.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Setor não pode ser vazio.");
     }   else if(txtCidade.getText().trim().isEmpty()){
         
        
         
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
    
    private boolean validarCNPJ (String cnpj) {
    
    if (!cnpj.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")) {
       
    JOptionPane.showMessageDialog(null, "Formato do Numero do Documento inválido. Use o formato XX.XXX.XXX-XX.");
        return false;
    }
    return true;
} 
     //Validar Numeros inteiros
   private boolean validarInteiro(int idDistribuidor) {
    
    if (idDistribuidor < 0 || idDistribuidor > 999) {
        JOptionPane.showMessageDialog(null, "Formato de ID de Distribuidor Inválido. Utilize um número entre 0 e 999.");
        return false;
    }
    return true;
}


}
