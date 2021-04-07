
package view;

import controler.ListagemTarefaControler;
import dao.tarefaDAO;
import dao.conexao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.tarefa;
import org.postgresql.core.Parser;
import table.TarefaTableModel;

public class TelaListagemTarefa extends javax.swing.JFrame {

    private final ListagemTarefaControler controller;
  
    public TelaListagemTarefa() throws SQLException {
        initComponents();
        tbTarefa.setModel(new TarefaTableModel(new tarefaDAO(new conexao().getConnection()).listarTodos()));
        
        controller = new ListagemTarefaControler(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numeroField = new javax.swing.JTextField();
        tituloFiled = new javax.swing.JTextField();
        responsavelBox = new javax.swing.JComboBox<>();
        situacaoBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTarefa = new javax.swing.JTable();
        excluirButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPrioridade = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtDeadline = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        concluirButton = new javax.swing.JButton();
        buscarRes = new javax.swing.JButton();
        buscarSit = new javax.swing.JButton();
        cadTar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pesquisar por Número:");

        jLabel2.setText("Pesquisae por Título/Descrição:");

        jLabel3.setText("Pesquisar por Responsável:");

        jLabel4.setText("Pesquisar por Situação:");

        numeroField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numeroFieldKeyPressed(evt);
            }
        });

        tituloFiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tituloFiledKeyPressed(evt);
            }
        });

        responsavelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "João", "Carlos", "José" }));
        responsavelBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                responsavelBoxMouseClicked(evt);
            }
        });

        situacaoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em andamento", "Concluída" }));

        tbTarefa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTarefaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTarefa);

        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Título:");

        jLabel6.setText("Descrição:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        jLabel7.setText("Responsável:");

        txtResponsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "João", "Carlos", "José" }));

        jLabel8.setText("Prioridade:");

        txtPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Média", "Alta" }));

        jLabel9.setText("Deadline:");

        txtDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel10.setText("Número:");

        concluirButton.setText("Concluir");
        concluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirButtonActionPerformed(evt);
            }
        });

        buscarRes.setText("Buscar Responsável");
        buscarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarResActionPerformed(evt);
            }
        });

        buscarSit.setText("Buscar Situação");
        buscarSit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarSitActionPerformed(evt);
            }
        });

        cadTar.setText("Cadastrar");
        cadTar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadTarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(concluirButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluirButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cadTar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTitulo)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResponsavel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrioridade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(numeroField, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tituloFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscarRes, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(responsavelBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarSit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(situacaoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tituloFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(responsavelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(situacaoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarRes)
                    .addComponent(buscarSit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concluirButton)
                    .addComponent(excluirButton)
                    .addComponent(cadTar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            controller.atualizarTarefa();
            tbTarefa.setModel(new TarefaTableModel(new tarefaDAO(new conexao().getConnection()).listarTodos()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListagemTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTarefaMouseClicked
        
        tarefa tar = new tarefa();
        String x = (getTbTarefa().getValueAt(getTbTarefa().getSelectedRow(), TarefaTableModel.NUMERO).toString());
        tar.setNumero(Integer.parseInt(x));
        txtNumero.setText(x);
       
    }//GEN-LAST:event_tbTarefaMouseClicked

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        int numero = Integer.parseInt(txtNumero.getText());
        try {
            controller.excluirTarefa(numero);
            tbTarefa.setModel(new TarefaTableModel(new tarefaDAO(new conexao().getConnection()).listarTodos()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListagemTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluirButtonActionPerformed

    private void concluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirButtonActionPerformed
        
        int numero = Integer.parseInt(txtNumero.getText());
        try {
            controller.concluirTarefa(numero);
            tbTarefa.setModel(new TarefaTableModel(new tarefaDAO(new conexao().getConnection()).listarTodos()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListagemTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_concluirButtonActionPerformed

    private void numeroFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroFieldKeyPressed
        
        String pes_titulo = numeroField.getText();
        try {
            tbTarefa.setModel(new TarefaTableModel(new tarefaDAO(new conexao().getConnection()).listarTodosNumeros(pes_titulo)));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListagemTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_numeroFieldKeyPressed

    private void tituloFiledKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tituloFiledKeyPressed
        String pes_titulo = tituloFiled.getText();
        try {
            tbTarefa.setModel(new TarefaTableModel(new tarefaDAO(new conexao().getConnection()).listarTodosTitulo(pes_titulo)));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListagemTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tituloFiledKeyPressed

    private void responsavelBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_responsavelBoxMouseClicked
        
    }//GEN-LAST:event_responsavelBoxMouseClicked

    private void buscarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarResActionPerformed
        String pes_titulo = (String) responsavelBox.getSelectedItem();
        try {
            tbTarefa.setModel(new TarefaTableModel(new tarefaDAO(new conexao().getConnection()).listarTodosResponsavel(pes_titulo)));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListagemTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarResActionPerformed

    private void buscarSitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarSitActionPerformed
        String pes_titulo = (String) situacaoBox.getSelectedItem();
        try {
            tbTarefa.setModel(new TarefaTableModel(new tarefaDAO(new conexao().getConnection()).listarTodosSituacao(pes_titulo)));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListagemTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarSitActionPerformed

    private void cadTarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadTarActionPerformed
        controller.cadastrarTarefaVisivel();
    }//GEN-LAST:event_cadTarActionPerformed


    /*public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagemTarefa().setVisible(true);
            }
        });
    }*/

    public JTextField getNumeroField() {
        return numeroField;
    }

    public void setNumeroField(JTextField numeroField) {
        this.numeroField = numeroField;
    }

    public JComboBox<String> getResponsavelBox() {
        return responsavelBox;
    }

    public void setResponsavelBox(JComboBox<String> responsavelBox) {
        this.responsavelBox = responsavelBox;
    }

    public JComboBox<String> getSituacaoBox() {
        return situacaoBox;
    }

    public void setSituacaoBox(JComboBox<String> situacaoBox) {
        this.situacaoBox = situacaoBox;
    }

    public JTextField getTituloFiled() {
        return tituloFiled;
    }

    public void setTituloFiled(JTextField tituloFiled) {
        this.tituloFiled = tituloFiled;
    }

    public JTable getTbTarefa() {
        return tbTarefa;
    }

    public void setTbTarefa(JTable tbTarefa) {
        this.tbTarefa = tbTarefa;
    }

    public JFormattedTextField getTxtDeadline() {
        return txtDeadline;
    }

    public void setTxtDeadline(JFormattedTextField txtDeadline) {
        this.txtDeadline = txtDeadline;
    }

    public JTextArea getTxtDescricao() {
        return txtDescricao;
    }

    public void setTxtDescricao(JTextArea txtDescricao) {
        this.txtDescricao = txtDescricao;
    }

    public JComboBox<String> getTxtPrioridade() {
        return txtPrioridade;
    }

    public void setTxtPrioridade(JComboBox<String> txtPrioridade) {
        this.txtPrioridade = txtPrioridade;
    }

    public JComboBox<String> getTxtResponsavel() {
        return txtResponsavel;
    }

    public void setTxtResponsavel(JComboBox<String> txtResponsavel) {
        this.txtResponsavel = txtResponsavel;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public JTextField getTxtNumero() {
        return txtNumero;
    }

    public void setTxtNumero(JTextField txtNumero) {
        this.txtNumero = txtNumero;
    }

    public JButton getConcluirButton() {
        return concluirButton;
    }

    public void setConcluirButton(JButton concluirButton) {
        this.concluirButton = concluirButton;
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarRes;
    private javax.swing.JButton buscarSit;
    private javax.swing.JButton cadTar;
    private javax.swing.JButton concluirButton;
    private javax.swing.JButton excluirButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numeroField;
    private javax.swing.JComboBox<String> responsavelBox;
    private javax.swing.JComboBox<String> situacaoBox;
    private javax.swing.JTable tbTarefa;
    private javax.swing.JTextField tituloFiled;
    private javax.swing.JFormattedTextField txtDeadline;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JComboBox<String> txtPrioridade;
    private javax.swing.JComboBox<String> txtResponsavel;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
