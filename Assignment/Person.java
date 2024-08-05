public class Person {
    
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }


    public static void main(String[] args) {
        
        Person person1 = new Person("Alaf", 23);
        Person person2 = new Person("Rahul", 23);

        
        person1.printDetails();
        person2.printDetails();
    }
}
