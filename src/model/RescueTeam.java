package model;

import enums.TeamStatus;

import java.util.ArrayList;
import java.util.List;

public class RescueTeam {

    private int teamId;
    private String teamName;

    private List<String> teamMembers;
    private List<String> animalCategories;
    private List<String> rescueSkills;
    private List<String> equipment;

    private TeamStatus status;

    private int maxIncidents;
    private int currentIncidents;

    // Constructor
    public RescueTeam(int teamId,
                      String teamName,
                      List<String> teamMembers,
                      List<String> animalCategories,
                      List<String> rescueSkills,
                      List<String> equipment,
                      int maxIncidents) {

        if (teamName == null || teamName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Team name cannot be empty."
            );
        }

        if (maxIncidents <= 0) {
            throw new IllegalArgumentException(
                    "Maximum incidents must be greater than zero."
            );
        }

        this.teamId = teamId;
        this.teamName = teamName;

        this.teamMembers = new ArrayList<>(teamMembers);
        this.animalCategories = new ArrayList<>(animalCategories);
        this.rescueSkills = new ArrayList<>(rescueSkills);
        this.equipment = new ArrayList<>(equipment);

        this.maxIncidents = maxIncidents;
        this.currentIncidents = 0;

        this.status = TeamStatus.AVAILABLE;
    }

    // Getters
    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<String> getTeamMembers() {
        return new ArrayList<>(teamMembers);
    }

    public List<String> getAnimalCategories() {
        return new ArrayList<>(animalCategories);
    }

    public List<String> getRescueSkills() {
        return new ArrayList<>(rescueSkills);
    }

    public List<String> getEquipment() {
        return new ArrayList<>(equipment);
    }

    public TeamStatus getStatus() {
        return status;
    }

    public int getMaxIncidents() {
        return maxIncidents;
    }

    public int getCurrentIncidents() {
        return currentIncidents;
    }

    // Check team availability
    public boolean isAvailable() {

        return status != TeamStatus.UNAVAILABLE
                && currentIncidents < maxIncidents;
    }

    // Check animal category compatibility
    public boolean canHandleAnimal(String category) {

        for (String animal : animalCategories) {

            if (animal.equalsIgnoreCase(category)) {
                return true;
            }
        }

        return false;
    }

    // Check required skills
    public boolean hasRequiredSkills(List<String> requiredSkills) {

        for (String skill : requiredSkills) {

            boolean found = false;

            for (String teamSkill : rescueSkills) {

                if (teamSkill.equalsIgnoreCase(skill)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }

    // Check required equipment
    public boolean hasRequiredEquipment(
            List<String> requiredEquipment) {

        for (String required : requiredEquipment) {

            boolean found = false;

            for (String available : equipment) {

                if (available.equalsIgnoreCase(required)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }

    // Assign incident to team
    public void assignIncident() {

        if (!isAvailable()) {
            throw new IllegalStateException(
                    "Team is not available."
            );
        }

        currentIncidents++;

        if (currentIncidents >= maxIncidents) {
            status = TeamStatus.ASSIGNED;
        }
    }

    // Complete an incident
    public void completeIncident() {

        if (currentIncidents > 0) {
            currentIncidents--;
        }

        if (currentIncidents < maxIncidents
                && status != TeamStatus.UNAVAILABLE) {

            status = TeamStatus.AVAILABLE;
        }
    }

    // Update team status
    public void setStatus(TeamStatus status) {
        this.status = status;
    }

    // Display team information
    public void displayTeam() {

        System.out.println("\n----------------------------------");
        System.out.println("RESCUE TEAM DETAILS");
        System.out.println("----------------------------------");

        System.out.println("Team ID: " + teamId);
        System.out.println("Team Name: " + teamName);

        System.out.println("Members: " + teamMembers);
        System.out.println("Animal Categories: " + animalCategories);

        System.out.println("Rescue Skills: " + rescueSkills);
        System.out.println("Equipment: " + equipment);

        System.out.println("Status: " + status);

        System.out.println("Current Incidents: "
                + currentIncidents);

        System.out.println("Maximum Incidents: "
                + maxIncidents);

        System.out.println("----------------------------------");
    }
}