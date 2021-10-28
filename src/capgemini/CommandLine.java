package capgemini;

public class CommandLine {

	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		int i1 = Integer.parseInt(a);
		int i2 = Integer.parseInt(b);
		System.out.println(i1 + i2);
	}

}
