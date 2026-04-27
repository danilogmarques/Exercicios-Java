package ExerciciosExtrutaraDeControleEmJava;
import java.util.Scanner;

// Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

public class Exercicio1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira um número");
        var numero = scanner.nextInt();
        for ( var i=numero ; i <= 10 ; i+=2){
            System.out.println(i);
        }

    }
}
