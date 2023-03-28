package employees;

public class HR extends Employee {
    public enum EmployeeType {
        ARCHITECT,
        BUYER,
        WORKER,
        WORKER_MANAGER
    }
    public HR(String firstname, String lastname)
            throws NullPointerException {
        super(firstname, lastname);
    }

    /**
     * Hires employee of the given type based on first and last names.
     * @param eType EmployeeType, enum value
     * @param firstname String first name of the person to hire
     * @param lastname String last name of the person to hire
     * @return new employee based on type
     * @throws NullPointerException if the employee type not valid
     */
    public Employee hireEmployee(
            EmployeeType eType, String firstname, String lastname) throws NullPointerException {
        Employee newEmployee = null;
        switch(eType) {
            case ARCHITECT -> {
                newEmployee = new Architect(firstname, lastname);
            }
            case BUYER -> {
                newEmployee = new Buyer(firstname, lastname);
            }
            case WORKER -> {
                newEmployee = new Worker(firstname, lastname);
            }
            case WORKER_MANAGER -> {
                newEmployee = new WorkerManager(firstname, lastname);
            }
            default -> {
                throw new NullPointerException("ERROR: Employee type is not valid!");
            }
        }
        return newEmployee;
    }

    /*
    @Override
    public String toString() {
        return super.toString()
                + "\nProfession: " + "HR";
    }
     */
 }
