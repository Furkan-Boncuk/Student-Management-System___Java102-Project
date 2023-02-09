import java.util.Comparator;

public class StudentAverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getAverageGrade() > s2.getAverageGrade()){
            return -1;
        }else if(s2.getAverageGrade() > s1.getAverageGrade()){
            return 1;
        } else{
            return 0;
        }
    }

}
