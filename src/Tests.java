import materials.Door;
import materials.Material;

public class Tests {

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
}
