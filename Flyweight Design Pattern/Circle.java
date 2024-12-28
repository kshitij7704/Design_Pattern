public class Circle implements Shape {
   private String color;  // Intrinsic state: immutable property
   private int x;         // Extrinsic state: mutable property
   private int y;         // Extrinsic state: mutable property
   private int radius;    // Extrinsic state: mutable property

   public Circle(String color) {
       this.color = color;
   }

   // Setters for extrinsic state
   public void setPosition(int x, int y) {
       this.x = x;
       this.y = y;
   }

   public void setRadius(int radius) {
       this.radius = radius;
   }

   @Override
   public void draw() {
       System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius + "]");
   }
}