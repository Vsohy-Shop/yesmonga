package com.google.maps.android.data.kml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.maps.android.data.kml.c */
public class C33850c {

    /* renamed from: a */
    public static final String f82082a = "name|description|visibility|open|address|phoneNumber";

    /* renamed from: b */
    public static final String f82083b = "Folder|Document";

    /* renamed from: c */
    public static final String f82084c = "Placemark";

    /* renamed from: d */
    public static final String f82085d = "Style";

    /* renamed from: e */
    public static final String f82086e = "StyleMap";

    /* renamed from: f */
    public static final String f82087f = "ExtendedData";

    /* renamed from: g */
    public static final String f82088g = "GroundOverlay";

    /* renamed from: h */
    public static final String f82089h = "altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when";

    /* renamed from: a */
    public static C33849b m136241a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        String name = xmlPullParser.getName();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        if (xmlPullParser.getAttributeValue((String) null, "id") != null) {
            str = xmlPullParser.getAttributeValue((String) null, "id");
        } else {
            str = null;
        }
        xmlPullParser.next();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(name)) {
                return new C33849b(hashMap, hashMap2, hashMap3, hashMap4, arrayList, hashMap5, str);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches(f82089h)) {
                    C33858j.m136286g(xmlPullParser);
                } else if (xmlPullParser.getName().matches("Folder|Document")) {
                    arrayList.add(m136241a(xmlPullParser));
                } else if (xmlPullParser.getName().matches(f82082a)) {
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("StyleMap")) {
                    m136245e(xmlPullParser, hashMap4);
                } else if (xmlPullParser.getName().equals("Style")) {
                    m136244d(xmlPullParser, hashMap2);
                } else if (xmlPullParser.getName().equals("Placemark")) {
                    m136243c(xmlPullParser, hashMap3);
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    m136246f(xmlPullParser, hashMap);
                } else if (xmlPullParser.getName().equals("GroundOverlay")) {
                    hashMap5.put(C33851d.m136252f(xmlPullParser), (Object) null);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: b */
    public static C33849b m136242b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return m136241a(xmlPullParser);
    }

    /* renamed from: c */
    public static void m136243c(XmlPullParser xmlPullParser, HashMap<C33859k, Object> hashMap) throws XmlPullParserException, IOException {
        hashMap.put(C33851d.m136257k(xmlPullParser), (Object) null);
    }

    /* renamed from: d */
    public static void m136244d(XmlPullParser xmlPullParser, HashMap<String, C33865o> hashMap) throws XmlPullParserException, IOException {
        if (xmlPullParser.getAttributeValue((String) null, "id") != null) {
            C33865o e = C33866p.m136390e(xmlPullParser);
            hashMap.put(e.mo98545t(), e);
        }
    }

    /* renamed from: e */
    public static void m136245e(XmlPullParser xmlPullParser, HashMap<String, String> hashMap) throws XmlPullParserException, IOException {
        hashMap.putAll(C33866p.m136391f(xmlPullParser));
    }

    /* renamed from: f */
    public static void m136246f(XmlPullParser xmlPullParser, HashMap<String, String> hashMap) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        String str = null;
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("ExtendedData")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("Data")) {
                        str = xmlPullParser.getAttributeValue((String) null, "name");
                    } else if (xmlPullParser.getName().equals("value") && str != null) {
                        hashMap.put(str, xmlPullParser.nextText());
                        str = null;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }
}
