package company;

import blueprints.Blueprint;
import employees.Employee;
import employees.ManagingDirector;

import java.util.ArrayList;

public class ConstructionCompany {
    private String companyName;
    private Employee managingDirector;
    private ArrayList<Employee> employees;
    private ArrayList<Blueprint> blueprints;
    private ArrayList<Object> orders;

    public ConstructionCompany(String companyName, String directorName)
            throws NullPointerException, StringIndexOutOfBoundsException {
        //found company name
        this.setCompanyName(companyName);
        //initialize employee list
        this.employees = new ArrayList<>();
        //
        this.blueprints = new ArrayList<>();
        //
        this.orders = new ArrayList<>();
        //name managing director
        this.setManagingDirector(directorName);
    }

    private String[] validateName(String employeeType, String employeeName)
            throws NullPointerException, StringIndexOutOfBoundsException {
        if (employeeName == null || employeeName.isBlank()) {
            throw new NullPointerException("ERROR: " + employeeType + " name is empty or null!");
        }

        String[] name = employeeName.split(" ");
        if (name.length != 2) {
            throw new StringIndexOutOfBoundsException("ERROR: The name must contain first and last name!");
        }

        String firstname = name[0];
        String lastname = name[1];
        if (firstname.length() <= 2 || lastname.length() <= 2) {
            throw new StringIndexOutOfBoundsException(
                    "ERROR: " + employeeType + " first or last name should have at least 2 characters!");
        }

        return name;
    }

    public void hireHR(String hrName)
            throws NullPointerException, StringIndexOutOfBoundsException {
        String[] name = this.validateName("HR", hrName);

        Employee hr = this.getManagingDirector().hireHR(name[0], name[1]);
        if (hr != null) {
            this.getEmployees().add(hr);
        } else {
            throw new NullPointerException("ERROR: " + hrName + " was not hired!");
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets company name.
     * @param companyName - String, Company should have at least 3 characters
     *                    and not empty or null
     */
    private void setCompanyName(String companyName)
            throws NullPointerException, StringIndexOutOfBoundsException {
        if (companyName == null || companyName.isBlank()){
            throw new NullPointerException("ERROR: Company name is empty or null!");
        }
        if (companyName.length() < 3) {
            throw new StringIndexOutOfBoundsException("ERROR: Company should have at least 3 characters!");
        }
        this.companyName = companyName;
    }

    public ManagingDirector getManagingDirector() {
        return (ManagingDirector) this.managingDirector;
    }

    /**
     * Sets managing director as Employee of the company.
     * Validates the name and splitts it into first and last name.
     * Firstname and lastname should have at least 2 characters each.
     * @param managingDirectorName String name of the managing director,
     *                             contains first and last name "Firstname Lastname"
     */
    private void setManagingDirector(String managingDirectorName)
            throws NullPointerException, StringIndexOutOfBoundsException {
        String[] name = this.validateName("Managing Director", managingDirectorName);

        this.managingDirector = new ManagingDirector(name[0], name[1]);
        this.employees.add(this.getManagingDirector());
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Blueprint> getBlueprints() {
        return blueprints;
    }

    public void setBlueprints(ArrayList<Blueprint> blueprints) {
        this.blueprints = blueprints;
    }

    public ArrayList<Object> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Object> orders) {
        this.orders = orders;
    }
}
