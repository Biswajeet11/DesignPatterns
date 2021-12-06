package com.adapter.paymentAdapter;

enum PaymentStatus{
    SUCCESS,
    INPROGRESS,
    FAILED
}

public interface PaymentProvider {

    public void makeLink();
    public void pay();
    public PaymentStatus checkStatus();

}
