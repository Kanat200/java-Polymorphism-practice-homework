package poly.task1FromBook;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("animalDoctor.poly.task1FromBook.Cat is eating");
    }

    @Override
    public void roam() {
        System.out.println("animalDoctor.poly.task1FromBook.Cat is roaming");
    }

    @Override
    public void makeNoise() {
        System.out.println("animalDoctor.poly.task1FromBook.Cat is making a noise");
    }
}