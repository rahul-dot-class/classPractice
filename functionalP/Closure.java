package functionalP;

public class Closure {
    public static void main(String[] args) {

        System.out.println("Entering main");

        f1(1, 2);
        //Local l1= new Local();
        

        System.out.println("Leaving main");

    }

    static void f1(int a, int b) {

        System.out.println("Entering f1");

        int c = 30;

        class Local {

            public void m1() {

                System.out.println("Entering m1");

                System.out.println("a = " + a);

                System.out.println("b = " + b);

                System.out.println("c = " + c);

                System.out.println("Leaving m1");

            }

        }

        Local l1 = new Local();

        l1.m1();

        System.out.println("Leaving f1");

    }

}
