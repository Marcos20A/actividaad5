/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividaad5;


public class main {
    
        public static void main(String[] args) {
        
        metodos proceso = new metodos ();
        int resultS,resultR,resultD,resultM;
        int num1 = 10;
        int num2 = 5;
        
        System.out.println("El valor de X es: " + num1);
        System.out.println("El valor de Y es: " + num2);
        resultS = proceso.suma(num1, num2);
        System.out.println("La suma es: " + resultS);
        resultR = proceso.resta(num1, num2);
        System.out.println("La resta es: " + resultR);
        resultD = proceso.div(num1, num2);
        System.out.println("La division es: " + resultD);
        resultM = proceso.multi(num1, num2);
        System.out.println("La multiplicacion es: " + resultM);
        
    }
}
