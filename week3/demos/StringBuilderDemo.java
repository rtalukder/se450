public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append(" World");
		String s = builder.toString();
		System.out.println(s);
		builder.append("!");
		s = builder.toString();
		System.out.println(s);
	}
}