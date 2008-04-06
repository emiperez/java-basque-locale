package com.kirolak.spi.eu;

import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.spi.LocaleNameProvider;

public class LocaleNameProvider_eu extends LocaleNameProvider {

	private Locale basque = new Locale("eu");
	Properties languages;
	Properties countries;
	
	public String getDisplayCountry(String countryCode, Locale locale) {
		if (locale.getLanguage().equals(basque.getLanguage()))
		{
			return getCountryName(countryCode);			
		}
		return null;
	}


	public String getDisplayLanguage(String languageCode, Locale locale) {
		if (locale.getLanguage().equals(basque.getLanguage()))
		{
			return getLanguage(languageCode);
			
		}
		return null;
	}

	private String getLanguage(String languageCode) {
		String returnValue = "";
		if(this.languages == null)
		{
			try
			{
				InputStream is = getClass().getResourceAsStream("languages.properties");
				this.languages = new Properties();
				this.languages.load(is);
				is.close();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		if(this.languages != null)
		{
			returnValue = this.languages.getProperty(languageCode);
		}
		if(returnValue.equals(""))
		{
			return null;
		}
		return returnValue;
	}
	
	private String getCountryName(String countryCode) {
		String returnValue = "";
		if(this.countries == null)
		{
			try
			{
				InputStream is = getClass().getResourceAsStream("countries.properties");
				this.countries = new Properties();
				this.countries.load(is);
				is.close();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		if(this.countries != null)
		{
			returnValue = this.countries.getProperty(countryCode);
		}
		if(returnValue.equals(""))
		{
			return null;
		}
		return returnValue;
	}

	public String getDisplayVariant(String variant, Locale locale) {
		return null;
	}


	public Locale[] getAvailableLocales() {
		return new Locale[] {basque};
	}

}
