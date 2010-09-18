package org.opensixen.as.server;

import org.compiere.Adempiere;
import org.compiere.db.CConnection;
import org.compiere.interfaces.Status;
import org.compiere.session.ServerBean;
import org.opensixen.osgi.interfaces.IApplicationServer;

public class RemoteServerBean extends ServerBean implements IApplicationServer, Status {

	@Override
	public boolean testConnection() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getDateVersion()
	 */
	@Override
	public String getDateVersion() {
		return Adempiere.DATE_VERSION;
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getMainVersion()
	 */
	@Override
	public String getMainVersion() {
		return Adempiere.MAIN_VERSION;
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getDbType()
	 */
	@Override
	public String getDbType() {
		return CConnection.get().getType();
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getDbHost()
	 */
	@Override
	public String getDbHost() {
		return CConnection.get().getDbHost();
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getDbPort()
	 */
	@Override
	public int getDbPort() {
		return CConnection.get().getDbPort();
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getDbName()
	 */
	@Override
	public String getDbName() {
		return CConnection.get().getDbName();
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getConnectionURL()
	 */
	@Override
	public String getConnectionURL() {
		return CConnection.get().getConnectionURL();
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getDbUid()
	 */
	@Override
	public String getDbUid() {
		return CConnection.get().getDbUid();
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getDbPwd()
	 */
	@Override
	public String getDbPwd() {
		return CConnection.get().getDbPwd();
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getFwHost()
	 */
	@Override
	public String getFwHost() {
		return CConnection.get().getFwHost();
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getFwPort()
	 */
	@Override
	public int getFwPort() {
		return CConnection.get().getFwPort();
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getVersionCount()
	 */
	@Override
	public int getVersionCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.compiere.interfaces.Status#getDatabaseCount()
	 */
	@Override
	public int getDatabaseCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}
