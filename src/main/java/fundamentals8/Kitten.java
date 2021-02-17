package fundamentals8;



public class Kitten extends BigCat implements Lunchable{

    public Kitten(String name, Requirements requirements) { //has it's own parameters
        super(name, requirements); //and that of its parent class BigCat



    }

    @Override
    public void hasLunch() {
        System.out.println("I'm having sardines!");

    }
}
