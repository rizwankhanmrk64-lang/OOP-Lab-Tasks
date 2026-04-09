
class Payment {
    double amount;

    void makePayment() {
        System.out.println("Payment: " + amount);
    }
}


class EasyPaisa extends Payment {
    @Override
    void makePayment() {
        double fee = 20;
        double total = amount + fee;
        System.out.println("EasyPaisa Payment: " + total);
    }
}


class BankTransfer extends Payment {
    @Override
    void makePayment() {
        System.out.println("Bank Transfer Payment: " + amount);
    }
}

// Main class
public class Paymentsystem {
    public static void main(String[] args) {

        Payment p;

        p = new EasyPaisa();
        p.amount = 1000;
        p.makePayment();

        p = new BankTransfer();
        p.amount = 1000;
        p.makePayment();
    }
}