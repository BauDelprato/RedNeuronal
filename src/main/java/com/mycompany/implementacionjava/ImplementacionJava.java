package com.mycompany.implementacionjava;

import com.mycompany.implementacionjava.Controlador.Controlador;
import com.mycompany.implementacionjava.Modelo.RedNeuronal;
import com.mycompany.implementacionjava.Vista.Ventana;
import com.mycompany.implementacionjava.Modelo.Grafico;
import com.mycompany.implementacionjava.Modelo.PerceptronSimpleAND;

public class ImplementacionJava {

    public static void main(String[] args) {
        
        Ventana view = new Ventana();
        Grafico grafico = new Grafico();
        //PerceptronSimpleAND perceptronSimpleAND = new PerceptronSimpleAND();
        RedNeuronal red = new RedNeuronal();
        Controlador ctrl = new Controlador(view, grafico, red);
        
        ctrl.iniciar();
        view.setVisible(true);
        
    }
    
}

