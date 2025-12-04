import java.util.Scanner;


abstract class PaymentMethod {
  
    abstract void pay(double amount);
}

class CreditCardPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class DebitCardPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card.");
    }
}

class UPIPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter payment amount: ₹");
        double amount = sc.nextDouble();

        
        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        PaymentMethod payment;  

        
        switch (choice) {
            case 1:
                payment = new CreditCardPayment();
                break;
            case 2:
                payment = new DebitCardPayment();
                break;
            case 3:
                payment = new UPIPayment();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        
        payment.pay(amount);

        sc.close();
    }
}