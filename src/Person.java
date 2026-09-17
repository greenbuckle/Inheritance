public class Person {
    //height,age,color,name,weight
    double height;
    int age;
    String color;
    String name;
    double weight;

    Person(){
    //default Constructor can be empty
        height=48;
        age=18;
        color="black";
        name="";
        weight=140;
    }

    //Overloaded Constructor
    Person(double height, int age, String color, String name, double weight){
        //parameters are local variables to the constructor
        this.height=height;
        this.age=age;
        this.color=color;
        this.name=name;
        this.weight=weight;
    }
}