package gui;

import connectors.Connector;
import entities.Liga;
import entities.Pais;
import javax.swing.JOptionPane;
import repositories.interfaces.I_EquipoRepository;
import repositories.interfaces.I_LigaRepository;
import repositories.interfaces.I_PaisRepository;
import repositories.jdbc.EquipoRepository;
import repositories.jdbc.LigaRepository;
import repositories.jdbc.PaisRepository;
import utils.swing.Table;
import utils.swing.Validator;

public class Ligas extends javax.swing.JInternalFrame {
    private I_LigaRepository lr;
    private I_EquipoRepository er;
    private I_PaisRepository pr;
    public Ligas() {
        super(
                "Formulario de Ligas",    // titulo 
                true,                       // resizable
                true,                       // closable
                true,                       // maximizable
                true);                      // iconable
        initComponents();
        lr = new LigaRepository(Connector.getConnection());
        er = new EquipoRepository(Connector.getConnection());
        pr = new PaisRepository(Connector.getConnection());
        cargar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtDivision = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarLiga = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLigas = new javax.swing.JTable();

        jLabel1.setText("País");

        jLabel2.setText("Nombre");

        jLabel3.setText("División");

        btnAlta.setText("Dar de Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar Liga:");

        txtBuscarLiga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarLigaKeyReleased(evt);
            }
        });

        btnEliminar.setText("Eliminar Liga");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblLigas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblLigas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDivision)
                                            .addComponent(txtNombre)
                                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(btnAlta))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBuscarLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(152, 152, 152)
                                        .addComponent(btnEliminar)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnAlta)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscarLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarLigaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarLigaKeyReleased
        new Table<Liga>().cargar(tblLigas, lr.getLikeNombre(txtBuscarLiga.getText()));
    }//GEN-LAST:event_txtBuscarLigaKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int index = tblLigas.getSelectedRow();
        if (index == -1) return;
        Liga liga = lr.getById(Integer.parseInt(tblLigas.getValueAt(index, 0) + ""));
        if (!er.getByLiga(liga).isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se puede borrar la liga porque tiene equipos.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this,
                "¿Desea borrar la liga " + liga.getNombre()
                + " de la " + liga.getDivision()
                + "° división de " + pr.getById(liga.getPais_id()).getNombre() + "?") != 0) return;
        lr.remove(liga);
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        if (!validar()) return;
        Liga liga = new Liga(
                cmbPais.getItemAt(cmbPais.getSelectedIndex()).getId(),
                txtNombre.getText(),
                Integer.parseInt(txtDivision.getText())
        );
        lr.save(liga);
        JOptionPane.showMessageDialog(this,
                "Se dio de alta una Liga id: " + liga.getId());
        limpiar();
        cargar();
    }//GEN-LAST:event_btnAltaActionPerformed

    public void cargar(){
        cmbPais.removeAllItems();
        pr.getAll().forEach(cmbPais::addItem);
        new Table<Liga>().cargar(tblLigas, lr.getAll());
    }
    
    private void limpiar(){
        cmbPais.setSelectedIndex(0);
        txtNombre.setText("");
        txtDivision.setText("");
        txtNombre.requestFocus();
    }
    
    private boolean validar(){
        if (!new Validator(txtNombre).length(3, 25)) return false;
        if (!new Validator(txtDivision).isInteger(1, 9)) return false;
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Pais> cmbPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblLigas;
    private javax.swing.JTextField txtBuscarLiga;
    private javax.swing.JTextField txtDivision;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
