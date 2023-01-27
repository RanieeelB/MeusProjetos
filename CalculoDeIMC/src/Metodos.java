
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @Author Raniel Bezerra
 * @Version 1.0
 */

public class Metodos {

    static DecimalFormat df = new DecimalFormat("#.##");
    static DecimalFormat bas = new DecimalFormat("####");


    public static void CalculoIMC(double peso, double altura, int idade) throws InterruptedException {

        double imc = peso / (altura * 2);
        System.out.println();

        grauImc(peso, idade, imc);


    }

    /**
     *
     * @param peso
     * @param idade
     * @param imc
     */
    public static void grauImc(double peso, int idade, double imc) {
        if (imc < 18.4) {
            System.out.println("Seu imc atual é " + df.format(imc));
            System.out.println("Você está na classificação de MAGREZA.");
            System.out.println("Consulte um especialista para uma dieta pra ganho de peso.");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("Seu imc atual é " + df.format(imc));
            System.out.println("Você está no peso NORMAL para sua altura.");
            pergunta(peso, idade);

        } else if (imc > 25.0 && imc < 29.9) {
            System.out.println("Seu imc atual é " + df.format(imc));
            System.out.println("Você está em SOBREPESO.");
            pergunta(peso, idade);

        } else if (imc > 30.0 && imc < 39.9) {
            System.out.println("Seu imc atual é " + df.format(imc));
            System.out.println("Você está em OBESIDADE");
            pergunta(peso, idade);

        } else if (imc > 40.0) {
            System.out.println("Seu imc atual é " + df.format(imc));
            System.out.println("Você está com OBESIDADE GRAVE!");
            System.out.println("Procure ajuda médica urgente.");
            pergunta(peso, idade);

        }

    }

    /**
     * @param peso
     * @param idade
     */



    public static void pergunta(double peso, int idade) {
        System.out.println(" ");
        System.out.println("Deseja iniciar uma dieta para perca de gordura?");
        System.out.println("Digite 1, se a resposta for sim");
        System.out.println("Digite 2, se a resposta for não.");
        Scanner resp = new Scanner(System.in);
        System.out.print("\nDigite aqui: ");
        int resposta = resp.nextInt();
        System.out.println(" ");

        if (resposta == 1) {
            limpar();
            System.out.println("Ok!");
            System.out.println("Qual o seu sexo?");
            System.out.println("Digite 1, para masculino");
            System.out.println("Digite 2, para feminino");


            Scanner sex = new Scanner(System.in);
            System.out.print("\nDigite aqui: ");
            int sexo = sex.nextInt();

            limpar();


            if (sexo == 2) {
                 if (idade > 10 || idade < 18) {
                    double basal = (peso * 13.384) + 692.6;
                    Exercicio(basal, sexo);

                } else if (idade > 18 || idade < 30) {
                    double basal = (peso * 14.818) + 486.6;
                    Exercicio(basal, sexo);

                } else if (idade > 30 || idade < 60) {
                    double basal = (peso * 8.126) + 845.6;
                    Exercicio(basal, sexo);

                } else if (idade >= 60) {
                    double basal = (peso * 9.082) + 685.5;
                    Exercicio(basal, sexo);

                }
            }
            if (sexo == 1) {
                  if (idade > 10 || idade < 18) {
                    double basal = (peso * 17.686) + 658.2;
                    Exercicio(basal, sexo);

                } else if (idade > 18 || idade < 30) {
                    double basal = (peso * 15.057) + 692.2;
                    Exercicio(basal, sexo);

                } else if (idade > 30 || idade < 60) {
                    double basal = (peso * 12.472) + 873.1;
                    Exercicio(basal, sexo);

                } else if (idade >= 60) {
                    double basal = (peso * 11.711) + 587.7;
                    Exercicio(basal, sexo);

                }
            } else {
                System.out.println("Digite um número válido.");
            }
        } else {
            limpar();
            System.out.println("Ok, tenha um ótimo dia!");
        }
    }

