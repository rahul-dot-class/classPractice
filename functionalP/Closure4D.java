package functionalP;

class Closure4D {

    static I1[] arr1 = new I1[5];

    static I1[] arr2 = new I1[5];

    static int count;

    public static void main(String[] args) {

        System.out.println("Entering main");

        for (int i = 0; i < 5; i++) {

            f1(10 * i, 20 + i);

        }

        System.out.println("\nIterating arrays of Local Objects\n");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nGroup sharing same Closure Instance\n");

            arr1[i].m1();

            arr2[i].m1();

        }

        System.out.println("Leaving main");

    }

    static I1 f1(int a, int b) {

        System.out.println("Entering f1");

        int c = 30;

        class Local implements I1 {

            int d;

            public Local(int d) {

                this.d = d;

            }

            @Override

            public void m1() {

                System.out.println("Entering m1");

                System.out.println("a = " + a);

                System.out.println("b = " + b);

                System.out.println("c = " + c);

                System.out.println("d = " + d);

                System.out.println("Leaving m1");

            }

        }

        Local l1 = new Local(a + b);

        Local l2 = new Local(a - b);

        arr1[count] = l1;

        arr2[count] = l2;

        count++;

        System.out.println("Leaving f1");

        return l1;

    }

}

interface I1 {

    void m1();

}
