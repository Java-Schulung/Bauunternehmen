package employees;

public class ManagingDirector extends Employee {

    public ManagingDirector(String firstname, String lastname)
            throws NullPointerException {
        super(firstname, lastname);
    }

    public Employee hireHR(String firstname, String lastname) {
        return null;
    }
}
