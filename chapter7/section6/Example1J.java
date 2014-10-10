package chapter7.section6;

public class Example1J {
	public static void main(final String[] args) {
		int i = 0;
		boolean foundIt = false;
		while (i < args.length) {
			if (args[i].startsWith("-")) {
				i++;
				continue;
			}

			if (args[i].endsWith(".scala")) {
				foundIt = true;
				break;
			}
			i++;
		}
		System.out.println(foundIt);
	}
}
