
public class Student {

    private String name;
    private int id;
    private double marks; 

    
    
    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getId(int i) {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "[Name :" + name + ", Id=" + id + ", Marks=" + marks + "]\n\n";
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
