public class student {
    private String name;
    private int age;
    private String Studentid;
    public student(String name, int age, String Studentid) {
        this.name = name;
        this.age = age;
        this.Studentid = Studentid;
    }
}

public String getName() {
    return name;
}
public void setName(String name) {
    if(name == null || name.isEmpty()) {
        throw new IllegalArgumentException("Name cannot be null or empty");
    }
    else{

        
        this.name = name;
    }
}
