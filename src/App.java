import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double num1;
        double num2;
        double resultado;
  
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();
        sc.close();
  
        resultado = num1 + num2;
        System.out.println("O resultado da soma é " + resultado);
    }
}
