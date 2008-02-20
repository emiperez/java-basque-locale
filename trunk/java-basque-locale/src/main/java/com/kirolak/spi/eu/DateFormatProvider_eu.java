package com.kirolak.spi.eu;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Locale;

public class DateFormatProvider_eu extends DateFormatProvider {
	private Locale basque = new Locale("eu");
	
	private String getDateStringFormat(int style)
	{
		switch (style) {
			case DateFormat.SHORT:
				return "MM/dd";
			case DateFormat.MEDIUM:
				return "yyyy/MM/dd";
			case DateFormat.LONG:
				return "yyyy'ko' MMMM'ren' d'a'";
			case DateFormat.FULL:
				return "EEEE, yyyy'ko' MMMM'ren' d'a'";
			default:
				return "yyyy/MM/dd";
		} 
	}
	
	private String getTimeStringFormat(int style)
	{
		switch (style) {
			case DateFormat.SHORT:
				return "HH:mm";
			case DateFormat.MEDIUM:
				return "HH:mm";
			case DateFormat.LONG:
				return "HH:mm:ss";
			case DateFormat.FULL:
				return "HH:mm:ss";
			default:
				return "HH:mm";
		} 
	}
	
	private DateFormat getDateFormat(String format)
	{
		SimpleDateFormat dateformat = new SimpleDateFormat(format);
		DateFormatSymbols symbols = new DateFormatSymbols();
        String[] newMonths = {"urtarrila", "otsaila", "martxoa", "apirila", "maiatza", "ekaina", "uztaila", "abuztua", "iraila","urria", "azaroa", "abendua"};
        String[] newShortMonths = {"urt", "ots", "mar", "api", "mai", "eka", "uzt", "abu", "ira","urr", "aza", "abe"};
        String[] newShortWeekdays = {"leh", "art", "azk", "oeg", "oir", "lar", "iga"};
        String[] newWeekdays = {"astelehena", "asteartea", "asteazkena", "osteguna", "ostirala", "larunbata", "igandea"};
        symbols.setMonths(newMonths);
                    
        symbols.setShortMonths(newShortMonths);
        symbols.setShortWeekdays(newShortWeekdays);
        symbols.setWeekdays(newWeekdays);
        dateformat.setDateFormatSymbols(symbols);
		return dateformat;
	}
	

	public DateFormat getDateInstance(int style, Locale locale) {
		if (locale.getLanguage().equals(basque.getLanguage())) {
			return getDateFormat(getDateStringFormat(style));            
        }
        return null;
	}


	public DateFormat getDateTimeInstance(int dateStyle, int timeStyle,
			Locale locale) {
		if (locale.getLanguage().equals(basque.getLanguage()))
		{
			return getDateFormat(getDateStringFormat(dateStyle)+" "+getTimeStringFormat(timeStyle));
		}
		return null;
	}


	public DateFormat getTimeInstance(int style, Locale locale) {
		if (locale.getLanguage().equals(basque.getLanguage())) {
			return getDateFormat(getTimeStringFormat(style));
            
        }
        return null;
	}


	public Locale[] getAvailableLocales() {
		return new Locale[] {basque};
	}

}
