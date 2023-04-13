import java.util.Scanner;
public class ExercicioUm {
public static void main(String[] args) {
  System.out.println("\nAlgoritmo para calcular a Média Aritmética de dois números.");
    double numeroUm, numeroDois, mediaAritmetica;
    System.out.println("Algoritmo Calculo Média Aritmética");
    Scanner scanner = new Scanner (System.in);
    System.out.println("Informe um número positivo: ");
numeroUm = scanner.nextDouble();
System.out.println("Informe o segundo número positivo: ");
numeroDois = scanner.nextDouble();
mediaAritmetica = (numeroUm + numeroDois) / 2;
System.out.println("A media artmética é:"+ mediaAritmetica);
scanner.close();

}


}
