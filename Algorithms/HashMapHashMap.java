package algoritmi;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, HashMap<String, ArrayList<Double>>> StudentsScore = new HashMap<>();

        int Id;

        while (true) {
            System.out.println("Enter the id of the student");
            Id = Integer.parseInt(scanner.nextLine());
            if (Id == 0) {
                break;
            }


            HashMap<String, ArrayList<Double>> Subjects = new HashMap<>();
            String subjects;

            while (true) {
                System.out.println("Enter subject or Stop to end");
                subjects = scanner.nextLine();
                if (subjects.equals("Stop")) {
                    break;
                }

                ArrayList<Double> grades = new ArrayList<>();
                double EnteredGrade = 0;


                while (true) {
                    System.out.println("Enter Grades or 0 to end the program");
                    EnteredGrade = Double.parseDouble(scanner.nextLine());
                    if (EnteredGrade == 0) break;

                    if (EnteredGrade > 6 || EnteredGrade < 2) {
                        System.out.println("Invalid Grade");
                    } else {
                        grades.add(EnteredGrade);
                    }

                    Subjects.put(subjects, grades);
                }
                //gradeend

                StudentsScore.put(Id, Subjects);
            }//subend

        }//idend

        for (int id : StudentsScore.keySet()) {
            System.out.println("Student: " + id);
            double gradeSum = 0;
            int grades = 0;

            for (String subjec : StudentsScore.get(id).keySet()) {
                System.out.print(subjec + ": ");

                for (double grd : StudentsScore.get(id).get(subjec)) {
                    System.out.print(grd + " ");
                    grades++;
                    gradeSum += grd;
                }
                System.out.println();
            }

            System.out.println("Average Grade: " + (gradeSum / grades));

        }


    }
}
