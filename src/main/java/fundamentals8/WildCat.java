package fundamentals8;

public class WildCat extends BigCat implements Lunchable{


    public WildCat(String name, Requirements requirements) {
        super(name, requirements);
    }

    @Override
    public void hasLunch() {
        System.out.println("i'm having wild berries!");
    }
}
