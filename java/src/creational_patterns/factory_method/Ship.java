package creational_patterns.factory_method;

public class Ship {
    private String id;
    private String name;
    private String color;
    private String logo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Ship{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", color='" + color + '\'' +
            ", logo='" + logo + '\'' +
            '}';
    }
}
