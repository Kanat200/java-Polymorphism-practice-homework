package poly.task2FromBook;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        b.m1();
        c.m2();
        a.m3();
        //poly.task2FromBook.B - m1, poly.task2FromBook.A - m2, poly.task2FromBook.A - m3,

        System.out.println();

        c.m1();
        c.m2();
        c.m3();
        //poly.task2FromBook.B - m1, poly.task2FromBook.A - m2, poly.task2FromBook.C - m3, 13

        System.out.println();

        a.m1();
        b.m2();
        c.m3();
        //poly.task2FromBook.A - m1, poly.task2FromBook.A - m2, poly.task2FromBook.C - m3, 13

        System.out.println();

        a2.m1();
        a2.m2();
        a2.m3();
        //poly.task2FromBook.B - m1, poly.task2FromBook.A - m2, poly.task2FromBook.C - m3, 13
    }
}