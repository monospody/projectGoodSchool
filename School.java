package sk.itsovy.podhajecka.projectGoodSchool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class School implements SchoolStat{
    private List<Student> list;
    private int counter;

    public void addStudent(Student student){
        list.add(student);
        counter++;
    }
    public School(){
        list = new ArrayList<>();
    }
    public int getCount(){
        return counter;
    }
    @Override
    public Student getTheBestStudent() {
        double aver=6;
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

        return 0;
    }

    @Override
    public double getAverageGrade() {
        return 0;
    }

    @Override
    public double getAverageGradeFromMath() {
        return 0;
    }

    @Override
    public Student getTheWorstStudent() {
        return null;
    }

    @Override
    public int getTheLowestAbsence() {
        return 0;
    }

    @Override
    public List getListSortedByLastNameAsc() {
        return null;
    }

    @Override
    public List getListSortedByAbsenceDesc() {
        return null;
    }
}
