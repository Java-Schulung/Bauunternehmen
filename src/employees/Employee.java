package employees;

import java.util.Calendar;
import java.util.UUID;

public abstract class Employee {

    private String employeeId;
    private String firstname;
    private String lastname;

    public Employee(String firstname, String lastname)
            throws NullPointerException {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setEmployeeId();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    private void setEmployeeId() {
        //Variante #1
        //Long timestamp = Calendar.getInstance().getTimeInMillis();
        //this.employeeId = timestamp.toString();
        //Variante #2
        //long timestamp = Calendar.getInstance().getTimeInMillis();
        //this.employeeId = String.valueOf(timestamp);
        //Variante #3
        UUID id = UUID.randomUUID();
        this.employeeId = id.toString();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) throws NullPointerException {
        if (firstname != null && !firstname.isBlank()) {
            this.firstname = firstname;
        } else {
            throw new NullPointerException("Firstname is null");
        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) throws NullPointerException {
        if (lastname != null && !lastname.isBlank()) {
            this.lastname = lastname;
        } else {
            throw new NullPointerException("Lastname is null");
        }
    }

    public boolean equalsEmployee(Employee employee) {
        return this.employeeId.equals(employee.getEmployeeId())
                && this.firstname.equals(employee.getFirstname())
                && this.lastname.equals(employee.getLastname());
    }

    @Override
    public boolean equals(Object obj) {
        try {
            if (obj instanceof Employee) {

                Employee e = (Employee) obj;
                return e.getClass().getSimpleName().equals(this.getClass().getSimpleName())
                        && this.firstname.equals(e.getFirstname())
                        && this.lastname.equals(e.getLastname());
            }
        } catch (NullPointerException | ClassCastException ex) {
            System.out.println("Wrong type");
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nEmployee:"
                + "\nID: " + employeeId
                + "\nFirst name: " + firstname
                + "\nLast name: " + lastname
                + "\nProfession: " + this.getClass().getSimpleName();
    }
}
