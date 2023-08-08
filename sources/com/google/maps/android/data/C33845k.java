package com.google.maps.android.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.model.C30573a;
import com.google.android.gms.maps.model.C30575b;
import com.google.android.gms.maps.model.C30579d;
import com.google.android.gms.maps.model.C30587h;
import com.google.android.gms.maps.model.C30589i;
import com.google.android.gms.maps.model.C30591j;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.C33802d;
import com.google.maps.android.collections.C33791b;
import com.google.maps.android.collections.C33796d;
import com.google.maps.android.collections.C33798e;
import com.google.maps.android.collections.C33800f;
import com.google.maps.android.data.C33820d;
import com.google.maps.android.data.geojson.BiMultiMap;
import com.google.maps.android.data.geojson.C33825a;
import com.google.maps.android.data.geojson.C33829d;
import com.google.maps.android.data.geojson.C33830e;
import com.google.maps.android.data.geojson.C33831f;
import com.google.maps.android.data.geojson.C33832g;
import com.google.maps.android.data.geojson.C33833h;
import com.google.maps.android.data.geojson.C33836j;
import com.google.maps.android.data.geojson.C33837k;
import com.google.maps.android.data.geojson.C33838l;
import com.google.maps.android.data.geojson.C33839m;
import com.google.maps.android.data.kml.C33849b;
import com.google.maps.android.data.kml.C33853e;
import com.google.maps.android.data.kml.C33856h;
import com.google.maps.android.data.kml.C33859k;
import com.google.maps.android.data.kml.C33865o;
import com.google.maps.android.data.kml.C33866p;
import com.google.maps.android.data.kml.C33868r;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.maps.android.data.k */
public class C33845k {

    /* renamed from: u */
    public static final int f82048u = 32;

    /* renamed from: v */
    public static final Object f82049v = null;

    /* renamed from: w */
    public static final DecimalFormat f82050w = new DecimalFormat("#.####");

    /* renamed from: a */
    public C30412c f82051a;

    /* renamed from: b */
    public final BiMultiMap<C33818b> f82052b;

    /* renamed from: c */
    public HashMap<String, C33865o> f82053c;

    /* renamed from: d */
    public HashMap<String, C33865o> f82054d;

    /* renamed from: e */
    public HashMap<String, String> f82055e;

    /* renamed from: f */
    public final BiMultiMap<C33818b> f82056f;

    /* renamed from: g */
    public HashMap<C33853e, C30579d> f82057g;

    /* renamed from: h */
    public final Set<String> f82058h;

    /* renamed from: i */
    public C33847b f82059i;

    /* renamed from: j */
    public int f82060j;

    /* renamed from: k */
    public boolean f82061k;

    /* renamed from: l */
    public Context f82062l;

    /* renamed from: m */
    public ArrayList<C33849b> f82063m;

    /* renamed from: n */
    public final C33837k f82064n;

    /* renamed from: o */
    public final C33830e f82065o;

    /* renamed from: p */
    public final C33839m f82066p;

    /* renamed from: q */
    public final C33796d.C33797a f82067q;

    /* renamed from: r */
    public final C33798e.C33799a f82068r;

    /* renamed from: s */
    public final C33800f.C33801a f82069s;

    /* renamed from: t */
    public final C33791b.C33792a f82070t;

    /* renamed from: com.google.maps.android.data.k$a */
    public class C33846a implements C30412c.C30414b {
        public C33846a() {
        }

        /* renamed from: c */
        public View mo85934c(@C0359n0 C30587h hVar) {
            View inflate = LayoutInflater.from(C33845k.this.f82062l).inflate(C33802d.C33813k.amu_info_window, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C33802d.C33810h.window);
            if (hVar.mo86559e() != null) {
                textView.setText(Html.fromHtml(hVar.mo86562g() + "<br>" + hVar.mo86559e()));
            } else {
                textView.setText(Html.fromHtml(hVar.mo86562g()));
            }
            return inflate;
        }

        /* renamed from: i */
        public View mo85935i(@C0359n0 C30587h hVar) {
            return null;
        }
    }

    /* renamed from: com.google.maps.android.data.k$b */
    public static final class C33847b {

        /* renamed from: a */
        public final Map<String, Map<String, C30573a>> f82072a = new HashMap();

        /* renamed from: b */
        public final Map<String, C30573a> f82073b = new HashMap();

