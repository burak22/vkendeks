import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz(kilogram): ");
        float kilo = input.nextFloat();
        System.out.print("Boyunuzu Giriniz(metre): ");
        float boy = input.nextFloat();

        float endeks = kilo/(boy*boy);
        System.out.println("V-K Endeksiniz: "+ endeks);
    }


}