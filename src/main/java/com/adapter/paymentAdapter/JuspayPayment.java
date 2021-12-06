package com.adapter.paymentAdapter;

import com.adapter.API.Juspay;

public class JuspayPayment implements PaymentProvider {
    Juspay api = new Juspay();

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
        return  PaymentStatus.SUCCESS;
    }

}
