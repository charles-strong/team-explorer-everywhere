// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._CatalogResource;
import ms.ws._CatalogServiceReference;
import ms.ws._KeyValueOfStringString;
import ms.ws._LocationMapping;
import ms.ws._ServiceDefinition;

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
public class _CatalogResource
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String identifier;
    protected String displayName;
    protected String resourceTypeIdentifier;
    protected String tempCorrelationId;
    protected int ctype;
    protected boolean matchedQuery;

    // Elements
    protected String description;
    protected _CatalogServiceReference[] catalogServiceReferences;
    protected _KeyValueOfStringString[] properties;
    protected String[] nodeReferencePaths;

    public _CatalogResource()
    {
        super();
    }

    public _CatalogResource(
        final String identifier,
        final String displayName,
        final String resourceTypeIdentifier,
        final String tempCorrelationId,
        final int ctype,
        final boolean matchedQuery,
        final String description,
        final _CatalogServiceReference[] catalogServiceReferences,
        final _KeyValueOfStringString[] properties,
        final String[] nodeReferencePaths)
    {
        // TODO : Call super() instead of setting all fields directly?
        setIdentifier(identifier);
        setDisplayName(displayName);
        setResourceTypeIdentifier(resourceTypeIdentifier);
        setTempCorrelationId(tempCorrelationId);
        setCtype(ctype);
        setMatchedQuery(matchedQuery);
        setDescription(description);
        setCatalogServiceReferences(catalogServiceReferences);
        setProperties(properties);
        setNodeReferencePaths(nodeReferencePaths);
    }

    public String getIdentifier()
    {
        return this.identifier;
    }

    public void setIdentifier(final String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'Identifier' is a required attribute, its value cannot be null");
        }

        this.identifier = value;
    }

    public String getDisplayName()
    {
        return this.displayName;
    }

    public void setDisplayName(final String value)
    {
        this.displayName = value;
    }

    public String getResourceTypeIdentifier()
    {
        return this.resourceTypeIdentifier;
    }

    public void setResourceTypeIdentifier(final String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException(
                    "'ResourceTypeIdentifier' is a required attribute, its value cannot be null");
        }

        this.resourceTypeIdentifier = value;
    }

    public String getTempCorrelationId()
    {
        return this.tempCorrelationId;
    }

    public void setTempCorrelationId(final String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'TempCorrelationId' is a required attribute, its value cannot be null");
        }

        this.tempCorrelationId = value;
    }

    public int getCtype()
    {
        return this.ctype;
    }

    public void setCtype(final int value)
    {
        this.ctype = value;
    }

    public boolean isMatchedQuery()
    {
        return this.matchedQuery;
    }

    public void setMatchedQuery(final boolean value)
    {
        this.matchedQuery = value;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String value)
    {
        this.description = value;
    }

    public _CatalogServiceReference[] getCatalogServiceReferences()
    {
        return this.catalogServiceReferences;
    }

    public void setCatalogServiceReferences(_CatalogServiceReference[] value)
    {
        this.catalogServiceReferences = value;
    }

    public _KeyValueOfStringString[] getProperties()
    {
        return this.properties;
    }

    public void setProperties(_KeyValueOfStringString[] value)
    {
        this.properties = value;
    }

    public String[] getNodeReferencePaths()
    {
        return this.nodeReferencePaths;
    }

    public void setNodeReferencePaths(String[] value)
    {
        this.nodeReferencePaths = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Identifier",
            this.identifier);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "DisplayName",
            this.displayName);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ResourceTypeIdentifier",
            this.resourceTypeIdentifier);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "TempCorrelationId",
            this.tempCorrelationId);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ctype",
            this.ctype);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "MatchedQuery",
            this.matchedQuery);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "Description",
            this.description);

        if (this.catalogServiceReferences != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("CatalogServiceReferences");

            for (int iterator0 = 0; iterator0 < this.catalogServiceReferences.length; iterator0++)
            {
                this.catalogServiceReferences[iterator0].writeAsElement(
                    writer,
                    "CatalogServiceReference");
            }

            writer.writeEndElement();
        }

        if (this.properties != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Properties");

            for (int iterator0 = 0; iterator0 < this.properties.length; iterator0++)
            {
                this.properties[iterator0].writeAsElement(
                    writer,
                    "KeyValueOfStringString");
            }

            writer.writeEndElement();
        }

        if (this.nodeReferencePaths != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("NodeReferencePaths");

            for (int iterator0 = 0; iterator0 < this.nodeReferencePaths.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.nodeReferencePaths[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("Identifier"))
            {
                this.identifier = attributeValue;
            }
            else if (localName.equalsIgnoreCase("DisplayName"))
            {
                this.displayName = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ResourceTypeIdentifier"))
            {
                this.resourceTypeIdentifier = attributeValue;
            }
            else if (localName.equalsIgnoreCase("TempCorrelationId"))
            {
                this.tempCorrelationId = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ctype"))
            {
                this.ctype = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("MatchedQuery"))
            {
                this.matchedQuery = XMLConvert.toBoolean(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("Description"))
                {
                    this.description = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("CatalogServiceReferences"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _CatalogServiceReference complexObject0 = new _CatalogServiceReference();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.catalogServiceReferences = (_CatalogServiceReference[]) list0.toArray(
                                new _CatalogServiceReference[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Properties"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _KeyValueOfStringString complexObject0 = new _KeyValueOfStringString();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.properties = (_KeyValueOfStringString[]) list0.toArray(
                            new _KeyValueOfStringString[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("NodeReferencePaths"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            list0.add(reader.getElementText());
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.nodeReferencePaths = (String[]) list0.toArray(new String[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
