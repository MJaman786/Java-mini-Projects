import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    String name;
    int id;
    double marks;
    ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    Student student = new Student(name,id,marks);
    public void getdata()
    {
        System.out.println(" ");
        System.out.print("\t\tEnter Name = ");
        name=sc.next();
        System.out.print("\t\tEnter Id = ");
        id=sc.nextInt();
        System.out.print("\t\tEnter Marks = ");
        marks=sc.nextDouble();
        Student student = new Student(name,id,marks);
        list.add(student);
    }

    public void delete()
    {
        System.out.println(" ");
        System.out.print("\t\tEnter Id = ");
        int id1=sc.nextInt();
        Student student1 = new Student(name, id1, id1);
        for(int i=0; i<list.size(); i++) {
            if(id1==(student1.getId(i))) {
                System.out.println("");
                System.out.println("\t\tStudent found...! "+student1.getName());
                System.out.println("\t\tStudent removed..");
                list.remove(student1.getId(i));
            } else {
                System.out.println("Student not found = ");
            }
        }
    }

    public void stdlist()
    {
        System.out.println(list);
    }
    public static void main(String[] args)
    {
        int choice;
        Main m = new Main();
        do {
            System.out.println("\t\t\t-----------------------------------------");
            System.out.println("\t\t\tStudent Databse Management");
            System.out.println("\t\t\t------------------------------------------");
            System.out.println("\t\t1.Create Database of student");
            System.out.println("\t\t2.Modify/Delete Student data");
            System.out.println("\t\t3.Display All Database of All Students");
            System.out.print("\t\t4.Enter your choice = ");
            choice=sc.nextInt();
            switch(choice) {
            case 1:
                m.getdata();
                break;
            case 2:
                m.delete();
                break;
            case 3:
                m.stdlist();
                break;
            }
        } while(choice!=0);
    }
}