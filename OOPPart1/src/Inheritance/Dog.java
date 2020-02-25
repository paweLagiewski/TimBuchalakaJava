package Inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes,int legs, int tail, int teeth, String coat) {
        super(name,1,1, size, weight);
        this.eyes = eyes;
        this.tail = tail;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew(){
        System.out.println("chew chew chew");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("walking");
        move();
    }

    public void run(){
        System.out.println("is running");
        move();
    }
}
