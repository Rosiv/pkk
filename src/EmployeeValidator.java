/**
 * Created by pr on 23.07.14.
 */
public class EmployeeValidator {
    private Employee employee;
    public EmployeeValidator(Employee employee){
        this.employee = employee;
    }
    public boolean isFirstNameValid(){
        return this.employee.getFirstName().length() > 0;
    }
}
