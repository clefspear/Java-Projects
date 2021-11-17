
/**
 * Write a description of class School here.
 * 
 * @Peter Azmy 
 * @version (a version number or a date)
 */
public class CounselorsPC
{
    private int year;
    private String firstname;
    private String lastname;
    private int id;
    public CounselorsPC(int GradYear, String LastName, String FirstName, int ID)
    {      this.id = ID;
        this.year = GradYear;
        this.firstname = FirstName;
        this.lastname = LastName;

    }

    public String StudentInfo()
    {
        return "Student: " + lastname + " , " + firstname + " (" + id + ") Graduates in " + year;
    }

    public int ID()
    {
        return id;
    }

    public String FirstName()
    {
        return this.firstname;
    }

    public String LastName()
    {
        return this.lastname;
    }

    public int GraduationYear()
    {
        return this.year;
    }
   
}