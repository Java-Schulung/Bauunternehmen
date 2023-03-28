import company.ConstructionCompany;
import ui.Terminal;
import utilities.Recruter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tests.testNameGenerator();
        Tests.testEmployment();

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