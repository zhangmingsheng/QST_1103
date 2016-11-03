package No4;

import java.util.Scanner;

public class MapperOfIPFilter {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] str = null;
			//用空格把输入数据分割开
			str = line.split(" ");
			//去掉时间前面的“[”
			String st = str[3].substring(1,str[3].length());
			if (str.length > 6) {
				System.out.println(str[0] + "\t"+st);
			}
		}
	}
}
