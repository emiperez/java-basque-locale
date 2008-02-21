package com.kirolak.spi.eu;

import java.util.Locale;
import java.util.spi.LocaleNameProvider;

public class LocaleNameProvider_eu extends LocaleNameProvider {

	private Locale basque = new Locale("eu");
	
	public String getDisplayCountry(String countryCode, Locale locale) {
		return null;
	}


	public String getDisplayLanguage(String languageCode, Locale locale) {
			System.out.println(locale.getLanguage()+"-"+locale.getDisplayCountry());
			if(languageCode.equals(basque.getLanguage()) 
					&& (locale.getLanguage().equals(basque.getLanguage()) || locale.getCountry().equals("ES")))
			{
				return "Euskara";
			}
			else return locale.getDisplayLanguage();
	}

	public String getDisplayVariant(String variant, Locale locale) {
		return null;
	}


	public Locale[] getAvailableLocales() {
		return new Locale[] {basque};
	}

}
