/**
 * This program prints a temporary Employment Authorization Card (EAC)
 * using ASCII art. It demonstrates basic Java variables and output formatting
 * by inserting user data into a card template.
 * @author Victor Lopez
 */
public class Main
{
	public static void main(String[] args)
	{
		//CONSTANTS SECTION
		final String TITLE_USA = "UNITED STATES OF AMERICA";
		//DECLARATION + INITIALIZATION SECTION
		String surname;
	String givenName;
	String uscisNumber;
	String category;
	String cardNumber;
	String countryOfBirth;
	String terms;
	String dateOfBirth;
	String sex;
	String validFrom;
	String cardExpires;

		//INPUT SECTION
	surname = "Lopez";
	givenName = "Victor";
	uscisNumber = "123-456-789";
	category = "C08";
	cardNumber = "A1234567890";
	countryOfBirth = "Tanzania";
	terms = "DACA APPROVED";
	dateOfBirth = "05/16/2005";
	sex = "M";
	validFrom = "01/01/2026";
	cardExpires = "01/01/2028";		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         " + TITLE_USA +"");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   o  \\  /  o   )    " + givenName + " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + uscisNumber +"       " + category + "      " + cardNumber + " ");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + countryOfBirth + " ");
		System.out.println("║   \\'-'______'-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + terms + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " + dateOfBirth + "       " + sex + "");
		System.out.println("║                       Valid From:     " + validFrom + "");
		System.out.println("║                       Card Expires:   " + cardExpires + "");
		System.out.println("║ ascii art by: VL     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}
