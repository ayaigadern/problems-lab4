package problem7;

public class Carpenter extends Person {
    private String name;

    public Carpenter(String name){
        super(name);
        this.name=name;
    }
    @Override
    public void display(){
        System.out.println("I am "+name+" the Carpenter ");

    }
}
