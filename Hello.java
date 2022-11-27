import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("what is your name");
        String name =sc.next();
        System.out.println("Hello "+ name);

    }
}