public class BuilderTest {

    public static void main (String[] args) {

        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseBuildDirector houseBuildDirector = new HouseBuildDirector(builder);
        System.out.println(houseBuildDirector.construct());

        builder = new WoodenHouseBuilder();
        houseBuildDirector = new HouseBuildDirector(builder);
        System.out.println(houseBuildDirector.construct());
    }
}