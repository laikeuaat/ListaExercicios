/*
 * 4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes. 
 */
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int n;
        System.out.println("Olá, por favor digite o seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Olá, "+ nome+", por favor digite um numero");
        n = entrada.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Bem vindo(a) "+nome);
        }
        entrada.close();
    }
}
