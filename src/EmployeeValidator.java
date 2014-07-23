import com.sun.org.apache.xerces.internal.impl.dv.xs.DecimalDV;

/**
 * Created by pr on 23.07.14.
 */
public class EmployeeValidator {
    private Employee employee;

    public EmployeeValidator(Employee employee) {
        this.employee = employee;
    }

    public boolean isFirstNameValid() {
        return this.employee.getFirstName() != null && this.employee.getFirstName().matches("[A-Z][a-zA-Z]*");
    }

    public boolean isLastNameValid() {
        return this.employee.getLastName() != null && this.employee.getLastName().matches("^[A-Z][a-zA-z]+([ '-][a-zA-Z]+)*");
    }

    public boolean isPeselValid() {
        String pesel = this.employee.getPesel();

        if (pesel == null) {
            return false;
        }

        PeselValidator peselValidator = new PeselValidator(pesel);
        return peselValidator.isValid();
    }

    public boolean isJobPositionValid() {
        return this.employee.getJobPosition() != null && this.employee.getJobPosition().length() > 5;
    }

    public boolean isCityValid() {
        return this.employee.getCity() != null && this.employee.getCity().matches("^[A-Z][a-zA-z]+([ '-][a-zA-Z]+)*");
    }

    public boolean isDateStartValid() {
        return this.employee.getDateStart() != null && this.employee.getDateStart().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
    }

    public boolean isSalaryValid() {
        return this.employee.getSalary() != null && this.employee.getSalary().matches("[1-9][0-9]*");
    }

    public boolean isEmployeeValid() {
        return this.isFirstNameValid()
                && this.isLastNameValid()
                && this.isPeselValid()
                && this.isJobPositionValid()
                && this.isCityValid()
                && this.isDateStartValid()
                && this.isSalaryValid();
    }
}
