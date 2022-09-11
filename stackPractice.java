import com.sun.corba.se.spi.orbutil.fsm.Input;

class stackPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Input.class);

        while(true){
            System.err.println();
            System.err.println();
            System.err.println();
            System.err.println();
            System.err.println();
        }
        stack s1 = new stack();
        s1.print();
        s1.push(90);
        s1.push(100);
        s1.print();
        int v = s1.pop();
        System.err.println("v " + v);
        s1.print();

    }

}

class stack {
    int[] array = new int[10];
    int sp = 10;

    void print() {
        System.err.println("Printing ");
        for (int i : array) {
            System.err.print(i + " ");
        }
    }

    void push(int v) {
        if (sp == 0)
            System.err.println("OverFlow *** ");
        else {
            sp = sp - 1;
            array[sp] = v;
        }
    }

    int pop() {
        if (sp == 10) {
            System.err.println("under Flow *** ");
            return -1;

        } else {
            int temp = array[sp];
            sp = sp + 1;
            return temp;
        }
    }
}
