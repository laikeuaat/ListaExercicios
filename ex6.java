/*
 * 6) Leia a idade de 20 pessoas e exiba a soma das idades. 

 */
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        int count = 0;
        for(int i=0;i<20;i++){
            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();
            count+=idade;
        }
        entrada.close();
        System.out.println("A soma de todas as idades inseridas é de: "+count);
    }
}
