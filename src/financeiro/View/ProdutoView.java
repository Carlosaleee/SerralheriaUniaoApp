
/**
* @author Carlos Alexandre Da Silva
* @version 1.0
* @since Primeira versão
*/

package financeiro.View;

import financeiro.Dao.ProdutoDao;
import financeiro.Bens.Produto;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class ProdutoView extends javax.swing.JFrame {

   
    public ProdutoView() {
        initComponents();
        setTitle("Cdastro de Produtos - Sacola");
        geraAcessbilidade();
    }
     public void geraAcessbilidade(){
        
        btnAdicionar.setMnemonic(KeyEvent.VK_A);
        btnLimpar.setMnemonic(KeyEvent.VK_L);
        btnVoltar.setMnemonic(KeyEvent.VK_V);
        btnListagem.setMnemonic(KeyEvent.VK_I);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jLabel27 = new javax.swing.JLabel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        btnAdicionar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtValorMetroQuadrado = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtLargura = new javax.swing.JTextField();
        txtValorUnitario = new javax.swing.JTextField();
        txtEsquadriaId = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtVendaId = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLayeredPane6.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("+ Produto");
        jLabel27.setToolTipText("Adicionar Produtos a Venda");

        jLayeredPane6.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLayeredPane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnAdicionar.setBackground(new java.awt.Color(0, 0, 0));
        btnAdicionar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setToolTipText("Adicionar Produto ");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

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
        btnListagem.setToolTipText("Listar produtos adicionados");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Retorna ao Menu Inicial.");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLayeredPane7.setLayer(btnAdicionar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(btnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(btnListagem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnLimpar)
                    .addComponent(btnListagem)
                    .addComponent(btnVoltar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLayeredPane3.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Valor M² :");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Altura :");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Quantidade :");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Largura :");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("EsquadriaId :");

        txtValorMetroQuadrado.setForeground(new java.awt.Color(0, 0, 0));
        txtValorMetroQuadrado.setToolTipText("Digite o Valor do Metro²");
        txtValorMetroQuadrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtValorMetroQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorMetroQuadradoActionPerformed(evt);
            }
        });

        txtSubTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtSubTotal.setToolTipText("Digite o SubTotal.");
        txtSubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });

        txtQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        txtQuantidade.setToolTipText("Digite a quantidade");
        txtQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        txtProduto.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto.setToolTipText("Digite o Nome da Esquadria");
        txtProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Produto :");

        txtLargura.setForeground(new java.awt.Color(0, 0, 0));
        txtLargura.setToolTipText("Digite a Largura");
        txtLargura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtLargura.setNextFocusableComponent(txtValorUnitario);

        txtValorUnitario.setForeground(new java.awt.Color(0, 0, 0));
        txtValorUnitario.setToolTipText("Digite o Valor Unitario.");
        txtValorUnitario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtValorUnitario.setNextFocusableComponent(txtVendaId);

        txtEsquadriaId.setForeground(new java.awt.Color(0, 0, 0));
        txtEsquadriaId.setToolTipText("Digite o Id da Esquadria");
        txtEsquadriaId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtEsquadriaId.setNextFocusableComponent(txtSubTotal);

        jLabel37.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Adicionar  Produtos ao Carrinho :");
        jLabel37.setToolTipText("Preencha o Formulário");

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 0, 51));
        jLabel38.setText("Dados do Produto :");

        txtVendaId.setForeground(new java.awt.Color(0, 0, 0));
        txtVendaId.setToolTipText("Digite o Id do Funcionario");
        txtVendaId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtVendaId.setNextFocusableComponent(txtEsquadriaId);
        txtVendaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendaIdActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("VendaId :");

        txtAltura.setForeground(new java.awt.Color(0, 0, 0));
        txtAltura.setToolTipText("Digite a Altura");
        txtAltura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtAltura.setNextFocusableComponent(txtLargura);
        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 0, 51));
        jLabel40.setText("Sub Total :");

        jLabel41.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Valor Unitario :");

        jLayeredPane3.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtValorMetroQuadrado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtSubTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtLargura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtValorUnitario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtEsquadriaId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtVendaId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtAltura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel41, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane3Layout.createSequentialGroup()
                                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel36))
                                    .addGap(30, 30, 30)
                                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtValorMetroQuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                                    .addGap(41, 41, 41)
                                                    .addComponent(jLabel40)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                                    .addGap(55, 55, 55)
                                                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel34)
                                                        .addComponent(jLabel39))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtEsquadriaId, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                                .addComponent(jLabel32)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                                .addComponent(jLabel41)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel30))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtVendaId, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel37)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorMetroQuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVendaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(txtEsquadriaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane3)
                    .addComponent(jLayeredPane7)
                    .addComponent(jLayeredPane6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
      
        if (!emptyFields() && validarNumInteiro(txtQuantidade.getText()) 
                           && validarValor(txtValorMetroQuadrado.getText()) 
                           && validarMedida(txtAltura.getText()) 
                           && validarMedida(txtLargura.getText())
                           && validarValor(txtValorUnitario.getText())
                           && validarNumInteiro(txtVendaId.getText())
                           && validarNumInteiro(txtEsquadriaId.getText())
                           && validarValor(txtSubTotal.getText()))
        
        
        {
            
            String produto = txtProduto.getText();
            String quantidade = txtQuantidade.getText();
            String valorMetroQuadrado = txtValorMetroQuadrado.getText();
            
            String altura = txtAltura.getText();
            String largura = txtLargura.getText();
            String valorUnitario = txtValorUnitario.getText();
            
            String vendaId = txtVendaId.getText();
            String esquadriaId = txtEsquadriaId.getText();
            
            String subTotal = txtSubTotal.getText();
            
            Produto novoProduto = new Produto();

            novoProduto.setProduto(produto);
            novoProduto.setQuantidade(quantidade);
            novoProduto.setValorMetroQuadrado(valorMetroQuadrado);
            
            novoProduto.setAltura(altura);
            novoProduto.setLargura(largura);
            novoProduto.setValorUnitario(valorUnitario);
            
            novoProduto.setVendaId(vendaId);
            novoProduto.setEsquadriaId(esquadriaId);
            novoProduto.setSubTotal(subTotal);

            ProdutoDao produtoDao = new ProdutoDao();
            produtoDao.inserir(novoProduto);

            
            JOptionPane.showMessageDialog(null, "Os seguintes dados foram cadastrados com sucesso: \n"
                    + "\nProduto: " + txtProduto.getText()
                    + "\nQuantidade: " + txtQuantidade.getText()
                    + "\nValor M²: " + txtValorMetroQuadrado.getText()
                    + "\nAltura: " + txtAltura.getText()
                    + "\nLargura: " + txtLargura.getText()
                    + "\nValor Unitario: " + txtValorUnitario.getText()
                    + "\nVendaId: " + txtVendaId.getText()
                    + "\nEsquadriaId: " + txtEsquadriaId.getText()
                    + "\nSubTotal: " + txtSubTotal.getText()
                    
                   
            );
        
      /*  txtProduto.setText("");
        txtQuantidade.setText("");
        txtValorMetroQuadrado.setText("");
        txtAltura.setText("");
        txtLargura.setText("");
        txtValorUnitario.setText("");
        txtVendaId.setText("");
        txtEsquadriaId.setText("");
        txtSubTotal.setText("");

        txtProduto.requestFocus(); */
        } 
         
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtValorMetroQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorMetroQuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorMetroQuadradoActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtVendaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendaIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendaIdActionPerformed

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
   
        txtProduto.setText("");
        txtQuantidade.setText("");
        txtValorMetroQuadrado.setText("");
        txtAltura.setText("");
        txtLargura.setText("");
        txtValorUnitario.setText("");
        txtVendaId.setText("");
        txtEsquadriaId.setText("");
        txtSubTotal.setText("");

        txtProduto.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
       FormProdutoView telaProduto = new FormProdutoView();
       telaProduto.setVisible(true);
    }//GEN-LAST:event_btnListagemActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
            dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtEsquadriaId;
    private javax.swing.JTextField txtLargura;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtValorMetroQuadrado;
    private javax.swing.JTextField txtValorUnitario;
    private javax.swing.JTextField txtVendaId;
    // End of variables declaration//GEN-END:variables

