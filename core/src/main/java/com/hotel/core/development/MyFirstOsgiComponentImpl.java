package com.hotel.core.development;



import org.apache.felix.scr.annotations.*;
import org.osgi.service.component.ComponentContext;


@Component(metatype=true,label="MyFirstOsgiComponent",description = "Simple demo for cron-job like task with properties")
@Service(value=MyFirstOsgiComponent.class)
@Properties({ 
		@Property(label="tick yes or no:",name="osgi.property", boolValue=false,
			description = "Whether or not to schedule this task concurrently"),
		@Property(label = "Author Gender",description = "Describe Author Gender",
			options={@PropertyOption(name="Male",value="1. Male"),@PropertyOption(name="Female",value="2. Female")},value="Male")
})
 


public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {


	
	NonOsgiService nonOsgiService;
	
	ComponentContext context;
	
	@Override
	public String checkBoxStatus() {
		if(context.getProperties().get("osgi.property").toString().equalsIgnoreCase("true"))
		{
			return "the checkbox is checked!!";
		}
		return "the checkbox is not checked!!";
	}
	public String meth() {
		
		return ( (NonOsgiService) context.getBundleContext().getService(new NonOsgiServiceImpl().referenceReturning(context))).show();
//		return null;
	}
	
	
	@Activate
	public void activatemethod(ComponentContext context1)
	{
		context=context1;
	}
	

}
