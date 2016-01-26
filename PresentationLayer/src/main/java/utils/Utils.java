package utils;

import java.util.Date;

public class Utils {

	public static int getUserAge(Date birth) {
		return (int) Math.floor((new Date().getTime() - birth.getTime()) / (1000 * 60 * 60 * 24 * 365.25));
	}
}
