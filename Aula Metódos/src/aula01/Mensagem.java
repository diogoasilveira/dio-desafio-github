package aula01;

import java.util.Calendar;

public class Mensagem {
	static Calendar rightNow = Calendar.getInstance();
	static int hour = rightNow.get(Calendar.HOUR_OF_DAY);
	
	public static void mensagem() {
		if(hour > 5 && hour < 12) {
			System.out.print("Bom dia!\n");
		}
		else if(hour > 12 && hour < 19) {
			System.out.print("Boa tarde!\n");
		}
		else {
			System.out.print("Boa noite!\n");
		}
	}
}
