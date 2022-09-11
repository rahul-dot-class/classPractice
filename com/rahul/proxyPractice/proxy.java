package com.rahul.proxyPractice;

public class proxy extends GreenPiggy{
    
    @Override
    public void deposit(int v) {
       
        
        if(v < 500){
            System.err.println("can not Enter amount less than 500 !");
        }else{
       
       System.err.println("Transaction in process");
        super.deposit(v);
       
    }



    }
    @Override
    public void withdraw(int v){
        if(v>1000 && v<10000){
            System.err.println(" Transaction in Process");
            super.withdraw(v);
        }else{
            System.err.println(" amount can not be greater than 10K or less than 1k");
        }
    }
}
