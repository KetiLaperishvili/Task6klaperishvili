
class Animal {
    protected String species;


    public Animal(String species) {
        this.species = species;
    }
}


class Mammal extends Animal {
    protected String diet;


    public Mammal(String species, String diet) {
        super(species);
        this.diet = diet;
    }
}


class Dog extends Mammal {
    private String breed;


    public Dog(String species, String diet, String breed) {
        super(species, diet);
        this.breed = breed;
    }


    public void displayDetails() {
        System.out.println("Species: " + species);
        System.out.println("Diet: " + diet);
        System.out.println("Breed: " + breed);
    }
}


public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("1", "2", "3");
        dog.displayDetails();
    }
}
