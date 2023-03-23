import company.ConstructionCompany;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String companyName = "PokemonSolo GmbH";
        String managingDirectorName = "Yuriy Be.";
        String hrName = "Patric Ka.";
        try {
            ConstructionCompany myCompany =
                    new ConstructionCompany(companyName, managingDirectorName);

            System.out.println(myCompany.getCompanyName());
            System.out.println(myCompany.getEmployees());

            myCompany.hireHR(hrName);

        } catch (NullPointerException | StringIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        //Tests.testMaterial();
        //Tests.testEmployees();
    }
}