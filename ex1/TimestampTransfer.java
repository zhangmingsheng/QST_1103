package No1;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 题目要求：
 * 0. 在个人仓库下，创建分支yourname_ex1
 * 1. 在个人分支下，修改Answers.md文件，里面填入当输入为'2016-11-11 11:11:11'时，输出的值是多少
 * 2. 对代码进行注释，说明每行代码的作用，把代码提交到个人分支下
 * 3. 创建pull request，与主仓库的master分支对比
 */
public class TimestampTransfer {
	@SuppressWarnings("resource")
	//main函数
	public static void main(String[] args){
		//获得控制台输入数据
		Scanner scanner = new Scanner(System.in);
		//定义一个输入流时间格式化对象
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//定义一个输出流的时间格式化对象
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//判断scanner.hasNext()，为true，循环
		while (scanner.hasNext()){
			//读取输入字符串，并定义为String类型
			String line = scanner.nextLine();
			//定义Data类的lineDate对象
			Date lineDate = null;
			//定义long类型的对象
			long lineTimestamp;
			//捕获异常
			try {
				//将line转换成Date类型
				lineDate = inputFormat.parse(line);
				//将时间转换为时间戳
				lineTimestamp = lineDate.getTime();
				//输出时间和时间戳
				System.out.println(outputFormat.format(lineDate) + " to " + lineTimestamp);
			} catch (ParseException e) {
				//异常处理
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
