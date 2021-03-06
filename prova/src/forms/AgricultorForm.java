/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import DAO.AgricultorDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Agricultor;
import java.time.Instant;
import java.util.Date;
/**
 *
 * @author Gabrielli Vianna
 */
public class AgricultorForm extends javax.swing.JFrame {

    /**
     * Creates new form AgricultorForm
     */
    public AgricultorForm() {
        initComponents();
        try {
            agricultorDAO = new AgricultorDAO();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Id_Agricultor = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        Data_cadastro = new javax.swing.JTextField();
        Municipio = new javax.swing.JTextField();
        Localidade = new javax.swing.JTextField();
        Produtos = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        Telefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("ID Agricultor:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Data de Cadastro:");

        jLabel4.setText("Municipio:");

        jLabel5.setText("Localidade:");

        jLabel6.setText("Produtos:");

        jLabel7.setText("Status:");

        jLabel8.setText("Telefone:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Agricultor", "Nome", "Data de cadastro", "Municipio", "Localidade", "Produtos", "Status", "Telefone"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo Cadastro");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(btnCadastrar))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Id_Agricultor, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addComponent(Nome)
                                .addComponent(Data_cadastro)
                                .addComponent(Municipio)
                                .addComponent(Localidade)
                                .addComponent(Produtos)
                                .addComponent(Status)
                                .addComponent(Telefone))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRemover)
                                .addGap(52, 52, 52)
                                .addComponent(btnNovo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Id_Agricultor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Localidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovo)
                            .addComponent(btnRemover))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Agricultor agricultor = new Agricultor();
        agricultor.setId_agricultor(Integer.parseInt(Id_Agricultor.getText()));
        agricultor.setNome(Nome.getText());
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");  //HH:mm:ss
        try {
            agricultor.setData_cadastro(dataFormatada.parse(Data_cadastro.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(AgricultorForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        agricultor.setMunicipio(Municipio.getText());
        agricultor.setLocalidade(Localidade.getText());
        agricultor.setProdutos(Produtos.getText());
        agricultor.setStatus(Integer.parseInt(Status.getText()));
        agricultor.setTelefone(Telefone.getText());
        try {
            if (mode.equals("INS"))  {
                agricultorDAO.save(agricultor); 
            } else if (mode.equals("UPD")) {
                agricultorDAO.save(agricultor);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        listar();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        Agricultor agricultor = new Agricultor();
        agricultor.setId_agricultor(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
        try {
            agricultorDAO.delete(agricultor);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        Id_Agricultor.setText("");
        Nome.setText("");
        Data_cadastro.setText("");
        Municipio.setText("");
        Localidade.setText("");
        Produtos.setText("");
        Status.setText("");
        Telefone.setText("");
        this.mode = "INS";
        listar();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        int selected = tabela.getSelectedRow();
        Id_Agricultor.setText(tabela.getValueAt(selected, 0).toString() );
        Nome.setText(tabela.getValueAt(selected, 1).toString() );
        Data_cadastro.setText(tabela.getValueAt(selected, 2).toString() );
        Municipio.setText(tabela.getValueAt(selected, 3).toString() );
        Localidade.setText(tabela.getValueAt(selected, 4).toString() );
        Produtos.setText(tabela.getValueAt(selected, 5).toString() );
        Status.setText(tabela.getValueAt(selected, 6).toString() );
        Telefone.setText(tabela.getValueAt(selected, 7).toString() );
        this.mode = "UPD";
    }//GEN-LAST:event_tabelaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listar();
    }//GEN-LAST:event_formWindowOpened

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Id_Agricultor.setText("");
        Nome.setText("");
        Data_cadastro.setText("");
        Municipio.setText("");
        Localidade.setText("");
        Produtos.setText("");
        Status.setText("");
        Telefone.setText("");
        this.mode = "INS";
    }//GEN-LAST:event_btnNovoActionPerformed
    public void listar() {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0);
        try {
            for (Agricultor agricultor: agricultorDAO.findAll()) {
                String linha[] = { ""+agricultor.getId_agricultor(), agricultor.getNome(), agricultor.getData_cadastro().toString(), agricultor.getMunicipio(), agricultor.getLocalidade(), agricultor.getProdutos(), ""+agricultor.getStatus(), agricultor.getTelefone() };
                model.addRow(linha);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(AgricultorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgricultorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgricultorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgricultorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgricultorForm().setVisible(true);
            }
        });
    }
    private AgricultorDAO agricultorDAO;
    private String mode = "INS";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Data_cadastro;
    private javax.swing.JTextField Id_Agricultor;
    private javax.swing.JTextField Localidade;
    private javax.swing.JTextField Municipio;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Produtos;
    private javax.swing.JTextField Status;
    private javax.swing.JTextField Telefone;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
