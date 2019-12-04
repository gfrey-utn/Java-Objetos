package gui;

import connectors.Connector;
import entities.Pais;
import javax.swing.JOptionPane;
import repositories.interfaces.I_JugadorRepository;
import repositories.interfaces.I_LigaRepository;
import repositories.interfaces.I_PaisRepository;
import repositories.jdbc.JugadorRepository;
import repositories.jdbc.LigaRepository;
import repositories.jdbc.PaisRepository;
import utils.swing.Table;
import utils.swing.Validator;

public class Paises extends javax.swing.JInternalFrame {
    private I_PaisRepository pr;
    private I_LigaRepository lr;
    private I_JugadorRepository jr;
    public Paises() {
        super(
                "Formulario de Países",    // titulo 
                true,                       // resizable
                true,                       // closable
                true,                       // maximizable
                true);                      // iconable
        initComponents();
        pr = new PaisRepository(Connector.getConnection());
        lr = new LigaRepository(Connector.getConnection());
        jr = new JugadorRepository(Connector.getConnection());
        cargar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarPais = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaises = new javax.swing.JTable();

        jLabel1.setText("Nombre");

        btnAlta.setText("Dar de Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar País:");

        txtBuscarPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPaisKeyReleased(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblPaises.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPaises);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarPais, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlta))
                .addGap(38, 38, 38)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        if (!validar()) return;
        Pais pais = new Pais(txtNombre.getText());
        pr.save(pais);
        JOptionPane.showMessageDialog(this,
                "Se dio de alta un País id: " + pais.getId());
        limpiar();
        cargar();
    }//GEN-LAST:event_btnAltaActionPerformed

    private void txtBuscarPaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPaisKeyReleased
        String buscarPais = txtBuscarPais.getText();
        if (buscarPais == null) buscarPais = "";
        new Table<Pais>().cargar(tblPaises, pr.getLikeNombre(buscarPais));
    }//GEN-LAST:event_txtBuscarPaisKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int index = tblPaises.getSelectedRow();
        if (index == -1) return;
        Pais pais = pr.getById(Integer.parseInt(tblPaises.getValueAt(index, 0) + ""));
        if (!jr.getByPais(pais).isEmpty() || !lr.getByPais(pais).isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se puede borrar el país porque tiene jugadores y/o ligas.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this,
                "¿Desea borrar el país " + pais.getNombre() + "?") != 0) return;
        pr.remove(pais);
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void cargar(){
        new Table<Pais>().cargar(tblPaises, pr.getAll());
    }

    private void limpiar(){
        txtNombre.setText("");
    }
    
    private boolean validar(){
        if (!new Validator(txtNombre).length(3, 25)) return false;
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblPaises;
    private javax.swing.JTextField txtBuscarPais;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
