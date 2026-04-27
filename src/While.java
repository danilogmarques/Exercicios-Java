import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        while (!name.equals("exit"))
            System.out.println("informe um nome");
            name = scanner.next();
            System.out.println(name);
        }
    }
