/*
 * 3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes. 
 */
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome");
        nome = entrada.nextLine();
        for(int i=0; i<10;i++){
            System.out.println("Olá, "+nome+"!");
            System.out.println("Obrigado");
        }
        entrada.close();
    }
}
