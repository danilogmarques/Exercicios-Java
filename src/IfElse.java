import java.util.Scanner;

public class IfElse {
    public static void man(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        var name = scanner.next();
        System.out.println("Informe a sua idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age>= 18) { 
            System.out.printf("%s tem %s anos, você pode dirigir z\n", name, age);
        } else if ( age >= 16 && isEmancipated ) {
            System.out.printf("%s, apesar de você ter %s anoes, você é emancipado e você pode dirigir \n", name, age);
        } else {   
            System.out.printf("%s, você não pode dirigir \n =", name);
        }
        System.out.print("Fim da execução"); 
        }
}