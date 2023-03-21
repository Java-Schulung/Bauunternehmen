package employees;

public class Employee {

    private String employeeId;
    private String firstname;
    private String lastname;

    public Employee(String employeeId, String firstname, String lastname) {
        this.employeeId = employeeId;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Employee e = (Employee) obj;
            return this.employeeId.equals(e.getEmployeeId())
                    && this.firstname.equals(e.getFirstname())
                    && this.lastname.equals(e.getLastname());
        } catch (NullPointerException | ClassCastException ex) {
            System.out.println("Wrong type");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee:"
                + "\nID: " + employeeId
                + "\nFirst name: " + firstname
                + "\nLast name: " + lastname;
    }
}
