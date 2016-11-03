package No4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class ReducerOfIPFilter {
	public static void main(String[] args) throws ParseException {
		Locale locale = Locale.US;
		SimpleDateFormat inputFormat = new SimpleDateFormat(
				"dd/MMM/yyyy:HH:mm:ss", locale);
		SimpleDateFormat regularFormat = new SimpleDateFormat(
				"yyyy-MM-dd-HH:mm:ss");
		//hashSet作用是去重
		HashSet<Object> hs = new HashSet<Object>();
		Scanner scanner = new Scanner(System.in);
		String[] str = null;
		//第一个参数是beginTime
		Date beginDate = regularFormat.parse(args[0]);
		////第一个参数是endTime
		Date endDate = regularFormat.parse(args[1]);
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			str = line.split("\t");
			Date lineDate = inputFormat.parse(str[1]);
			//判断时间是否在[beginTime, endTime]内
			if (lineDate.compareTo(endDate) <= 0) {
				if (lineDate.compareTo(beginDate) >= 0) {
					//在里面，添加到hs里
					hs.add(str[0]);
				}
			}
		}
		System.out.println("Between " + args[0] + " and " + args[1]
				+ " IP number: " + hs.size());
	}
}

