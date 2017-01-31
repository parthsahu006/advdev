package com.hotel.core.development;

import org.apache.felix.scr.annotations.Reference;
import org.osgi.service.component.ComponentContext;

public class NonOsgiServiceImpl implements NonOsgiService {


	@Override
	public String show() {
		return "hello";
		
	}

}
