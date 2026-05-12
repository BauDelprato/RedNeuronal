package com.mycompany.implementacionjava.Modelo;

import java.util.Random;

public class Perceptron {

    private float[] pesos;

    public Perceptron(int cantidadEntradas) {

        // +1 por bias
        pesos = new float[cantidadEntradas + 1];

        Random r = new Random();

        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = (r.nextFloat() * 2) -1;
        }
    }

    public float calcular(float[] entradas) {

        float suma = 0;

        for (int i = 0; i < entradas.length; i++) {
            suma += pesos[i] * entradas[i];
        }
        
        return (float) (1.0/(1.0 + Math.exp(-suma)));
    }
    
    public void ajustarPesos(float[] entradas, float delta, float tasaAprendizaje) {
        for (int i = 0; i< entradas.length; i++){
            pesos[i] += tasaAprendizaje * delta* entradas[i];
        }
    }

    public float[] getPesos() {
        return pesos;
    }
}