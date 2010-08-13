package org.opensixen.as.server;

import org.compiere.session.ServerBean;
import org.opensixen.osgi.interfaces.IApplicationServer;

public class RemoteServerBean extends ServerBean implements IApplicationServer{

	@Override
	public boolean testConnection() {
		return true;
	}
	
	
}
