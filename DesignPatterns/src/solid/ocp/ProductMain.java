package solid.ocp;

import solid.ocp.Product.Color;
import solid.ocp.Product.Size;

public class ProductMain {

   public static void main(String[] args) {
      ProductProcessing processing= new ProductProcessing();
      
      System.out.println(processing.filterByColor(Color.RED));
      
      System.out.println(processing.filterBySize(Size.MEDIUM));
      
      System.out.println(processing.filterBySizeAndColor(Size.MEDIUM,Color.RED));

      //OCP
      System.out.println(processing.filterByColorSpec(new ColorSpecification(Color.RED)));
      
      System.out.println(processing.filterBySizeSpec(new SizeSpecification(Size.MEDIUM)));
   }

}
