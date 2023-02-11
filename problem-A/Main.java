public class Main{
    public static void main(String[] args) {
        Cat c1 = new Cat("Muizza");
        c1.greets();
        System.out.println(c1);

        Dog d1 = new Dog("Ayu");
        d1.greets();
        System.out.println(d1);

        Dog d2 = new Dog();
        d1.greets(d2);
    }
}