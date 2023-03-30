import company.MaterialStock;
import employees.*;
import materials.*;
import utilities.Recruter;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Tests {

    public static boolean containsKey(HashMap<MaterialStock, Integer> shoppingList, Object key) {
        if (key instanceof Material) {
            //Option #1
            for (int i = 0; i < shoppingList.size(); i++) {
                return shoppingList.keySet().contains(key);
            }
            //Option #2
            for (MaterialStock m : shoppingList.keySet()) {
                if (m.equals(key)) {
                    return true;
                }
            }
            //Option #3
            for (MaterialStock m : shoppingList.keySet()) {
                if (m.equals(key)) return true;
            }
            //Option #4
            for (MaterialStock m : shoppingList.keySet()) {
                return m.equals(key);
            }
            //Option #cheater
            return shoppingList.keySet().contains(key);
        }
        return false;
    }

    public static void testBuyMaterials() throws Exception {
        HashMap<MaterialStock, Integer> shoppingList = new HashMap<>();
        shoppingList.put(MaterialStock.BRICKSTONE, 1);
        shoppingList.put(MaterialStock.SWITCH, 100);
        shoppingList.put(MaterialStock.DOOR_WITH_WINDOW, 1);
        shoppingList.put(MaterialStock.DOOR_WITHOUT_WINDOW, 10);
        shoppingList.put(MaterialStock.CABLE, 1000);

        //duplicate test
        shoppingList.put(MaterialStock.BRICKSTONE, 10);
        System.out.println(shoppingList);
        System.out.println(shoppingList.keySet());
        System.out.println(shoppingList.values());
        System.out.println(shoppingList.containsKey(MaterialStock.BRICKSTONE));
        System.out.println(shoppingList.containsKey(MaterialStock.CHIMNEY));
        System.out.println(shoppingList.containsValue(1000));
        System.out.println(shoppingList.containsValue(new Integer(1000)));
        Integer i = new Integer(5);
        System.out.println(shoppingList.containsValue(i));
        System.out.println(i);
        //our own contains key function
        boolean contains = containsKey(shoppingList, MaterialStock.CHIMNEY);
        System.out.println("Contains " + MaterialStock.CHIMNEY + ": " + contains);

        //Buyer e = new Buyer("asdfa", "asdf");
        Employee e1 = new Buyer("asdfa", "asdf");
        Buyer buyer = (Buyer) e1;

        HashMap<Material, Integer> l = buyer.buyMaterial(shoppingList);
        System.out.println(l);
    }

    public static void testBuyMaterials_classcast() throws Exception {
        Material m = new Material(MaterialStock.BRICKSTONE.name(), 1000, "Stone") {
        };
        Material m1 = new Brickstone(m);
        System.out.println(m.getClass());
        System.out.println(m1.getClass());

        Class<?> clazz = Class.forName(MaterialStock.BRICKSTONE.name());
        Constructor<?> ctor = clazz.getConstructor(String.class, double.class, String.class);
        Object object = ctor.newInstance(new Object[]{MaterialStock.BRICKSTONE.name(), 1000, "Stone"});

        System.out.println(object);
        System.out.println(object.getClass());
    }

    public static void testInstanceOf() {
        Object employee1 = new HR("sdfasdf", "adfasdfsadf");
        System.out.println(employee1 instanceof Integer);
        //employee1.getClass() => HR.class
        //Material.getClass() => Material.class
        //HR.class == Material.class
        System.out.println(employee1 instanceof Material);
        System.out.println(employee1 instanceof HR);
        System.out.println(employee1 instanceof Employee);

        Employee e1 = new WorkerManager("asdf", "asdfsadf");
        System.out.println(e1 instanceof Employee);
        System.out.println(e1 instanceof Worker);
        System.out.println(e1 instanceof WorkerManager);
        System.out.println(e1 instanceof Architect);

        Employee e2 = new Worker("test1", "test2");
        System.out.println(e2 instanceof WorkerManager);
    }

    public static void testNameGenerator() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(Recruter.recrutePerson()));
        }
    }

    public static void testEmployment() throws Exception {
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

    public static void testEmployment_manual() throws Exception {
        Employee e1 = new Worker("Yuriy", "B.");
        Employee e2 = new Worker("Yuriy", "B.");
        Employee e3 = new Architect("Yuriy", "B.");

        ArrayList<Employee> db = new ArrayList<>();

        HR.addNewEmployee_manual(e1, db);
        try {
            HR.addNewEmployee_manual(e2, db);
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
        HR.addNewEmployee_manual(e3, db);

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
        ((Door) door3).setWindow(false);
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
                ((Worker) emp).work();
            }
        }

        System.out.println(buyer.getClass().getSimpleName());
    }
}
