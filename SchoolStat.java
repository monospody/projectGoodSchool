package sk.itsovy.podhajecka.projectGoodSchool;

import java.util.List;

public interface SchoolStat {
    public Student getTheBestStudent();
    public int getAverageAbsence();
    public double getAverageGrade();
    public double getAverageGradeFromMath();
    public Student getTheWorstStudent();
    public int getTheLowestAbsence();
    public List getListSortedByLastNameAsc();
    public List getListSortedByAbsenceDesc();






}
