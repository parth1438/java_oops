public class food_delivery {
    public static void main(String[] args) {
        String[] orders = {"Pizza", "Burger", "Sushi", "Pasta", "Salad"};

        for (String order : orders) {
            
            Thread t = new Thread(() -> {
                System.out.println("Processing order: " + order + " by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Completed order: " + order + " by " + Thread.currentThread().getName());
            });
            t.start();
        }
    }
}
