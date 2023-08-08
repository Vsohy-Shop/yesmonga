package com.google.maps.android.data.kml;

import androidx.constraintlayout.motion.widget.C16881f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.data.C33819c;
import com.google.maps.android.data.geojson.C33834i;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p073j$.util.DesugarTimeZone;

/* renamed from: com.google.maps.android.data.kml.d */
public class C33851d {

    /* renamed from: a */
    public static final String f82090a = "Point|LineString|Polygon|MultiGeometry|Track|MultiTrack";

    /* renamed from: b */
    public static final int f82091b = 0;

    /* renamed from: c */
    public static final int f82092c = 1;

    /* renamed from: d */
    public static final int f82093d = 2;

    /* renamed from: e */
    public static final String f82094e = "name|description|drawOrder|visibility|open|address|phoneNumber";

    /* renamed from: f */
    public static final String f82095f = "outerBoundaryIs|innerBoundaryIs";

    /* renamed from: g */
    public static final String f82096g = "ExtendedData";

    /* renamed from: h */
    public static final String f82097h = "styleUrl";

    /* renamed from: i */
    public static final String f82098i = "Style";

    /* renamed from: j */
    public static final String f82099j = "north|south|east|west";

    /* renamed from: k */
    public static final String f82100k = ",";

    /* renamed from: com.google.maps.android.data.kml.d$a */
    public static class C33852a {

        /* renamed from: a */
        public final LatLng f82101a;

        /* renamed from: b */
        public final Double f82102b;

        public C33852a(LatLng latLng, Double d) {
            this.f82101a = latLng;
            this.f82102b = d;
        }
    }

    /* renamed from: a */
    public static C33852a m136247a(String str) {
        return m136248b(str, ",");
    }

    /* renamed from: b */
    public static C33852a m136248b(String str, String str2) {
        Double d;
        String[] split = str.split(str2);
        double parseDouble = Double.parseDouble(split[1]);
        double parseDouble2 = Double.parseDouble(split[0]);
        if (split.length > 2) {
            d = Double.valueOf(Double.parseDouble(split[2]));
        } else {
            d = null;
        }
        return new C33852a(new LatLng(parseDouble, parseDouble2), d);
    }

