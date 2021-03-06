// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._Repository5Soap_QueryMergeCandidates;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _Repository5Soap_QueryMergeCandidates
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String workspaceOwner;
    protected _ItemSpec source;
    protected _ItemSpec target;
    protected int options;
    protected int maxClientPathLength;

    public _Repository5Soap_QueryMergeCandidates()
    {
        super();
    }

    public _Repository5Soap_QueryMergeCandidates(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec source,
        final _ItemSpec target,
        final int options,
        final int maxClientPathLength)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setWorkspaceOwner(workspaceOwner);
        setSource(source);
        setTarget(target);
        setOptions(options);
        setMaxClientPathLength(maxClientPathLength);
    }

    public String getWorkspaceName()
    {
        return this.workspaceName;
    }

    public void setWorkspaceName(String value)
    {
        this.workspaceName = value;
    }

    public String getWorkspaceOwner()
    {
        return this.workspaceOwner;
    }

    public void setWorkspaceOwner(String value)
    {
        this.workspaceOwner = value;
    }

    public _ItemSpec getSource()
    {
        return this.source;
    }

    public void setSource(_ItemSpec value)
    {
        this.source = value;
    }

    public _ItemSpec getTarget()
    {
        return this.target;
    }

    public void setTarget(_ItemSpec value)
    {
        this.target = value;
    }

    public int getOptions()
    {
        return this.options;
    }

    public void setOptions(int value)
    {
        this.options = value;
    }

    public int getMaxClientPathLength()
    {
        return this.maxClientPathLength;
    }

    public void setMaxClientPathLength(int value)
    {
        this.maxClientPathLength = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceName",
            this.workspaceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceOwner",
            this.workspaceOwner);

        if (this.source != null)
        {
            this.source.writeAsElement(
                writer,
                "source");
        }

        if (this.target != null)
        {
            this.target.writeAsElement(
                writer,
                "target");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "options",
            this.options);
        XMLStreamWriterHelper.writeElement(
            writer,
            "maxClientPathLength",
            this.maxClientPathLength);

        writer.writeEndElement();
    }
}
