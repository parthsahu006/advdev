package com.hotel.core.development;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.service.component.ComponentContext;


@Component(metatype=true,label="MyFirstOsgiComponent",description = "Simple demo for cron-job like task with properties")
@Service(value=MyFirstOsgiComponent.class)
@Property(label="tick yes or no:",name="osgi.property", boolValue=false,
description = "Whether or not to schedule this task concurrently")
public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {

	ComponentContext context;
	
	@Override
	public String checkBoxStatus() {
		if(context.getProperties().get("osgi.property").toString().equalsIgnoreCase("true"))
		{
			return "the checkbox is checked!!";
		}
		return "the checkbox is not checked!!";
	}
	
	@Activate
	public void activatemethod(ComponentContext context1)
	{
		context=context1;
	}
	

}
