/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sesion1;

/**
 *
 * @author eliamyaet
 */
public class Sesion1 {
    public static void main(String[] args) {
        
    }
    public static double find_average(int[] array){
        int suma=0;
        for(int i=0; i < array.length;i++){
            suma=suma+array[i];
        }
        float resultado = suma /array.length;
        System.out.print(resultado);
        return resultado;
    
  }
}
