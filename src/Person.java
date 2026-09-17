//private amd protected are not allowed as class access modules
public class Person {
    //height,age,color,name,weight
    double height;
    int age;
    String color;
    String name;
    double weight;

    //Constructors can have private, protected, public access modifiers
    public Person(){
    //default Constructor can be empty
        height=48;
        age=18;
        color="black";
        name="";
        weight=140;
    }

    //Protected members are accessible within the same package - java files under the same directory/folder
    protected Person(double height, int age){
        //parameters are local variables to the constructor
        this.height=height;
        this.age=age;
    }

    //Overloaded Constructor
    private Person(double height, int age, String color, String name, double weight){
        //parameters are local variables to the constructor
        this.height=height;
        this.age=age;
        this.color=color;
        this.name=name;
        this.weight=weight;
    }

    //Setter and Getter
    //Methods

    //Return type:Person
    public Person Call_Private(){
        Person p3=new Person(72,70,"Black","Barack Obama",178 );
        return p3;
    }
}