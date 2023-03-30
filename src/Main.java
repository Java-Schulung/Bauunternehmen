import company.ConstructionCompany;
import company.MaterialStock;
import employees.Employee;
import employees.HR;
import materials.Brickstone;
import materials.Material;
import ui.Terminal;
import utilities.Recruter;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        //TESTS
        //Tests.testBuyMaterials();
        //Tests.testInstanceOf();
        //Tests.testNameGenerator();
        //Tests.testEmployment();
        //Tests.testEmployment_manual();
        //Tests.testMaterial();
        //Tests.testEmployees();

        //BAUUNTERNEHMEN
        //getInstance();
    }

    private static void getInstance() {
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
    }
}