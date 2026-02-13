package interfaces;

import service.OperacoesBancarias;
import classes.ContaBancaria;
import classes.ContaCorrente;
import classes.ContaPoupanca;
import javax.swing.JOptionPane;
import utils.Utilidade;

public class Depositar extends javax.swing.JDialog {

    private final OperacoesBancarias operacao;
    
    public Depositar(java.awt.Frame parent, boolean modal, OperacoesBancarias operacao) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
        Utilidade.atalho(botaoConfirmar, "ENTER");
        Utilidade.atalho(botaoCancelar, "ESCAPE");
        
        this.operacao = operacao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        botaoCancelar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        botaoConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Valor:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Depositar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tipo da conta:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("- - - - - - - - - - - - - - - - - - - - - -");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Poupança");
        jRadioButton2.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Local:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Numero:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Conta");
        jRadioButton1.setEnabled(false);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton2)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmar)
                    .addComponent(botaoCancelar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        String numero = jTextField1.getText().trim();
        String valorStr = jTextField2.getText().trim();
        
        ContaBancaria conta = operacao.buscar(numero);
        
        if(numero.trim().isEmpty() || valorStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos!");
            return;
        }
        
        if(conta == null) {
            JOptionPane.showMessageDialog(this, "Conta não encontrada!");
            return;
        }

        if(!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione o local!");
            return;
        }
        
        double valor;

        try {
            valor = Double.parseDouble(valorStr.replace(",", "."));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
            return;
        }
        
        boolean sucesso;
        
        if(conta instanceof ContaPoupanca && jRadioButton2.isSelected()) {
            sucesso = operacao.creditarEmPoupanca(conta, valor);
        } else {
            sucesso = operacao.creditar(conta, valor);;
        }
        
        if(!sucesso) {
            JOptionPane.showMessageDialog(this, "Saldo insuficiente ou valor inválido!");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!");
        this.dispose();
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        String numero = jTextField1.getText();

        if(numero == null || numero.trim().isEmpty()) {
            resetarTela();
            return;
        }

        ContaBancaria conta = operacao.buscar(numero);

        if(conta == null) {
            resetarTela();
            return;
        }
        
        if(conta instanceof ContaCorrente) {
            jRadioButton1.setEnabled(true);
            jRadioButton1.setSelected(true);
            jRadioButton2.setEnabled(false);
            jRadioButton2.setSelected(false);
            jLabel5.setText(conta.getTipoConta());
            
        } else {
            jRadioButton1.setEnabled(true);
            jRadioButton1.setSelected(false);
            jRadioButton2.setEnabled(true);
            jRadioButton2.setSelected(false);
            Utilidade.atalho(jRadioButton1, "F1");
            Utilidade.atalho(jRadioButton2, "F2");
            jLabel5.setText(conta.getTipoConta() + "  |  R$" + conta.getInformacao());
            
        }
    }//GEN-LAST:event_jTextField1FocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void resetarTela() {
        jRadioButton1.setEnabled(false);
        jRadioButton1.setSelected(false);
        jRadioButton2.setEnabled(false);
        jRadioButton2.setSelected(false);
        jLabel5.setText("- - - - - - - - - - - - - - - - - - - - - - -");
    }

}
