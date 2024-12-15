/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newnew;
import java.util.Scanner;
/**
 *
 * @author Eric Rodriguez
 */
public class Newnew {
    public static int Multiplicacion(){
     Scanner sc= new Scanner(System.in);
        int n1,n2;
        System.out.println("Favor ingresar numero 1");
        n1= sc.nextInt();
        System.out.println("Favor ingresar numero 2");
        n2= sc.nextInt();   
        
        return n1*n2;
    }
    public static void Resta(){
    Scanner sc= new Scanner(System.in);
        int n1,n2;
        System.out.println("Favor ingresar numero 1");
        n1= sc.nextInt();
        System.out.println("Favor ingresar numero 2");
        n2= sc.nextInt();   
        System.out.println("La resta de los numeros es:"+(n1-n2));
    }
    public static void Suma(){
     Scanner sc= new Scanner(System.in);
        int n1,n2;
        System.out.println("Favor ingresar numero 1");
        n1= sc.nextInt();
        System.out.println("Favor ingresar numero 2");
        n2= sc.nextInt();   
        System.out.println("La suma de los numeros es:"+(n1+n2));
    }
    
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int op;
        do{
        System.out.println("Menu:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("0. Salir");
        op = sc.nextInt();
    
        
            switch (op){
                case 1:
                    Suma();
                    break;
                case 2:
                     Resta();
                    break;
                case 3:
                    System.out.println("La multiplicacion es: "+Multiplicacion());
                    break; 
                case 0:
                    break;
                default:
                    System.out.println("Opcion Invalida vv");
                    
                    //Decir porque no devuelve al menu
            
            }
        }while (op != 0);
    }
}
