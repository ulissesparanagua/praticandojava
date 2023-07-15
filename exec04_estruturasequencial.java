import java.util.Locale;
import java.util.Scanner;

public class exec04_estruturasequencial {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codFunc, nHoras;
        double valorHora, salario;

        codFunc = sc.nextInt();
        nHoras = sc.nextInt();
        valorHora = sc.nextDouble();
        
        salario = nHoras * valorHora;
        
        System.out.printf("NÚMERO: %d%n", codFunc);      
        System.out.printf("SALÁRIO: U$ %.2f%n", salario);

        sc.close();
    }
}
