package utffix;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaPrincipalTecnico extends javax.swing.JFrame {
    
    private int w = 500;
    private int h = 400;
    private DefaultListModel list = new DefaultListModel();


    public TelaPrincipalTecnico(Usuario user) {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); 
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        
        this.setSize(w, h);   
        this.setTitle("UTF-fix | Chamados Abertos");        
        this.setLocation(x, y);
 
        populateList();      
    }
    
    public void populateList(){
        
        labelTitulo.setText("");
        labelCodigo.setText("");
        labelLocal.setText("");
        labelDesc.setText("");
        labelData.setText("");
        labelEquip.setText("");
        labelChamadosPendentes.setText("");
        radioBtnFinalizado.setVisible(false);
        
        
        Chamado chamado = new Chamado();      
        ArrayList<Chamado> chamados = chamado.getAll();
        list.clear();
   
        if(chamados.isEmpty()) {
            labelTitulo.setText("Sem chamados pendentes");
            panelDados.setVisible(false);
            panelList.setVisible(false);
            jScrollPane1.setVisible(false);
            this.setSize(w, 200);                       
        }
         
        else {
            labelTitulo.setText("Nenhum chamado selecionado");
            panelDados.setVisible(true);
            panelList.setVisible(true);
            jScrollPane1.setVisible(true);
            
            for(Chamado each : chamados) {
                list.addElement(each);
            }
        
            listChamados.setModel(list);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelChamadosPendentes = new javax.swing.JLabel();
        panelDados = new javax.swing.JPanel();
        labelData = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        labelEquip = new javax.swing.JLabel();
        radioBtnFinalizado = new javax.swing.JRadioButton();
        labelDesc = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        btnSair = new javax.swing.JButton();
        panelList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        listChamados = new javax.swing.JList<>();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelChamadosPendentes.setText("Chamados pendentes");

        labelData.setText("jLabel2");

        labelLocal.setText("jLabel3");

        labelEquip.setText("jLabel4");

        radioBtnFinalizado.setText("Finalizado");
        radioBtnFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFinalizadoActionPerformed(evt);
            }
        });

        labelDesc.setText("jLabel2");

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelData)
                    .addComponent(labelLocal)
                    .addComponent(labelEquip)
                    .addComponent(radioBtnFinalizado)
                    .addComponent(labelDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addComponent(labelData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEquip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDesc)
                .addGap(37, 37, 37)
                .addComponent(radioBtnFinalizado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTitulo.setText("jLabel2");

        labelCodigo.setText("jLabel2");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        listChamados.setBackground(new java.awt.Color(246, 244, 242));
        listChamados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        listChamados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listChamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listChamadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listChamados);

        javax.swing.GroupLayout panelListLayout = new javax.swing.GroupLayout(panelList);
        panelList.setLayout(panelListLayout);
        panelListLayout.setHorizontalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addGroup(panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(separator)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelChamadosPendentes)
                        .addGap(51, 51, 51)
                        .addComponent(labelTitulo)
                        .addGap(86, 86, 86)
                        .addComponent(labelCodigo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelChamadosPendentes)
                    .addComponent(labelTitulo)
                    .addComponent(labelCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(btnSair)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFinalizadoActionPerformed

        if (radioBtnFinalizado.isSelected()){          
            Chamado chamado = new Chamado();
            chamado.finalizarChamado(Integer.parseInt( labelCodigo.getText()));
            populateList();
        }
    }//GEN-LAST:event_radioBtnFinalizadoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void listChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listChamadosMouseClicked
         int index = listChamados.locationToIndex(evt.getPoint());
        
        if(index >= 0) {
            Object obj = listChamados.getModel().getElementAt(index);
            System.out.println("clicked on " + obj.toString());
            Chamado chamadoClick = (Chamado) obj;
            
            if(chamadoClick != null) {
                labelTitulo.setText("Chamado ");
                labelCodigo.setText(chamadoClick.getCodigo() + "");
                labelLocal.setText("Local: " +chamadoClick.getLocal());
                labelDesc.setText("Descrição: " +chamadoClick.getDefeito());             
                labelData.setText("Chamado aberto em: " +chamadoClick.getDataAbertura().getDayOfMonth() + " / " + chamadoClick.getDataAbertura().getMonthValue() + " / " + chamadoClick.getDataAbertura().getYear());

                System.out.println(chamadoClick.getDataFechamento());
                if(chamadoClick.getDataFechamento() == null)
                    radioBtnFinalizado.setSelected(false);
                else 
                    radioBtnFinalizado.setSelected(true);
                
                radioBtnFinalizado.setVisible(true);
                Equipamento equip = new Equipamento();
                //labelEquip.setText(equip.consultarEquipamento(chamadoClick.getCodEquipamento()).getNome() + " " + chamadoClick.getCodEquipamento());
                labelEquip.setText(chamadoClick.getCodEquipamento() + " " + chamadoClick.getCodEquipamento());

            }                     
        }
    }//GEN-LAST:event_listChamadosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelChamadosPendentes;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelEquip;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listChamados;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel panelList;
    private javax.swing.JRadioButton radioBtnFinalizado;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
