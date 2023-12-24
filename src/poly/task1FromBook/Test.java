package poly.task1FromBook;

public class Test {
    public static void main(String[] args) {
        PetOwner owner = new PetOwner();

        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();

            animals[i].roam();
        }

        owner.start();

    }
}