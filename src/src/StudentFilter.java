import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentFilter
{
    List<Student> studentsWithHighScore;

    public static void main(String[] args)
    {
        StudentFilter student = new StudentFilter();

        List<Student> students = student.GetStudents();

        student.studentsWithHighScore = students
                .stream()
                .filter(s -> s.GetScore() >= 100)
                .sorted(Comparator.comparing(Student::GetScore).reversed())
                .toList();

        student.PrintHighScoreStudents();
    }

    private List<Student> GetStudents() {
        Student John = new Student(120, "John");
        Student Martin = new Student(80, "Martin");
        Student Sandra = new Student(150, "Sandra");
        Student Imani = new Student(200, "Imani");

        return Arrays.asList(John, Martin, Sandra, Imani);
    }

    private void PrintHighScoreStudents()
    {
        for(Student s : studentsWithHighScore)
            System.out.printf("%s: %s. %n", s.GetName(), s.GetScore());
    }
}
