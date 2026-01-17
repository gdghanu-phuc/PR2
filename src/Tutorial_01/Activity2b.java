package Tutorial_01;

import java.util.HashMap;
public class Activity2b {
    static HashMap<String, Integer> students = new HashMap<>();

    public static void addStudent(String name, int grade) {
        students.put(name, grade);
    }

    public static double getAverage() {
        if (students.isEmpty())
            return 0;
        int sum = 0;
        for (int grade : students.values()) {
            sum += grade;
        }
        return (double) sum / students.size();
    }

    public static String getTopStudent() {
        if (students.isEmpty())
            return null;

        String top = null;
        int max = -1;
        for (String name : students.keySet()) {
            int grade = students.get(name);
            if (grade > max) {
                max = grade;
                top = name;
            }
        }
        return top;
    }
        public static void main(String[] args) {
            addStudent("Alice", 85);
            addStudent("Bob", 92);
            addStudent("Charlie", 78);

            System.out.println("Average grade: " + getAverage());
            System.out.println("Top student: " + getTopStudent());
        }
    }


