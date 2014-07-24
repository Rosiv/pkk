import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pr on 24.07.14.
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class SimpleDatabase {
    private List<Employee> employeeList;

    public SimpleDatabase() {
        this.employeeList = new ArrayList<Employee>();
    }

    public boolean Save(Employee employee) {
        boolean exists = alreadyExists(employee);
        if (!exists) {
            this.employeeList.add(employee);
        }

        return !exists;
    }

    public int count() { return this.employeeList.size();}

    private boolean alreadyExists(Employee employee) {
        boolean exists = false;

        for (Employee emp : this.employeeList) {
            if (emp.getPesel() == employee.getPesel()) {
                exists = true;
            }
        }

        return exists;
    }
}
