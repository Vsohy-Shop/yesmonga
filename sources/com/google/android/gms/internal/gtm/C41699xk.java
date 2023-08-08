package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.gtm.xk */
public final class C41699xk<T> implements C41315hl<T> {

    /* renamed from: q */
    public static final int[] f105249q = new int[0];

    /* renamed from: r */
    public static final Unsafe f105250r = C41340im.m167754l();

    /* renamed from: a */
    public final int[] f105251a;

    /* renamed from: b */
    public final Object[] f105252b;

    /* renamed from: c */
    public final int f105253c;

    /* renamed from: d */
    public final int f105254d;

    /* renamed from: e */
    public final C41627uk f105255e;

    /* renamed from: f */
    public final boolean f105256f;

    /* renamed from: g */
    public final boolean f105257g;

    /* renamed from: h */
    public final boolean f105258h;

    /* renamed from: i */
    public final int[] f105259i;

    /* renamed from: j */
    public final int f105260j;

    /* renamed from: k */
    public final int f105261k;

    /* renamed from: l */
    public final C41338ik f105262l;

    /* renamed from: m */
    public final C41724yl<?, ?> f105263m;

    /* renamed from: n */
    public final C41697xi<?> f105264n;

    /* renamed from: o */
    public final C41147al f105265o;

