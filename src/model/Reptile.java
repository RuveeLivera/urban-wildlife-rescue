package model;

public class Reptile extends Animal {

    private boolean venomous;

    public Reptile(String animalId, String animalType,
                   String description, boolean venomous) {

        super(animalId, animalType, description);

        this.venomous = venomous;
    }

    public boolean isVenomous() {
        return venomous;
    }

    public void setVenomous(boolean venomous) {
        this.venomous = venomous;
    }

    @Override
    public String getAnimalCategory() {
        return "REPTILE";
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Venomous: " + venomous);
    }
}