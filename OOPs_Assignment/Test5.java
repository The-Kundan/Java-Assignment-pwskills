package OOPs_Assignment;
class Employee{
    String name;
    int yearOfJoining;
    int salary;
    String address;
}
public class Test5 {
    public static void main(String[] args) {
        Employee a = new Employee();
        Employee b=new Employee();
        Employee c = new Employee();
        a.name="Robert";
        a.yearOfJoining=1994;
        a.address="64C-WallsStreet";
        b.name="Sam";
        b.yearOfJoining=2000;
        b.address="68D-WallsStreet";
        c.name="John";
        c.yearOfJoining=1999;
        c.address="26B-WallsStreet";
        System.out.println("Name" + "\t"   + "Year of joining"   +   "   Address");
        System.out.println(a.name + "\t"   +   a.yearOfJoining   + "\t" +     a.address);
        System.out.println(b.name + "\t"   +   b.yearOfJoining   + "\t" +       b.address);
        System.out.println(c.name + "\t"   +   c.yearOfJoining  + "\t" +       c.address);
    }
}
