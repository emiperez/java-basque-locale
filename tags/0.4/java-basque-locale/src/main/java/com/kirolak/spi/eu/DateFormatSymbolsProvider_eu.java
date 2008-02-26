package com.kirolak.spi.eu;

/**
 * @author Emilio Perez
 * http://www.kirolak.com
 * http://www.jaiak.net
 */

import java.text.DateFormatSymbols;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Locale;

public class DateFormatSymbolsProvider_eu extends DateFormatSymbolsProvider {

	private Locale basque = new Locale("eu");

	public DateFormatSymbols getInstance(Locale locale) {
		if (locale.getLanguage().equals(basque.getLanguage())) {
            DateFormatSymbols df = new DateFormatSymbols();
            String[] newMonths = {"urtarrila", "otsaila", "martxoa", "apirila", "maiatza", "ekaina", "uztaila", "abuztua", "iraila","urria", "azaroa", "abendua"};
            String[] newShortMonths = {"urt", "ots", "mar", "api", "mai", "eka", "uzt", "abu", "ira","urr", "aza", "abe"};
            String[] newShortWeekdays = {"leh", "art", "azk", "oeg", "oir", "lar", "iga"};
            String[] newWeekdays = {"astelehena", "asteartea", "asteazkena", "osteguna", "ostirala", "larunbata", "igandea"};
            df.setMonths(newMonths);
                        
            df.setShortMonths(newShortMonths);
            df.setShortWeekdays(newShortWeekdays);
            df.setWeekdays(newWeekdays);
            return df;
        }
        return null;
	}

	public Locale[] getAvailableLocales() {
		return new Locale[] {basque};
	}

}
