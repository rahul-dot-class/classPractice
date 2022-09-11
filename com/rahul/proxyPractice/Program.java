package com.rahul.proxyPractice;
import static javax.swing.JOptionPane.*;
    public class Program {



        public static void main(String[] args) {

            while(true){

                String str = showInputDialog("Press 1 for Deposit ,2 for withdraw ");
                int v = Integer.parseInt(str);
                Piggy p =  ObjectMirror.getObject();
                if(v == 1){
                    String input = showInputDialog("Enter Amount to deposit ");
                    int value = Integer.parseInt(str);
                    p.deposit(v);

                }else if (v == 2){
                    String input = showInputDialog("Enter Amount to WithDraw ");
                    int value = Integer.parseInt(str);
                    p.withdraw(value);
                }
                
            }
   
     }

