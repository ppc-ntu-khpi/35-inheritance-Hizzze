package domain;

public class Animal {

    protected String name;

    protected int weight;

    protected int height;

    public Animal() {
        name = "generic animal";
        weight = 30;
    }

    public void eat() {
        System.out.println(" Animal eating...");
    }

    public void speak() {
        System.out.println("Animal speaking...");
    }

    @Override
    public String toString() {
        return ("Animal:" + "\nname:\t" + name + "\nweight:\t" + weight+ "kg" +  "\nheight:\t" + height+ "cm");
    }
}

   
