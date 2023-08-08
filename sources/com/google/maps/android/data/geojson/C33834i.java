package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.data.C33819c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.maps.android.data.geojson.i */
public class C33834i {

    /* renamed from: d */
    public static final String f82012d = "GeoJsonParser";

    /* renamed from: e */
    public static final String f82013e = "Feature";

    /* renamed from: f */
    public static final String f82014f = "geometry";

    /* renamed from: g */
    public static final String f82015g = "id";

    /* renamed from: h */
    public static final String f82016h = "FeatureCollection";

    /* renamed from: i */
    public static final String f82017i = "features";

    /* renamed from: j */
    public static final String f82018j = "coordinates";

    /* renamed from: k */
    public static final String f82019k = "GeometryCollection";

    /* renamed from: l */
    public static final String f82020l = "geometries";

    /* renamed from: m */
    public static final String f82021m = "bbox";

    /* renamed from: n */
    public static final String f82022n = "properties";

    /* renamed from: o */
    public static final String f82023o = "Point";

    /* renamed from: p */
    public static final String f82024p = "MultiPoint";

    /* renamed from: q */
    public static final String f82025q = "LineString";

    /* renamed from: r */
    public static final String f82026r = "MultiLineString";

    /* renamed from: s */
    public static final String f82027s = "Polygon";

    /* renamed from: t */
    public static final String f82028t = "MultiPolygon";

    /* renamed from: a */
    public final JSONObject f82029a;

    /* renamed from: b */
    public final ArrayList<C33825a> f82030b = new ArrayList<>();

    /* renamed from: c */
    public LatLngBounds f82031c = null;

    /* renamed from: com.google.maps.android.data.geojson.i$a */
    public static class C33835a {

        /* renamed from: a */
        public final LatLng f82032a;

        /* renamed from: b */
        public final Double f82033b;

        public C33835a(LatLng latLng, Double d) {
            this.f82032a = latLng;
            this.f82033b = d;
        }
    }

    public C33834i(JSONObject jSONObject) {
        this.f82029a = jSONObject;
        mo98321r();
    }

    /* renamed from: a */
    public static C33819c m136065a(String str, JSONArray jSONArray) throws JSONException {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2116761119:
                if (str.equals(f82028t)) {
                    c = 0;
                    break;
                }
                break;
            case -1065891849:
                if (str.equals(f82024p)) {
                    c = 1;
                    break;
                }
                break;
            case -627102946:
                if (str.equals(f82026r)) {
                    c = 2;
                    break;
                }
                break;
            case 77292912:
                if (str.equals("Point")) {
                    c = 3;
                    break;
                }
                break;
            case 1267133722:
                if (str.equals("Polygon")) {
                    c = 4;
                    break;
                }
                break;
            case 1806700869:
                if (str.equals("LineString")) {
                    c = 5;
                    break;
                }
                break;
            case 1950410960:
                if (str.equals(f82019k)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return m136070f(jSONArray);
            case 1:
                return m136069e(jSONArray);
            case 2:
                return m136068d(jSONArray);
            case 3:
                return m136071g(jSONArray);
            case 4:
                return m136072h(jSONArray);
            case 5:
                return m136067c(jSONArray);
            case 6:
                return m136066b(jSONArray);
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C33826b m136066b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            C33819c s = m136079s(jSONArray.getJSONObject(i));
            if (s != null) {
                arrayList.add(s);
            }
        }
        return new C33826b(arrayList);
    }

    /* renamed from: c */
    public static C33829d m136067c(JSONArray jSONArray) throws JSONException {
        ArrayList<C33835a> n = m136076n(jSONArray);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<C33835a> it = n.iterator();
        while (it.hasNext()) {
            C33835a next = it.next();
            arrayList.add(next.f82032a);
            Double d = next.f82033b;
            if (d != null) {
                arrayList2.add(d);
            }
        }
        return new C33829d(arrayList, arrayList2);
    }

