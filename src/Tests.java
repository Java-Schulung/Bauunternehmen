import employees.*;
import materials.*;
import utilities.Recruter;

import java.util.ArrayList;
import java.util.Arrays;

public class Tests {

    public static void testNameGenerator() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(Recruter.recrutePerson()));
        }
    }

    public static void testEmployment() {
        Employee e1 = new Worker("Yuriy", "B.");
        Employee e2 = new Worker("Yuriy", "B.");
        Employee e3 = new Architect("Yuriy", "B.");

        ArrayList<Employee> db = new ArrayList<>();

        HR.addNewEmployee(e1, db);
        try {
            HR.addNewEmployee(e2, db);
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
        HR.addNewEmployee(e3, db);

        System.out.println(db);
    }

    public static void testMaterial() {
        Material material = new Door("Eingangstür", 1000.00, "Holz");

        System.out.println(material);
        System.out.println(material.getClass());

        Material material2 = new Door("Indoortür", 190, "Holz");
        System.out.println(material2);
        System.out.println(material2.getClass().getName());

        System.out.println(material.equals(material2));
        System.out.println(material.equals(material));
        System.out.println(material.equals(new Integer(100)));

        System.out.println("======================= door");
        Door door = new Door("Eingangstür", 1000.00, "Holz");
        door.setWindow(true);
        System.out.println(door);
        System.out.println(door.getClass());

        System.out.println("======================= door2");
        Material door2 = new Door("Eingangstür", 1000.00, "Holz");
        System.out.println(door2);
        System.out.println(door2.getClass());

        System.out.println("======================= door3");
        Material door3 = new Door("Eingangstür", 1000.00, "Holz", true);
        System.out.println(door3);
        System.out.println(door3.getClass());
        //Door d = (Door) door3;
        //d.setWindow(false);
        //door3 = d;
        ((Door)door3).setWindow(false);
        System.out.println(door3);
    }

    public static void testEmployees() {
        try {
            Employee e = new HR(null, null);
            System.out.println(e);
            System.out.println(e.getClass().getName());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        ArrayList<Employee> employees = new ArrayList();

        Employee hr = new HR("Yuriy", "B.");
        System.out.println(hr);
        System.out.println(hr.getClass().getName());
        employees.add(hr);

        Employee worker = new Worker("Markus", "R.");
        System.out.println(worker);
        System.out.println(worker.getClass().getName());
        employees.add(worker);
        //sound
        //((Worker)worker).work();

        Employee architect = new Architect("Steffen", "H.");
        System.out.println(architect);
        System.out.println(architect.getClass().getName());
        employees.add(architect);

        Employee buyer = new Buyer("Pascal", "W.");
        System.out.println(buyer);
        System.out.println(buyer.getClass().getName());
        employees.add(buyer);

        Employee wm = new WorkerManager("Marco", "R.");
        System.out.println(wm);
        System.out.println(wm.getClass().getName());
        employees.add(wm);

        for (int i = 0; i < employees.size(); i++) {
            System.out.println("=========================");
            Employee ee = employees.get(i);
            System.out.println(ee);
        }

        for (Employee emp : employees) {
            System.out.println("=========================");
            System.out.println(emp);

            String workerClassName = Worker.class.getSimpleName();
            String empClassName = emp.getClass().getSimpleName();
            if (empClassName.equals(workerClassName)) {
                ((Worker)emp).work();
            }
        }

        System.out.println(buyer.getClass().getSimpleName());
    }
}
