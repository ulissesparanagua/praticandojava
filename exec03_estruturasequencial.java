import java.util.Scanner;

public class exec03_estruturasequencial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        diferenca = A * B - C * D;
        
        System.out.printf("DIFERENÇA: %d%n", diferenca);

        sc.close();
    }
}
