public class House {

    private String floorType;
    private String wallType;
    private String roofType;

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    public String getWallType() {
        return wallType;
    }

    public void setWallType(String wallType) {
        this.wallType = wallType;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String toString() {
        return new String("\nConstructing house \n Floor Type: " + floorType + 
        "\n Wall Type: " + wallType + "\n Roof Type: " + roofType);
    }
}