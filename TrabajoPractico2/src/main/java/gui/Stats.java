package gui;

import connectors.Connector;
import entities.Stat;
import enums.Pie;
import enums.Posicion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import repositories.interfaces.I_JugadorRepository;
import repositories.interfaces.I_StatRepository;
import repositories.jdbc.JugadorRepository;
import repositories.jdbc.StatRepository;
import utils.swing.Table;
import utils.swing.Validator;

public class Stats extends javax.swing.JInternalFrame {
    private I_StatRepository sr;
    private I_JugadorRepository jr;
    public Stats() {
        super(
                "Formulario de Stats",    // titulo 
                true,                       // resizable
                true,                       // closable
                true,                       // maximizable
                true);
        sr = new StatRepository(Connector.getConnection());
        jr = new JugadorRepository(Connector.getConnection());
        initComponents();
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
        txtIDJugador = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        cmbPosicion = new javax.swing.JComboBox<>();
        cmbPie = new javax.swing.JComboBox<>();
        txtPeso = new javax.swing.JTextField();
        txtValoracion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAtaque = new javax.swing.JTextField();
        txtDefensa = new javax.swing.JTextField();
        txtPases = new javax.swing.JTextField();
        txtVelocidad = new javax.swing.JTextField();
        txtTiro = new javax.swing.JTextField();
        txtPotencial = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtBuscarStat = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStats = new javax.swing.JTable();

        jLabel1.setText("ID del Jugador");

        jLabel2.setText("Posición");

        jLabel3.setText("Pie");

        jLabel4.setText("Altura (en cm)");

        jLabel5.setText("Peso (en kg)");

        jLabel6.setText("Valoración");

        txtIDJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDJugadorActionPerformed(evt);
            }
        });

        jLabel7.setText("Ataque");

        jLabel8.setText("Defensa");

        jLabel9.setText("Pases");

        jLabel10.setText("Velocidad");

        jLabel11.setText("Tiro");

        jLabel12.setText("Potencial");

        btnAlta.setText("Dar de Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        jLabel13.setText("Buscar Stat (según ID del Jugador):");

        txtBuscarStat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarStatKeyReleased(evt);
            }
        });

        btnEliminar.setText("Eliminar Stat");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblStats.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblStats);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAltura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel12))
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPotencial)
                    .addComponent(txtAtaque)
                    .addComponent(txtDefensa)
                    .addComponent(txtPases)
                    .addComponent(txtVelocidad)
                    .addComponent(txtTiro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarStat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtPases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtTiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValoracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtPotencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlta)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtBuscarStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDJugadorActionPerformed

    private void txtBuscarStatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarStatKeyReleased
        List<Stat> lista = new ArrayList();
        lista.add(sr.getByJugador_id(Integer.parseInt(txtBuscarStat.getText())));
        new Table<Stat>().cargar(tblStats, lista);
    }//GEN-LAST:event_txtBuscarStatKeyReleased

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        if (!validar()) return;
        if (jr.getById(Integer.parseInt(txtIDJugador.getText())) == null) {
            JOptionPane.showMessageDialog(this, "No existe el jugador de ID: " + txtIDJugador.getText());
            txtIDJugador.requestFocus();
            return;
        }
        if (sr.getByJugador_id(Integer.parseInt(txtIDJugador.getText())) != null) {
            JOptionPane.showMessageDialog(this, "Ya existen los stats del jugador con ese ID.");
            txtIDJugador.requestFocus();
            return;
        }
        Stat stat = new Stat(
                Integer.parseInt(txtIDJugador.getText()),
                cmbPosicion.getItemAt(cmbPosicion.getSelectedIndex()),
                cmbPie.getItemAt(cmbPie.getSelectedIndex()),
                Integer.parseInt(txtAltura.getText()),
                Integer.parseInt(txtPeso.getText()),
                Integer.parseInt(txtAtaque.getText()),
                Integer.parseInt(txtDefensa.getText()),
                Integer.parseInt(txtPases.getText()),
                Integer.parseInt(txtVelocidad.getText()),
                Integer.parseInt(txtTiro.getText()),
                Integer.parseInt(txtValoracion.getText()),
                Integer.parseInt(txtPotencial.getText())
        );
        sr.save(stat);
        JOptionPane.showMessageDialog(this, "Se dieron de alta los stats para el Jugador "
            + jr.getById(stat.getJugador_id()).getNombre()
            + " " + jr.getById(stat.getJugador_id()).getApellido()
            + ", de ID: " + stat.getJugador_id());
        limpiar();
        cargar();
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int index = tblStats.getSelectedRow();
        if (index == -1) return;
        Stat stat = sr.getByJugador_id(Integer.parseInt(tblStats.getValueAt(index, 0) + ""));
        if (JOptionPane.showConfirmDialog(this,
                "¿Desea borrar los stats del Jugador "
                + jr.getById(stat.getJugador_id()).getNombre()
                + " " + jr.getById(stat.getJugador_id()).getApellido()
                + ", de ID: " + stat.getJugador_id()) != 0) return;
        sr.remove(stat);
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void cargar(){
        cmbPosicion.removeAllItems();
        for (Posicion pos:Posicion.values()) cmbPosicion.addItem(pos);
        cmbPie.removeAllItems();
        for (Pie pie:Pie.values()) cmbPie.addItem(pie);
        new Table<Stat>().cargar(tblStats, sr.getAll());
    }
    
    private void limpiar(){
        txtIDJugador.setText("");
        cmbPosicion.setSelectedIndex(0);
        cmbPie.setSelectedIndex(0);
        txtAltura.setText("");
        txtPeso.setText("");
        txtAtaque.setText("");
        txtDefensa.setText("");
        txtPases.setText("");
        txtVelocidad.setText("");
        txtTiro.setText("");
        txtValoracion.setText("");
        txtPotencial.setText("");
        txtIDJugador.requestFocus();
    }

    private boolean validar(){
        if (!new Validator(txtIDJugador).isInteger()) return false;
        if (!new Validator(txtAltura).isInteger(100, 220)) return false;
        if (!new Validator(txtPeso).isInteger(40, 130)) return false;
        if (!new Validator(txtAtaque).isInteger(1, 99)) return false;
        if (!new Validator(txtDefensa).isInteger(1, 99)) return false;
        if (!new Validator(txtPases).isInteger(1, 99)) return false;
        if (!new Validator(txtVelocidad).isInteger(1, 99)) return false;
        if (!new Validator(txtTiro).isInteger(1, 99)) return false;
        if (!new Validator(txtValoracion).isInteger(1, 99)) return false;
        if (!new Validator(txtPotencial).isInteger(1, 99)) return false;
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Pie> cmbPie;
    private javax.swing.JComboBox<Posicion> cmbPosicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblStats;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtAtaque;
    private javax.swing.JTextField txtBuscarStat;
    private javax.swing.JTextField txtDefensa;
    private javax.swing.JTextField txtIDJugador;
    private javax.swing.JTextField txtPases;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPotencial;
    private javax.swing.JTextField txtTiro;
    private javax.swing.JTextField txtValoracion;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables

}
