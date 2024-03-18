import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Calculo c = new Calculo();

        System.out.println("Digite o primeiro comprimento: ");
        c.setLado1(sc.nextDouble());
        System.out.println("Digite o segundo comprimento: ");
        c.setLado2(sc.nextDouble());
        System.out.println("Digite o terceiro comprimento: ");
        c.setLado3(sc.nextDouble());

        System.out.println("Isso é um tringulo?" + c.isTriangulo());
        if (c.isTriangulo())
        {


            System.out.println("Tipo de triângulo:" + c.tipoTriangulo());

        }












    }





}