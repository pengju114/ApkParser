package apk.parser.parser;

import apk.parser.struct.xml.XmlNamespaceEndTag;
import apk.parser.struct.xml.XmlCData;
import apk.parser.struct.xml.XmlNodeStartTag;
import apk.parser.struct.xml.XmlNodeEndTag;
import apk.parser.struct.xml.XmlNamespaceStartTag;

/**
 * callback interface for parse binary xml file.
 *
 * @author dongliu
 */
public interface XmlStreamer {

    void onStartTag(XmlNodeStartTag xmlNodeStartTag);

    void onEndTag(XmlNodeEndTag xmlNodeEndTag);

    void onCData(XmlCData xmlCData);

    void onNamespaceStart(XmlNamespaceStartTag tag);

    void onNamespaceEnd(XmlNamespaceEndTag tag);
}
