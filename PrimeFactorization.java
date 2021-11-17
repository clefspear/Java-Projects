
/**
 * Write a description of class PrimeFactorization here.
 * 
 * @author Peter Azmy 
 * @version (a version number or a date)
 */
public class PrimeFactorization
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int Factor;
    private int FactorSaved;
    
    public PrimeFactorization (int startfactor)
    {
        Factor = startfactor;
        a = 2;
        b = 3;
        c = 5;
        d = 7;
    }
    public void NewNumber(int newnumber)
    {
        Factor = newnumber;
        FactorSaved = newnumber;
    }
    public void factor()
    {
        FactorSaved = Factor;
        Factor = FactorSaved;
        while(Factor % a == 0)
        {
            System.out.print(a + " ");
            Factor = Factor / a;
        }
         while(Factor % b == 0)
        {
            System.out.print(b + " ");
            Factor = Factor / b;
        } while(Factor % c == 0)
        {
            System.out.print(c + " ");
            Factor = Factor / c;
        } while(Factor % d == 0)
        {
            System.out.print(d + " ");
            Factor = Factor / d;
        }
        if (Factor == FactorSaved)
        { 
            System.out.print(Factor + " cannot be factored. ");
        } 
        else
        {
            System.out.print(Factor + " Factorization Complete. ");
            
        }
        Factor=FactorSaved;
    }
}
            
            
        
    
    
   