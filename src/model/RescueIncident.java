
package model;

import enums.AnimalCondition;
import enums.IncidentStatus;
import enums.LocationRisk;
import enums.PriorityCategory;

import java.util.ArrayList;
import java.util.List;

public class RescueIncident {

    private String incidentId;
    private int animalCount;
    private String location;

    private LocationRisk locationRisk;
    private AnimalCondition condition;

    private boolean immediateDanger;

    private List<Equipment> requiredEquipments;
    private List<Animal> animals;
    private List<String> requiredSkills;

    private String reporterName;
    private String reporterContact;

    private int priorityScore;
    private PriorityCategory priority;
    private IncidentStatus status;

    private String assignedTeamId;

    // Constructor
    public RescueIncident(
            String incidentId,
            int animalCount,
            String location,
            LocationRisk locationRisk,
            AnimalCondition condition,
            boolean immediateDanger,
            List<Equipment> requiredEquipments,
            String reporterName,
            String reporterContact,
            List<Animal> animals,
            List<String> requiredSkills) {

        // Input validation
        if (incidentId == null || incidentId.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Incident ID cannot be empty."
            );
        }

        if (animalCount <= 0) {
            throw new IllegalArgumentException(
                    "Animal count must be greater than zero."
            );
        }

        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Location cannot be empty."
            );
        }

        if (condition == null || locationRisk == null) {
            throw new IllegalArgumentException(
                    "Condition and location risk are required."
            );
        }

        this.incidentId = incidentId;
        this.animalCount = animalCount;
        this.location = location;
        this.locationRisk = locationRisk;
        this.condition = condition;
        this.immediateDanger = immediateDanger;

        this.requiredEquipments =
                requiredEquipments == null
                        ? new ArrayList<>()
                        : new ArrayList<>(requiredEquipments);

        this.animals =
                animals == null
                        ? new ArrayList<>()
                        : new ArrayList<>(animals);

        this.requiredSkills =
                requiredSkills == null
                        ? new ArrayList<>()
                        : new ArrayList<>(requiredSkills);

        this.reporterName = reporterName;
        this.reporterContact = reporterContact;

        this.priorityScore = 0;
        this.priority = PriorityCategory.LOW;
        this.status = IncidentStatus.REPORTED;

        this.assignedTeamId = null;
    }

    // Getters

    public String getIncidentId() {
        return incidentId;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public String getLocation() {
        return location;
    }

    public LocationRisk getLocationRisk() {
        return locationRisk;
    }

    public AnimalCondition getCondition() {
        return condition;
    }

    public boolean isImmediateDanger() {
        return immediateDanger;
    }

    public List<Equipment> getRequiredEquipments() {
        return new ArrayList<>(requiredEquipments);
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }

    public List<String> getRequiredSkills() {
        return new ArrayList<>(requiredSkills);
    }

    public String getReporterName() {
        return reporterName;
    }

    public String getReporterContact() {
        return reporterContact;
    }

    public int getPriorityScore() {
        return priorityScore;
    }

    public PriorityCategory getPriority() {
        return priority;
    }

    public IncidentStatus getStatus() {
        return status;
    }

    public String getAssignedTeamId() {
        return assignedTeamId;
    }

    // Setters

    public void setPriorityScore(int priorityScore) {
        this.priorityScore = priorityScore;
    }

    public void setPriority(PriorityCategory priority) {
        if (priority == null) {
            throw new IllegalArgumentException(
                    "Priority cannot be null."
            );
        }

        this.priority = priority;
    }

    public void setStatus(IncidentStatus status) {
        if (status == null) {
            throw new IllegalArgumentException(
                    "Status cannot be null."
            );
        }

        this.status = status;
    }

    public void setAssignedTeamId(String assignedTeamId) {
        this.assignedTeamId = assignedTeamId;
    }

    // Display incident details

    public void displayIncident() {

        System.out.println("\n========== INCIDENT DETAILS ==========");

        System.out.println("Incident ID: " + incidentId);
        System.out.println("Location: " + location);
        System.out.println("Animal Count: " + animalCount);
        System.out.println("Condition: " + condition);
        System.out.println("Location Risk: " + locationRisk);

        System.out.println("Immediate Danger: " + immediateDanger);

        System.out.println("Reporter: " + reporterName);
        System.out.println("Contact: " + reporterContact);

        System.out.println("Priority Score: " + priorityScore);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);

        System.out.println("Assigned Team: " + assignedTeamId);

        System.out.println("Required Skills: " + requiredSkills);
        System.out.println("Required Equipment: " + requiredEquipments);

        System.out.println("======================================");
    }
}
