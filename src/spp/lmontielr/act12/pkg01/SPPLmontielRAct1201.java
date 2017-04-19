/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lmontielr.act12.pkg01;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class SPPLmontielRAct1201 {

   public static void main(String[] args) {
        double estatura = solicitanumero("Introduzca su estatura (m)");
        double peso = solicitanumero("Introduzca su peso (kg)");
        
        double imc = peso / Math.pow(estatura,2);
        
        JOptionPane.showMessageDialog (null, "Su IMC es igual a: " + imc);
        
        if (imc > 25){
            JOptionPane.showMessageDialog (null, "Estás en sobrepeso");
        }else if (imc < 18){
            JOptionPane.showMessageDialog (null, "Estás en desnutrición");
        }else {
            JOptionPane.showMessageDialog (null, "Estás en peso normal");
        }
        
    }
    public static double solicitanumero(String mensaje){
        Scanner kb = new Scanner (System.in);
        String dato;
        double numero = 0;
        boolean flag;
        do{
            try{
            dato = JOptionPane.showInputDialog (null, mensaje);
            numero = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return numero;
    }
}