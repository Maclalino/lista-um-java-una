import java.util.Scanner;
public class ExercicioTres {
    public static void main(String[] args) {
        double temperaturaF, temperaturaC;
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nAlgoritmo converte graus Fahrenheit em Celcius.");
    System.out.println("\nInforme a temperatura em graus Fahrenheit: ");
temperaturaF = scanner.nextDouble();
temperaturaC = (temperaturaF - 32) / 1.8;
System.out.println("\nTemperatura convertida em graus Celcius:" + temperaturaC);
scanner.close();












    }
}
