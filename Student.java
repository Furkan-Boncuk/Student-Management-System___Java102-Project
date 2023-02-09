public class Student {
    private String name;
    private double averageGrade;
    private int id;

    public Student(String name, double averageGrade, int id) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.id = id;
    }

    //Getter and Setters

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getAverageGrade() {return averageGrade;}
    public void setAverageGrade(double averageGrade) {this.averageGrade = averageGrade;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
}
