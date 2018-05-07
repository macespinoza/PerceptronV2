/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptronv2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mcotrina
 */
public class PerceptronV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] Entradas =  {{0,0},
                                {0,1},
                                {1,0},
                                {1,1}};
        
        double[] salidaEsperada = {0,0,0,1};
        
        Neuron neurona = new Neuron();
        Trainer trainer = new Trainer();
        trainer.train(neurona, Entradas, salidaEsperada);
        
        double[] datoPrueba = {1,1};
        neurona.setX(datoPrueba);
        System.out.println(neurona.toString());
        System.out.println(neurona.sinapsis());
    }
    
}
