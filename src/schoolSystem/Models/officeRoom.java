package schoolSystem.Models;

public class officeRoom {
    private int officeID;
    private String officeName;
    private int numberOfOfficeStaff;
    private String buildingName;
    private int roomNumber;
    private String officeHours;

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public int getNumberOfOfficeStaff() {
        return numberOfOfficeStaff;
    }

    public void setNumberOfOfficeStaff(int numberOfOfficeStaff) {
        this.numberOfOfficeStaff = numberOfOfficeStaff;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
}
