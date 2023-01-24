import java.text.DecimalFormat;
import java.util.Scanner;
public class metodos {

    //Limitar casas decimais df.format()
    static DecimalFormat df = new DecimalFormat("#.##");


    public static void inciando(){
        System.out.println("Qual conversão deseja fazer?");
        System.out.println(" ");
        System.out.println("Digite 1, caso deseje converter polegadas para metros.");
        System.out.println("Digite 2, caso deseje converter metros para polegadas.");
        System.out.println(" ");

    } //método para iniciar programa



    protected static void cpolegadas(Scanner aqui) {
        limpar();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor em polegadas: "); // valor polegadas
        double polegadas = input.nextDouble();
        System.out.println(" ");

        Double resultado = polegadas / 39.37;
        System.out.printf(polegadas + " polegadas é igual a " + df.format(resultado) + " Metros.");
    } //método para converter polegadas para metros


    protected static void cmetros(Scanner aqui){
        limpar();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor em metros: "); // valor metros
        double metros = input.nextDouble();
        System.out.println(" ");

        Double resultado = metros * 39.37;

        System.out.println(metros + " metros é igual a " +df.format(resultado) + " polegadas.");
    } //método para converter metros em polegadas


    public static void limpar() {
        for(int i = 0; i < 50; i++)
            System.out.println(" ");
    } //limpar tela

}
