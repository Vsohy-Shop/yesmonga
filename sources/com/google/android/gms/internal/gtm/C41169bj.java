package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.C41145aj;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.bj */
public final class C41169bj<T extends C41145aj<T>> {

    /* renamed from: d */
    public static final C41169bj f104469d = new C41169bj(true);

    /* renamed from: a */
    public final C41652vl<T, Object> f104470a = new C41412ll(16);

    /* renamed from: b */
    public boolean f104471b;

    /* renamed from: c */
    public boolean f104472c;

    public C41169bj() {
    }

    /* renamed from: a */
    public static int m167200a(C41145aj<?> ajVar, Object obj) {
        zzye e = ajVar.mo135027e();
        int zza = ajVar.zza();
        ajVar.mo135029h();
        int c = C41144ai.m167093c(zza);
        if (e == zzye.GROUP) {
            C41650vj.m168607i((C41627uk) obj);
            c += c;
        }
        zzyf zzyf = zzyf.INT;
        int i = 4;
        switch (e.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i = C41144ai.m167095e(((Long) obj).longValue());
                break;
            case 3:
                i = C41144ai.m167095e(((Long) obj).longValue());
                break;
            case 4:
                i = C41144ai.m167088E(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i = 1;
                break;
            case 8:
                if (!(obj instanceof zztd)) {
                    i = C41144ai.m167092b((String) obj);
                    break;
                } else {
                    i = C41144ai.m167085B((zztd) obj);
                    break;
                }
            case 9:
                i = C41144ai.m167087D((C41627uk) obj);
                break;
            case 10:
                if (!(obj instanceof C41746zj)) {
                    i = C41144ai.m167090G((C41627uk) obj);
                    break;
                } else {
                    i = C41144ai.m167089F((C41746zj) obj);
                    break;
                }
            case 11:
                if (!(obj instanceof zztd)) {
                    i = C41144ai.m167084A((byte[]) obj);
                    break;
                } else {
                    i = C41144ai.m167085B((zztd) obj);
                    break;
                }
            case 12:
                i = C41144ai.m167094d(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof C41482oj)) {
                    i = C41144ai.m167088E(((Integer) obj).intValue());
                    break;
                } else {
                    i = C41144ai.m167088E(((C41482oj) obj).zza());
                    break;
                }
            case 14:
                ((Integer) obj).intValue();
                break;
            case 15:
                ((Long) obj).longValue();
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i = C41144ai.m167094d((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = C41144ai.m167095e((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        i = 8;
        return c + i;
    }

    /* renamed from: d */
    public static <T extends C41145aj<T>> C41169bj<T> m167201d() {
        return f104469d;
    }

    /* renamed from: l */
    public static Object m167202l(Object obj) {
        if (obj instanceof C41747zk) {
            return ((C41747zk) obj).mo136108d();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: n */
    public static <T extends C41145aj<T>> boolean m167203n(Map.Entry<T, Object> entry) {
        C41145aj ajVar = (C41145aj) entry.getKey();
        if (ajVar.mo135028f() == zzyf.MESSAGE) {
            ajVar.mo135029h();
            Object value = entry.getValue();
            if (value instanceof C41627uk) {
                if (!((C41627uk) value).mo135366i()) {
                    return false;
                }
            } else if (value instanceof C41746zj) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: o */
    public static final int m167204o(Map.Entry<T, Object> entry) {
        int d;
        int d2;
        C41145aj ajVar = (C41145aj) entry.getKey();
        Object value = entry.getValue();
        if (ajVar.mo135028f() != zzyf.MESSAGE) {
            return m167200a(ajVar, value);
        }
        ajVar.mo135029h();
        ajVar.mo135030o();
        if (value instanceof C41746zj) {
            int zza = ((C41145aj) entry.getKey()).zza();
            int d3 = C41144ai.m167094d(8);
            int a = ((C41746zj) value).mo135033a();
            d = d3 + d3 + C41144ai.m167094d(16) + C41144ai.m167094d(zza);
            d2 = C41144ai.m167094d(24) + C41144ai.m167094d(a) + a;
        } else {
            int zza2 = ((C41145aj) entry.getKey()).zza();
            int d4 = C41144ai.m167094d(8);
            d = d4 + d4 + C41144ai.m167094d(16) + C41144ai.m167094d(zza2);
            d2 = C41144ai.m167094d(24) + C41144ai.m167090G((C41627uk) value);
        }
        return d + d2;
    }

    /* renamed from: b */
    public final int mo135107b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f104470a.mo135988b(); i2++) {
            i += m167204o(this.f104470a.mo135996h(i2));
        }
        for (Map.Entry<T, Object> o : this.f104470a.mo135989c()) {
            i += m167204o(o);
        }
        return i;
    }

    /* renamed from: c */
    public final C41169bj<T> clone() {
        C41169bj<T> bjVar = new C41169bj<>();
        for (int i = 0; i < this.f104470a.mo135988b(); i++) {
            Map.Entry<T, Object> h = this.f104470a.mo135996h(i);
            bjVar.mo135116i((C41145aj) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f104470a.mo135989c()) {
            bjVar.mo135116i((C41145aj) next.getKey(), next.getValue());
        }
        bjVar.f104472c = this.f104472c;
        return bjVar;
    }

    /* renamed from: e */
    public final Object mo135110e(T t) {
        Object obj = this.f104470a.get(t);
        if (!(obj instanceof C41746zj)) {
            return obj;
        }
        C41746zj zjVar = (C41746zj) obj;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41169bj)) {
            return false;
        }
        return this.f104470a.equals(((C41169bj) obj).f104470a);
    }

    /* renamed from: f */
    public final Iterator<Map.Entry<T, Object>> mo135112f() {
        if (this.f104472c) {
            return new C41722yj(this.f104470a.entrySet().iterator());
        }
        return this.f104470a.entrySet().iterator();
    }

    /* renamed from: g */
    public final void mo135113g() {
        if (!this.f104471b) {
            this.f104470a.mo135633a();
            this.f104471b = true;
        }
    }

    /* renamed from: h */
    public final void mo135114h(C41169bj<T> bjVar) {
        for (int i = 0; i < bjVar.f104470a.mo135988b(); i++) {
            mo135119m(bjVar.f104470a.mo135996h(i));
        }
        for (Map.Entry<T, Object> m : bjVar.f104470a.mo135989c()) {
            mo135119m(m);
        }
    }

    public final int hashCode() {
        return this.f104470a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if ((r7 instanceof byte[]) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r0 != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if ((r7 instanceof com.google.android.gms.internal.gtm.C41746zj) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r5.f104472c = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r5.f104470a.mo135992e(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r6.zza()), r6.mo135027e().mo136175g(), r7.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if ((r7 instanceof com.google.android.gms.internal.gtm.C41746zj) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if ((r7 instanceof com.google.android.gms.internal.gtm.C41482oj) == false) goto L_0x0055;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135116i(T r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.mo135029h()
            com.google.android.gms.internal.gtm.zzye r0 = r6.mo135027e()
            com.google.android.gms.internal.gtm.C41650vj.m168603e(r7)
            com.google.android.gms.internal.gtm.zzye r1 = com.google.android.gms.internal.gtm.zzye.DOUBLE
            com.google.android.gms.internal.gtm.zzyf r1 = com.google.android.gms.internal.gtm.zzyf.INT
            com.google.android.gms.internal.gtm.zzyf r0 = r0.mo136175g()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L_0x0045;
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x002d;
                case 7: goto L_0x0024;
                case 8: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0055
        L_0x001b:
            boolean r0 = r7 instanceof com.google.android.gms.internal.gtm.C41627uk
            if (r0 != 0) goto L_0x0049
            boolean r0 = r7 instanceof com.google.android.gms.internal.gtm.C41746zj
            if (r0 == 0) goto L_0x0055
            goto L_0x0049
        L_0x0024:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0049
            boolean r0 = r7 instanceof com.google.android.gms.internal.gtm.C41482oj
            if (r0 == 0) goto L_0x0055
            goto L_0x0049
        L_0x002d:
            boolean r0 = r7 instanceof com.google.android.gms.internal.gtm.zztd
            if (r0 != 0) goto L_0x0049
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x0055
            goto L_0x0049
        L_0x0036:
            boolean r0 = r7 instanceof java.lang.String
            goto L_0x0047
        L_0x0039:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L_0x0047
        L_0x003c:
            boolean r0 = r7 instanceof java.lang.Double
            goto L_0x0047
        L_0x003f:
            boolean r0 = r7 instanceof java.lang.Float
            goto L_0x0047
        L_0x0042:
            boolean r0 = r7 instanceof java.lang.Long
            goto L_0x0047
        L_0x0045:
            boolean r0 = r7 instanceof java.lang.Integer
        L_0x0047:
            if (r0 == 0) goto L_0x0055
        L_0x0049:
            boolean r0 = r7 instanceof com.google.android.gms.internal.gtm.C41746zj
            if (r0 == 0) goto L_0x004f
            r5.f104472c = r1
        L_0x004f:
            com.google.android.gms.internal.gtm.vl<T, java.lang.Object> r0 = r5.f104470a
            r0.put(r6, r7)
            return
        L_0x0055:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r6.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            com.google.android.gms.internal.gtm.zzye r6 = r6.mo135027e()
            com.google.android.gms.internal.gtm.zzyf r6 = r6.mo136175g()
            r2[r1] = r6
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            r7 = 2
            r2[r7] = r6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41169bj.mo135116i(com.google.android.gms.internal.gtm.aj, java.lang.Object):void");
    }

    /* renamed from: j */
    public final boolean mo135117j() {
        return this.f104471b;
    }

    /* renamed from: k */
    public final boolean mo135118k() {
        for (int i = 0; i < this.f104470a.mo135988b(); i++) {
            if (!m167203n(this.f104470a.mo135996h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> n : this.f104470a.mo135989c()) {
            if (!m167203n(n)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final void mo135119m(Map.Entry<T, Object> entry) {
        Object obj;
        C41145aj ajVar = (C41145aj) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof C41746zj)) {
            ajVar.mo135029h();
            if (ajVar.mo135028f() == zzyf.MESSAGE) {
                Object e = mo135110e(ajVar);
                if (e == null) {
                    this.f104470a.put(ajVar, m167202l(value));
                    return;
                }
                if (e instanceof C41747zk) {
                    obj = ajVar.mo135031t1((C41747zk) e, (C41747zk) value);
                } else {
                    C41603tk e2 = ((C41627uk) e).mo135625e();
                    ajVar.mo135026I0(e2, (C41627uk) value);
                    obj = e2.mo135375y();
                }
                this.f104470a.put(ajVar, obj);
                return;
            }
            this.f104470a.put(ajVar, m167202l(value));
            return;
        }
        C41746zj zjVar = (C41746zj) value;
        throw null;
    }

    public C41169bj(boolean z) {
        mo135113g();
        mo135113g();
    }
}
