package utffix;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.time.LocalDate;
import java.sql.Date;

public class TelaMeusChamados extends javax.swing.JFrame {
    
    private int w = 500;
    private int h = 400;
    private Usuario user;
    private DefaultListModel list = new DefaultListModel();

    public TelaMeusChamados(Usuario user) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); 
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        
        this.user = user;
        this.setSize(w, h);   
        this.setTitle("UTFFix | Meus Chamados");        
        this.setLocation(x, y);
        
        populateList();
        labelTitulo.setText("Nenhum chamado selecionado");
        labelLocal.setText("");
        labelDesc.setText("");
        labelData.setText("");
        labelStatus.setText("");
        labelEquip.setText("");
        labelCodigo.setText("");
      
    }
    
    public void populateList() {
        Chamado consulta = new Chamado();
        ArrayList<Chamado> chamados = consulta.consultarChamadosUsuario(user);
        
        for(Chamado chamado : chamados)  {
            list.addElement(chamado);
        }         
            
        listChamados.setModel(list);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listChamados = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        labelTitulo = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        labelEquip = new javax.swing.JLabel();
        labelDesc = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane1.setViewportView(listChamados);

        labelTitulo.setText("jLabel1");

        labelLocal.setText("jLabel2");

        labelEquip.setText("jLabel3");

        labelDesc.setText("jLabel4");

        labelData.setText("jLabel5");

        labelStatus.setText("jLabel6");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        labelCodigo.setText("jLabel1");

        jLabel1.setText("Meus chamados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelTitulo)
                                        .addGap(43, 43, 43)
                                        .addComponent(labelCodigo))
                                    .addComponent(labelLocal)
                                    .addComponent(labelEquip)
                                    .addComponent(labelDesc)
                                    .addComponent(labelData)
                                    .addComponent(labelStatus))
                                .addGap(0, 109, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(labelCodigo)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelLocal)
                        .addGap(18, 18, 18)
                        .addComponent(labelEquip)
                        .addGap(18, 18, 18)
                        .addComponent(labelDesc)
                        .addGap(16, 16, 16)
                        .addComponent(labelData)
                        .addGap(18, 18, 18)
                        .addComponent(labelStatus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void listChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listChamadosMouseClicked
        int index = listChamados.locationToIndex(evt.getPoint());
        
        if(index >= 0) {
            Object obj = listChamados.getModel().getElementAt(index);
            System.out.println("clicked on " + obj.toString());
            Chamado chamadoClick = (Chamado) obj;
                      
            if(chamadoClick != null) {
            
                System.out.println(chamadoClick.getCodEquipamento());

                labelTitulo.setText("Chamado ");
                labelCodigo.setText(chamadoClick.getCodigo() + "");
                labelLocal.setText("Local: " +chamadoClick.getLocal());
                labelDesc.setText("Descrição: " +chamadoClick.getDefeito());             
                labelData.setText("Chamado aberto em: " +chamadoClick.getDataAbertura().getDayOfMonth() + " / " + chamadoClick.getDataAbertura().getMonthValue() + " / " + chamadoClick.getDataAbertura().getYear());

                System.out.println(chamadoClick.getDataFechamento());
                
                if(chamadoClick.getDataFechamento() == null)
                    labelStatus.setText("Status: Em aberto");
                else 
                    labelStatus.setText("Status: Finalizado");
               
                chamadoClick.getCodEquipamento();
                Equipamento equip = new Equipamento(); 
                
                labelEquip.setText(equip.consultarEquipamento(chamadoClick.getCodEquipamento()).getNome() + " " + equip.consultarEquipamento(chamadoClick.getCodEquipamento()).getCodigo());
                

                //labelEquip.setText(equip.consultarEquipamento(chamadoClick.getCodEquipamento()).setNome(nome) + " " + equip.consultarEquipamento(chamadoClick.getCodEquipamento()).getCodigo());
                //labelEquip.setText(equip..getNome() +" "+ chamadoClick.getCodEquipamento());
            }                  
        }
    }//GEN-LAST:event_listChamadosMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaPrincipalSolicitante(user).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelEquip;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listChamados;
    // End of variables declaration//GEN-END:variables
}
