package employees;

import materials.Material;

import java.util.HashMap;

public class Buyer extends Employee {

    public Buyer(String firstname, String lastname)
            throws NullPointerException {
        super(firstname, lastname);
    }

    public HashMap<Material, Integer> buyMaterial(HashMap<String, Integer> materials) {
        return null;
    }

    /*
    @Override
    public String toString() {
        return super.toString()
                + "\nProfession: " + "Buyer";
    }

     */
}
