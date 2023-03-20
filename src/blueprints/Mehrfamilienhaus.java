package blueprints;

import java.util.HashMap;

public class Mehrfamilienhaus extends Blueprint {
    public Mehrfamilienhaus(String name, int buildTime,
                            HashMap<String, Integer> requiredMaterials,
                            int levels, int doors, int windows, Color color) {
        super(name, buildTime, requiredMaterials, levels, doors, windows, color);
    }
}
