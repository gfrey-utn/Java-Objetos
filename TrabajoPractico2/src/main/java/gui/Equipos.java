package gui;

import connectors.Connector;
import entities.Equipo;
import entities.Liga;
import javax.swing.JOptionPane;
import repositories.interfaces.I_EquipoRepository;
import repositories.interfaces.I_JugadorRepository;
import repositories.interfaces.I_LigaRepository;
import repositories.jdbc.EquipoRepository;
import repositories.jdbc.JugadorRepository;
import repositories.jdbc.LigaRepository;
import utils.swing.Table;
import utils.swing.Validator;

public class Equipos extends javax.swing.JInternalFrame {
    private I_EquipoRepository er;
    private I_JugadorRepository jr;
    private I_LigaRepository lr;
    public Equipos() {
        super(
                "Formulario de Ligas",    // titulo 
                true,                       // resizable
                true,                       // closable
                true,                       // maximizable
                true); 
        initComponents();
        er = new EquipoRepository(Connector.getConnection());
        jr = new JugadorRepository(Connector.getConnection());
        lr = new LigaRepository(Connector.getConnection());
        cargar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbLiga = new javax.swing.JComboBox<>();
        btnAlta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarEquipo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipos = new javax.swing.JTable();

        jLabel1.setText("Nombre");

        jLabel2.setText("Liga");

        btnAlta.setText("Dar de Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar Equipo:");

        txtBuscarEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEquipoKeyReleased(evt);
            }
        });

        btnEliminar.setText("Eliminar Equipo");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEquipos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(cmbLiga, 0, 500, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAlta)
                .addGap(272, 272, 272))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarEquipo)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBuscarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarEquipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEquipoKeyReleased
        new Table<Equipo>().cargar(tblEquipos, er.getLikeNombre(txtBuscarEquipo.getText()));
    }//GEN-LAST:event_txtBuscarEquipoKeyReleased

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        if (!validar()) return;
        Equipo equipo = new Equipo(
                txtNombre.getText(),
                cmbLiga.getItemAt(cmbLiga.getSelectedIndex()).getId()
        );
        er.save(equipo);
        JOptionPane.showMessageDialog(this, "Se dio de alta un Equipo id: " + equipo.getId());
        limpiar();
        cargar();
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int index = tblEquipos.getSelectedRow();
        if (index == -1) return;
        Equipo equipo = er.getById(Integer.parseInt(tblEquipos.getValueAt(index, 0) + ""));
        if (!jr.getByEquipo(equipo).isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se puede borrar el equipo porque tiene jugadores.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this,
                "¿Desea borrar al equipo " + equipo.getNombre()
                        + " de " + lr.getById(equipo.getLiga_id()).getNombre() + "?") != 0) return;
        er.remove(equipo);
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void cargar(){
        cmbLiga.removeAllItems();
        lr.getAll().forEach(cmbLiga::addItem);
        new Table<Equipo>().cargar(tblEquipos, er.getAll());
    }
    
    private void limpiar(){
        cmbLiga.setSelectedIndex(0);
        txtNombre.setText("");
        txtNombre.requestFocus();
    }
    
    private boolean validar(){
        if (!new Validator(txtNombre).length(3, 45)) return false;
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Liga> cmbLiga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblEquipos;
    private javax.swing.JTextField txtBuscarEquipo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
