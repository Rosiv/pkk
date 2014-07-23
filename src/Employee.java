/**
 * Created by pr on 15.07.14.
 */
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@ManagedBean
@ApplicationScoped
public class Employee {

    private String firstName="john", lastName,pesel, jobPosition, city, dateStart, salary;
    private EmployeeValidator validator = new EmployeeValidator(this);

    public Employee()
    {
        this.salary = "1000";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void Save() throws FileNotFoundException, UnsupportedEncodingException {
        int foo = Integer.parseInt(this.salary);
        foo++;
        this.salary = Integer.toString(foo);
    }

    public EmployeeValidator getValidator() {
        return validator;
    }
}
