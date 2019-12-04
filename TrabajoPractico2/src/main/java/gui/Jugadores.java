package gui;

import connectors.Connector;
import entities.Equipo;
import entities.Jugador;
import entities.Pais;
import java.sql.Date;
import javax.swing.JOptionPane;
import repositories.interfaces.I_EquipoRepository;
import repositories.interfaces.I_JugadorRepository;
import repositories.interfaces.I_PaisRepository;
import repositories.interfaces.I_StatRepository;
import repositories.jdbc.EquipoRepository;
import repositories.jdbc.JugadorRepository;
import repositories.jdbc.PaisRepository;
import repositories.jdbc.StatRepository;
import utils.swing.Table;
import utils.swing.Validator;

public class Jugadores extends javax.swing.JInternalFrame {
    private I_JugadorRepository jr;
    private I_PaisRepository pr;
    private I_EquipoRepository er;
    private I_StatRepository sr;
    public Jugadores() {
        super(
                "Formulario de Jugadores",    // titulo 
                true,                       // resizable
                true,                       // closable
                true,                       // maximizable
                true);
        initComponents();
        jr = new JugadorRepository(Connector.getConnection());
        pr = new PaisRepository(Connector.getConnection());
        er = new EquipoRepository(Connector.getConnection());
        sr = new StatRepository(Connector.getConnection());
        cargar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        cmbPais = new javax.swing.JComboBox<>();
        cmbEquipo = new javax.swing.JComboBox<>();
        btnAlta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtBuscarJugador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Número");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Nacionalidad");

        jLabel6.setText("Equipo");

        btnAlta.setText("Dar de Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        txtBuscarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarJugadorActionPerformed(evt);
            }
        });
        txtBuscarJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarJugadorKeyReleased(evt);
            }
        });

        jLabel7.setText("Buscar Jugador:");

        btnEliminar.setText("Eliminar Jugador");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblJugadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFechaNacimiento)
                    .addComponent(txtApellido)
                    .addComponent(txtNumero)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnAlta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarJugadorActionPerformed

    private void txtBuscarJugadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarJugadorKeyReleased
        new Table<Jugador>().cargar(tblJugadores, jr.getLikeApellido(txtBuscarJugador.getText()));
    }//GEN-LAST:event_txtBuscarJugadorKeyReleased

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        if (!validar()) return;
        Jugador jugador = new Jugador(
                txtNombre.getText(),
                txtApellido.getText(),
                Integer.parseInt(txtNumero.getText()),
                java.sql.Date.valueOf(txtFechaNacimiento.getText()),
                cmbPais.getItemAt(cmbPais.getSelectedIndex()).getId(),
                cmbEquipo.getItemAt(cmbEquipo.getSelectedIndex()).getId()
        );
        jr.save(jugador);
        JOptionPane.showMessageDialog(this, "Se dio de alta un Jugador id: " + jugador.getId());
        limpiar();
        cargar();
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int index = tblJugadores.getSelectedRow();
        if (index == -1) return;
        Jugador jugador = jr.getById(Integer.parseInt(tblJugadores.getValueAt(index, 0) + ""));
        if (sr.getByJugador_id(jugador.getId()) != null) {
            JOptionPane.showMessageDialog(this, "No se puede borrar el jugador porque tiene stats.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this,
                "¿Desea borrar al jugador " + jugador.getNombre()
                        + " " + jugador.getApellido()) != 0) return;
        jr.remove(jugador);
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void cargar(){
        cmbPais.removeAllItems();
        pr.getAll().forEach(cmbPais::addItem);
        cmbEquipo.removeAllItems();
        er.getAll().forEach(cmbEquipo::addItem);
        new Table<Jugador>().cargar(tblJugadores, jr.getAll());
    }

    private void limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtNumero.setText("");
        txtFechaNacimiento.setText("");
        cmbPais.setSelectedIndex(0);
        cmbEquipo.setSelectedIndex(0);
        txtNombre.requestFocus();
    }
    
    private boolean validar(){
        if (!new Validator(txtNombre).length(2, 35)) return false;
        if (!new Validator(txtApellido).length(2, 35)) return false;
        if (!new Validator(txtNumero).isInteger(1, 99)) return false;
        if (!new Validator(txtFechaNacimiento).length(10)) return false;
        if (!new Validator(txtFechaNacimiento).isValidDate()) return false;
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Equipo> cmbEquipo;
    private javax.swing.JComboBox<Pais> cmbPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblJugadores;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarJugador;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
