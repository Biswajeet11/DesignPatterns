package com.adapter.paymentAdapter;

import com.adapter.API.PayU;

public class PayUPayment implements PaymentProvider{

    PayU api = new PayU();

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
        api.status();
        return PaymentStatus.SUCCESS;
    }
}
