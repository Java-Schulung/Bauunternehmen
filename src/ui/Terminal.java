package ui;

import utilities.MyUtils;

import java.util.Scanner;

public class Terminal {

    public static String requireManagerName() {
        return requestText(true, "Managing Director");
    }

    public static String requireHRName() {
        return requestText(true,"HR");
    }

    public static String requireCompanyName() {
        return requestText(false, "Unternehmensnamen");
    }

    private static String requestText(boolean isEmployeeName, String text) {
        Scanner scanner = new Scanner(System.in);
        String name = null;
        while (true) {
            System.out.print("Bitte " + text + " eingeben > ");
            name = scanner.nextLine();
            try {
                if (isEmployeeName && MyUtils.validateName(name)) {
                    break;
                }
                if (!isEmployeeName && MyUtils.validateCompanyName(name)) {
                    break;
                }
            } catch (NullPointerException | StringIndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return name;
    }
}
