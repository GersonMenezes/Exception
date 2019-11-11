/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunos
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        int a, b;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Diga o valor para a: ");
        a = entrada.nextInt();
        System.out.print("Diga o valor para b: ");
        b = entrada.nextInt();
        try{
            Division teste = new Division(a, b);
            System.out.println("O resultado e: " + teste.getResult());
        }catch(ArithmeticException e){
            System.out.println("Can't divide by 0");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
