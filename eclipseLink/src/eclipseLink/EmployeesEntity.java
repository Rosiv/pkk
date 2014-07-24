package eclipseLink;

import javax.persistence.*;

/**
 * Created by pr on 24.07.14.
 */
@Entity
@Table(name = "EMPLOYEES", schema = "APP", catalog = "")
public class EmployeesEntity {
    private String pesel;
    private String firstname;
    private String lastname;
    private String city;
    private String jobposition;
    private int salary;

    @Id
    @Column(name = "PESEL", nullable = false, insertable = true, updatable = true, length = 11)
    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Basic
    @Column(name = "FIRSTNAME", nullable = false, insertable = true, updatable = true, length = 15)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "LASTNAME", nullable = false, insertable = true, updatable = true, length = 20)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "CITY", nullable = false, insertable = true, updatable = true, length = 15)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "JOBPOSITION", nullable = false, insertable = true, updatable = true, length = 15)
    public String getJobposition() {
        return jobposition;
    }

    public void setJobposition(String jobposition) {
        this.jobposition = jobposition;
    }

    @Basic
    @Column(name = "SALARY", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeesEntity that = (EmployeesEntity) o;

        if (salary != that.salary) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (jobposition != null ? !jobposition.equals(that.jobposition) : that.jobposition != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (pesel != null ? !pesel.equals(that.pesel) : that.pesel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pesel != null ? pesel.hashCode() : 0;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (jobposition != null ? jobposition.hashCode() : 0);
        result = 31 * result + salary;
        return result;
    }
}
