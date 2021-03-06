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
public class ViewAscendente extends javax.swing.JPanel {

    /**
     * Creates new form ViewAscendente
     */
    public ViewAscendente() {
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

        jtf_numero_insertado = new javax.swing.JTextField();
        jsp_lista_numeros = new javax.swing.JScrollPane();
        jli_lista = new javax.swing.JList<>();
        jbtn_agregar = new javax.swing.JButton();
        jbtn_ascendente = new javax.swing.JButton();
        jbtn_promedio = new javax.swing.JButton();
        jlb_entrar = new javax.swing.JLabel();
        jlb_resultado = new javax.swing.JLabel();

        jtf_numero_insertado.setEditable(false);
        jtf_numero_insertado.setBackground(new java.awt.Color(255, 255, 255));
        jtf_numero_insertado.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jtf_numero_insertado.setForeground(new java.awt.Color(204, 204, 204));

        jli_lista.setForeground(new java.awt.Color(204, 204, 204));
        jsp_lista_numeros.setViewportView(jli_lista);

        jbtn_agregar.setBackground(new java.awt.Color(102, 102, 255));
        jbtn_agregar.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_agregar.setText("Agregar");
        jbtn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_agregarMouseClicked(evt);
            }
        });

        jbtn_ascendente.setBackground(new java.awt.Color(102, 102, 255));
        jbtn_ascendente.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_ascendente.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_ascendente.setText("Ascendente");

        jbtn_promedio.setBackground(new java.awt.Color(102, 102, 255));
        jbtn_promedio.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_promedio.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_promedio.setText("Promedio");

        jlb_entrar.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jlb_entrar.setForeground(new java.awt.Color(204, 204, 204));
        jlb_entrar.setText("Agregar");

        jlb_resultado.setFont(new java.awt.Font("PakType Naskh Basic", 1, 18)); // NOI18N
        jlb_resultado.setForeground(new java.awt.Color(204, 204, 204));
        jlb_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_resultado.setText("MVC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlb_entrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_numero_insertado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jsp_lista_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_ascendente, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jbtn_promedio, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_entrar)
                    .addComponent(jtf_numero_insertado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_agregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jsp_lista_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtn_ascendente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jlb_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_agregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_agregarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_agregar;
    public javax.swing.JButton jbtn_ascendente;
    public javax.swing.JButton jbtn_promedio;
    public javax.swing.JLabel jlb_entrar;
    public javax.swing.JLabel jlb_resultado;
    public javax.swing.JList<String> jli_lista;
    public javax.swing.JScrollPane jsp_lista_numeros;
    public javax.swing.JTextField jtf_numero_insertado;
    // End of variables declaration//GEN-END:variables
}
