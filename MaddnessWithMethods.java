import java.util.Scanner;
public class MaddnessWithMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        helloThere(name);


        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        add(num1, num2);
    }
    static void helloThere(String name){
        System.out.println("hello " + name);


    }
    static void add(int a, int b){
        System.out.println(a+b);
    }
}