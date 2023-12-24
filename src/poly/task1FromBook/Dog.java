package poly.task1FromBook;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("poly.task1FromBook.Dog is eating");
    }

    @Override
    public void roam() {
        System.out.println("poly.task1FromBook.Dog is roaming");
    }

    @Override
    public void makeNoise() {
        System.out.println("poly.task1FromBook.Dog is making a noise");
    }
}