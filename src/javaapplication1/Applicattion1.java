/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author renat
 */
public class Applicattion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter your name");
        System.out.println(input);
       int number1 = 184;
       int number2 = 24;
     int answer01= number1*number2;
        System.out.println(answer01);
        int number3 =45;
        int number4 =100;
       int answer02 = number4-number3;
        System.out.println(answer02);
        int number5 =47894;
        int number6 =45796;
       int answer03 =number5 + number6;
        System.out.println("");
               

        // TODO code application logic here
    }
    
}
