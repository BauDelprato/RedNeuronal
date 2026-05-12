package com.mycompany.implementacionjava.Modelo;

public class RedNeuronal {

    // capa oculta 1
    private Perceptron h1;
    private Perceptron h2;

    // capa oculta 2
    private Perceptron z1;
    private Perceptron z2;

    // salida
    private Perceptron salida;

    public RedNeuronal() {

        // 4 síntomas + bias
        h1 = new Perceptron(5);
        h2 = new Perceptron(5);

        // bias + 2 entradas ocultas
        z1 = new Perceptron(3);
        z2 = new Perceptron(3);

        // bias + 2 entradas
        salida = new Perceptron(3);
    }

    public float predecir(float x1, float x2, float x3, float x4) {

        // entrada con bias
        float[] entradas = {1, x1, x2, x3, x4};

        // capa oculta 1
        float outH1 = h1.calcular(entradas);
        float outH2 = h2.calcular(entradas);

        // capa oculta 2
        float[] capa1 = {1, outH1, outH2};

        float outZ1 = z1.calcular(capa1);
        float outZ2 = z2.calcular(capa1);

        // salida
        float[] capa2 = {1, outZ1, outZ2};

        return salida.calcular(capa2);
    }

    public void entrenar(float x1, float x2, float x3, float x4, float salidaEsperada, float factorAprendizaje) {
        //entrada con bias
        float[] entradas = {1, x1, x2, x3, x4};

        //capa oculta 1
        float outH1 = h1.calcular(entradas);
        float outH2 = h2.calcular(entradas);

        //capa oculta 2
        float[] capa1 = {1, outH1, outH2};
        float outZ1 = z1.calcular(capa1);
        float outZ2 = z2.calcular(capa1);

        float[] capa2 = {1, outZ1, outZ2};
        float outSalida = salida.calcular(capa2);

        // capa de salida
        float errorSalida = salidaEsperada - outSalida;
        float deltaSalida = errorSalida * (outSalida * (1 - outSalida));

        // capa oculta 2(Z)
        float errorZ1 = deltaSalida * salida.getPesos()[1];
        float errorZ2 = deltaSalida * salida.getPesos()[2];

        float deltaZ1 = errorZ1 * (outZ1 * (1 - outZ1));
        float deltaZ2 = errorZ2 * (outZ2 * (1 - outZ2));

        // capa oculta 1(H)
        float errorH1 = (deltaZ1 * z1.getPesos()[1]) + (deltaZ2 * z2.getPesos()[1]);
        float errorH2 = (deltaZ1 * z1.getPesos()[2]) + (deltaZ2 * z2.getPesos()[2]);

        float deltaH1 = errorH1 * (outH1 * (1 - outH1));
        float deltaH2 = errorH2 * (outH2 * (1 - outH2));

        // se actualizan los gastos
        salida.ajustarPesos(capa2, deltaSalida, factorAprendizaje);
        z1.ajustarPesos(capa1, deltaZ1, factorAprendizaje);
        z2.ajustarPesos(capa1, deltaZ2, factorAprendizaje);
        h1.ajustarPesos(entradas, deltaH1, factorAprendizaje);
        h2.ajustarPesos(entradas, deltaH2, factorAprendizaje);
    }

    public float[] getPesosEntrada() {

        return h1.getPesos();
    }
}
