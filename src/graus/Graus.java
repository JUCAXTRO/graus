/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graus;
import java.util.Scanner;
/**
 *
 * @author Usuário
 */
public class Graus {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner grau = new Scanner(System.in);
       int i = 10;
       double g;
        g = grau.nextDouble();
        while (i<=100)
       {
           g = ((i * 9) / 5 + 32);
           System.out.println(g);
           i=i+10;
       }
   }   
}

