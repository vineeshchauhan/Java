package solid.ocp;

/**
 * Filter an item.
 * @author Vineesh.Chauhan
 *
 * @param <T>
 */
public interface ISpecification<T> {

   public boolean isSatisfied(T t);
}
