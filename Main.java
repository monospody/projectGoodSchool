package sk.itsovy.podhajecka.projectGoodSchool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private School school;
    public static void main(String[] args) throws FileNotFoundException {
        School mySchool = new School();
        File text = new File("students.dat");
        Scanner s2 = new Scanner(text);
        ArrayList<String> buffer = new ArrayList<>();
            while (s2.hasNext()) {
                buffer.add(s2.next());
                if (buffer.size()==6){
                    Student student = new Student(buffer.get(0),buffer.get(1),Byte.parseByte(buffer.get(2)),Byte.parseByte(buffer.get(3)),Byte.parseByte(buffer.get(4)),Integer.parseInt(buffer.get(5)));
                    mySchool.addStudent(student);
                    buffer.clear();
                }
            }
        System.out.println(mySchool.getTheBestStudent().getFullName());
        System.out.println(mySchool.getTheWorstStudent().getFullName());
        System.out.println(mySchool.getAverageAbsence());
        System.out.println(mySchool.getAverageGrade());
        System.out.println(mySchool.getTheLowestAbsence());
        mySchool.getListSortedByLastNameAsc();
        mySchool.getListSortedByAbsenceDesc();

    }
}