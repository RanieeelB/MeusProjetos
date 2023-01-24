/**
 * @author Raniel Bezerra
 * @version 2.0
 */

import java.util.Scanner;

public class Main extends metodos{
    public static void main(String[] args) {
        inciando();
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite aqui: "); //Opções 1 ou 2
        System.out.print(" ");
        int num = valor.nextInt();


        if(num == 1) {
            cpolegadas(valor);

        } else if(num == 2 ) {
            cmetros(valor);

        } else {
            System.out.println("Digite um número válido");
        }

    }
}