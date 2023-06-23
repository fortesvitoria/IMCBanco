/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Visao;

import Modelo.DadosCliente;
import Controle.ControleContato;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author forte
 */
public class Cadastrar extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public Cadastrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrar = new javax.swing.JButton();
        CalcularIMC = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        campoPeso = new javax.swing.JTextField();
        campoIMC = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de contatos na agenda");
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setOpaque(true);

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 255));
        btnCadastrar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        CalcularIMC.setBackground(new java.awt.Color(0, 102, 255));
        CalcularIMC.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        CalcularIMC.setForeground(new java.awt.Color(255, 255, 255));
        CalcularIMC.setText("Calcular IMC");
        CalcularIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularIMCActionPerformed(evt);
            }
        });

        campoNome.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        campoNome.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 87, 122), 2, true), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 14), new java.awt.Color(34, 87, 122))); // NOI18N

        campoPeso.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        campoPeso.setToolTipText("");
        campoPeso.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 87, 122), 2, true), "Peso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 14), new java.awt.Color(34, 87, 122))); // NOI18N

        campoIMC.setEditable(false);
        campoIMC.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        campoIMC.setToolTipText("");
        campoIMC.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 87, 122), 2, true), "IMC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 14), new java.awt.Color(34, 87, 122))); // NOI18N

        campoAltura.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        campoAltura.setToolTipText("");
        campoAltura.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 87, 122), 2, true), "Altura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 14), new java.awt.Color(34, 87, 122))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CalcularIMC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(781, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(CalcularIMC))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            DadosCliente dc = new DadosCliente();

            //pegar os valores dos campos na interface
            dc.setNome(campoNome.getText());
            dc.setPeso(parseDouble(campoPeso.getText()));
            dc.setAltura(parseDouble(campoAltura.getText()));
            dc.setImc(parseDouble(campoIMC.getText()));
            
            //controle
            ControleContato cc = new ControleContato();
            cc.inserirCliente(dc);
            JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Algum erro inesperado aconteceu para cadastrar.\n Causa: " + erro.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    double altura, peso, massaIMC;

    private void CalcularIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularIMCActionPerformed
        peso = Double.parseDouble(campoPeso.getText().replace(",", "."));
        altura = Double.parseDouble(campoAltura.getText().replace(",", "."));
        massaIMC = peso / (altura * altura);
        campoIMC.setText(String.valueOf(massaIMC));
    }//GEN-LAST:event_CalcularIMCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularIMC;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoIMC;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPeso;
    // End of variables declaration//GEN-END:variables
}
