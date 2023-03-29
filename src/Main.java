import company.ConstructionCompany;
import employees.Employee;
import employees.HR;
import materials.Material;
import ui.Terminal;
import utilities.Recruter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        //Tests.testInstanceOf();
        //Tests.testNameGenerator();
        Tests.testEmployment();
        Tests.testEmployment_manual();

        try {
            String companyName = Terminal.requireCompanyName();
            String managingDirectorName = Terminal.requireManagerName();
            ConstructionCompany myCompany =
                    new ConstructionCompany(companyName, managingDirectorName);

            System.out.println(myCompany.getCompanyName());
            System.out.println(myCompany.getEmployeeDB());

            String hrName = Terminal.requireHRName();
            myCompany.hireHR(hrName);

        } catch (NullPointerException | StringIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        //Tests.testMaterial();
        //Tests.testEmployees();
    }
}