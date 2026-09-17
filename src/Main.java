
public class Main {

    public static void main(String[]args){
        //create two person object
        Person p1=new Person();

//        Person p2=new Person(75,25,"Black","Barack Obama",170 );
//        System.out.println(p2.name);
        Person p2=new Person(75,25 );
        System.out.println(p2.age);

        Person p3=p2.Call_Private();




    }
}