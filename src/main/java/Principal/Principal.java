/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andres Ochoa
 */
public class Principal {

    public static void main(String[] args) {
        
        /*
        var finaliza = false;
        while(finaliza==false){
        try {
            System.out.println("Ingrese Un numero");
            var numero = new Scanner(System.in).nextInt();
            if (numero > 10) {
            } else {
            }
            System.out.println("nuemro = " + 100 / numero);
            finaliza = true;
        } catch (InputMismatchException ei) {
            System.out.println("Error Ingreso" + ei.toString());
        } catch (ArithmeticException ai) {
            System.out.println("Error el valor Ingresado " + ai.toString());
        }

    }
*/
        
        var finaliza = false;
        while(finaliza==false){
        try {
            int vector[] = new int[1];
            System.out.println("Ingrese Un numero");
            var numero = new Scanner(System.in).nextInt();
            vector[numero] = numero;
            if (numero > 10) {
            } else {
            }
            System.out.println("nuemro = " + 100 / numero);
            finaliza = true;
        } catch (InputMismatchException ei) {
            System.out.println("Error Ingreso" + ei.toString());
        } catch (ArithmeticException ai) {
            System.out.println("El indice no es adecuado " + ai.toString());
        
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("El indice no es adecuado " + ai.toString());
        }
    }
    }

}
