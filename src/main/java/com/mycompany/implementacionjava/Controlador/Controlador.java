package com.mycompany.implementacionjava.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

import com.mycompany.implementacionjava.Modelo.RedNeuronal;
import com.mycompany.implementacionjava.Vista.Pantalla;

public class Controlador implements ActionListener {

    private Pantalla view;
    private RedNeuronal redNeuronal;

    public Controlador(Pantalla view, RedNeuronal redNeuronal) {

        this.view = view;
        this.redNeuronal = redNeuronal;

        view.btnAutoEntrenar.addActionListener(this);
        view.btnPrueba.addActionListener(this);
    }

    public void iniciar() {

        view.jlbSalidaPrueba.setText("Esperando prueba...");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.btnAutoEntrenar) {
            entrenarRed();
        }

        if (e.getSource() == view.btnPrueba) {
            probarRed();
        }
    }

    private void entrenarRed() {

        try {

            float factor = Float.parseFloat(
                    view.jtfFactorAprendizaje.getText()
            );

            float[][] trainingData = {
                // fiebre, tos, cabeza, nauseas, salida
                {1, 1, 1, 1, 1},
                {1, 1, 0, 0, 0.8f},
                {1, 0, 1, 0, 0.7f},
                {0, 1, 0, 0, 0.3f},
                {0, 0, 0, 0, 0}
            };

            int epocas = 10000;

            for (int i = 0; i < epocas; i++) {

                for (float[] fila : trainingData) {

                    redNeuronal.entrenar(
                            fila[0],
                            fila[1],
                            fila[2],
                            fila[3],
                            fila[4],
                            factor
                    );
                }
            }

            mostrarPesos();

            showMessageDialog(null,
                    "Red entrenada correctamente");

        } catch (Exception ex) {

            showMessageDialog(null,
                    "Factor de aprendizaje inválido");
        }
    }

    private void probarRed() {

        try {

            int fiebre = validarEntradaBinaria(
                    view.getFiebre());

            int tos = validarEntradaBinaria(
                    view.getTos());

            int cabeza = validarEntradaBinaria(
                    view.getDolorCabeza());

            int nauseas = validarEntradaBinaria(
                    view.getNauseas());

            float resultado = redNeuronal.predecir(
                    fiebre,
                    tos,
                    cabeza,
                    nauseas
            );

            view.jlbSalidaPrueba.setText(
                    "Probabilidad infección: "
                    + String.format("%.4f", resultado)
            );

        } catch (Exception ex) {

            showMessageDialog(
                    null,
                    "Solo se permite ingresar 0 o 1"
            );
        }
    }

    private void mostrarPesos() {

        float[] pesos = redNeuronal.getPesosEntrada();

        view.jlbPeso1.setText(
                "Peso fiebre: "
                + String.format("%.4f", pesos[1]));

        view.jlbPeso2.setText(
                "Peso tos: "
                + String.format("%.4f", pesos[2]));

        view.jlbPeso3.setText(
                "Peso cabeza: "
                + String.format("%.4f", pesos[3]));

        view.jlbPeso4.setText(
                "Peso náuseas: "
                + String.format("%.4f", pesos[4]));
    }

    private int validarEntradaBinaria(String valor) throws Exception {

        int numero = Integer.parseInt(valor);

        if (numero != 0 && numero != 1) {
            throw new Exception();
        }

        return numero;
    }
}
