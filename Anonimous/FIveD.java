package Anonimous;

public class FIveD {

    static I1[] arr = new I1[5];

    static int count;

    public static void main(String[] args) {

        System.out.println("Entering main");

        for (int i = 0; i < 5; i++) {

            f1(10 * i, 20 + i);

        }

        System.out.println("\nIterating array of I1 instances\n");

        for (int i = 0; i < 5; i++) {

            arr[i].m1();

        }

        System.out.println("Leaving main");

    }

    static void f1(int a, int b) {

        System.out.println("Entering f1");

        int c = 30;

        I1 l1 = new I1() {

            @Override

            public void m1() {

                System.out.println("Entering m1");

                System.out.println("a = " + a);

                System.out.println("b = " + b);

                System.out.println("c = " + c);

                System.out.println("Leaving m1");

            }

        };

        arr[count] = l1;

        count++;

        System.out.println("Leaving f1");

    }

    interface I1 {

        void m1();

    }
}
