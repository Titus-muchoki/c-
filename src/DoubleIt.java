import java.util.Scanner;

public class DoubleIt {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        float gpa;
        System.out.println("Enter your name: ");
      name =  scanner.nextLine();;
        System.out.println("Enter your age: ");
       age = scanner.nextInt();
        System.out.println("Enter your gpa: ");
       gpa = scanner.nextFloat();
System.out.println("your name is: " + name);
        System.out.println("your age is: " + age);
        System.out.println("your gpa is: " + gpa);



    }
}
