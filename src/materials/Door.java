package materials;

public class Door extends Material {
    private boolean hasWindow;
    public Door(String name, double price, String type) {
        super(name, price, type);
    }

    public Door(String name, double price, String type, boolean hasWindow) {
        super(name, price, type);
        this.hasWindow = hasWindow;
    }

    public boolean hasWindow() {
        return hasWindow;
    }

    public void setWindow(boolean hasWindow) {
        this.hasWindow = hasWindow;
    }

    public boolean equals(Material obj) {
        if (obj.getClass().getName().equals("materials.Door")) {
            return this.getName().equals(obj.getName())
                    && this.getType().equals(obj.getType());
        }

        return false;
    }
    @Override
    public boolean equals(Object obj) {
        String doorClassName = this.getClass().getName();
        String objClassName = obj.getClass().getName();

        if (objClassName.equals(doorClassName)) {

            Material material = (Material) obj;

            return this.getName().equals(material.getName())
                    && this.getType().equals(material.getType());
        }

        return false;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nWindow: " + this.hasWindow;
    }
}
