/*
 * Copyright (C) 2012 Max Planck Institute for Psycholinguistics
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package nl.mpi.flap.model;

/**
 * Created on : Feb 12, 2013, 4:13:31 PM
 *
 * @author Peter Withers <peter.withers@mpi.nl>
 */
public interface PluginDataNodeType {

    public enum FormatType {

        xml,
        imdi_corpus,
        imdi_catalogue,
        imdi_session,
        imdi_info,
        cmdi,
        resource_annotation,
        resource_audio,
        resource_lexical,
        resource_other,
        resource_video,
        container, subnode,
        directory, file,
        unkown;
    }

    String getID();

    String getMimeType();

    FormatType getFormat();
}
