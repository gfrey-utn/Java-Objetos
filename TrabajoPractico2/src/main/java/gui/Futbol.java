package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Futbol extends javax.swing.JFrame {
    public Futbol() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuVentanas = new javax.swing.JMenu();
        mniEquipos = new javax.swing.JMenuItem();
        mniJugadores = new javax.swing.JMenuItem();
        mniLigas = new javax.swing.JMenuItem();
        mniPaises = new javax.swing.JMenuItem();
        mniStats = new javax.swing.JMenuItem();
        mnuOpciones = new javax.swing.JMenu();
        mniAcerca = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        mnuVentanas.setText("Ventanas");

        mniEquipos.setText("Equipos");
        mniEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEquiposActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniEquipos);

        mniJugadores.setText("Jugadores");
        mniJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniJugadoresActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniJugadores);

        mniLigas.setText("Ligas");
        mniLigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLigasActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniLigas);

        mniPaises.setText("Países");
        mniPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPaisesActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniPaises);

        mniStats.setText("Stats");
        mniStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniStatsActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniStats);

        jMenuBar1.add(mnuVentanas);

        mnuOpciones.setText("Opciones");

        mniAcerca.setText("Acerca");
        mniAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaActionPerformed(evt);
            }
        });
        mnuOpciones.add(mniAcerca);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mnuOpciones.add(mniSalir);

        jMenuBar1.add(mnuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaActionPerformed
        JOptionPane.showMessageDialog(this, "Sistema de Base de Datos de fútbol 2019.");
    }//GEN-LAST:event_mniAcercaActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEquiposActionPerformed
        Equipos equipos = new Equipos();
        desktop.add(equipos);
        equipos.setVisible(true);
    }//GEN-LAST:event_mniEquiposActionPerformed

    private void mniJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniJugadoresActionPerformed
        Jugadores jugadores = new Jugadores();
        desktop.add(jugadores);
        jugadores.setVisible(true);
    }//GEN-LAST:event_mniJugadoresActionPerformed

    private void mniLigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLigasActionPerformed
        Ligas ligas = new Ligas();
        desktop.add(ligas);
        ligas.setVisible(true);
    }//GEN-LAST:event_mniLigasActionPerformed

    private void mniPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPaisesActionPerformed
        Paises paises = new Paises();
        desktop.add(paises);
        paises.setVisible(true);
    }//GEN-LAST:event_mniPaisesActionPerformed

    private void mniStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniStatsActionPerformed
        Stats stats = new Stats();
        desktop.add(stats);
        stats.setVisible(true);
    }//GEN-LAST:event_mniStatsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Futbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Futbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Futbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Futbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Futbol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAcerca;
    private javax.swing.JMenuItem mniEquipos;
    private javax.swing.JMenuItem mniJugadores;
    private javax.swing.JMenuItem mniLigas;
    private javax.swing.JMenuItem mniPaises;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenuItem mniStats;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenu mnuVentanas;
    // End of variables declaration//GEN-END:variables
}
