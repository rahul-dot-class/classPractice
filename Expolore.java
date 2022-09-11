import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Expolore {

    public static void main(String[] args) {
        System.out.println(" Welcome *** ");
        String hello = "Hellow world";
        Class c = hello.getClass();
        System.err.println("Type is " + c.getName());
        Class s = c.getSuperclass();
        System.out.println("Parent is " + s.getName());

        Class[] arr = c.getInterfaces();
        for (Class cl : arr) {
            System.err.println("** " + cl.getName());
        }
        System.err.println("Constructers Are : ");
        Constructor[] conArr = c.getConstructors();
        for (Constructor con : conArr) {
            System.err.println(con.toGenericString());
        }
        System.err.println("Methodes Are :");
        Method[] mArr = c.getMethods();
        for (Method m : mArr) {
            System.err.println(m.toGenericString());
        }

        System.err.println("Methode declared Are :");
        Method[] mdArr = c.getDeclaredMethods();
        for (Method m : mdArr) {
            System.err.println("%%%% " + m.toGenericString());
        }

        System.err.println("Fields are :");
        Field[] fArr = c.getFields();
        for (Field f : fArr) {
            System.err.println(f.toGenericString());
        }
    }
}
