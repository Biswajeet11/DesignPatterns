package com.adapter;

import com.adapter.paymentAdapter.PaymentProvider;
import com.adapter.paymentAdapter.RazorpayPayment;

public class Bigbasket {

    /*
     Adapters allow to adapt for consuming apis, the payment provider
      interface will allow that flexibility
     */
    PaymentProvider paymentProvider = new RazorpayPayment();

    Bigbasket(PaymentProvider providerInterface){
        this.paymentProvider = providerInterface;
    }

}
