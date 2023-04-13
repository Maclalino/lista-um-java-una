import java.util.Scanner;
public class ExercicioSeis {
    public static void main(String[] args) {
      System.out.println("\nAlgoritmo cacula logaritmo do primeiro número na base representada pelo segundo número.");
        Scanner scanner = new Scanner(System.in);
      double numeroUm, numeroDois, logaritmo;
     System.out.println("\nInforme o primeiro número para ser o logaritmo: ");
     numeroUm = scanner.nextDouble();
     System.out.println("\nInforme o ssegundo número para ser a base do logaritmo: ");
     numeroDois = scanner.nextDouble();
    logaritmo = Math.log10(numeroUm)/ Math.log10(numeroDois);
System.out.println("\nO resultado do logaritmo é:" + logaritmo);

scanner.close();







    }
}
