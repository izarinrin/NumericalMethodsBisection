/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;


/**
 *
 * @author NM-Demabildo
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double a = 1.0, b = 2.0, c = 0.0, tol = 0.0, f = 0.0, x = 0.0;
        Double fx[] = new Double[6];

        /*   for (int i = 0; tol > 0.0001; i++) {
         }*/
        c = (a + b) / 2.0;
        fx[0] = a;
        fx[1] = b;
        fx[2] = c;
        System.out.println(c);
        x = a;
        f = (Math.pow(x, 2.0)) - 3.0;
        fx[3] = f;
        x = b;
        f = (Math.pow(x, 2.0)) - 3.0;
        fx[4] = f;
        x = c;
        f = (Math.pow(x, 2.0)) - 3.0;
        fx[5] = f;
        System.out.println("[a,b,c,f(a),f(b),f(c)]");
        System.out.println(Arrays.toString(fx));
        

    }

}
