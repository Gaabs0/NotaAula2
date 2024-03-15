import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculoestoque c = new Calculoestoque();

        System.out.println("Digite a quantidade atual:");
        c.setQuantidadeatual(sc.nextInt());

        System.out.println("Digite a quantidade minima:");
        c.setQuantidademin(sc.nextInt());

        System.out.println("Digite a quantidade maxima:");
        c.setQuantidademax(sc.nextInt());

        System.out.println("A quantidade media é:" + c.getQuantidademed());

        if(c.quantidadeatual>= c.quantidademed) {
            System.out.println("Não efetuar a compra!!");


        }
        else {
            System.out.println("efetuar compra!!");
        }
    }
}


