package solid.ocp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import solid.ocp.Product.Color;
import solid.ocp.Product.Name;
import solid.ocp.Product.Size;

public class ProductProcessing {

	Product p1 = new Product(Name.WATCH, Color.RED, Size.SMALL);
	Product p2 = new Product(Name.CAR, Color.GREEN, Size.MEDIUM);
	Product p3 = new Product(Name.HOUSE, Color.BLUE, Size.BIG);
	Product p4 = new Product(Name.CAR, Color.RED, Size.MEDIUM);

	List<Product> productList = Arrays.asList(p1, p2, p3, p4);

	public List<Product> filterByColor(Color color) {
		return productList.stream().filter(product -> product.getColor().equals(color)).collect(Collectors.toList());
	}

	public List<Product> filterBySize(Size size) {
		return productList.stream().filter(product -> product.getSize().equals(size)).collect(Collectors.toList());
	}

	public List<Product> filterBySizeAndColor(Size size, Color color) {
		return productList.stream()
				.filter(product -> (product.getColor().equals(color) && product.getSize().equals(size)))
				.collect(Collectors.toList());
	}

	// OCP
	public List<Product> filterByColorSpec(ISpecification<Product> spec) {
		IFilter<Product> filter = new ProductFilter();
		return filter.filter(productList, spec);
	}
	
	public List<Product> filterBySizeSpec(ISpecification<Product> spec) {
		IFilter<Product> filter = new ProductFilter();
		return filter.filter(productList, spec);
	}

}

class ProductFilter implements IFilter<Product> {

	@Override
	public List<Product> filter(List<Product> products, ISpecification<Product> spec) {
		return products.stream().filter(p -> spec.isSatisfied(p)).collect(Collectors.toList());

	}

}

class ColorSpecification implements ISpecification<Product> {

	Color color;

	public ColorSpecification(Color color) {
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product product) {

		return product.getColor() == color;
	}

}

class SizeSpecification implements ISpecification<Product> {

	Size size;

	public SizeSpecification(Size size) {
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product product) {

		return product.getSize() == size;
	}

}

class AndSpecification implements ISpecification<Product> {

	List<ISpecification<Product>> listOfSpec;
	Product product;

	public AndSpecification(Product product, List<ISpecification<Product>> listOfSpec) {
		this.listOfSpec = listOfSpec;
		this.product = product;
	}

	@Override
	public boolean isSatisfied(Product product) {
		List<Boolean> list = new ArrayList<>();
		for (ISpecification<Product> spec : listOfSpec) {
			list.add(spec.isSatisfied(product));
		}
		return list.stream().allMatch(b -> b.booleanValue() == true);

	}

}
