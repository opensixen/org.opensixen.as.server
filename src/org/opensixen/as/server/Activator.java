package org.opensixen.as.server;

import java.util.Hashtable;


import org.compiere.Adempiere;
import org.compiere.server.AdempiereServerMgr;
import org.opensixen.osgi.interfaces.IApplicationServer;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	private ServiceRegistration serviceRegistration;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		Hashtable<String, String> properties = new Hashtable<String, String>();
		properties.put("riena.remote", "true");
        properties.put("riena.remote.protocol", "hessian");
        properties.put("riena.remote.path", "/" + IApplicationServer.path);
        
        RemoteServerBean server = new RemoteServerBean();
        serviceRegistration = context.registerService(IApplicationServer.class.getName(), server, properties);
        
        if (!Adempiere.startup(false))
			throw new RuntimeException("Opensixen Application Server could not start");
        
        // Start all services
        AdempiereServerMgr serverMgr = AdempiereServerMgr.get();
        serverMgr.startAll();
        
        // Setup Env
        Adempiere.startupEnvironment(false);
        
        
        
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		if (serviceRegistration != null)	{
			serviceRegistration.unregister();
			serviceRegistration = null;
		}
	}

}
