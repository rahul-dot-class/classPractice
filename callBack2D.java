 class callBack2D {
    public static void main(String[] args) {
        System.out.println("Program Starts");
        Client1.job();
        Client2.job();
        System.out.println("Program Ends");
    }
    
}
class Server {
    static void service(int t) {
        System.out.println("Staring Service");
        System.out.println("Task1");
        switch (t) {
            case 1:
                System.out.println("@@@@@@");
                System.out.println("@@@@@@");
                System.out.println("@@@@@@");
                break;
            case 2:
                System.out.println("######");
                System.out.println("######");
                System.out.println("######");
                break;
            default:
                System.out.println("Task2");
                break;
        }
        System.out.println("Task3");
        System.out.println("Ending Service");
    }
}

class Client1 {
    static void job() {
        System.out.println("Client1 Starts");
        Server.service(1);
        System.out.println("Client1 Ends");
    }
}

class Client2 {
    static void job() {
        System.out.println("Client2 Starts");
        Server.service(2);
        System.out.println("Client2 Ends");
    }
}


