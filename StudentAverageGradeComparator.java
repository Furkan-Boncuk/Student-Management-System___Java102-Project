import java.util.Comparator;

public class StudentAverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getAverageGrade() > s2.getAverageGrade()){
            return -1; //Eğer ilk veri daha önce gelmeliyse -1 döndürürüz
        }else if(s2.getAverageGrade() > s1.getAverageGrade()){
            return 1; //İkinci veri daha önce gelmeliyse 1 döndürürüz
        } else{
            return 0; //Her iki veri de eşitse 0 döndürürüz
        }
    }
}
/*
    Daha Kısa Bir Kod Yazmak İstersek Aşağıdaki Kod Satırı da İşimizi Çözecektir
        return Double.compare(s2.getAverageGrade(), s1.getAverageGrade());
 */
