Example of use of Java Basque Locale

```
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class BasqueLocaleTest {
	
	public static void main(String[] args) {
		Locale basqueLocale = new Locale("eu","ES");
		Locale englishLocale = new Locale("en","GB");
		
		//Country Names
		System.out.println("Spain in English: " + basqueLocale.getDisplayCountry(englishLocale));
		System.out.println("United Kingdom in Basque: " + englishLocale.getDisplayCountry(basqueLocale));
		System.out.println("Spain in Basque: " + basqueLocale.getDisplayCountry(basqueLocale));
		
		//Language Names
		System.out.println("Basque in English: " + basqueLocale.getDisplayLanguage(englishLocale));
		System.out.println("English in Basque: " + englishLocale.getDisplayLanguage(basqueLocale));
		System.out.println("Basque in Basque: " + basqueLocale.getDisplayLanguage(basqueLocale));
		
		//Time Format
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("MMMM", basqueLocale);
		System.out.println("Month: "+formatter.format(cal.getTime()));
		System.out.println("Today SHORT in Basque: "+DateFormat.getTimeInstance(DateFormat.SHORT, basqueLocale).format(cal.getTime()));
		System.out.println("Today SHORT in English: "+DateFormat.getTimeInstance(DateFormat.SHORT, englishLocale).format(cal.getTime()));
		System.out.println("Today MEDIUM in Basque: "+DateFormat.getTimeInstance(DateFormat.MEDIUM, basqueLocale).format(cal.getTime()));
		System.out.println("Today MEDIUM in English: "+DateFormat.getTimeInstance(DateFormat.MEDIUM, englishLocale).format(cal.getTime()));
		System.out.println("Today LONG in Basque: "+DateFormat.getTimeInstance(DateFormat.LONG, basqueLocale).format(cal.getTime()));
		System.out.println("Today LONG in English: "+DateFormat.getTimeInstance(DateFormat.LONG, englishLocale).format(cal.getTime()));
		System.out.println("Today FULL in Basque: "+DateFormat.getTimeInstance(DateFormat.FULL, basqueLocale).format(cal.getTime()));
		System.out.println("Today FULL in English: "+DateFormat.getTimeInstance(DateFormat.FULL, englishLocale).format(cal.getTime()));
		
		//Date Format
		System.out.println("Month: "+formatter.format(cal.getTime()));
		System.out.println("Today SHORT in Basque: "+DateFormat.getDateInstance(DateFormat.SHORT, basqueLocale).format(cal.getTime()));
		System.out.println("Today SHORT in English: "+DateFormat.getDateInstance(DateFormat.SHORT, englishLocale).format(cal.getTime()));
		System.out.println("Today MEDIUM in Basque: "+DateFormat.getDateInstance(DateFormat.MEDIUM, basqueLocale).format(cal.getTime()));
		System.out.println("Today MEDIUM in English: "+DateFormat.getDateInstance(DateFormat.MEDIUM, englishLocale).format(cal.getTime()));
		System.out.println("Today LONG in Basque: "+DateFormat.getDateInstance(DateFormat.LONG, basqueLocale).format(cal.getTime()));
		System.out.println("Today LONG in English: "+DateFormat.getDateInstance(DateFormat.LONG, englishLocale).format(cal.getTime()));
		System.out.println("Today FULL in Basque: "+DateFormat.getDateInstance(DateFormat.FULL, basqueLocale).format(cal.getTime()));
		System.out.println("Today FULL in English: "+DateFormat.getDateInstance(DateFormat.FULL, englishLocale).format(cal.getTime()));

		System.out.println("NEXT WEEK:");
		for(int n= 0; n < 7; n++)
		{
			cal.add(Calendar.DAY_OF_YEAR, 1);
			System.out.println(DateFormat.getDateInstance(DateFormat.FULL, basqueLocale).format(cal.getTime()));
		}

		System.out.println("NEXT MONTHS:");
		for(int n= 0; n < 12; n++)
		{
			cal.add(Calendar.MONTH, 1);
			System.out.println(DateFormat.getDateInstance(DateFormat.FULL, basqueLocale).format(cal.getTime()));
		}
	}
}
```

Result:
```
Spain in English: Spain
United Kingdom in Basque: Erresuma Batua
Spain in Basque: Espainia
Basque in English: Basque
English in Basque: Ingelesa
Basque in Basque: Euskara
Month: apirila
Today SHORT in Basque: 07:57
Today SHORT in English: 07:57
Today MEDIUM in Basque: 07:57:49
Today MEDIUM in English: 07:57:49
Today LONG in Basque: 07:57:49 CEST
Today LONG in English: 07:57:49 CEST
Today FULL in Basque: 07:57:49 CEST
Today FULL in English: 07:57:49 o'clock CEST
Month: apirila
Today SHORT in Basque: 08/04/06
Today SHORT in English: 06/04/08
Today MEDIUM in Basque: 2008-api-06
Today MEDIUM in English: 06-Apr-2008
Today LONG in Basque: 2008ko apirilaren 6a
Today LONG in English: 06 April 2008
Today FULL in Basque: igandea, 2008ko apirilaren 6a
Today FULL in English: Sunday, 6 April 2008
NEXT WEEK:
astelehena, 2008ko apirilaren 7a
asteartea, 2008ko apirilaren 8a
asteazkena, 2008ko apirilaren 9a
osteguna, 2008ko apirilaren 10a
ostirala, 2008ko apirilaren 11a
larunbata, 2008ko apirilaren 12a
igandea, 2008ko apirilaren 13a
NEXT MONTHS:
asteartea, 2008ko maiatzaren 13a
ostirala, 2008ko ekainaren 13a
igandea, 2008ko uztailaren 13a
asteazkena, 2008ko abuztuaren 13a
larunbata, 2008ko irailaren 13a
astelehena, 2008ko urriaren 13a
osteguna, 2008ko azaroaren 13a
larunbata, 2008ko abenduaren 13a
asteartea, 2009ko urtarrilaren 13a
ostirala, 2009ko otsailaren 13a
ostirala, 2009ko martxoaren 13a
astelehena, 2009ko apirilaren 13a
```