//Metodo empty
    
    private boolean emptyFields(){
     
     boolean empty = true; 
   
     if(txtProduto.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Produto não pode ser vazio.");
     } else if(txtQuantidade.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Quantidade não pode ser vazio.");
     } else if(txtValorMetroQuadrado.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Valor M² não pode ser vazio.");
     } else if(txtAltura.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Altura não pode ser vazio.");
     } else if(txtLargura.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Largura não pode ser vazio.");
     } else if(txtValorUnitario.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Valor Unitario não pode ser vazio.");
     } else if(txtVendaId.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO!Venda Id não pode ser vazio.");
     } else if(txtEsquadriaId.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! EsquadriaId não pode ser vazio.");
     } else if(txtSubTotal.getText().trim().isEmpty()){
        
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO!SubTotal não pode ser vazio.");
     } else{
         
         empty = false;
     }
     
     return empty;
  }
  
  // Validação de numero inteiro

  private boolean validarNumInteiro(String quantidade) {
    if (!quantidade.matches("^[1-9][0-9]{0,2}$")) {
        JOptionPane.showMessageDialog(null, "Digite um número de 1 a 999.");
        return false;
    }
    return true;
}


// Validação Valor total
    private boolean validarValor(String valorTotal) {
        
    if (!valorTotal.matches("\\d{1,3}(\\.\\d{3})*(,\\d{2})?")) {
        JOptionPane.showMessageDialog(null, "Formato do valor inválido. Use o formato 00.000,00.");
        return false;
    }
    return true;
}


// Validação de Medida
    
   private boolean validarMedida(String Medida) {
    if (!Medida.matches("\\d{1,2},\\d{1,2}")) {
        JOptionPane.showMessageDialog(null, "Formato inválido para medida. Use o formato 00,00.");
        return false;
    }
    return true;
}


}
