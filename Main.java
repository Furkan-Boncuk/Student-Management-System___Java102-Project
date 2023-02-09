import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentIdComparator());
        students.add(new Student("Ayşe",98.1,235604));
        students.add(new Student("Ayşe",92.4,235707)); 
        // Sıralama esnasında aynı değerleri tekrarlayıp takrarlamayacağını test etmek için üstteki elemanı ekledik
        students.add(new Student("Ahmet",92.4,235605));
        students.add(new Student("Berke",85.7,235702));
        students.add(new Student("Batu",56.3,235707));
        students.add(new Student("Selim",72.6,235809));
        students.add(new Student("Cemre",67.8,235716));
        //id
        TreeSet<Student> studentsById = new TreeSet<>(new StudentIdComparator());
        studentsById.addAll(students);
        System.out.println("Sorted by student id:");
        for (Student s : studentsById) {
            System.out.println(s.getName() + " - " + s.getId());
        }
        //name
        TreeSet<Student> studentsByName = new TreeSet<>(new StudentNameComparator());
        studentsByName.addAll(students);
        System.out.println("Sorted by student name:");
        for(Student s: studentsByName){
            System.out.println(s.getName());
        }
        //averageGrade
        TreeSet<Student> studentsByAverageGrade = new TreeSet<>(new StudentAverageGradeComparator());
        studentsByAverageGrade.addAll(students);
        System.out.println("Sorted by student average grade:");
        for(Student s: studentsByAverageGrade){
            System.out.println(s.getName()+" - "+s.getAverageGrade());
        }
    }
}
