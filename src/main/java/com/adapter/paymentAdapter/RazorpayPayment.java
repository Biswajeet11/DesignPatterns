package com.adapter.paymentAdapter;

import com.adapter.API.RazorPay;
import com.adapter.API.RazorPayStatus;

public class RazorpayPayment implements PaymentProvider{
    RazorPay api = new RazorPay();

    @Override
    public void makeLink() {
        api.genenrateLink();
    }

    @Override
    public void pay() {
        api.pay();
    }

    @Override
    public PaymentStatus checkStatus() {
        if(api.checkStatus() == RazorPayStatus.FAILED){
            return PaymentStatus.FAILED;
        }
        return PaymentStatus.SUCCESS;
    }
}