        /* renamed from: c */
        public final Map<String, Bitmap> f82074c = new HashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C33845k(C30412c cVar, Context context, C33796d dVar, C33798e eVar, C33800f fVar, C33791b bVar, @C0363p0 C33847b bVar2) {
        this(cVar, new HashSet(), (C33837k) null, (C33830e) null, (C33839m) null, new BiMultiMap(), dVar, eVar, fVar, bVar);
        this.f82062l = context;
        this.f82054d = new HashMap<>();
        this.f82059i = bVar2 == null ? new C33847b() : bVar2;
    }

    /* renamed from: M */
    public static boolean m136153M(C33818b bVar) {
        if (!bVar.mo98229h("visibility") || Integer.parseInt(bVar.mo98225d("visibility")) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m136154S(C33820d.C33821a aVar, C30589i iVar) {
        if (mo98389G(iVar) != null) {
            aVar.mo98256a(mo98389G(iVar));
        } else if (mo98384B(iVar) != null) {
            aVar.mo98256a(mo98384B(iVar));
        } else {
            aVar.mo98256a(mo98389G(mo98400V(iVar)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ boolean m136155T(C33820d.C33821a aVar, C30587h hVar) {
        if (mo98389G(hVar) != null) {
            aVar.mo98256a(mo98389G(hVar));
            return false;
        } else if (mo98384B(hVar) != null) {
            aVar.mo98256a(mo98384B(hVar));
            return false;
        } else {
            aVar.mo98256a(mo98389G(mo98400V(hVar)));
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m136156U(C33820d.C33821a aVar, C30591j jVar) {
        if (mo98389G(jVar) != null) {
            aVar.mo98256a(mo98389G(jVar));
        } else if (mo98384B(jVar) != null) {
            aVar.mo98256a(mo98384B(jVar));
        } else {
            aVar.mo98256a(mo98389G(mo98400V(jVar)));
        }
    }

    /* renamed from: A */
    public C30573a mo98383A(String str, double d) {
        C30573a aVar;
        Bitmap bitmap;
        String format = f82050w.format(d);
        Map map = this.f82059i.f82072a.get(str);
        if (map != null) {
            aVar = (C30573a) map.get(format);
        } else {
            aVar = null;
        }
        if (aVar != null || (bitmap = this.f82059i.f82074c.get(str)) == null) {
            return aVar;
        }
        C30573a g0 = mo98414g0(bitmap, d);
        mo98403Y(str, format, g0);
        return g0;
    }

    /* renamed from: B */
    public C33818b mo98384B(Object obj) {
        BiMultiMap<C33818b> biMultiMap = this.f82056f;
        if (biMultiMap != null) {
            return biMultiMap.mo98265c(obj);
        }
        return null;
    }

    /* renamed from: C */
    public ArrayList<C33849b> mo98385C() {
        return this.f82063m;
    }

    /* renamed from: D */
    public C33830e mo98386D() {
        return this.f82065o;
    }

    /* renamed from: E */
    public C33837k mo98387E() {
        return this.f82064n;
    }

    /* renamed from: F */
    public C33839m mo98388F() {
        return this.f82066p;
    }

    /* renamed from: G */
    public C33818b mo98389G(Object obj) {
        return this.f82052b.mo98265c(obj);
    }

    /* renamed from: H */
    public Set<C33818b> mo98390H() {
        return this.f82052b.keySet();
    }

    /* renamed from: I */
    public HashMap<C33853e, C30579d> mo98391I() {
        return this.f82057g;
    }

    /* renamed from: J */
    public C30412c mo98392J() {
        return this.f82051a;
    }

    /* renamed from: K */
    public Set<String> mo98393K() {
        return this.f82058h;
    }

    /* renamed from: L */
    public C33865o mo98394L(String str) {
        C33865o oVar = this.f82054d.get((Object) null);
        if (this.f82054d.get(str) != null) {
            return this.f82054d.get(str);
        }
        return oVar;
    }

    /* renamed from: N */
    public HashMap<String, String> mo98395N() {
        return this.f82055e;
    }

    /* renamed from: O */
    public HashMap<String, C33865o> mo98396O() {
        return this.f82054d;
    }

    /* renamed from: P */
    public Collection<Object> mo98397P() {
        return this.f82052b.values();
    }

    /* renamed from: Q */
    public boolean mo98398Q() {
        return this.f82052b.size() > 0;
    }

    /* renamed from: R */
    public boolean mo98399R() {
        return this.f82061k;
    }

    /* renamed from: V */
    public final ArrayList<?> mo98400V(Object obj) {
        for (Object next : mo98397P()) {
            if (next.getClass().getSimpleName().equals("ArrayList")) {
                ArrayList<?> arrayList = (ArrayList) next;
                if (arrayList.contains(obj)) {
                    return arrayList;
                }
            }
        }
        return null;
    }

    /* renamed from: W */
    public void mo98401W(Object obj, C33818b bVar) {
        this.f82056f.put(bVar, obj);
    }

    /* renamed from: X */
    public void mo98402X(C33818b bVar, Object obj) {
        this.f82052b.put(bVar, obj);
    }

    /* renamed from: Y */
    public final void mo98403Y(String str, String str2, C30573a aVar) {
        Map map = this.f82059i.f82072a.get(str);
        if (map == null) {
            map = new HashMap();
            this.f82059i.f82072a.put(str, map);
        }
        map.put(str2, aVar);
    }

    /* renamed from: Z */
    public void mo98404Z() {
        this.f82054d.putAll(this.f82053c);
    }

    /* renamed from: a0 */
    public void mo98405a0(HashMap<String, C33865o> hashMap) {
        this.f82054d.putAll(hashMap);
    }

    /* renamed from: b0 */
    public void mo98406b0(C33818b bVar) {
        if (this.f82052b.containsKey(bVar)) {
            mo98410e0(this.f82052b.remove(bVar));
        }
    }

    /* renamed from: c0 */
    public final void mo98407c0(Collection collection) {
        for (Object next : collection) {
            if (next instanceof Collection) {
                mo98407c0((Collection) next);
            } else if (next instanceof C30587h) {
                this.f82067q.mo98193o((C30587h) next);
            } else if (next instanceof C30591j) {
                this.f82069s.mo98217k((C30591j) next);
            } else if (next instanceof C30589i) {
                this.f82068r.mo98207k((C30589i) next);
            }
        }
    }

    /* renamed from: d0 */
    public void mo98408d0(HashMap<? extends C33818b, Object> hashMap) {
        mo98407c0(hashMap.values());
    }

    /* renamed from: e */
    public void mo98409e(C33818b bVar) {
        Object obj = f82049v;
        if (bVar instanceof C33825a) {
            mo98416h0((C33825a) bVar);
        }
        if (this.f82061k) {
            if (this.f82052b.containsKey(bVar)) {
                mo98410e0(this.f82052b.get(bVar));
            }
            if (bVar.mo98227f()) {
                if (bVar instanceof C33859k) {
                    C33859k kVar = (C33859k) bVar;
                    obj = mo98415h(kVar, bVar.mo98222a(), mo98394L(bVar.mo98223b()), kVar.mo98478l(), m136153M(bVar));
                } else {
                    obj = mo98411f(bVar, bVar.mo98222a());
                }
            }
        }
        this.f82052b.put(bVar, obj);
    }

    /* renamed from: e0 */
    public void mo98410e0(Object obj) {
        if (obj instanceof C30587h) {
            this.f82067q.mo98193o((C30587h) obj);
        } else if (obj instanceof C30591j) {
            this.f82069s.mo98217k((C30591j) obj);
        } else if (obj instanceof C30589i) {
            this.f82068r.mo98207k((C30589i) obj);
        } else if (obj instanceof C30579d) {
            this.f82070t.mo98178k((C30579d) obj);
        } else if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                mo98410e0(it.next());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.gms.maps.model.MarkerOptions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.gms.maps.model.PolygonOptions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.android.gms.maps.model.PolylineOptions} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo98411f(com.google.maps.android.data.C33818b r4, com.google.maps.android.data.C33819c r5) {
        /*
            r3 = this;
            java.lang.String r0 = r5.mo98233a()
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -2116761119: goto L_0x0052;
                case -1065891849: goto L_0x0047;
                case -627102946: goto L_0x003c;
                case 77292912: goto L_0x0031;
                case 1267133722: goto L_0x0026;
                case 1806700869: goto L_0x001b;
                case 1950410960: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x005c
        L_0x0010:
            java.lang.String r1 = "GeometryCollection"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0019
            goto L_0x005c
        L_0x0019:
            r2 = 6
            goto L_0x005c
        L_0x001b:
            java.lang.String r1 = "LineString"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0024
            goto L_0x005c
        L_0x0024:
            r2 = 5
            goto L_0x005c
        L_0x0026:
            java.lang.String r1 = "Polygon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002f
            goto L_0x005c
        L_0x002f:
            r2 = 4
            goto L_0x005c
        L_0x0031:
            java.lang.String r1 = "Point"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003a
            goto L_0x005c
        L_0x003a:
            r2 = 3
            goto L_0x005c
        L_0x003c:
            java.lang.String r1 = "MultiLineString"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0045
            goto L_0x005c
        L_0x0045:
            r2 = 2
            goto L_0x005c
        L_0x0047:
            java.lang.String r1 = "MultiPoint"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r2 = 1
            goto L_0x005c
        L_0x0052:
            java.lang.String r1 = "MultiPolygon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            r0 = 0
            switch(r2) {
                case 0: goto L_0x00dc;
                case 1: goto L_0x00cf;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00a6;
                case 4: goto L_0x008a;
                case 5: goto L_0x006e;
                case 6: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            return r0
        L_0x0061:
            com.google.maps.android.data.geojson.a r4 = (com.google.maps.android.data.geojson.C33825a) r4
            com.google.maps.android.data.geojson.b r5 = (com.google.maps.android.data.geojson.C33826b) r5
            java.util.List r5 = r5.mo98285g()
            java.util.ArrayList r4 = r3.mo98413g(r4, r5)
            return r4
        L_0x006e:
            boolean r1 = r4 instanceof com.google.maps.android.data.geojson.C33825a
            if (r1 == 0) goto L_0x0079
            com.google.maps.android.data.geojson.a r4 = (com.google.maps.android.data.geojson.C33825a) r4
            com.google.android.gms.maps.model.PolylineOptions r0 = r4.mo98279s()
            goto L_0x0083
        L_0x0079:
            boolean r1 = r4 instanceof com.google.maps.android.data.kml.C33859k
            if (r1 == 0) goto L_0x0083
            com.google.maps.android.data.kml.k r4 = (com.google.maps.android.data.kml.C33859k) r4
            com.google.android.gms.maps.model.PolylineOptions r0 = r4.mo98481o()
        L_0x0083:
            com.google.maps.android.data.geojson.d r5 = (com.google.maps.android.data.geojson.C33829d) r5
            com.google.android.gms.maps.model.j r4 = r3.mo98417i(r0, r5)
            return r4
        L_0x008a:
            boolean r1 = r4 instanceof com.google.maps.android.data.geojson.C33825a
            if (r1 == 0) goto L_0x0095
            com.google.maps.android.data.geojson.a r4 = (com.google.maps.android.data.geojson.C33825a) r4
            com.google.android.gms.maps.model.PolygonOptions r0 = r4.mo98277q()
            goto L_0x009f
        L_0x0095:
            boolean r1 = r4 instanceof com.google.maps.android.data.kml.C33859k
            if (r1 == 0) goto L_0x009f
            com.google.maps.android.data.kml.k r4 = (com.google.maps.android.data.kml.C33859k) r4
            com.google.android.gms.maps.model.PolygonOptions r0 = r4.mo98480n()
        L_0x009f:
            com.google.maps.android.data.a r5 = (com.google.maps.android.data.C33817a) r5
            com.google.android.gms.maps.model.i r4 = r3.mo98430p(r0, r5)
            return r4
        L_0x00a6:
            boolean r1 = r4 instanceof com.google.maps.android.data.geojson.C33825a
            if (r1 == 0) goto L_0x00b1
            com.google.maps.android.data.geojson.a r4 = (com.google.maps.android.data.geojson.C33825a) r4
            com.google.android.gms.maps.model.MarkerOptions r0 = r4.mo98275o()
            goto L_0x00bb
        L_0x00b1:
            boolean r1 = r4 instanceof com.google.maps.android.data.kml.C33859k
            if (r1 == 0) goto L_0x00bb
            com.google.maps.android.data.kml.k r4 = (com.google.maps.android.data.kml.C33859k) r4
            com.google.android.gms.maps.model.MarkerOptions r0 = r4.mo98479m()
        L_0x00bb:
            com.google.maps.android.data.geojson.j r5 = (com.google.maps.android.data.geojson.C33836j) r5
            com.google.android.gms.maps.model.h r4 = r3.mo98428o(r0, r5)
            return r4
        L_0x00c2:
            com.google.maps.android.data.geojson.a r4 = (com.google.maps.android.data.geojson.C33825a) r4
            com.google.maps.android.data.geojson.e r4 = r4.mo98274n()
            com.google.maps.android.data.geojson.f r5 = (com.google.maps.android.data.geojson.C33831f) r5
            java.util.ArrayList r4 = r3.mo98423l(r4, r5)
            return r4
        L_0x00cf:
            com.google.maps.android.data.geojson.a r4 = (com.google.maps.android.data.geojson.C33825a) r4
            com.google.maps.android.data.geojson.k r4 = r4.mo98276p()
            com.google.maps.android.data.geojson.g r5 = (com.google.maps.android.data.geojson.C33832g) r5
            java.util.ArrayList r4 = r3.mo98425m(r4, r5)
            return r4
        L_0x00dc:
            com.google.maps.android.data.geojson.a r4 = (com.google.maps.android.data.geojson.C33825a) r4
            com.google.maps.android.data.geojson.m r4 = r4.mo98278r()
            com.google.maps.android.data.geojson.h r5 = (com.google.maps.android.data.geojson.C33833h) r5
            java.util.ArrayList r4 = r3.mo98426n(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.data.C33845k.mo98411f(com.google.maps.android.data.b, com.google.maps.android.data.c):java.lang.Object");
    }

    /* renamed from: f0 */
    public void mo98412f0(HashMap<C33853e, C30579d> hashMap) {
        for (C30579d next : hashMap.values()) {
            if (next != null) {
                this.f82070t.mo98178k(next);
            }
        }
    }

    /* renamed from: g */
    public final ArrayList<Object> mo98413g(C33825a aVar, List<C33819c> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (C33819c f : list) {
            arrayList.add(mo98411f(aVar, f));
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public final C30573a mo98414g0(Bitmap bitmap, double d) {
        int i;
        int i2 = (int) (((double) (this.f82062l.getResources().getDisplayMetrics().density * 32.0f)) * d);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < height) {
            i = (int) (((float) (height * i2)) / ((float) width));
        } else if (width > height) {
            int i3 = (int) (((float) (width * i2)) / ((float) height));
            i = i2;
            i2 = i3;
        } else {
            i = i2;
        }
        return C30575b.m123158d(Bitmap.createScaledBitmap(bitmap, i2, i, false));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r0.equals("Point") == false) goto L_0x002a;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo98415h(com.google.maps.android.data.kml.C33859k r13, com.google.maps.android.data.C33819c r14, com.google.maps.android.data.kml.C33865o r15, com.google.maps.android.data.kml.C33865o r16, boolean r17) {
        /*
            r12 = this;
            r6 = r12
            r1 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            java.lang.String r0 = r14.mo98233a()
            java.lang.String r2 = "drawOrder"
            boolean r7 = r13.mo98229h(r2)
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L_0x001f
            java.lang.String r2 = r13.mo98225d(r2)     // Catch:{ NumberFormatException -> 0x001e }
            float r9 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x001e }
            goto L_0x001f
        L_0x001e:
            r7 = r8
        L_0x001f:
            r0.hashCode()
            int r2 = r0.hashCode()
            r10 = -1
            switch(r2) {
                case 77292912: goto L_0x004d;
                case 89139371: goto L_0x0042;
                case 1267133722: goto L_0x0037;
                case 1806700869: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r8 = r10
            goto L_0x0056
        L_0x002c:
            java.lang.String r2 = "LineString"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0035
            goto L_0x002a
        L_0x0035:
            r8 = 3
            goto L_0x0056
        L_0x0037:
            java.lang.String r2 = "Polygon"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0040
            goto L_0x002a
        L_0x0040:
            r8 = 2
            goto L_0x0056
        L_0x0042:
            java.lang.String r2 = "MultiGeometry"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x004b
            goto L_0x002a
        L_0x004b:
            r8 = 1
            goto L_0x0056
        L_0x004d:
            java.lang.String r2 = "Point"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0056
            goto L_0x002a
        L_0x0056:
            switch(r8) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x00b1;
                case 2: goto L_0x0086;
                case 3: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            r0 = 0
            return r0
        L_0x005b:
            com.google.android.gms.maps.model.PolylineOptions r0 = r15.mo98544s()
            if (r4 == 0) goto L_0x0065
            r12.mo98418i0(r0, r4)
            goto L_0x0076
        L_0x0065:
            boolean r1 = r15.mo98551y()
            if (r1 == 0) goto L_0x0076
            int r1 = r0.mo86431p0()
            int r1 = com.google.maps.android.data.kml.C33865o.m136351h(r1)
            r0.mo86424e0(r1)
        L_0x0076:
            r1 = r14
            com.google.maps.android.data.e r1 = (com.google.maps.android.data.C33822e) r1
            com.google.android.gms.maps.model.j r0 = r12.mo98417i(r0, r1)
            r0.mo86639x(r5)
            if (r7 == 0) goto L_0x0085
            r0.mo86641z(r9)
        L_0x0085:
            return r0
        L_0x0086:
            com.google.android.gms.maps.model.PolygonOptions r0 = r15.mo98543r()
            if (r4 == 0) goto L_0x0090
            r12.mo98422k0(r0, r4)
            goto L_0x00a1
        L_0x0090:
            boolean r1 = r15.mo98552z()
            if (r1 == 0) goto L_0x00a1
            int r1 = r0.mo86406p0()
            int r1 = com.google.maps.android.data.kml.C33865o.m136351h(r1)
            r0.mo86401f0(r1)
        L_0x00a1:
            r1 = r14
            com.google.maps.android.data.a r1 = (com.google.maps.android.data.C33817a) r1
            com.google.android.gms.maps.model.i r0 = r12.mo98430p(r0, r1)
            r0.mo86610y(r5)
            if (r7 == 0) goto L_0x00b0
            r0.mo86611z(r9)
        L_0x00b0:
            return r0
        L_0x00b1:
            r2 = r14
            com.google.maps.android.data.kml.h r2 = (com.google.maps.android.data.kml.C33856h) r2
            r0 = r12
            r1 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            java.util.ArrayList r0 = r0.mo98421k(r1, r2, r3, r4, r5)
            return r0
        L_0x00c0:
            com.google.android.gms.maps.model.MarkerOptions r0 = r15.mo98542q()
            if (r4 == 0) goto L_0x00ca
            r12.mo98420j0(r0, r4, r15)
            goto L_0x00db
        L_0x00ca:
            java.lang.String r2 = r15.mo98541p()
            if (r2 == 0) goto L_0x00db
            java.lang.String r2 = r15.mo98541p()
            double r10 = r15.mo98540o()
            r12.mo98419j(r2, r10, r0)
        L_0x00db:
            r2 = r14
            com.google.maps.android.data.kml.l r2 = (com.google.maps.android.data.kml.C33860l) r2
            com.google.android.gms.maps.model.h r0 = r12.mo98428o(r0, r2)
            r0.mo86582z(r5)
            r12.mo98427n0(r15, r0, r13)
            if (r7 == 0) goto L_0x00ed
            r0.mo86553A(r9)
        L_0x00ed:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.data.C33845k.mo98415h(com.google.maps.android.data.kml.k, com.google.maps.android.data.c, com.google.maps.android.data.kml.o, com.google.maps.android.data.kml.o, boolean):java.lang.Object");
    }

    /* renamed from: h0 */
    public final void mo98416h0(C33825a aVar) {
        if (aVar.mo98276p() == null) {
            aVar.mo98282u(this.f82064n);
        }
        if (aVar.mo98274n() == null) {
            aVar.mo98280t(this.f82065o);
        }
        if (aVar.mo98278r() == null) {
            aVar.mo98284v(this.f82066p);
        }
    }

    /* renamed from: i */
    public final C30591j mo98417i(PolylineOptions polylineOptions, C33822e eVar) {
        polylineOptions.mo86419W(eVar.mo98234d());
        C30591j h = this.f82069s.mo98214h(polylineOptions);
        h.mo86630o(polylineOptions.mo86410A1());
        return h;
    }

    /* renamed from: i0 */
    public final void mo98418i0(PolylineOptions polylineOptions, C33865o oVar) {
        PolylineOptions s = oVar.mo98544s();
        if (oVar.mo98523A("outlineColor")) {
            polylineOptions.mo86424e0(s.mo86431p0());
        }
        if (oVar.mo98523A("width")) {
            polylineOptions.mo86425e2(s.mo86427j1());
        }
        if (oVar.mo98551y()) {
            polylineOptions.mo86424e0(C33865o.m136351h(s.mo86431p0()));
        }
    }

    /* renamed from: j */
    public final void mo98419j(String str, double d, MarkerOptions markerOptions) {
        C30573a A = mo98383A(str, d);
        if (A != null) {
            markerOptions.mo86354A1(A);
        } else {
            this.f82058h.add(str);
        }
    }

    /* renamed from: j0 */
    public final void mo98420j0(MarkerOptions markerOptions, C33865o oVar, C33865o oVar2) {
        double d;
        MarkerOptions q = oVar.mo98542q();
        if (oVar.mo98523A("heading")) {
            markerOptions.mo86367c2(q.mo86357K0());
        }
        if (oVar.mo98523A(C33866p.f82153e)) {
            markerOptions.mo86362Q(q.mo86370f0(), q.mo86375n0());
        }
        if (oVar.mo98523A("markerColor")) {
            markerOptions.mo86354A1(q.mo86376p0());
        }
        if (oVar.mo98523A("iconScale")) {
            d = oVar.mo98540o();
        } else if (oVar2.mo98523A("iconScale")) {
            d = oVar2.mo98540o();
        } else {
            d = 1.0d;
        }
        if (oVar.mo98523A("iconUrl")) {
            mo98419j(oVar.mo98541p(), d, markerOptions);
        } else if (oVar2.mo98541p() != null) {
            mo98419j(oVar2.mo98541p(), d, markerOptions);
        }
    }

    /* renamed from: k */
    public final ArrayList<Object> mo98421k(C33859k kVar, C33856h hVar, C33865o oVar, C33865o oVar2, boolean z) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<C33819c> it = hVar.mo98259e().iterator();
        while (it.hasNext()) {
            arrayList.add(mo98415h(kVar, it.next(), oVar, oVar2, z));
        }
        return arrayList;
    }

    /* renamed from: k0 */
    public final void mo98422k0(PolygonOptions polygonOptions, C33865o oVar) {
        PolygonOptions r = oVar.mo98543r();
        if (oVar.mo98548v() && oVar.mo98523A("fillColor")) {
            polygonOptions.mo86401f0(r.mo86406p0());
        }
        if (oVar.mo98549w()) {
            if (oVar.mo98523A("outlineColor")) {
                polygonOptions.mo86391M1(r.mo86386C0());
            }
            if (oVar.mo98523A("width")) {
                polygonOptions.mo86398c2(r.mo86402j1());
            }
        }
        if (oVar.mo98552z()) {
            polygonOptions.mo86401f0(C33865o.m136351h(r.mo86406p0()));
        }
    }

    /* renamed from: l */
    public final ArrayList<C30591j> mo98423l(C33830e eVar, C33831f fVar) {
        ArrayList<C30591j> arrayList = new ArrayList<>();
        for (C33829d i : fVar.mo98312g()) {
            arrayList.add(mo98417i(eVar.mo98311u(), i));
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public void mo98424l0(boolean z) {
        this.f82061k = z;
    }

    /* renamed from: m */
    public final ArrayList<C30587h> mo98425m(C33837k kVar, C33832g gVar) {
        ArrayList<C30587h> arrayList = new ArrayList<>();
        for (C33836j o : gVar.mo98314g()) {
            arrayList.add(mo98428o(kVar.mo98328D(), o));
        }
        return arrayList;
    }

    /* renamed from: m0 */
    public void mo98375m0(C30412c cVar) {
        this.f82051a = cVar;
    }

    /* renamed from: n */
    public final ArrayList<C30589i> mo98426n(C33839m mVar, C33833h hVar) {
        ArrayList<C30589i> arrayList = new ArrayList<>();
        for (C33838l p : hVar.mo98316g()) {
            arrayList.add(mo98430p(mVar.mo98374y(), p));
        }
        return arrayList;
    }

    /* renamed from: n0 */
    public final void mo98427n0(C33865o oVar, C30587h hVar, C33859k kVar) {
        boolean h = kVar.mo98229h("name");
        boolean h2 = kVar.mo98229h("description");
        boolean u = oVar.mo98547u();
        boolean containsKey = oVar.mo98539m().containsKey("text");
        if (u && containsKey) {
            hVar.mo86581y(C33868r.m136397a(oVar.mo98539m().get("text"), kVar));
            mo98437v();
        } else if (u && h) {
            hVar.mo86581y(kVar.mo98225d("name"));
            mo98437v();
        } else if (h && h2) {
            hVar.mo86581y(kVar.mo98225d("name"));
            hVar.mo86579w(kVar.mo98225d("description"));
            mo98437v();
        } else if (h2) {
            hVar.mo86581y(kVar.mo98225d("description"));
            mo98437v();
        } else if (h) {
            hVar.mo86581y(kVar.mo98225d("name"));
            mo98437v();
        }
    }

    /* renamed from: o */
    public final C30587h mo98428o(MarkerOptions markerOptions, C33824g gVar) {
        markerOptions.mo86366Y1(gVar.mo98234d());
        return this.f82067q.mo98190l(markerOptions);
    }

    /* renamed from: o0 */
    public void mo98429o0(C33820d.C33821a aVar) {
        this.f82068r.mo98208l(new C33842h(this, aVar));
        this.f82067q.mo98197s(new C33843i(this, aVar));
        this.f82069s.mo98218l(new C33844j(this, aVar));
    }

    /* renamed from: p */
    public final C30589i mo98430p(PolygonOptions polygonOptions, C33817a aVar) {
        polygonOptions.mo86394W(aVar.mo98220b());
        for (List<LatLng> X : aVar.mo98221c()) {
            polygonOptions.mo86395X(X);
        }
        C30589i h = this.f82068r.mo98204h(polygonOptions);
        h.mo86600o(polygonOptions.mo86385A1());
        return h;
    }

    /* renamed from: p0 */
    public void mo98431p0(HashMap<String, C33865o> hashMap, HashMap<String, String> hashMap2, HashMap<C33859k, Object> hashMap3, ArrayList<C33849b> arrayList, HashMap<C33853e, C30579d> hashMap4) {
        this.f82053c = hashMap;
        this.f82055e = hashMap2;
        this.f82052b.putAll(hashMap3);
        this.f82063m = arrayList;
        this.f82057g = hashMap4;
    }

    /* renamed from: q */
    public void mo98432q(HashMap<String, String> hashMap, HashMap<String, C33865o> hashMap2) {
        for (String next : hashMap.keySet()) {
            String str = hashMap.get(next);
            if (hashMap2.containsKey(str)) {
                hashMap2.put(next, hashMap2.get(str));
            }
        }
    }

    /* renamed from: r */
    public C30579d mo98433r(GroundOverlayOptions groundOverlayOptions) {
        return this.f82070t.mo98175h(groundOverlayOptions);
    }

    /* renamed from: s */
    public void mo98434s(String str, Bitmap bitmap) {
        this.f82059i.f82074c.put(str, bitmap);
    }

    /* renamed from: t */
    public void mo98435t() {
        C33847b bVar;
        if (this.f82060j == 0 && (bVar = this.f82059i) != null && !bVar.f82074c.isEmpty()) {
            this.f82059i.f82074c.clear();
        }
    }

    /* renamed from: u */
    public void mo98436u() {
        this.f82054d.clear();
    }

    /* renamed from: v */
    public final void mo98437v() {
        this.f82067q.mo98194p(new C33846a());
    }

    /* renamed from: w */
    public void mo98438w() {
        this.f82060j--;
        mo98435t();
    }

    /* renamed from: x */
    public void mo98439x() {
        this.f82060j++;
    }

    /* renamed from: y */
    public HashMap<? extends C33818b, Object> mo98440y() {
        return this.f82052b;
    }

    /* renamed from: z */
    public C30573a mo98441z(String str) {
        Bitmap bitmap;
        C30573a aVar = this.f82059i.f82073b.get(str);
        if (aVar != null || (bitmap = this.f82059i.f82074c.get(str)) == null) {
            return aVar;
        }
        C30573a d = C30575b.m123158d(bitmap);
        this.f82059i.f82073b.put(str, d);
        return d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C33845k(C30412c cVar, HashMap<? extends C33818b, Object> hashMap, C33796d dVar, C33798e eVar, C33800f fVar, C33791b bVar) {
        this(cVar, (Set<String>) null, new C33837k(), new C33830e(), new C33839m(), (BiMultiMap<C33818b>) null, dVar, eVar, fVar, bVar);
        HashMap<? extends C33818b, Object> hashMap2 = hashMap;
        this.f82052b.putAll(hashMap);
        this.f82059i = null;
    }

    public C33845k(C30412c cVar, Set<String> set, C33837k kVar, C33830e eVar, C33839m mVar, BiMultiMap<C33818b> biMultiMap, C33796d dVar, C33798e eVar2, C33800f fVar, C33791b bVar) {
        this.f82052b = new BiMultiMap<>();
        this.f82060j = 0;
        this.f82051a = cVar;
        this.f82061k = false;
        this.f82058h = set;
        this.f82064n = kVar;
        this.f82065o = eVar;
        this.f82066p = mVar;
        this.f82056f = biMultiMap;
        if (cVar != null) {
            this.f82067q = (dVar == null ? new C33796d(cVar) : dVar).mo98156m();
            this.f82068r = (eVar2 == null ? new C33798e(cVar) : eVar2).mo98156m();
            this.f82069s = (fVar == null ? new C33800f(cVar) : fVar).mo98156m();
            this.f82070t = (bVar == null ? new C33791b(cVar) : bVar).mo98156m();
            return;
        }
        this.f82067q = null;
        this.f82068r = null;
        this.f82069s = null;
        this.f82070t = null;
    }
}
