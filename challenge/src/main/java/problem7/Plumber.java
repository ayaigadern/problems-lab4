package problem7;

public class Plumber extends Person {
    private String name;

    public Plumber(String name){
        super(name);
        this.name=name;
    }

    @Override
    public void display(){
        System.out.println("I am "+name+" the Plumber ");

    }
}
