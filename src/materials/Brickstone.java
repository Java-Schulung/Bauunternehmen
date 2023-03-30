package materials;

public class Brickstone extends Material {
    public Brickstone(String name, double price, String type) {
        super(name, price, type);
    }

    public Brickstone(Material material) {
        super(material);
    }
}
