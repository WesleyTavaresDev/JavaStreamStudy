public class Student
{
    String name;
    int score;

    public Student(int score, String name)
    {
        this.name = name;
        this.score = score;
    }


    public String GetName()
    {
        return name;
    }
    public int GetScore()
    {
        return score;
    }
}
