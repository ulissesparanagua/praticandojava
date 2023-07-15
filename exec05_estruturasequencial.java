import java.util.Locale;
import java.util.Scanner;

public class exec05_estruturasequencial {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod1, cod2, qtd1, qtd2;
        double vunit1, vunit2, vtotal;

        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        vunit1 = sc.nextDouble();
        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        vunit2 = sc.nextDouble();

        vtotal = (qtd1 * vunit1) + (qtd2 * vunit2);
        
                
        System.out.printf("VALOR A PAGAR: R$  %.2f%n", vtotal);


        sc.close();
    }
}
