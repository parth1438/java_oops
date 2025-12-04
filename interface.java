package Interface;
interface Printable {
    void print();
}
// Second interface
interface Showable {
    void show();
}
// Class implementing both interfaces
class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }
    public void show() {
        System.out.println("Showing...");
    }
}
public class Interf {
    public static void main(String[] args) {
        Demo obj = new Demo();
        //Printable p=new Demo();
        //Showable s=new Demo();
        obj.print();  // Output: Printing...
        obj.show();   // Output: Showing...
    }
}