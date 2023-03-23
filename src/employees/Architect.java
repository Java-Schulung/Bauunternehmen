package employees;

import blueprints.Blueprint;

public class Architect extends Employee {

    public Architect(String firstname, String lastname)
            throws NullPointerException {
        super(firstname, lastname);
    }

    public boolean addBlueprint(Blueprint bp) {
        return false;
    }

    public String meckern() {
        return null;
    }
    /*
    @Override
    public String toString() {
        return super.toString()
                + "\nProfession: " + "Architect";
    }
     */
}
