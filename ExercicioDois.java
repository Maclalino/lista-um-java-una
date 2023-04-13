import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args) {
       System.out.println("\nAlgortimo acrescenta 10% no produto.");
        Scanner scanner = new Scanner(System.in);
   double produto, novoProduto;
   System.out.println("\nInforme o preço do produto: ");
   produto = scanner.nextDouble();
   novoProduto = produto * 1.1;
   System.out.println("\n Produto acréscido de 10% é:" + novoProduto);
   
   scanner.close();
   
   
   
   
   
   
   
   
   
   
   
   
   
    }

}
