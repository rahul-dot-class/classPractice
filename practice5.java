
 import static javax.swing.JOptionPane.*;
 public class practice5 {
    
    public static void main(String[] args) {
        String str =showInputDialog("Enter the number ");
        int num= Integer.parseInt(str);
        int[] a= new int []{10,20,30,40,50};

        for(int i=0;i<a.length;i++){

            if(num == a[i]){
                for(int j=i;j<a.length-1;j++){

                    a[j]=a[j+1];
                }
                a[a.length-1]=-1;
            break;            }
        }
        for(int k =0;k<a.length;k++)System.err.println(a[k]);

    }
}
