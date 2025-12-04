// public class q1 {
    
// }
public class employee{
    static void work(){
        System.out.println("Employee is working");
    }
}
class manager extends employee{
    static void work(){
        System.out.println("Manager is working");
    }
    public static void main(String[] args) {
        employee e = new manager();
        e.work();
    }
}