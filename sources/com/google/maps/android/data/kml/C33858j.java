package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.C30579d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.maps.android.data.kml.j */
public class C33858j {

    /* renamed from: g */
    public static final String f82108g = "Style";

    /* renamed from: h */
    public static final String f82109h = "StyleMap";

    /* renamed from: i */
    public static final String f82110i = "Placemark";

    /* renamed from: j */
    public static final String f82111j = "GroundOverlay";

    /* renamed from: k */
    public static final String f82112k = "Folder|Document";

    /* renamed from: l */
    public static final String f82113l = "altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|NetworkLink|NetworkLinkControl|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when";

    /* renamed from: a */
    public final XmlPullParser f82114a;

    /* renamed from: b */
    public final HashMap<C33859k, Object> f82115b = new HashMap<>();

    /* renamed from: c */
    public final ArrayList<C33849b> f82116c = new ArrayList<>();

    /* renamed from: d */
    public final HashMap<String, C33865o> f82117d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, String> f82118e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<C33853e, C30579d> f82119f = new HashMap<>();

    public C33858j(XmlPullParser xmlPullParser) {
        this.f82114a = xmlPullParser;
    }

    /* renamed from: g */
    public static void m136286g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public ArrayList<C33849b> mo98472a() {
        return this.f82116c;
    }

    /* renamed from: b */
    public HashMap<C33853e, C30579d> mo98473b() {
        return this.f82119f;
    }

    /* renamed from: c */
    public HashMap<C33859k, Object> mo98474c() {
        return this.f82115b;
    }

    /* renamed from: d */
    public HashMap<String, String> mo98475d() {
        return this.f82118e;
    }

    /* renamed from: e */
    public HashMap<String, C33865o> mo98476e() {
        return this.f82117d;
    }

    /* renamed from: f */
    public void mo98477f() throws XmlPullParserException, IOException {
        int eventType = this.f82114a.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                if (this.f82114a.getName().matches(f82113l)) {
                    m136286g(this.f82114a);
                }
                if (this.f82114a.getName().matches("Folder|Document")) {
                    this.f82116c.add(C33850c.m136242b(this.f82114a));
                }
                if (this.f82114a.getName().equals("Style")) {
                    C33865o e = C33866p.m136390e(this.f82114a);
                    this.f82117d.put(e.mo98545t(), e);
                }
                if (this.f82114a.getName().equals("StyleMap")) {
                    this.f82118e.putAll(C33866p.m136391f(this.f82114a));
                }
                if (this.f82114a.getName().equals("Placemark")) {
                    this.f82115b.put(C33851d.m136257k(this.f82114a), (Object) null);
                }
                if (this.f82114a.getName().equals("GroundOverlay")) {
                    this.f82119f.put(C33851d.m136252f(this.f82114a), (Object) null);
                }
            }
            eventType = this.f82114a.next();
        }
        this.f82117d.put((Object) null, new C33865o());
    }
}
