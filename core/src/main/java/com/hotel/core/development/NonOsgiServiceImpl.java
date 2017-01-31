package com.hotel.core.development;

import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentContext;


public class NonOsgiServiceImpl implements NonOsgiService {


	@Override
	public String show() {
		return "hello";
		
	}
	
	@Override
	public ServiceReference referenceReturning(ComponentContext context1) {
		return context1.getServiceReference();
		
	}
}
