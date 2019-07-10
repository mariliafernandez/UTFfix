package utffix;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaCadastrarEquipamento extends javax.swing.JFrame {
    
    int w = 500;
    int h = 300;

    public TelaCadastrarEquipamento() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); 
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        
        this.setSize(w, h);   
        this.setTitle("UTF-fix | Cadastrar Novo Equipamento");        
        this.setLocation(x, y);
        
        populateComboBox();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNomeEquipamento = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jtfCodigo = new javax.swing.JTextField();
        jtfNewEquip = new javax.swing.JTextField();
        lbNewEqup = new javax.swing.JLabel();
        boxequip = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNomeEquipamento.setText("Equipamentos");

        lbCodigo.setText("Código");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jtfNewEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNewEquipActionPerformed(evt);
            }
        });

        lbNewEqup.setText("Novo equipamento");

        boxequip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo Item" }));
        boxequip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxequipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNomeEquipamento)
                            .addComponent(lbNewEqup))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxequip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(jtfNewEquip, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxequip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeEquipamento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNewEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNewEqup))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigo)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnCadastrar))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populateComboBox(){
        
        Equipamento equip = new Equipamento();
        ArrayList<String> array = equip.getNomes();
        
        
        //boxequip.addItem("novo intem");
        
        for(String nome : array) {
            boxequip.addItem(nome);
        }
    }
    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaPrincipalAdm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        if( 0 == boxequip.getSelectedIndex()){
            if(jtfNewEquip.getText().equals("") || jtfCodigo.getText().equals("") ){
                
                JOptionPane.showMessageDialog(null, "Campo vazio \n", "Erro", JOptionPane.ERROR_MESSAGE );
                
            }else{
            
                Equipamento equip = new Equipamento().consultarEquipamento(jtfCodigo.getText());
                
                if(equip.getCodigo() == null){
                    
                    equip.cadastrarEquipamento(jtfNewEquip.getText().toUpperCase(), jtfCodigo.getText());
                
                    JOptionPane.showMessageDialog(null, "Equipamento Cadastrado com Sucesso\n", "Alerta", JOptionPane.ERROR_MESSAGE );
                
                }else{ 
                   JOptionPane.showMessageDialog(null, "Este equipamento já existe:\n\n" +equip.getNome()+ "\nCódigo " +equip.getCodigo(), "Erro", JOptionPane.ERROR_MESSAGE );
                }
        
            }
        } else {
            
            jtfNewEquip.setVisible(false);
            lbNewEqup.setVisible(false);
            
            if(jtfCodigo.getText().equals("") ){
            //if(jtfNewEquip.getText().equals("") || jtfCodigo.getText().equals("") ){
                
                JOptionPane.showMessageDialog(null, "Campo vazio \n", "Erro", JOptionPane.ERROR_MESSAGE );
                
            }else{
            
                Equipamento equip = new Equipamento().consultarEquipamento(jtfCodigo.getText());
                if(equip.getCodigo() == null){
                   equip.cadastrarEquipamento(jtfNewEquip.getText(), jtfCodigo.getText());
                }else {
                    JOptionPane.showMessageDialog(null, "Este equipamento já existe:\n\n" +equip.getNome()+ "\nCódigo " +equip.getCodigo(), "Erro", JOptionPane.ERROR_MESSAGE );
                }    
            }
       
        }
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void boxequipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxequipActionPerformed
        // TODO add your handling code here:
        
        if( 0 != boxequip.getSelectedIndex()){
            
            jtfNewEquip.setVisible(false);
            lbNewEqup.setVisible(false);
            jtfCodigo.setSize(120, 20);
        }else{
            jtfNewEquip.setVisible(true);
            lbNewEqup.setVisible(true);
            jtfCodigo.setSize(120, 20);
        }
    }//GEN-LAST:event_boxequipActionPerformed

    private void jtfNewEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNewEquipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNewEquipActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxequip;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNewEquip;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNewEqup;
    private javax.swing.JLabel lbNomeEquipamento;
    // End of variables declaration//GEN-END:variables
}
