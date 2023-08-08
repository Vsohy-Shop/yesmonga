package com.google.maps.android.data.kml;

import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.maps.android.data.kml.p */
public class C33866p {

    /* renamed from: a */
    public static final String f82149a = "styleUrl";

    /* renamed from: b */
    public static final String f82150b = "heading";

    /* renamed from: c */
    public static final String f82151c = "Icon";

    /* renamed from: d */
    public static final String f82152d = "scale";

    /* renamed from: e */
    public static final String f82153e = "hotSpot";

    /* renamed from: f */
    public static final String f82154f = "color";

    /* renamed from: g */
    public static final String f82155g = "colorMode";

    /* renamed from: h */
    public static final String f82156h = "key";

    /* renamed from: i */
    public static final String f82157i = "normal";

    /* renamed from: j */
    public static final String f82158j = "width";

    /* renamed from: k */
    public static final String f82159k = "outline";

    /* renamed from: l */
    public static final String f82160l = "fill";

    /* renamed from: a */
    public static void m136386a(XmlPullParser xmlPullParser, C33865o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("BalloonStyle")) {
                if (eventType == 2 && xmlPullParser.getName().equals("text")) {
                    oVar.mo98531I(xmlPullParser.nextText());
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m136387b(XmlPullParser xmlPullParser, C33865o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("IconStyle")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("heading")) {
                        oVar.mo98526D(Float.parseFloat(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(f82151c)) {
                        m136393h(xmlPullParser, oVar);
                    } else if (xmlPullParser.getName().equals(f82153e)) {
                        m136392g(xmlPullParser, oVar);
                    } else if (xmlPullParser.getName().equals("scale")) {
                        oVar.mo98529G(Double.parseDouble(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals("color")) {
                        oVar.mo98533K(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(f82155g)) {
                        oVar.mo98528F(xmlPullParser.nextText());
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static void m136388c(XmlPullParser xmlPullParser, C33865o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("LineStyle")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("color")) {
                        oVar.mo98535M(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals("width")) {
                        oVar.mo98538P(Float.valueOf(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(f82155g)) {
                        oVar.mo98532J(xmlPullParser.nextText());
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public static void m136389d(XmlPullParser xmlPullParser, C33865o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("PolyStyle")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("color")) {
                        oVar.mo98525C(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(f82159k)) {
                        oVar.mo98534L(C33848a.m136223a(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(f82160l)) {
                        oVar.mo98524B(C33848a.m136223a(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(f82155g)) {
                        oVar.mo98536N(xmlPullParser.nextText());
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public static C33865o m136390e(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        C33865o oVar = new C33865o();
        m136394i(xmlPullParser.getAttributeValue((String) null, "id"), oVar);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Style")) {
                return oVar;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("IconStyle")) {
                    m136387b(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("LineStyle")) {
                    m136388c(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("PolyStyle")) {
                    m136389d(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("BalloonStyle")) {
                    m136386a(xmlPullParser, oVar);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: f */
    public static HashMap<String, String> m136391f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> hashMap = new HashMap<>();
        String str = "#" + xmlPullParser.getAttributeValue((String) null, "id");
        int eventType = xmlPullParser.getEventType();
        boolean z = false;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("StyleMap")) {
                return hashMap;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("key") && xmlPullParser.nextText().equals(f82157i)) {
                    z = true;
                } else if (xmlPullParser.getName().equals("styleUrl") && z) {
                    hashMap.put(str, xmlPullParser.nextText());
                    z = false;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: g */
    public static void m136392g(XmlPullParser xmlPullParser, C33865o oVar) throws XmlPullParserException {
        if (!xmlPullParser.isEmptyElementTag()) {
            oVar.mo98527E(Float.parseFloat(xmlPullParser.getAttributeValue((String) null, "x")), Float.parseFloat(xmlPullParser.getAttributeValue((String) null, "y")), xmlPullParser.getAttributeValue((String) null, "xunits"), xmlPullParser.getAttributeValue((String) null, "yunits"));
        }
    }

    /* renamed from: h */
    public static void m136393h(XmlPullParser xmlPullParser, C33865o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals(f82151c)) {
                if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                    oVar.mo98530H(xmlPullParser.nextText());
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public static void m136394i(String str, C33865o oVar) {
        if (str != null) {
            oVar.mo98537O("#" + str);
        }
    }
}
