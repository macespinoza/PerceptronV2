/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptronv2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miguel Angel Cotrina Espinoza
 * Universidad Tecnologica del Peru
 * Correo: 0820832@utp.edu.pe
 */
public class PerceptronV2 {

    public static void main(String[] args) {
        // Entrada de las cuatro operaciones posibles para un operador logico
        double[][] Entradas =  {{0,0},
                                {0,1},
                                {1,0},
                                {1,1}};
        //SAlida esperada en este caso un AND = 0,0,0,1
        double[] salidaEsperada = {0,0,0,1};
        //Procedemos a entrenar a la neurona
        Neuron neurona = new Neuron();
        Trainer trainer = new Trainer();
        neurona = trainer.train(neurona, Entradas, salidaEsperada);
        //Probamos la neurona entrenada
        double[] datoPrueba = {1,0};
        neurona.setX(datoPrueba);
        System.out.println(neurona.toString());
        System.out.println(neurona.sinapsis());
    }
    
}
