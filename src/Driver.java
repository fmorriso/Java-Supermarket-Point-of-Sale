
public class Driver
{

	public static void main(String[] args)
	{
		System.out.format("java version: %s%n", System.getProperty("java.version"));

		Cart c1 = new Cart("A001");
		System.out.println(c1);

		POSline line1 = new POSline("Line1" ,10);
		line1.joinLine(c1);
		System.out.println(line1);

		Cart c2 = new Cart("A002");
		line1.joinLine(c2);

		Cart c3 = new Cart("A003");
		line1.joinLine(c3);

		System.out.println(line1);

		line1.leaveLine(0);
		System.out.println(line1);
	}

}
