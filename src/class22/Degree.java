package class22;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a Degree you need High school Diploma");
    }

}
class Bachelors extends Degree{

}
class Master extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters Degree we need a Bachelors Degree first");
    }
}
class DegreeTester{
    public static void main(String[] args) {
        Degree degree =new Degree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Master master=new Master();
        master.getPrerequisite();
    }
}