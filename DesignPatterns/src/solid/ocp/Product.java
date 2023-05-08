package solid.ocp;

public class Product {

   enum Color {
      RED, BLUE, GREEN
   };

   enum Size {
      SMALL, MEDIUM, BIG
   };

   enum Name {
      WATCH, CAR, HOUSE
   };

   public Product(Name name, Color color, Size size) {
      super();
      this.name = name;
      this.color = color;
      this.size = size;
   }

   private Name name;

   private Color color;

   private Size size;

   public Name getName() {
      return name;
   }

   public void setName(Name name) {
      this.name = name;
   }

   public Color getColor() {
      return color;
   }

   public void setColor(Color color) {
      this.color = color;
   }

   public Size getSize() {
      return size;
   }

   public void setSize(Size size) {
      this.size = size;
   }

   @Override
   public String toString() {
      return "Product [name=" + name + ", color=" + color + ", size=" + size + "]";
   }

}
