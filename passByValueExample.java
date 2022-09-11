import java.util.HashMap;

public class passByValueExample  

    public static void main(String[] args) {
        HashMap<String,String> hasExp = new HashMap<>();

        hasExp.put("name","Iv");   
        System.err.println("hash "+hasExp);
       operationOnObj(hasExp);
       System.err.println("hash2 "+hasExp);
        
       Integer i =10;
       System.err.println(" I before passing "+ i);
       calculateValue(i);
       System.err.println(" I after passing "+ i);  
       
    }

    static  public  void operationOnObj(HashMap<String,String> hasExp){
    hasExp.put("name2","fleet");
   // return hasExp;

    }

    static public void calculateValue(Integer i){
        i++;
    }

}
