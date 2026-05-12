package com.mycompany.implementacionjava.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

import com.mycompany.implementacionjava.Vista.Ventana;
import com.mycompany.implementacionjava.Modelo.Grafico;
import com.mycompany.implementacionjava.Modelo.PerceptronSimpleAND;
import com.mycompany.implementacionjava.Modelo.RedNeuronal;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartPanel;

public class Controlador implements ActionListener {

    private Ventana view;
    private Grafico grafico;
    private Grafico graficoConRecta;
    private ChartPanel chartPanel;
    private ChartPanel chartPanel2;
    private PerceptronSimpleAND perceptronSimpleAND;
    private RedNeuronal redNeuronal;
    private float factorAprendizaje = 0.6f;

    public Controlador(Ventana view, Grafico grafico, /*PerceptronSimpleAND perceptronSimpleAND*/ RedNeuronal redNeuronal ) {
        this.view = view;
        this.grafico = grafico;
      //this.perceptronSimpleAND = perceptronSimpleAND;
        this.redNeuronal = redNeuronal;
        this.view.btnEntrenamiento.addActionListener(this);
        this.view.btnAprendizaje.addActionListener(this);
        this.view.btnAutoEntrenar.addActionListener(this);
        this.view.btnPrueba.addActionListener(this);
        this.view.btnReset.addActionListener(this);

        this.chartPanel = this.grafico.getChartPanel();
        this.chartPanel.setPreferredSize(new Dimension(400, 400));
        this.view.panelGrafico.removeAll();
        this.view.panelGrafico.add(chartPanel, BorderLayout.CENTER);
        this.view.panelGrafico.validate();
    }

    public void iniciar() {
        view.setTitle("PERCEPTRÓN SIMPLE AND");
        view.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.btnEntrenamiento) {

            try {
                float nuevoFactor = Float.parseFloat(view.jtfFactor.getText());
                if (nuevoFactor <= 0) {
                    showMessageDialog(null, "El factor debe ser mayor a 0");
                    return;
                } else {
                    perceptronSimpleAND.setFactorAprendizaje(nuevoFactor);
                }
            } catch (Exception ex) {
                showMessageDialog(null, "Factor inválido");
                return;
            }

            perceptronSimpleAND.Entrenamiento();

            if (perceptronSimpleAND.getFila() == 4) {
                view.jlbEstado.setText("ENTRENAMIENTO COMPLETADO - DATOS FINALES:");
            } else {
                view.jlbEstado.setText("ENTRENAMIENTO FALLIDO - DATOS OBTENIDO:");
            }

            view.jlbEntrada1.setText("Entada 1: " + Float.toString(perceptronSimpleAND.getEntradas(1)));
            view.jlbEntrada2.setText("Entada 2: " + Float.toString(perceptronSimpleAND.getEntradas(2)));

            view.jlbPeso1.setText("Peso 1: " + Float.toString(perceptronSimpleAND.getW1()));
            view.jlbPeso2.setText("Peso 2: " + Float.toString(perceptronSimpleAND.getW2()));
            view.jlbUmbral.setText("Umbral: " + Float.toString(perceptronSimpleAND.getW0()));

            view.jlbSalidaDeseada.setText("Salida Deseada: " + Float.toString(perceptronSimpleAND.getSalidas((int) perceptronSimpleAND.getFila())));
            view.jlbSalidaObtenida.setText("Salida Obtenida: " + Float.toString(perceptronSimpleAND.getY()));

            float X1 = -2;
            float Y1 = (-perceptronSimpleAND.getW0() - perceptronSimpleAND.getW1() * X1) / perceptronSimpleAND.getW2();

            float X2 = 2;
            float Y2 = (-perceptronSimpleAND.getW0() - perceptronSimpleAND.getW1() * X2) / perceptronSimpleAND.getW2();

            graficoConRecta = new Grafico(Y1, Y2, X1, X2, perceptronSimpleAND.getRepeticion());
            chartPanel2 = graficoConRecta.getChartPanel();
            chartPanel2.setPreferredSize(new Dimension(400, 400));
            view.panelGrafico.removeAll();
            view.panelGrafico.add(chartPanel2, BorderLayout.CENTER);
            view.panelGrafico.validate();
        }

