package poly.task1FromBook;

public class Wolf extends Animal{
    @Override
    public void eat() {
        System.out.println("poly.task1FromBook.Wolf is eating");
    }

    @Override
    public void roam() {
        System.out.println("poly.task1FromBook.Wolf is roaming");
    }

    @Override
    public void makeNoise() {
        System.out.println("poly.task1FromBook.Wolf is making a noise");
    }
}