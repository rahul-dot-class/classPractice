package com.rahul.proxyPractice;

public class GreenPiggy implements Piggy {

        int balance;
      
        int lt;
      
        @Override
      
        public void deposit(int v) {
      
           balance = balance + v;
      
           lt = v;
      
        }
      
        @Override
      
        public void withdraw(int v) {
      
          if(balance >= v) {
      
            balance = balance -v ;
      
            lt = -v;
      
          }
      
        }
      
    
      
      
      
      
}
