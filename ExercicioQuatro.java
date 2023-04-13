import java.util.Scanner;
public class ExercicioQuatro {
    public static void main(String[] args) {
        double valorCapital, prazo, taxaJuros, montante;
        Scanner scanner = new Scanner(System.in);
      System.out.println("\nAlgoritmo informa o valor do montante a ser recebido.");
        System.out.println("\nInforme o valor do capital: ");
valorCapital = scanner.nextDouble();
System.out.println("\nInforme o prazo: ");
prazo = scanner.nextDouble();
System.out.println("\nINforme a taxa de Juros: ");
taxaJuros = scanner.nextDouble();
montante = valorCapital * Math.pow(1+taxaJuros,prazo);
System.out.println("\nO valor do montante a ser recebiddo é: " + montante);

scanner.close();
    }
}
