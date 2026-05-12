
package com.mycompany.implementacionjava.Vista;

import java.awt.BorderLayout;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        
        panelGrafico.setLayout(new BorderLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrenamiento = new javax.swing.JButton();
        btnAprendizaje = new javax.swing.JButton();
        jlbEstado = new javax.swing.JLabel();
        jlbEntrada1 = new javax.swing.JLabel();
        jlbEntrada2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbPeso1 = new javax.swing.JLabel();
        jlbPeso2 = new javax.swing.JLabel();
        jlbUmbral = new javax.swing.JLabel();
        jlbSalidaDeseada = new javax.swing.JLabel();
        jlbSalidaObtenida = new javax.swing.JLabel();
        jtfEntrada1 = new javax.swing.JTextField();
        jtfEntrada2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbSalidaPrueba = new javax.swing.JLabel();
        btnPrueba = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelGrafico = new javax.swing.JPanel();
        btnAutoEntrenar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jtfFactor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfEntrada3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfEntrada4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEntrenamiento.setText("Entrenamiento");
        btnEntrenamiento.setEnabled(false);

        btnAprendizaje.setText("Aprendizaje");
        btnAprendizaje.setEnabled(false);

        jlbEstado.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jlbEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbEstado.setText("HAGA CLICK EN \"Entrenamiento\" PARA COMENZAR");
        jlbEstado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbEntrada1.setText("Entrada 1:");
        jlbEntrada1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbEntrada2.setText("Entrada 2:");
        jlbEntrada2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setText("Entrada 0: 1");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbPeso1.setText("Peso 1:");
        jlbPeso1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbPeso2.setText("Peso 2:");
        jlbPeso2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbUmbral.setText("Umbral:");
        jlbUmbral.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbSalidaDeseada.setText("Salida Deseada:");
        jlbSalidaDeseada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbSalidaObtenida.setText("Salida Obtenida: ");
        jlbSalidaObtenida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jtfEntrada1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfEntrada2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Entrada 1: ");

        jLabel2.setText("Entrada 2:");

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setText("EJERCICIO PARA PROBAR EL PERCEPTRON:");

        jlbSalidaPrueba.setText("Salida Obtenida:");

        btnPrueba.setText("Prueba");

        jLabel5.setText("Factor Aprendizaje: 0.6");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        btnAutoEntrenar.setText("Entrenamiento Automático");

        btnReset.setText("Reiniciar Perceptrón");

        jtfFactor.setText("0.6");

        jLabel6.setText("Factor de Aprendizaje:");

        jLabel7.setText("Entrada 3: ");

        jtfEntrada3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setText("Entrada 4:");

        jtfEntrada4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEntrenamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAprendizaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAutoEntrenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbSalidaDeseada)
                            .addComponent(jlbPeso1)
                            .addComponent(jlbEntrada1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtfEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jlbEntrada2)
                            .addComponent(jlbPeso2)
                            .addComponent(jlbSalidaObtenida)
                            .addComponent(jlbEstado)
                            .addComponent(jLabel3)
                            .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEntrada3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfEntrada4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jlbUmbral)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbSalidaPrueba))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jlbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlbEntrada1)
                                    .addComponent(jlbEntrada2))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlbPeso1)
                                    .addComponent(jlbPeso2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlbSalidaDeseada)
                                    .addComponent(jlbSalidaObtenida)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEntrenamiento)
                                .addGap(18, 18, 18)
                                .addComponent(btnAprendizaje)))
                        .addGap(16, 16, 16)
                        .addComponent(btnAutoEntrenar)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPrueba)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtfEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfEntrada4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfEntrada3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)
                        .addComponent(jlbUmbral)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(110, 110, 110)
                        .addComponent(jlbSalidaPrueba)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnReset)))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAprendizaje;
    public javax.swing.JButton btnAutoEntrenar;
    public javax.swing.JButton btnEntrenamiento;
    public javax.swing.JButton btnPrueba;
    public javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jlbEntrada1;
    public javax.swing.JLabel jlbEntrada2;
    public javax.swing.JLabel jlbEstado;
    public javax.swing.JLabel jlbPeso1;
    public javax.swing.JLabel jlbPeso2;
    public javax.swing.JLabel jlbSalidaDeseada;
    public javax.swing.JLabel jlbSalidaObtenida;
    public javax.swing.JLabel jlbSalidaPrueba;
    public javax.swing.JLabel jlbUmbral;
    public javax.swing.JTextField jtfEntrada1;
    public javax.swing.JTextField jtfEntrada2;
    public javax.swing.JTextField jtfEntrada3;
    public javax.swing.JTextField jtfEntrada4;
    public javax.swing.JTextField jtfFactor;
    public javax.swing.JPanel panelGrafico;
    // End of variables declaration//GEN-END:variables
}
