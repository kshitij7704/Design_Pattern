public class TestDrive {
   private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };

   public static void main(String[] args) {
       for (int i = 0; i < 20; i++) {
           // Get a circle of random color
           Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());

           // Set extrinsic state (position and radius)
           circle.setPosition(getRandomX(), getRandomY());
           circle.setRadius(100);

           // Draw the circle
           circle.draw();
       }
   }

   private static String getRandomColor() {
       return colors[(int)(Math.random() * colors.length)];
   }

   private static int getRandomX() {
       return (int)(Math.random() * 100);
   }

   private static int getRandomY() {
       return (int)(Math.random() * 100);
   }
}