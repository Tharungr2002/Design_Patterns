package Com.LLD.Structural.Adapter;

import javax.swing.*;

interface Payment{
    void makePayment();
}

class Razorpay implements Payment{
    @Override
    public void makePayment() {
        System.out.println("make using razor");
    }
}

class PayUPayment {
    public void paymentByPayU() {
        System.out.println("make by payu");
    }
}

class PayUAdapter implements Payment {
    PayUPayment payUPayment;

    PayUAdapter() {
        this.payUPayment = new PayUPayment();
    }

    @Override
    public void makePayment() {
        payUPayment.paymentByPayU();
        System.out.println("by adapter payu");
    }
}

class Checkout{
    Payment payment;

    Checkout(Payment payment) {
        this.payment = payment;
    }

    public void processPayment() {
        payment.makePayment();
    }
}


public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout(new PayUAdapter());
        checkout.processPayment();
    }
}
