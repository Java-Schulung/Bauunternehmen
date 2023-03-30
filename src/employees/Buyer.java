package employees;

import company.MaterialStock;
import materials.*;

import java.util.HashMap;

public class Buyer extends Employee {

    public Buyer(String firstname, String lastname)
            throws NullPointerException {
        super(firstname, lastname);
    }

    /**
     * The buyer purchases materials based on the given shopping list.
     * And returns initialized Material Object and required amount.
     * @param shoppingList HashMap<MaterialStock, Integer> Shopping list of materials
     *                     and amount of required material as Integer.
     * @return HashMap<Material, Integer> purchased materials as Material objects.
     */
    public HashMap<Material, Integer> buyMaterial(HashMap<MaterialStock, Integer> shoppingList) {

        HashMap<Material, Integer> materials = new HashMap<>();
        //{ KEY=VALUE, KEY2=VALUE2 }
        for (MaterialStock ms: shoppingList.keySet()) {
            Integer amount = shoppingList.get(ms);
            /*
            switch(ms) {
                //old version
                case BRICKSTONE:
                    materials.put(new Brickstone(ms.name(), 1000, "Stone"), amount);
                    break;
                case CABLE:
                    materials.put(new Cable(ms.name(), 1000, "Stone"), amount);
                    break;
                default:
                    break;
            }
            */

            switch(ms) {
                case BRICKSTONE -> {
                    materials.put(new Brickstone(ms.name(), 1000, "Stone"), amount);
                }
                case CABLE -> {
                    materials.put(new Cable(ms.name(), 1000, "Stone"), amount);
                }
                case CHIMNEY -> {
                    materials.put(new Chimney(ms.name(), 1000, "Stone"), amount);
                }
                case DOOR_WITH_WINDOW -> {
                    materials.put(new Door(ms.name(), 1000, "Wood", true), amount);
                }
                case DOOR_WITHOUT_WINDOW -> {
                    materials.put(new Door(ms.name(), 1000, "Metal"), amount);
                }
                case PARQUET_FLOOR -> {
                    materials.put(new ParquetFloor(ms.name(), 1000, "Stone"), amount);
                }
                case PIPE -> {
                    materials.put(new Pipe(ms.name(), 1000, "Stone"), amount);
                }
                case SWITCH -> {
                    materials.put(new Switch(ms.name(), 1000, "Stone"), amount);
                }
                case WINDOW -> {
                    materials.put(new Window(ms.name(), 1000, "Stone"), amount);
                }
                default -> {}
            }

        }
        return materials;
    }

    /*
    @Override
    public String toString() {
        return super.toString()
                + "\nProfession: " + "Buyer";
    }

     */
}
