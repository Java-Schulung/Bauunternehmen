package blueprints;

import java.util.HashMap;

public class Villa extends Blueprint {
    public Villa(String name, int buildTime,
                 HashMap<String, Integer> requiredMaterials,
                 int levels, int doors, int windows, Color color) {
        super(name, buildTime, requiredMaterials, levels, doors, windows, color);
    }
}
