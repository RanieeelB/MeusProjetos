import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Raniel Bezerra
 * @Version 2.0
 */

public class Main extends Metodos{
    public static void main(String[] args) throws InterruptedException {

        DecimalFormat df = new DecimalFormat("#.##");

        Scanner id = new Scanner(System.in);
        System.out.print("\nDigite a sua idade: ");
        int idade = id.nextInt();

        Scanner pe = new Scanner(System.in);
        System.out.print("\nDigite seu peso (Ex: 80,1): ");
        double peso = pe.nextDouble();

        Scanner alt = new Scanner(System.in);
        System.out.print("\nDigite sua altura (Ex: 1,80): ");
        double altura = alt.nextDouble();

        System.out.println("Fazendo cálculo...");
        Thread.sleep(1200);

        limpar();

        System.out.println("Ok, tudo pronto");

        CalculoIMC(peso, altura, idade);



    }
}
