class Subject{
    double Eng;
    double Phy;
    double Chem;
    double Maths;
    double Bio;
}
public class Student {
    public static void main(String[] args){

    // Creating object of class

    Subject a = new Subject();
    Subject b = new Subject();
    double Avg1,Avg2;

    //Assigning Values

    a.Eng = 48;
    a.Maths = 50;
    a.Chem = 38;
    a.Phy = 45;
    a.Bio = 40;


    b.Eng = 38;
    b.Maths = 45;
    b.Chem = 35;
    b.Phy = 25;
    b.Bio = 30;

    // Formulas

    Avg1 = (a.Eng + a.Maths + a.Chem + a.Phy + a.Bio )/5;
    Avg2 = (b.Eng + b.Maths + b.Chem + b.Phy + b.Bio )/5;

        System.out.println("Average of 1st student is "+Avg1 + "\nAverage of 2nd student is "+Avg2);


    }
}
