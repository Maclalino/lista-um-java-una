import java.util.Scanner;
public class ExercicioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAlgoritmo para calcular Média Aritmetica,harmônica e geométrica,apartir de três números.");
System.out.println("\nInforme o primeiro número: ");
double numeroUm = scanner.nextInt();
System.out.println("\nInforme o segundo número: ");
double numeroDois = scanner.nextInt();
System.out.println("\nInforme o terceiro número: ");
double numeroTres = scanner.nextInt();
double mediaAritmetica, mediaHarmonica, mediaGeometrica;
 mediaAritmetica= (numeroUm+numeroDois+numeroTres)/3; 
 mediaHarmonica = 3/((1/numeroUm)+ (1/numeroDois) +(1/numeroTres));
 mediaGeometrica = Math.pow((numeroUm * numeroDois * numeroTres), 1.0 /3.0);
System.out.println("\nA média Aritmetica é igual a:" + mediaAritmetica);
System.out.println("\nA média hamonica é igual a: "+ mediaHarmonica);
System.out.println("\nA média Geometrica é igua a:"+ mediaGeometrica);
scanner.close();




    }
}
