public class Room {
    int roomno;
    String roomtype;
    double roomarea;
    boolean ACmachine;

    public void setData(int roomno, String roomtype, double roomarea, boolean ACmachine) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }

    public void displayData() {
        System.out.println("Room Number: " + roomno);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Room Area: " + roomarea + " sq.ft.");
        System.out.println("AC Machine: " + (ACmachine ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        Room room = new Room(); 
        room.setData(101, "Deluxe", 250.5, true); 
        room.displayData();
    }
}
