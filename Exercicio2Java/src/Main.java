import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculomaca c = new Calculomaca();

        System.out.println("Qual o total de maçãs? ");
        c.setMacas(sc.nextInt());

        if(c.macas <= 12) {
            System.out.println("O total é:" + c.getTotal());
        }
        else {
            System.out.println("O total é: " + c.getTotal2());

        }


    }




}



