    /* renamed from: c */
    public static ArrayList<C33852a> m136249c(String str) {
        ArrayList<C33852a> arrayList = new ArrayList<>();
        for (String a : str.trim().split("(\\s+)")) {
            arrayList.add(m136247a(a));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static ArrayList<LatLng> m136250d(String str) {
        ArrayList<C33852a> c = m136249c(str);
        ArrayList<LatLng> arrayList = new ArrayList<>();
        Iterator<C33852a> it = c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f82101a);
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C33819c m136251e(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(str)) {
                return null;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Point")) {
                    return m136258l(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("LineString")) {
                    return m136254h(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("Track")) {
                    return m136260n(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("Polygon")) {
                    return m136259m(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiGeometry")) {
                    return m136255i(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiTrack")) {
                    return m136256j(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: f */
    public static C33853e m136252f(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int eventType = xmlPullParser.getEventType();
        String str = null;
        float f = 0.0f;
        int i = 1;
        float f2 = 0.0f;
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("GroundOverlay")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(C33866p.f82151c)) {
                        str = m136261o(xmlPullParser);
                    } else if (xmlPullParser.getName().equals("drawOrder")) {
                        f2 = Float.parseFloat(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals("visibility")) {
                        i = Integer.parseInt(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals("ExtendedData")) {
                        hashMap.putAll(m136263q(xmlPullParser));
                    } else if (xmlPullParser.getName().equals(C16881f.f43375i)) {
                        f = m136262p(xmlPullParser);
                    } else if (xmlPullParser.getName().matches(f82094e) || xmlPullParser.getName().equals("color")) {
                        hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().matches(f82099j)) {
                        hashMap2.put(xmlPullParser.getName(), Double.valueOf(Double.parseDouble(xmlPullParser.nextText())));
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return new C33853e(str, m136253g((Double) hashMap2.get("north"), (Double) hashMap2.get("south"), (Double) hashMap2.get("east"), (Double) hashMap2.get("west")), f2, i, hashMap, f);
            }
        }
    }

    /* renamed from: g */
    public static LatLngBounds m136253g(Double d, Double d2, Double d3, Double d4) {
        return new LatLngBounds(new LatLng(d2.doubleValue(), d4.doubleValue()), new LatLng(d.doubleValue(), d3.doubleValue()));
    }

    /* renamed from: h */
    public static C33855g m136254h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineString")) {
                return new C33855g(arrayList, arrayList2);
            }
            if (eventType == 2 && xmlPullParser.getName().equals(C33834i.f82018j)) {
                for (C33852a next : m136249c(xmlPullParser.nextText())) {
                    arrayList.add(next.f82101a);
                    Double d = next.f82102b;
                    if (d != null) {
                        arrayList2.add(d);
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: i */
    public static C33856h m136255i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals("MultiGeometry")) {
                return new C33856h(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches(f82090a)) {
                arrayList.add(m136251e(xmlPullParser, xmlPullParser.getName()));
            }
            next = xmlPullParser.next();
        }
    }

    /* renamed from: j */
    public static C33857i m136256j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals("MultiTrack")) {
                return new C33857i(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches("Track")) {
                arrayList.add(m136260n(xmlPullParser));
            }
            next = xmlPullParser.next();
        }
    }

    /* renamed from: k */
    public static C33859k m136257k(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        C33819c cVar = null;
        String str = null;
        C33865o oVar = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Placemark")) {
                return new C33859k(cVar, str, oVar, hashMap);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("styleUrl")) {
                    str = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().matches(f82090a)) {
                    cVar = m136251e(xmlPullParser, xmlPullParser.getName());
                } else if (xmlPullParser.getName().matches(f82094e)) {
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    hashMap.putAll(m136263q(xmlPullParser));
                } else if (xmlPullParser.getName().equals("Style")) {
                    oVar = C33866p.m136390e(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: l */
    public static C33860l m136258l(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        C33852a aVar = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Point")) {
                return new C33860l(aVar.f82101a, aVar.f82102b);
            }
            if (eventType == 2 && xmlPullParser.getName().equals(C33834i.f82018j)) {
                aVar = m136247a(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: m */
    public static C33861m m136259m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        boolean z = false;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Polygon")) {
                return new C33861m(arrayList, arrayList2);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches(f82095f)) {
                    z = xmlPullParser.getName().equals("outerBoundaryIs");
                } else if (xmlPullParser.getName().equals(C33834i.f82018j)) {
                    if (z) {
                        arrayList = m136250d(xmlPullParser.nextText());
                    } else {
                        arrayList2.add(m136250d(xmlPullParser.nextText()));
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: n */
    public static C33867q m136260n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Track")) {
                return new C33867q(arrayList, arrayList2, arrayList3, hashMap);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("coord")) {
                    C33852a b = m136248b(xmlPullParser.nextText(), " ");
                    arrayList.add(b.f82101a);
                    Double d = b.f82102b;
                    if (d != null) {
                        arrayList2.add(d);
                    }
                } else if (xmlPullParser.getName().equals("when")) {
                    try {
                        arrayList3.add(Long.valueOf(simpleDateFormat.parse(xmlPullParser.nextText()).getTime()));
                    } catch (ParseException e) {
                        throw new XmlPullParserException("Invalid date", xmlPullParser, e);
                    }
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    hashMap.putAll(m136263q(xmlPullParser));
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: o */
    public static String m136261o(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(C33866p.f82151c)) {
                return null;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                return xmlPullParser.nextText();
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: p */
    public static float m136262p(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return -Float.parseFloat(xmlPullParser.nextText());
    }

    /* renamed from: q */
    public static HashMap<String, String> m136263q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> hashMap = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        String str = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("ExtendedData")) {
                return hashMap;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Data")) {
                    str = xmlPullParser.getAttributeValue((String) null, "name");
                } else if (xmlPullParser.getName().equals("value") && str != null) {
                    hashMap.put(str, xmlPullParser.nextText());
                    str = null;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
