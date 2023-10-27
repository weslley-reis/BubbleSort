import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSort {
    public static void main (String[] args)  {

        int i, j, temp, tamArr;

        System.out.println("Digite o tamanho do array: ");
     
        Scanner entrada = new Scanner(System.in);
      
        try{
            tamArr = entrada.nextInt();
        } catch(InputMismatchException e){
            System.err.println("Erro: Digite um número válido!");
            return;
        }
        
        int arr[] = new int[tamArr];

        System.out.println("Digite os valores do array: ");
        for (i = 0; i < arr.length; i++){
        try {
            
            arr[i] = entrada.nextInt();
        }    
         catch (InputMismatchException e) {
                    System.err.println("Erro: Digite um número inteiro válido.");
                    return;
                } finally{
            entrada.close();
        }
    }
        

        
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array ordenardo!");
        System.out.print("{");
           
        for (i = 0; i < arr.length; i++){
             System.out.print(arr[i]);
             if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("}");


    } 
}