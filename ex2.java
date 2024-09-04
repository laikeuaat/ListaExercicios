/**
 * 2) Escreva um algoritmo que calcule a soma dos números de 1 a 15. 
 */

public class ex2 {
    public static void main(String[] args) {
        int count=0; 
        int num =0;
        for(int i=0; i<15;i++){
            num++;
            count+=num;
            System.out.println(num);
        }
        System.out.println("A soma dos numeros é de:"+count);
    }
}
