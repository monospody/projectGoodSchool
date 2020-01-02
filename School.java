package sk.itsovy.podhajecka.projectGoodSchool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School implements SchoolStat{
    private List<Student> list;
    private int count;

    public void addStudent(Student student){
        list.add(student);
        count++;
    }
    public School(){
        list = new ArrayList<>();
    }
    public int getCount(){
        return count;
    }
    @Override
    public Student getTheBestStudent() {
        double aver=list.get(0).getAverageGrade();
        int student=0;
        for (int i=0; i<list.size();i++) {
            if (aver>list.get(i).getAverageGrade()){
                aver = list.get(i).getAverageGrade();
                student = i;
            }
        }
        return list.get(student);
    }

    @Override
    public int getAverageAbsence() {
        int sum = 0;
        for (int i=0; i<list.size();i++) {
            sum = sum + list.get(i).getAbsence();
        };
        return sum/list.size();
    }

    @Override
    public double getAverageGrade() {
        double sum = 0;
        for (int i=0; i<list.size();i++) {
            sum = sum + list.get(i).getAverageGrade();
        };
        return sum/list.size();
    }

    @Override
    public double getAverageGradeFromMath() {
        double sum = 0;
        for (int i=0; i<list.size();i++) {
            sum = sum + list.get(i).getG_Mat();
        };
        return sum/list.size();
    }

    @Override
    public Student getTheWorstStudent() {
        double aver=list.get(0).getAverageGrade();
        int student=0;
        for (int i=0; i<list.size();i++) {
            if (aver<list.get(i).getAverageGrade()){
                aver = list.get(i).getAverageGrade();
                student = i;
            }
        }
        return list.get(student);
    }

    @Override
    public int getTheLowestAbsence() {
        int absence = list.get(0).getAbsence();
        for (int i=0; i<list.size();i++) {
            if (absence>list.get(i).getAbsence()) {
                absence = list.get(i).getAbsence();
            }
        };
        return absence;

    }

    @Override
    public List getListSortedByLastNameAsc() {
        List<Student> newlist = list;
        newlist.sort(Comparator.comparing(Student::getLastName));
        for (int i = 0; i < newlist.size(); i++) {
            System.out.println(newlist.get(i).getLastName());
        }
        return newlist;
    }

    @Override
    public List getListSortedByAbsenceDesc() {
        List<Student> newlist = list;
        newlist.sort(Comparator.comparing(Student::getAbsence));
        Collections.reverse(newlist);
        for (int i = 0; i < newlist.size(); i++) {
            System.out.println(newlist.get(i).getFirstName() + " "+ newlist.get(i).getAbsence());
        }
        return newlist;
    }
}