    /* renamed from: d */
    public static C33831f m136068d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m136067c(jSONArray.getJSONArray(i)));
        }
        return new C33831f(arrayList);
    }

    /* renamed from: e */
    public static C33832g m136069e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m136071g(jSONArray.getJSONArray(i)));
        }
        return new C33832g(arrayList);
    }

    /* renamed from: f */
    public static C33833h m136070f(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m136072h(jSONArray.getJSONArray(i)));
        }
        return new C33833h(arrayList);
    }

    /* renamed from: g */
    public static C33836j m136071g(JSONArray jSONArray) throws JSONException {
        C33835a m = m136075m(jSONArray);
        return new C33836j(m.f82032a, m.f82033b);
    }

    /* renamed from: h */
    public static C33838l m136072h(JSONArray jSONArray) throws JSONException {
        return new C33838l(m136077o(jSONArray));
    }

    /* renamed from: k */
    public static boolean m136073k(String str) {
        return str.matches("Point|MultiPoint|LineString|MultiLineString|Polygon|MultiPolygon|GeometryCollection");
    }

    /* renamed from: l */
    public static LatLngBounds m136074l(JSONArray jSONArray) throws JSONException {
        return new LatLngBounds(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), new LatLng(jSONArray.getDouble(3), jSONArray.getDouble(2)));
    }

    /* renamed from: m */
    public static C33835a m136075m(JSONArray jSONArray) throws JSONException {
        Double d;
        LatLng latLng = new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0));
        if (jSONArray.length() < 3) {
            d = null;
        } else {
            d = Double.valueOf(jSONArray.getDouble(2));
        }
        return new C33835a(latLng, d);
    }

    /* renamed from: n */
    public static ArrayList<C33835a> m136076n(JSONArray jSONArray) throws JSONException {
        ArrayList<C33835a> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m136075m(jSONArray.getJSONArray(i)));
        }
        return arrayList;
    }

    /* renamed from: o */
    public static ArrayList<ArrayList<LatLng>> m136077o(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            ArrayList<C33835a> n = m136076n(jSONArray.getJSONArray(i));
            ArrayList arrayList2 = new ArrayList();
            Iterator<C33835a> it = n.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().f82032a);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: p */
    public static C33825a m136078p(JSONObject jSONObject) {
        String str;
        LatLngBounds latLngBounds;
        C33819c cVar;
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            if (jSONObject.has("id")) {
                str = jSONObject.getString("id");
            } else {
                str = null;
            }
            if (jSONObject.has(f82021m)) {
                latLngBounds = m136074l(jSONObject.getJSONArray(f82021m));
            } else {
                latLngBounds = null;
            }
            if (!jSONObject.has(f82014f) || jSONObject.isNull(f82014f)) {
                cVar = null;
            } else {
                cVar = m136079s(jSONObject.getJSONObject(f82014f));
            }
            if (jSONObject.has("properties") && !jSONObject.isNull("properties")) {
                hashMap = m136081u(jSONObject.getJSONObject("properties"));
            }
            return new C33825a(cVar, str, hashMap, latLngBounds);
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Feature could not be successfully parsed ");
            sb.append(jSONObject.toString());
            return null;
        }
    }

    /* renamed from: s */
    public static C33819c m136079s(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            String string = jSONObject.getString("type");
            if (string.equals(f82019k)) {
                jSONArray = jSONObject.getJSONArray(f82020l);
            } else {
                if (m136073k(string)) {
                    jSONArray = jSONObject.getJSONArray(f82018j);
                }
                return null;
            }
            return m136065a(string, jSONArray);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: t */
    public static C33825a m136080t(JSONObject jSONObject) {
        C33819c s = m136079s(jSONObject);
        if (s != null) {
            return new C33825a(s, (String) null, new HashMap(), (LatLngBounds) null);
        }
        return null;
    }

    /* renamed from: u */
    public static HashMap<String, String> m136081u(JSONObject jSONObject) throws JSONException {
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject.isNull(next)) {
                str = null;
            } else {
                str = jSONObject.getString(next);
            }
            hashMap.put(next, str);
        }
        return hashMap;
    }

    /* renamed from: i */
    public LatLngBounds mo98318i() {
        return this.f82031c;
    }

    /* renamed from: j */
    public ArrayList<C33825a> mo98319j() {
        return this.f82030b;
    }

    /* renamed from: q */
    public final ArrayList<C33825a> mo98320q(JSONObject jSONObject) {
        ArrayList<C33825a> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("features");
            if (jSONObject.has(f82021m)) {
                this.f82031c = m136074l(jSONObject.getJSONArray(f82021m));
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2.getString("type").equals(f82013e)) {
                        C33825a p = m136078p(jSONObject2);
                        if (p != null) {
                            arrayList.add(p);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Index of Feature in Feature Collection that could not be created: ");
                            sb.append(i);
                        }
                    }
                } catch (JSONException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Index of Feature in Feature Collection that could not be created: ");
                    sb2.append(i);
                }
            }
        } catch (JSONException unused2) {
        }
        return arrayList;
    }

    /* renamed from: r */
    public final void mo98321r() {
        C33825a t;
        try {
            String string = this.f82029a.getString("type");
            if (string.equals(f82013e)) {
                C33825a p = m136078p(this.f82029a);
                if (p != null) {
                    this.f82030b.add(p);
                }
            } else if (string.equals(f82016h)) {
                this.f82030b.addAll(mo98320q(this.f82029a));
            } else if (m136073k(string) && (t = m136080t(this.f82029a)) != null) {
                this.f82030b.add(t);
            }
        } catch (JSONException unused) {
        }
    }
}
