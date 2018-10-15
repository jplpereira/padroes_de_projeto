public class CompositeTest {

    public static void main(String[] args) {

        Stretch stretch01 = new StretchByFoot("Go north", 500);
        Stretch stretch02 = new StretchByCar("Go east", 1500);
        Stretch stretch03 = new StretchBySubway("Go south", 500);
        Stretch stretch04 = new StretchByCar("Go west", 1000);

        Path path1 = new Path();
        path1.addStretch(stretch01);
        path1.addStretch(stretch02);
        System.out.println("First path: ");
        path1.printStretch();
        
        Path path2 = new Path();
        path2.addStretch(path1);
        path2.addStretch(stretch03);
        System.out.println("\nSecond Path: ");
        path2.printStretch();

        Path path3 = new Path();
        path3.addStretch(path2);
        path3.addStretch(stretch04);
        System.out.println("\nThird Path: ");
        path3.printStretch();
    }
}