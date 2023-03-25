package class20;
/* Write program: userClass  that has a constructor that initializes
 instance variable name and mobile number.Create a subclass  userInfo that will
have user address variable and it also being initialized through constructor
 call. Print users name, mobile number and address in userDetails
 method. Test your code.
 */



public class UserInfo extends UserClass {
    String address;

    public UserInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    public void userDetails() {
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Address: " + address);
    }
    public static void main(String[] args) {
        UserInfo user = new UserInfo("John Doe", "555-555-5555", "123 Main St.");
        user.userDetails();
    }
}
