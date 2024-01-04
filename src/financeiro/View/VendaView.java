/**
 * @author Carlos Alexandre Da Silva
 * @version 1.0
 * @since Primeira versão
 */
package financeiro.View;

import financeiro.Dao.VendaDao;
import financeiro.Bens.Venda;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class VendaView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroVendas
     */
    public VendaView() {
        initComponents();
        geraAcessbilidade();
        setTitle("Cadastrar Vendas");
    }

    public void geraAcessbilidade() {

        btnRegistrar.setMnemonic(KeyEvent.VK_R);
        btnLimpar.setMnemonic(KeyEvent.VK_L);
        btnVoltar.setMnemonic(KeyEvent.VK_V);
        btnListagem.setMnemonic(KeyEvent.VK_I);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDataPagamento = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();
        txtDataEntrega = new javax.swing.JTextField();
        txtDataVenda = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTipoPagamento = new javax.swing.JTextField();
        txtNumeroCartao = new javax.swing.JTextField();
        txtFuncionarioId = new javax.swing.JTextField();
        txtClienteId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIdVenda = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNumeroParcelas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtPesquisarId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Data Pagamento :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo Pagamento :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Data Entrega :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nº Cartão :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Pagamento :");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("clienteId :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("funcionarioId :");

        txtDataPagamento.setForeground(new java.awt.Color(0, 0, 0));
        txtDataPagamento.setToolTipText("Digite a Data do Pagamento.");
        txtDataPagamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtDataPagamento.setNextFocusableComponent(txtTipoPagamento);
        txtDataPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPagamentoActionPerformed(evt);
            }
        });

        txtValorTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtValorTotal.setToolTipText("Digite o Valor Total.");
        txtValorTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        txtDataEntrega.setForeground(new java.awt.Color(0, 0, 0));
        txtDataEntrega.setToolTipText("Digite a Data da Entrega.");
        txtDataEntrega.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtDataEntrega.setNextFocusableComponent(txtDataPagamento);
        txtDataEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataEntregaActionPerformed(evt);
            }
        });

        txtDataVenda.setForeground(new java.awt.Color(0, 0, 0));
        txtDataVenda.setToolTipText("Digite a Data da Venda");
        txtDataVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtDataVenda.setNextFocusableComponent(txtDataEntrega);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Data Venda :");

        txtTipoPagamento.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoPagamento.setToolTipText("Tipo do Pagamento. (Cartão, Dinheiro, Pix, Etc)");
        txtTipoPagamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtTipoPagamento.setNextFocusableComponent(txtNumeroCartao);

        txtNumeroCartao.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroCartao.setToolTipText("Digite o Numerodo Cartão. Utilize o formato 000.000.000-00.");
        txtNumeroCartao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtFuncionarioId.setForeground(new java.awt.Color(0, 0, 0));
        txtFuncionarioId.setToolTipText("Digite o Id do Funcionario.");
        txtFuncionarioId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFuncionarioId.setNextFocusableComponent(txtValorTotal);

        txtClienteId.setForeground(new java.awt.Color(0, 0, 0));
        txtClienteId.setToolTipText("Digite o Id do Cliente.");
        txtClienteId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtClienteId.setNextFocusableComponent(txtFuncionarioId);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registrar Venda :");
        jLabel1.setToolTipText("Preencha o Formulário");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("Dados Venda :");

        txtIdVenda.setForeground(new java.awt.Color(0, 0, 0));
        txtIdVenda.setToolTipText("Digite o Id da Venda.");
        txtIdVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtIdVenda.setEnabled(false);
        txtIdVenda.setNextFocusableComponent(txtClienteId);
        txtIdVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVendaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("IdVenda :");

        txtNumeroParcelas.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroParcelas.setToolTipText("Digite onuero de Parcelas.");
        txtNumeroParcelas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNumeroParcelas.setNextFocusableComponent(txtIdVenda);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Valor Total :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nº Parcelas :");

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setToolTipText("Registra a venda no Sistema.");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDataPagamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtValorTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDataEntrega, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDataVenda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtTipoPagamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNumeroCartao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtFuncionarioId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtClienteId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtIdVenda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNumeroParcelas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumeroParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnRegistrar)
                                .addGap(33, 33, 33))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtClienteId, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addComponent(txtFuncionarioId))
                                    .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFuncionarioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(0, 47, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRegistrar)
                                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(txtNumeroParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))))
        );

        jLayeredPane2.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(" Venda");

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
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnLimpar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Limpa o Cadastro");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnListagem.setBackground(new java.awt.Color(0, 0, 0));
        btnListagem.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnListagem.setForeground(new java.awt.Color(255, 255, 255));
        btnListagem.setText("Cadastro");
        btnListagem.setToolTipText("Lista as Vendas armazenadas no Sistema.");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Retorna ao Menu Principal");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Limpa o Cadastro");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Limpa o Cadastro");
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
                .addComponent(btnListagem)
                .addGap(28, 28, 28)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar)
                    .addComponent(btnExcluir)
                    .addComponent(btnListagem)
                    .addComponent(btnEditar))
                .addGap(16, 16, 16))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        btnPesquisar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Limpa o Cadastro");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Pesquisar Venda por ID:");

        txtPesquisarId.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisarId.setToolTipText("Digite a Data da Venda");
        txtPesquisarId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPesquisarId.setNextFocusableComponent(txtDataVenda);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(txtPesquisarId, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnPesquisar)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(jLabel16))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPagamentoActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (!emptyFields() && validarNumInteiro(txtNumeroParcelas.getText())
                && validarNumInteiro(txtClienteId.getText())
                && validarNumInteiro(txtFuncionarioId.getText())
                && validarValor(txtValorTotal.getText())
                && validarData(txtDataVenda.getText())
                && validarData(txtDataEntrega.getText())
                && validarData(txtDataPagamento.getText())) {

            String dataTexto = txtDataVenda.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date dataVenda = null;
            try {
                dataVenda = sdf.parse(dataTexto);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

            String dataTexto02 = txtDataEntrega.getText();
            SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy/MM/dd");
            Date dataEntrega = null;
            try {
                dataEntrega = sdf02.parse(dataTexto02);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

            String dataTexto03 = txtDataPagamento.getText();
            SimpleDateFormat sdf03 = new SimpleDateFormat("yyyy/MM/dd");
            Date dataPagamento = null;
            try {
                dataPagamento = sdf03.parse(dataTexto03);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

            String tipoPagamento = txtTipoPagamento.getText();
            String numeroCartao = txtNumeroCartao.getText();

            int numeroParcelas = Integer.parseInt(txtNumeroParcelas.getText());
            int clienteId = Integer.parseInt(txtClienteId.getText());
            int funcionarioId = Integer.parseInt(txtFuncionarioId.getText());

            String valorTotal = txtValorTotal.getText();

            Venda venda = new Venda();

            venda.setDataVenda(dataVenda);
            venda.setDataEntrega(dataEntrega);
            venda.setDataPagamento(dataPagamento);
            venda.setTipoPagamento(tipoPagamento);
            venda.setNumeroCartao(numeroCartao);
            venda.setNumeroParcelas(numeroParcelas);
            venda.setClienteId(clienteId);
            venda.setFuncionarioId(funcionarioId);
            venda.setValorTotal(valorTotal);

            VendaDao vendaDao = new VendaDao();
            vendaDao.inserir(venda);

            JOptionPane.showMessageDialog(null, "Os seguintes dados foram cadastrados com sucesso: \n"
                    + "\nData da Venda: " + txtDataVenda.getText()
                    + "\nData da Entrega: " + txtDataEntrega.getText()
                    + "\nData do Pagamento: " + txtDataPagamento.getText()
                    + "\nTipo do Pagamento: " + txtTipoPagamento.getText()
                    + "\nNumero do Cartão: " + txtNumeroCartao.getText()
                    + "\nNumero de Parcelas: " + txtNumeroParcelas.getText()
                    + "\nClienteId: " + txtClienteId.getText()
                    + "\nFuncionarioId: " + txtFuncionarioId.getText()
                    + "\nIdValortotal: " + txtValorTotal.getText()
            );

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente.");
        }
          txtDataVenda.setText("");
          txtDataEntrega.setText("");
          txtDataPagamento.setText("");
          
          txtTipoPagamento.setText("");
          txtNumeroCartao.setText("");
          txtNumeroParcelas.setText("");
          
          txtIdVenda.setText("");
          txtClienteId.setText("");
          txtFuncionarioId.setText("");
          
          txtValorTotal.setText("");
          txtDataVenda.requestFocus();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        txtDataVenda.setText("");
        txtDataEntrega.setText("");
        txtDataPagamento.setText("");

        txtTipoPagamento.setText("");
        txtNumeroCartao.setText("");
        txtNumeroParcelas.setText("");

        txtIdVenda.setText("");
        txtClienteId.setText("");
        txtFuncionarioId.setText("");

        txtValorTotal.setText("");
        txtPesquisarId.setText("");
        txtDataVenda.requestFocus();


    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtDataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataEntregaActionPerformed

    private void txtIdVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVendaActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        FormVendaView telaListagem = new FormVendaView();
        telaListagem.setVisible(true);

    }//GEN-LAST:event_btnListagemActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        int idVenda = Integer.parseInt(txtPesquisarId.getText());

        VendaDao vendaDao = new VendaDao();
        Venda venda = vendaDao.getVenda(idVenda);

        if (venda == null) {
            JOptionPane.showMessageDialog(this, "Venda não encontrado!");
        } else {

            txtIdVenda.setText(String.valueOf(venda.getIdVenda())); //linha adicionada

            SimpleDateFormat sdf01 = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada01 = sdf01.format(venda.getDataVenda());
            txtDataVenda.setText(dataFormatada01);

            SimpleDateFormat sdf02 = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada02 = sdf02.format(venda.getDataEntrega());
            txtDataEntrega.setText(dataFormatada02);

            SimpleDateFormat sdf03 = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada03 = sdf03.format(venda.getDataPagamento());
            txtDataPagamento.setText(dataFormatada03);

            txtTipoPagamento.setText(venda.getTipoPagamento());
            txtNumeroCartao.setText(venda.getNumeroCartao());
            txtNumeroParcelas.setText(String.valueOf(venda.getNumeroParcelas()));
            txtClienteId.setText(String.valueOf(venda.getClienteId()));
            txtFuncionarioId.setText(String.valueOf(venda.getFuncionarioId()));

            txtValorTotal.setText(venda.getValorTotal());

        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int idVenda = Integer.parseInt(txtIdVenda.getText());

        VendaDao vendaDao = new VendaDao();
        vendaDao.excluir(idVenda);

        //limpando os campos
        JOptionPane.showMessageDialog(null, "Os seguintes dados foram Excluidos com Sucesso: \n"
                + "\nData da Venda: " + txtDataVenda.getText()
                + "\nData da Entrega: " + txtDataEntrega.getText()
                + "\nData do Pagamento: " + txtDataPagamento.getText()
                + "\nTipo do Pagamento: " + txtTipoPagamento.getText()
                + "\nNumero do Cartão: " + txtNumeroCartao.getText()
                + "\nNumero de Parcelas: " + txtNumeroParcelas.getText()
                + "\nClienteId: " + txtClienteId.getText()
                + "\nFuncionarioId: " + txtFuncionarioId.getText()
                + "\nIdValortotal: " + txtValorTotal.getText()
        );

        //limpando os campos
        txtDataVenda.setText("");
        txtDataEntrega.setText("");
        txtDataPagamento.setText("");

        txtTipoPagamento.setText("");
        txtNumeroCartao.setText("");
        txtNumeroParcelas.setText("");

        txtIdVenda.setText("");
        txtClienteId.setText("");
        txtFuncionarioId.setText("");

        txtValorTotal.setText("");
        txtPesquisarId.setText("");
        txtDataVenda.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String dataTexto = txtDataVenda.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date dataVenda = null;
        try {
            dataVenda = sdf.parse(dataTexto);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        String dataTexto02 = txtDataEntrega.getText();
        SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy/MM/dd");
        Date dataEntrega = null;
        try {
            dataEntrega = sdf02.parse(dataTexto02);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        String dataTexto03 = txtDataPagamento.getText();
        SimpleDateFormat sdf03 = new SimpleDateFormat("yyyy/MM/dd");
        Date dataPagamento = null;
        try {
            dataPagamento = sdf03.parse(dataTexto03);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        String tipoPagamento = txtTipoPagamento.getText();
        String numeroCartao = txtNumeroCartao.getText();

        int numeroParcelas = Integer.parseInt(txtNumeroParcelas.getText());
        int clienteId = Integer.parseInt(txtClienteId.getText());
        int funcionarioId = Integer.parseInt(txtFuncionarioId.getText());

        String valorTotal = txtValorTotal.getText();

        Venda venda = new Venda();

        venda.setDataVenda(dataVenda);
        venda.setDataEntrega(dataEntrega);
        venda.setDataPagamento(dataPagamento);
        venda.setTipoPagamento(tipoPagamento);
        venda.setNumeroCartao(numeroCartao);
        venda.setNumeroParcelas(numeroParcelas);
        venda.setClienteId(clienteId);
        venda.setFuncionarioId(funcionarioId);
        venda.setValorTotal(valorTotal);

        VendaDao vendaDao = new VendaDao();
        vendaDao.editar(venda);

        JOptionPane.showMessageDialog(null, "Os seguintes dados foram Editados com sucesso: \n"
                + "\nData da Venda: " + txtDataVenda.getText()
                + "\nData da Entrega: " + txtDataEntrega.getText()
                + "\nData do Pagamento: " + txtDataPagamento.getText()
                + "\nTipo do Pagamento: " + txtTipoPagamento.getText()
                + "\nNumero do Cartão: " + txtNumeroCartao.getText()
                + "\nNumero de Parcelas: " + txtNumeroParcelas.getText()
                + "\nClienteId: " + txtClienteId.getText()
                + "\nFuncionarioId: " + txtFuncionarioId.getText()
                + "\nIdValortotal: " + txtValorTotal.getText()
        );

        //limpando os campos
        txtDataVenda.setText("");
        txtDataEntrega.setText("");
        txtDataPagamento.setText("");

        txtTipoPagamento.setText("");
        txtNumeroCartao.setText("");
        txtNumeroParcelas.setText("");

        txtIdVenda.setText("");
        txtClienteId.setText("");
        txtFuncionarioId.setText("");

        txtValorTotal.setText("");
        txtPesquisarId.setText("");
        txtDataVenda.requestFocus();

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
                java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new VendaView().setVisible(true);
                }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtDataEntrega;
    private javax.swing.JTextField txtDataPagamento;
    private javax.swing.JTextField txtDataVenda;
    private javax.swing.JTextField txtFuncionarioId;
    private javax.swing.JTextField txtIdVenda;
    private javax.swing.JTextField txtNumeroCartao;
    private javax.swing.JTextField txtNumeroParcelas;
    private javax.swing.JTextField txtPesquisarId;
    private javax.swing.JTextField txtTipoPagamento;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
 private boolean emptyFields() {

        boolean empty = true;

        if (txtFuncionarioId.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! FuncionarioId não pode ser vazio.");
        } else if (txtDataVenda.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data da Venda não pode ser vazio.");
        } else if (txtDataEntrega.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data da Entrega não pode ser vazio.");
        } else if (txtDataPagamento.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data do Pagamento não pode ser vazio.");
        } else if (txtTipoPagamento.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Tipo de Pagamento não pode ser vazio.");
        } else if (txtNumeroCartao.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Numero do Cartão não pode ser vazio.");
        } else if (txtNumeroParcelas.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Numero de Parcelas não pode ser vazio.");
        } else if (txtValorTotal.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Valor Total não pode ser vazio.");
        } else {

            empty = false;
        }

        return empty;
    }

    // Validação do Cartão
    private boolean validarCartao(String numeroCartao) {
        if (!numeroCartao.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}") && !numeroCartao.matches("\\d{11}")) {
            JOptionPane.showMessageDialog(null, "Formato de CPF inválido. Use o formato 999.999.999-99 ou 99999999999.");
            return false;
        }
        return true;
    }

// // Validação Valor total
    private boolean validarValor(String valorTotal) {

        if (!valorTotal.matches("\\d{1,3}(\\.\\d{3})*(,\\d{2})?")) {
            JOptionPane.showMessageDialog(null, "Formato do valor inválido. Use o formato 00.000,00.");
            return false;
        }
        return true;
    }

// Validação de data
    private boolean validarData(String data) {

        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {

            JOptionPane.showMessageDialog(null, "Formato da DATA inválido. Use o formato XX/XX/XXXX.");
            return false;
        }
        return true;
    }

    // Validação de numero inteiro 
    private boolean validarNumInteiro(String quantidade) {
        if (!quantidade.matches("^[1-9][0-9]{0,2}$")) {
            JOptionPane.showMessageDialog(null, "Digite um número de 1 a 999.");
            return false;
        }
        return true;
    }

}
