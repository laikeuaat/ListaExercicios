/*
 * 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
números. 
 */
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int count=0;
        for(int i=0;i<10;i++){
            System.out.println("Digite um numero");
            num = entrada.nextInt();
            System.out.println(num);
            count+=num;
        }
        entrada.close();
        System.out.println("A soma dos numeros inseridos é de: "+count);
    }
}
