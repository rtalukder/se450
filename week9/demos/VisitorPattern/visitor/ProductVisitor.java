package visitor;

public class ProductVisitor implements IVisitor {

	 public int visit(Composite composite) {
        int product = composite._payload;
        for(IComposite child : composite._children) {
        	product *= child.accept(this);
        }
        return product;
    }

    public int visit(Leaf leaf) {
        return leaf._payload;
    }

}
