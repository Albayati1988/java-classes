package class15;

public class Task {
    /* Create a method createEmail(). Based on values of users name, lastName and email type,
     your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    String createEmail(String name, String lastName, String email) {
        return name+ lastName+ "@" + email + ".com";
   }

    public static void main(String[] args) {     // TESTER
        Task task=new Task();
        System.out.println(task.createEmail("Jon","snow","gmail"));

    }
}
