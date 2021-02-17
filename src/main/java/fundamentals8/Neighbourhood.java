package fundamentals8;


public class Neighbourhood {
    public static void main(String[] args) {

        House myHouse = new House(10);
        House anotherHouse = new House(10);
//        //these are both objects of the class house
        //when this happens, the constructor is called

        Apartment myAprt = new Apartment(10, "balls");




        myAprt.getMaterial();
        System.out.println(myAprt.getMaterial());

        myHouse.name = "little sunflower";
        anotherHouse.name = "little lovebird";
        anotherHouse.windows = 4;
        //modifying the attribute/state in the parent class house

        System.out.println("my houses name is  " + myHouse.name);
        System.out.println("my other houses name is " + anotherHouse.name + " and it has "
                            + anotherHouse.windows + " windows");

//        makeAlive(); //- won't compile
        //if this method was static, we could access it here WITHOUT making an object of the house class
        //you would just have to import it
        //however as it is public we can't

        myHouse.makeAlive();
        // this works as we we are calling it on an object of the house class

        myHouse.addGarden(200);

        //myHouse.material; //won't compile as material is private
        System.out.println(myHouse.getMaterial()); //however can 'get' it using the get method which is public

        myHouse.setMaterial("glass"); // set it using the set method which is public

        System.out.println(myHouse.getMaterial()); //now we have set it we can get it again, it will have the updated
        //                                           material

    }



}
