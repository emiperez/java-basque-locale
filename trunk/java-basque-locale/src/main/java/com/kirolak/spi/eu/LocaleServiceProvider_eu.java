package com.kirolak.spi.eu;

import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class LocaleServiceProvider_eu extends LocaleServiceProvider {

	private Locale basque = new Locale("eu","ES");
	
	public Locale[] getAvailableLocales() {
		// TODO Auto-generated method stub
		return new Locale[] {basque};
	}

}
