package com.mycompany.implementacionjava;

import javax.swing.JFrame;

import com.mycompany.implementacionjava.Controlador.Controlador;
import com.mycompany.implementacionjava.Modelo.RedNeuronal;
import com.mycompany.implementacionjava.Vista.Pantalla;

public class ImplementacionJava {

    public static void main(String[] args) {

        Pantalla vista = new Pantalla();
        RedNeuronal red = new RedNeuronal();

        Controlador controlador = new Controlador(vista, red);

        JFrame frame = new JFrame("Diagnóstico Médico - Red Neuronal");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(vista);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        controlador.iniciar();
    }
}