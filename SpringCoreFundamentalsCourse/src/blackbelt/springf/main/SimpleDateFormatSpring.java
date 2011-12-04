package blackbelt.springf.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleDateFormatSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SimpleDateFormat sdf = (SimpleDateFormat) ac.getBean("euDateFormat");
		String formattedDate = sdf.format(new Date());
		
		System.out.print("formattedDate: " + formattedDate);
		
	}

}
