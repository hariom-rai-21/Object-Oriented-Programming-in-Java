class Address
{
    String city, state;
    Address(String city, String state)
    {
        this.city = city;
        this.state = state;
    }
}  

class Student
{
    String name;
    int rollNo;
    Address address;
    Student(String name, int rollNo, Address address)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    // method to display Student details
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("City: " + address.city);
        System.out.println("State: " + address.state);
    }
}

public class AggregationExample
{
    public static void main(String[] args)
    {
        // Creating Address object
        Address addr = new Address("Delhi", "Delhi");
        // Creating Student object with Address
        Student s1 = new Student("John", 101, addr);

        // Display student details
        s1.display();
    }
}
