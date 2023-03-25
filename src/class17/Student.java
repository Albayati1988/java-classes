package class17;

public class Student {
    /*
        Create a class call it student define 4 instance fields like id name age weight
        create 5 object of this class do this task without constructors and with constructors
         */
    String id;
    String name;
    int age;
    double weight;

    public Student(String sName,String sId,int sAge){
        id=sId;
        name=sName;
        age=sAge;

    }


    public  Student(String sName,String sId,int sAge,double sWeight){
        id=sId;
        name=sName;
        age=sAge;
        weight=sWeight;
    }

    void printInfo(){
        if(weight==0){
            System.out.println(name+" "+id+" "+age);
        }else {
            System.out.println(name+" "+id+" "+age+" "+weight);
        }

    }

    public static void main(String[] args) {

        Student student1=new Student("Zafar","123",29,56);
        student1.printInfo();
    }


}
