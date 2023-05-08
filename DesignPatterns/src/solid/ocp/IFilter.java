package solid.ocp;

import java.util.List;

/**
 * Filter list of items.
 * 
 * @author Vineesh.Chauhan
 *
 * @param <T>
 */
public interface IFilter<T> {
   
   List<T> filter(List<T> t, ISpecification<Product> spec);
   
}
