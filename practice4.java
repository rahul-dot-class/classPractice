 import static javax.swing.JOptionPane.*;
public class practice4 {
    public static void main(String[] args)
    {

        int[] a= new int []{10,20,30,40,50};
        String str =showInputDialog("Enter the number ");
        int num= Integer.parseInt(str);
        int index =-1;

        for(int i=0;i<5;i++) {
                if(num == a[i]){
                    index=i;
                    break;
                }
        }
        if(index == -1)System.err.println(" Number not found");
        else System.err.println("number fount ast : "+index);
    }
}