    /**
     *
     * @param basal
     * @param sexo
     */
    static void Exercicio(double basal, int sexo) {

        System.out.println("Qual o seu nível de atividade diária?");
        System.out.println("1 - Atividade leve (Sentado na maior parte do tempo)");
        System.out.println("2 - Atividade moderada (Fazer uma hora diária de exercícios como corrida, ciclismo, natação ou dança, trabalhar como operário de construção,  garçom, etc...)");
        System.out.println("3 - Atividade intensa (Considera atividades como natação, corrida, andar de bicicleta ou dançar duas horas por dia)");

        Scanner exerc = new Scanner(System.in);
        System.out.print("\nDigite aqui: ");
        int exercicio = exerc.nextInt();


        /*        Fator de atividade

                    Homens  Mulheres
          Leve     | 1,55  |  1,56  |
          Moderada | 1,78  |  1,64  |
          Intensa  | 2,10  |  1,82  |

         */



        if (exercicio == 1 || sexo == 1) { // cálculo homens || (Taxa metabólica basal * fator de atividade física.)
            double total = basal * 1.55;
            limpar();
            System.out.println("Sua taxa metabolica basal é " + bas.format(basal) + " calorias.");
            System.out.println("Você deve ingerir " + bas.format(total - 400) + " Calorias para perder peso de forma saudável.");
            System.out.println("Lembre-se, esse cálculo é apenas uma base, consulte um especialista para informações mais exatas.");
        } else if (exercicio == 2 || sexo == 1) { // cálculo homens || (Taxa metabólica basal * fator de atividade física.)
            limpar();
            double total = basal * 1.78;
            System.out.println("Sua taxa metabolica basal é " + bas.format(basal) + " calorias.");
            System.out.println("Você deve ingerir " + bas.format(total - 400) + " Calorias para perder peso de forma saudável.");
            System.out.println("Lembre-se, esse cálculo é apenas uma base, consulte um especialista para informações mais exatas.");
        } else if (exercicio == 3 || sexo == 1) { // cálculo homens || (Taxa metabólica basal * fator de atividade física.)
            limpar();
            double total = basal * 2.1;
            System.out.println("Sua taxa metabolica basal é " + bas.format(basal) + " calorias.");
            System.out.println("Você deve ingerir " + bas.format(total - 400) + " Calorias para perder peso de forma saudável.");
            System.out.println("Lembre-se, esse cálculo é apenas uma base, consulte um especialista para informações mais exatas.");

        } else if (exercicio == 1 || sexo == 2) { // cálculo mulheres || (Taxa metabólica basal * fator de atividade física.)
            double total = basal * 1.56;
            limpar();
            System.out.println("Sua taxa metabolica basal é " + bas.format(basal) + " calorias.");
            System.out.println("Você deve ingerir " + bas.format(total - 400) + " Calorias para perder peso de forma saudável.");
            System.out.println("Lembre-se, esse cálculo é apenas uma base, consulte um especialista para informações mais exatas.");
        } else if (exercicio == 2 || sexo == 2) {  // cálculo mulheres || (Taxa metabólica basal * fator de atividade física.)
            limpar();
            double total = basal * 1.64;
            System.out.println("Sua taxa metabolica basal é " + bas.format(basal) + " calorias.");
            System.out.println("Você deve ingerir " + bas.format(total - 400) + " Calorias para perder peso de forma saudável.");
            System.out.println("Lembre-se, esse cálculo é apenas uma base, consulte um especialista para informações mais exatas.");
        } else if (exercicio == 3 || sexo == 2) { // cálculo mulheres|| (Taxa metabólica basal * fator de atividade física.)
            limpar();
            double total = basal * 1.82;
            System.out.println("Sua taxa metabolica basal é " + bas.format(basal) + " calorias.");
            System.out.println("Você deve ingerir " + bas.format(total - 400) + " Calorias para perder peso de forma saudável.");
            System.out.println("Lembre-se, esse cálculo é apenas uma base, consulte um especialista para informações mais exatas.");
            } else {
                System.out.println("Digite um número válido.");
            }


                System.out.println(" ");
                System.out.println("À medida que vai emagrecendo e chegando mais perto do peso que deseja, deve recalcular o \nnúmero de calorias que pode ingerir por dia para acelerar o processo de emagrecimento. \nPara isso, basta preencher novamente a calculadora com os seus dados atualizados.");
                System.out.println(" ");
                System.out.println("Nota: é importante ressaltar que a quantidade de calorias também deve variar \nde acordo com o estado de saúde, metabolismo e produção de hormônios de cada pessoa. \nPor isso, para confirmar a quantidade diária de ingestão calórica é sempre aconselhada a consulta com um nutricionista.");


        }


    protected static void limpar() {
        for (int i = 0; i < 50; i++)
            System.out.println(" ");
    }
}