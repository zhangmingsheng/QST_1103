package No4;

import java.util.Scanner;

public class MapperOfIPFilter {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] str = null;
			str = line.split(" ");
			String st = str[3].substring(1,str[3].length());
			if (str.length > 6) {
				System.out.println(str[0] + "\t"+st);
			}
		}
	}
}
