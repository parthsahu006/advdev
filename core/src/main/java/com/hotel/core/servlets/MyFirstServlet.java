package com.hotel.core.servlets;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.framework.ServiceReference;

import com.hotel.core.development.MyFirstOsgiComponent;
import com.hotel.core.development.NonOsgiService;
import com.hotel.core.development.NonOsgiServiceImpl;

@SuppressWarnings("serial")
@SlingServlet(paths="/call/myservlet",methods="GET")
public class MyFirstServlet extends SlingAllMethodsServlet {


	@Reference
	MyFirstOsgiComponent service;
	
	
	@Override
	protected void doGet(SlingHttpServletRequest request,
			SlingHttpServletResponse response) throws ServletException,
			IOException {
		
		response.getWriter().print(service.meth());
//		response.getWriter().print(service.checkBoxStatus());
//		super.doGet(request, response);
	}
	
	
	
}
