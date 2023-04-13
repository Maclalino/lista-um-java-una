import java.util.Scanner;

public class ExercicioCinco {
  public static void main(String[] args) {
  System.out.println("\nAlgoritmo calcula salário bruto de um funcionário.");
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nInforme as horas trabalhadas: ");
   int horas = scanner.nextInt();
 System.out.println("\nInforme o valor da hora: ");
double valor = scanner.nextDouble();
System.out.println("\nInforme o valor do sálario família: ");
double salariofamilia = scanner.nextDouble();
System.out.println("\nInforme o número de filhos com idade inferior á 14 anos: ");
int filhos = scanner.nextInt();
double salarioBruto = valor * horas + salariofamilia * filhos;
System.out.println("\nO salário bruto é de:  " + salarioBruto );

scanner.close();

}
}
