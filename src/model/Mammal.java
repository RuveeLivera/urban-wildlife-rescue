package model;

public class Mammal extends Animal {

    private boolean hasFur;

    public Mammal(String animalId, String animalType,
                  String description, boolean hasFur) {

        super(animalId, animalType, description);

        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public String getAnimalCategory() {
        return "MAMMAL";
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Has Fur: " + hasFur);
    }
}