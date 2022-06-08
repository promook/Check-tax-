import java.util.*;

class Check {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter your salary:");
        int user = scan.nextInt();
        int tax;
        tax = user / 100 * 3;
        int sumsalary;
        sumsalary = user - tax;
        System.out.println(sumsalary);

    }
}