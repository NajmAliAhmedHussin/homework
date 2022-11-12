/**

 *
 * Implement a class Employee. An employee has a name (a string) and a  salary (a double).
 * Provide a constructor with two arguments (String employeeName, double currentSalary)
 * and methods getName(), getSalary(), and raiseSalary(double byPercent).

 */
public class Employee
{
    private String name;
    private double salary;

    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }


    public String getName()
    {
        return name;
    }


    public double getSalary()
    {
        return salary;
    }


    public void raiseSalary(double byPercent)
    {
        double raise = byPercent / 100.0;
        salary = (salary * raise) + salary;
    }
}
