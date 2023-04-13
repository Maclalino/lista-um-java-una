import java.util.Scanner;
public class ExercicioSete {
public static void main(String[] args) {
    System.out.println("\nAlgoritmo calcula salário final com base em sua vendas.");
    Scanner scanner = new Scanner(System.in);
    double salarioFixo, valorTotalvendas, percentual, salarioTotalFinal;
    System.out.println("\nInforme o salário fixo: ");
    salarioFixo = scanner.nextDouble();
    System.out.println("\nInforme o valor total das vendas: ");
    valorTotalvendas = scanner.nextDouble();
    System.out.println("\nInforme o percentual ganhado sobre o total das vendas mensais: ");
    percentual = scanner.nextDouble();
    salarioTotalFinal = salarioFixo + (valorTotalvendas*percentual) / 100;
System.out.println("\nO salario total é de:"  + salarioTotalFinal);

    scanner.close();






}
}
