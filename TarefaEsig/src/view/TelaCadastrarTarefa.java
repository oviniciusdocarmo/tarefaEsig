
package view;

import com.sun.jdi.connect.spi.Connection;
import controler.CadastrarTarefaControler;
import dao.conexao;
import dao.tarefaDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.tarefa;

public class TelaCadastrarTarefa extends javax.swing.JFrame {

    private final CadastrarTarefaControler controller;


  
    public TelaCadastrarTarefa() {
        initComponents();
        
        controller = new CadastrarTarefaControler(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        responsavelBox = new javax.swing.JComboBox<>();
        prioridadeBox = new javax.swing.JComboBox<>();
        tituloField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoArea = new javax.swing.JTextArea();
        deadlineField = new javax.swing.JFormattedTextField();
        cadastrarButton = new javax.swing.JButton();
        listaTarefasButton = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Título:");

        jLabel2.setText("Descrição:");

        jLabel3.setText("Responsável:");

        jLabel4.setText("Prioridade:");

        jLabel5.setText("Deadline:");

        responsavelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "João", "Carlos", "José" }));

        prioridadeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Média", "Alta" }));

        tituloField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloFieldActionPerformed(evt);
            }
        });

        descricaoArea.setColumns(20);
        descricaoArea.setRows(5);
        jScrollPane1.setViewportView(descricaoArea);

        deadlineField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        cadastrarButton.setBackground(new java.awt.Color(102, 204, 255));
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        listaTarefasButton.setText("Tarefas Cadastradas");
        listaTarefasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTarefasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(responsavelBox, 0, 186, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(prioridadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tituloField)
                            .addComponent(jScrollPane1))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deadlineField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listaTarefasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastrarButton)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tituloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(responsavelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioridadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deadlineField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaTarefasButton)
                    .addComponent(cadastrarButton))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloFieldActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        controller.SalvarTarefa();
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void listaTarefasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTarefasButtonActionPerformed
        try {
            controller.AbrirListagem();
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastrarTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listaTarefasButtonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarTarefa().setVisible(true);
            }
        });
    }

    
    public JFormattedTextField getDeadlineField() {
        return deadlineField;
    }

    public void setDeadlineField(JFormattedTextField deadlineField) {
        this.deadlineField = deadlineField;
    }

    public JTextArea getDescricaoArea() {
        return descricaoArea;
    }

    public void setDescricaoArea(JTextArea descricaoArea) {
        this.descricaoArea = descricaoArea;
    }

    public JComboBox<String> getPrioridadeBox() {
        return prioridadeBox;
    }

    public void setPrioridadeBox(JComboBox<String> prioridadeBox) {
        this.prioridadeBox = prioridadeBox;
    }

    public JComboBox<String> getResponsavelBox() {
        return responsavelBox;
    }

    public void setResponsavelBox(JComboBox<String> responsavelBox) {
        this.responsavelBox = responsavelBox;
    }

    public JTextField getTituloField() {
        return tituloField;
    }

    public void setTituloField(JTextField tituloField) {
        this.tituloField = tituloField;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JFormattedTextField deadlineField;
    private javax.swing.JTextArea descricaoArea;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listaTarefasButton;
    private javax.swing.JComboBox<String> prioridadeBox;
    private javax.swing.JComboBox<String> responsavelBox;
    private javax.swing.JTextField tituloField;
    // End of variables declaration//GEN-END:variables
}
