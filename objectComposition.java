public class objectComposition {
 
    public static void main(String[] args) {
        C1 obj1 = new C1();
        obj1.a=1;
        obj1.b=2;

        printc1(obj1);

        C2 obj2= new C2();
        obj2.obj.a=10;
        obj2.obj.b=20;
        obj2.c=30;
        obj2.d=40;
        printc2(obj2);;
    }

    static void printc1(C1 c) {

        System.out.println(c.a);
 
        System.out.println(c.b);
 
    }
    static void printc2(C2 c) {

        System.out.println(c.obj.a);
 
        System.out.println(c.obj.b);
 
        System.out.println(c.c);
 
        System.out.println(c.d);
 
    }
    
}

class C1{
    int a;

    int b;
}
class C2{
    C1 obj = new C1();

    int c;
 
    int d;
}

