package com.javaworld.sample.osgi.web.webapp;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
	ServiceTracker httpServiceTracker;
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
		httpServiceTracker = new HttpServiceTracker(context);
		httpServiceTracker.open();
	}
	
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!Hi");
		httpServiceTracker.close();
		httpServiceTracker = null;
	}
}
