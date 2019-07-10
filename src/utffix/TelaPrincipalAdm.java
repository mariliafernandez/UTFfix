package utffix;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class TelaPrincipalAdm extends javax.swing.JFrame {
    
    private int w = 800;
    private int h = 400;
    private DefaultListModel list;

    public TelaPrincipalAdm() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); 
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        
        this.setSize(w, h);   
        this.setTitle("UTF-fix | Relatórios de Chamados");        
        this.setLocation(x, y);
        labelTitulo.setText("Selecione um item da lista");
        labelCodigo.setText("");
    }
    
    public void populateList(ArrayList<Chamado> chamados) {
        if(chamados.isEmpty()){
            labelTitulo.setText("Não há nenhum chamado");
        }
        
        else {
            list = new DefaultListModel();
            for(Chamado each : chamados) {
                list.addElement(each);
            }       
            listChamados.setModel(list);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        radioBtnFinalizados = new javax.swing.JRadioButton();
        radioBtnPendentes = new javax.swing.JRadioButton();
        radioBtnTodos = new javax.swing.JRadioButton();
        radioBtnSemana = new javax.swing.JRadioButton();
        radioBtnMes = new javax.swing.JRadioButton();
        radioBtn3meses = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listChamados = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiTelaCadastroUsuario = new javax.swing.JMenuItem();
        jmiCadastroEquipamento = new javax.swing.JMenuItem();
        jmiTelaAdmSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(radioBtnFinalizados);
        radioBtnFinalizados.setText("Finalizados");
        radioBtnFinalizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFinalizadosActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnPendentes);
        radioBtnPendentes.setText("Pendentes");
        radioBtnPendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnPendentesActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnTodos);
        radioBtnTodos.setText("Todos");
        radioBtnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnTodosActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioBtnSemana);
        radioBtnSemana.setText("Na última semana");
        radioBtnSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnSemanaActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioBtnMes);
        radioBtnMes.setText("No último mês");

        buttonGroup2.add(radioBtn3meses);
        radioBtn3meses.setText("Nos últimos 3 meses");

        jLabel1.setText("Filtrar por chamados:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abertos:", "Finalizados:" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radioBtnPendentes)
                    .addComponent(radioBtnFinalizados)
                    .addComponent(radioBtnTodos)
                    .addComponent(radioBtnMes)
                    .addComponent(radioBtn3meses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioBtnSemana)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnPendentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnFinalizados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnTodos)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(radioBtnSemana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtn3meses)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        labelTitulo.setText("jLabel3");

        labelCodigo.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(82, 82, 82)
                .addComponent(labelCodigo)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(labelCodigo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listChamados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listChamados);

        jMenu1.setText("File");

        jmiTelaCadastroUsuario.setText("Novo Usuário");
        jmiTelaCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTelaCadastroUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmiTelaCadastroUsuario);

        jmiCadastroEquipamento.setText("Novo Equipamento");
        jmiCadastroEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroEquipamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCadastroEquipamento);

        jmiTelaAdmSair.setText("Sair");
        jmiTelaAdmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTelaAdmSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmiTelaAdmSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiTelaCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTelaCadastroUsuarioActionPerformed
        new TelaCadastrarUsuario().setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_jmiTelaCadastroUsuarioActionPerformed

    private void jmiCadastroEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroEquipamentoActionPerformed
        new TelaCadastrarEquipamento().setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_jmiCadastroEquipamentoActionPerformed

    private void jmiTelaAdmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTelaAdmSairActionPerformed
        new TelaLogin().setVisible(true);       
        this.dispose();
    }//GEN-LAST:event_jmiTelaAdmSairActionPerformed

    private void radioBtnPendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnPendentesActionPerformed
        populateList(new Chamado().getAll());
    }//GEN-LAST:event_radioBtnPendentesActionPerformed

    private void radioBtnFinalizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFinalizadosActionPerformed
        String sql = "SELECT * FROM chamado WHERE fechamento_chamado IS NOT NULL";    
        ArrayList<Chamado> chamados = new Chamado().getAllByFiltro(sql);
        populateList(chamados);
    }//GEN-LAST:event_radioBtnFinalizadosActionPerformed

    private void radioBtnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnTodosActionPerformed
        String sql = "SELECT * FROM chamado";    
        ArrayList<Chamado> chamados = new Chamado().getAllByFiltro(sql);
        populateList(chamados);
    }//GEN-LAST:event_radioBtnTodosActionPerformed

    private void radioBtnSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnSemanaActionPerformed
        
    }//GEN-LAST:event_radioBtnSemanaActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiCadastroEquipamento;
    private javax.swing.JMenuItem jmiTelaAdmSair;
    private javax.swing.JMenuItem jmiTelaCadastroUsuario;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listChamados;
    private javax.swing.JRadioButton radioBtn3meses;
    private javax.swing.JRadioButton radioBtnFinalizados;
    private javax.swing.JRadioButton radioBtnMes;
    private javax.swing.JRadioButton radioBtnPendentes;
    private javax.swing.JRadioButton radioBtnSemana;
    private javax.swing.JRadioButton radioBtnTodos;
    // End of variables declaration//GEN-END:variables
}
