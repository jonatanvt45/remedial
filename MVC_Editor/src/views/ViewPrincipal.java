/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author JonatanVT
 */
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlb_encabezado = new javax.swing.JLabel();
        jmb_barra_menu_paneles = new javax.swing.JMenuBar();
        jme_menu_paneles = new javax.swing.JMenu();
        jmi_ascendente = new javax.swing.JMenuItem();
        jmi_editor_texto = new javax.swing.JMenuItem();
        jmi_mayor3_numeros = new javax.swing.JMenuItem();
        jmi_operaciones = new javax.swing.JMenuItem();
        jmi_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlb_encabezado.setFont(new java.awt.Font("PakType Naskh Basic", 1, 48)); // NOI18N
        jlb_encabezado.setForeground(new java.awt.Color(204, 204, 204));
        jlb_encabezado.setText("MVCPrincipal");

        jme_menu_paneles.setText("Archivo");
        jme_menu_paneles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jme_menu_panelesMouseClicked(evt);
            }
        });

        jmi_ascendente.setText("Ascendente");
        jme_menu_paneles.add(jmi_ascendente);

        jmi_editor_texto.setText("Editor de Texto");
        jme_menu_paneles.add(jmi_editor_texto);

        jmi_mayor3_numeros.setText("Mayor");
        jme_menu_paneles.add(jmi_mayor3_numeros);

        jmi_operaciones.setText("Operaciones");
        jme_menu_paneles.add(jmi_operaciones);

        jmi_salir.setText("Salir");
        jme_menu_paneles.add(jmi_salir);

        jmb_barra_menu_paneles.add(jme_menu_paneles);

        setJMenuBar(jmb_barra_menu_paneles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jlb_encabezado)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jlb_encabezado)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jme_menu_panelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jme_menu_panelesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jme_menu_panelesMouseClicked

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jlb_encabezado;
    public javax.swing.JMenuBar jmb_barra_menu_paneles;
    public javax.swing.JMenu jme_menu_paneles;
    public javax.swing.JMenuItem jmi_ascendente;
    public javax.swing.JMenuItem jmi_editor_texto;
    public javax.swing.JMenuItem jmi_mayor3_numeros;
    public javax.swing.JMenuItem jmi_operaciones;
    public javax.swing.JMenuItem jmi_salir;
    // End of variables declaration//GEN-END:variables
}