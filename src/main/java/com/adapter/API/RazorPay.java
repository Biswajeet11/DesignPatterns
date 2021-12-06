package com.adapter.API;

/*  Example of  RazorPay API  */

public class RazorPay {

    public void genenrateLink(){
        System.out.println("RazorPay link generated");
    }

    public void pay(){
        System.out.println("Paid using RazorPay");
    }

    public RazorPayStatus checkStatus(){
        return RazorPayStatus.FAILED;
    }

}