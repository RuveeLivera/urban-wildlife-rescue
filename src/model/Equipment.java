
package model;

public class Equipment {

    private String name;
    private String type;

    // Constructor
    public Equipment(String name, String type) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Equipment name cannot be empty."
            );
        }

        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Equipment type cannot be empty."
            );
        }

        this.name = name;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Equipment name cannot be empty."
            );
        }

        this.name = name;
    }

    public void setType(String type) {

        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Equipment type cannot be empty."
            );
        }

        this.type = type;
    }

    // Display equipment details
    public void displayEquipment() {

        System.out.println("Equipment Name: " + name);
        System.out.println("Equipment Type: " + type);
    }
}
