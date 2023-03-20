package blueprints;

import java.util.HashMap;

public abstract class Blueprint {
    public enum Color {
        WHITE,
        BLACK,
        YELLOW,
        GREEN
    }
    private String name;
    private int buildTime;
    private HashMap<String, Integer> requiredMaterials;
    private int levels;
    private int doors;
    private int windows;
    private Color color;

    public Blueprint(String name, int buildTime,
                     HashMap<String, Integer> requiredMaterials,
                     int levels, int doors, int windows, Color color) {
        this.name = name;
        this.buildTime = buildTime;
        this.requiredMaterials = requiredMaterials;
        this.levels = levels;
        this.doors = doors;
        this.windows = windows;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(int buildTime) {
        this.buildTime = buildTime;
    }

    public HashMap<String, Integer> getRequiredMaterials() {
        return requiredMaterials;
    }

    public void setRequiredMaterials(HashMap<String, Integer> requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
