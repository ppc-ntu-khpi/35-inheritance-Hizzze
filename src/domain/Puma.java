package domain;

public class Puma extends Animal {

    private String color;

    public Puma( String name, int weight , int height , String color) {
        this.name =name; 
        this.weight=weight;
        this.height=height;
        this.color=color;
    }

    public Puma() {
        this ("wild cougar", 60, 80 , "black");
        
        
    }

    public Puma(String name) {
        
        this ("wild cougar", 60, 80 , "black");
    }

    private Puma(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public void hunt() {
        System.out.println("Puma is hunting..."); 
    }

    @Override
    public String toString() {
        return super.toString() + "\ncolor: \t" +this.color;
    }

    @Override
    public void speak() {
        System.out.println("raaaaaaaaw");
    }

    @Override
    public void eat() {
        System.out.println("Puma eat meat....");
    }
    
    
    
    
}
