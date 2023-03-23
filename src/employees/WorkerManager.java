package employees;

import blueprints.Blueprint;

import java.util.ArrayList;
import java.util.UUID;

public class WorkerManager extends Worker {
    public WorkerManager(String firstname, String lastname)
            throws NullPointerException {
        super(firstname, lastname);
    }

    public Object startBuild(Blueprint bp) {
        return null;
    }

    public boolean buildValidation(Object o, Blueprint bp) {
        return false;
    }

    public ArrayList<Worker> collectWorkerTeam() {
        return null;
    }

    public boolean fireWorkerTeam() {
        return false;
    }

    /*
    @Override
    public String toString() {
        return super.toString()
                + "\nProfession: " + this.getClass().getSimpleName();
    }
    */
}
