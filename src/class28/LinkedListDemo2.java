package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");

        LinkedList<String> futureSubjects=new LinkedList<>();

        futureSubjects.add("Selenium");
        futureSubjects.add("Testing");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");

        LinkedList<String> allSubjects=new LinkedList<>();

        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);
        System.out.println(allSubjects);

        LinkedList<String> subjectsIlike=new LinkedList<>();
        subjectsIlike.add("Java");
        subjectsIlike.add("SDLC");
        subjectsIlike.add("SQL");
        System.out.println(subjectsIlike);
        allSubjects.removeAll(subjectsIlike);
        System.out.println(allSubjects);

    }
}
