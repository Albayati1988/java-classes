package class10;

public class D2Arrays {
    public static void main(String[] args) {
        // a 2D array which can hold 3 one D arrays
        // each of of size 3
        String[][] thomsonTrain=new String [3][3];
        String[] cabin0={"Adam","Zafar","Sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi","Abeera","Zahra"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;
        System.out.println(thomsonTrain[1][2]);

        System.out.println(thomsonTrain[0]);

    }

}
