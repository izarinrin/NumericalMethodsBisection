/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumMetBisection;

import java.util.Arrays;

/**
 *
 * @author NM-Demabildo
 */
public class NumMetBisection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double a = 1.0, b = 2.0, c = 0.0, tol = 0.0, fa = 0.0, fb = 0.0, fc = 0.0, x = 0.0, i = 0.0;
        Double fx[] = new Double[6];
        Boolean ehhh = false;

        System.out.println("[a          ,b          ,c          ,f(a)          ,f(b)          ,f(c)]");
        while (!ehhh) {
            c = (a + b) / 2.0;
            x = a;
            fa = (Math.pow(x, 2.0)) - 3.0;
            x = b;
            fb = (Math.pow(x, 2.0)) - 3.0;
            x = c;
            fc = (Math.pow(x, 2.0)) - 3.0;
            i++;
            System.out.printf("%.9f",a);
            System.out.print(" ");
            System.out.printf("%.9f",b);
             System.out.print(" ");
            System.out.printf("%.9f",c);
             System.out.print(" ");
            System.out.printf("%.9f",fa);
             System.out.print(" ");
            System.out.printf("%.9f",fb);
             System.out.print(" ");
            System.out.printf("%.9f",fc);
            System.out.println("  iteration#"+i);
            
            if ((fc * fb) < 0) {
                a = c;
            } else {
                b = c;
            }
            if ((Math.abs(fc)) <= 0.0001) {
                ehhh = true;
            }

        }

    }

}
