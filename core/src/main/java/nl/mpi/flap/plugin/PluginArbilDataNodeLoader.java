/**
 * Copyright (C) 2012 Max Planck Institute for Psycholinguistics
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 */
package nl.mpi.flap.plugin;

import nl.mpi.flap.model.PluginDataNode;
import java.net.URI;

/**
 * Document : PluginArbilDataNodeLoader <br> Created on Sep 10, 2012, 5:59:04 PM
 * <br>
 *
 * @author Peter Withers <br>
 */
public interface PluginArbilDataNodeLoader {

    public PluginDataNode getPluginArbilDataNode(Object registeringObject, URI localUri);

    public URI getNodeURI(PluginDataNode dataNode) throws WrongNodeTypeException;

    public boolean isNodeLoading(PluginDataNode dataNode);
}
