// import java.time.OffsetDateTime;10
import java.util.Scanner;

// Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

public class  Main {
    //     public static void main(String[] args) {
    //         var baseYear = OffsetDateTime.now().getYear();
    //         var scanner = new Scanner(System.in);
    //         System.out.println("informe o seu nome");
    //         var name = scanner.next();
    //         System.out.println("informe o seu ano de nascimento");
    //         var year = scanner.nextInt();
    //         var age = baseYear - year;
    //         System.out.printf("Olá %s você tem %s anos \n", name, age);
    //   }
    


// Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
// fórmula: área=lado X lado

//         public static void main(String[] args) {
//             var scanner = new Scanner(System.in);
//             System.out.println("Insira o tamanho d lado do quadrado");
//             var lado = scanner.next();
//             int area = Integer.parseInt(lado) * Integer.parseInt(lado);
//             System.out.printf("Olá a área do quadrado é %s \n", area);
//         }
// }

// Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
// fórmula: área=base X altura

            public static void main(String[] args) {
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.println("Insira o valor da base do retângulo");
                    var base = scanner.next();
                    System.out.println("Insira o valor da altura do retângulo");
                    var altura = scanner.next();
                    int area = Integer.parseInt(base) * Integer.parseInt(altura);
                    System.out.printf("Olá a área do retângulo é : %s ", area);
                }
            }}  






