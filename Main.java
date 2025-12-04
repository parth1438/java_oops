class Number {
    private double value;

    // Constructor
    public Number(double value) {
        this.value = value;
    }

    public boolean isZero() {
        boolean result = (value == 0);
        System.out.println("Zero = " + result);
        return result;
    }

    public boolean isPositive() {
        boolean result = (value > 0);
        System.out.println("Positive = " + result);
        return result;
    }

    public boolean isNegative() {
        boolean result = (value < 0);
        System.out.println("Negative = " + result);
        return result;
    }

    public boolean isOdd() {
        boolean result = (value % 2 != 0);
        System.out.println("Odd = " + result);
        return result;
    }

    public boolean isEven() {
        boolean result = (value % 2 == 0);
        System.out.println("Even = " + result);
        return result;
    }

    public boolean isPrime() {
        if (value <= 1 || value != Math.floor(value)) {
            System.out.println("Prime = false");
            return false; // not prime if <=1 or not an integer
        }
        int n = (int) value;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Prime = false");
                return false;
            }
        }
        System.out.println("Prime = true");
        return true;
    }

    public boolean isArmstrong() {
        if (value != Math.floor(value)) {
            System.out.println("Armstrong = false");
            return false; // only check Armstrong for integers
        }
        int n = (int) value;
        int temp = n, sum = 0;
        int digits = String.valueOf(Math.abs(n)).length();
        while (temp != 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        boolean result = (sum == n);
        System.out.println("Armstrong = " + result);
        return result;
    }
}

// Test class
public class Main {
    public static void main(String[] args) {
        Number num = new Number(1);

        num.isZero();
        num.isPositive();
        num.isNegative();
        num.isOdd();
        num.isEven();
        num.isPrime();
        num.isArmstrong();
    }
}