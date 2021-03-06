/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFilme;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelFilme;
import util.Formatador;

/**
 *
 * @author Rodrigo Desktop
 */
public class ViewCadFilme extends javax.swing.JFrame {

    ArrayList<ModelFilme> listaModelFilme = new ArrayList<>();
    controller.ControllerFilme controllerFilme = new ControllerFilme();
    ModelFilme modelFilme = new ModelFilme();
    String SalvarAlterar;
    Formatador formatador = new Formatador();
    /**
     * Creates new form ViewCadFilme
     */
    public ViewCadFilme() {
        initComponents();
        carregarFilmes();
        setLocationRelativeTo(null);
        habilitarDesabilitarCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LGenero = new javax.swing.JLabel();
        Caixa_Genero = new javax.swing.JComboBox<>();
        LAno = new javax.swing.JLabel();
        LIdentificador = new javax.swing.JLabel();
        CIndentificador = new javax.swing.JTextField();
        LTitulo = new javax.swing.JLabel();
        CTitulo = new javax.swing.JTextField();
        LDiretor = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Cadast_Filme = new javax.swing.JLabel();
        CDiretor = new javax.swing.JTextField();
        LValLoc = new javax.swing.JLabel();
        Cvalor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Filme = new javax.swing.JTable();
        CPesquisa = new javax.swing.JTextField();
        LPesquisa = new javax.swing.JLabel();
        ButPesquisa = new javax.swing.JButton();
        ButCancelar = new javax.swing.JButton();
        ButNovo = new javax.swing.JButton();
        ButAlterar = new javax.swing.JButton();
        ButExcluir = new javax.swing.JButton();
        ButSalvar = new javax.swing.JButton();
        CAno = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LGenero.setText("Gênero");

        Caixa_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ação", "Animação", "Aventura", "Comédia", "Documentário", "Drama", "Espionagem", "Erótico", "Faroeste", "Ficção científica", "Série", "Guerra", "Musical", "Policial", "Romance", "Suspense", "Terror" }));

        LAno.setText("Ano");

        LIdentificador.setText("Identificador");

        CIndentificador.setEditable(false);
        CIndentificador.setEnabled(false);

        LTitulo.setText("Título");

        CTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTituloActionPerformed(evt);
            }
        });

        LDiretor.setText("Diretor");

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        Cadast_Filme.setFont(new java.awt.Font("NewsGoth Lt BT", 1, 24)); // NOI18N
        Cadast_Filme.setForeground(new java.awt.Color(255, 255, 255));
        Cadast_Filme.setText("Cadastro de Filme");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadast_Filme)
                .addContainerGap(814, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(Cadast_Filme, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        LValLoc.setText("Valor de locação");

        tbl_Filme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Gênero", "Diretor", "Ano", "Valor de Locação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Filme);
        if (tbl_Filme.getColumnModel().getColumnCount() > 0) {
            tbl_Filme.getColumnModel().getColumn(0).setMinWidth(20);
            tbl_Filme.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbl_Filme.getColumnModel().getColumn(1).setMinWidth(200);
            tbl_Filme.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        LPesquisa.setText("Pesquisar:");

        ButPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/black_view.png"))); // NOI18N
        ButPesquisa.setText(" Pesquisar");
        ButPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButPesquisaActionPerformed(evt);
            }
        });

        ButCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/symbol_multiplication.gif"))); // NOI18N
        ButCancelar.setText("Cancelar");
        ButCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCancelarActionPerformed(evt);
            }
        });

        ButNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Netvibes_16x16.png"))); // NOI18N
        ButNovo.setText("Novo");
        ButNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButNovoActionPerformed(evt);
            }
        });

        ButAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/document_edit.gif"))); // NOI18N
        ButAlterar.setText("Alterar");
        ButAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAlterarActionPerformed(evt);
            }
        });

        ButExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/black_delete.png"))); // NOI18N
        ButExcluir.setText("Excluir");
        ButExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirActionPerformed(evt);
            }
        });

        ButSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save.png"))); // NOI18N
        ButSalvar.setText("Salvar");
        ButSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSalvarActionPerformed(evt);
            }
        });

        try {
            CAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LIdentificador)
                            .addComponent(LTitulo)
                            .addComponent(LDiretor)
                            .addComponent(LAno)
                            .addComponent(LValLoc))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(LPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LGenero)
                                        .addGap(25, 25, 25)
                                        .addComponent(Caixa_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ButPesquisa)
                                        .addGap(112, 112, 112))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CIndentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                                        .addComponent(CDiretor))
                                    .addComponent(CAno, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CIndentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LIdentificador)
                        .addGap(18, 18, 18)
                        .addComponent(LTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LDiretor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LGenero)
                        .addComponent(Caixa_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LAno)
                    .addComponent(CAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LValLoc)
                        .addComponent(Cvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LPesquisa)
                        .addComponent(ButPesquisa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButCancelar)
                    .addComponent(ButNovo)
                    .addComponent(ButAlterar)
                    .addComponent(ButExcluir)
                    .addComponent(ButSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTituloActionPerformed

    }//GEN-LAST:event_CTituloActionPerformed

    private void ButNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButNovoActionPerformed
        // TODO add your handling code here:
        habilitarDesabilitarCampos(true);
        SalvarAlterar = "salvar";
    }//GEN-LAST:event_ButNovoActionPerformed

    private void ButSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSalvarActionPerformed
        // TODO add your handling code here:
        if(SalvarAlterar.equals("salvar")){
            this.SalvarFilme();
        }else if(SalvarAlterar.equals("alterar")){
            this.AlterarFilme();
        }
    }//GEN-LAST:event_ButSalvarActionPerformed

    private void ButExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluirActionPerformed
        // TODO add your handling code here:
        // Exclui um produto do banco de dados
        int linha = tbl_Filme.getSelectedRow();
        int pIdFilme = (int) tbl_Filme.getValueAt(linha, 0);
        
        if(controllerFilme.excluirFilmeController(pIdFilme)){
            JOptionPane.showMessageDialog(this, "Filme Excluído com Sucesso!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
            this.carregarFilmes();
            LimparCampos();
            this.habilitarDesabilitarCampos(false);
        }else
            JOptionPane.showMessageDialog(this, "Erro ao Excluir o Filme","ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_ButExcluirActionPerformed

    private void ButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCancelarActionPerformed
        // TODO add your handling code here:
        LimparCampos();
        habilitarDesabilitarCampos(false);
    }//GEN-LAST:event_ButCancelarActionPerformed

    private void ButAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAlterarActionPerformed
        // TODO add your handling code here:
        SalvarAlterar = "alterar";
        int linha = this.tbl_Filme.getSelectedRow();
        try {
        int pIdFilme = (int) this.tbl_Filme.getValueAt(linha, 0);
            // Recupera os dados do banco
            modelFilme = controllerFilme.getFilmeController(pIdFilme);
            // Jogar na interface
            this.CIndentificador.setText(String.valueOf(modelFilme.getIdFilme()));
            this.CTitulo.setText(modelFilme.getFilTitulo());
            this.Caixa_Genero.setSelectedItem(modelFilme.getFilGenero());
            this.CDiretor.setText(modelFilme.getFilDiretor());
            this.CAno.setText(modelFilme.getFilAno());
            this.Cvalor.setText(String.valueOf(modelFilme.getFilValorReserva()));
            habilitarDesabilitarCampos(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!","Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButAlterarActionPerformed

    private void ButPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButPesquisaActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) this.tbl_Filme.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.tbl_Filme.setRowSorter(classificador);
        String texto = CPesquisa.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto,1));
    }//GEN-LAST:event_ButPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadFilme().setVisible(true);
            }
        });
    }
    
    // Preenche a tabela com os filmes cadastrados no banco de dados

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButAlterar;
    private javax.swing.JButton ButCancelar;
    private javax.swing.JButton ButExcluir;
    private javax.swing.JButton ButNovo;
    private javax.swing.JButton ButPesquisa;
    private javax.swing.JButton ButSalvar;
    private javax.swing.JFormattedTextField CAno;
    private javax.swing.JTextField CDiretor;
    private javax.swing.JTextField CIndentificador;
    private javax.swing.JTextField CPesquisa;
    private javax.swing.JTextField CTitulo;
    private javax.swing.JLabel Cadast_Filme;
    private javax.swing.JComboBox<String> Caixa_Genero;
    private javax.swing.JTextField Cvalor;
    private javax.swing.JLabel LAno;
    private javax.swing.JLabel LDiretor;
    private javax.swing.JLabel LGenero;
    private javax.swing.JLabel LIdentificador;
    private javax.swing.JLabel LPesquisa;
    private javax.swing.JLabel LTitulo;
    private javax.swing.JLabel LValLoc;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Filme;
    // End of variables declaration//GEN-END:variables

    private void carregarFilmes() {
        listaModelFilme = controllerFilme.getListaFilmeController();
        DefaultTableModel modelo = (DefaultTableModel) tbl_Filme.getModel();
        modelo.setNumRows(0);
        // inserir filmes na tabela
        int cont = listaModelFilme.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
            listaModelFilme.get(i).getIdFilme(),
            listaModelFilme.get(i).getFilTitulo(),
            listaModelFilme.get(i).getFilGenero(),
            listaModelFilme.get(i).getFilDiretor(),
            listaModelFilme.get(i).getFilAno(),
            listaModelFilme.get(i).getFilValorReserva()
            });
        }
    }

    private void habilitarDesabilitarCampos(boolean condicao) {
        CTitulo.setEnabled(condicao);
        CDiretor.setEnabled(condicao);
        CAno.setEnabled(condicao);
        Cvalor.setEnabled(condicao);
        ButSalvar.setEnabled(condicao);
        Caixa_Genero.setEnabled(condicao);
    }

    private void SalvarFilme() {
        //Salva o produto no banco de dados
        SalvarAlterar = "salvar";
        modelFilme.setFilTitulo(this.CTitulo.getText());
        modelFilme.setFilGenero(this.Caixa_Genero.getSelectedItem().toString());
        modelFilme.setFilDiretor(this.CDiretor.getText());
        modelFilme.setFilAno(this.CAno.getText());
        modelFilme.setFilValorReserva(formatador.converterVirgulaParaPonto(this.Cvalor.getText()));
        if(controllerFilme.salvarFilmeController(modelFilme)>0){
            JOptionPane.showMessageDialog(this, "Cadastro Realizado com sucesso!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
            this.carregarFilmes();
        }else
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar!","ERRO",JOptionPane.ERROR_MESSAGE);
        LimparCampos();
        habilitarDesabilitarCampos(false);
    }

    private void AlterarFilme() {
        //Altera o produto no banco de dados
        SalvarAlterar = "alterar";
        modelFilme.setFilTitulo(this.CTitulo.getText());
        modelFilme.setFilGenero(this.Caixa_Genero.getSelectedItem().toString());
        modelFilme.setFilDiretor(this.CDiretor.getText());
        modelFilme.setFilAno(this.CAno.getText());
        modelFilme.setFilValorReserva(formatador.converterVirgulaParaPonto(this.Cvalor.getText()));
        if(controllerFilme.atualizarFilmeController(modelFilme)){
            JOptionPane.showMessageDialog(this, "Cadastro Alterado com sucesso!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
            this.carregarFilmes();
        }else
            JOptionPane.showMessageDialog(this, "Erro ao Alterar!","ERRO",JOptionPane.ERROR_MESSAGE);
        LimparCampos();
        habilitarDesabilitarCampos(false);
    }

    private void LimparCampos() {
        CTitulo.setText("");
        CDiretor.setText("");
        CAno.setText("");
        Cvalor.setText("");
    }
}
