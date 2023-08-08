package p073j$.time.format;

import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p073j$.time.zone.C42687g;

/* renamed from: j$.time.format.v */
final class C42648v extends C42647u {

    /* renamed from: h */
    private static final Map f107905h = new ConcurrentHashMap();

    /* renamed from: e */
    private final TextStyle f107906e;

    /* renamed from: f */
    private final Map f107907f = new HashMap();

    /* renamed from: g */
    private final Map f107908g = new HashMap();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C42648v(p073j$.time.format.TextStyle r4) {
        /*
            r3 = this;
            j$.time.temporal.m r0 = p073j$.time.temporal.C42676o.m172521f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ZoneText("
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.<init>(r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f107907f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f107908g = r0
            java.lang.String r0 = "textStyle"
            java.util.Objects.requireNonNull(r4, r0)
            r3.f107906e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.format.C42648v.<init>(j$.time.format.TextStyle):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C42641o mo138160a(C42649w wVar) {
        C42641o oVar;
        TextStyle textStyle = TextStyle.NARROW;
        TextStyle textStyle2 = this.f107906e;
        if (textStyle2 == textStyle) {
            return super.mo138160a(wVar);
        }
        Locale i = wVar.mo138168i();
        boolean k = wVar.mo138170k();
        HashSet hashSet = (HashSet) C42687g.m172580a();
        int size = hashSet.size();
        Map map = k ? this.f107907f : this.f107908g;
        Map.Entry entry = (Map.Entry) map.get(i);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (oVar = (C42641o) ((SoftReference) entry.getValue()).get()) == null) {
            oVar = C42641o.m172377f(wVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(i).getZoneStrings();
            int length = zoneStrings.length;
            int i2 = 0;
            while (true) {
                int i3 = 2;
                if (i2 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i2];
                String str = strArr[0];
                if (hashSet.contains(str)) {
                    oVar.mo138154a(str, str);
                    String a = C42626E.m172341a(str, i);
                    if (textStyle2 == TextStyle.FULL) {
                        i3 = 1;
                    }
                    while (i3 < strArr.length) {
                        oVar.mo138154a(strArr[i3], a);
                        i3 += 2;
                    }
                }
                i2++;
            }
            map.put(i, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(oVar)));
        }
        return oVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.concurrent.ConcurrentHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.concurrent.ConcurrentHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r8 == null) goto L_0x0061;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo138135n(p073j$.time.format.C42651y r14, java.lang.StringBuilder r15) {
        /*
            r13 = this;
            j$.time.temporal.m r0 = p073j$.time.temporal.C42676o.m172522g()
            java.lang.Object r0 = r14.mo138186f(r0)
            j$.time.ZoneId r0 = (p073j$.time.ZoneId) r0
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.String r2 = r0.mo138002s()
            boolean r3 = r0 instanceof p073j$.time.ZoneOffset
            r4 = 1
            if (r3 != 0) goto L_0x00b1
            j$.time.temporal.TemporalAccessor r3 = r14.mo138184d()
            j$.time.temporal.a r5 = p073j$.time.temporal.C42662a.INSTANT_SECONDS
            boolean r5 = r3.mo137885f(r5)
            r6 = 2
            if (r5 == 0) goto L_0x0036
            j$.time.zone.c r0 = r0.mo138001n()
            j$.time.Instant r3 = p073j$.time.Instant.from(r3)
            boolean r0 = r0.mo138254h(r3)
            if (r0 == 0) goto L_0x0034
            r0 = r4
            goto L_0x0037
        L_0x0034:
            r0 = r1
            goto L_0x0037
        L_0x0036:
            r0 = r6
        L_0x0037:
            java.util.Locale r14 = r14.mo138183c()
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.NARROW
            r5 = 0
            j$.time.format.TextStyle r7 = r13.f107906e
            if (r7 != r3) goto L_0x0043
            goto L_0x00ae
        L_0x0043:
            java.util.Map r3 = f107905h
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r8 = r3.get(r2)
            java.lang.ref.SoftReference r8 = (java.lang.ref.SoftReference) r8
            r9 = 5
            r10 = 3
            if (r8 == 0) goto L_0x0061
            java.lang.Object r5 = r8.get()
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x0061
            java.lang.Object r8 = r5.get(r14)
            java.lang.String[] r8 = (java.lang.String[]) r8
            if (r8 != 0) goto L_0x009b
        L_0x0061:
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r2)
            r11 = 7
            java.lang.String[] r11 = new java.lang.String[r11]
            r11[r1] = r2
            java.lang.String r12 = r8.getDisplayName(r1, r4, r14)
            r11[r4] = r12
            java.lang.String r12 = r8.getDisplayName(r1, r1, r14)
            r11[r6] = r12
            java.lang.String r6 = r8.getDisplayName(r4, r4, r14)
            r11[r10] = r6
            r6 = 4
            java.lang.String r1 = r8.getDisplayName(r4, r1, r14)
            r11[r6] = r1
            r11[r9] = r2
            r1 = 6
            r11[r1] = r2
            if (r5 != 0) goto L_0x008f
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r5.<init>()
        L_0x008f:
            r5.put(r14, r11)
            java.lang.ref.SoftReference r14 = new java.lang.ref.SoftReference
            r14.<init>(r5)
            r3.put(r2, r14)
            r8 = r11
        L_0x009b:
            int r14 = r7.mo138133n()
            if (r0 == 0) goto L_0x00ab
            if (r0 == r4) goto L_0x00a7
            int r14 = r14 + r9
            r5 = r8[r14]
            goto L_0x00ae
        L_0x00a7:
            int r14 = r14 + r10
            r5 = r8[r14]
            goto L_0x00ae
        L_0x00ab:
            int r14 = r14 + r4
            r5 = r8[r14]
        L_0x00ae:
            if (r5 == 0) goto L_0x00b1
            r2 = r5
        L_0x00b1:
            r15.append(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.format.C42648v.mo138135n(j$.time.format.y, java.lang.StringBuilder):boolean");
    }
}
