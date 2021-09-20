 class Box {
     double weight;
     double height;
     double depth;
     double width;
}

public class UseBox{
    public static void main(String args[]){
        // Creating the object of class

        Box a = new Box();
        Box b = new Box();
        double vol1,vol2;

        // Assigning values for box a
        a.depth = 50;
        a.width = 20;
        a.height = 10;

        // Assigning values for box b
        b.depth = 150;
        b.width = 120;
        b.height = 110;

        // formulas
        vol1 = a.height * a.depth * a.width;
        vol2 = b.height * b.depth * b.width;

        System.out.println("Volume of first box is "+vol1 + "\nvolume of second box is "+vol2);
    }


}