/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Operacion {
public static void main(String[] args){
//declarando variables
double resta,num1,num2,suma,promedio;
Scanner lectura=new Scanner(System.in);
//entrada de datos
System.out.print("Ingresar numero 1:");
num1=lectura.nextDouble();
System.out.print("Ingresar numero 2:");
num2=lectura.nextDouble();
//proceso de datos
suma=num1+num2;
promedio=suma/2;
resta=num1-num2;
//salida de datos
System.out.println("La suma es:"+suma);
System.out.println("El promedio es:"+promedio);
System.out.println("La resta es:"+resta);
}    
}
