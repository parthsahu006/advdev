package com.hotel.core.development;



import java.util.ArrayList;

import org.apache.felix.scr.annotations.*;
import org.apache.sling.commons.osgi.PropertiesUtil;
import org.osgi.service.component.ComponentContext;


@Component(metatype=true,label="MyFirstOsgiComponent",description = "Simple demo for cron-job like task with properties")
@Service(value=MyFirstOsgiComponent.class)
@Property(label="tick yes or no:",name="osgi.property", boolValue=false,
			description = "Whether or not to schedule this task concurrently")
 


public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {

	@Property(label = "Author Gender",description = "Describe Author Gender",
			options={@PropertyOption(name="Male",value="1. Male"),@PropertyOption(name="Female",value="2. Female")},value="Male")
	private static final String AUTHOR_GENDER = "author.gender";

	@Property(value={"English", "Hindi"},unbounded=PropertyUnbounded.ARRAY,
			label="Subjects",cardinality=5,description="Example for Multi field config") 
	private static final String MULTI_FIELD = "multifield";

//	NonOsgiService nonOsgiService;
	
	ComponentContext context;
	
	@Override
	public String checkBoxStatus() {
		if(context.getProperties().get("osgi.property").toString().equalsIgnoreCase("true"))
		{
			return "the checkbox is checked!!";
		}
		return "the checkbox is not checked!!";
	}
	@Override
	public String DropDownStatus() {
		return "Option selected is:" + context.getProperties().get(AUTHOR_GENDER).toString();
		
	}
	@Override
	public String MultifieldStatus() {
		String[] str=PropertiesUtil.toStringArray(context.getProperties().get(MULTI_FIELD));
		StringBuilder result=new StringBuilder("");
		for (String string : str) {
			result.append(string+",");
			
		}
		return "Values in the multifield are:" +result.toString();
	}
	public String meth() {
		
//		return ( (NonOsgiService) context.getBundleContext().getService(new NonOsgiServiceImpl().referenceReturning(context))).show();
		return null;
	}
	
	
	@Activate
	public void activatemethod(ComponentContext context1)
	{
		context=context1;
	}
	

}
