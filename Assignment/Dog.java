public class Dog {
    
    private String name;
    private String breed;

    
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public void setBreed(String breed) {
        this.breed = breed;
    }

    
    public void printDetails() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    
    public static void main(String[] args) {
        // Create two instances of the Dog class
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Beagle");

        
        dog1.printDetails();
        dog2.printDetails();

        
        dog1.setName("Max");
        dog1.setBreed("Labrador");

        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        
        dog1.printDetails();
        dog2.printDetails();
    }
}
