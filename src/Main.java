import company.ConstructionCompany;
import ui.Terminal;

public class Main {
    public static void main(String[] args) {
        try {
            String companyName = Terminal.requireCompanyName();
            String managingDirectorName = Terminal.requireManagerName();
            ConstructionCompany myCompany =
                    new ConstructionCompany(companyName, managingDirectorName);

            System.out.println(myCompany.getCompanyName());
            System.out.println(myCompany.getEmployees());

            String hrName = Terminal.requireHRName();
            myCompany.hireHR(hrName);

        } catch (NullPointerException | StringIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        //Tests.testMaterial();
        //Tests.testEmployees();
    }
}