import java.util.Scanner;
public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("\nAlgoritmo converte segundos em horas,minutos e segundos.");
        System.out.println("\nInforme um número inteiro de segundos");
int segundos = scanner.nextInt();
int horas, minutos;
horas = segundos/ 360;
minutos = segundos / 60;
System.out.println("\nA quantidade correspondente a horas é de:"+ horas);
System.out.println("\nA quantidade correspondente a minutos é de:" + minutos);
System.out.println("\nA quantidade correspondente a segundos é de :" + segundos);
scanner.close();







    }
}
