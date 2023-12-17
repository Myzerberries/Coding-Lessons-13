public class Main extends Object {

    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max);                        //This print statement prints out the Student name "Max", as well
                                                        //as the hashCode of the object.
                                                        //A hashcode is an integer, that is unique to an instance (in the
                                                        //currently executing code).
                                                        //When an instance is created, it's assigned a hashCode, and that
                                                        //hashCode is what can tell us if our multiple references are
                                                        //pointing to a single instance.

        //In the System.out.println statement above, Java implicitly calls the toString method on an object, if you
        //simply pass your object to System.out.println.

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carol");
        System.out.println(jimmy);
    }

}

//Only one class in a Java source file can be public. Since Main is public, we won't make Student public:

class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //@Override
   // public String toString() {
   //     return super.toString();            //Calling a method on super like this is somewhat redundant. All we've done
                                            //is explicitly call code that Java would have done for us anyway.
    //}


    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student {

    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid " + super.toString();       //Inheritance is cumulative, so PrimarySchoolStudent
                                                                //receives Student members and Object members.
                                                                //Object members are accessible, as long as Student
                                                                //doesn't override them.
    }
}

//Every class you create in Java intrinsically extends a special Java class.
//This class is named Object, and it's in the java.lang package.
//Class Object is the root of the class hierarchy. Every class has Object as a superclass.
//All objects, including arrays, implement the methods of this class.
//Up to this point, every class we've created has been extending this Object class. They all inherit from Object.
//This means that all the classes we've built have functionality we can use or override, the minute you create them.

//Both our Main class and the String class inherit from Object.
//The String class has over 60 methods.
//The String class overrides several methods on Object, two of which are equals() and toString().
//All objects, including arrays, inherit the methods from the Object class.
