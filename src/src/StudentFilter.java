import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentFilter
{
    public static void main(String[] args)
    {
        Student John = new Student(120, "John");
        Student Martin = new Student(80, "Martin");
        Student Sandra = new Student(150, "Sandra");
        Student Imani = new Student(200, "Imani");

        List<Student> students = Arrays.asList(John, Martin, Sandra, Imani);

        List<Student> studentsWithHighScore = students
                .stream()
                .filter(s -> s.GetScore() >= 100)
                .sorted(Comparator.comparing(Student::GetScore).reversed())
                .toList();

        for(Student s : studentsWithHighScore)
            System.out.printf("%s: %s. %n", s.GetName(), s.GetScore());

    }
}
