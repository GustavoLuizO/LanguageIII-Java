package PACKGE_BEE;
import java.util.Scanner;
public class beecrowd1168_led {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try { 
			String sAmountLinesLeds = input.nextLine();
			int amountLinesLeds = Integer.valueOf(sAmountLinesLeds);
			for (int i = 0; i < amountLinesLeds; i++)
			{
				int soma = 0;
				String numLedsShow = input.nextLine();
				int lenghtLedsShow = numLedsShow.length();
				char[] charNumLedsShow = numLedsShow.toCharArray();    
				for (int j = 0; j < lenghtLedsShow; j++)
				{
					char ctr = charNumLedsShow[j];
					if (ctr == '1') soma += 2;
					if (ctr == '2' || ctr == '3' || ctr == '5') soma += 5;
					if (ctr == '4') soma += 4;
					if (ctr == '6' || ctr == '9' || ctr == '0') soma += 6;
					if (ctr == '7') soma += 3;
					if (ctr == '8') soma += 7;
				}
				System.out.println(soma + " Leds");	
			}
		}
		finally {
			input.close();
		}
	}
}
