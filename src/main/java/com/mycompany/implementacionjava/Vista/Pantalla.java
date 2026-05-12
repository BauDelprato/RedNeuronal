package com.mycompany.implementacionjava.Vista;

public class Pantalla extends javax.swing.JPanel {

    public Pantalla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFiebre = new javax.swing.JTextField();
        jTos = new javax.swing.JTextField();
        jDolorDeCabeza = new javax.swing.JTextField();
        jNauseas = new javax.swing.JTextField();
        jlbPeso1 = new javax.swing.JLabel();
        jlbPeso2 = new javax.swing.JLabel();
        jlbPeso3 = new javax.swing.JLabel();
        jlbPeso4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfFactorAprendizaje = new javax.swing.JTextField();
        btnAutoEntrenar = new javax.swing.JButton();
        btnPrueba = new javax.swing.JButton();
        jlbSalidaPrueba = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setText("CALCULADORA DE PROBABILIDAD DE INFECCION");

        jLabel1.setText("Fiebre:");

        jLabel2.setText("Tos:");

        jLabel4.setText("Dolor de Cabeza:");

        jLabel5.setText("Náuseas:");

        jNauseas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNauseasActionPerformed(evt);
            }
        });

        jlbPeso1.setText("Peso 1:");
        jlbPeso1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbPeso2.setText("Peso 2:");
        jlbPeso2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbPeso3.setText("Peso 3:");
        jlbPeso3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbPeso4.setText("Peso 4:");
        jlbPeso4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setText("Factor de Aprendizaje:");

        jtfFactorAprendizaje.setText("0.6");

        btnAutoEntrenar.setText("Entrenamiento Automático");

        btnPrueba.setText("Prueba");

        jlbSalidaPrueba.setText("Salida Obtenida:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jFiebre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbPeso1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbPeso2)
                                .addGap(27, 27, 27))
                            .addComponent(jTos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDolorDeCabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbPeso3))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbPeso4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jNauseas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(223, 223, 223))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jlbSalidaPrueba))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfFactorAprendizaje, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAutoEntrenar))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFiebre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDolorDeCabeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNauseas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrueba))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbPeso1)
                            .addComponent(jlbPeso3)
                            .addComponent(jlbPeso4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbPeso2)))
                .addGap(58, 58, 58)
                .addComponent(jlbSalidaPrueba)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFactorAprendizaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAutoEntrenar)
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jNauseasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNauseasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNauseasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAutoEntrenar;
    public javax.swing.JButton btnPrueba;
    private javax.swing.JTextField jDolorDeCabeza;
    private javax.swing.JTextField jFiebre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jNauseas;
    private javax.swing.JTextField jTos;
    public javax.swing.JLabel jlbPeso1;
    public javax.swing.JLabel jlbPeso2;
    public javax.swing.JLabel jlbPeso3;
    public javax.swing.JLabel jlbPeso4;
    public javax.swing.JLabel jlbSalidaPrueba;
    public javax.swing.JTextField jtfFactorAprendizaje;
    // End of variables declaration//GEN-END:variables

    public String getFiebre() {
        return jFiebre.getText();
    }

    public String getTos() {
        return jTos.getText();
    }

    public String getDolorCabeza() {
        return jDolorDeCabeza.getText();
    }

    public String getNauseas() {
        return jNauseas.getText();
    }

}
