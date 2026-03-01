package Com.LLD.Structural.Adapter;

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


public class Main {
    public static void main(String[] args) {
        Payment payment = new Razorpay();
        payment.makePayment();
    }
}
