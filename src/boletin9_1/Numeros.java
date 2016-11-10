/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author mblancosoto
 */
public class Numeros {
    
    
    public void calcularCantidade(){
        int neg=0;
        int pos=0;
        int numero;
        int repetir=0;
        int cero=0;
        
     do{
         
         numero =  Integer.parseInt(JOptionPane.showInputDialog("Introduce los números"));
         repetir++;
         if(numero>0){
         JOptionPane.showMessageDialog(null,"o número e positivo");
         pos++;
         }
         if (numero<0){
         
         JOptionPane.showMessageDialog(null,"O número e negativo");
         neg++;
         }
         if (numero==0){
             JOptionPane.showMessageDialog(null,"o numero e negativo");
         cero++;
         }   
     }while(repetir<10)  ;      
                
                JOptionPane.showMessageDialog(null," os números positivos son "+pos+""
                        + " \n os números negativos son "+neg+"\n e os ceros "+cero);
                
                
    }         
                
        }
