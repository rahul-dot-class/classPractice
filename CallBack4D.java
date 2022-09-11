class CallBack4D {
   
    public static void main(String[] args) {
        System.out.println("Program Starts");
        Client1.job();
        Client2.job();
        System.out.println("Program Ends");
    }
}

class Server {
    static void service(CustomCode t) {
        System.out.println("Staring Service");
        System.out.println("Task1");
        t.execute();
        System.out.println("Task3");
        System.out.println("Ending Service");
    }
}

interface CustomCode {
    void execute();
}

class Client1Customization implements CustomCode{
    @Override
    public void execute(){
        System.out.println("@@@@@@");
        System.out.println("@@@@@@");
        System.out.println("@@@@@@");
    }
}

class Client2Customization implements CustomCode {
    @Override
    public void execute() {
        System.out.println("######");
        System.out.println("######");
        System.out.println("######");
    }
}

class Client1 {
    static void job() {
        System.out.println("Client1 Starts");
        Server.service(new Client1Customization());
        System.out.println("Client1 Ends");
    }
}

class Client2 {
    static void job() {
        System.out.println("Client2 Starts");
        Server.service(new Client2Customization());
        System.out.println("Client2 Ends");
    }
}
