package model;

public abstract class Animal {

    private String animalId;
    private String animalType;
    private String description;


    public Animal(String animalId, String animalType,
                  String description) {

        this.animalId = animalId;
        this.animalType = animalType;
        this.description = description;
    }

    public String getAnimalId() {
        return animalId;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getDescription() {
        return description;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String getAnimalCategory();


    public void displayDetails() {

        System.out.println("Animal ID: " + animalId);
        System.out.println("Animal Type: " + animalType);
        System.out.println("Category: " + getAnimalCategory());
        System.out.println("Description: " + description);
    }
}