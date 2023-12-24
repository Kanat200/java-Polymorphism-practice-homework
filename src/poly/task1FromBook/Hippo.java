package poly.task1FromBook;

public class Hippo extends Animal{
    @Override
    public void eat() {
        System.out.println("poly.task1FromBook.Hippo is eating");
    }

    @Override
    public void roam() {
        System.out.println("poly.task1FromBook.Hippo is roaming");
    }

    @Override
    public void makeNoise() {
        System.out.println("poly.task1FromBook.Hippo is making a noise");
    }
}