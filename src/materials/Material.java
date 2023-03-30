package materials;

import company.MaterialStock;

public abstract class Material {

    private String name;
    private double price;
    private String type;

    public Material(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Material(Material material) {
        this.name = material.getName();
        this.price = material.getPrice();
        this.type = material.getType();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nMaterial: " + this.name
                + "\nType: " + this.type
                + "\nPrice: " + this.price;
    }

    @Override
    public boolean equals(Object obj) {
        Material material = null;
        try {
            material = (Material) obj;

            return this.name.equals(material.getName())
                    && this.type.equals(material.getType());
        } catch (NullPointerException | ClassCastException ex) {
            System.out.println("Falscher Typ");
        }
        return false;
    }
}
