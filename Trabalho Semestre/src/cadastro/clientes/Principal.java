package cadastro.clientes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * Autor Octavio Augusto da Silva Pereira Cadastro de Clientes, Trabalho
 * Semestral Alg. II
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Clientes> ListaClientes;

    public void carregarTabelaClientes() {

        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "CPF", "Nome"}, 0);
        for (Integer i = 0; i < ListaClientes.size(); i++) {

            modelo.addRow(new Object[]{ListaClientes.get(i).getId(), ListaClientes.get(i).getCpf_Cnpj(),
                ListaClientes.get(i).getNome()});
        }

        tabela_Clientes.setModel(modelo);
    }

    public Principal() {

        initComponents();
        ListaClientes = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TableCadastrarListar = new javax.swing.JTabbedPane();
        Cadastrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cadastro_Clientes_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cadastro_Clientes_Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cadastro_Clientes_RG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cadastro_Clientes_Endereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cadastro_Clientes_Bairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cadastro_Clientes_Cidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cadastro_Clientes_Estado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cadastro_Clientes_Pais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cadastro_Clientes_CEP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cadastro_Clientes_Cpf_Cnpj = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cadastro_Clientes_Nascimento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cadastro_Clientes_NomeFantasia = new javax.swing.JTextField();
        BotaoSalvar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        BotaoExibirClientes = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cadastro_Clientes_Telefone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cadastro_Clientes_E_Mail = new javax.swing.JTextField();
        Listar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Clientes = new javax.swing.JTable();
        botaoEditar_Lista = new javax.swing.JButton();
        botaoExcluir_Lista = new javax.swing.JButton();
        botaoSair_Lista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        cadastro_Clientes_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_Clientes_IDActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        cadastro_Clientes_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_Clientes_NomeActionPerformed(evt);
            }
        });

        jLabel3.setText("RG");

        jLabel4.setText("Endereço");

        cadastro_Clientes_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_Clientes_EnderecoActionPerformed(evt);
            }
        });

        jLabel5.setText("Bairro");

        cadastro_Clientes_Bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_Clientes_BairroActionPerformed(evt);
            }
        });

        jLabel6.setText("Cidade");

        cadastro_Clientes_Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_Clientes_CidadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado");

        jLabel8.setText("Pais");

        jLabel9.setText("CEP");

        jLabel10.setText("CPF / CNPJ");

        cadastro_Clientes_Cpf_Cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_Clientes_Cpf_CnpjActionPerformed(evt);
            }
        });

        jLabel11.setText("Nascimento");

        jLabel12.setText("Nome Fantasia");

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        BotaoCancelar.setText("Cancelar");

        BotaoExibirClientes.setText("Exibir Clientes");
        BotaoExibirClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExibirClientesActionPerformed(evt);
            }
        });

        jLabel14.setText("Telefone");

        jLabel13.setText("E-Mail");

        javax.swing.GroupLayout CadastrarLayout = new javax.swing.GroupLayout(Cadastrar);
        Cadastrar.setLayout(CadastrarLayout);
        CadastrarLayout.setHorizontalGroup(
            CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CadastrarLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel12))
                    .addGroup(CadastrarLayout.createSequentialGroup()
                        .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoExibirClientes))
                    .addGroup(CadastrarLayout.createSequentialGroup()
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastro_Clientes_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(CadastrarLayout.createSequentialGroup()
                                .addComponent(cadastro_Clientes_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(cadastro_Clientes_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastrarLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel10))
                            .addGroup(CadastrarLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(cadastro_Clientes_Cpf_Cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(CadastrarLayout.createSequentialGroup()
                        .addComponent(cadastro_Clientes_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastro_Clientes_NomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastro_Clientes_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastro_Clientes_E_Mail))
                    .addGroup(CadastrarLayout.createSequentialGroup()
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastrarLayout.createSequentialGroup()
                                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cadastro_Clientes_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadastro_Clientes_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)))
                            .addGroup(CadastrarLayout.createSequentialGroup()
                                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadastro_Clientes_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadastro_Clientes_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastrarLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(cadastro_Clientes_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CadastrarLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cadastro_Clientes_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        CadastrarLayout.setVerticalGroup(
            CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastrarLayout.createSequentialGroup()
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastro_Clientes_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastrarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastro_Clientes_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastro_Clientes_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastrarLayout.createSequentialGroup()
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastro_Clientes_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastro_Clientes_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastro_Clientes_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastro_Clientes_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastro_Clientes_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastro_Clientes_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastro_Clientes_Cpf_Cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadastro_Clientes_Telefone)
                        .addComponent(cadastro_Clientes_E_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cadastro_Clientes_NomeFantasia)
                    .addComponent(cadastro_Clientes_Nascimento))
                .addGap(29, 29, 29)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoExibirClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        TableCadastrarListar.addTab("Cadastrar Clientes", Cadastrar);

        tabela_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID", "CPF / CNPJ", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_Clientes);
        if (tabela_Clientes.getColumnModel().getColumnCount() > 0) {
            tabela_Clientes.getColumnModel().getColumn(0).setPreferredWidth(15);
            tabela_Clientes.getColumnModel().getColumn(1).setPreferredWidth(30);
            tabela_Clientes.getColumnModel().getColumn(2).setPreferredWidth(250);
        }

        botaoEditar_Lista.setText("Editar");

        botaoExcluir_Lista.setText("Excluir");

        botaoSair_Lista.setText("Sair");

        javax.swing.GroupLayout ListarLayout = new javax.swing.GroupLayout(Listar);
        Listar.setLayout(ListarLayout);
        ListarLayout.setHorizontalGroup(
            ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
            .addGroup(ListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoEditar_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botaoExcluir_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSair_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListarLayout.setVerticalGroup(
            ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditar_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSair_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableCadastrarListar.addTab("Lista de Clientes", Listar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TableCadastrarListar, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TableCadastrarListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoExibirClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExibirClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoExibirClientesActionPerformed

    private void cadastro_Clientes_Cpf_CnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_Clientes_Cpf_CnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastro_Clientes_Cpf_CnpjActionPerformed

    private void cadastro_Clientes_CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_Clientes_CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastro_Clientes_CidadeActionPerformed

    private void cadastro_Clientes_BairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_Clientes_BairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastro_Clientes_BairroActionPerformed

    private void cadastro_Clientes_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_Clientes_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastro_Clientes_EnderecoActionPerformed

    private void cadastro_Clientes_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_Clientes_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastro_Clientes_NomeActionPerformed

    private void cadastro_Clientes_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_Clientes_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastro_Clientes_IDActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed

        Integer id = Integer.parseInt(cadastro_Clientes_ID.getText());
        Clientes A = new Clientes(id, cadastro_Clientes_Nome.getText(),
                cadastro_Clientes_Endereco.getText(), cadastro_Clientes_Bairro.getText(),
                cadastro_Clientes_Cidade.getText(), cadastro_Clientes_Estado.getText(),
                cadastro_Clientes_CEP.getText(), cadastro_Clientes_Pais.getText(), cadastro_Clientes_Cpf_Cnpj.getText(),
                cadastro_Clientes_Nascimento.getText(), cadastro_Clientes_E_Mail.getText(),
                cadastro_Clientes_NomeFantasia.getText(), cadastro_Clientes_Telefone.getText());
        ListaClientes.add(A);
        carregarTabelaClientes();
    }//GEN-LAST:event_BotaoSalvarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoExibirClientes;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JPanel Cadastrar;
    private javax.swing.JPanel Listar;
    private javax.swing.JTabbedPane TableCadastrarListar;
    private javax.swing.JButton botaoEditar_Lista;
    private javax.swing.JButton botaoExcluir_Lista;
    private javax.swing.JButton botaoSair_Lista;
    private javax.swing.JTextField cadastro_Clientes_Bairro;
    private javax.swing.JTextField cadastro_Clientes_CEP;
    private javax.swing.JTextField cadastro_Clientes_Cidade;
    private javax.swing.JTextField cadastro_Clientes_Cpf_Cnpj;
    private javax.swing.JTextField cadastro_Clientes_E_Mail;
    private javax.swing.JTextField cadastro_Clientes_Endereco;
    private javax.swing.JTextField cadastro_Clientes_Estado;
    private javax.swing.JTextField cadastro_Clientes_ID;
    private javax.swing.JTextField cadastro_Clientes_Nascimento;
    private javax.swing.JTextField cadastro_Clientes_Nome;
    private javax.swing.JTextField cadastro_Clientes_NomeFantasia;
    private javax.swing.JTextField cadastro_Clientes_Pais;
    private javax.swing.JTextField cadastro_Clientes_RG;
    private javax.swing.JTextField cadastro_Clientes_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_Clientes;
    // End of variables declaration//GEN-END:variables
}
