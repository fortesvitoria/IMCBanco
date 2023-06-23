package Visao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Controle.ControleContato;
import Modelo.DadosCliente;
import java.sql.SQLException;

public class Listar extends javax.swing.JInternalFrame {

    public Listar() {
        initComponents();
    }

    //modelar a tabela no codigo
    DefaultTableModel dtm = new DefaultTableModel(new Object[][]{}, new Object[]{"Registro", "Nome", "Peso", "IMC", "Data Atual", "Altura"});

    public void listarTabela() {
        try {
            ControleContato CC = new ControleContato();
            //cria um arraylist vazio para receber o arraylist já criado na classe ContatoBanco
            ArrayList<DadosCliente> listaAux = new ArrayList<>();
            listaAux = CC.lista();

            //limpar tavela na interface
            dtm.setNumRows(0);

            //percorrer a tabela na interface colocando os registroa no banco de dados
            for (int i = 0; i < listaAux.size(); i++) {
                dtm.addRow(
                        new String[]{
                                Integer.toString(listaAux.get(i).getIdCliente()),
                                listaAux.get(i).getNome(),
                                Double.toString(listaAux.get(i).getPeso()),
                                Double.toString(listaAux.get(i).getImc()),
                                String.valueOf(listaAux.get(i).getDataAtual()),
                                Double.toString(listaAux.get(i).getAltura())
                                
                });
            }
            Tabela.setModel(dtm);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro na tabela \n:Causa: " + erro.getMessage(), "ERRO", 0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTabela = new javax.swing.JPanel();
        PainelTabelaScrol = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        PainelBotoes = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Contatos da agenda");

        PainelTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)), "Lista de contatos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 18), new java.awt.Color(0, 102, 255))); // NOI18N

        PainelTabelaScrol.setBackground(new java.awt.Color(0, 102, 255));

        Tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "Peso", "IMC", "Data Atual", "Altura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PainelTabelaScrol.setViewportView(Tabela);

        javax.swing.GroupLayout PainelTabelaLayout = new javax.swing.GroupLayout(PainelTabela);
        PainelTabela.setLayout(PainelTabelaLayout);
        PainelTabelaLayout.setHorizontalGroup(
            PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelTabelaScrol, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                .addContainerGap())
        );
        PainelTabelaLayout.setVerticalGroup(
            PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelTabelaScrol, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)), "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 18), new java.awt.Color(0, 102, 255))); // NOI18N

        btnListar.setBackground(new java.awt.Color(0, 102, 255));
        btnListar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(0, 102, 255));
        btnDeletar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Apagar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);
        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBotoesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(btnDeletar)
                .addGap(384, 384, 384))
        );
        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(btnDeletar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PainelTabela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelBotoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listarTabela();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {

            //pegar o retorno da linha selecionada na interface
            int linha = Tabela.getSelectedRow();

            if (linha != -1) //esse -1 é caso o usuario não seleciona nada fica -1 por padrão
            {
               int confirmar =  JOptionPane.showConfirmDialog(null, "Você realmente deseja apagar este contato?", "EXCLUIR",0,2);
            
               if(confirmar == 0) {
                   //pegar o valor através da referencia de linha e coluna
                   String codigo = (String) Tabela.getValueAt(linha, 0);
                   String nome = (String) Tabela.getValueAt(linha, 1);
                   DadosCliente dc = new DadosCliente();
                   dc.setIdCliente(Integer.parseInt(codigo));
                   dc.setNome(nome);
                   ControleContato cc = new ControleContato();
                   cc.apagarCliente(dc);
                   
                   //atualizar a tabela
                   listarTabela();
                   JOptionPane.showMessageDialog(null, "Contato apagado com sucesso!");
                   
               } 
            } else {

                throw new SQLException("Selecione o contato que deseja deletar");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar contato.\nCausa: " + erro.getMessage(), "ERRO", 0);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelTabela;
    private javax.swing.JScrollPane PainelTabelaScrol;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnListar;
    // End of variables declaration//GEN-END:variables
}
