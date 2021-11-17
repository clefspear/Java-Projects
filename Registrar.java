import java.util.ArrayList;
/**
 * Write a description of class Registrar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Registrar
{
    private ArrayList<CounselorsPC> students; 
    public Registrar()
    {
        students = new ArrayList<CounselorsPC>();
    }

    public void AddStudent(CounselorsPC student)
    {
        students.add(student);

    }

    public void SearchID(int idnumber)
    {
        for( CounselorsPC student : students)
        {
            if(student .ID() == idnumber)
            {
                System.out.println(student.toString());
            }
        }
    }

    public void PrintAll()
    {
        for(CounselorsPC student : students)
        {
            System.out.println(student);
        }
    }

}
