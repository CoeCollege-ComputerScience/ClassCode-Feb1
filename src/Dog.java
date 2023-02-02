public class Dog extends Animal{
    public Dog() {
        super(4);
    }

    @Override
    String speak() {
        return "Woof!";
    }
}
