 /******* BEGIN LICENSE BLOCK *****
 * Versión: GPL 2.0/CDDL 1.0/EPL 1.0
 *
 * Los contenidos de este fichero están sujetos a la Licencia
 * Pública General de GNU versión 2.0 (la "Licencia"); no podrá
 * usar este fichero, excepto bajo las condiciones que otorga dicha 
 * Licencia y siempre de acuerdo con el contenido de la presente. 
 * Una copia completa de las condiciones de de dicha licencia,
 * traducida en castellano, deberá estar incluida con el presente
 * programa.
 * 
 * Adicionalmente, puede obtener una copia de la licencia en
 * http://www.gnu.org/licenses/gpl-2.0.html
 *
 * Este fichero es parte del programa opensiXen.
 *
 * OpensiXen es software libre: se puede usar, redistribuir, o
 * modificar; pero siempre bajo los términos de la Licencia 
 * Pública General de GNU, tal y como es publicada por la Free 
 * Software Foundation en su versión 2.0, o a su elección, en 
 * cualquier versión posterior.
 *
 * Este programa se distribuye con la esperanza de que sea útil,
 * pero SIN GARANTÍA ALGUNA; ni siquiera la garantía implícita 
 * MERCANTIL o de APTITUD PARA UN PROPÓSITO DETERMINADO. Consulte 
 * los detalles de la Licencia Pública General GNU para obtener una
 * información más detallada. 
 *
 * TODO EL CÓDIGO PUBLICADO JUNTO CON ESTE FICHERO FORMA PARTE DEL 
 * PROYECTO OPENSIXEN, PUDIENDO O NO ESTAR GOBERNADO POR ESTE MISMO
 * TIPO DE LICENCIA O UNA VARIANTE DE LA MISMA.
 *
 * El desarrollador/es inicial/es del código es
 *  FUNDESLE (Fundación para el desarrollo del Software Libre Empresarial).
 *  Indeos Consultoria S.L. - http://www.indeos.es
 *
 * Contribuyente(s):
 *  Eloy Gómez García <eloy@opensixen.org> 
 *
 * Alternativamente, y a elección del usuario, los contenidos de este
 * fichero podrán ser usados bajo los términos de la Licencia Común del
 * Desarrollo y la Distribución (CDDL) versión 1.0 o posterior; o bajo
 * los términos de la Licencia Pública Eclipse (EPL) versión 1.0. Una 
 * copia completa de las condiciones de dichas licencias, traducida en 
 * castellano, deberán de estar incluidas con el presente programa.
 * Adicionalmente, es posible obtener una copia original de dichas 
 * licencias en su versión original en
 *  http://www.opensource.org/licenses/cddl1.php  y en  
 *  http://www.opensource.org/licenses/eclipse-1.0.php
 *
 * Si el usuario desea el uso de SU versión modificada de este fichero 
 * sólo bajo los términos de una o más de las licencias, y no bajo los 
 * de las otra/s, puede indicar su decisión borrando las menciones a la/s
 * licencia/s sobrantes o no utilizadas por SU versión modificada.
 *
 * Si la presente licencia triple se mantiene íntegra, cualquier usuario 
 * puede utilizar este fichero bajo cualquiera de las tres licencias que 
 * lo gobiernan,  GPL 2.0/CDDL 1.0/EPL 1.0.
 *
 * ***** END LICENSE BLOCK ***** */

package org.opensixen.as.server;

import org.compiere.Adempiere;
import org.compiere.db.CConnection;
import org.compiere.interfaces.Status;
import org.compiere.session.ServerBean;
import org.opensixen.osgi.interfaces.IApplicationServer;

/**
 * Riena Remote server Bean
 * 
 * 
 * @author Eloy Gomez
 * Indeos Consultoria http://www.indeos.es
 *
 */
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