    /* renamed from: p */
    public final C41507pk f105266p;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.gtm.uk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.google.android.gms.internal.gtm.al} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.gtm.pk} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.gtm.xi, com.google.android.gms.internal.gtm.xi<?>] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.gtm.ik] */
    /* JADX WARNING: type inference failed for: r3v13, types: [com.google.android.gms.internal.gtm.yl<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C41699xk(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.gtm.C41627uk r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.gtm.C41147al r17, com.google.android.gms.internal.gtm.C41338ik r18, com.google.android.gms.internal.gtm.C41724yl<?, ?> r19, com.google.android.gms.internal.gtm.C41697xi<?> r20, com.google.android.gms.internal.gtm.C41507pk r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.f105251a = r3
            r3 = r7
            r0.f105252b = r3
            r3 = r8
            r0.f105253c = r3
            r3 = r9
            r0.f105254d = r3
            boolean r3 = r1 instanceof com.google.android.gms.internal.gtm.C41410lj
            r0.f105257g = r3
            r3 = r11
            r0.f105258h = r3
            r3 = 0
            if (r2 == 0) goto L_0x0024
            boolean r4 = r2.mo136054i(r10)
            if (r4 == 0) goto L_0x0024
            r3 = 1
        L_0x0024:
            r0.f105256f = r3
            r3 = r13
            r0.f105259i = r3
            r3 = r14
            r0.f105260j = r3
            r3 = r15
            r0.f105261k = r3
            r3 = r16
            r0.f105265o = r3
            r3 = r17
            r0.f105262l = r3
            r3 = r18
            r0.f105263m = r3
            r0.f105264n = r2
            r0.f105255e = r1
            r1 = r20
            r0.f105266p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.gtm.uk, boolean, boolean, int[], int, int, com.google.android.gms.internal.gtm.al, com.google.android.gms.internal.gtm.ik, com.google.android.gms.internal.gtm.yl, com.google.android.gms.internal.gtm.xi, com.google.android.gms.internal.gtm.pk, byte[]):void");
    }

    /* renamed from: C */
    public static boolean m168781C(Object obj, int i, C41315hl hlVar) {
        return hlVar.mo135461g(C41340im.m167753k(obj, (long) (i & 1048575)));
    }

    /* renamed from: E */
    public static <T> boolean m168782E(T t, long j) {
        return ((Boolean) C41340im.m167753k(t, j)).booleanValue();
    }

    /* renamed from: H */
    public static final void m168783H(int i, Object obj, C41168bi biVar) throws IOException {
        if (obj instanceof String) {
            biVar.mo135088g(i, (String) obj);
        } else {
            biVar.mo135096p(i, (zztd) obj);
        }
    }

    /* renamed from: J */
    public static C41748zl m168784J(Object obj) {
        C41410lj ljVar = (C41410lj) obj;
        C41748zl zlVar = ljVar.zzc;
        if (zlVar != C41748zl.m168947c()) {
            return zlVar;
        }
        C41748zl e = C41748zl.m168949e();
        ljVar.zzc = e;
        return e;
    }

    /* renamed from: K */
    public static <T> C41699xk<T> m168785K(Class<T> cls, C41555rk rkVar, C41147al alVar, C41338ik ikVar, C41724yl<?, ?> ylVar, C41697xi<?> xiVar, C41507pk pkVar) {
        if (rkVar instanceof C41267fl) {
            return m168786L((C41267fl) rkVar, alVar, ikVar, ylVar, xiVar, pkVar);
        }
        C41676wl wlVar = (C41676wl) rkVar;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0391  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.android.gms.internal.gtm.C41699xk<T> m168786L(com.google.android.gms.internal.gtm.C41267fl r34, com.google.android.gms.internal.gtm.C41147al r35, com.google.android.gms.internal.gtm.C41338ik r36, com.google.android.gms.internal.gtm.C41724yl<?, ?> r37, com.google.android.gms.internal.gtm.C41697xi<?> r38, com.google.android.gms.internal.gtm.C41507pk r39) {
        /*
            int r0 = r34.mo135378d()
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r2
        L_0x000b:
            java.lang.String r0 = r34.mo135376a()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f105249q
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0166
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0166:
            sun.misc.Unsafe r15 = f105250r
            java.lang.Object[] r17 = r34.mo135377b()
            com.google.android.gms.internal.gtm.uk r18 = r34.zza()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0184:
            if (r4 >= r1) goto L_0x03cb
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ac
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0194:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a6
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0194
        L_0x01a6:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ae
        L_0x01ac:
            r3 = r24
        L_0x01ae:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01db
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bc:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d5
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01bc
        L_0x01d5:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01df
        L_0x01db:
            r28 = r1
            r1 = r24
        L_0x01df:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ed
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ed:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r14) goto L_0x0223
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0204:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021d
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r1 = r1 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0204
        L_0x021d:
            int r12 = r14 << r27
            r1 = r1 | r12
            r14 = r31
            goto L_0x0227
        L_0x0223:
            r32 = r12
            r14 = r27
        L_0x0227:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0248
            r14 = 17
            if (r12 != r14) goto L_0x0234
            goto L_0x0248
        L_0x0234:
            r14 = 12
            if (r12 != r14) goto L_0x0257
            if (r10 != 0) goto L_0x0257
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0255
        L_0x0248:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0255:
            r16 = r14
        L_0x0257:
            int r1 = r1 + r1
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0261
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0269
        L_0x0261:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m168792s(r2, r12)
            r17[r1] = r12
        L_0x0269:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r7 = (int) r7
            int r1 = r1 + 1
            r8 = r17[r1]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027c
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0284
        L_0x027c:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m168792s(r2, r8)
            r17[r1] = r8
        L_0x0284:
            r1 = r7
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r30 = r0
            r8 = r7
            r29 = r11
            r25 = 1
            r7 = r1
            r1 = 0
            goto L_0x0393
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m168792s(r2, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r3 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r8 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r8 != r11) goto L_0x0378
            r8 = 17
            if (r5 > r8) goto L_0x0378
            int r8 = r1 + 1
            char r1 = r0.charAt(r1)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r11) goto L_0x0354
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r11) goto L_0x0350
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r1 = r1 | r8
            int r26 = r26 + 13
            r8 = r27
            goto L_0x033e
        L_0x0350:
            int r8 = r8 << r26
            r1 = r1 | r8
            goto L_0x0356
        L_0x0354:
            r27 = r8
        L_0x0356:
            int r8 = r6 + r6
            int r26 = r1 / 32
            int r8 = r8 + r26
            r11 = r17[r8]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m168792s(r2, r11)
            r17[r8] = r11
        L_0x036f:
            r0 = r12
            long r11 = r15.objectFieldOffset(r11)
            int r8 = (int) r11
            int r1 = r1 % 32
            goto L_0x0380
        L_0x0378:
            r30 = r0
            r0 = r12
            r8 = r27
            r27 = r1
            r1 = 0
        L_0x0380:
            r11 = 18
            if (r5 < r11) goto L_0x0391
            r11 = 49
            if (r5 > r11) goto L_0x0391
            int r11 = r23 + 1
            r13[r23] = r7
            r16 = r0
            r23 = r11
            goto L_0x0393
        L_0x0391:
            r16 = r0
        L_0x0393:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r3 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x03a0
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03a1
        L_0x03a0:
            r9 = 0
        L_0x03a1:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03a8
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a9
        L_0x03a8:
            r3 = 0
        L_0x03a9:
            r3 = r3 | r9
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r7
            r31[r0] = r3
            int r9 = r4 + 1
            int r0 = r1 << 20
            r0 = r0 | r8
            r31[r4] = r0
            r8 = r14
            r14 = r24
            r4 = r27
            r1 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0184
        L_0x03cb:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.gtm.xk r0 = new com.google.android.gms.internal.gtm.xk
            r4 = r0
            com.google.android.gms.internal.gtm.uk r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.m168786L(com.google.android.gms.internal.gtm.fl, com.google.android.gms.internal.gtm.al, com.google.android.gms.internal.gtm.ik, com.google.android.gms.internal.gtm.yl, com.google.android.gms.internal.gtm.xi, com.google.android.gms.internal.gtm.pk):com.google.android.gms.internal.gtm.xk");
    }

    /* renamed from: M */
    public static <T> double m168787M(T t, long j) {
        return ((Double) C41340im.m167753k(t, j)).doubleValue();
    }

    /* renamed from: N */
    public static <T> float m168788N(T t, long j) {
        return ((Float) C41340im.m167753k(t, j)).floatValue();
    }

    /* renamed from: Q */
    public static <T> int m168789Q(T t, long j) {
        return ((Integer) C41340im.m167753k(t, j)).intValue();
    }

    /* renamed from: l */
    public static int m168790l(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: n */
    public static <T> long m168791n(T t, long j) {
        return ((Long) C41340im.m167753k(t, j)).longValue();
    }

    /* renamed from: s */
    public static Field m168792s(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: z */
    public static boolean m168793z(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: A */
    public final boolean mo136060A(T t, int i) {
        int X = mo136074X(i);
        long j = (long) (X & 1048575);
        if (j == 1048575) {
            int m = mo136076m(i);
            long j2 = (long) (m & 1048575);
            switch (m168790l(m)) {
                case 0:
                    if (C41340im.m167748f(t, j2) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (C41340im.m167749g(t, j2) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C41340im.m167751i(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C41340im.m167751i(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C41340im.m167750h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C41340im.m167751i(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C41340im.m167750h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C41340im.m167739B(t, j2);
                case 8:
                    Object k = C41340im.m167753k(t, j2);
                    if (k instanceof String) {
                        if (!((String) k).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(k instanceof zztd)) {
                        throw new IllegalArgumentException();
                    } else if (!zztd.f105744a.equals(k)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (C41340im.m167753k(t, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zztd.f105744a.equals(C41340im.m167753k(t, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (C41340im.m167750h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C41340im.m167750h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C41340im.m167750h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C41340im.m167751i(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C41340im.m167750h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C41340im.m167751i(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C41340im.m167753k(t, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((C41340im.m167750h(t, j) & (1 << (X >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: B */
    public final boolean mo136061B(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? mo136060A(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: D */
    public final boolean mo136062D(T t, int i, int i2) {
        if (C41340im.m167750h(t, (long) (mo136074X(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02e5, code lost:
        r15 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0483, code lost:
        r10 = r10 + 3;
        r8 = 1048575;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136063F(T r18, com.google.android.gms.internal.gtm.C41168bi r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f105256f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.gtm.xi<?> r3 = r0.f105264n
            com.google.android.gms.internal.gtm.bj r3 = r3.mo136047b(r1)
            com.google.android.gms.internal.gtm.vl<T, java.lang.Object> r5 = r3.f104470a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.mo135112f()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            int[] r6 = r0.f105251a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f105250r
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x0030:
            if (r10 >= r6) goto L_0x048a
            int r13 = r0.mo136076m(r10)
            int[] r14 = r0.f105251a
            r14 = r14[r10]
            int r15 = m168790l(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0058
            int[] r4 = r0.f105251a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0052
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0052:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0077
            com.google.android.gms.internal.gtm.xi<?> r9 = r0.f105264n
            int r9 = r9.mo136046a(r5)
            if (r9 > r14) goto L_0x0077
            com.google.android.gms.internal.gtm.xi<?> r9 = r0.f105264n
            r9.mo136055j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0075
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0059
        L_0x0075:
            r5 = 0
            goto L_0x0059
        L_0x0077:
            r9 = r13 & r8
            long r8 = (long) r9
            switch(r15) {
                case 0: goto L_0x0478;
                case 1: goto L_0x046c;
                case 2: goto L_0x0460;
                case 3: goto L_0x0454;
                case 4: goto L_0x0448;
                case 5: goto L_0x043c;
                case 6: goto L_0x0430;
                case 7: goto L_0x0424;
                case 8: goto L_0x0418;
                case 9: goto L_0x0407;
                case 10: goto L_0x03f8;
                case 11: goto L_0x03eb;
                case 12: goto L_0x03de;
                case 13: goto L_0x03d1;
                case 14: goto L_0x03c4;
                case 15: goto L_0x03b7;
                case 16: goto L_0x03aa;
                case 17: goto L_0x0399;
                case 18: goto L_0x0389;
                case 19: goto L_0x0379;
                case 20: goto L_0x0369;
                case 21: goto L_0x0359;
                case 22: goto L_0x0349;
                case 23: goto L_0x0339;
                case 24: goto L_0x0329;
                case 25: goto L_0x0319;
                case 26: goto L_0x030a;
                case 27: goto L_0x02f7;
                case 28: goto L_0x02e8;
                case 29: goto L_0x02d7;
                case 30: goto L_0x02c8;
                case 31: goto L_0x02b9;
                case 32: goto L_0x02aa;
                case 33: goto L_0x029b;
                case 34: goto L_0x028c;
                case 35: goto L_0x027c;
                case 36: goto L_0x026c;
                case 37: goto L_0x025c;
                case 38: goto L_0x024c;
                case 39: goto L_0x023c;
                case 40: goto L_0x022c;
                case 41: goto L_0x021c;
                case 42: goto L_0x020c;
                case 43: goto L_0x01fc;
                case 44: goto L_0x01ec;
                case 45: goto L_0x01dc;
                case 46: goto L_0x01cc;
                case 47: goto L_0x01bc;
                case 48: goto L_0x01ac;
                case 49: goto L_0x0199;
                case 50: goto L_0x0190;
                case 51: goto L_0x0181;
                case 52: goto L_0x0172;
                case 53: goto L_0x0163;
                case 54: goto L_0x0154;
                case 55: goto L_0x0145;
                case 56: goto L_0x0136;
                case 57: goto L_0x0127;
                case 58: goto L_0x0118;
                case 59: goto L_0x0109;
                case 60: goto L_0x00f6;
                case 61: goto L_0x00e6;
                case 62: goto L_0x00d8;
                case 63: goto L_0x00ca;
                case 64: goto L_0x00bc;
                case 65: goto L_0x00ae;
                case 66: goto L_0x00a0;
                case 67: goto L_0x0092;
                case 68: goto L_0x0080;
                default: goto L_0x007d;
            }
        L_0x007d:
            r15 = 0
            goto L_0x0483
        L_0x0080:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.hl r8 = r0.mo136078p(r10)
            r2.mo135072C(r14, r4, r8)
            goto L_0x007d
        L_0x0092:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            long r8 = m168791n(r1, r8)
            r2.mo135085d(r14, r8)
            goto L_0x007d
        L_0x00a0:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m168789Q(r1, r8)
            r2.mo135083b(r14, r4)
            goto L_0x007d
        L_0x00ae:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            long r8 = m168791n(r1, r8)
            r2.mo135081L(r14, r8)
            goto L_0x007d
        L_0x00bc:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m168789Q(r1, r8)
            r2.mo135079J(r14, r4)
            goto L_0x007d
        L_0x00ca:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m168789Q(r1, r8)
            r2.mo135101u(r14, r4)
            goto L_0x007d
        L_0x00d8:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m168789Q(r1, r8)
            r2.mo135090i(r14, r4)
            goto L_0x007d
        L_0x00e6:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            r2.mo135096p(r14, r4)
            goto L_0x007d
        L_0x00f6:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.hl r8 = r0.mo136078p(r10)
            r2.mo135077H(r14, r4, r8)
            goto L_0x007d
        L_0x0109:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r7.getObject(r1, r8)
            m168783H(r14, r4, r2)
            goto L_0x007d
        L_0x0118:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            boolean r4 = m168782E(r1, r8)
            r2.mo135094n(r14, r4)
            goto L_0x007d
        L_0x0127:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m168789Q(r1, r8)
            r2.mo135103w(r14, r4)
            goto L_0x007d
        L_0x0136:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            long r8 = m168791n(r1, r8)
            r2.mo135105y(r14, r8)
            goto L_0x007d
        L_0x0145:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m168789Q(r1, r8)
            r2.mo135073D(r14, r4)
            goto L_0x007d
        L_0x0154:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            long r8 = m168791n(r1, r8)
            r2.mo135092k(r14, r8)
            goto L_0x007d
        L_0x0163:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            long r8 = m168791n(r1, r8)
            r2.mo135075F(r14, r8)
            goto L_0x007d
        L_0x0172:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            float r4 = m168788N(r1, r8)
            r2.mo135070A(r14, r4)
            goto L_0x007d
        L_0x0181:
            boolean r4 = r0.mo136062D(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            double r8 = m168787M(r1, r8)
            r2.mo135098r(r14, r8)
            goto L_0x007d
        L_0x0190:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo136064G(r2, r14, r4, r10)
            goto L_0x007d
        L_0x0199:
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.hl r9 = r0.mo136078p(r10)
            com.google.android.gms.internal.gtm.C41363jl.m167842q(r4, r8, r2, r9)
            goto L_0x007d
        L_0x01ac:
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r14 = 1
            com.google.android.gms.internal.gtm.C41363jl.m167849x(r4, r8, r2, r14)
            goto L_0x007d
        L_0x01bc:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167848w(r4, r8, r2, r14)
            goto L_0x007d
        L_0x01cc:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167847v(r4, r8, r2, r14)
            goto L_0x007d
        L_0x01dc:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167846u(r4, r8, r2, r14)
            goto L_0x007d
        L_0x01ec:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167838m(r4, r8, r2, r14)
            goto L_0x007d
        L_0x01fc:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167851z(r4, r8, r2, r14)
            goto L_0x007d
        L_0x020c:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167835j(r4, r8, r2, r14)
            goto L_0x007d
        L_0x021c:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167839n(r4, r8, r2, r14)
            goto L_0x007d
        L_0x022c:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167840o(r4, r8, r2, r14)
            goto L_0x007d
        L_0x023c:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167843r(r4, r8, r2, r14)
            goto L_0x007d
        L_0x024c:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167799B(r4, r8, r2, r14)
            goto L_0x007d
        L_0x025c:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167844s(r4, r8, r2, r14)
            goto L_0x007d
        L_0x026c:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167841p(r4, r8, r2, r14)
            goto L_0x007d
        L_0x027c:
            r14 = 1
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167837l(r4, r8, r2, r14)
            goto L_0x007d
        L_0x028c:
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.gtm.C41363jl.m167849x(r4, r8, r2, r14)
            goto L_0x02e5
        L_0x029b:
            r14 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167848w(r4, r8, r2, r14)
            goto L_0x02e5
        L_0x02aa:
            r14 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167847v(r4, r8, r2, r14)
            goto L_0x02e5
        L_0x02b9:
            r14 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167846u(r4, r8, r2, r14)
            goto L_0x02e5
        L_0x02c8:
            r14 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167838m(r4, r8, r2, r14)
            goto L_0x02e5
        L_0x02d7:
            r14 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167851z(r4, r8, r2, r14)
        L_0x02e5:
            r15 = r14
            goto L_0x0483
        L_0x02e8:
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167836k(r4, r8, r2)
            goto L_0x007d
        L_0x02f7:
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.hl r9 = r0.mo136078p(r10)
            com.google.android.gms.internal.gtm.C41363jl.m167845t(r4, r8, r2, r9)
            goto L_0x007d
        L_0x030a:
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167850y(r4, r8, r2)
            goto L_0x007d
        L_0x0319:
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.gtm.C41363jl.m167835j(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0329:
            r15 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167839n(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0339:
            r15 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167840o(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0349:
            r15 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167843r(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0359:
            r15 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167799B(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0369:
            r15 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167844s(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0379:
            r15 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167841p(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0389:
            r15 = 0
            int[] r4 = r0.f105251a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.C41363jl.m167837l(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0399:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.hl r8 = r0.mo136078p(r10)
            r2.mo135072C(r14, r4, r8)
            goto L_0x0483
        L_0x03aa:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            long r8 = r7.getLong(r1, r8)
            r2.mo135085d(r14, r8)
            goto L_0x0483
        L_0x03b7:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo135083b(r14, r4)
            goto L_0x0483
        L_0x03c4:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            long r8 = r7.getLong(r1, r8)
            r2.mo135081L(r14, r8)
            goto L_0x0483
        L_0x03d1:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo135079J(r14, r4)
            goto L_0x0483
        L_0x03de:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo135101u(r14, r4)
            goto L_0x0483
        L_0x03eb:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo135090i(r14, r4)
            goto L_0x0483
        L_0x03f8:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            r2.mo135096p(r14, r4)
            goto L_0x0483
        L_0x0407:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.hl r8 = r0.mo136078p(r10)
            r2.mo135077H(r14, r4, r8)
            goto L_0x0483
        L_0x0418:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            java.lang.Object r4 = r7.getObject(r1, r8)
            m168783H(r14, r4, r2)
            goto L_0x0483
        L_0x0424:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            boolean r4 = com.google.android.gms.internal.gtm.C41340im.m167739B(r1, r8)
            r2.mo135094n(r14, r4)
            goto L_0x0483
        L_0x0430:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo135103w(r14, r4)
            goto L_0x0483
        L_0x043c:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            long r8 = r7.getLong(r1, r8)
            r2.mo135105y(r14, r8)
            goto L_0x0483
        L_0x0448:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo135073D(r14, r4)
            goto L_0x0483
        L_0x0454:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            long r8 = r7.getLong(r1, r8)
            r2.mo135092k(r14, r8)
            goto L_0x0483
        L_0x0460:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            long r8 = r7.getLong(r1, r8)
            r2.mo135075F(r14, r8)
            goto L_0x0483
        L_0x046c:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            float r4 = com.google.android.gms.internal.gtm.C41340im.m167749g(r1, r8)
            r2.mo135070A(r14, r4)
            goto L_0x0483
        L_0x0478:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            double r8 = com.google.android.gms.internal.gtm.C41340im.m167748f(r1, r8)
            r2.mo135098r(r14, r8)
        L_0x0483:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0030
        L_0x048a:
            if (r5 == 0) goto L_0x04a1
            com.google.android.gms.internal.gtm.xi<?> r4 = r0.f105264n
            r4.mo136055j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x048a
        L_0x049f:
            r5 = 0
            goto L_0x048a
        L_0x04a1:
            com.google.android.gms.internal.gtm.yl<?, ?> r3 = r0.f105263m
            java.lang.Object r1 = r3.mo135042d(r1)
            r3.mo135056s(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.mo136063F(java.lang.Object, com.google.android.gms.internal.gtm.bi):void");
    }

    /* renamed from: G */
    public final <K, V> void mo136064G(C41168bi biVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            C41483ok okVar = (C41483ok) mo136080r(i2);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0331, code lost:
        if (r0 != r3) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x034c, code lost:
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0378, code lost:
        if (r0 != r14) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0399, code lost:
        if (r0 != r14) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0517, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x052a, code lost:
        r2 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d4, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x022c, code lost:
        r5 = r6 | r27;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x024a, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0266, code lost:
        r5 = r6 | r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0268, code lost:
        r3 = r8;
        r1 = r11;
        r6 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0282, code lost:
        r15 = r36;
        r18 = r1;
        r17 = r8;
        r29 = r10;
        r7 = r11;
        r24 = r26;
        r30 = r21;
        r21 = r6;
        r6 = r30;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo136065I(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.gtm.C41167bh r37) throws java.io.IOException {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r9 = r37
            sun.misc.Unsafe r10 = f105250r
            r16 = 0
            r0 = r34
            r1 = r16
            r3 = r1
            r5 = r3
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x0585
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167285k(r0, r12, r1, r9)
            int r1 = r9.f104464a
            goto L_0x002e
        L_0x0029:
            r30 = r1
            r1 = r0
            r0 = r30
        L_0x002e:
            int r8 = r1 >>> 3
            r7 = r1 & 7
            r4 = 3
            if (r8 <= r2) goto L_0x003b
            int r3 = r3 / r4
            int r2 = r15.mo136073W(r8, r3)
            goto L_0x003f
        L_0x003b:
            int r2 = r15.mo136072V(r8)
        L_0x003f:
            r19 = 0
            r4 = -1
            if (r2 != r4) goto L_0x0055
            r2 = r0
            r7 = r1
            r23 = r4
            r21 = r5
            r24 = r8
            r29 = r10
            r15 = r11
            r17 = r16
            r18 = 1
            goto L_0x039c
        L_0x0055:
            int[] r3 = r15.f105251a
            int r23 = r2 + 1
            r3 = r3[r23]
            int r11 = m168790l(r3)
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r3 & r17
            r24 = r3
            long r3 = (long) r4
            r25 = r1
            r1 = 17
            r26 = r8
            if (r11 > r1) goto L_0x0295
            int[] r1 = r15.f105251a
            int r27 = r2 + 2
            r1 = r1[r27]
            int r27 = r1 >>> 20
            r22 = 1
            int r27 = r22 << r27
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r8
            if (r1 == r6) goto L_0x008e
            if (r6 == r8) goto L_0x0087
            long r8 = (long) r6
            r10.putInt(r14, r8, r5)
        L_0x0087:
            long r5 = (long) r1
            int r5 = r10.getInt(r14, r5)
            r8 = r1
            goto L_0x008f
        L_0x008e:
            r8 = r6
        L_0x008f:
            r6 = r5
            r1 = 5
            switch(r11) {
                case 0: goto L_0x024c;
                case 1: goto L_0x0230;
                case 2: goto L_0x020f;
                case 3: goto L_0x020f;
                case 4: goto L_0x01f8;
                case 5: goto L_0x01d7;
                case 6: goto L_0x01be;
                case 7: goto L_0x01a0;
                case 8: goto L_0x017e;
                case 9: goto L_0x0150;
                case 10: goto L_0x0139;
                case 11: goto L_0x01f8;
                case 12: goto L_0x0107;
                case 13: goto L_0x01be;
                case 14: goto L_0x01d7;
                case 15: goto L_0x00ed;
                case 16: goto L_0x00c1;
                default: goto L_0x0094;
            }
        L_0x0094:
            r9 = r37
            r21 = r8
            r11 = r25
            r1 = 1
            r23 = -1
            r8 = r2
            r2 = r0
            r0 = 3
            if (r7 != r0) goto L_0x0282
            com.google.android.gms.internal.gtm.hl r0 = r15.mo136078p(r8)
            int r1 = r26 << 3
            r5 = r1 | 4
            r1 = r33
            r12 = r3
            r3 = r35
            r4 = r5
            r5 = r37
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167277c(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r27
            if (r1 != 0) goto L_0x026e
            java.lang.Object r1 = r9.f104466c
            r10.putObject(r14, r12, r1)
            goto L_0x027b
        L_0x00c1:
            if (r7 != 0) goto L_0x00e2
            r9 = r37
            int r7 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r12, r0, r9)
            long r0 = r9.f104465b
            long r18 = com.google.android.gms.internal.gtm.C41672wh.m168668m(r0)
            r0 = r10
            r11 = r25
            r1 = r32
            r5 = r2
            r2 = r3
            r21 = r8
            r23 = -1
            r8 = r5
            r4 = r18
            r0.putLong(r1, r2, r4)
            goto L_0x022c
        L_0x00e2:
            r9 = r37
            r21 = r8
            r11 = r25
            r23 = -1
            r8 = r2
            goto L_0x01d4
        L_0x00ed:
            r9 = r37
            r21 = r8
            r11 = r25
            r23 = -1
            r8 = r2
            if (r7 != 0) goto L_0x01d4
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r12, r0, r9)
            int r1 = r9.f104464a
            int r1 = com.google.android.gms.internal.gtm.C41672wh.m168667l(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x0266
        L_0x0107:
            r9 = r37
            r21 = r8
            r11 = r25
            r23 = -1
            r8 = r2
            if (r7 != 0) goto L_0x01d4
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r12, r0, r9)
            int r1 = r9.f104464a
            com.google.android.gms.internal.gtm.qj r2 = r15.mo136077o(r8)
            if (r2 == 0) goto L_0x0134
            boolean r2 = r2.mo135344l(r1)
            if (r2 == 0) goto L_0x0125
            goto L_0x0134
        L_0x0125:
            com.google.android.gms.internal.gtm.zl r2 = m168784J(r32)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo136131h(r11, r1)
            r5 = r6
            goto L_0x0268
        L_0x0134:
            r10.putInt(r14, r3, r1)
            goto L_0x0266
        L_0x0139:
            r9 = r37
            r21 = r8
            r11 = r25
            r1 = 2
            r23 = -1
            r8 = r2
            if (r7 != r1) goto L_0x01d4
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167275a(r12, r0, r9)
            java.lang.Object r1 = r9.f104466c
            r10.putObject(r14, r3, r1)
            goto L_0x0266
        L_0x0150:
            r9 = r37
            r21 = r8
            r11 = r25
            r1 = 2
            r23 = -1
            r8 = r2
            if (r7 != r1) goto L_0x01d4
            com.google.android.gms.internal.gtm.hl r1 = r15.mo136078p(r8)
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167278d(r1, r12, r0, r13, r9)
            r1 = r6 & r27
            if (r1 != 0) goto L_0x016f
            java.lang.Object r1 = r9.f104466c
            r10.putObject(r14, r3, r1)
            goto L_0x0266
        L_0x016f:
            java.lang.Object r1 = r10.getObject(r14, r3)
            java.lang.Object r2 = r9.f104466c
            java.lang.Object r1 = com.google.android.gms.internal.gtm.C41650vj.m168605g(r1, r2)
            r10.putObject(r14, r3, r1)
            goto L_0x0266
        L_0x017e:
            r9 = r37
            r21 = r8
            r11 = r25
            r1 = 2
            r23 = -1
            r8 = r2
            if (r7 != r1) goto L_0x01d4
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r24 & r1
            if (r1 != 0) goto L_0x0195
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167281g(r12, r0, r9)
            goto L_0x0199
        L_0x0195:
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167282h(r12, r0, r9)
        L_0x0199:
            java.lang.Object r1 = r9.f104466c
            r10.putObject(r14, r3, r1)
            goto L_0x0266
        L_0x01a0:
            r9 = r37
            r21 = r8
            r11 = r25
            r23 = -1
            r8 = r2
            if (r7 != 0) goto L_0x01d4
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r12, r0, r9)
            long r1 = r9.f104465b
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 == 0) goto L_0x01b7
            r1 = 1
            goto L_0x01b9
        L_0x01b7:
            r1 = r16
        L_0x01b9:
            com.google.android.gms.internal.gtm.C41340im.m167760r(r14, r3, r1)
            goto L_0x0266
        L_0x01be:
            r9 = r37
            r21 = r8
            r11 = r25
            r23 = -1
            r8 = r2
            if (r7 != r1) goto L_0x01d4
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r12, r0)
            r10.putInt(r14, r3, r1)
            int r0 = r0 + 4
            goto L_0x0266
        L_0x01d4:
            r2 = r0
            goto L_0x024a
        L_0x01d7:
            r9 = r37
            r21 = r8
            r11 = r25
            r1 = 1
            r23 = -1
            r8 = r2
            if (r7 != r1) goto L_0x01f5
            long r18 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r12, r0)
            r7 = r0
            r0 = r10
            r1 = r32
            r2 = r3
            r4 = r18
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0266
        L_0x01f5:
            r2 = r0
            goto L_0x0282
        L_0x01f8:
            r9 = r37
            r21 = r8
            r11 = r25
            r23 = -1
            r8 = r2
            r2 = r0
            if (r7 != 0) goto L_0x024a
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r12, r2, r9)
            int r1 = r9.f104464a
            r10.putInt(r14, r3, r1)
            goto L_0x0266
        L_0x020f:
            r9 = r37
            r21 = r8
            r11 = r25
            r23 = -1
            r8 = r2
            r2 = r0
            if (r7 != 0) goto L_0x024a
            int r7 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r12, r2, r9)
            long r1 = r9.f104465b
            r0 = r10
            r18 = r1
            r1 = r32
            r2 = r3
            r4 = r18
            r0.putLong(r1, r2, r4)
        L_0x022c:
            r5 = r6 | r27
            r0 = r7
            goto L_0x0268
        L_0x0230:
            r9 = r37
            r21 = r8
            r11 = r25
            r23 = -1
            r8 = r2
            r2 = r0
            if (r7 != r1) goto L_0x024a
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.gtm.C41340im.m167763u(r14, r3, r0)
            int r0 = r2 + 4
            goto L_0x0266
        L_0x024a:
            r1 = 1
            goto L_0x0282
        L_0x024c:
            r9 = r37
            r21 = r8
            r11 = r25
            r1 = 1
            r23 = -1
            r8 = r2
            r2 = r0
            if (r7 != r1) goto L_0x0282
            long r0 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.gtm.C41340im.m167762t(r14, r3, r0)
            int r0 = r2 + 8
        L_0x0266:
            r5 = r6 | r27
        L_0x0268:
            r3 = r8
            r1 = r11
            r6 = r21
            goto L_0x02e3
        L_0x026e:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.f104466c
            java.lang.Object r1 = com.google.android.gms.internal.gtm.C41650vj.m168605g(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x027b:
            r5 = r6 | r27
            r12 = r33
            r13 = r35
            goto L_0x0268
        L_0x0282:
            r15 = r36
            r18 = r1
            r17 = r8
            r29 = r10
            r7 = r11
            r24 = r26
            r30 = r21
            r21 = r6
            r6 = r30
            goto L_0x039c
        L_0x0295:
            r8 = r2
            r12 = r3
            r4 = r25
            r1 = 1
            r23 = -1
            r2 = r0
            r0 = 27
            if (r11 != r0) goto L_0x02fc
            r0 = 2
            if (r7 != r0) goto L_0x02e9
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.gtm.uj r0 = (com.google.android.gms.internal.gtm.C41626uj) r0
            boolean r1 = r0.mo135928d()
            if (r1 != 0) goto L_0x02c2
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02b9
            r3 = 10
            goto L_0x02bb
        L_0x02b9:
            int r3 = r1 + r1
        L_0x02bb:
            com.google.android.gms.internal.gtm.uj r0 = r0.mo135130n(r3)
            r10.putObject(r14, r12, r0)
        L_0x02c2:
            r7 = r0
            com.google.android.gms.internal.gtm.hl r0 = r15.mo136078p(r8)
            r1 = r4
            r3 = r2
            r2 = r33
            r11 = r4
            r4 = r35
            r21 = r5
            r5 = r7
            r22 = r6
            r6 = r37
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167279e(r0, r1, r2, r3, r4, r5, r6)
            r12 = r33
            r13 = r35
            r3 = r8
            r1 = r11
            r5 = r21
            r6 = r22
        L_0x02e3:
            r2 = r26
            r11 = r36
            goto L_0x001a
        L_0x02e9:
            r21 = r5
            r22 = r6
            r15 = r36
            r18 = r1
            r14 = r2
            r34 = r4
            r17 = r8
            r29 = r10
            r24 = r26
            goto L_0x037b
        L_0x02fc:
            r3 = r2
            r21 = r5
            r22 = r6
            r6 = r4
            r0 = 49
            if (r11 > r0) goto L_0x0350
            r4 = r24
            long r4 = (long) r4
            r0 = r31
            r24 = r1
            r1 = r32
            r2 = r33
            r25 = r3
            r27 = r4
            r18 = r24
            r5 = 0
            r4 = r35
            r5 = r6
            r34 = r6
            r6 = r26
            r17 = r8
            r24 = r26
            r29 = r10
            r9 = r27
            r15 = r36
            r14 = r37
            int r0 = r0.mo136071U(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r25
            if (r0 == r14) goto L_0x034c
        L_0x0333:
            r14 = r32
            r12 = r33
            r1 = r34
            r13 = r35
            r9 = r37
            r11 = r15
            r3 = r17
            r5 = r21
            r6 = r22
            r2 = r24
            r10 = r29
            r15 = r31
            goto L_0x001a
        L_0x034c:
            r7 = r34
            r2 = r0
            goto L_0x037e
        L_0x0350:
            r15 = r36
            r18 = r1
            r14 = r3
            r34 = r6
            r17 = r8
            r29 = r10
            r4 = r24
            r24 = r26
            r0 = 50
            if (r11 != r0) goto L_0x0381
            r0 = 2
            if (r7 != r0) goto L_0x037b
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r14
            r4 = r35
            r5 = r17
            r6 = r12
            r8 = r37
            int r0 = r0.mo136068R(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x034c
            goto L_0x0333
        L_0x037b:
            r7 = r34
            r2 = r14
        L_0x037e:
            r6 = r22
            goto L_0x039c
        L_0x0381:
            r0 = r31
            r1 = r32
            r2 = r33
            r8 = r4
            r3 = r14
            r4 = r35
            r5 = r34
            r6 = r24
            r9 = r11
            r10 = r12
            r12 = r17
            r13 = r37
            int r0 = r0.mo136069S(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x034c
            goto L_0x0333
        L_0x039c:
            if (r7 != r15) goto L_0x03b1
            if (r15 == 0) goto L_0x03b1
            r8 = r31
            r13 = r32
            r0 = r2
            r2 = r6
            r1 = r7
            r9 = r15
            r5 = r21
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r35
            goto L_0x0594
        L_0x03b1:
            r8 = r31
            r9 = r15
            boolean r0 = r8.f105256f
            if (r0 == 0) goto L_0x0558
            r10 = r37
            com.google.android.gms.internal.gtm.wi r0 = r10.f104467d
            com.google.android.gms.internal.gtm.wi r1 = com.google.android.gms.internal.gtm.C41673wi.m168680a()
            if (r0 == r1) goto L_0x0553
            com.google.android.gms.internal.gtm.uk r0 = r8.f105255e
            com.google.android.gms.internal.gtm.yl<?, ?> r1 = r8.f105263m
            com.google.android.gms.internal.gtm.wi r3 = r10.f104467d
            r11 = r24
            com.google.android.gms.internal.gtm.jj r12 = r3.mo135788c(r0, r11)
            if (r12 != 0) goto L_0x03e9
            com.google.android.gms.internal.gtm.zl r4 = m168784J(r32)
            r0 = r7
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167283i(r0, r1, r2, r3, r4, r5)
            r13 = r32
            r15 = r33
        L_0x03e3:
            r34 = r6
            r6 = r35
            goto L_0x0573
        L_0x03e9:
            r13 = r32
            r0 = r13
            com.google.android.gms.internal.gtm.hj r0 = (com.google.android.gms.internal.gtm.C41313hj) r0
            r0.mo135451C()
            com.google.android.gms.internal.gtm.bj<com.google.android.gms.internal.gtm.ij> r14 = r0.zza
            com.google.android.gms.internal.gtm.ij r3 = r12.f104718d
            com.google.android.gms.internal.gtm.zzye r3 = r3.f104681c
            com.google.android.gms.internal.gtm.zzye r4 = com.google.android.gms.internal.gtm.zzye.ENUM
            if (r3 != r4) goto L_0x0429
            r15 = r33
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r15, r2, r10)
            com.google.android.gms.internal.gtm.ij r3 = r12.f104718d
            com.google.android.gms.internal.gtm.pj<?> r3 = r3.f104679a
            int r3 = r10.f104464a
            com.google.android.gms.internal.gtm.zzyl r3 = com.google.android.gms.internal.gtm.zzyl.m169016q(r3)
            if (r3 != 0) goto L_0x0422
            com.google.android.gms.internal.gtm.zl r3 = r0.zzc
            com.google.android.gms.internal.gtm.zl r4 = com.google.android.gms.internal.gtm.C41748zl.m168947c()
            if (r3 != r4) goto L_0x041b
            com.google.android.gms.internal.gtm.zl r3 = com.google.android.gms.internal.gtm.C41748zl.m168949e()
            r0.zzc = r3
        L_0x041b:
            int r0 = r10.f104464a
            com.google.android.gms.internal.gtm.C41363jl.m167829d(r11, r0, r3, r1)
            r0 = r2
            goto L_0x03e3
        L_0x0422:
            int r0 = r10.f104464a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x0465
        L_0x0429:
            r15 = r33
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L_0x051a;
                case 1: goto L_0x0507;
                case 2: goto L_0x04f8;
                case 3: goto L_0x04f8;
                case 4: goto L_0x04e9;
                case 5: goto L_0x04dc;
                case 6: goto L_0x04cf;
                case 7: goto L_0x04b7;
                case 8: goto L_0x04ab;
                case 9: goto L_0x0486;
                case 10: goto L_0x046b;
                case 11: goto L_0x045f;
                case 12: goto L_0x04e9;
                case 13: goto L_0x0457;
                case 14: goto L_0x04cf;
                case 15: goto L_0x04dc;
                case 16: goto L_0x0448;
                case 17: goto L_0x0439;
                default: goto L_0x0432;
            }
        L_0x0432:
            r34 = r6
            r6 = r35
            r4 = 0
            goto L_0x052c
        L_0x0439:
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r15, r2, r10)
            long r0 = r10.f104465b
            long r0 = com.google.android.gms.internal.gtm.C41672wh.m168668m(r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x0465
        L_0x0448:
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r15, r2, r10)
            int r0 = r10.f104464a
            int r0 = com.google.android.gms.internal.gtm.C41672wh.m168667l(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x0465
        L_0x0457:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x045f:
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167275a(r15, r2, r10)
            java.lang.Object r4 = r10.f104466c
        L_0x0465:
            r34 = r6
            r6 = r35
            goto L_0x052c
        L_0x046b:
            com.google.android.gms.internal.gtm.dl r0 = com.google.android.gms.internal.gtm.C41219dl.m167407a()
            com.google.android.gms.internal.gtm.uk r1 = r12.f104717c
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.gtm.hl r0 = r0.mo135299b(r1)
            r5 = r35
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167278d(r0, r15, r2, r5, r10)
            java.lang.Object r4 = r10.f104466c
            r34 = r6
            r6 = r5
            goto L_0x052c
        L_0x0486:
            r5 = r35
            com.google.android.gms.internal.gtm.dl r0 = com.google.android.gms.internal.gtm.C41219dl.m167407a()
            com.google.android.gms.internal.gtm.uk r1 = r12.f104717c
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.gtm.hl r0 = r0.mo135299b(r1)
            int r1 = r11 << 3
            r4 = r1 | 4
            r1 = r33
            r3 = r35
            r34 = r6
            r6 = r5
            r5 = r37
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167277c(r0, r1, r2, r3, r4, r5)
            java.lang.Object r4 = r10.f104466c
            goto L_0x052c
        L_0x04ab:
            r34 = r6
            r6 = r35
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167281g(r15, r2, r10)
            java.lang.Object r4 = r10.f104466c
            goto L_0x052c
        L_0x04b7:
            r34 = r6
            r6 = r35
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r15, r2, r10)
            long r0 = r10.f104465b
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x04c8
            r4 = r18
            goto L_0x04ca
        L_0x04c8:
            r4 = r16
        L_0x04ca:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x052c
        L_0x04cf:
            r34 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r15, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x0517
        L_0x04dc:
            r34 = r6
            r6 = r35
            long r0 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r15, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x052a
        L_0x04e9:
            r34 = r6
            r6 = r35
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r15, r2, r10)
            int r0 = r10.f104464a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x052c
        L_0x04f8:
            r34 = r6
            r6 = r35
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r15, r2, r10)
            long r0 = r10.f104465b
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x052c
        L_0x0507:
            r34 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r15, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
        L_0x0517:
            int r2 = r2 + 4
            goto L_0x052c
        L_0x051a:
            r34 = r6
            r6 = r35
            long r0 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r15, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
        L_0x052a:
            int r2 = r2 + 8
        L_0x052c:
            r12.mo135518a()
            com.google.android.gms.internal.gtm.ij r0 = r12.f104718d
            com.google.android.gms.internal.gtm.zzye r0 = r0.f104681c
            int r0 = r0.ordinal()
            r1 = 9
            if (r0 == r1) goto L_0x0540
            r1 = 10
            if (r0 == r1) goto L_0x0540
            goto L_0x054c
        L_0x0540:
            com.google.android.gms.internal.gtm.ij r0 = r12.f104718d
            java.lang.Object r0 = r14.mo135110e(r0)
            if (r0 == 0) goto L_0x054c
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41650vj.m168605g(r0, r4)
        L_0x054c:
            com.google.android.gms.internal.gtm.ij r0 = r12.f104718d
            r14.mo135116i(r0, r4)
            r0 = r2
            goto L_0x0573
        L_0x0553:
            r13 = r32
            r15 = r33
            goto L_0x055e
        L_0x0558:
            r13 = r32
            r15 = r33
            r10 = r37
        L_0x055e:
            r34 = r6
            r11 = r24
            r6 = r35
            com.google.android.gms.internal.gtm.zl r4 = m168784J(r32)
            r0 = r7
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167283i(r0, r1, r2, r3, r4, r5)
        L_0x0573:
            r1 = r7
            r2 = r11
            r14 = r13
            r12 = r15
            r3 = r17
            r5 = r21
            r13 = r6
            r15 = r8
            r11 = r9
            r9 = r10
            r10 = r29
            r6 = r34
            goto L_0x001a
        L_0x0585:
            r21 = r5
            r22 = r6
            r29 = r10
            r9 = r11
            r6 = r13
            r13 = r14
            r8 = r15
            r2 = r22
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0594:
            if (r2 == r3) goto L_0x059c
            long r2 = (long) r2
            r4 = r29
            r4.putInt(r13, r2, r5)
        L_0x059c:
            int r2 = r8.f105260j
        L_0x059e:
            int r3 = r8.f105261k
            if (r2 >= r3) goto L_0x05af
            int[] r3 = r8.f105259i
            r3 = r3[r2]
            com.google.android.gms.internal.gtm.yl<?, ?> r4 = r8.f105263m
            r5 = 0
            r8.mo136079q(r13, r3, r5, r4)
            int r2 = r2 + 1
            goto L_0x059e
        L_0x05af:
            if (r9 != 0) goto L_0x05b9
            if (r0 != r6) goto L_0x05b4
            goto L_0x05bd
        L_0x05b4:
            com.google.android.gms.internal.gtm.zzvk r0 = com.google.android.gms.internal.gtm.zzvk.m169000g()
            throw r0
        L_0x05b9:
            if (r0 > r6) goto L_0x05be
            if (r1 != r9) goto L_0x05be
        L_0x05bd:
            return r0
        L_0x05be:
            com.google.android.gms.internal.gtm.zzvk r0 = com.google.android.gms.internal.gtm.zzvk.m169000g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.mo136065I(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.gtm.bh):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0302, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0469, code lost:
        r8 = r8 + (r9 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b3, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04de, code lost:
        r8 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04df, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0506, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0513, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0521, code lost:
        r7 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0525, code lost:
        r3 = r3 + 3;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo136066O(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f105250r
            r1 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r2
        L_0x000a:
            int[] r7 = r14.f105251a
            int r7 = r7.length
            if (r3 >= r7) goto L_0x0529
            int r7 = r14.mo136076m(r3)
            int[] r8 = r14.f105251a
            r8 = r8[r3]
            int r9 = m168790l(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0035
            int[] r10 = r14.f105251a
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r2
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0036
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0036
        L_0x0035:
            r10 = r1
        L_0x0036:
            r7 = r7 & r2
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0517;
                case 1: goto L_0x0509;
                case 2: goto L_0x04f4;
                case 3: goto L_0x04e1;
                case 4: goto L_0x04cc;
                case 5: goto L_0x04c1;
                case 6: goto L_0x04b6;
                case 7: goto L_0x04a9;
                case 8: goto L_0x047f;
                case 9: goto L_0x046d;
                case 10: goto L_0x0451;
                case 11: goto L_0x043d;
                case 12: goto L_0x0429;
                case 13: goto L_0x041d;
                case 14: goto L_0x0411;
                case 15: goto L_0x03f8;
                case 16: goto L_0x03e0;
                case 17: goto L_0x03cd;
                case 18: goto L_0x03c0;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03aa;
                case 21: goto L_0x039f;
                case 22: goto L_0x0394;
                case 23: goto L_0x0389;
                case 24: goto L_0x037e;
                case 25: goto L_0x0373;
                case 26: goto L_0x0368;
                case 27: goto L_0x0359;
                case 28: goto L_0x034d;
                case 29: goto L_0x0341;
                case 30: goto L_0x0335;
                case 31: goto L_0x0329;
                case 32: goto L_0x031d;
                case 33: goto L_0x0311;
                case 34: goto L_0x0305;
                case 35: goto L_0x02ee;
                case 36: goto L_0x02d9;
                case 37: goto L_0x02c4;
                case 38: goto L_0x02af;
                case 39: goto L_0x029a;
                case 40: goto L_0x0285;
                case 41: goto L_0x026f;
                case 42: goto L_0x0259;
                case 43: goto L_0x0243;
                case 44: goto L_0x022d;
                case 45: goto L_0x0217;
                case 46: goto L_0x0201;
                case 47: goto L_0x01eb;
                case 48: goto L_0x01d5;
                case 49: goto L_0x01c5;
                case 50: goto L_0x01b8;
                case 51: goto L_0x01aa;
                case 52: goto L_0x019c;
                case 53: goto L_0x0186;
                case 54: goto L_0x0170;
                case 55: goto L_0x015a;
                case 56: goto L_0x014c;
                case 57: goto L_0x013e;
                case 58: goto L_0x0130;
                case 59: goto L_0x0102;
                case 60: goto L_0x00ee;
                case 61: goto L_0x00d2;
                case 62: goto L_0x00bc;
                case 63: goto L_0x00a6;
                case 64: goto L_0x0098;
                case 65: goto L_0x008a;
                case 66: goto L_0x006f;
                case 67: goto L_0x0055;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0525
        L_0x003f:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.uk r7 = (com.google.android.gms.internal.gtm.C41627uk) r7
            com.google.android.gms.internal.gtm.hl r9 = r14.mo136078p(r3)
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167086C(r8, r7, r9)
            goto L_0x03ca
        L_0x0055:
            boolean r9 = r14.mo136062D(r15, r8, r3)
            if (r9 == 0) goto L_0x0525
            long r9 = m168791n(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r9)
            goto L_0x04de
        L_0x006f:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = m168789Q(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x04de
        L_0x008a:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0521
        L_0x0098:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0513
        L_0x00a6:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = m168789Q(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167088E(r7)
            goto L_0x04de
        L_0x00bc:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = m168789Q(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x04de
        L_0x00d2:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.zztd r7 = (com.google.android.gms.internal.gtm.zztd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = r7.mo136144i()
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0469
        L_0x00ee:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.hl r9 = r14.mo136078p(r3)
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167814Q(r8, r7, r9)
            goto L_0x03ca
        L_0x0102:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.gtm.zztd
            if (r9 == 0) goto L_0x0122
            com.google.android.gms.internal.gtm.zztd r7 = (com.google.android.gms.internal.gtm.zztd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = r7.mo136144i()
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0469
        L_0x0122:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167092b(r7)
            goto L_0x04de
        L_0x0130:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x04b3
        L_0x013e:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0513
        L_0x014c:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0521
        L_0x015a:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = m168789Q(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167088E(r7)
            goto L_0x04de
        L_0x0170:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            long r9 = m168791n(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r9)
            goto L_0x0506
        L_0x0186:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            long r9 = m168791n(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r9)
            goto L_0x0506
        L_0x019c:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0513
        L_0x01aa:
            boolean r7 = r14.mo136062D(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0521
        L_0x01b8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.mo136080r(r3)
            com.google.android.gms.internal.gtm.C41507pk.m168193a(r8, r7, r9)
            goto L_0x0525
        L_0x01c5:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.gtm.hl r9 = r14.mo136078p(r3)
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167809L(r8, r7, r9)
            goto L_0x03ca
        L_0x01d5:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167819V(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x01eb:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167817T(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x0201:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167808K(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x0217:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167806I(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x022d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167804G(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x0243:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167822Y(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x0259:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167801D(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x026f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167806I(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x0285:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167808K(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x029a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167811N(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x02af:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167825a0(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x02c4:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167813P(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x02d9:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167806I(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0302
        L_0x02ee:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167808K(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r8)
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
        L_0x0302:
            int r8 = r8 + r9
            goto L_0x04de
        L_0x0305:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167818U(r8, r7, r1)
            goto L_0x03ca
        L_0x0311:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167816S(r8, r7, r1)
            goto L_0x03ca
        L_0x031d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167807J(r8, r7, r1)
            goto L_0x03ca
        L_0x0329:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167805H(r8, r7, r1)
            goto L_0x03ca
        L_0x0335:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167803F(r8, r7, r1)
            goto L_0x03ca
        L_0x0341:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167821X(r8, r7, r1)
            goto L_0x03ca
        L_0x034d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167802E(r8, r7)
            goto L_0x03ca
        L_0x0359:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.gtm.hl r9 = r14.mo136078p(r3)
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167815R(r8, r7, r9)
            goto L_0x03ca
        L_0x0368:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167820W(r8, r7)
            goto L_0x03ca
        L_0x0373:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167798A(r8, r7, r1)
            goto L_0x03ca
        L_0x037e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167805H(r8, r7, r1)
            goto L_0x03ca
        L_0x0389:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167807J(r8, r7, r1)
            goto L_0x03ca
        L_0x0394:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167810M(r8, r7, r1)
            goto L_0x03ca
        L_0x039f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167823Z(r8, r7, r1)
            goto L_0x03ca
        L_0x03aa:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167812O(r8, r7, r1)
            goto L_0x03ca
        L_0x03b5:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167805H(r8, r7, r1)
            goto L_0x03ca
        L_0x03c0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167807J(r8, r7, r1)
        L_0x03ca:
            int r4 = r4 + r7
            goto L_0x0525
        L_0x03cd:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.uk r7 = (com.google.android.gms.internal.gtm.C41627uk) r7
            com.google.android.gms.internal.gtm.hl r9 = r14.mo136078p(r3)
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167086C(r8, r7, r9)
            goto L_0x03ca
        L_0x03e0:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0525
            long r9 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r9)
            goto L_0x04de
        L_0x03f8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x04de
        L_0x0411:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0521
        L_0x041d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0513
        L_0x0429:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167088E(r7)
            goto L_0x04de
        L_0x043d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x04de
        L_0x0451:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.zztd r7 = (com.google.android.gms.internal.gtm.zztd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = r7.mo136144i()
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
        L_0x0469:
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x04df
        L_0x046d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.hl r9 = r14.mo136078p(r3)
            int r7 = com.google.android.gms.internal.gtm.C41363jl.m167814Q(r8, r7, r9)
            goto L_0x03ca
        L_0x047f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.gtm.zztd
            if (r9 == 0) goto L_0x049c
            com.google.android.gms.internal.gtm.zztd r7 = (com.google.android.gms.internal.gtm.zztd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = r7.mo136144i()
            int r9 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0469
        L_0x049c:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167092b(r7)
            goto L_0x04de
        L_0x04a9:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
        L_0x04b3:
            int r7 = r7 + r11
            goto L_0x03ca
        L_0x04b6:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0513
        L_0x04c1:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            goto L_0x0521
        L_0x04cc:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r8)
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167088E(r7)
        L_0x04de:
            int r8 = r8 + r7
        L_0x04df:
            int r4 = r4 + r8
            goto L_0x0525
        L_0x04e1:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r9)
            goto L_0x0506
        L_0x04f4:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
            int r8 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r9)
        L_0x0506:
            int r7 = r7 + r8
            goto L_0x03ca
        L_0x0509:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
        L_0x0513:
            int r7 = r7 + 4
            goto L_0x03ca
        L_0x0517:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r7)
        L_0x0521:
            int r7 = r7 + 8
            goto L_0x03ca
        L_0x0525:
            int r3 = r3 + 3
            goto L_0x000a
        L_0x0529:
            com.google.android.gms.internal.gtm.yl<?, ?> r0 = r14.f105263m
            java.lang.Object r2 = r0.mo135042d(r15)
            int r0 = r0.mo135039a(r2)
            int r4 = r4 + r0
            boolean r0 = r14.f105256f
            if (r0 == 0) goto L_0x0586
            com.google.android.gms.internal.gtm.xi<?> r0 = r14.f105264n
            com.google.android.gms.internal.gtm.bj r15 = r0.mo136047b(r15)
            r0 = r1
        L_0x053f:
            com.google.android.gms.internal.gtm.vl<T, java.lang.Object> r2 = r15.f104470a
            int r2 = r2.mo135988b()
            if (r1 >= r2) goto L_0x055f
            com.google.android.gms.internal.gtm.vl<T, java.lang.Object> r2 = r15.f104470a
            java.util.Map$Entry r2 = r2.mo135996h(r1)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.gtm.aj r3 = (com.google.android.gms.internal.gtm.C41145aj) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.gtm.C41169bj.m167200a(r3, r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L_0x053f
        L_0x055f:
            com.google.android.gms.internal.gtm.vl<T, java.lang.Object> r15 = r15.f104470a
            java.lang.Iterable r15 = r15.mo135989c()
            java.util.Iterator r15 = r15.iterator()
        L_0x0569:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0585
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.gtm.aj r2 = (com.google.android.gms.internal.gtm.C41145aj) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.gtm.C41169bj.m167200a(r2, r1)
            int r0 = r0 + r1
            goto L_0x0569
        L_0x0585:
            int r4 = r4 + r0
        L_0x0586:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.mo136066O(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0474, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f6, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0522, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo136067P(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f105250r
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f105251a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.mo136076m(r2)
            int r5 = m168790l(r4)
            int[] r6 = r11.f105251a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.gtm.zzup r4 = com.google.android.gms.internal.gtm.zzup.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.gtm.zzup r4 = com.google.android.gms.internal.gtm.zzup.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f105251a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0535;
                case 1: goto L_0x0525;
                case 2: goto L_0x050e;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04b8;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x045a;
                case 11: goto L_0x0444;
                case 12: goto L_0x042e;
                case 13: goto L_0x0420;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03ba;
                case 19: goto L_0x03af;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0399;
                case 22: goto L_0x038e;
                case 23: goto L_0x0383;
                case 24: goto L_0x0378;
                case 25: goto L_0x036d;
                case 26: goto L_0x0362;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0545
        L_0x0038:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            com.google.android.gms.internal.gtm.uk r4 = (com.google.android.gms.internal.gtm.C41627uk) r4
            com.google.android.gms.internal.gtm.hl r5 = r11.mo136078p(r2)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167086C(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.mo136062D(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m168791n(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m168789Q(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m168789Q(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167088E(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m168789Q(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = r4.mo136144i()
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            com.google.android.gms.internal.gtm.hl r5 = r11.mo136078p(r2)
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167814Q(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.gtm.zztd
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = r4.mo136144i()
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167092b(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m168789Q(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167088E(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m168791n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r6)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m168791n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r6)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.mo136062D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.lang.Object r5 = r11.mo136080r(r2)
            com.google.android.gms.internal.gtm.C41507pk.m168193a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.gtm.hl r5 = r11.mo136078p(r2)
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167809L(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167819V(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167817T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167808K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167806I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167804G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167822Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167801D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167806I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167808K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167811N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167825a0(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167813P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167806I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167808K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167093c(r6)
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167818U(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167816S(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167807J(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167805H(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167803F(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167821X(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167802E(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.gtm.hl r5 = r11.mo136078p(r2)
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167815R(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167820W(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167798A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167805H(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167807J(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167810M(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167823Z(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167812O(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167805H(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167807J(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            com.google.android.gms.internal.gtm.uk r4 = (com.google.android.gms.internal.gtm.C41627uk) r4
            com.google.android.gms.internal.gtm.hl r5 = r11.mo136078p(r2)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167086C(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.mo136060A(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.gtm.C41340im.m167751i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.gtm.C41340im.m167750h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.gtm.C41340im.m167750h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167088E(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.gtm.C41340im.m167750h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = r4.mo136144i()
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            com.google.android.gms.internal.gtm.hl r5 = r11.mo136078p(r2)
            int r4 = com.google.android.gms.internal.gtm.C41363jl.m167814Q(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.gtm.zztd
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = r4.mo136144i()
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167092b(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.gtm.C41340im.m167750h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r5)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167088E(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.gtm.C41340im.m167751i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r6)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.gtm.C41340im.m167751i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r6)
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167095e(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.mo136060A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.C41144ai.m167094d(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.gtm.yl<?, ?> r0 = r11.f105263m
            java.lang.Object r12 = r0.mo135042d(r12)
            int r12 = r0.mo135039a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.mo136067P(java.lang.Object):int");
    }

    /* renamed from: R */
    public final <K, V> int mo136068R(T t, byte[] bArr, int i, int i2, int i3, long j, C41167bh bhVar) throws IOException {
        Unsafe unsafe = f105250r;
        Object r = mo136080r(i3);
        Object object = unsafe.getObject(t, j);
        if (C41507pk.m168194b(object)) {
            zzwe c = zzwe.m169007b().mo136163c();
            C41507pk.m168195c(c, object);
            unsafe.putObject(t, j, c);
        }
        C41483ok okVar = (C41483ok) r;
        throw null;
    }

    /* renamed from: S */
    public final int mo136069S(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C41167bh bhVar) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C41167bh bhVar2 = bhVar;
        Unsafe unsafe = f105250r;
        long j3 = (long) (this.f105251a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(C41191ch.m167289o(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(C41191ch.m167276b(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = C41191ch.m167287m(bArr2, i9, bhVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(bhVar2.f104465b));
                    unsafe.putInt(t2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = C41191ch.m167284j(bArr2, i9, bhVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(bhVar2.f104464a));
                    unsafe.putInt(t2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C41191ch.m167289o(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C41191ch.m167276b(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = C41191ch.m167287m(bArr2, i9, bhVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(bhVar2.f104465b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = C41191ch.m167284j(bArr2, i9, bhVar2);
                    int i14 = bhVar2.f104464a;
                    if (i14 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C41461nm.m168097f(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(t2, j2, new String(bArr2, j5, i14, C41650vj.f105169a));
                        j5 += i14;
                    } else {
                        throw zzvk.m168997d();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int d = C41191ch.m167278d(mo136078p(i13), bArr2, i9, i2, bhVar2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, bhVar2.f104466c);
                    } else {
                        unsafe.putObject(t2, j2, C41650vj.m168605g(object, bhVar2.f104466c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return d;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = C41191ch.m167275a(bArr2, i9, bhVar2);
                    unsafe.putObject(t2, j2, bhVar2.f104466c);
                    unsafe.putInt(t2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = C41191ch.m167284j(bArr2, i9, bhVar2);
                    int i15 = bhVar2.f104464a;
                    C41530qj o = mo136077o(i13);
                    if (o == null || o.mo135344l(i15)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i15));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m168784J(t).mo136131h(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j7 = C41191ch.m167284j(bArr2, i9, bhVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C41672wh.m168667l(bhVar2.f104464a)));
                    unsafe.putInt(t2, j3, i11);
                    return j7;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m3 = C41191ch.m167287m(bArr2, i9, bhVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C41672wh.m168668m(bhVar2.f104465b)));
                    unsafe.putInt(t2, j3, i11);
                    return m3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int c = C41191ch.m167277c(mo136078p(i13), bArr, i, i2, (i10 & -8) | 4, bhVar);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, bhVar2.f104466c);
                    } else {
                        unsafe.putObject(t2, j2, C41650vj.m168605g(object2, bhVar2.f104466c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return c;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02e8, code lost:
        if (r0 != r15) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x030b, code lost:
        if (r0 != r15) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        r19 = r32;
        r11 = r34;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f2, code lost:
        r6 = r6 | r20;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c9, code lost:
        r2 = r8;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e4, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0200, code lost:
        r6 = r32 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0202, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0203, code lost:
        r1 = r19;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0208, code lost:
        r6 = r32;
        r2 = r4;
        r18 = r8;
        r28 = r9;
        r27 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a1, code lost:
        if (r0 != r15) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b7, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo136070T(T r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.gtm.C41167bh r34) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = f105250r
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r8 = -1
            r0 = r32
            r1 = r8
            r7 = r10
            r2 = r16
            r6 = r2
        L_0x0019:
            if (r0 >= r13) goto L_0x0335
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167285k(r0, r12, r3, r11)
            int r3 = r11.f104464a
            r4 = r0
            r17 = r3
            goto L_0x002e
        L_0x002b:
            r17 = r0
            r4 = r3
        L_0x002e:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003b
            int r2 = r2 / 3
            int r0 = r15.mo136073W(r5, r2)
            goto L_0x003f
        L_0x003b:
            int r0 = r15.mo136072V(r5)
        L_0x003f:
            r2 = r0
            if (r2 != r8) goto L_0x004d
            r2 = r4
            r19 = r5
            r27 = r8
            r28 = r9
            r18 = r16
            goto L_0x030e
        L_0x004d:
            int[] r0 = r15.f105251a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m168790l(r1)
            r8 = r1 & r10
            long r10 = (long) r8
            r8 = 17
            r32 = r5
            if (r0 > r8) goto L_0x0213
            int[] r8 = r15.f105251a
            int r20 = r2 + 2
            r8 = r8[r20]
            int r20 = r8 >>> 20
            r5 = 1
            int r20 = r5 << r20
            r22 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r10
            if (r8 == r7) goto L_0x0084
            if (r7 == r10) goto L_0x007c
            long r10 = (long) r7
            r9.putInt(r14, r10, r6)
            r10 = 1048575(0xfffff, float:1.469367E-39)
        L_0x007c:
            if (r8 == r10) goto L_0x0083
            long r6 = (long) r8
            int r6 = r9.getInt(r14, r6)
        L_0x0083:
            r7 = r8
        L_0x0084:
            r8 = 5
            switch(r0) {
                case 0: goto L_0x01e7;
                case 1: goto L_0x01cd;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01ab;
                case 4: goto L_0x0196;
                case 5: goto L_0x0178;
                case 6: goto L_0x0163;
                case 7: goto L_0x0140;
                case 8: goto L_0x011f;
                case 9: goto L_0x00f7;
                case 10: goto L_0x00df;
                case 11: goto L_0x0196;
                case 12: goto L_0x00cc;
                case 13: goto L_0x0163;
                case 14: goto L_0x0178;
                case 15: goto L_0x00b2;
                case 16: goto L_0x0091;
                default: goto L_0x0088;
            }
        L_0x0088:
            r19 = r32
            r11 = r34
            r8 = r2
        L_0x008d:
            r32 = r6
            goto L_0x0208
        L_0x0091:
            if (r3 != 0) goto L_0x0088
            r11 = r34
            r0 = r22
            int r8 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r12, r4, r11)
            long r3 = r11.f104465b
            long r4 = com.google.android.gms.internal.gtm.C41672wh.m168668m(r3)
            r0 = r9
            r1 = r30
            r17 = r8
            r8 = r2
            r2 = r22
            r19 = r32
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            goto L_0x01c9
        L_0x00b2:
            r19 = r32
            r11 = r34
            r8 = r2
            if (r3 != 0) goto L_0x008d
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r12, r4, r11)
            int r1 = r11.f104464a
            int r1 = com.google.android.gms.internal.gtm.C41672wh.m168667l(r1)
            r2 = r22
            r9.putInt(r14, r2, r1)
            r6 = r6 | r20
            goto L_0x0202
        L_0x00cc:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            if (r3 != 0) goto L_0x008d
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r12, r4, r11)
            int r3 = r11.f104464a
            r9.putInt(r14, r0, r3)
            goto L_0x00f2
        L_0x00df:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008d
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167275a(r12, r4, r11)
            java.lang.Object r3 = r11.f104466c
            r9.putObject(r14, r0, r3)
        L_0x00f2:
            r6 = r6 | r20
            r0 = r2
            goto L_0x0202
        L_0x00f7:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008d
            com.google.android.gms.internal.gtm.hl r2 = r15.mo136078p(r8)
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167278d(r2, r12, r4, r13, r11)
            java.lang.Object r3 = r9.getObject(r14, r0)
            if (r3 != 0) goto L_0x0115
            java.lang.Object r3 = r11.f104466c
            r9.putObject(r14, r0, r3)
            goto L_0x00f2
        L_0x0115:
            java.lang.Object r4 = r11.f104466c
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41650vj.m168605g(r3, r4)
            r9.putObject(r14, r0, r3)
            goto L_0x00f2
        L_0x011f:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 2
            if (r3 != r0) goto L_0x0208
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0135
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167281g(r12, r4, r11)
            goto L_0x0139
        L_0x0135:
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167282h(r12, r4, r11)
        L_0x0139:
            java.lang.Object r1 = r11.f104466c
            r9.putObject(r14, r5, r1)
            goto L_0x0200
        L_0x0140:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0208
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r12, r4, r11)
            long r2 = r11.f104465b
            r21 = 0
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            r0 = r16
        L_0x015b:
            com.google.android.gms.internal.gtm.C41340im.m167760r(r14, r5, r0)
            r6 = r32 | r20
            r0 = r1
            goto L_0x0202
        L_0x0163:
            r19 = r32
            r11 = r34
            r32 = r6
            r0 = r8
            r5 = r22
            r8 = r2
            if (r3 != r0) goto L_0x0208
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r12, r4)
            r9.putInt(r14, r5, r0)
            goto L_0x01e4
        L_0x0178:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != r0) goto L_0x0208
            long r21 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r12, r4)
            r0 = r9
            r1 = r30
            r2 = r5
            r6 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r6 + 8
            goto L_0x0200
        L_0x0196:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0208
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r12, r4, r11)
            int r1 = r11.f104464a
            r9.putInt(r14, r5, r1)
            goto L_0x0200
        L_0x01ab:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0208
            int r17 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r12, r4, r11)
            long r2 = r11.f104465b
            r0 = r9
            r1 = r30
            r21 = r2
            r2 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r32 | r20
        L_0x01c9:
            r2 = r8
            r0 = r17
            goto L_0x0203
        L_0x01cd:
            r19 = r32
            r11 = r34
            r32 = r6
            r0 = r8
            r5 = r22
            r8 = r2
            if (r3 != r0) goto L_0x0208
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.gtm.C41340im.m167763u(r14, r5, r0)
        L_0x01e4:
            int r0 = r4 + 4
            goto L_0x0200
        L_0x01e7:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != r0) goto L_0x0208
            long r0 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.gtm.C41340im.m167762t(r14, r5, r0)
            int r0 = r4 + 8
        L_0x0200:
            r6 = r32 | r20
        L_0x0202:
            r2 = r8
        L_0x0203:
            r1 = r19
            r8 = -1
            goto L_0x0019
        L_0x0208:
            r6 = r32
            r2 = r4
            r18 = r8
            r28 = r9
            r27 = -1
            goto L_0x030e
        L_0x0213:
            r19 = r32
            r8 = r2
            r20 = r6
            r5 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r34
            r2 = 27
            if (r0 != r2) goto L_0x026c
            r2 = 2
            if (r3 != r2) goto L_0x025f
            java.lang.Object r0 = r9.getObject(r14, r5)
            com.google.android.gms.internal.gtm.uj r0 = (com.google.android.gms.internal.gtm.C41626uj) r0
            boolean r1 = r0.mo135928d()
            if (r1 != 0) goto L_0x0242
            int r1 = r0.size()
            if (r1 != 0) goto L_0x023a
            r1 = 10
            goto L_0x023b
        L_0x023a:
            int r1 = r1 + r1
        L_0x023b:
            com.google.android.gms.internal.gtm.uj r0 = r0.mo135130n(r1)
            r9.putObject(r14, r5, r0)
        L_0x0242:
            r5 = r0
            com.google.android.gms.internal.gtm.hl r0 = r15.mo136078p(r8)
            r1 = r17
            r2 = r31
            r3 = r4
            r4 = r33
            r15 = r20
            r6 = r34
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167279e(r0, r1, r2, r3, r4, r5, r6)
            r2 = r8
            r6 = r15
            r1 = r19
            r8 = -1
            r15 = r29
            goto L_0x0019
        L_0x025f:
            r15 = r4
            r26 = r7
            r18 = r8
            r28 = r9
            r23 = r20
            r27 = -1
            goto L_0x02eb
        L_0x026c:
            r15 = r20
            r2 = 49
            if (r0 > r2) goto L_0x02b9
            long r1 = (long) r1
            r32 = r0
            r0 = r29
            r20 = r1
            r1 = r30
            r2 = r31
            r22 = r3
            r3 = r4
            r23 = r15
            r15 = r4
            r4 = r33
            r24 = r5
            r5 = r17
            r6 = r19
            r26 = r7
            r7 = r22
            r18 = r8
            r27 = -1
            r28 = r9
            r9 = r20
            r11 = r32
            r12 = r24
            r14 = r34
            int r0 = r0.mo136071U(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02b7
        L_0x02a3:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r2 = r18
            r1 = r19
            r6 = r23
            r7 = r26
            goto L_0x032c
        L_0x02b7:
            r2 = r0
            goto L_0x02ec
        L_0x02b9:
            r32 = r0
            r22 = r3
            r24 = r5
            r26 = r7
            r18 = r8
            r28 = r9
            r23 = r15
            r27 = -1
            r15 = r4
            r0 = 50
            r9 = r32
            if (r9 != r0) goto L_0x02f1
            r7 = r22
            r0 = 2
            if (r7 != r0) goto L_0x02eb
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r24
            r8 = r34
            int r0 = r0.mo136068R(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02b7
            goto L_0x02a3
        L_0x02eb:
            r2 = r15
        L_0x02ec:
            r6 = r23
            r7 = r26
            goto L_0x030e
        L_0x02f1:
            r7 = r22
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r17
            r6 = r19
            r10 = r24
            r12 = r18
            r13 = r34
            int r0 = r0.mo136069S(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02b7
            goto L_0x02a3
        L_0x030e:
            com.google.android.gms.internal.gtm.zl r4 = m168784J(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.gtm.C41191ch.m167283i(r0, r1, r2, r3, r4, r5)
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r2 = r18
            r1 = r19
        L_0x032c:
            r8 = r27
            r9 = r28
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x0335:
            r23 = r6
            r28 = r9
            r1 = r10
            if (r7 == r1) goto L_0x0346
            long r1 = (long) r7
            r3 = r30
            r6 = r23
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0346:
            r1 = r33
            if (r0 != r1) goto L_0x034b
            return r0
        L_0x034b:
            com.google.android.gms.internal.gtm.zzvk r0 = com.google.android.gms.internal.gtm.zzvk.m169000g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.mo136070T(java.lang.Object, byte[], int, int, com.google.android.gms.internal.gtm.bh):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0450 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    /* renamed from: U */
    public final int mo136071U(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.gtm.C41167bh r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f105250r
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.gtm.uj r12 = (com.google.android.gms.internal.gtm.C41626uj) r12
            boolean r13 = r12.mo135928d()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.gtm.uj r12 = r12.mo135130n(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x0394;
                case 20: goto L_0x0351;
                case 21: goto L_0x0351;
                case 22: goto L_0x0336;
                case 23: goto L_0x02f5;
                case 24: goto L_0x02b4;
                case 25: goto L_0x025a;
                case 26: goto L_0x01a7;
                case 27: goto L_0x018c;
                case 28: goto L_0x0132;
                case 29: goto L_0x0336;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02b4;
                case 32: goto L_0x02f5;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x0394;
                case 37: goto L_0x0351;
                case 38: goto L_0x0351;
                case 39: goto L_0x0336;
                case 40: goto L_0x02f5;
                case 41: goto L_0x02b4;
                case 42: goto L_0x025a;
                case 43: goto L_0x0336;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02b4;
                case 46: goto L_0x02f5;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x044f
            com.google.android.gms.internal.gtm.hl r1 = r15.mo136078p(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167277c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f104466c
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.gtm.jk r12 = (com.google.android.gms.internal.gtm.C41362jk) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r2 = r7.f104464a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r3, r1, r7)
            long r4 = r7.f104465b
            long r4 = com.google.android.gms.internal.gtm.C41672wh.m168668m(r4)
            r12.mo135523i(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.gtm.jk r12 = (com.google.android.gms.internal.gtm.C41362jk) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r3, r4, r7)
            long r8 = r7.f104465b
            long r8 = com.google.android.gms.internal.gtm.C41672wh.m168668m(r8)
            r12.mo135523i(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r6 = r7.f104464a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r3, r4, r7)
            long r8 = r7.f104465b
            long r8 = com.google.android.gms.internal.gtm.C41672wh.m168668m(r8)
            r12.mo135523i(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.gtm.nj r12 = (com.google.android.gms.internal.gtm.C41458nj) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r2 = r7.f104464a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r4 = r7.f104464a
            int r4 = com.google.android.gms.internal.gtm.C41672wh.m168667l(r4)
            r12.mo135665U(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.gtm.nj r12 = (com.google.android.gms.internal.gtm.C41458nj) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r4 = r7.f104464a
            int r4 = com.google.android.gms.internal.gtm.C41672wh.m168667l(r4)
            r12.mo135665U(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r6 = r7.f104464a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r4 = r7.f104464a
            int r4 = com.google.android.gms.internal.gtm.C41672wh.m168667l(r4)
            r12.mo135665U(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167280f(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167286l(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.gtm.lj r1 = (com.google.android.gms.internal.gtm.C41410lj) r1
            com.google.android.gms.internal.gtm.zl r3 = r1.zzc
            com.google.android.gms.internal.gtm.zl r4 = com.google.android.gms.internal.gtm.C41748zl.m168947c()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.gtm.qj r4 = r15.mo136077o(r8)
            com.google.android.gms.internal.gtm.yl<?, ?> r5 = r0.f105263m
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41363jl.m167828c(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.gtm.zl r3 = (com.google.android.gms.internal.gtm.C41748zl) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r4 = r7.f104464a
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.gtm.zztd r4 = com.google.android.gms.internal.gtm.zztd.f105744a
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.gtm.zztd r6 = com.google.android.gms.internal.gtm.zztd.m168979W(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r6 = r7.f104464a
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r4 = r7.f104464a
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.gtm.zztd r4 = com.google.android.gms.internal.gtm.zztd.f105744a
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.gtm.zztd r6 = com.google.android.gms.internal.gtm.zztd.m168979W(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m168999f()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m168999f()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.gtm.hl r1 = r15.mo136078p(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167279e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01fa
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r4 = r7.f104464a
            if (r4 < 0) goto L_0x01f5
            if (r4 != 0) goto L_0x01c2
            r12.add(r6)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.gtm.C41650vj.f105169a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01cc:
            int r1 = r1 + r4
        L_0x01cd:
            if (r1 >= r5) goto L_0x0450
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r8 = r7.f104464a
            if (r2 != r8) goto L_0x0450
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r4 = r7.f104464a
            if (r4 < 0) goto L_0x01f0
            if (r4 != 0) goto L_0x01e5
            r12.add(r6)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.gtm.C41650vj.f105169a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m168999f()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m168999f()
            throw r1
        L_0x01fa:
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r4 = r7.f104464a
            if (r4 < 0) goto L_0x0255
            if (r4 != 0) goto L_0x0208
            r12.add(r6)
            goto L_0x021b
        L_0x0208:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.gtm.C41461nm.m168097f(r3, r1, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.gtm.C41650vj.f105169a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x021a:
            r1 = r8
        L_0x021b:
            if (r1 >= r5) goto L_0x0450
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r8 = r7.f104464a
            if (r2 != r8) goto L_0x0450
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r4 = r7.f104464a
            if (r4 < 0) goto L_0x024b
            if (r4 != 0) goto L_0x0233
            r12.add(r6)
            goto L_0x021b
        L_0x0233:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.gtm.C41461nm.m168097f(r3, r1, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.gtm.C41650vj.f105169a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m168997d()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m168999f()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m168997d()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m168999f()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.gtm.hh r12 = (com.google.android.gms.internal.gtm.C41311hh) r12
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r4 = r7.f104464a
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r3, r2, r7)
            long r5 = r7.f104465b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0274
            r5 = r13
            goto L_0x0275
        L_0x0274:
            r5 = r1
        L_0x0275:
            r12.mo135445h(r5)
            goto L_0x0266
        L_0x0279:
            if (r2 != r4) goto L_0x027e
        L_0x027b:
            r1 = r2
            goto L_0x0450
        L_0x027e:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.gtm.hh r12 = (com.google.android.gms.internal.gtm.C41311hh) r12
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r3, r4, r7)
            long r8 = r7.f104465b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0293
            r6 = r13
            goto L_0x0294
        L_0x0293:
            r6 = r1
        L_0x0294:
            r12.mo135445h(r6)
        L_0x0297:
            if (r4 >= r5) goto L_0x02b3
            int r6 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r8 = r7.f104464a
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r3, r6, r7)
            long r8 = r7.f104465b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = r13
            goto L_0x02af
        L_0x02ae:
            r6 = r1
        L_0x02af:
            r12.mo135445h(r6)
            goto L_0x0297
        L_0x02b3:
            return r4
        L_0x02b4:
            if (r6 != r14) goto L_0x02d4
            com.google.android.gms.internal.gtm.nj r12 = (com.google.android.gms.internal.gtm.C41458nj) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r2 = r7.f104464a
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r3, r1)
            r12.mo135665U(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.gtm.nj r12 = (com.google.android.gms.internal.gtm.C41458nj) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r17, r18)
            r12.mo135665U(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r6 = r7.f104464a
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r3, r4)
            r12.mo135665U(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.gtm.jk r12 = (com.google.android.gms.internal.gtm.C41362jk) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r2 = r7.f104464a
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r3, r1)
            r12.mo135523i(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.gtm.jk r12 = (com.google.android.gms.internal.gtm.C41362jk) r12
            long r8 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r17, r18)
            r12.mo135523i(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r6 = r7.f104464a
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r3, r4)
            r12.mo135523i(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167280f(r3, r4, r12, r7)
            goto L_0x0450
        L_0x033e:
            if (r6 == 0) goto L_0x0342
            goto L_0x044f
        L_0x0342:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167286l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.gtm.jk r12 = (com.google.android.gms.internal.gtm.C41362jk) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r2 = r7.f104464a
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r3, r1, r7)
            long r4 = r7.f104465b
            r12.mo135523i(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.gtm.jk r12 = (com.google.android.gms.internal.gtm.C41362jk) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r3, r4, r7)
            long r8 = r7.f104465b
            r12.mo135523i(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r6 = r7.f104464a
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167287m(r3, r4, r7)
            long r8 = r7.f104465b
            r12.mo135523i(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.gtm.cj r12 = (com.google.android.gms.internal.gtm.C41193cj) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r2 = r7.f104464a
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo135182h(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.gtm.cj r12 = (com.google.android.gms.internal.gtm.C41193cj) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo135182h(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r6 = r7.f104464a
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167276b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo135182h(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.gtm.ti r12 = (com.google.android.gms.internal.gtm.C41601ti) r12
            int r1 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r2 = r7.f104464a
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo135866h(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.gtm.ti r12 = (com.google.android.gms.internal.gtm.C41601ti) r12
            long r8 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo135866h(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r1, r7)
            int r6 = r7.f104464a
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.gtm.C41191ch.m167289o(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo135866h(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.gtm.C41191ch.m167284j(r3, r4, r7)
            int r9 = r7.f104464a
            if (r2 == r9) goto L_0x0438
            goto L_0x044e
        L_0x0438:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.gtm.C41191ch.m167277c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f104466c
            r12.add(r8)
            goto L_0x042d
        L_0x044e:
            return r4
        L_0x044f:
            r1 = r4
        L_0x0450:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.mo136071U(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.gtm.bh):int");
    }

    /* renamed from: V */
    public final int mo136072V(int i) {
        if (i < this.f105253c || i > this.f105254d) {
            return -1;
        }
        return mo136075k(i, 0);
    }

    /* renamed from: W */
    public final int mo136073W(int i, int i2) {
        if (i < this.f105253c || i > this.f105254d) {
            return -1;
        }
        return mo136075k(i, i2);
    }

    /* renamed from: X */
    public final int mo136074X(int i) {
        return this.f105251a[i + 2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo135455a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f105251a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.mo136076m(r1)
            int[] r4 = r8.f105251a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m168790l(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41340im.m167753k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m168791n(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m168789Q(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m168791n(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m168789Q(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m168789Q(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m168789Q(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41340im.m167753k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41340im.m167753k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41340im.m167753k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m168782E(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168599a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m168789Q(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m168791n(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m168789Q(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m168791n(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m168791n(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m168788N(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.mo136062D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m168787M(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41340im.m167753k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41340im.m167753k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41340im.m167753k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.gtm.C41340im.m167751i(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.C41340im.m167750h(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.gtm.C41340im.m167751i(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.C41340im.m167750h(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.C41340im.m167750h(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.C41340im.m167750h(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41340im.m167753k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41340im.m167753k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.C41340im.m167753k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.gtm.C41340im.m167739B(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168599a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.C41340im.m167750h(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.gtm.C41340im.m167751i(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.C41340im.m167750h(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.gtm.C41340im.m167751i(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.gtm.C41340im.m167751i(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.gtm.C41340im.m167749g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.gtm.C41340im.m167748f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.gtm.C41650vj.m168601c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.gtm.yl<?, ?> r0 = r8.f105263m
            java.lang.Object r0 = r0.mo135042d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f105256f
            if (r0 == 0) goto L_0x024b
            int r2 = r2 * 53
            com.google.android.gms.internal.gtm.xi<?> r0 = r8.f105264n
            com.google.android.gms.internal.gtm.bj r9 = r0.mo136047b(r9)
            com.google.android.gms.internal.gtm.vl<T, java.lang.Object> r9 = r9.f104470a
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.mo135455a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final int mo135456b(T t) {
        if (this.f105258h) {
            return mo136067P(t);
        }
        return mo136066O(t);
    }

    /* renamed from: c */
    public final void mo135457c(T t) {
        int i;
        int i2 = this.f105260j;
        while (true) {
            i = this.f105261k;
            if (i2 >= i) {
                break;
            }
            long m = (long) (mo136076m(this.f105259i[i2]) & 1048575);
            Object k = C41340im.m167753k(t, m);
            if (k != null) {
                ((zzwe) k).mo136165e();
                C41340im.m167766x(t, m, k);
            }
            i2++;
        }
        int length = this.f105259i.length;
        while (i < length) {
            this.f105262l.mo135348b(t, (long) this.f105259i[i]);
            i++;
        }
        this.f105263m.mo135051m(t);
        if (this.f105256f) {
            this.f105264n.mo136051f(t);
        }
    }

    /* renamed from: d */
    public final void mo135458d(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f105251a.length; i += 3) {
            int m = mo136076m(i);
            long j = (long) (1048575 & m);
            int i2 = this.f105251a[i];
            switch (m168790l(m)) {
                case 0:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167762t(t, j, C41340im.m167748f(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 1:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167763u(t, j, C41340im.m167749g(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 2:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167765w(t, j, C41340im.m167751i(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 3:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167765w(t, j, C41340im.m167751i(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 4:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167764v(t, j, C41340im.m167750h(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 5:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167765w(t, j, C41340im.m167751i(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 6:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167764v(t, j, C41340im.m167750h(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 7:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167760r(t, j, C41340im.m167739B(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 8:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167766x(t, j, C41340im.m167753k(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 9:
                    mo136081t(t, t2, i);
                    break;
                case 10:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167766x(t, j, C41340im.m167753k(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 11:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167764v(t, j, C41340im.m167750h(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 12:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167764v(t, j, C41340im.m167750h(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 13:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167764v(t, j, C41340im.m167750h(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 14:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167765w(t, j, C41340im.m167751i(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 15:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167764v(t, j, C41340im.m167750h(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 16:
                    if (!mo136060A(t2, i)) {
                        break;
                    } else {
                        C41340im.m167765w(t, j, C41340im.m167751i(t2, j));
                        mo136084w(t, i);
                        break;
                    }
                case 17:
                    mo136081t(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f105262l.mo135349c(t, t2, j);
                    break;
                case 50:
                    C41363jl.m167834i(this.f105266p, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!mo136062D(t2, i2, i)) {
                        break;
                    } else {
                        C41340im.m167766x(t, j, C41340im.m167753k(t2, j));
                        mo136085x(t, i2, i);
                        break;
                    }
                case 60:
                    mo136082u(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo136062D(t2, i2, i)) {
                        break;
                    } else {
                        C41340im.m167766x(t, j, C41340im.m167753k(t2, j));
                        mo136085x(t, i2, i);
                        break;
                    }
                case 68:
                    mo136082u(t, t2, i);
                    break;
            }
        }
        C41363jl.m167831f(this.f105263m, t, t2);
        if (this.f105256f) {
            C41363jl.m167830e(this.f105264n, t, t2);
        }
    }

    /* renamed from: e */
    public final boolean mo135459e(T t, T t2) {
        boolean z;
        int length = this.f105251a.length;
        for (int i = 0; i < length; i += 3) {
            int m = mo136076m(i);
            long j = (long) (m & 1048575);
            switch (m168790l(m)) {
                case 0:
                    if (mo136086y(t, t2, i) && Double.doubleToLongBits(C41340im.m167748f(t, j)) == Double.doubleToLongBits(C41340im.m167748f(t2, j))) {
                        continue;
                    }
                case 1:
                    if (mo136086y(t, t2, i) && Float.floatToIntBits(C41340im.m167749g(t, j)) == Float.floatToIntBits(C41340im.m167749g(t2, j))) {
                        continue;
                    }
                case 2:
                    if (mo136086y(t, t2, i) && C41340im.m167751i(t, j) == C41340im.m167751i(t2, j)) {
                        continue;
                    }
                case 3:
                    if (mo136086y(t, t2, i) && C41340im.m167751i(t, j) == C41340im.m167751i(t2, j)) {
                        continue;
                    }
                case 4:
                    if (mo136086y(t, t2, i) && C41340im.m167750h(t, j) == C41340im.m167750h(t2, j)) {
                        continue;
                    }
                case 5:
                    if (mo136086y(t, t2, i) && C41340im.m167751i(t, j) == C41340im.m167751i(t2, j)) {
                        continue;
                    }
                case 6:
                    if (mo136086y(t, t2, i) && C41340im.m167750h(t, j) == C41340im.m167750h(t2, j)) {
                        continue;
                    }
                case 7:
                    if (mo136086y(t, t2, i) && C41340im.m167739B(t, j) == C41340im.m167739B(t2, j)) {
                        continue;
                    }
                case 8:
                    if (mo136086y(t, t2, i) && C41363jl.m167833h(C41340im.m167753k(t, j), C41340im.m167753k(t2, j))) {
                        continue;
                    }
                case 9:
                    if (mo136086y(t, t2, i) && C41363jl.m167833h(C41340im.m167753k(t, j), C41340im.m167753k(t2, j))) {
                        continue;
                    }
                case 10:
                    if (mo136086y(t, t2, i) && C41363jl.m167833h(C41340im.m167753k(t, j), C41340im.m167753k(t2, j))) {
                        continue;
                    }
                case 11:
                    if (mo136086y(t, t2, i) && C41340im.m167750h(t, j) == C41340im.m167750h(t2, j)) {
                        continue;
                    }
                case 12:
                    if (mo136086y(t, t2, i) && C41340im.m167750h(t, j) == C41340im.m167750h(t2, j)) {
                        continue;
                    }
                case 13:
                    if (mo136086y(t, t2, i) && C41340im.m167750h(t, j) == C41340im.m167750h(t2, j)) {
                        continue;
                    }
                case 14:
                    if (mo136086y(t, t2, i) && C41340im.m167751i(t, j) == C41340im.m167751i(t2, j)) {
                        continue;
                    }
                case 15:
                    if (mo136086y(t, t2, i) && C41340im.m167750h(t, j) == C41340im.m167750h(t2, j)) {
                        continue;
                    }
                case 16:
                    if (mo136086y(t, t2, i) && C41340im.m167751i(t, j) == C41340im.m167751i(t2, j)) {
                        continue;
                    }
                case 17:
                    if (mo136086y(t, t2, i) && C41363jl.m167833h(C41340im.m167753k(t, j), C41340im.m167753k(t2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = C41363jl.m167833h(C41340im.m167753k(t, j), C41340im.m167753k(t2, j));
                    break;
                case 50:
                    z = C41363jl.m167833h(C41340im.m167753k(t, j), C41340im.m167753k(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long X = (long) (mo136074X(i) & 1048575);
                    if (C41340im.m167750h(t, X) == C41340im.m167750h(t2, X) && C41363jl.m167833h(C41340im.m167753k(t, j), C41340im.m167753k(t2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f105263m.mo135042d(t).equals(this.f105263m.mo135042d(t2))) {
            return false;
        }
        if (this.f105256f) {
            return this.f105264n.mo136047b(t).equals(this.f105264n.mo136047b(t2));
        }
        return true;
    }

    /* renamed from: f */
    public final T mo135460f() {
        return ((C41410lj) this.f105255e).mo134974A(4, (Object) null, (Object) null);
    }

    /* renamed from: g */
    public final boolean mo135461g(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f105260j) {
            int i6 = this.f105259i[i5];
            int i7 = this.f105251a[i6];
            int m = mo136076m(i6);
            int i8 = this.f105251a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f105250r.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & m) != 0 && !mo136061B(t, i6, i2, i, i10)) {
                return false;
            }
            int l = m168790l(m);
            if (l != 9 && l != 17) {
                if (l != 27) {
                    if (l == 60 || l == 68) {
                        if (mo136062D(t2, i7, i6) && !m168781C(t2, m, mo136078p(i6))) {
                            return false;
                        }
                    } else if (l != 49) {
                        if (l == 50 && !((zzwe) C41340im.m167753k(t2, (long) (m & 1048575))).isEmpty()) {
                            C41483ok okVar = (C41483ok) mo136080r(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C41340im.m167753k(t2, (long) (m & 1048575));
                if (!list.isEmpty()) {
                    C41315hl p = mo136078p(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!p.mo135461g(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (mo136061B(t, i6, i2, i, i10) && !m168781C(t2, m, mo136078p(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f105256f || this.f105264n.mo136047b(t2).mo135118k()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0507  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135462h(T r13, com.google.android.gms.internal.gtm.C41168bi r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f105258h
            if (r0 == 0) goto L_0x0525
            boolean r0 = r12.f105256f
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.gtm.xi<?> r0 = r12.f105264n
            com.google.android.gms.internal.gtm.bj r0 = r0.mo136047b(r13)
            com.google.android.gms.internal.gtm.vl<T, java.lang.Object> r2 = r0.f104470a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0022
            java.util.Iterator r0 = r0.mo135112f()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0024
        L_0x0022:
            r0 = r1
            r2 = r0
        L_0x0024:
            int[] r3 = r12.f105251a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0029:
            if (r5 >= r3) goto L_0x0505
            int r6 = r12.mo136076m(r5)
            int[] r7 = r12.f105251a
            r7 = r7[r5]
        L_0x0033:
            if (r2 == 0) goto L_0x0051
            com.google.android.gms.internal.gtm.xi<?> r8 = r12.f105264n
            int r8 = r8.mo136046a(r2)
            if (r8 > r7) goto L_0x0051
            com.google.android.gms.internal.gtm.xi<?> r8 = r12.f105264n
            r8.mo136055j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0033
        L_0x004f:
            r2 = r1
            goto L_0x0033
        L_0x0051:
            int r8 = m168790l(r6)
            r9 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            switch(r8) {
                case 0: goto L_0x04f2;
                case 1: goto L_0x04e2;
                case 2: goto L_0x04d2;
                case 3: goto L_0x04c2;
                case 4: goto L_0x04b2;
                case 5: goto L_0x04a2;
                case 6: goto L_0x0492;
                case 7: goto L_0x0481;
                case 8: goto L_0x0470;
                case 9: goto L_0x045b;
                case 10: goto L_0x0448;
                case 11: goto L_0x0437;
                case 12: goto L_0x0426;
                case 13: goto L_0x0415;
                case 14: goto L_0x0404;
                case 15: goto L_0x03f3;
                case 16: goto L_0x03e2;
                case 17: goto L_0x03cd;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03ab;
                case 20: goto L_0x039a;
                case 21: goto L_0x0389;
                case 22: goto L_0x0378;
                case 23: goto L_0x0367;
                case 24: goto L_0x0356;
                case 25: goto L_0x0345;
                case 26: goto L_0x0334;
                case 27: goto L_0x031f;
                case 28: goto L_0x030e;
                case 29: goto L_0x02fd;
                case 30: goto L_0x02ec;
                case 31: goto L_0x02db;
                case 32: goto L_0x02ca;
                case 33: goto L_0x02b9;
                case 34: goto L_0x02a8;
                case 35: goto L_0x0297;
                case 36: goto L_0x0286;
                case 37: goto L_0x0275;
                case 38: goto L_0x0264;
                case 39: goto L_0x0253;
                case 40: goto L_0x0242;
                case 41: goto L_0x0231;
                case 42: goto L_0x0220;
                case 43: goto L_0x020f;
                case 44: goto L_0x01fe;
                case 45: goto L_0x01ed;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01cb;
                case 48: goto L_0x01ba;
                case 49: goto L_0x01a5;
                case 50: goto L_0x019a;
                case 51: goto L_0x0189;
                case 52: goto L_0x0178;
                case 53: goto L_0x0167;
                case 54: goto L_0x0156;
                case 55: goto L_0x0145;
                case 56: goto L_0x0134;
                case 57: goto L_0x0123;
                case 58: goto L_0x0112;
                case 59: goto L_0x0101;
                case 60: goto L_0x00ec;
                case 61: goto L_0x00d9;
                case 62: goto L_0x00c8;
                case 63: goto L_0x00b7;
                case 64: goto L_0x00a6;
                case 65: goto L_0x0095;
                case 66: goto L_0x0084;
                case 67: goto L_0x0073;
                case 68: goto L_0x005e;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x0501
        L_0x005e:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            com.google.android.gms.internal.gtm.hl r8 = r12.mo136078p(r5)
            r14.mo135072C(r7, r6, r8)
            goto L_0x0501
        L_0x0073:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m168791n(r13, r8)
            r14.mo135085d(r7, r8)
            goto L_0x0501
        L_0x0084:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m168789Q(r13, r8)
            r14.mo135083b(r7, r6)
            goto L_0x0501
        L_0x0095:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m168791n(r13, r8)
            r14.mo135081L(r7, r8)
            goto L_0x0501
        L_0x00a6:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m168789Q(r13, r8)
            r14.mo135079J(r7, r6)
            goto L_0x0501
        L_0x00b7:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m168789Q(r13, r8)
            r14.mo135101u(r7, r6)
            goto L_0x0501
        L_0x00c8:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m168789Q(r13, r8)
            r14.mo135090i(r7, r6)
            goto L_0x0501
        L_0x00d9:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            com.google.android.gms.internal.gtm.zztd r6 = (com.google.android.gms.internal.gtm.zztd) r6
            r14.mo135096p(r7, r6)
            goto L_0x0501
        L_0x00ec:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            com.google.android.gms.internal.gtm.hl r8 = r12.mo136078p(r5)
            r14.mo135077H(r7, r6, r8)
            goto L_0x0501
        L_0x0101:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            m168783H(r7, r6, r14)
            goto L_0x0501
        L_0x0112:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = m168782E(r13, r8)
            r14.mo135094n(r7, r6)
            goto L_0x0501
        L_0x0123:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m168789Q(r13, r8)
            r14.mo135103w(r7, r6)
            goto L_0x0501
        L_0x0134:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m168791n(r13, r8)
            r14.mo135105y(r7, r8)
            goto L_0x0501
        L_0x0145:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m168789Q(r13, r8)
            r14.mo135073D(r7, r6)
            goto L_0x0501
        L_0x0156:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m168791n(r13, r8)
            r14.mo135092k(r7, r8)
            goto L_0x0501
        L_0x0167:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m168791n(r13, r8)
            r14.mo135075F(r7, r8)
            goto L_0x0501
        L_0x0178:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = m168788N(r13, r8)
            r14.mo135070A(r7, r6)
            goto L_0x0501
        L_0x0189:
            boolean r8 = r12.mo136062D(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = m168787M(r13, r8)
            r14.mo135098r(r7, r8)
            goto L_0x0501
        L_0x019a:
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            r12.mo136064G(r14, r7, r6, r5)
            goto L_0x0501
        L_0x01a5:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.hl r8 = r12.mo136078p(r5)
            com.google.android.gms.internal.gtm.C41363jl.m167842q(r7, r6, r14, r8)
            goto L_0x0501
        L_0x01ba:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167849x(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01cb:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167848w(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01dc:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167847v(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01ed:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167846u(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01fe:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167838m(r7, r6, r14, r9)
            goto L_0x0501
        L_0x020f:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167851z(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0220:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167835j(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0231:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167839n(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0242:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167840o(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0253:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167843r(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0264:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167799B(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0275:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167844s(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0286:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167841p(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0297:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167837l(r7, r6, r14, r9)
            goto L_0x0501
        L_0x02a8:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167849x(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02b9:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167848w(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02ca:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167847v(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02db:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167846u(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02ec:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167838m(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02fd:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167851z(r7, r6, r14, r4)
            goto L_0x0501
        L_0x030e:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167836k(r7, r6, r14)
            goto L_0x0501
        L_0x031f:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.hl r8 = r12.mo136078p(r5)
            com.google.android.gms.internal.gtm.C41363jl.m167845t(r7, r6, r14, r8)
            goto L_0x0501
        L_0x0334:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167850y(r7, r6, r14)
            goto L_0x0501
        L_0x0345:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167835j(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0356:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167839n(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0367:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167840o(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0378:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167843r(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0389:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167799B(r7, r6, r14, r4)
            goto L_0x0501
        L_0x039a:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167844s(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03ab:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167841p(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03bc:
            int[] r7 = r12.f105251a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.C41363jl.m167837l(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03cd:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            com.google.android.gms.internal.gtm.hl r8 = r12.mo136078p(r5)
            r14.mo135072C(r7, r6, r8)
            goto L_0x0501
        L_0x03e2:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.gtm.C41340im.m167751i(r13, r8)
            r14.mo135085d(r7, r8)
            goto L_0x0501
        L_0x03f3:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.C41340im.m167750h(r13, r8)
            r14.mo135083b(r7, r6)
            goto L_0x0501
        L_0x0404:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.gtm.C41340im.m167751i(r13, r8)
            r14.mo135081L(r7, r8)
            goto L_0x0501
        L_0x0415:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.C41340im.m167750h(r13, r8)
            r14.mo135079J(r7, r6)
            goto L_0x0501
        L_0x0426:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.C41340im.m167750h(r13, r8)
            r14.mo135101u(r7, r6)
            goto L_0x0501
        L_0x0437:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.C41340im.m167750h(r13, r8)
            r14.mo135090i(r7, r6)
            goto L_0x0501
        L_0x0448:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            com.google.android.gms.internal.gtm.zztd r6 = (com.google.android.gms.internal.gtm.zztd) r6
            r14.mo135096p(r7, r6)
            goto L_0x0501
        L_0x045b:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            com.google.android.gms.internal.gtm.hl r8 = r12.mo136078p(r5)
            r14.mo135077H(r7, r6, r8)
            goto L_0x0501
        L_0x0470:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r8)
            m168783H(r7, r6, r14)
            goto L_0x0501
        L_0x0481:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = com.google.android.gms.internal.gtm.C41340im.m167739B(r13, r8)
            r14.mo135094n(r7, r6)
            goto L_0x0501
        L_0x0492:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.C41340im.m167750h(r13, r8)
            r14.mo135103w(r7, r6)
            goto L_0x0501
        L_0x04a2:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.gtm.C41340im.m167751i(r13, r8)
            r14.mo135105y(r7, r8)
            goto L_0x0501
        L_0x04b2:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.C41340im.m167750h(r13, r8)
            r14.mo135073D(r7, r6)
            goto L_0x0501
        L_0x04c2:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.gtm.C41340im.m167751i(r13, r8)
            r14.mo135092k(r7, r8)
            goto L_0x0501
        L_0x04d2:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.gtm.C41340im.m167751i(r13, r8)
            r14.mo135075F(r7, r8)
            goto L_0x0501
        L_0x04e2:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = com.google.android.gms.internal.gtm.C41340im.m167749g(r13, r8)
            r14.mo135070A(r7, r6)
            goto L_0x0501
        L_0x04f2:
            boolean r8 = r12.mo136060A(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = com.google.android.gms.internal.gtm.C41340im.m167748f(r13, r8)
            r14.mo135098r(r7, r8)
        L_0x0501:
            int r5 = r5 + 3
            goto L_0x0029
        L_0x0505:
            if (r2 == 0) goto L_0x051b
            com.google.android.gms.internal.gtm.xi<?> r3 = r12.f105264n
            r3.mo136055j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0519
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0505
        L_0x0519:
            r2 = r1
            goto L_0x0505
        L_0x051b:
            com.google.android.gms.internal.gtm.yl<?, ?> r0 = r12.f105263m
            java.lang.Object r13 = r0.mo135042d(r13)
            r0.mo135056s(r13, r14)
            return
        L_0x0525:
            r12.mo136063F(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.mo135462h(java.lang.Object, com.google.android.gms.internal.gtm.bi):void");
    }

    /* renamed from: i */
    public final void mo135463i(T t, byte[] bArr, int i, int i2, C41167bh bhVar) throws IOException {
        if (this.f105258h) {
            mo136070T(t, bArr, i, i2, bhVar);
        } else {
            mo136065I(t, bArr, i, i2, 0, bhVar);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: j */
    public final void mo135464j(T r13, com.google.android.gms.internal.gtm.C41291gl r14, com.google.android.gms.internal.gtm.C41673wi r15) throws java.io.IOException {
        /*
            r12 = this;
            r15.getClass()
            com.google.android.gms.internal.gtm.yl<?, ?> r7 = r12.f105263m
            com.google.android.gms.internal.gtm.xi<?> r8 = r12.f105264n
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x000a:
            int r1 = r14.mo135268d()     // Catch:{ all -> 0x0077 }
            int r2 = r12.mo136072V(r1)     // Catch:{ all -> 0x0077 }
            if (r2 >= 0) goto L_0x007a
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002f
            int r14 = r12.f105260j
        L_0x001b:
            int r15 = r12.f105261k
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.f105259i
            r15 = r15[r14]
            r12.mo136079q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001b
        L_0x0029:
            if (r10 == 0) goto L_0x05b6
            r7.mo135052n(r13, r10)
            return
        L_0x002f:
            boolean r2 = r12.f105256f     // Catch:{ all -> 0x0077 }
            if (r2 != 0) goto L_0x0035
            r2 = r9
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.gtm.uk r2 = r12.f105255e     // Catch:{ all -> 0x0077 }
            java.lang.Object r1 = r8.mo136049d(r15, r2, r1)     // Catch:{ all -> 0x0077 }
            r2 = r1
        L_0x003c:
            if (r2 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0044
            com.google.android.gms.internal.gtm.bj r0 = r8.mo136048c(r13)     // Catch:{ all -> 0x0077 }
        L_0x0044:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.mo136050e(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0077 }
            r0 = r11
            goto L_0x000a
        L_0x0051:
            r7.mo135054q(r14)     // Catch:{ all -> 0x0077 }
            if (r10 != 0) goto L_0x005b
            java.lang.Object r1 = r7.mo135041c(r13)     // Catch:{ all -> 0x0077 }
            r10 = r1
        L_0x005b:
            boolean r1 = r7.mo136114p(r10, r14)     // Catch:{ all -> 0x0077 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f105260j
        L_0x0063:
            int r15 = r12.f105261k
            if (r14 >= r15) goto L_0x0071
            int[] r15 = r12.f105259i
            r15 = r15[r14]
            r12.mo136079q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0063
        L_0x0071:
            if (r10 == 0) goto L_0x05b6
            r7.mo135052n(r13, r10)
            return
        L_0x0077:
            r14 = move-exception
            goto L_0x05b7
        L_0x007a:
            int r3 = r12.mo136076m(r2)     // Catch:{ all -> 0x0077 }
            int r4 = m168790l(r3)     // Catch:{ zzvj -> 0x0591 }
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0567;
                case 1: goto L_0x0558;
                case 2: goto L_0x0549;
                case 3: goto L_0x053a;
                case 4: goto L_0x052b;
                case 5: goto L_0x051c;
                case 6: goto L_0x050d;
                case 7: goto L_0x04fe;
                case 8: goto L_0x04f6;
                case 9: goto L_0x04c5;
                case 10: goto L_0x04b6;
                case 11: goto L_0x04a7;
                case 12: goto L_0x0485;
                case 13: goto L_0x0476;
                case 14: goto L_0x0467;
                case 15: goto L_0x0458;
                case 16: goto L_0x0449;
                case 17: goto L_0x0418;
                case 18: goto L_0x040a;
                case 19: goto L_0x03fc;
                case 20: goto L_0x03ee;
                case 21: goto L_0x03e0;
                case 22: goto L_0x03d2;
                case 23: goto L_0x03c4;
                case 24: goto L_0x03b6;
                case 25: goto L_0x03a8;
                case 26: goto L_0x0386;
                case 27: goto L_0x0374;
                case 28: goto L_0x0366;
                case 29: goto L_0x0358;
                case 30: goto L_0x0343;
                case 31: goto L_0x0335;
                case 32: goto L_0x0327;
                case 33: goto L_0x0319;
                case 34: goto L_0x030b;
                case 35: goto L_0x02fd;
                case 36: goto L_0x02ef;
                case 37: goto L_0x02e1;
                case 38: goto L_0x02d3;
                case 39: goto L_0x02c5;
                case 40: goto L_0x02b7;
                case 41: goto L_0x02a9;
                case 42: goto L_0x029b;
                case 43: goto L_0x028d;
                case 44: goto L_0x0278;
                case 45: goto L_0x026a;
                case 46: goto L_0x025c;
                case 47: goto L_0x024e;
                case 48: goto L_0x0240;
                case 49: goto L_0x022e;
                case 50: goto L_0x01f8;
                case 51: goto L_0x01e6;
                case 52: goto L_0x01d4;
                case 53: goto L_0x01c2;
                case 54: goto L_0x01b0;
                case 55: goto L_0x019e;
                case 56: goto L_0x018c;
                case 57: goto L_0x017a;
                case 58: goto L_0x0168;
                case 59: goto L_0x0160;
                case 60: goto L_0x012f;
                case 61: goto L_0x0121;
                case 62: goto L_0x010f;
                case 63: goto L_0x00ea;
                case 64: goto L_0x00d8;
                case 65: goto L_0x00c6;
                case 66: goto L_0x00b4;
                case 67: goto L_0x00a2;
                case 68: goto L_0x0090;
                default: goto L_0x0088;
            }     // Catch:{ zzvj -> 0x0591 }
        L_0x0088:
            if (r10 != 0) goto L_0x0577
            java.lang.Object r1 = r7.mo135044f()     // Catch:{ zzvj -> 0x0591 }
            goto L_0x0576
        L_0x0090:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.hl r5 = r12.mo136078p(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r5 = r14.mo135237B(r5, r15)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x00a2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.mo135288s()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x00b4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            int r5 = r14.mo135280k()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x00c6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.mo135287r()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x00d8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            int r5 = r14.mo135279j()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x00ea:
            int r4 = r14.mo135272f()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.qj r6 = r12.mo136077o(r2)     // Catch:{ zzvj -> 0x0591 }
            if (r6 == 0) goto L_0x0101
            boolean r6 = r6.mo135344l(r4)     // Catch:{ zzvj -> 0x0591 }
            if (r6 == 0) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            java.lang.Object r10 = com.google.android.gms.internal.gtm.C41363jl.m167829d(r1, r4, r10, r7)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0101:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r5, r3)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x010f:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            int r5 = r14.mo135285p()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0121:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zztd r5 = r14.mo135291v()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x012f:
            boolean r4 = r12.mo136062D(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            if (r4 == 0) goto L_0x014b
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r5 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r3)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.hl r6 = r12.mo136078p(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r6 = r14.mo135242G(r6, r15)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r5 = com.google.android.gms.internal.gtm.C41650vj.m168605g(r5, r6)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x015b
        L_0x014b:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.hl r5 = r12.mo136078p(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r5 = r14.mo135242G(r5, r15)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
        L_0x015b:
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0160:
            r12.mo136083v(r13, r3, r14)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0168:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            boolean r5 = r14.mo135260Y()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x017a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            int r5 = r14.mo135284o()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x018c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.mo135289t()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x019e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            int r5 = r14.mo135276h()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x01b0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.mo135290u()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x01c2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.mo135286q()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x01d4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            float r5 = r14.zzb()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x01e6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            double r5 = r14.zza()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136085x(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x01f8:
            java.lang.Object r1 = r12.mo136080r(r2)     // Catch:{ zzvj -> 0x0591 }
            int r2 = r12.mo136076m(r2)     // Catch:{ zzvj -> 0x0591 }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r4 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            if (r4 == 0) goto L_0x021e
            boolean r5 = com.google.android.gms.internal.gtm.C41507pk.m168194b(r4)     // Catch:{ zzvj -> 0x0591 }
            if (r5 == 0) goto L_0x0229
            com.google.android.gms.internal.gtm.zzwe r5 = com.google.android.gms.internal.gtm.zzwe.m169007b()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwe r5 = r5.mo136163c()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41507pk.m168195c(r5, r4)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r2, r5)     // Catch:{ zzvj -> 0x0591 }
            r4 = r5
            goto L_0x0229
        L_0x021e:
            com.google.android.gms.internal.gtm.zzwe r4 = com.google.android.gms.internal.gtm.zzwe.m169007b()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwe r4 = r4.mo136163c()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r2, r4)     // Catch:{ zzvj -> 0x0591 }
        L_0x0229:
            com.google.android.gms.internal.gtm.zzwe r4 = (com.google.android.gms.internal.gtm.zzwe) r4     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.ok r1 = (com.google.android.gms.internal.gtm.C41483ok) r1     // Catch:{ zzvj -> 0x0591 }
            throw r9     // Catch:{ zzvj -> 0x0591 }
        L_0x022e:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.hl r1 = r12.mo136078p(r2)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.ik r2 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            java.util.List r2 = r2.mo135347a(r13, r3)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135241F(r2, r1, r15)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0240:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135257V(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x024e:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135261Z(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x025c:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135263a0(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x026a:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135259X(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0278:
            com.google.android.gms.internal.gtm.ik r4 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            java.util.List r3 = r4.mo135347a(r13, r5)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135255T(r3)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.qj r2 = r12.mo136077o(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r10 = com.google.android.gms.internal.gtm.C41363jl.m167828c(r1, r3, r2, r10, r7)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x028d:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135251P(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x029b:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135238C(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02a9:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135254S(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02b7:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135240E(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02c5:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135244I(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02d3:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135249N(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02e1:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135243H(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02ef:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135239D(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02fd:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135250O(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x030b:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135257V(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0319:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135261Z(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0327:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135263a0(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0335:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135259X(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0343:
            com.google.android.gms.internal.gtm.ik r4 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            java.util.List r3 = r4.mo135347a(r13, r5)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135255T(r3)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.qj r2 = r12.mo136077o(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r10 = com.google.android.gms.internal.gtm.C41363jl.m167828c(r1, r3, r2, r10, r7)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0358:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135251P(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0366:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135247L(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0374:
            com.google.android.gms.internal.gtm.hl r1 = r12.mo136078p(r2)     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.ik r4 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            java.util.List r2 = r4.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135246K(r2, r1, r15)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0386:
            boolean r1 = m168793z(r3)     // Catch:{ zzvj -> 0x0591 }
            if (r1 == 0) goto L_0x039a
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135258W(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x039a:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135256U(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03a8:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135238C(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03b6:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135254S(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03c4:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135240E(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03d2:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135244I(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03e0:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135249N(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03ee:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135243H(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03fc:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135239D(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x040a:
            com.google.android.gms.internal.gtm.ik r1 = r12.f105262l     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.mo135347a(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.mo135250O(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0418:
            boolean r1 = r12.mo136060A(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            if (r1 == 0) goto L_0x0436
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r3)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.hl r2 = r12.mo136078p(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r2 = r14.mo135237B(r2, r15)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = com.google.android.gms.internal.gtm.C41650vj.m168605g(r1, r2)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0436:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.hl r1 = r12.mo136078p(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = r14.mo135237B(r1, r15)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0449:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.mo135288s()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167765w(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0458:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            int r1 = r14.mo135280k()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167764v(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0467:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.mo135287r()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167765w(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0476:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            int r1 = r14.mo135279j()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167764v(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0485:
            int r4 = r14.mo135272f()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.qj r6 = r12.mo136077o(r2)     // Catch:{ zzvj -> 0x0591 }
            if (r6 == 0) goto L_0x049c
            boolean r6 = r6.mo135344l(r4)     // Catch:{ zzvj -> 0x0591 }
            if (r6 == 0) goto L_0x0496
            goto L_0x049c
        L_0x0496:
            java.lang.Object r10 = com.google.android.gms.internal.gtm.C41363jl.m167829d(r1, r4, r10, r7)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x049c:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167764v(r13, r5, r4)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04a7:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            int r1 = r14.mo135285p()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167764v(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04b6:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zztd r1 = r14.mo135291v()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04c5:
            boolean r1 = r12.mo136060A(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            if (r1 == 0) goto L_0x04e3
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = com.google.android.gms.internal.gtm.C41340im.m167753k(r13, r3)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.hl r2 = r12.mo136078p(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r2 = r14.mo135242G(r2, r15)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = com.google.android.gms.internal.gtm.C41650vj.m168605g(r1, r2)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04e3:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.hl r1 = r12.mo136078p(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = r14.mo135242G(r1, r15)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167766x(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04f6:
            r12.mo136083v(r13, r3, r14)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04fe:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            boolean r1 = r14.mo135260Y()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167760r(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x050d:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            int r1 = r14.mo135284o()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167764v(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x051c:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.mo135289t()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167765w(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x052b:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            int r1 = r14.mo135276h()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167764v(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x053a:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.mo135290u()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167765w(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0549:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.mo135286q()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167765w(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0558:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            float r1 = r14.zzb()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167763u(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0567:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            double r5 = r14.zza()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.C41340im.m167762t(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.mo136084w(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0576:
            r10 = r1
        L_0x0577:
            boolean r1 = r7.mo136114p(r10, r14)     // Catch:{ zzvj -> 0x0591 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f105260j
        L_0x057f:
            int r15 = r12.f105261k
            if (r14 >= r15) goto L_0x058d
            int[] r15 = r12.f105259i
            r15 = r15[r14]
            r12.mo136079q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x057f
        L_0x058d:
            r7.mo135052n(r13, r10)
            return
        L_0x0591:
            r7.mo135054q(r14)     // Catch:{ all -> 0x0077 }
            if (r10 != 0) goto L_0x059b
            java.lang.Object r1 = r7.mo135041c(r13)     // Catch:{ all -> 0x0077 }
            r10 = r1
        L_0x059b:
            boolean r1 = r7.mo136114p(r10, r14)     // Catch:{ all -> 0x0077 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f105260j
        L_0x05a3:
            int r15 = r12.f105261k
            if (r14 >= r15) goto L_0x05b1
            int[] r15 = r12.f105259i
            r15 = r15[r14]
            r12.mo136079q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x05a3
        L_0x05b1:
            if (r10 == 0) goto L_0x05b6
            r7.mo135052n(r13, r10)
        L_0x05b6:
            return
        L_0x05b7:
            int r15 = r12.f105260j
        L_0x05b9:
            int r0 = r12.f105261k
            if (r15 >= r0) goto L_0x05c7
            int[] r0 = r12.f105259i
            r0 = r0[r15]
            r12.mo136079q(r13, r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x05b9
        L_0x05c7:
            if (r10 == 0) goto L_0x05cc
            r7.mo135052n(r13, r10)
        L_0x05cc:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41699xk.mo135464j(java.lang.Object, com.google.android.gms.internal.gtm.gl, com.google.android.gms.internal.gtm.wi):void");
    }

    /* renamed from: k */
    public final int mo136075k(int i, int i2) {
        int length = (this.f105251a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f105251a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final int mo136076m(int i) {
        return this.f105251a[i + 1];
    }

    /* renamed from: o */
    public final C41530qj mo136077o(int i) {
        int i2 = i / 3;
        return (C41530qj) this.f105252b[i2 + i2 + 1];
    }

    /* renamed from: p */
    public final C41315hl mo136078p(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C41315hl hlVar = (C41315hl) this.f105252b[i3];
        if (hlVar != null) {
            return hlVar;
        }
        C41315hl b = C41219dl.m167407a().mo135299b((Class) this.f105252b[i3 + 1]);
        this.f105252b[i3] = b;
        return b;
    }

    /* renamed from: q */
    public final <UT, UB> UB mo136079q(Object obj, int i, UB ub, C41724yl<UT, UB> ylVar) {
        int i2 = this.f105251a[i];
        Object k = C41340im.m167753k(obj, (long) (mo136076m(i) & 1048575));
        if (k == null || mo136077o(i) == null) {
            return ub;
        }
        zzwe zzwe = (zzwe) k;
        C41483ok okVar = (C41483ok) mo136080r(i);
        throw null;
    }

    /* renamed from: r */
    public final Object mo136080r(int i) {
        int i2 = i / 3;
        return this.f105252b[i2 + i2];
    }

    /* renamed from: t */
    public final void mo136081t(T t, T t2, int i) {
        long m = (long) (mo136076m(i) & 1048575);
        if (mo136060A(t2, i)) {
            Object k = C41340im.m167753k(t, m);
            Object k2 = C41340im.m167753k(t2, m);
            if (k != null && k2 != null) {
                C41340im.m167766x(t, m, C41650vj.m168605g(k, k2));
                mo136084w(t, i);
            } else if (k2 != null) {
                C41340im.m167766x(t, m, k2);
                mo136084w(t, i);
            }
        }
    }

    /* renamed from: u */
    public final void mo136082u(T t, T t2, int i) {
        Object obj;
        int m = mo136076m(i);
        int i2 = this.f105251a[i];
        long j = (long) (m & 1048575);
        if (mo136062D(t2, i2, i)) {
            if (mo136062D(t, i2, i)) {
                obj = C41340im.m167753k(t, j);
            } else {
                obj = null;
            }
            Object k = C41340im.m167753k(t2, j);
            if (obj != null && k != null) {
                C41340im.m167766x(t, j, C41650vj.m168605g(obj, k));
                mo136085x(t, i2, i);
            } else if (k != null) {
                C41340im.m167766x(t, j, k);
                mo136085x(t, i2, i);
            }
        }
    }

    /* renamed from: v */
    public final void mo136083v(Object obj, int i, C41291gl glVar) throws IOException {
        if (m168793z(i)) {
            C41340im.m167766x(obj, (long) (i & 1048575), glVar.mo135245J());
        } else if (this.f105257g) {
            C41340im.m167766x(obj, (long) (i & 1048575), glVar.mo135253R());
        } else {
            C41340im.m167766x(obj, (long) (i & 1048575), glVar.mo135291v());
        }
    }

    /* renamed from: w */
    public final void mo136084w(T t, int i) {
        int X = mo136074X(i);
        long j = (long) (1048575 & X);
        if (j != 1048575) {
            C41340im.m167764v(t, j, (1 << (X >>> 20)) | C41340im.m167750h(t, j));
        }
    }

    /* renamed from: x */
    public final void mo136085x(T t, int i, int i2) {
        C41340im.m167764v(t, (long) (mo136074X(i2) & 1048575), i);
    }

    /* renamed from: y */
    public final boolean mo136086y(T t, T t2, int i) {
        return mo136060A(t, i) == mo136060A(t2, i);
    }
}
