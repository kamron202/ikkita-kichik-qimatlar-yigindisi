import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("d = ");
        int d = scanner.nextInt();
        System.out.println("c = ");
        int c = scanner.nextInt();
        if(a<b&&a<d&&a<c){
            if (b<d&&b<c) {
                System.out.println(a + b);

            }else if(c<d&&c<b){
                System.out.println(a+c);
            }else {
                System.out.println(d+a);
            }

        } else if (b<a&&b<d&&b<c) {
            if(a<d&&a<c) {
                System.out.println(b + a);

            } else if (c<d&&c<a) {
                System.out.println(b+c);
            }else {
                System.out.println(b+d);
            }

        } else if (d<a&&d<b&&d<c) {
            if (a < b&&a<c) {
                System.out.println(d + a);

            } else if (c<b&&c<a) {
                System.out.println(d+c);
            } else {
                System.out.println(b + d);
            }

        }else if (c<a&&c<b&&c<d) {
            if (a < b&&a<d) {
                System.out.println(a + c);

            } else if (d<b&&d<a) {
                System.out.println(c+d);
            }else {
                System.out.println(b + c);

            }
        }



    }
}