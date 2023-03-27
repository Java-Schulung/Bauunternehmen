package utilities;

public final class MyUtils {

    public static boolean validateName(String employeeName)
            throws NullPointerException, StringIndexOutOfBoundsException {
        if (employeeName == null || employeeName.isBlank()) {
            throw new NullPointerException("ERROR: " + employeeName + " name is empty or null!");
        }

        String[] name = employeeName.split(" ");
        if (name.length != 2) {
            throw new StringIndexOutOfBoundsException("ERROR: The name must contain first and last name!");
        }

        String firstname = name[0];
        String lastname = name[1];
        if (firstname.length() < 2 || lastname.length() < 2) {
            throw new StringIndexOutOfBoundsException(
                    "ERROR: " + employeeName + " first or last name should have at least 2 characters!");
        }

        return true;
    }

    public static boolean validateCompanyName(String companyName)
            throws NullPointerException, StringIndexOutOfBoundsException {
        if (companyName == null || companyName.isBlank()){
            throw new NullPointerException("ERROR: Company name is empty or null!");
        }
        if (companyName.length() < 3) {
            throw new StringIndexOutOfBoundsException("ERROR: Company should have at least 3 characters!");
        }
        return true;
    }
}
