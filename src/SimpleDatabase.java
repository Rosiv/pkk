import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * + * Created by pr on 24.07.14.
 * +
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class SimpleDatabase {
    private static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<Employee>();
    }

    public boolean Save(Employee employee) {
employeeList.add(employee);

        return true;
    }

    public int count() {
        return employeeList.size();
    }

//    private boolean alreadyExists(Employee employee) {
//        boolean exists = false;
//
//        for (Employee emp : employeeList) {
//            if (emp.getPesel().equals(employee.getPesel())) {
//                exists = true;
//            }
//        }
//
//        return exists;
//    }
}