package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38895d2;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2 */
public final class C38905e2<T extends C38895d2<T>> {

    /* renamed from: d */
    public static final C38905e2 f98834d = new C38905e2(true);

    /* renamed from: a */
    public final C38888c5<T, Object> f98835a = new C39041s4(16);

    /* renamed from: b */
    public boolean f98836b;

    /* renamed from: c */
    public boolean f98837c;

    public C38905e2() {
    }

    /* renamed from: a */
    public static int m160464a(C38895d2<?> d2Var, Object obj) {
        zzhp e = d2Var.mo122833e();
        int zza = d2Var.zza();
        d2Var.mo122835h();
        int c = C39056u1.m160857c(zza);
        if (e == zzhp.GROUP) {
            C39084x2.m160973i((C39076w3) obj);
            c += c;
        }
        zzhq zzhq = zzhq.INT;
        int i = 4;
        switch (e.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i = C39056u1.m160859e(((Long) obj).longValue());
                break;
            case 3:
                i = C39056u1.m160859e(((Long) obj).longValue());
                break;
            case 4:
                i = C39056u1.m160852E(((Integer) obj).intValue());
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
                if (!(obj instanceof zzdc)) {
                    i = C39056u1.m160856b((String) obj);
                    break;
                } else {
                    i = C39056u1.m160849B((zzdc) obj);
                    break;
                }
            case 9:
                i = C39056u1.m160851D((C39076w3) obj);
                break;
            case 10:
                if (!(obj instanceof C38876b3)) {
                    i = C39056u1.m160854G((C39076w3) obj);
                    break;
                } else {
                    i = C39056u1.m160853F((C38876b3) obj);
                    break;
                }
            case 11:
                if (!(obj instanceof zzdc)) {
                    i = C39056u1.m160848A((byte[]) obj);
                    break;
                } else {
                    i = C39056u1.m160849B((zzdc) obj);
                    break;
                }
            case 12:
                i = C39056u1.m160858d(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof C39021q2)) {
                    i = C39056u1.m160852E(((Integer) obj).intValue());
                    break;
                } else {
                    i = C39056u1.m160852E(((C39021q2) obj).zza());
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
                i = C39056u1.m160858d((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = C39056u1.m160859e((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        i = 8;
        return c + i;
    }

    /* renamed from: d */
    public static <T extends C38895d2<T>> C38905e2<T> m160465d() {
        return f98834d;
    }

    /* renamed from: l */
    public static Object m160466l(Object obj) {
        if (obj instanceof C38877b4) {
            return ((C38877b4) obj).mo122806d();
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
    public static <T extends C38895d2<T>> boolean m160467n(Map.Entry<T, Object> entry) {
        C38895d2 d2Var = (C38895d2) entry.getKey();
        if (d2Var.mo122834f() == zzhq.MESSAGE) {
            d2Var.mo122835h();
            Object value = entry.getValue();
            if (value instanceof C39076w3) {
                if (!((C39076w3) value).mo122908b()) {
                    return false;
                }
            } else if (value instanceof C38876b3) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: o */
    public static final int m160468o(Map.Entry<T, Object> entry) {
        int d;
        int d2;
        C38895d2 d2Var = (C38895d2) entry.getKey();
        Object value = entry.getValue();
        if (d2Var.mo122834f() != zzhq.MESSAGE) {
            return m160464a(d2Var, value);
        }
        d2Var.mo122835h();
        d2Var.mo122836o();
        if (value instanceof C38876b3) {
            int zza = ((C38895d2) entry.getKey()).zza();
            int d3 = C39056u1.m160858d(8);
            int a = ((C38876b3) value).mo122807a();
            d = d3 + d3 + C39056u1.m160858d(16) + C39056u1.m160858d(zza);
            d2 = C39056u1.m160858d(24) + C39056u1.m160858d(a) + a;
        } else {
            int zza2 = ((C38895d2) entry.getKey()).zza();
            int d4 = C39056u1.m160858d(8);
            d = d4 + d4 + C39056u1.m160858d(16) + C39056u1.m160858d(zza2);
            d2 = C39056u1.m160858d(24) + C39056u1.m160854G((C39076w3) value);
        }
        return d + d2;
    }

    /* renamed from: b */
    public final int mo122859b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f98835a.mo122812b(); i2++) {
            i += m160468o(this.f98835a.mo122820h(i2));
        }
        for (Map.Entry<T, Object> o : this.f98835a.mo122813c()) {
            i += m160468o(o);
        }
        return i;
    }

    /* renamed from: c */
    public final C38905e2<T> clone() {
        C38905e2<T> e2Var = new C38905e2<>();
        for (int i = 0; i < this.f98835a.mo122812b(); i++) {
            Map.Entry<T, Object> h = this.f98835a.mo122820h(i);
            e2Var.mo122868i((C38895d2) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f98835a.mo122813c()) {
            e2Var.mo122868i((C38895d2) next.getKey(), next.getValue());
        }
        e2Var.f98837c = this.f98837c;
        return e2Var;
    }

    /* renamed from: e */
    public final Object mo122862e(T t) {
        Object obj = this.f98835a.get(t);
        if (!(obj instanceof C38876b3)) {
            return obj;
        }
        C38876b3 b3Var = (C38876b3) obj;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38905e2)) {
            return false;
        }
        return this.f98835a.equals(((C38905e2) obj).f98835a);
    }

    /* renamed from: f */
    public final Iterator<Map.Entry<T, Object>> mo122864f() {
        if (this.f98837c) {
            return new C38866a3(this.f98835a.entrySet().iterator());
        }
        return this.f98835a.entrySet().iterator();
    }

    /* renamed from: g */
    public final void mo122865g() {
        if (!this.f98836b) {
            this.f98835a.mo122811a();
            this.f98836b = true;
        }
    }

    /* renamed from: h */
    public final void mo122866h(C38905e2<T> e2Var) {
        for (int i = 0; i < e2Var.f98835a.mo122812b(); i++) {
            mo122871m(e2Var.f98835a.mo122820h(i));
        }
        for (Map.Entry<T, Object> m : e2Var.f98835a.mo122813c()) {
            mo122871m(m);
        }
    }

    public final int hashCode() {
        return this.f98835a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if ((r7 instanceof byte[]) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r0 != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38876b3) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r5.f98837c = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r5.f98835a.put(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r6.zza()), r6.mo122833e().mo123221g(), r7.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38876b3) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39021q2) == false) goto L_0x0055;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122868i(T r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.mo122835h()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhp r0 = r6.mo122833e()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39084x2.m160969e(r7)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhp r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhp.DOUBLE
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq.INT
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq r0 = r0.mo123221g()
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
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39076w3
            if (r0 != 0) goto L_0x0049
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38876b3
            if (r0 == 0) goto L_0x0055
            goto L_0x0049
        L_0x0024:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0049
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39021q2
            if (r0 == 0) goto L_0x0055
            goto L_0x0049
        L_0x002d:
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc
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
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38876b3
            if (r0 == 0) goto L_0x004f
            r5.f98837c = r1
        L_0x004f:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.c5<T, java.lang.Object> r0 = r5.f98835a
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
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhp r6 = r6.mo122833e()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq r6 = r6.mo123221g()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38905e2.mo122868i(com.google.android.gms.internal.mlkit_vision_barcode_bundled.d2, java.lang.Object):void");
    }

    /* renamed from: j */
    public final boolean mo122869j() {
        return this.f98836b;
    }

    /* renamed from: k */
    public final boolean mo122870k() {
        for (int i = 0; i < this.f98835a.mo122812b(); i++) {
            if (!m160467n(this.f98835a.mo122820h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> n : this.f98835a.mo122813c()) {
            if (!m160467n(n)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final void mo122871m(Map.Entry<T, Object> entry) {
        Object obj;
        C38895d2 d2Var = (C38895d2) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof C38876b3)) {
            d2Var.mo122835h();
            if (d2Var.mo122834f() == zzhq.MESSAGE) {
                Object e = mo122862e(d2Var);
                if (e == null) {
                    this.f98835a.put(d2Var, m160466l(value));
                    return;
                }
                if (e instanceof C38877b4) {
                    obj = d2Var.mo122837u1((C38877b4) e, (C38877b4) value);
                } else {
                    C39067v3 f = ((C39076w3) e).mo122986f();
                    d2Var.mo122832W0(f, (C39076w3) value);
                    obj = f.mo122918q();
                }
                this.f98835a.put(d2Var, obj);
                return;
            }
            this.f98835a.put(d2Var, m160466l(value));
            return;
        }
        C38876b3 b3Var = (C38876b3) value;
        throw null;
    }

    public C38905e2(boolean z) {
        mo122865g();
        mo122865g();
    }
}
