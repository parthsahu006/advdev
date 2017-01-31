package com.hotel.core.development;

import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentContext;


public interface NonOsgiService {

	
	public String show();
	public ServiceReference referenceReturning(ComponentContext context);
}
