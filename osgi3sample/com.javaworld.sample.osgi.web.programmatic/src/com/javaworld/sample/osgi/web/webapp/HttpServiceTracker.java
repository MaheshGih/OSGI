package com.javaworld.sample.osgi.web.webapp;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.util.tracker.ServiceTracker;

public class HttpServiceTracker extends ServiceTracker{

	public HttpServiceTracker(BundleContext context) {
		super(context, HttpService.class.getName(), null);
	}
	public Object addingService(ServiceReference reference) {
		HttpService httpService = (HttpService) context.getService(reference);
		System.out.println();
		try {			
			httpService.registerResources("/helloworld.html", "/helloworld.html", null);
			httpService.registerServlet("/helloworld", new HelloWorldServlet(), null, null);
			System.out.println("Programatic ");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return httpService;
	}		
	
	public void removedService(ServiceReference reference, Object service) {
		HttpService httpService = (HttpService) service;
		httpService.unregister("/helloworld.html"); 
		httpService.unregister("/helloworld");
		super.removedService(reference, service);
	}

}
