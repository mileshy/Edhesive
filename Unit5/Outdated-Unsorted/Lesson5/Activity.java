class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    private int id;
    
    private static int idCounter;
    
    public Student()
    {
        this("None", "None", 0, 0);
    }
    
    public Student(String firstName, String lastName, int gradeLevel, double gpa)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        if(gradeLevel >= 0 && gradeLevel <= 12)
        {
            this.gradeLevel = gradeLevel;
        }
        else
        {
            this.gradeLevel = 0;
        }
        if(gpa >= 0.0 && gpa <= 4.5)
        {
            this.gpa = gpa;
        }
        else
        {
            this.gpa = 0;
        }
        id = ++idCounter;
    }
    
    public String toString()
    {
        String str = lastName + ", " + firstName;
        str += "\nGPA: " + gpa;
        str += "\nGrade Level: " + gradeLevel + " id # " + id;
        return str;
    }
}
