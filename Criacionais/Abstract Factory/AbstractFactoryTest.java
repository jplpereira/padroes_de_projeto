public class AbstractFactoryTest {
    
    public static void main(String[] args){
        
        Factory factory = Factory.getFactory("truck");

        Engine engine = factory.getEngine();
        engine.design();
        engine.manufacture();
        engine.test();
        
        Tyre tyre = factory.getTyre();
        tyre.design();
        tyre.manufacture();

    }

}