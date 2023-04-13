import java.util.Scanner;
public class ExercicioOito {
    public static void main(String[] args) {
        int veiculos, rodas;
       System.out.println("\nAlgoritmo determina quantos carros e motos tem no estacionamento com base no número de rodas e veículos.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInforme o número de veículos: ");
        veiculos = scanner.nextInt();
        System.out.println("\nInforme o números de rodas totais no estacionamento: ");
        rodas = scanner.nextInt();
        int motos = (4 * veiculos - rodas) / 2;
        int carros = veiculos - motos;
        System.out.println("\nA quantidade de carros no estacionamento é: " + carros);
System.out.println("\nA quantidade de motos no estacionamneto é de: " +motos);
scanner.close();














    }
}