        if (e.getSource() == view.btnAprendizaje) {

            if (perceptronSimpleAND.getError() != 0f) {

                try {
                    float nuevoFactor = Float.parseFloat(view.jtfFactor.getText());
                    if (nuevoFactor <= 0) {
                        showMessageDialog(null, "El factor debe ser mayor a 0");
                        return;
                    }
                    perceptronSimpleAND.setFactorAprendizaje(nuevoFactor);
                } catch (Exception ex) {
                    showMessageDialog(null, "Factor inválido");
                    return;
                }

                perceptronSimpleAND.Aprendizaje();

                showMessageDialog(null, """
                                        Recalculamos los Pesos
                                         Nuevo Umbral = """ + perceptronSimpleAND.getW0()
                        + "\n Nuevo Peso 1 = " + perceptronSimpleAND.getW1()
                        + "\n Nuevo Peso 2 = " + perceptronSimpleAND.getW2());
            }
        }

        if (e.getSource() == view.btnAutoEntrenar) {
            float factorAprendizaje = 0.6f;
            try {
                factorAprendizaje = Float.parseFloat(view.jtfFactor.getText());
                if (factorAprendizaje <= 0) {
                    showMessageDialog(null, "El factor debe ser mayor a 0");
                    return;
                }
            } catch (Exception ex) {
                showMessageDialog(null, "Factor inválido. Revisá la caja de texto.");
                return;
            }

            // base de datos de ejemplo: {x1, x2, x3, x4, salidaEsperada}
            float[][] trainingData = {
                {1, 1, 0, 0, 1}, // Ejemplo: síntomas presentes -> enfermo (1)
                {0, 0, 1, 1, 0}, // Ejemplo: otros síntomas -> sano (0)
                {1, 0, 1, 0, 0.5f}
            };

            int maxEpocas = 10000; //límite de 10000 repeticiones

            //backpropagation
            for (int epoca = 0; epoca < maxEpocas; epoca++) {
                for (float[] fila : trainingData) {
                    redNeuronal.entrenar(fila[0], fila[1], fila[2], fila[3], fila[4], factorAprendizaje);
                }
            }
            view.jlbEstado.setText("AUTO-ENTRENAMIENTO COMPLETADO (" + maxEpocas + " épocas)");
            showMessageDialog(null, "¡Red Neuronal Entrenada exitosamente!");

        }

        if (e.getSource() == view.btnPrueba) {
    try {
        float x1 = Float.parseFloat(view.jtfEntrada1.getText());
        float x2 = Float.parseFloat(view.jtfEntrada2.getText());
        float x3 = Float.parseFloat(view.jtfEntrada3.getText());
        float x4 = Float.parseFloat(view.jtfEntrada4.getText());

        float resultado = redNeuronal.predecir(x1, x2, x3, x4);
        
        view.jlbSalidaPrueba.setText("Predicción: " + String.format("%.2f", resultado));
        
    } catch (Exception ex) {
        showMessageDialog(null, "Por favor, completa las 4 entradas con números.");
    }
}

        if (e.getSource() == view.btnReset) {

            perceptronSimpleAND.reset();

            view.jlbEstado.setText("Perceptrón reiniciado");

            view.jlbEntrada1.setText("Entrada 1:");
            view.jlbEntrada2.setText("Entrada 2:");
            view.jlbPeso1.setText("Peso 1:");
            view.jlbPeso2.setText("Peso 2:");
            view.jlbUmbral.setText("Umbral:");
            view.jlbSalidaDeseada.setText("Salida Deseada:");
            view.jlbSalidaObtenida.setText("Salida Obtenida:");
            view.jlbSalidaPrueba.setText("Salida Obtenida:");

            grafico = new Grafico();
            chartPanel = grafico.getChartPanel();
            chartPanel.setPreferredSize(new Dimension(400, 400));
            view.panelGrafico.removeAll();
            view.panelGrafico.add(chartPanel, BorderLayout.CENTER);
            view.panelGrafico.validate();
        }
    }
}
