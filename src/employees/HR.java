package employees;

public class HR extends Employee {
    public HR(String firstname, String lastname)
            throws NullPointerException {
        super(firstname, lastname);
    }

    public boolean hireEmployee(Employee e, int amount) {
        return false;
    }

    /*
    @Override
    public String toString() {
        return super.toString()
                + "\nProfession: " + "HR";
    }
     */
 }
