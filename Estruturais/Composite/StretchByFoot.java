public class StretchByFoot implements Stretch {

    private String direction;
    private double distance;

    public StretchByFoot(String direction, double distance){
        this.direction = direction;
        this.distance = distance;
    }
    
    @Override
    public void printStretch(){
        System.out.println("Go by foot: ");
        System.out.println(this.direction);
        System.out.println("Distance: " + this.distance + " meters.");
    }
}