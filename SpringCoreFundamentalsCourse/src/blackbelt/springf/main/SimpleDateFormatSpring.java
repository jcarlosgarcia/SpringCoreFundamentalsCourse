package blackbelt.springf.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = sdf.format(new Date());
		
		System.out.print("formattedDate: " + formattedDate);
		
	}

}
