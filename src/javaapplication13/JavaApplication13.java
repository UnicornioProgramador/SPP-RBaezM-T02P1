/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.util.Scanner;
/**
 *
 * @author Rubén Daniel Báez Muñiz IMT A01411504
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner (System.in);
    int count;
        System.out.println("_______________________________________");
        System.out.println("BIENVENIDO A LA CALCULADORA DE SALARIOS");
        System.out.println("_______________________________________");
        System.out.println("¿Cuántos salarios quiere revisar?");
        count = kb.nextInt();
        
    
    while (count>0) {switch (pedirDatos("la categoría del trabajador (1-4)")) {
            case 1: 
                pago(30.00);
            break;
            
            case 2: 
                pago(38.00);
            break;
            
            case 3:
                pago(50.00);
            break;
            
            case 4:
                pago(70.00);
            break;
            
            default:
                System.out.println("|-Por favor ingrese un valor entre 1 y 4");
                
            
        }
    count = count - 1;
    }
    }

static int pedirDatos(String Data){
    Scanner kb = new Scanner (System.in);
    int dato;
    
    System.out.print("Ingrese " + Data + ": ");
    dato = kb.nextInt();
        
    return dato;
}
static void pago(double num){
    double pago,he,sue;
     
    sue = pedirDatos("el salario base");
    he = pedirDatos("las horas extra");
            
    pago = sue + (he * num);
    System.out.println("El pago al trabajador es de: $" + pago);
        
}

    }
    

