package my_finaltest;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("����x��");
        String x;
        do {
            try {
 
                x = sc.nextLine();
                if (Integer.valueOf(x) instanceof Integer) {
                    System.out.println("����Ϊ����,�������.");
                    break;
                } else {
                    x = sc.nextLine();
                }
            } catch (Exception e) {
                System.out.println("����������.");
            }
        } while (true);
    }
}