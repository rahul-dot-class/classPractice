public class inherit{

    public static void main(String[] args) {
      C1 obj1  = new C1();
      obj1.a=10;
      obj1.b=15;
      System.err.println(  "obj 1"+obj1.toString());
      C2 obj2 = new C2();
      obj2.a=20;
      obj2.b=30;
      //obj2.c=40;
      obj2.d=50;
      System.err.println(obj2.toString());
    }
}
 
 class C1{

    int a;
    int b;
}
class C2 extends C1{
    int c;
    int d;

}

