package com.adapter;

import com.adapter.paymentAdapter.PaymentProvider;
import com.adapter.paymentAdapter.RazorpayPayment;

public class Client {
    public static void main(String[] args) {
        PaymentProvider paymentproviderInterface = new RazorpayPayment();

        Bigbasket bg = new Bigbasket(paymentproviderInterface);
    }
}
