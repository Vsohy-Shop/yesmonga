package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.za */
public final class C42297za<T> implements C41987hb<T> {

    /* renamed from: p */
    public static final int[] f106586p = new int[0];

    /* renamed from: q */
    public static final Unsafe f106587q = C42006ic.m170301l();

    /* renamed from: a */
    public final int[] f106588a;

    /* renamed from: b */
    public final Object[] f106589b;

    /* renamed from: c */
    public final int f106590c;

    /* renamed from: d */
    public final int f106591d;

    /* renamed from: e */
    public final C42246wa f106592e;

    /* renamed from: f */
    public final boolean f106593f;

    /* renamed from: g */
    public final boolean f106594g;

    /* renamed from: h */
    public final int[] f106595h;

    /* renamed from: i */
    public final int f106596i;

    /* renamed from: j */
    public final int f106597j;

    /* renamed from: k */
    public final C42040ka f106598k;

    /* renamed from: l */
    public final C42281yb f106599l;

    /* renamed from: m */
    public final C41949f9 f106600m;

    /* renamed from: n */
    public final C41879bb f106601n;

    /* renamed from: o */
    public final C42161ra f106602o;

    public C42297za(int[] iArr, Object[] objArr, int i, int i2, C42246wa waVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C41879bb bbVar, C42040ka kaVar, C42281yb ybVar, C41949f9 f9Var, C42161ra raVar) {
        this.f106588a = iArr;
        this.f106589b = objArr;
        this.f106590c = i;
        this.f106591d = i2;
        this.f106594g = z;
        boolean z3 = false;
        if (f9Var != null && f9Var.mo136766c(waVar)) {
            z3 = true;
        }
        this.f106593f = z3;
        this.f106595h = iArr2;
        this.f106596i = i3;
        this.f106597j = i4;
        this.f106601n = bbVar;
        this.f106598k = kaVar;
        this.f106599l = ybVar;
        this.f106600m = f9Var;
        this.f106592e = waVar;
        this.f106602o = raVar;
    }

    /* renamed from: A */
    public static boolean m171238A(Object obj, int i, C41987hb hbVar) {
        return hbVar.mo136569g(C42006ic.m170300k(obj, (long) (i & 1048575)));
    }

    /* renamed from: B */
    public static boolean m171239B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C42177s9) {
            return ((C42177s9) obj).mo137284y();
        }
        return true;
    }

    /* renamed from: D */
    public static boolean m171240D(Object obj, long j) {
        return ((Boolean) C42006ic.m170300k(obj, j)).booleanValue();
    }

    /* renamed from: E */
    public static final void m171241E(int i, Object obj, C42112oc ocVar) throws IOException {
        if (obj instanceof String) {
            ocVar.mo136541e(i, (String) obj);
        } else {
            ocVar.mo136551o(i, (zzka) obj);
        }
    }

    /* renamed from: G */
    public static C42298zb m171242G(Object obj) {
        C42177s9 s9Var = (C42177s9) obj;
        C42298zb zbVar = s9Var.zzc;
        if (zbVar != C42298zb.m171286c()) {
            return zbVar;
        }
        C42298zb f = C42298zb.m171288f();
        s9Var.zzc = f;
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0372  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C42297za m171243H(java.lang.Class r31, com.google.android.gms.internal.measurement.C42195ta r32, com.google.android.gms.internal.measurement.C41879bb r33, com.google.android.gms.internal.measurement.C42040ka r34, com.google.android.gms.internal.measurement.C42281yb r35, com.google.android.gms.internal.measurement.C41949f9 r36, com.google.android.gms.internal.measurement.C42161ra r37) {
        /*
            r0 = r32
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C41969gb
            if (r1 == 0) goto L_0x03da
            com.google.android.gms.internal.measurement.gb r0 = (com.google.android.gms.internal.measurement.C41969gb) r0
            int r1 = r0.mo136881d()
            java.lang.String r2 = r0.mo136879a()
            int r3 = r2.length()
            r4 = 0
            char r5 = r2.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0029
            r5 = 1
        L_0x001f:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x002a
            r5 = r8
            goto L_0x001f
        L_0x0029:
            r8 = 1
        L_0x002a:
            int r5 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0049
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0036:
            int r11 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x0046
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r10
            r8 = r8 | r5
            int r10 = r10 + 13
            r5 = r11
            goto L_0x0036
        L_0x0046:
            int r5 = r5 << r10
            r8 = r8 | r5
            r5 = r11
        L_0x0049:
            if (r8 != 0) goto L_0x0059
            int[] r8 = f106586p
            r10 = r4
            r12 = r10
            r13 = r12
            r14 = r13
            r19 = r14
            r18 = r8
            r8 = r19
            goto L_0x016f
        L_0x0059:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x0078
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0065:
            int r11 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0075
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r5 = r5 | r8
            int r10 = r10 + 13
            r8 = r11
            goto L_0x0065
        L_0x0075:
            int r8 = r8 << r10
            r5 = r5 | r8
            r8 = r11
        L_0x0078:
            int r10 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0097
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x0084:
            int r12 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x0094
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r8 = r8 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x0084
        L_0x0094:
            int r10 = r10 << r11
            r8 = r8 | r10
            r10 = r12
        L_0x0097:
            int r11 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x00b6
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a3:
            int r13 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00b3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00a3
        L_0x00b3:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00b6:
            int r12 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00d5
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c2:
            int r14 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00d2
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c2
        L_0x00d2:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00d5:
            int r13 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00f4
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e1:
            int r15 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x00f1
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e1
        L_0x00f1:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f4:
            int r14 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x0115
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0100:
            int r16 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x0111
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0100
        L_0x0111:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0115:
            int r15 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x0138
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0121:
            int r17 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x0133
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0121
        L_0x0133:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0138:
            int r16 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x015d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0146:
            int r17 = r4 + 1
            char r4 = r2.charAt(r4)
            if (r4 < r6) goto L_0x0158
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x0146
        L_0x0158:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x015d:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int r14 = r5 + r5
            int r14 = r14 + r8
            int[] r8 = new int[r4]
            r4 = r5
            r18 = r8
            r8 = r10
            r10 = r14
            r19 = r15
            r5 = r16
            r14 = r11
        L_0x016f:
            sun.misc.Unsafe r11 = f106587q
            java.lang.Object[] r15 = r0.mo136880b()
            com.google.android.gms.internal.measurement.wa r16 = r0.zza()
            java.lang.Class r9 = r16.getClass()
            int r20 = r19 + r13
            int r13 = r12 + r12
            int r12 = r12 * 3
            int[] r12 = new int[r12]
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r21 = r19
            r22 = r20
            r16 = 0
            r17 = 0
        L_0x018f:
            r7 = 2
            if (r1 != r7) goto L_0x0194
            r7 = 1
            goto L_0x0195
        L_0x0194:
            r7 = 0
        L_0x0195:
            if (r5 >= r3) goto L_0x03b9
            int r24 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x01c4
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r6 = r24
            r24 = 13
        L_0x01a5:
            int r26 = r6 + 1
            char r6 = r2.charAt(r6)
            r27 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x01be
            r1 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r5 = r5 | r1
            int r24 = r24 + 13
            r6 = r26
            r1 = r27
            goto L_0x01a5
        L_0x01be:
            int r1 = r6 << r24
            r5 = r5 | r1
            r1 = r26
            goto L_0x01c8
        L_0x01c4:
            r27 = r1
            r1 = r24
        L_0x01c8:
            int r6 = r1 + 1
            char r1 = r2.charAt(r1)
            r24 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r3) goto L_0x01f3
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x01d9:
            int r28 = r6 + 1
            char r6 = r2.charAt(r6)
            if (r6 < r3) goto L_0x01ee
            r3 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r26
            r1 = r1 | r3
            int r26 = r26 + 13
            r6 = r28
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01d9
        L_0x01ee:
            int r3 = r6 << r26
            r1 = r1 | r3
            r6 = r28
        L_0x01f3:
            r3 = r1 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x01fd
            int r3 = r16 + 1
            r18[r16] = r17
            r16 = r3
        L_0x01fd:
            r3 = r1 & 255(0xff, float:3.57E-43)
            r26 = r14
            r14 = 51
            if (r3 < r14) goto L_0x029f
            int r14 = r6 + 1
            char r6 = r2.charAt(r6)
            r28 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x0237
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = r28
            r28 = 13
        L_0x0218:
            int r29 = r14 + 1
            char r14 = r2.charAt(r14)
            r30 = r8
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r8) goto L_0x0231
            r8 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r28
            r6 = r6 | r8
            int r28 = r28 + 13
            r14 = r29
            r8 = r30
            goto L_0x0218
        L_0x0231:
            int r8 = r14 << r28
            r6 = r6 | r8
            r14 = r29
            goto L_0x023b
        L_0x0237:
            r30 = r8
            r14 = r28
        L_0x023b:
            int r8 = r3 + -51
            r28 = r14
            r14 = 9
            if (r8 == r14) goto L_0x025a
            r14 = 17
            if (r8 != r14) goto L_0x0248
            goto L_0x025a
        L_0x0248:
            r14 = 12
            if (r8 != r14) goto L_0x0266
            if (r7 != 0) goto L_0x0266
            int r7 = r17 / 3
            int r7 = r7 + r7
            r8 = 1
            int r7 = r7 + r8
            int r8 = r10 + 1
            r10 = r15[r10]
            r13[r7] = r10
            goto L_0x0265
        L_0x025a:
            int r7 = r17 / 3
            int r7 = r7 + r7
            r8 = 1
            int r7 = r7 + r8
            int r8 = r10 + 1
            r10 = r15[r10]
            r13[r7] = r10
        L_0x0265:
            r10 = r8
        L_0x0266:
            int r6 = r6 + r6
            r7 = r15[r6]
            boolean r8 = r7 instanceof java.lang.reflect.Field
            if (r8 == 0) goto L_0x0270
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0278
        L_0x0270:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m171249o(r9, r7)
            r15[r6] = r7
        L_0x0278:
            long r7 = r11.objectFieldOffset(r7)
            int r7 = (int) r7
            int r6 = r6 + 1
            r8 = r15[r6]
            boolean r14 = r8 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0288
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0290
        L_0x0288:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m171249o(r9, r8)
            r15[r6] = r8
        L_0x0290:
            r14 = r7
            long r6 = r11.objectFieldOffset(r8)
            int r6 = (int) r6
            r7 = r14
            r23 = r15
            r25 = r28
            r14 = r6
            r6 = 0
            goto L_0x0384
        L_0x029f:
            r30 = r8
            int r8 = r10 + 1
            r10 = r15[r10]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m171249o(r9, r10)
            r14 = 9
            if (r3 == r14) goto L_0x030f
            r14 = 17
            if (r3 != r14) goto L_0x02b4
            goto L_0x030f
        L_0x02b4:
            r14 = 27
            if (r3 == r14) goto L_0x0301
            r14 = 49
            if (r3 != r14) goto L_0x02bd
            goto L_0x0301
        L_0x02bd:
            r14 = 12
            if (r3 == r14) goto L_0x02f1
            r14 = 30
            if (r3 == r14) goto L_0x02f1
            r14 = 44
            if (r3 != r14) goto L_0x02ca
            goto L_0x02f1
        L_0x02ca:
            r7 = 50
            if (r3 != r7) goto L_0x02ff
            int r7 = r21 + 1
            r18[r21] = r17
            int r14 = r17 / 3
            int r21 = r8 + 1
            r8 = r15[r8]
            int r14 = r14 + r14
            r13[r14] = r8
            r8 = r1 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02ea
            int r14 = r14 + 1
            int r8 = r21 + 1
            r21 = r15[r21]
            r13[r14] = r21
            r21 = r7
            goto L_0x031a
        L_0x02ea:
            r23 = r15
            r8 = r21
            r21 = r7
            goto L_0x031c
        L_0x02f1:
            if (r7 != 0) goto L_0x02ff
            int r7 = r17 / 3
            int r7 = r7 + r7
            r14 = 1
            int r7 = r7 + r14
            int r23 = r8 + 1
            r8 = r15[r8]
            r13[r7] = r8
            goto L_0x030c
        L_0x02ff:
            r14 = 1
            goto L_0x031a
        L_0x0301:
            r14 = 1
            int r7 = r17 / 3
            int r7 = r7 + r7
            int r7 = r7 + r14
            int r23 = r8 + 1
            r8 = r15[r8]
            r13[r7] = r8
        L_0x030c:
            r8 = r23
            goto L_0x031a
        L_0x030f:
            r14 = 1
            int r7 = r17 / 3
            int r7 = r7 + r7
            int r7 = r7 + r14
            java.lang.Class r23 = r10.getType()
            r13[r7] = r23
        L_0x031a:
            r23 = r15
        L_0x031c:
            long r14 = r11.objectFieldOffset(r10)
            int r7 = (int) r14
            r10 = r1 & 4096(0x1000, float:5.74E-42)
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 4096(0x1000, float:5.74E-42)
            if (r10 != r15) goto L_0x0372
            r10 = 17
            if (r3 > r10) goto L_0x0372
            int r10 = r6 + 1
            char r6 = r2.charAt(r6)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x0351
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x033d:
            int r25 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r15) goto L_0x034e
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r14
            r6 = r6 | r10
            int r14 = r14 + 13
            r10 = r25
            goto L_0x033d
        L_0x034e:
            int r10 = r10 << r14
            r6 = r6 | r10
            goto L_0x0353
        L_0x0351:
            r25 = r10
        L_0x0353:
            int r10 = r4 + r4
            int r14 = r6 / 32
            int r10 = r10 + r14
            r14 = r23[r10]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0361
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0369
        L_0x0361:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = m171249o(r9, r14)
            r23[r10] = r14
        L_0x0369:
            long r14 = r11.objectFieldOffset(r14)
            int r10 = (int) r14
            int r6 = r6 % 32
            r14 = r10
            goto L_0x0375
        L_0x0372:
            r25 = r6
            r6 = 0
        L_0x0375:
            r10 = 18
            if (r3 < r10) goto L_0x0383
            r10 = 49
            if (r3 > r10) goto L_0x0383
            int r10 = r22 + 1
            r18[r22] = r7
            r22 = r10
        L_0x0383:
            r10 = r8
        L_0x0384:
            int r8 = r17 + 1
            r12[r17] = r5
            int r5 = r8 + 1
            r15 = r1 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0391
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0392
        L_0x0391:
            r15 = 0
        L_0x0392:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0399
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039a
        L_0x0399:
            r1 = 0
        L_0x039a:
            int r3 = r3 << 20
            r1 = r1 | r15
            r1 = r1 | r3
            r1 = r1 | r7
            r12[r8] = r1
            int r17 = r5 + 1
            int r1 = r6 << 20
            r1 = r1 | r14
            r12[r5] = r1
            r15 = r23
            r3 = r24
            r5 = r25
            r14 = r26
            r1 = r27
            r8 = r30
            r6 = 55296(0xd800, float:7.7486E-41)
            goto L_0x018f
        L_0x03b9:
            r30 = r8
            r26 = r14
            com.google.android.gms.internal.measurement.za r1 = new com.google.android.gms.internal.measurement.za
            com.google.android.gms.internal.measurement.wa r15 = r0.zza()
            r17 = 0
            r10 = r1
            r11 = r12
            r12 = r13
            r13 = r30
            r16 = r7
            r21 = r33
            r22 = r34
            r23 = r35
            r24 = r36
            r25 = r37
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L_0x03da:
            com.google.android.gms.internal.measurement.wb r0 = (com.google.android.gms.internal.measurement.C42247wb) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42297za.m171243H(java.lang.Class, com.google.android.gms.internal.measurement.ta, com.google.android.gms.internal.measurement.bb, com.google.android.gms.internal.measurement.ka, com.google.android.gms.internal.measurement.yb, com.google.android.gms.internal.measurement.f9, com.google.android.gms.internal.measurement.ra):com.google.android.gms.internal.measurement.za");
    }

    /* renamed from: I */
    public static double m171244I(Object obj, long j) {
        return ((Double) C42006ic.m170300k(obj, j)).doubleValue();
    }

    /* renamed from: J */
    public static float m171245J(Object obj, long j) {
        return ((Float) C42006ic.m170300k(obj, j)).floatValue();
    }

    /* renamed from: L */
    public static int m171246L(Object obj, long j) {
        return ((Integer) C42006ic.m170300k(obj, j)).intValue();
    }

    /* renamed from: T */
    public static int m171247T(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: V */
    public static long m171248V(Object obj, long j) {
        return ((Long) C42006ic.m170300k(obj, j)).longValue();
    }

    /* renamed from: o */
    public static Field m171249o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: p */
    public static void m171250p(Object obj) {
        if (!m171239B(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: C */
    public final boolean mo137497C(Object obj, int i, int i2) {
        if (C42006ic.m170297h(obj, (long) (mo137505R(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x030e, code lost:
        if (r0 != r15) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x032c, code lost:
        r2 = r0;
        r7 = r21;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0360, code lost:
        if (r0 != r15) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0388, code lost:
        if (r0 != r15) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0154, code lost:
        r5 = r7 | r8;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0157, code lost:
        r1 = r11;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015b, code lost:
        r12 = r6;
        r21 = r13;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f0, code lost:
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0223, code lost:
        r6 = r24;
        r8 = -1;
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0251, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0253, code lost:
        r5 = r7 | r8;
        r13 = r32;
        r2 = r6;
        r1 = r11;
        r3 = r21;
        r6 = r24;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x025e, code lost:
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0262, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0263, code lost:
        r0 = r33;
        r20 = r7;
        r27 = r10;
        r31 = r11;
        r22 = r12;
        r2 = r13;
        r7 = r21;
        r6 = r24;
        r19 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03d0  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo137498F(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.C42002i8 r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            m171250p(r29)
            sun.misc.Unsafe r10 = f106587q
            r16 = 0
            r8 = -1
            r0 = r31
            r1 = r8
            r2 = r16
            r3 = r2
            r5 = r3
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001e:
            r17 = 0
            if (r0 >= r13) goto L_0x03f7
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0031
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170354k(r0, r12, r3, r9)
            int r3 = r9.f106210a
            r4 = r3
            r3 = r0
            goto L_0x0032
        L_0x0031:
            r4 = r0
        L_0x0032:
            int r0 = r4 >>> 3
            r7 = 3
            if (r0 <= r1) goto L_0x003d
            int r2 = r2 / r7
            int r1 = r15.mo137504Q(r0, r2)
            goto L_0x0041
        L_0x003d:
            int r1 = r15.mo137503P(r0)
        L_0x0041:
            r2 = r1
            if (r2 != r8) goto L_0x0053
            r31 = r0
            r2 = r3
            r7 = r4
            r20 = r5
            r19 = r8
            r27 = r10
            r0 = r11
            r22 = r16
            goto L_0x038b
        L_0x0053:
            r1 = r4 & 7
            int[] r8 = r15.f106588a
            int r20 = r2 + 1
            r7 = r8[r20]
            int r11 = m171247T(r7)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r7 & r18
            r22 = r3
            r21 = r4
            long r3 = (long) r0
            r0 = 17
            if (r11 > r0) goto L_0x0276
            int r0 = r2 + 2
            r0 = r8[r0]
            int r8 = r0 >>> 20
            r13 = 1
            int r8 = r13 << r8
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r13
            r18 = r7
            if (r0 == r6) goto L_0x008f
            if (r6 == r13) goto L_0x0086
            long r6 = (long) r6
            r10.putInt(r14, r6, r5)
        L_0x0086:
            long r5 = (long) r0
            int r5 = r10.getInt(r14, r5)
            r24 = r0
            r7 = r5
            goto L_0x0092
        L_0x008f:
            r7 = r5
            r24 = r6
        L_0x0092:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x023e;
                case 1: goto L_0x0229;
                case 2: goto L_0x0204;
                case 3: goto L_0x0204;
                case 4: goto L_0x01f3;
                case 5: goto L_0x01d8;
                case 6: goto L_0x01c6;
                case 7: goto L_0x01aa;
                case 8: goto L_0x018c;
                case 9: goto L_0x0161;
                case 10: goto L_0x0141;
                case 11: goto L_0x01f3;
                case 12: goto L_0x0112;
                case 13: goto L_0x01c6;
                case 14: goto L_0x01d8;
                case 15: goto L_0x00fb;
                case 16: goto L_0x00cc;
                default: goto L_0x0096;
            }
        L_0x0096:
            r6 = r2
            r11 = r20
            r13 = r22
            r0 = 3
            if (r1 != r0) goto L_0x0262
            java.lang.Object r5 = r15.mo137511m(r14, r6)
            int r0 = r11 << 3
            r17 = r0 | 4
            com.google.android.gms.internal.measurement.hb r1 = r15.mo137509k(r6)
            r0 = r5
            r2 = r30
            r3 = r13
            r4 = r32
            r13 = r5
            r5 = r17
            r12 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170357n(r0, r1, r2, r3, r4, r5, r6)
            r15.mo137517u(r14, r12, r13)
            r5 = r7 | r8
            r13 = r32
            r1 = r11
            r2 = r12
            r3 = r21
            r6 = r24
            r8 = -1
            r12 = r30
            goto L_0x025e
        L_0x00cc:
            if (r1 != 0) goto L_0x00f4
            r5 = r22
            int r6 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r12, r5, r9)
            long r0 = r9.f106211b
            long r17 = com.google.android.gms.internal.measurement.C42244w8.m171038b(r0)
            r11 = r20
            r0 = r10
            r1 = r29
            r5 = r2
            r2 = r3
            r20 = r6
            r13 = r21
            r6 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r7 | r8
            r2 = r6
            r1 = r11
            r3 = r13
            r0 = r20
            goto L_0x0223
        L_0x00f4:
            r11 = r20
            r12 = r2
            r13 = r22
            goto L_0x0263
        L_0x00fb:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            if (r1 != 0) goto L_0x015b
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r12, r5, r9)
            int r1 = r9.f106210a
            int r1 = com.google.android.gms.internal.measurement.C42244w8.m171037a(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x0154
        L_0x0112:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            if (r1 != 0) goto L_0x015b
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r12, r5, r9)
            int r1 = r9.f106210a
            com.google.android.gms.internal.measurement.w9 r2 = r15.mo137508j(r6)
            if (r2 == 0) goto L_0x013d
            boolean r2 = r2.mo136523l(r1)
            if (r2 == 0) goto L_0x012e
            goto L_0x013d
        L_0x012e:
            com.google.android.gms.internal.measurement.zb r2 = m171242G(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo137531j(r13, r1)
            r2 = r6
            r5 = r7
            goto L_0x0157
        L_0x013d:
            r10.putInt(r14, r3, r1)
            goto L_0x0154
        L_0x0141:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            r0 = 2
            if (r1 != r0) goto L_0x015b
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170344a(r12, r5, r9)
            java.lang.Object r1 = r9.f106212c
            r10.putObject(r14, r3, r1)
        L_0x0154:
            r5 = r7 | r8
            r2 = r6
        L_0x0157:
            r1 = r11
            r3 = r13
            goto L_0x0223
        L_0x015b:
            r12 = r6
            r21 = r13
            r13 = r5
            goto L_0x0263
        L_0x0161:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            r0 = 2
            if (r1 != r0) goto L_0x0188
            java.lang.Object r4 = r15.mo137511m(r14, r6)
            com.google.android.gms.internal.measurement.hb r1 = r15.mo137509k(r6)
            r0 = r4
            r2 = r30
            r3 = r5
            r5 = r4
            r4 = r32
            r21 = r13
            r13 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170358o(r0, r1, r2, r3, r4, r5)
            r15.mo137517u(r14, r6, r13)
            goto L_0x0253
        L_0x0188:
            r21 = r13
            goto L_0x01f0
        L_0x018c:
            r6 = r2
            r11 = r20
            r5 = r22
            r0 = 2
            if (r1 != r0) goto L_0x01f0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r18 & r0
            if (r0 != 0) goto L_0x019f
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170350g(r12, r5, r9)
            goto L_0x01a3
        L_0x019f:
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170351h(r12, r5, r9)
        L_0x01a3:
            java.lang.Object r1 = r9.f106212c
            r10.putObject(r14, r3, r1)
            goto L_0x0253
        L_0x01aa:
            r6 = r2
            r11 = r20
            r5 = r22
            if (r1 != 0) goto L_0x01f0
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r12, r5, r9)
            long r1 = r9.f106211b
            r17 = 0
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x01bf
            r13 = 1
            goto L_0x01c1
        L_0x01bf:
            r13 = r16
        L_0x01c1:
            com.google.android.gms.internal.measurement.C42006ic.m170307r(r14, r3, r13)
            goto L_0x0253
        L_0x01c6:
            r6 = r2
            r11 = r20
            r5 = r22
            if (r1 != r0) goto L_0x01f0
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170345b(r12, r5)
            r10.putInt(r14, r3, r0)
            int r0 = r5 + 4
            goto L_0x0253
        L_0x01d8:
            r6 = r2
            r11 = r20
            r5 = r22
            r0 = 1
            if (r1 != r0) goto L_0x01f0
            long r17 = com.google.android.gms.internal.measurement.C42020j8.m170359p(r12, r5)
            r0 = r10
            r1 = r29
            r13 = r5
            r2 = r3
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x0251
        L_0x01f0:
            r13 = r5
            goto L_0x0262
        L_0x01f3:
            r6 = r2
            r11 = r20
            r13 = r22
            if (r1 != 0) goto L_0x0262
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r12, r13, r9)
            int r1 = r9.f106210a
            r10.putInt(r14, r3, r1)
            goto L_0x0253
        L_0x0204:
            r6 = r2
            r11 = r20
            r13 = r22
            if (r1 != 0) goto L_0x0262
            int r13 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r12, r13, r9)
            long r1 = r9.f106211b
            r0 = r10
            r17 = r1
            r1 = r29
            r2 = r3
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r7 | r8
            r2 = r6
            r1 = r11
            r0 = r13
            r3 = r21
        L_0x0223:
            r6 = r24
            r8 = -1
            r13 = r32
            goto L_0x025e
        L_0x0229:
            r6 = r2
            r11 = r20
            r13 = r22
            if (r1 != r0) goto L_0x0262
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170345b(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C42006ic.m170310u(r14, r3, r0)
            int r0 = r13 + 4
            goto L_0x0253
        L_0x023e:
            r6 = r2
            r11 = r20
            r13 = r22
            r0 = 1
            if (r1 != r0) goto L_0x0262
            long r0 = com.google.android.gms.internal.measurement.C42020j8.m170359p(r12, r13)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C42006ic.m170309t(r14, r3, r0)
        L_0x0251:
            int r0 = r13 + 8
        L_0x0253:
            r5 = r7 | r8
            r13 = r32
            r2 = r6
            r1 = r11
            r3 = r21
            r6 = r24
            r8 = -1
        L_0x025e:
            r11 = r33
            goto L_0x001e
        L_0x0262:
            r12 = r6
        L_0x0263:
            r0 = r33
            r20 = r7
            r27 = r10
            r31 = r11
            r22 = r12
            r2 = r13
            r7 = r21
            r6 = r24
            r19 = -1
            goto L_0x038b
        L_0x0276:
            r12 = r2
            r18 = r7
            r8 = r20
            r13 = r22
            r0 = 27
            if (r11 != r0) goto L_0x02d8
            r0 = 2
            if (r1 != r0) goto L_0x02c9
            java.lang.Object r0 = r10.getObject(r14, r3)
            com.google.android.gms.internal.measurement.z9 r0 = (com.google.android.gms.internal.measurement.C42296z9) r0
            boolean r1 = r0.mo136871d()
            if (r1 != 0) goto L_0x02a1
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0299
            r1 = 10
            goto L_0x029a
        L_0x0299:
            int r1 = r1 + r1
        L_0x029a:
            com.google.android.gms.internal.measurement.z9 r0 = r0.mo136618n(r1)
            r10.putObject(r14, r3, r0)
        L_0x02a1:
            r7 = r0
            com.google.android.gms.internal.measurement.hb r0 = r15.mo137509k(r12)
            r1 = r21
            r2 = r30
            r3 = r13
            r4 = r32
            r20 = r5
            r5 = r7
            r24 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170348e(r0, r1, r2, r3, r4, r5, r6)
            r13 = r32
            r11 = r33
            r1 = r8
            r2 = r12
            r5 = r20
            r3 = r21
            r6 = r24
            r8 = -1
            r12 = r30
            goto L_0x001e
        L_0x02c9:
            r20 = r5
            r24 = r6
            r31 = r8
            r27 = r10
            r22 = r12
            r15 = r13
            r19 = -1
            goto L_0x0363
        L_0x02d8:
            r20 = r5
            r24 = r6
            r0 = 49
            if (r11 > r0) goto L_0x0335
            r7 = r18
            long r6 = (long) r7
            r0 = r28
            r5 = r1
            r1 = r29
            r2 = r30
            r25 = r3
            r3 = r13
            r4 = r32
            r18 = r5
            r5 = r21
            r22 = r6
            r6 = r8
            r7 = r18
            r31 = r8
            r19 = -1
            r8 = r12
            r27 = r10
            r9 = r22
            r15 = r33
            r22 = r12
            r15 = r13
            r12 = r25
            r14 = r34
            int r0 = r0.mo137502O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x032c
        L_0x0310:
            r15 = r28
            r14 = r29
            r12 = r30
            r1 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r8 = r19
            r5 = r20
            r3 = r21
            r2 = r22
            r6 = r24
        L_0x0328:
            r10 = r27
            goto L_0x001e
        L_0x032c:
            r2 = r0
            r7 = r21
            r6 = r24
            r0 = r33
            goto L_0x038b
        L_0x0335:
            r25 = r3
            r31 = r8
            r27 = r10
            r22 = r12
            r15 = r13
            r7 = r18
            r19 = -1
            r18 = r1
            r0 = 50
            if (r11 != r0) goto L_0x036b
            r8 = r18
            r0 = 2
            if (r8 != r0) goto L_0x0363
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r22
            r6 = r25
            r8 = r34
            int r0 = r0.mo137500M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x032c
            goto L_0x0310
        L_0x0363:
            r0 = r33
            r2 = r15
            r7 = r21
            r6 = r24
            goto L_0x038b
        L_0x036b:
            r8 = r18
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r21
            r6 = r31
            r9 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r25
            r12 = r22
            r13 = r34
            int r0 = r0.mo137501N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x032c
            goto L_0x0310
        L_0x038b:
            if (r7 != r0) goto L_0x039a
            if (r0 == 0) goto L_0x039a
            r8 = r28
            r12 = r29
            r9 = r0
            r0 = r2
            r3 = r7
            r5 = r20
            goto L_0x0400
        L_0x039a:
            r8 = r28
            r9 = r0
            boolean r0 = r8.f106593f
            if (r0 == 0) goto L_0x03d0
            r10 = r34
            com.google.android.gms.internal.measurement.e9 r0 = r10.f106213d
            com.google.android.gms.internal.measurement.e9 r1 = com.google.android.gms.internal.measurement.C41931e9.f106096d
            if (r0 == r1) goto L_0x03cb
            com.google.android.gms.internal.measurement.wa r1 = r8.f106592e
            r11 = r31
            com.google.android.gms.internal.measurement.p9 r0 = r0.mo136720b(r1, r11)
            if (r0 != 0) goto L_0x03c5
            com.google.android.gms.internal.measurement.zb r4 = m171242G(r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170352i(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x03e5
        L_0x03c5:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.measurement.o9 r0 = (com.google.android.gms.internal.measurement.C42109o9) r0
            throw r17
        L_0x03cb:
            r12 = r29
            r11 = r31
            goto L_0x03d6
        L_0x03d0:
            r12 = r29
            r11 = r31
            r10 = r34
        L_0x03d6:
            com.google.android.gms.internal.measurement.zb r4 = m171242G(r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170352i(r0, r1, r2, r3, r4, r5)
        L_0x03e5:
            r13 = r32
            r3 = r7
            r15 = r8
            r1 = r11
            r14 = r12
            r8 = r19
            r5 = r20
            r2 = r22
            r12 = r30
            r11 = r9
            r9 = r10
            goto L_0x0328
        L_0x03f7:
            r20 = r5
            r24 = r6
            r27 = r10
            r9 = r11
            r12 = r14
            r8 = r15
        L_0x0400:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x040b
            long r6 = (long) r6
            r2 = r27
            r2.putInt(r12, r6, r5)
        L_0x040b:
            int r2 = r8.f106596i
        L_0x040d:
            int r4 = r8.f106597j
            if (r2 >= r4) goto L_0x0438
            int[] r4 = r8.f106595h
            r4 = r4[r2]
            int[] r5 = r8.f106588a
            r5 = r5[r4]
            int r5 = r8.mo137507U(r4)
            r5 = r5 & r1
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r5)
            if (r5 != 0) goto L_0x0426
            goto L_0x042c
        L_0x0426:
            com.google.android.gms.internal.measurement.w9 r6 = r8.mo137508j(r4)
            if (r6 != 0) goto L_0x042f
        L_0x042c:
            int r2 = r2 + 1
            goto L_0x040d
        L_0x042f:
            com.google.android.gms.internal.measurement.zzmc r5 = (com.google.android.gms.internal.measurement.zzmc) r5
            java.lang.Object r0 = r8.mo137510l(r4)
            com.google.android.gms.internal.measurement.qa r0 = (com.google.android.gms.internal.measurement.C42144qa) r0
            throw r17
        L_0x0438:
            if (r9 != 0) goto L_0x0444
            r1 = r32
            if (r0 != r1) goto L_0x043f
            goto L_0x044a
        L_0x043f:
            com.google.android.gms.internal.measurement.zzll r0 = com.google.android.gms.internal.measurement.zzll.m171376e()
            throw r0
        L_0x0444:
            r1 = r32
            if (r0 > r1) goto L_0x044b
            if (r3 != r9) goto L_0x044b
        L_0x044a:
            return r0
        L_0x044b:
            com.google.android.gms.internal.measurement.zzll r0 = com.google.android.gms.internal.measurement.zzll.m171376e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42297za.mo137498F(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.i8):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x032c, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x036c, code lost:
        r6 = r6 + r3;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03a0, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04ae, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0561, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0570, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0574, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f1, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01af, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bf, code lost:
        r3 = r3 + 8;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo137499K(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f106587q
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000c:
            int[] r9 = r0.f106588a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x057b
            int r9 = r15.mo137507U(r5)
            int[] r10 = r0.f106588a
            r11 = r10[r5]
            int r12 = m171247T(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0035
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r4
            int r10 = r10 >>> 20
            if (r13 == r7) goto L_0x0032
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
        L_0x0032:
            int r10 = r14 << r10
            goto L_0x0036
        L_0x0035:
            r10 = 0
        L_0x0036:
            r9 = r9 & r4
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x0565;
                case 1: goto L_0x0556;
                case 2: goto L_0x0540;
                case 3: goto L_0x052c;
                case 4: goto L_0x0518;
                case 5: goto L_0x050c;
                case 6: goto L_0x0500;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04c4;
                case 9: goto L_0x04b1;
                case 10: goto L_0x0492;
                case 11: goto L_0x047d;
                case 12: goto L_0x0468;
                case 13: goto L_0x045b;
                case 14: goto L_0x044e;
                case 15: goto L_0x0434;
                case 16: goto L_0x041a;
                case 17: goto L_0x0406;
                case 18: goto L_0x03f8;
                case 19: goto L_0x03ec;
                case 20: goto L_0x03e0;
                case 21: goto L_0x03d4;
                case 22: goto L_0x03c8;
                case 23: goto L_0x03bc;
                case 24: goto L_0x03b0;
                case 25: goto L_0x03a4;
                case 26: goto L_0x0396;
                case 27: goto L_0x0387;
                case 28: goto L_0x037c;
                case 29: goto L_0x0370;
                case 30: goto L_0x0361;
                case 31: goto L_0x0355;
                case 32: goto L_0x0349;
                case 33: goto L_0x033d;
                case 34: goto L_0x0331;
                case 35: goto L_0x0316;
                case 36: goto L_0x02ff;
                case 37: goto L_0x02e8;
                case 38: goto L_0x02d1;
                case 39: goto L_0x02ba;
                case 40: goto L_0x02a2;
                case 41: goto L_0x028a;
                case 42: goto L_0x0270;
                case 43: goto L_0x0258;
                case 44: goto L_0x0240;
                case 45: goto L_0x0228;
                case 46: goto L_0x0210;
                case 47: goto L_0x01f8;
                case 48: goto L_0x01e0;
                case 49: goto L_0x01d0;
                case 50: goto L_0x01c3;
                case 51: goto L_0x01b3;
                case 52: goto L_0x01a3;
                case 53: goto L_0x018d;
                case 54: goto L_0x0177;
                case 55: goto L_0x0161;
                case 56: goto L_0x0154;
                case 57: goto L_0x0147;
                case 58: goto L_0x0138;
                case 59: goto L_0x0108;
                case 60: goto L_0x00f4;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00be;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x0071;
                case 67: goto L_0x0055;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x03a1
        L_0x003f:
            boolean r9 = r15.mo137497C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.wa r3 = (com.google.android.gms.internal.measurement.C42246wa) r3
            com.google.android.gms.internal.measurement.hb r4 = r15.mo137509k(r5)
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171211u(r11, r3, r4)
            goto L_0x03a0
        L_0x0055:
            boolean r10 = r15.mo137497C(r1, r11, r5)
            if (r10 == 0) goto L_0x03a1
            long r3 = m171248V(r1, r3)
            int r10 = r11 << 3
            long r11 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r10)
            long r3 = r3 ^ r11
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x03a1
        L_0x0071:
            boolean r9 = r15.mo137497C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = m171246L(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            goto L_0x032d
        L_0x008c:
            boolean r3 = r15.mo137497C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            goto L_0x01bf
        L_0x009a:
            boolean r3 = r15.mo137497C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            goto L_0x01af
        L_0x00a8:
            boolean r9 = r15.mo137497C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = m171246L(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171212v(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032d
        L_0x00be:
            boolean r9 = r15.mo137497C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = m171246L(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032d
        L_0x00d4:
            boolean r9 = r15.mo137497C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.zzka r3 = (com.google.android.gms.internal.measurement.zzka) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.f106584d
            int r3 = r3.mo137593i()
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
        L_0x00f1:
            int r3 = r3 + r9
            goto L_0x03a0
        L_0x00f4:
            boolean r9 = r15.mo137497C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.hb r4 = r15.mo137509k(r5)
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170375L(r11, r3, r4)
            goto L_0x03a0
        L_0x0108:
            boolean r9 = r15.mo137497C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzka
            if (r4 == 0) goto L_0x012a
            com.google.android.gms.internal.measurement.zzka r3 = (com.google.android.gms.internal.measurement.zzka) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.f106584d
            int r3 = r3.mo137593i()
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x00f1
        L_0x012a:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171214x(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032d
        L_0x0138:
            boolean r3 = r15.mo137497C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r3 = r3 + r14
            goto L_0x03a0
        L_0x0147:
            boolean r3 = r15.mo137497C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            goto L_0x01af
        L_0x0154:
            boolean r3 = r15.mo137497C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            goto L_0x01bf
        L_0x0161:
            boolean r9 = r15.mo137497C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = m171246L(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171212v(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032d
        L_0x0177:
            boolean r9 = r15.mo137497C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            long r3 = m171248V(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r9)
            goto L_0x032d
        L_0x018d:
            boolean r9 = r15.mo137497C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            long r3 = m171248V(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r9)
            goto L_0x032d
        L_0x01a3:
            boolean r3 = r15.mo137497C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
        L_0x01af:
            int r3 = r3 + 4
            goto L_0x03a0
        L_0x01b3:
            boolean r3 = r15.mo137497C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
        L_0x01bf:
            int r3 = r3 + 8
            goto L_0x03a0
        L_0x01c3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r15.mo137510l(r5)
            com.google.android.gms.internal.measurement.C42161ra.m170784a(r11, r3, r4)
            goto L_0x03a1
        L_0x01d0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.hb r4 = r15.mo137509k(r5)
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170370G(r11, r3, r4)
            goto L_0x03a0
        L_0x01e0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170380Q(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x01f8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170378O(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x0210:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170369F(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x0228:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170367D(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x0240:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170365B(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x0258:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170383T(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x0270:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r4 = com.google.android.gms.internal.measurement.C42023jb.f106242e
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x028a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170367D(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x02a2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170369F(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x02ba:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170372I(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x02d1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170385V(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x02e8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170374K(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x02ff:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170367D(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x032c
        L_0x0316:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170369F(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
        L_0x032c:
            int r4 = r4 + r9
        L_0x032d:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x03a1
        L_0x0331:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170379P(r11, r3, r9)
            goto L_0x036c
        L_0x033d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170377N(r11, r3, r9)
            goto L_0x036c
        L_0x0349:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170368E(r11, r3, r9)
            goto L_0x036c
        L_0x0355:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170366C(r11, r3, r9)
            goto L_0x036c
        L_0x0361:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170364A(r11, r3, r9)
        L_0x036c:
            int r6 = r6 + r3
            r12 = r9
            goto L_0x0574
        L_0x0370:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170382S(r11, r3, r9)
            goto L_0x03a0
        L_0x037c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170413z(r11, r3)
            goto L_0x03a0
        L_0x0387:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.hb r4 = r15.mo137509k(r5)
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170376M(r11, r3, r4)
            goto L_0x03a0
        L_0x0396:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170381R(r11, r3)
        L_0x03a0:
            int r6 = r6 + r3
        L_0x03a1:
            r12 = 0
            goto L_0x0574
        L_0x03a4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170412y(r11, r3, r12)
            goto L_0x0403
        L_0x03b0:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170366C(r11, r3, r12)
            goto L_0x0403
        L_0x03bc:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170368E(r11, r3, r12)
            goto L_0x0403
        L_0x03c8:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170371H(r11, r3, r12)
            goto L_0x0403
        L_0x03d4:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170384U(r11, r3, r12)
            goto L_0x0403
        L_0x03e0:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170373J(r11, r3, r12)
            goto L_0x0403
        L_0x03ec:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170366C(r11, r3, r12)
            goto L_0x0403
        L_0x03f8:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170368E(r11, r3, r12)
        L_0x0403:
            int r6 = r6 + r3
            goto L_0x0574
        L_0x0406:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.wa r3 = (com.google.android.gms.internal.measurement.C42246wa) r3
            com.google.android.gms.internal.measurement.hb r4 = r15.mo137509k(r5)
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171211u(r11, r3, r4)
            goto L_0x0403
        L_0x041a:
            r12 = 0
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            long r13 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r10)
            long r3 = r3 ^ r13
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x0574
        L_0x0434:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            goto L_0x0553
        L_0x044e:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            goto L_0x0570
        L_0x045b:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            goto L_0x0561
        L_0x0468:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171212v(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x0553
        L_0x047d:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x0553
        L_0x0492:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.zzka r3 = (com.google.android.gms.internal.measurement.zzka) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.f106584d
            int r3 = r3.mo137593i()
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
        L_0x04ae:
            int r3 = r3 + r9
            goto L_0x0403
        L_0x04b1:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.hb r4 = r15.mo137509k(r5)
            int r3 = com.google.android.gms.internal.measurement.C42023jb.m170375L(r11, r3, r4)
            goto L_0x0403
        L_0x04c4:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzka
            if (r4 == 0) goto L_0x04e5
            com.google.android.gms.internal.measurement.zzka r3 = (com.google.android.gms.internal.measurement.zzka) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C42295z8.f106584d
            int r3 = r3.mo137593i()
            int r9 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x04ae
        L_0x04e5:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171214x(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x0553
        L_0x04f2:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            int r3 = r3 + r14
            goto L_0x0403
        L_0x0500:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            goto L_0x0561
        L_0x050c:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
            goto L_0x0570
        L_0x0518:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171212v(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x0553
        L_0x052c:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r9)
            goto L_0x0553
        L_0x0540:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r3)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r9)
        L_0x0553:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x0574
        L_0x0556:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
        L_0x0561:
            int r3 = r3 + 4
            goto L_0x0403
        L_0x0565:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r3)
        L_0x0570:
            int r3 = r3 + 8
            goto L_0x0403
        L_0x0574:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x057b:
            com.google.android.gms.internal.measurement.yb r2 = r0.f106599l
            java.lang.Object r3 = r2.mo136575d(r1)
            int r2 = r2.mo136572a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f106593f
            if (r2 != 0) goto L_0x058b
            return r6
        L_0x058b:
            com.google.android.gms.internal.measurement.f9 r2 = r0.f106600m
            r2.mo136764a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42297za.mo137499K(java.lang.Object):int");
    }

    /* renamed from: M */
    public final int mo137500M(Object obj, byte[] bArr, int i, int i2, int i3, long j, C42002i8 i8Var) throws IOException {
        Unsafe unsafe = f106587q;
        Object l = mo137510l(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzmc) object).mo137613h()) {
            zzmc c = zzmc.m171379b().mo137607c();
            C42161ra.m170785b(c, object);
            unsafe.putObject(obj, j, c);
        }
        C42144qa qaVar = (C42144qa) l;
        throw null;
    }

    /* renamed from: N */
    public final int mo137501N(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C42002i8 i8Var) throws IOException {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C42002i8 i8Var2 = i8Var;
        Unsafe unsafe = f106587q;
        long j3 = (long) (this.f106588a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(C42020j8.m170359p(bArr, i))));
                    int i14 = i9 + 8;
                    unsafe.putInt(obj2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(C42020j8.m170345b(bArr, i))));
                    int i15 = i9 + 4;
                    unsafe.putInt(obj2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = C42020j8.m170356m(bArr2, i9, i8Var2);
                    unsafe.putObject(obj2, j2, Long.valueOf(i8Var2.f106211b));
                    unsafe.putInt(obj2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = C42020j8.m170353j(bArr2, i9, i8Var2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(i8Var2.f106210a));
                    unsafe.putInt(obj2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(C42020j8.m170359p(bArr, i)));
                    int i16 = i9 + 8;
                    unsafe.putInt(obj2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(C42020j8.m170345b(bArr, i)));
                    int i17 = i9 + 4;
                    unsafe.putInt(obj2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = C42020j8.m170356m(bArr2, i9, i8Var2);
                    unsafe.putObject(obj2, j2, Boolean.valueOf(i8Var2.f106211b != 0));
                    unsafe.putInt(obj2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = C42020j8.m170353j(bArr2, i9, i8Var2);
                    int i18 = i8Var2.f106210a;
                    if (i18 == 0) {
                        unsafe.putObject(obj2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C42078mc.m170569e(bArr2, j5, j5 + i18)) {
                        unsafe.putObject(obj2, j2, new String(bArr2, j5, i18, C41860aa.f105996b));
                        j5 += i18;
                    } else {
                        throw zzll.m171374c();
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    Object n = mo137512n(obj2, i11, i13);
                    int o = C42020j8.m170358o(n, mo137509k(i13), bArr, i, i2, i8Var);
                    mo137518v(obj2, i11, i13, n);
                    return o;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = C42020j8.m170344a(bArr2, i9, i8Var2);
                    unsafe.putObject(obj2, j2, i8Var2.f106212c);
                    unsafe.putInt(obj2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = C42020j8.m170353j(bArr2, i9, i8Var2);
                    int i19 = i8Var2.f106210a;
                    C42245w9 j7 = mo137508j(i13);
                    if (j7 == null || j7.mo136523l(i19)) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i19));
                        unsafe.putInt(obj2, j3, i11);
                    } else {
                        m171242G(obj).mo137531j(i10, Long.valueOf((long) i19));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j8 = C42020j8.m170353j(bArr2, i9, i8Var2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(C42244w8.m171037a(i8Var2.f106210a)));
                    unsafe.putInt(obj2, j3, i11);
                    return j8;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m3 = C42020j8.m170356m(bArr2, i9, i8Var2);
                    unsafe.putObject(obj2, j2, Long.valueOf(C42244w8.m171038b(i8Var2.f106211b)));
                    unsafe.putInt(obj2, j3, i11);
                    return m3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    Object n2 = mo137512n(obj2, i11, i13);
                    int n3 = C42020j8.m170357n(n2, mo137509k(i13), bArr, i, i2, (i10 & -8) | 4, i8Var);
                    mo137518v(obj2, i11, i13, n2);
                    return n3;
                }
                break;
        }
        return i9;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0496 A[SYNTHETIC] */
    /* renamed from: O */
    public final int mo137502O(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.C42002i8 r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r8 = r22
            r6 = r23
            r9 = r24
            r10 = r28
            r7 = r30
            sun.misc.Unsafe r12 = f106587q
            java.lang.Object r13 = r12.getObject(r1, r10)
            com.google.android.gms.internal.measurement.z9 r13 = (com.google.android.gms.internal.measurement.C42296z9) r13
            boolean r14 = r13.mo136871d()
            if (r14 != 0) goto L_0x0035
            int r14 = r13.size()
            if (r14 != 0) goto L_0x002d
            r14 = 10
            goto L_0x002e
        L_0x002d:
            int r14 = r14 + r14
        L_0x002e:
            com.google.android.gms.internal.measurement.z9 r13 = r13.mo136618n(r14)
            r12.putObject(r1, r10, r13)
        L_0x0035:
            r10 = 5
            r11 = 0
            r15 = 1
            r14 = 2
            switch(r27) {
                case 18: goto L_0x0427;
                case 19: goto L_0x03da;
                case 20: goto L_0x0397;
                case 21: goto L_0x0397;
                case 22: goto L_0x037e;
                case 23: goto L_0x033d;
                case 24: goto L_0x02fc;
                case 25: goto L_0x02a4;
                case 26: goto L_0x01f1;
                case 27: goto L_0x01d8;
                case 28: goto L_0x017e;
                case 29: goto L_0x037e;
                case 30: goto L_0x00fd;
                case 31: goto L_0x02fc;
                case 32: goto L_0x033d;
                case 33: goto L_0x00ae;
                case 34: goto L_0x005f;
                case 35: goto L_0x0427;
                case 36: goto L_0x03da;
                case 37: goto L_0x0397;
                case 38: goto L_0x0397;
                case 39: goto L_0x037e;
                case 40: goto L_0x033d;
                case 41: goto L_0x02fc;
                case 42: goto L_0x02a4;
                case 43: goto L_0x037e;
                case 44: goto L_0x00fd;
                case 45: goto L_0x02fc;
                case 46: goto L_0x033d;
                case 47: goto L_0x00ae;
                case 48: goto L_0x005f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x0495
            com.google.android.gms.internal.measurement.hb r1 = r0.mo137509k(r9)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170346c(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f106212c
            r13.add(r8)
            goto L_0x0473
        L_0x005f:
            if (r6 != r14) goto L_0x0083
            com.google.android.gms.internal.measurement.la r13 = (com.google.android.gms.internal.measurement.C42058la) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r2 = r7.f106210a
            int r2 = r2 + r1
        L_0x006a:
            if (r1 >= r2) goto L_0x007a
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r3, r1, r7)
            long r4 = r7.f106211b
            long r4 = com.google.android.gms.internal.measurement.C42244w8.m171038b(r4)
            r13.mo137113i(r4)
            goto L_0x006a
        L_0x007a:
            if (r1 != r2) goto L_0x007e
            goto L_0x0496
        L_0x007e:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r1
        L_0x0083:
            if (r6 != 0) goto L_0x0495
            com.google.android.gms.internal.measurement.la r13 = (com.google.android.gms.internal.measurement.C42058la) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r3, r4, r7)
            long r8 = r7.f106211b
            long r8 = com.google.android.gms.internal.measurement.C42244w8.m171038b(r8)
            r13.mo137113i(r8)
        L_0x0094:
            if (r1 >= r5) goto L_0x00ad
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r6 = r7.f106210a
            if (r2 == r6) goto L_0x009f
            goto L_0x00ad
        L_0x009f:
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r3, r4, r7)
            long r8 = r7.f106211b
            long r8 = com.google.android.gms.internal.measurement.C42244w8.m171038b(r8)
            r13.mo137113i(r8)
            goto L_0x0094
        L_0x00ad:
            return r1
        L_0x00ae:
            if (r6 != r14) goto L_0x00d2
            com.google.android.gms.internal.measurement.t9 r13 = (com.google.android.gms.internal.measurement.C42194t9) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r2 = r7.f106210a
            int r2 = r2 + r1
        L_0x00b9:
            if (r1 >= r2) goto L_0x00c9
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r4 = r7.f106210a
            int r4 = com.google.android.gms.internal.measurement.C42244w8.m171037a(r4)
            r13.mo137313U(r4)
            goto L_0x00b9
        L_0x00c9:
            if (r1 != r2) goto L_0x00cd
            goto L_0x0496
        L_0x00cd:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r1
        L_0x00d2:
            if (r6 != 0) goto L_0x0495
            com.google.android.gms.internal.measurement.t9 r13 = (com.google.android.gms.internal.measurement.C42194t9) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r4 = r7.f106210a
            int r4 = com.google.android.gms.internal.measurement.C42244w8.m171037a(r4)
            r13.mo137313U(r4)
        L_0x00e3:
            if (r1 >= r5) goto L_0x00fc
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r6 = r7.f106210a
            if (r2 == r6) goto L_0x00ee
            goto L_0x00fc
        L_0x00ee:
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r4 = r7.f106210a
            int r4 = com.google.android.gms.internal.measurement.C42244w8.m171037a(r4)
            r13.mo137313U(r4)
            goto L_0x00e3
        L_0x00fc:
            return r1
        L_0x00fd:
            if (r6 != r14) goto L_0x0104
            int r2 = com.google.android.gms.internal.measurement.C42020j8.m170349f(r3, r4, r13, r7)
            goto L_0x0115
        L_0x0104:
            if (r6 != 0) goto L_0x0495
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r13
            r7 = r30
            int r2 = com.google.android.gms.internal.measurement.C42020j8.m170355l(r2, r3, r4, r5, r6, r7)
        L_0x0115:
            com.google.android.gms.internal.measurement.w9 r3 = r0.mo137508j(r9)
            com.google.android.gms.internal.measurement.yb r4 = r0.f106599l
            int r5 = com.google.android.gms.internal.measurement.C42023jb.f106242e
            if (r3 == 0) goto L_0x017b
            boolean r5 = r13 instanceof java.util.RandomAccess
            r6 = 0
            if (r5 == 0) goto L_0x0159
            int r5 = r13.size()
            r7 = 0
            r14 = 0
        L_0x012a:
            if (r14 >= r5) goto L_0x014f
            java.lang.Object r9 = r13.get(r14)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r3.mo136523l(r9)
            if (r10 == 0) goto L_0x0148
            if (r14 == r7) goto L_0x0145
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.set(r7, r9)
        L_0x0145:
            int r7 = r7 + 1
            goto L_0x014c
        L_0x0148:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C42023jb.m170389b(r1, r8, r9, r6, r4)
        L_0x014c:
            int r14 = r14 + 1
            goto L_0x012a
        L_0x014f:
            if (r7 == r5) goto L_0x017b
            java.util.List r1 = r13.subList(r7, r5)
            r1.clear()
            return r2
        L_0x0159:
            java.util.Iterator r5 = r13.iterator()
        L_0x015d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x017b
            java.lang.Object r7 = r5.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r3.mo136523l(r7)
            if (r9 != 0) goto L_0x015d
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C42023jb.m170389b(r1, r8, r7, r6, r4)
            r5.remove()
            goto L_0x015d
        L_0x017b:
            r1 = r2
            goto L_0x0496
        L_0x017e:
            if (r6 != r14) goto L_0x0495
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r4 = r7.f106210a
            if (r4 < 0) goto L_0x01d3
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01ce
            if (r4 != 0) goto L_0x0194
            com.google.android.gms.internal.measurement.zzka r4 = com.google.android.gms.internal.measurement.zzka.f106708a
            r13.add(r4)
            goto L_0x019c
        L_0x0194:
            com.google.android.gms.internal.measurement.zzka r6 = com.google.android.gms.internal.measurement.zzka.m171361M(r3, r1, r4)
            r13.add(r6)
        L_0x019b:
            int r1 = r1 + r4
        L_0x019c:
            if (r1 >= r5) goto L_0x01cd
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r6 = r7.f106210a
            if (r2 == r6) goto L_0x01a7
            goto L_0x01cd
        L_0x01a7:
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r4 = r7.f106210a
            if (r4 < 0) goto L_0x01c8
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01c3
            if (r4 != 0) goto L_0x01bb
            com.google.android.gms.internal.measurement.zzka r4 = com.google.android.gms.internal.measurement.zzka.f106708a
            r13.add(r4)
            goto L_0x019c
        L_0x01bb:
            com.google.android.gms.internal.measurement.zzka r6 = com.google.android.gms.internal.measurement.zzka.m171361M(r3, r1, r4)
            r13.add(r6)
            goto L_0x019b
        L_0x01c3:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r1
        L_0x01c8:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171375d()
            throw r1
        L_0x01cd:
            return r1
        L_0x01ce:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r1
        L_0x01d3:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171375d()
            throw r1
        L_0x01d8:
            if (r6 != r14) goto L_0x0495
            com.google.android.gms.internal.measurement.hb r1 = r0.mo137509k(r9)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r13
            r28 = r30
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170348e(r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x01f1:
            if (r6 != r14) goto L_0x0495
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0244
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r4 = r7.f106210a
            if (r4 < 0) goto L_0x023f
            if (r4 != 0) goto L_0x020c
            r13.add(r6)
            goto L_0x0217
        L_0x020c:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C41860aa.f105996b
            r8.<init>(r3, r1, r4, r9)
            r13.add(r8)
        L_0x0216:
            int r1 = r1 + r4
        L_0x0217:
            if (r1 >= r5) goto L_0x0496
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r8 = r7.f106210a
            if (r2 != r8) goto L_0x0496
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r4 = r7.f106210a
            if (r4 < 0) goto L_0x023a
            if (r4 != 0) goto L_0x022f
            r13.add(r6)
            goto L_0x0217
        L_0x022f:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C41860aa.f105996b
            r8.<init>(r3, r1, r4, r9)
            r13.add(r8)
            goto L_0x0216
        L_0x023a:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171375d()
            throw r1
        L_0x023f:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171375d()
            throw r1
        L_0x0244:
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r4 = r7.f106210a
            if (r4 < 0) goto L_0x029f
            if (r4 != 0) goto L_0x0252
            r13.add(r6)
            goto L_0x0265
        L_0x0252:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.C42078mc.m170569e(r3, r1, r8)
            if (r9 == 0) goto L_0x029a
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C41860aa.f105996b
            r9.<init>(r3, r1, r4, r10)
            r13.add(r9)
        L_0x0264:
            r1 = r8
        L_0x0265:
            if (r1 >= r5) goto L_0x0496
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r8 = r7.f106210a
            if (r2 != r8) goto L_0x0496
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r4 = r7.f106210a
            if (r4 < 0) goto L_0x0295
            if (r4 != 0) goto L_0x027d
            r13.add(r6)
            goto L_0x0265
        L_0x027d:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.C42078mc.m170569e(r3, r1, r8)
            if (r9 == 0) goto L_0x0290
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C41860aa.f105996b
            r9.<init>(r3, r1, r4, r10)
            r13.add(r9)
            goto L_0x0264
        L_0x0290:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171374c()
            throw r1
        L_0x0295:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171375d()
            throw r1
        L_0x029a:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171374c()
            throw r1
        L_0x029f:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171375d()
            throw r1
        L_0x02a4:
            if (r6 != r14) goto L_0x02cb
            com.google.android.gms.internal.measurement.k8 r13 = (com.google.android.gms.internal.measurement.C42038k8) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r2 = r7.f106210a
            int r2 = r2 + r1
        L_0x02af:
            if (r1 >= r2) goto L_0x02c2
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r3, r1, r7)
            long r4 = r7.f106211b
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x02bd
            r4 = r15
            goto L_0x02be
        L_0x02bd:
            r4 = 0
        L_0x02be:
            r13.mo137073h(r4)
            goto L_0x02af
        L_0x02c2:
            if (r1 != r2) goto L_0x02c6
            goto L_0x0496
        L_0x02c6:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r1
        L_0x02cb:
            if (r6 != 0) goto L_0x0495
            com.google.android.gms.internal.measurement.k8 r13 = (com.google.android.gms.internal.measurement.C42038k8) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r3, r4, r7)
            long r8 = r7.f106211b
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x02db
            r4 = r15
            goto L_0x02dc
        L_0x02db:
            r4 = 0
        L_0x02dc:
            r13.mo137073h(r4)
        L_0x02df:
            if (r1 >= r5) goto L_0x02fb
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r6 = r7.f106210a
            if (r2 == r6) goto L_0x02ea
            goto L_0x02fb
        L_0x02ea:
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r3, r4, r7)
            long r8 = r7.f106211b
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x02f6
            r4 = r15
            goto L_0x02f7
        L_0x02f6:
            r4 = 0
        L_0x02f7:
            r13.mo137073h(r4)
            goto L_0x02df
        L_0x02fb:
            return r1
        L_0x02fc:
            if (r6 != r14) goto L_0x031c
            com.google.android.gms.internal.measurement.t9 r13 = (com.google.android.gms.internal.measurement.C42194t9) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r2 = r7.f106210a
            int r2 = r2 + r1
        L_0x0307:
            if (r1 >= r2) goto L_0x0313
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170345b(r3, r1)
            r13.mo137313U(r4)
            int r1 = r1 + 4
            goto L_0x0307
        L_0x0313:
            if (r1 != r2) goto L_0x0317
            goto L_0x0496
        L_0x0317:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r1
        L_0x031c:
            if (r6 != r10) goto L_0x0495
            com.google.android.gms.internal.measurement.t9 r13 = (com.google.android.gms.internal.measurement.C42194t9) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170345b(r18, r19)
            r13.mo137313U(r1)
        L_0x0327:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x033c
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r6 = r7.f106210a
            if (r2 == r6) goto L_0x0334
            goto L_0x033c
        L_0x0334:
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170345b(r3, r4)
            r13.mo137313U(r1)
            goto L_0x0327
        L_0x033c:
            return r1
        L_0x033d:
            if (r6 != r14) goto L_0x035d
            com.google.android.gms.internal.measurement.la r13 = (com.google.android.gms.internal.measurement.C42058la) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r2 = r7.f106210a
            int r2 = r2 + r1
        L_0x0348:
            if (r1 >= r2) goto L_0x0354
            long r4 = com.google.android.gms.internal.measurement.C42020j8.m170359p(r3, r1)
            r13.mo137113i(r4)
            int r1 = r1 + 8
            goto L_0x0348
        L_0x0354:
            if (r1 != r2) goto L_0x0358
            goto L_0x0496
        L_0x0358:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r1
        L_0x035d:
            if (r6 != r15) goto L_0x0495
            com.google.android.gms.internal.measurement.la r13 = (com.google.android.gms.internal.measurement.C42058la) r13
            long r8 = com.google.android.gms.internal.measurement.C42020j8.m170359p(r18, r19)
            r13.mo137113i(r8)
        L_0x0368:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x037d
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r6 = r7.f106210a
            if (r2 == r6) goto L_0x0375
            goto L_0x037d
        L_0x0375:
            long r8 = com.google.android.gms.internal.measurement.C42020j8.m170359p(r3, r4)
            r13.mo137113i(r8)
            goto L_0x0368
        L_0x037d:
            return r1
        L_0x037e:
            if (r6 != r14) goto L_0x0386
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170349f(r3, r4, r13, r7)
            goto L_0x0496
        L_0x0386:
            if (r6 != 0) goto L_0x0495
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r13
            r26 = r30
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170355l(r21, r22, r23, r24, r25, r26)
            return r1
        L_0x0397:
            if (r6 != r14) goto L_0x03b7
            com.google.android.gms.internal.measurement.la r13 = (com.google.android.gms.internal.measurement.C42058la) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r2 = r7.f106210a
            int r2 = r2 + r1
        L_0x03a2:
            if (r1 >= r2) goto L_0x03ae
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r3, r1, r7)
            long r4 = r7.f106211b
            r13.mo137113i(r4)
            goto L_0x03a2
        L_0x03ae:
            if (r1 != r2) goto L_0x03b2
            goto L_0x0496
        L_0x03b2:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r1
        L_0x03b7:
            if (r6 != 0) goto L_0x0495
            com.google.android.gms.internal.measurement.la r13 = (com.google.android.gms.internal.measurement.C42058la) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r3, r4, r7)
            long r8 = r7.f106211b
            r13.mo137113i(r8)
        L_0x03c4:
            if (r1 >= r5) goto L_0x03d9
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r6 = r7.f106210a
            if (r2 == r6) goto L_0x03cf
            goto L_0x03d9
        L_0x03cf:
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r3, r4, r7)
            long r8 = r7.f106211b
            r13.mo137113i(r8)
            goto L_0x03c4
        L_0x03d9:
            return r1
        L_0x03da:
            if (r6 != r14) goto L_0x03fe
            com.google.android.gms.internal.measurement.k9 r13 = (com.google.android.gms.internal.measurement.C42039k9) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r2 = r7.f106210a
            int r2 = r2 + r1
        L_0x03e5:
            if (r1 >= r2) goto L_0x03f5
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170345b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.mo137081h(r4)
            int r1 = r1 + 4
            goto L_0x03e5
        L_0x03f5:
            if (r1 != r2) goto L_0x03f9
            goto L_0x0496
        L_0x03f9:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r1
        L_0x03fe:
            if (r6 != r10) goto L_0x0495
            com.google.android.gms.internal.measurement.k9 r13 = (com.google.android.gms.internal.measurement.C42039k9) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170345b(r18, r19)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.mo137081h(r1)
        L_0x040d:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0426
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r6 = r7.f106210a
            if (r2 == r6) goto L_0x041a
            goto L_0x0426
        L_0x041a:
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170345b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.mo137081h(r1)
            goto L_0x040d
        L_0x0426:
            return r1
        L_0x0427:
            if (r6 != r14) goto L_0x044a
            com.google.android.gms.internal.measurement.b9 r13 = (com.google.android.gms.internal.measurement.C41877b9) r13
            int r1 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r2 = r7.f106210a
            int r2 = r2 + r1
        L_0x0432:
            if (r1 >= r2) goto L_0x0442
            long r4 = com.google.android.gms.internal.measurement.C42020j8.m170359p(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.mo136613h(r4)
            int r1 = r1 + 8
            goto L_0x0432
        L_0x0442:
            if (r1 != r2) goto L_0x0445
            goto L_0x0496
        L_0x0445:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r1
        L_0x044a:
            if (r6 != r15) goto L_0x0495
            com.google.android.gms.internal.measurement.b9 r13 = (com.google.android.gms.internal.measurement.C41877b9) r13
            long r8 = com.google.android.gms.internal.measurement.C42020j8.m170359p(r18, r19)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.mo136613h(r8)
        L_0x0459:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0472
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r1, r7)
            int r6 = r7.f106210a
            if (r2 == r6) goto L_0x0466
            goto L_0x0472
        L_0x0466:
            long r8 = com.google.android.gms.internal.measurement.C42020j8.m170359p(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.mo136613h(r8)
            goto L_0x0459
        L_0x0472:
            return r1
        L_0x0473:
            if (r4 >= r5) goto L_0x0494
            int r8 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r3, r4, r7)
            int r9 = r7.f106210a
            if (r2 == r9) goto L_0x047e
            goto L_0x0494
        L_0x047e:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.C42020j8.m170346c(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f106212c
            r13.add(r8)
            goto L_0x0473
        L_0x0494:
            return r4
        L_0x0495:
            r1 = r4
        L_0x0496:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42297za.mo137502O(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.i8):int");
    }

    /* renamed from: P */
    public final int mo137503P(int i) {
        if (i < this.f106590c || i > this.f106591d) {
            return -1;
        }
        return mo137506S(i, 0);
    }

    /* renamed from: Q */
    public final int mo137504Q(int i, int i2) {
        if (i < this.f106590c || i > this.f106591d) {
            return -1;
        }
        return mo137506S(i, i2);
    }

    /* renamed from: R */
    public final int mo137505R(int i) {
        return this.f106588a[i + 2];
    }

    /* renamed from: S */
    public final int mo137506S(int i, int i2) {
        int length = (this.f106588a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f106588a[i4];
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

    /* renamed from: U */
    public final int mo137507U(int i) {
        return this.f106588a[i + 1];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b4, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0210, code lost:
        r3 = (int) (r3 ^ (r3 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0214, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0215, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo136563a(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r0 = r9.f106588a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0219
            int r3 = r9.mo137507U(r1)
            int[] r4 = r9.f106588a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            int r3 = m171247T(r3)
            long r5 = (long) r5
            r7 = 37
            r8 = 32
            switch(r3) {
                case 0: goto L_0x0204;
                case 1: goto L_0x01f9;
                case 2: goto L_0x01f0;
                case 3: goto L_0x01e7;
                case 4: goto L_0x01e0;
                case 5: goto L_0x01d7;
                case 6: goto L_0x01d0;
                case 7: goto L_0x01c5;
                case 8: goto L_0x01b8;
                case 9: goto L_0x01aa;
                case 10: goto L_0x019e;
                case 11: goto L_0x0196;
                case 12: goto L_0x018e;
                case 13: goto L_0x0186;
                case 14: goto L_0x017c;
                case 15: goto L_0x0174;
                case 16: goto L_0x016a;
                case 17: goto L_0x015f;
                case 18: goto L_0x0153;
                case 19: goto L_0x0153;
                case 20: goto L_0x0153;
                case 21: goto L_0x0153;
                case 22: goto L_0x0153;
                case 23: goto L_0x0153;
                case 24: goto L_0x0153;
                case 25: goto L_0x0153;
                case 26: goto L_0x0153;
                case 27: goto L_0x0153;
                case 28: goto L_0x0153;
                case 29: goto L_0x0153;
                case 30: goto L_0x0153;
                case 31: goto L_0x0153;
                case 32: goto L_0x0153;
                case 33: goto L_0x0153;
                case 34: goto L_0x0153;
                case 35: goto L_0x0153;
                case 36: goto L_0x0153;
                case 37: goto L_0x0153;
                case 38: goto L_0x0153;
                case 39: goto L_0x0153;
                case 40: goto L_0x0153;
                case 41: goto L_0x0153;
                case 42: goto L_0x0153;
                case 43: goto L_0x0153;
                case 44: goto L_0x0153;
                case 45: goto L_0x0153;
                case 46: goto L_0x0153;
                case 47: goto L_0x0153;
                case 48: goto L_0x0153;
                case 49: goto L_0x0153;
                case 50: goto L_0x0147;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x0111;
                case 54: goto L_0x0101;
                case 55: goto L_0x00f3;
                case 56: goto L_0x00e3;
                case 57: goto L_0x00d5;
                case 58: goto L_0x00c3;
                case 59: goto L_0x00af;
                case 60: goto L_0x009d;
                case 61: goto L_0x008b;
                case 62: goto L_0x007d;
                case 63: goto L_0x006f;
                case 64: goto L_0x0061;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0033;
                case 68: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0215
        L_0x0021:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x0033:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            long r3 = m171248V(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x0043:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m171246L(r10, r5)
            goto L_0x0214
        L_0x0051:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            long r3 = m171248V(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x0061:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m171246L(r10, r5)
            goto L_0x0214
        L_0x006f:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m171246L(r10, r5)
            goto L_0x0214
        L_0x007d:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m171246L(r10, r5)
            goto L_0x0214
        L_0x008b:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x009d:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x00af:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x00c3:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            boolean r3 = m171240D(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.C41860aa.m169666a(r3)
            goto L_0x0214
        L_0x00d5:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m171246L(r10, r5)
            goto L_0x0214
        L_0x00e3:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            long r3 = m171248V(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x00f3:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m171246L(r10, r5)
            goto L_0x0214
        L_0x0101:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            long r3 = m171248V(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x0111:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            long r3 = m171248V(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x0121:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            float r3 = m171245J(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0214
        L_0x0133:
            boolean r3 = r9.mo137497C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            double r3 = m171244I(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x0147:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x0153:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x015f:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r10, r5)
            if (r3 == 0) goto L_0x01b4
            int r7 = r3.hashCode()
            goto L_0x01b4
        L_0x016a:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x0174:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r10, r5)
            goto L_0x0214
        L_0x017c:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x0186:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r10, r5)
            goto L_0x0214
        L_0x018e:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r10, r5)
            goto L_0x0214
        L_0x0196:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r10, r5)
            goto L_0x0214
        L_0x019e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x01aa:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r10, r5)
            if (r3 == 0) goto L_0x01b4
            int r7 = r3.hashCode()
        L_0x01b4:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0215
        L_0x01b8:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x01c5:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.C42006ic.m170286B(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.C41860aa.m169666a(r3)
            goto L_0x0214
        L_0x01d0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r10, r5)
            goto L_0x0214
        L_0x01d7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x01e0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r10, r5)
            goto L_0x0214
        L_0x01e7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x01f0:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
            goto L_0x0210
        L_0x01f9:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.C42006ic.m170296g(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0214
        L_0x0204:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.C42006ic.m170295f(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.gms.internal.measurement.C41860aa.f105998d
        L_0x0210:
            long r5 = r3 >>> r8
            long r3 = r3 ^ r5
            int r3 = (int) r3
        L_0x0214:
            int r2 = r2 + r3
        L_0x0215:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0219:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.yb r0 = r9.f106599l
            java.lang.Object r0 = r0.mo136575d(r10)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r9.f106593f
            if (r0 != 0) goto L_0x022b
            return r2
        L_0x022b:
            com.google.android.gms.internal.measurement.f9 r0 = r9.f106600m
            r0.mo136764a(r10)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42297za.mo136563a(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0326, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0420, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04a2, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04f4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x055f, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x056f, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0573, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo136564b(java.lang.Object r12) {
        /*
            r11 = this;
            boolean r0 = r11.f106594g
            if (r0 == 0) goto L_0x0583
            sun.misc.Unsafe r0 = f106587q
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0009:
            int[] r4 = r11.f106588a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0577
            int r4 = r11.mo137507U(r2)
            int r5 = m171247T(r4)
            int[] r6 = r11.f106588a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            com.google.android.gms.internal.measurement.zzkt r7 = com.google.android.gms.internal.measurement.zzkt.DOUBLE_LIST_PACKED
            int r7 = r7.zza()
            if (r5 < r7) goto L_0x0034
            com.google.android.gms.internal.measurement.zzkt r7 = com.google.android.gms.internal.measurement.zzkt.SINT64_LIST_PACKED
            int r7 = r7.zza()
            if (r5 > r7) goto L_0x0034
            int[] r7 = r11.f106588a
            int r8 = r2 + 2
            r7 = r7[r8]
        L_0x0034:
            long r7 = (long) r4
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0563;
                case 1: goto L_0x0553;
                case 2: goto L_0x053c;
                case 3: goto L_0x0527;
                case 4: goto L_0x0512;
                case 5: goto L_0x0505;
                case 6: goto L_0x04f8;
                case 7: goto L_0x04e8;
                case 8: goto L_0x04b9;
                case 9: goto L_0x04a5;
                case 10: goto L_0x0485;
                case 11: goto L_0x046f;
                case 12: goto L_0x0459;
                case 13: goto L_0x044b;
                case 14: goto L_0x043d;
                case 15: goto L_0x0422;
                case 16: goto L_0x0406;
                case 17: goto L_0x03f1;
                case 18: goto L_0x03e4;
                case 19: goto L_0x03d9;
                case 20: goto L_0x03ce;
                case 21: goto L_0x03c3;
                case 22: goto L_0x03b8;
                case 23: goto L_0x03ad;
                case 24: goto L_0x03a2;
                case 25: goto L_0x0397;
                case 26: goto L_0x038c;
                case 27: goto L_0x037d;
                case 28: goto L_0x0371;
                case 29: goto L_0x0365;
                case 30: goto L_0x0359;
                case 31: goto L_0x034d;
                case 32: goto L_0x0341;
                case 33: goto L_0x0335;
                case 34: goto L_0x0329;
                case 35: goto L_0x0310;
                case 36: goto L_0x02f9;
                case 37: goto L_0x02e2;
                case 38: goto L_0x02cb;
                case 39: goto L_0x02b4;
                case 40: goto L_0x029c;
                case 41: goto L_0x0284;
                case 42: goto L_0x026a;
                case 43: goto L_0x0252;
                case 44: goto L_0x023a;
                case 45: goto L_0x0222;
                case 46: goto L_0x020a;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01da;
                case 49: goto L_0x01ca;
                case 50: goto L_0x01bd;
                case 51: goto L_0x01af;
                case 52: goto L_0x01a1;
                case 53: goto L_0x018b;
                case 54: goto L_0x0175;
                case 55: goto L_0x015f;
                case 56: goto L_0x0151;
                case 57: goto L_0x0143;
                case 58: goto L_0x0135;
                case 59: goto L_0x0104;
                case 60: goto L_0x00f0;
                case 61: goto L_0x00d1;
                case 62: goto L_0x00bb;
                case 63: goto L_0x00a5;
                case 64: goto L_0x0097;
                case 65: goto L_0x0089;
                case 66: goto L_0x006e;
                case 67: goto L_0x0052;
                case 68: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0573
        L_0x003c:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            com.google.android.gms.internal.measurement.wa r4 = (com.google.android.gms.internal.measurement.C42246wa) r4
            com.google.android.gms.internal.measurement.hb r5 = r11.mo137509k(r2)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171211u(r6, r4, r5)
            goto L_0x03ee
        L_0x0052:
            boolean r5 = r11.mo137497C(r12, r6, r2)
            if (r5 == 0) goto L_0x0573
            long r7 = m171248V(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r5)
            goto L_0x0420
        L_0x006e:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = m171246L(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x0550
        L_0x0089:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x056f
        L_0x0097:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x055f
        L_0x00a5:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = m171246L(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171212v(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0550
        L_0x00bb:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = m171246L(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0550
        L_0x00d1:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            com.google.android.gms.internal.measurement.zzka r4 = (com.google.android.gms.internal.measurement.zzka) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.f106584d
            int r4 = r4.mo137593i()
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x04a2
        L_0x00f0:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            com.google.android.gms.internal.measurement.hb r5 = r11.mo137509k(r2)
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170375L(r6, r4, r5)
            goto L_0x03ee
        L_0x0104:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzka
            if (r5 == 0) goto L_0x0127
            com.google.android.gms.internal.measurement.zzka r4 = (com.google.android.gms.internal.measurement.zzka) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.f106584d
            int r4 = r4.mo137593i()
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x04a2
        L_0x0127:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171214x(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0550
        L_0x0135:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x04f4
        L_0x0143:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x055f
        L_0x0151:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x056f
        L_0x015f:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = m171246L(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171212v(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0550
        L_0x0175:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = m171248V(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r6)
            goto L_0x0550
        L_0x018b:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = m171248V(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r6)
            goto L_0x0550
        L_0x01a1:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x055f
        L_0x01af:
            boolean r4 = r11.mo137497C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x056f
        L_0x01bd:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.lang.Object r5 = r11.mo137510l(r2)
            com.google.android.gms.internal.measurement.C42161ra.m170784a(r6, r4, r5)
            goto L_0x0573
        L_0x01ca:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.hb r5 = r11.mo137509k(r2)
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170370G(r6, r4, r5)
            goto L_0x03ee
        L_0x01da:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170380Q(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x01f2:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170378O(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x020a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170369F(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x0222:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170367D(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x023a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170365B(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x0252:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170383T(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x026a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r5 = com.google.android.gms.internal.measurement.C42023jb.f106242e
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x0284:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170367D(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x029c:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170369F(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x02b4:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170372I(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x02cb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170385V(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x02e2:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170374K(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x02f9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170367D(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0326
        L_0x0310:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170369F(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
        L_0x0326:
            int r5 = r5 + r6
            goto L_0x0550
        L_0x0329:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170379P(r6, r4, r1)
            goto L_0x03ee
        L_0x0335:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170377N(r6, r4, r1)
            goto L_0x03ee
        L_0x0341:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170368E(r6, r4, r1)
            goto L_0x03ee
        L_0x034d:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170366C(r6, r4, r1)
            goto L_0x03ee
        L_0x0359:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170364A(r6, r4, r1)
            goto L_0x03ee
        L_0x0365:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170382S(r6, r4, r1)
            goto L_0x03ee
        L_0x0371:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170413z(r6, r4)
            goto L_0x03ee
        L_0x037d:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.hb r5 = r11.mo137509k(r2)
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170376M(r6, r4, r5)
            goto L_0x03ee
        L_0x038c:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170381R(r6, r4)
            goto L_0x03ee
        L_0x0397:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170412y(r6, r4, r1)
            goto L_0x03ee
        L_0x03a2:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170366C(r6, r4, r1)
            goto L_0x03ee
        L_0x03ad:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170368E(r6, r4, r1)
            goto L_0x03ee
        L_0x03b8:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170371H(r6, r4, r1)
            goto L_0x03ee
        L_0x03c3:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170384U(r6, r4, r1)
            goto L_0x03ee
        L_0x03ce:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170373J(r6, r4, r1)
            goto L_0x03ee
        L_0x03d9:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170366C(r6, r4, r1)
            goto L_0x03ee
        L_0x03e4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170368E(r6, r4, r1)
        L_0x03ee:
            int r3 = r3 + r4
            goto L_0x0573
        L_0x03f1:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            com.google.android.gms.internal.measurement.wa r4 = (com.google.android.gms.internal.measurement.C42246wa) r4
            com.google.android.gms.internal.measurement.hb r5 = r11.mo137509k(r2)
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171211u(r6, r4, r5)
            goto L_0x03ee
        L_0x0406:
            boolean r5 = r11.mo137521y(r12, r2)
            if (r5 == 0) goto L_0x0573
            long r7 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r5)
        L_0x0420:
            int r4 = r4 + r5
            goto L_0x03ee
        L_0x0422:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x0550
        L_0x043d:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x056f
        L_0x044b:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x055f
        L_0x0459:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171212v(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0550
        L_0x046f:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0550
        L_0x0485:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            com.google.android.gms.internal.measurement.zzka r4 = (com.google.android.gms.internal.measurement.zzka) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.f106584d
            int r4 = r4.mo137593i()
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
        L_0x04a2:
            int r4 = r4 + r6
            goto L_0x03ee
        L_0x04a5:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            com.google.android.gms.internal.measurement.hb r5 = r11.mo137509k(r2)
            int r4 = com.google.android.gms.internal.measurement.C42023jb.m170375L(r6, r4, r5)
            goto L_0x03ee
        L_0x04b9:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzka
            if (r5 == 0) goto L_0x04db
            com.google.android.gms.internal.measurement.zzka r4 = (com.google.android.gms.internal.measurement.zzka) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C42295z8.f106584d
            int r4 = r4.mo137593i()
            int r6 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x04a2
        L_0x04db:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171214x(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0550
        L_0x04e8:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
        L_0x04f4:
            int r4 = r4 + 1
            goto L_0x03ee
        L_0x04f8:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x055f
        L_0x0505:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
            goto L_0x056f
        L_0x0512:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171212v(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r5)
            goto L_0x0550
        L_0x0527:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r6)
            goto L_0x0550
        L_0x053c:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171216z(r4)
            int r5 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r6)
        L_0x0550:
            int r5 = r5 + r4
            int r3 = r3 + r5
            goto L_0x0573
        L_0x0553:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
        L_0x055f:
            int r4 = r4 + 4
            goto L_0x03ee
        L_0x0563:
            boolean r4 = r11.mo137521y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C42295z8.m171215y(r4)
        L_0x056f:
            int r4 = r4 + 8
            goto L_0x03ee
        L_0x0573:
            int r2 = r2 + 3
            goto L_0x0009
        L_0x0577:
            com.google.android.gms.internal.measurement.yb r0 = r11.f106599l
            java.lang.Object r12 = r0.mo136575d(r12)
            int r12 = r0.mo136572a(r12)
            int r3 = r3 + r12
            goto L_0x0587
        L_0x0583:
            int r3 = r11.mo137499K(r12)
        L_0x0587:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42297za.mo136564b(java.lang.Object):int");
    }

    /* renamed from: c */
    public final void mo136565c(Object obj) {
        if (m171239B(obj)) {
            if (obj instanceof C42177s9) {
                C42177s9 s9Var = (C42177s9) obj;
                s9Var.mo137283x(Integer.MAX_VALUE);
                s9Var.zzb = 0;
                s9Var.mo137282v();
            }
            int length = this.f106588a.length;
            for (int i = 0; i < length; i += 3) {
                int U = mo137507U(i);
                int i2 = 1048575 & U;
                int T = m171247T(U);
                long j = (long) i2;
                if (T != 9) {
                    if (T == 60 || T == 68) {
                        if (mo137497C(obj, this.f106588a[i], i)) {
                            mo137509k(i).mo136565c(f106587q.getObject(obj, j));
                        }
                    } else {
                        switch (T) {
                            case 17:
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
                                this.f106598k.mo136877a(obj, j);
                                continue;
                            case 50:
                                Unsafe unsafe = f106587q;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzmc) object).mo137609e();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (mo137521y(obj, i)) {
                    mo137509k(i).mo136565c(f106587q.getObject(obj, j));
                }
            }
            this.f106599l.mo136578g(obj);
            if (this.f106593f) {
                this.f106600m.mo136765b(obj);
            }
        }
    }

    /* renamed from: d */
    public final void mo136566d(Object obj, Object obj2) {
        m171250p(obj);
        obj2.getClass();
        for (int i = 0; i < this.f106588a.length; i += 3) {
            int U = mo137507U(i);
            int i2 = this.f106588a[i];
            long j = (long) (1048575 & U);
            switch (m171247T(U)) {
                case 0:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170309t(obj, j, C42006ic.m170295f(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 1:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170310u(obj, j, C42006ic.m170296g(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 2:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170312w(obj, j, C42006ic.m170298i(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 3:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170312w(obj, j, C42006ic.m170298i(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 4:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170311v(obj, j, C42006ic.m170297h(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 5:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170312w(obj, j, C42006ic.m170298i(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 6:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170311v(obj, j, C42006ic.m170297h(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 7:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170307r(obj, j, C42006ic.m170286B(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 8:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170313x(obj, j, C42006ic.m170300k(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 9:
                    mo137513q(obj, obj2, i);
                    break;
                case 10:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170313x(obj, j, C42006ic.m170300k(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 11:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170311v(obj, j, C42006ic.m170297h(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 12:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170311v(obj, j, C42006ic.m170297h(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 13:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170311v(obj, j, C42006ic.m170297h(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 14:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170312w(obj, j, C42006ic.m170298i(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 15:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170311v(obj, j, C42006ic.m170297h(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 16:
                    if (!mo137521y(obj2, i)) {
                        break;
                    } else {
                        C42006ic.m170312w(obj, j, C42006ic.m170298i(obj2, j));
                        mo137515s(obj, i);
                        break;
                    }
                case 17:
                    mo137513q(obj, obj2, i);
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
                    this.f106598k.mo136878b(obj, obj2, j);
                    break;
                case 50:
                    int i3 = C42023jb.f106242e;
                    C42006ic.m170313x(obj, j, C42161ra.m170785b(C42006ic.m170300k(obj, j), C42006ic.m170300k(obj2, j)));
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
                    if (!mo137497C(obj2, i2, i)) {
                        break;
                    } else {
                        C42006ic.m170313x(obj, j, C42006ic.m170300k(obj2, j));
                        mo137516t(obj, i2, i);
                        break;
                    }
                case 60:
                    mo137514r(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo137497C(obj2, i2, i)) {
                        break;
                    } else {
                        C42006ic.m170313x(obj, j, C42006ic.m170300k(obj2, j));
                        mo137516t(obj, i2, i);
                        break;
                    }
                case 68:
                    mo137514r(obj, obj2, i);
                    break;
            }
        }
        C42023jb.m170390c(this.f106599l, obj, obj2);
        if (this.f106593f) {
            this.f106600m.mo136764a(obj2);
            throw null;
        }
    }

    /* renamed from: e */
    public final boolean mo136567e(Object obj, Object obj2) {
        boolean z;
        int length = this.f106588a.length;
        for (int i = 0; i < length; i += 3) {
            int U = mo137507U(i);
            long j = (long) (U & 1048575);
            switch (m171247T(U)) {
                case 0:
                    if (mo137520x(obj, obj2, i) && Double.doubleToLongBits(C42006ic.m170295f(obj, j)) == Double.doubleToLongBits(C42006ic.m170295f(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (mo137520x(obj, obj2, i) && Float.floatToIntBits(C42006ic.m170296g(obj, j)) == Float.floatToIntBits(C42006ic.m170296g(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170298i(obj, j) == C42006ic.m170298i(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170298i(obj, j) == C42006ic.m170298i(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170297h(obj, j) == C42006ic.m170297h(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170298i(obj, j) == C42006ic.m170298i(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170297h(obj, j) == C42006ic.m170297h(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170286B(obj, j) == C42006ic.m170286B(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (mo137520x(obj, obj2, i) && C42023jb.m170410w(C42006ic.m170300k(obj, j), C42006ic.m170300k(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (mo137520x(obj, obj2, i) && C42023jb.m170410w(C42006ic.m170300k(obj, j), C42006ic.m170300k(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (mo137520x(obj, obj2, i) && C42023jb.m170410w(C42006ic.m170300k(obj, j), C42006ic.m170300k(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170297h(obj, j) == C42006ic.m170297h(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170297h(obj, j) == C42006ic.m170297h(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170297h(obj, j) == C42006ic.m170297h(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170298i(obj, j) == C42006ic.m170298i(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170297h(obj, j) == C42006ic.m170297h(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (mo137520x(obj, obj2, i) && C42006ic.m170298i(obj, j) == C42006ic.m170298i(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (mo137520x(obj, obj2, i) && C42023jb.m170410w(C42006ic.m170300k(obj, j), C42006ic.m170300k(obj2, j))) {
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
                    z = C42023jb.m170410w(C42006ic.m170300k(obj, j), C42006ic.m170300k(obj2, j));
                    break;
                case 50:
                    z = C42023jb.m170410w(C42006ic.m170300k(obj, j), C42006ic.m170300k(obj2, j));
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
                    long R = (long) (mo137505R(i) & 1048575);
                    if (C42006ic.m170297h(obj, R) == C42006ic.m170297h(obj2, R) && C42023jb.m170410w(C42006ic.m170300k(obj, j), C42006ic.m170300k(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f106599l.mo136575d(obj).equals(this.f106599l.mo136575d(obj2))) {
            return false;
        }
        if (!this.f106593f) {
            return true;
        }
        this.f106600m.mo136764a(obj);
        this.f106600m.mo136764a(obj2);
        throw null;
    }

    /* renamed from: f */
    public final Object mo136568f() {
        return ((C42177s9) this.f106592e).mo137279m();
    }

    /* renamed from: g */
    public final boolean mo136569g(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.f106596i) {
            int i6 = this.f106595h[i4];
            int i7 = this.f106588a[i6];
            int U = mo137507U(i6);
            int i8 = this.f106588a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = f106587q.getInt(obj2, (long) i9);
                }
                i = i3;
                i2 = i9;
            } else {
                i2 = i5;
                i = i3;
            }
            if ((268435456 & U) != 0 && !mo137522z(obj, i6, i2, i, i10)) {
                return false;
            }
            int T = m171247T(U);
            if (T != 9 && T != 17) {
                if (T != 27) {
                    if (T == 60 || T == 68) {
                        if (mo137497C(obj2, i7, i6) && !m171238A(obj2, U, mo137509k(i6))) {
                            return false;
                        }
                    } else if (T != 49) {
                        if (T == 50 && !((zzmc) C42006ic.m170300k(obj2, (long) (U & 1048575))).isEmpty()) {
                            C42144qa qaVar = (C42144qa) mo137510l(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C42006ic.m170300k(obj2, (long) (U & 1048575));
                if (!list.isEmpty()) {
                    C41987hb k = mo137509k(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!k.mo136569g(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (mo137522z(obj, i6, i2, i, i10) && !m171238A(obj2, U, mo137509k(i6))) {
                return false;
            }
            i4++;
            i5 = i2;
            i3 = i;
        }
        if (!this.f106593f) {
            return true;
        }
        this.f106600m.mo136764a(obj2);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0499, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x06f3, code lost:
        r14 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08a4, code lost:
        r8 = r8 + 3;
        r6 = r14;
        r7 = 1048575;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136570h(java.lang.Object r17, com.google.android.gms.internal.measurement.C42112oc r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f106594g
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 == 0) goto L_0x0462
            boolean r3 = r0.f106593f
            if (r3 != 0) goto L_0x045c
            int[] r3 = r0.f106588a
            int r3 = r3.length
            r4 = r6
        L_0x0018:
            if (r4 >= r3) goto L_0x0452
            int r8 = r0.mo137507U(r4)
            int[] r9 = r0.f106588a
            r9 = r9[r4]
            int r10 = m171247T(r8)
            switch(r10) {
                case 0: goto L_0x043f;
                case 1: goto L_0x042f;
                case 2: goto L_0x041f;
                case 3: goto L_0x040f;
                case 4: goto L_0x03ff;
                case 5: goto L_0x03ef;
                case 6: goto L_0x03df;
                case 7: goto L_0x03ce;
                case 8: goto L_0x03bd;
                case 9: goto L_0x03a8;
                case 10: goto L_0x0395;
                case 11: goto L_0x0384;
                case 12: goto L_0x0373;
                case 13: goto L_0x0362;
                case 14: goto L_0x0351;
                case 15: goto L_0x0340;
                case 16: goto L_0x032f;
                case 17: goto L_0x031a;
                case 18: goto L_0x030d;
                case 19: goto L_0x0300;
                case 20: goto L_0x02f3;
                case 21: goto L_0x02e6;
                case 22: goto L_0x02d9;
                case 23: goto L_0x02cc;
                case 24: goto L_0x02bf;
                case 25: goto L_0x02b2;
                case 26: goto L_0x02a5;
                case 27: goto L_0x0294;
                case 28: goto L_0x0287;
                case 29: goto L_0x027a;
                case 30: goto L_0x026d;
                case 31: goto L_0x0260;
                case 32: goto L_0x0253;
                case 33: goto L_0x0246;
                case 34: goto L_0x0239;
                case 35: goto L_0x022c;
                case 36: goto L_0x021f;
                case 37: goto L_0x0212;
                case 38: goto L_0x0205;
                case 39: goto L_0x01f8;
                case 40: goto L_0x01eb;
                case 41: goto L_0x01de;
                case 42: goto L_0x01d1;
                case 43: goto L_0x01c4;
                case 44: goto L_0x01b7;
                case 45: goto L_0x01aa;
                case 46: goto L_0x019d;
                case 47: goto L_0x0190;
                case 48: goto L_0x0183;
                case 49: goto L_0x0172;
                case 50: goto L_0x0167;
                case 51: goto L_0x0156;
                case 52: goto L_0x0145;
                case 53: goto L_0x0134;
                case 54: goto L_0x0123;
                case 55: goto L_0x0112;
                case 56: goto L_0x0101;
                case 57: goto L_0x00f0;
                case 58: goto L_0x00df;
                case 59: goto L_0x00ce;
                case 60: goto L_0x00b9;
                case 61: goto L_0x00a6;
                case 62: goto L_0x0095;
                case 63: goto L_0x0084;
                case 64: goto L_0x0073;
                case 65: goto L_0x0062;
                case 66: goto L_0x0051;
                case 67: goto L_0x0040;
                case 68: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x044e
        L_0x002b:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            com.google.android.gms.internal.measurement.hb r10 = r0.mo137509k(r4)
            r2.mo136537a(r9, r8, r10)
            goto L_0x044e
        L_0x0040:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m171248V(r1, r10)
            r2.mo136554r(r9, r10)
            goto L_0x044e
        L_0x0051:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m171246L(r1, r10)
            r2.mo136540d(r9, r8)
            goto L_0x044e
        L_0x0062:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m171248V(r1, r10)
            r2.mo136558v(r9, r10)
            goto L_0x044e
        L_0x0073:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m171246L(r1, r10)
            r2.mo136549m(r9, r8)
            goto L_0x044e
        L_0x0084:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m171246L(r1, r10)
            r2.mo136561y(r9, r8)
            goto L_0x044e
        L_0x0095:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m171246L(r1, r10)
            r2.mo136555s(r9, r8)
            goto L_0x044e
        L_0x00a6:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            com.google.android.gms.internal.measurement.zzka r8 = (com.google.android.gms.internal.measurement.zzka) r8
            r2.mo136551o(r9, r8)
            goto L_0x044e
        L_0x00b9:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            com.google.android.gms.internal.measurement.hb r10 = r0.mo137509k(r4)
            r2.mo136547k(r9, r8, r10)
            goto L_0x044e
        L_0x00ce:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            m171241E(r9, r8, r2)
            goto L_0x044e
        L_0x00df:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            boolean r8 = m171240D(r1, r10)
            r2.mo136539c(r9, r8)
            goto L_0x044e
        L_0x00f0:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m171246L(r1, r10)
            r2.mo136557u(r9, r8)
            goto L_0x044e
        L_0x0101:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m171248V(r1, r10)
            r2.mo136534H(r9, r10)
            goto L_0x044e
        L_0x0112:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m171246L(r1, r10)
            r2.mo136545i(r9, r8)
            goto L_0x044e
        L_0x0123:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m171248V(r1, r10)
            r2.mo136533G(r9, r10)
            goto L_0x044e
        L_0x0134:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m171248V(r1, r10)
            r2.mo136542f(r9, r10)
            goto L_0x044e
        L_0x0145:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            float r8 = m171245J(r1, r10)
            r2.mo136528B(r9, r8)
            goto L_0x044e
        L_0x0156:
            boolean r10 = r0.mo137497C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            double r10 = m171244I(r1, r10)
            r2.mo136546j(r9, r10)
            goto L_0x044e
        L_0x0167:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            r0.mo137519w(r2, r9, r8, r4)
            goto L_0x044e
        L_0x0172:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.hb r10 = r0.mo137509k(r4)
            com.google.android.gms.internal.measurement.C42023jb.m170399l(r9, r8, r2, r10)
            goto L_0x044e
        L_0x0183:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170406s(r9, r8, r2, r5)
            goto L_0x044e
        L_0x0190:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170405r(r9, r8, r2, r5)
            goto L_0x044e
        L_0x019d:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170404q(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01aa:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170403p(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01b7:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170395h(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01c4:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170408u(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01d1:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170392e(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01de:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170396i(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01eb:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170397j(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01f8:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170400m(r9, r8, r2, r5)
            goto L_0x044e
        L_0x0205:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170409v(r9, r8, r2, r5)
            goto L_0x044e
        L_0x0212:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170401n(r9, r8, r2, r5)
            goto L_0x044e
        L_0x021f:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170398k(r9, r8, r2, r5)
            goto L_0x044e
        L_0x022c:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170394g(r9, r8, r2, r5)
            goto L_0x044e
        L_0x0239:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170406s(r9, r8, r2, r6)
            goto L_0x044e
        L_0x0246:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170405r(r9, r8, r2, r6)
            goto L_0x044e
        L_0x0253:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170404q(r9, r8, r2, r6)
            goto L_0x044e
        L_0x0260:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170403p(r9, r8, r2, r6)
            goto L_0x044e
        L_0x026d:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170395h(r9, r8, r2, r6)
            goto L_0x044e
        L_0x027a:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170408u(r9, r8, r2, r6)
            goto L_0x044e
        L_0x0287:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170393f(r9, r8, r2)
            goto L_0x044e
        L_0x0294:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.hb r10 = r0.mo137509k(r4)
            com.google.android.gms.internal.measurement.C42023jb.m170402o(r9, r8, r2, r10)
            goto L_0x044e
        L_0x02a5:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170407t(r9, r8, r2)
            goto L_0x044e
        L_0x02b2:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170392e(r9, r8, r2, r6)
            goto L_0x044e
        L_0x02bf:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170396i(r9, r8, r2, r6)
            goto L_0x044e
        L_0x02cc:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170397j(r9, r8, r2, r6)
            goto L_0x044e
        L_0x02d9:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170400m(r9, r8, r2, r6)
            goto L_0x044e
        L_0x02e6:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170409v(r9, r8, r2, r6)
            goto L_0x044e
        L_0x02f3:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170401n(r9, r8, r2, r6)
            goto L_0x044e
        L_0x0300:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170398k(r9, r8, r2, r6)
            goto L_0x044e
        L_0x030d:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C42023jb.m170394g(r9, r8, r2, r6)
            goto L_0x044e
        L_0x031a:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            com.google.android.gms.internal.measurement.hb r10 = r0.mo137509k(r4)
            r2.mo136537a(r9, r8, r10)
            goto L_0x044e
        L_0x032f:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r1, r10)
            r2.mo136554r(r9, r10)
            goto L_0x044e
        L_0x0340:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r1, r10)
            r2.mo136540d(r9, r8)
            goto L_0x044e
        L_0x0351:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r1, r10)
            r2.mo136558v(r9, r10)
            goto L_0x044e
        L_0x0362:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r1, r10)
            r2.mo136549m(r9, r8)
            goto L_0x044e
        L_0x0373:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r1, r10)
            r2.mo136561y(r9, r8)
            goto L_0x044e
        L_0x0384:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r1, r10)
            r2.mo136555s(r9, r8)
            goto L_0x044e
        L_0x0395:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            com.google.android.gms.internal.measurement.zzka r8 = (com.google.android.gms.internal.measurement.zzka) r8
            r2.mo136551o(r9, r8)
            goto L_0x044e
        L_0x03a8:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            com.google.android.gms.internal.measurement.hb r10 = r0.mo137509k(r4)
            r2.mo136547k(r9, r8, r10)
            goto L_0x044e
        L_0x03bd:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r1, r10)
            m171241E(r9, r8, r2)
            goto L_0x044e
        L_0x03ce:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.measurement.C42006ic.m170286B(r1, r10)
            r2.mo136539c(r9, r8)
            goto L_0x044e
        L_0x03df:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r1, r10)
            r2.mo136557u(r9, r8)
            goto L_0x044e
        L_0x03ef:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r1, r10)
            r2.mo136534H(r9, r10)
            goto L_0x044e
        L_0x03ff:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C42006ic.m170297h(r1, r10)
            r2.mo136545i(r9, r8)
            goto L_0x044e
        L_0x040f:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r1, r10)
            r2.mo136533G(r9, r10)
            goto L_0x044e
        L_0x041f:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C42006ic.m170298i(r1, r10)
            r2.mo136542f(r9, r10)
            goto L_0x044e
        L_0x042f:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.measurement.C42006ic.m170296g(r1, r10)
            r2.mo136528B(r9, r8)
            goto L_0x044e
        L_0x043f:
            boolean r10 = r0.mo137521y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.measurement.C42006ic.m170295f(r1, r10)
            r2.mo136546j(r9, r10)
        L_0x044e:
            int r4 = r4 + 3
            goto L_0x0018
        L_0x0452:
            com.google.android.gms.internal.measurement.yb r3 = r0.f106599l
            java.lang.Object r1 = r3.mo136575d(r1)
            r3.mo136580i(r1, r2)
            return
        L_0x045c:
            com.google.android.gms.internal.measurement.f9 r2 = r0.f106600m
            r2.mo136764a(r1)
            throw r4
        L_0x0462:
            boolean r3 = r0.f106593f
            if (r3 != 0) goto L_0x08b6
            int[] r3 = r0.f106588a
            int r3 = r3.length
            sun.misc.Unsafe r4 = f106587q
            r8 = r6
            r10 = r8
            r9 = r7
        L_0x046e:
            if (r8 >= r3) goto L_0x08ac
            int r11 = r0.mo137507U(r8)
            int[] r12 = r0.f106588a
            r13 = r12[r8]
            int r14 = m171247T(r11)
            r15 = 17
            if (r14 > r15) goto L_0x0493
            int r15 = r8 + 2
            r12 = r12[r15]
            r15 = r12 & r7
            if (r15 == r9) goto L_0x048e
            long r9 = (long) r15
            int r10 = r4.getInt(r1, r9)
            r9 = r15
        L_0x048e:
            int r12 = r12 >>> 20
            int r12 = r5 << r12
            goto L_0x0494
        L_0x0493:
            r12 = r6
        L_0x0494:
            r11 = r11 & r7
            long r6 = (long) r11
            switch(r14) {
                case 0: goto L_0x0898;
                case 1: goto L_0x088b;
                case 2: goto L_0x087e;
                case 3: goto L_0x0871;
                case 4: goto L_0x0864;
                case 5: goto L_0x0857;
                case 6: goto L_0x084a;
                case 7: goto L_0x083d;
                case 8: goto L_0x082f;
                case 9: goto L_0x081d;
                case 10: goto L_0x080d;
                case 11: goto L_0x07ff;
                case 12: goto L_0x07f1;
                case 13: goto L_0x07e3;
                case 14: goto L_0x07d5;
                case 15: goto L_0x07c7;
                case 16: goto L_0x07b9;
                case 17: goto L_0x07a7;
                case 18: goto L_0x0797;
                case 19: goto L_0x0787;
                case 20: goto L_0x0777;
                case 21: goto L_0x0767;
                case 22: goto L_0x0757;
                case 23: goto L_0x0747;
                case 24: goto L_0x0737;
                case 25: goto L_0x0727;
                case 26: goto L_0x0718;
                case 27: goto L_0x0705;
                case 28: goto L_0x06f6;
                case 29: goto L_0x06e5;
                case 30: goto L_0x06d6;
                case 31: goto L_0x06c7;
                case 32: goto L_0x06b8;
                case 33: goto L_0x06a9;
                case 34: goto L_0x069a;
                case 35: goto L_0x068b;
                case 36: goto L_0x067c;
                case 37: goto L_0x066d;
                case 38: goto L_0x065e;
                case 39: goto L_0x064f;
                case 40: goto L_0x0640;
                case 41: goto L_0x0631;
                case 42: goto L_0x0622;
                case 43: goto L_0x0613;
                case 44: goto L_0x0604;
                case 45: goto L_0x05f5;
                case 46: goto L_0x05e6;
                case 47: goto L_0x05d7;
                case 48: goto L_0x05c8;
                case 49: goto L_0x05b5;
                case 50: goto L_0x05ac;
                case 51: goto L_0x059d;
                case 52: goto L_0x058e;
                case 53: goto L_0x057f;
                case 54: goto L_0x0570;
                case 55: goto L_0x0561;
                case 56: goto L_0x0552;
                case 57: goto L_0x0543;
                case 58: goto L_0x0534;
                case 59: goto L_0x0525;
                case 60: goto L_0x0512;
                case 61: goto L_0x0502;
                case 62: goto L_0x04f4;
                case 63: goto L_0x04e6;
                case 64: goto L_0x04d8;
                case 65: goto L_0x04ca;
                case 66: goto L_0x04bc;
                case 67: goto L_0x04ae;
                case 68: goto L_0x049c;
                default: goto L_0x0499;
            }
        L_0x0499:
            r14 = 0
            goto L_0x08a4
        L_0x049c:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.hb r7 = r0.mo137509k(r8)
            r2.mo136537a(r13, r6, r7)
            goto L_0x0499
        L_0x04ae:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            long r6 = m171248V(r1, r6)
            r2.mo136554r(r13, r6)
            goto L_0x0499
        L_0x04bc:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m171246L(r1, r6)
            r2.mo136540d(r13, r6)
            goto L_0x0499
        L_0x04ca:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            long r6 = m171248V(r1, r6)
            r2.mo136558v(r13, r6)
            goto L_0x0499
        L_0x04d8:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m171246L(r1, r6)
            r2.mo136549m(r13, r6)
            goto L_0x0499
        L_0x04e6:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m171246L(r1, r6)
            r2.mo136561y(r13, r6)
            goto L_0x0499
        L_0x04f4:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m171246L(r1, r6)
            r2.mo136555s(r13, r6)
            goto L_0x0499
        L_0x0502:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.zzka r6 = (com.google.android.gms.internal.measurement.zzka) r6
            r2.mo136551o(r13, r6)
            goto L_0x0499
        L_0x0512:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.hb r7 = r0.mo137509k(r8)
            r2.mo136547k(r13, r6, r7)
            goto L_0x0499
        L_0x0525:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            java.lang.Object r6 = r4.getObject(r1, r6)
            m171241E(r13, r6, r2)
            goto L_0x0499
        L_0x0534:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            boolean r6 = m171240D(r1, r6)
            r2.mo136539c(r13, r6)
            goto L_0x0499
        L_0x0543:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m171246L(r1, r6)
            r2.mo136557u(r13, r6)
            goto L_0x0499
        L_0x0552:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            long r6 = m171248V(r1, r6)
            r2.mo136534H(r13, r6)
            goto L_0x0499
        L_0x0561:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m171246L(r1, r6)
            r2.mo136545i(r13, r6)
            goto L_0x0499
        L_0x0570:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            long r6 = m171248V(r1, r6)
            r2.mo136533G(r13, r6)
            goto L_0x0499
        L_0x057f:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            long r6 = m171248V(r1, r6)
            r2.mo136542f(r13, r6)
            goto L_0x0499
        L_0x058e:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            float r6 = m171245J(r1, r6)
            r2.mo136528B(r13, r6)
            goto L_0x0499
        L_0x059d:
            boolean r11 = r0.mo137497C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            double r6 = m171244I(r1, r6)
            r2.mo136546j(r13, r6)
            goto L_0x0499
        L_0x05ac:
            java.lang.Object r6 = r4.getObject(r1, r6)
            r0.mo137519w(r2, r13, r6, r8)
            goto L_0x0499
        L_0x05b5:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.hb r7 = r0.mo137509k(r8)
            com.google.android.gms.internal.measurement.C42023jb.m170399l(r11, r6, r2, r7)
            goto L_0x0499
        L_0x05c8:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170406s(r11, r6, r2, r5)
            goto L_0x0499
        L_0x05d7:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170405r(r11, r6, r2, r5)
            goto L_0x0499
        L_0x05e6:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170404q(r11, r6, r2, r5)
            goto L_0x0499
        L_0x05f5:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170403p(r11, r6, r2, r5)
            goto L_0x0499
        L_0x0604:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170395h(r11, r6, r2, r5)
            goto L_0x0499
        L_0x0613:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170408u(r11, r6, r2, r5)
            goto L_0x0499
        L_0x0622:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170392e(r11, r6, r2, r5)
            goto L_0x0499
        L_0x0631:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170396i(r11, r6, r2, r5)
            goto L_0x0499
        L_0x0640:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170397j(r11, r6, r2, r5)
            goto L_0x0499
        L_0x064f:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170400m(r11, r6, r2, r5)
            goto L_0x0499
        L_0x065e:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170409v(r11, r6, r2, r5)
            goto L_0x0499
        L_0x066d:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170401n(r11, r6, r2, r5)
            goto L_0x0499
        L_0x067c:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170398k(r11, r6, r2, r5)
            goto L_0x0499
        L_0x068b:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170394g(r11, r6, r2, r5)
            goto L_0x0499
        L_0x069a:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 0
            com.google.android.gms.internal.measurement.C42023jb.m170406s(r11, r6, r2, r12)
            goto L_0x06f3
        L_0x06a9:
            r12 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170405r(r11, r6, r2, r12)
            goto L_0x06f3
        L_0x06b8:
            r12 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170404q(r11, r6, r2, r12)
            goto L_0x06f3
        L_0x06c7:
            r12 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170403p(r11, r6, r2, r12)
            goto L_0x06f3
        L_0x06d6:
            r12 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170395h(r11, r6, r2, r12)
            goto L_0x06f3
        L_0x06e5:
            r12 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170408u(r11, r6, r2, r12)
        L_0x06f3:
            r14 = r12
            goto L_0x08a4
        L_0x06f6:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170393f(r11, r6, r2)
            goto L_0x0499
        L_0x0705:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.hb r7 = r0.mo137509k(r8)
            com.google.android.gms.internal.measurement.C42023jb.m170402o(r11, r6, r2, r7)
            goto L_0x0499
        L_0x0718:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170407t(r11, r6, r2)
            goto L_0x0499
        L_0x0727:
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            com.google.android.gms.internal.measurement.C42023jb.m170392e(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0737:
            r14 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170396i(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0747:
            r14 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170397j(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0757:
            r14 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170400m(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0767:
            r14 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170409v(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0777:
            r14 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170401n(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0787:
            r14 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170398k(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0797:
            r14 = 0
            int[] r11 = r0.f106588a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C42023jb.m170394g(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x07a7:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.hb r7 = r0.mo137509k(r8)
            r2.mo136537a(r13, r6, r7)
            goto L_0x08a4
        L_0x07b9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            long r6 = r4.getLong(r1, r6)
            r2.mo136554r(r13, r6)
            goto L_0x08a4
        L_0x07c7:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo136540d(r13, r6)
            goto L_0x08a4
        L_0x07d5:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            long r6 = r4.getLong(r1, r6)
            r2.mo136558v(r13, r6)
            goto L_0x08a4
        L_0x07e3:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo136549m(r13, r6)
            goto L_0x08a4
        L_0x07f1:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo136561y(r13, r6)
            goto L_0x08a4
        L_0x07ff:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo136555s(r13, r6)
            goto L_0x08a4
        L_0x080d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.zzka r6 = (com.google.android.gms.internal.measurement.zzka) r6
            r2.mo136551o(r13, r6)
            goto L_0x08a4
        L_0x081d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.hb r7 = r0.mo137509k(r8)
            r2.mo136547k(r13, r6, r7)
            goto L_0x08a4
        L_0x082f:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            java.lang.Object r6 = r4.getObject(r1, r6)
            m171241E(r13, r6, r2)
            goto L_0x08a4
        L_0x083d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            boolean r6 = com.google.android.gms.internal.measurement.C42006ic.m170286B(r1, r6)
            r2.mo136539c(r13, r6)
            goto L_0x08a4
        L_0x084a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo136557u(r13, r6)
            goto L_0x08a4
        L_0x0857:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            long r6 = r4.getLong(r1, r6)
            r2.mo136534H(r13, r6)
            goto L_0x08a4
        L_0x0864:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo136545i(r13, r6)
            goto L_0x08a4
        L_0x0871:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            long r6 = r4.getLong(r1, r6)
            r2.mo136533G(r13, r6)
            goto L_0x08a4
        L_0x087e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            long r6 = r4.getLong(r1, r6)
            r2.mo136542f(r13, r6)
            goto L_0x08a4
        L_0x088b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            float r6 = com.google.android.gms.internal.measurement.C42006ic.m170296g(r1, r6)
            r2.mo136528B(r13, r6)
            goto L_0x08a4
        L_0x0898:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            double r6 = com.google.android.gms.internal.measurement.C42006ic.m170295f(r1, r6)
            r2.mo136546j(r13, r6)
        L_0x08a4:
            int r8 = r8 + 3
            r6 = r14
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x046e
        L_0x08ac:
            com.google.android.gms.internal.measurement.yb r3 = r0.f106599l
            java.lang.Object r1 = r3.mo136575d(r1)
            r3.mo136580i(r1, r2)
            return
        L_0x08b6:
            com.google.android.gms.internal.measurement.f9 r2 = r0.f106600m
            r2.mo136764a(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42297za.mo136570h(java.lang.Object, com.google.android.gms.internal.measurement.oc):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0329, code lost:
        if (r0 != r14) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x034c, code lost:
        if (r0 != r14) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r6 = r6 | r10;
        r13 = r34;
        r9 = r7;
        r2 = r15;
        r7 = r20;
        r1 = r23;
        r8 = 1048575;
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014c, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021c, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0239, code lost:
        r6 = r6 | r10;
        r9 = r7;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023c, code lost:
        r8 = r19;
        r7 = r20;
        r1 = r23;
        r10 = -1;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0244, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0248, code lost:
        r2 = r4;
        r29 = r7;
        r7 = r20;
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02e8, code lost:
        if (r0 != r24) goto L_0x02ea;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136571i(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.C42002i8 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f106594g
            if (r0 == 0) goto L_0x0390
            m171250p(r31)
            sun.misc.Unsafe r9 = f106587q
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x0020:
            if (r0 >= r13) goto L_0x0375
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0032
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170354k(r0, r12, r3, r11)
            int r3 = r11.f106210a
            r4 = r0
            r17 = r3
            goto L_0x0035
        L_0x0032:
            r17 = r0
            r4 = r3
        L_0x0035:
            int r5 = r17 >>> 3
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.mo137504Q(r5, r2)
            goto L_0x0044
        L_0x0040:
            int r0 = r15.mo137503P(r5)
        L_0x0044:
            r2 = r0
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r23 = r5
            r29 = r9
            r18 = r10
            r15 = r16
            goto L_0x034f
        L_0x0052:
            r3 = r17 & 7
            int[] r0 = r15.f106588a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r13 = m171247T(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r13 > r10) goto L_0x0251
            int r10 = r2 + 2
            r0 = r0[r10]
            int r10 = r0 >>> 20
            r5 = 1
            int r10 = r5 << r10
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r15
            r22 = r1
            r20 = r2
            if (r0 == r7) goto L_0x0092
            if (r7 == r15) goto L_0x0085
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r19
        L_0x0087:
            if (r0 == r15) goto L_0x008f
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008f:
            r2 = r7
            r7 = r0
            goto L_0x0094
        L_0x0092:
            r2 = r19
        L_0x0094:
            r0 = 5
            switch(r13) {
                case 0: goto L_0x021f;
                case 1: goto L_0x0204;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01e4;
                case 4: goto L_0x01cd;
                case 5: goto L_0x01ae;
                case 6: goto L_0x0198;
                case 7: goto L_0x0177;
                case 8: goto L_0x0153;
                case 9: goto L_0x0124;
                case 10: goto L_0x0102;
                case 11: goto L_0x01cd;
                case 12: goto L_0x00ef;
                case 13: goto L_0x0198;
                case 14: goto L_0x01ae;
                case 15: goto L_0x00d8;
                case 16: goto L_0x00a5;
                default: goto L_0x0098;
            }
        L_0x0098:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            goto L_0x0248
        L_0x00a5:
            if (r3 != 0) goto L_0x00cf
            int r13 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r12, r4, r11)
            long r0 = r11.f106211b
            long r4 = com.google.android.gms.internal.measurement.C42244w8.m171038b(r0)
            r0 = r2
            r1 = r31
            r15 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r23 = r33
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r0 = r13
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x0244
        L_0x00cf:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            goto L_0x014c
        L_0x00d8:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x014c
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r12, r4, r11)
            int r1 = r11.f106210a
            int r1 = com.google.android.gms.internal.measurement.C42244w8.m171037a(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0115
        L_0x00ef:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x014c
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r12, r4, r11)
            int r1 = r11.f106210a
            r7.putInt(r14, r8, r1)
            goto L_0x0115
        L_0x0102:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x014c
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170344a(r12, r4, r11)
            java.lang.Object r1 = r11.f106212c
            r7.putObject(r14, r8, r1)
        L_0x0115:
            r6 = r6 | r10
            r13 = r34
            r9 = r7
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x0371
        L_0x0124:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x014c
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            java.lang.Object r8 = r13.mo137511m(r14, r15)
            com.google.android.gms.internal.measurement.hb r1 = r13.mo137509k(r15)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170358o(r0, r1, r2, r3, r4, r5)
            r13.mo137517u(r14, r15, r8)
            goto L_0x0239
        L_0x014c:
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0248
        L_0x0153:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0248
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170350g(r12, r4, r11)
            goto L_0x0170
        L_0x016c:
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170351h(r12, r4, r11)
        L_0x0170:
            java.lang.Object r1 = r11.f106212c
            r7.putObject(r14, r8, r1)
            goto L_0x0239
        L_0x0177:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0248
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r12, r4, r11)
            long r1 = r11.f106211b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            r5 = r16
        L_0x0193:
            com.google.android.gms.internal.measurement.C42006ic.m170307r(r14, r8, r5)
            goto L_0x0239
        L_0x0198:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0248
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170345b(r12, r4)
            r7.putInt(r14, r8, r0)
            goto L_0x021c
        L_0x01ae:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x0248
            long r21 = com.google.android.gms.internal.measurement.C42020j8.m170359p(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0239
        L_0x01cd:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0248
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170353j(r12, r4, r11)
            int r1 = r11.f106210a
            r7.putInt(r14, r8, r1)
            goto L_0x0239
        L_0x01e4:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0248
            int r17 = com.google.android.gms.internal.measurement.C42020j8.m170356m(r12, r4, r11)
            long r4 = r11.f106211b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r2 = r15
            r0 = r17
            goto L_0x023c
        L_0x0204:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0248
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170345b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C42006ic.m170310u(r14, r8, r0)
        L_0x021c:
            int r0 = r4 + 4
            goto L_0x0239
        L_0x021f:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x0248
            long r0 = com.google.android.gms.internal.measurement.C42020j8.m170359p(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C42006ic.m170309t(r14, r8, r0)
            int r0 = r4 + 8
        L_0x0239:
            r6 = r6 | r10
            r9 = r7
            r2 = r15
        L_0x023c:
            r8 = r19
            r7 = r20
            r1 = r23
            r10 = -1
            r15 = r13
        L_0x0244:
            r13 = r34
            goto L_0x0020
        L_0x0248:
            r2 = r4
            r29 = r7
            r7 = r20
            r18 = -1
            goto L_0x034f
        L_0x0251:
            r23 = r33
            r22 = r1
            r20 = r7
            r10 = r15
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r2
            r0 = 27
            if (r13 != r0) goto L_0x02af
            r0 = 2
            if (r3 != r0) goto L_0x02a4
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.measurement.z9 r0 = (com.google.android.gms.internal.measurement.C42296z9) r0
            boolean r1 = r0.mo136871d()
            if (r1 != 0) goto L_0x0282
            int r1 = r0.size()
            if (r1 != 0) goto L_0x027a
            r1 = 10
            goto L_0x027b
        L_0x027a:
            int r1 = r1 + r1
        L_0x027b:
            com.google.android.gms.internal.measurement.z9 r0 = r0.mo136618n(r1)
            r7.putObject(r14, r8, r0)
        L_0x0282:
            r5 = r0
            com.google.android.gms.internal.measurement.hb r0 = r10.mo137509k(r15)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170348e(r0, r1, r2, r3, r4, r5, r6)
            r13 = r34
            r9 = r7
            r6 = r8
            r2 = r15
            r8 = r19
            r7 = r20
            r1 = r23
            r15 = r10
            r10 = -1
            goto L_0x0020
        L_0x02a4:
            r14 = r4
            r25 = r6
            r29 = r7
            r26 = r20
            r18 = -1
            goto L_0x032c
        L_0x02af:
            r0 = 49
            if (r13 > r0) goto L_0x02ff
            r1 = r22
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r5 = r3
            r3 = r4
            r24 = r4
            r4 = r34
            r33 = r5
            r5 = r17
            r25 = r6
            r6 = r23
            r26 = r20
            r20 = r7
            r7 = r33
            r27 = r8
            r9 = r19
            r8 = r15
            r29 = r20
            r18 = -1
            r9 = r21
            r11 = r13
            r12 = r27
            r14 = r35
            int r0 = r0.mo137502O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r24
            if (r0 == r14) goto L_0x02fd
        L_0x02ea:
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r10 = r18
            r1 = r23
            r6 = r25
            r7 = r26
            goto L_0x036c
        L_0x02fd:
            r2 = r0
            goto L_0x032d
        L_0x02ff:
            r33 = r3
            r14 = r4
            r25 = r6
            r29 = r7
            r27 = r8
            r26 = r20
            r1 = r22
            r18 = -1
            r0 = 50
            if (r13 != r0) goto L_0x0332
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x032c
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r15
            r6 = r27
            r8 = r35
            int r0 = r0.mo137500M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x02fd
            goto L_0x02ea
        L_0x032c:
            r2 = r14
        L_0x032d:
            r6 = r25
            r7 = r26
            goto L_0x034f
        L_0x0332:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r17
            r6 = r23
            r9 = r13
            r10 = r27
            r12 = r15
            r13 = r35
            int r0 = r0.mo137501N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02fd
            goto L_0x02ea
        L_0x034f:
            com.google.android.gms.internal.measurement.zb r4 = m171242G(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C42020j8.m170352i(r0, r1, r2, r3, r4, r5)
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r10 = r18
            r1 = r23
        L_0x036c:
            r9 = r29
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0371:
            r15 = r30
            goto L_0x0020
        L_0x0375:
            r25 = r6
            r1 = r8
            r29 = r9
            if (r7 == r1) goto L_0x0386
            long r1 = (long) r7
            r3 = r31
            r6 = r25
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0386:
            r4 = r34
            if (r0 != r4) goto L_0x038b
            return
        L_0x038b:
            com.google.android.gms.internal.measurement.zzll r0 = com.google.android.gms.internal.measurement.zzll.m171376e()
            throw r0
        L_0x0390:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.mo137498F(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42297za.mo136571i(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.i8):void");
    }

    /* renamed from: j */
    public final C42245w9 mo137508j(int i) {
        int i2 = i / 3;
        return (C42245w9) this.f106589b[i2 + i2 + 1];
    }

    /* renamed from: k */
    public final C41987hb mo137509k(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C41987hb hbVar = (C41987hb) this.f106589b[i3];
        if (hbVar != null) {
            return hbVar;
        }
        C41987hb b = C41933eb.m169828a().mo136721b((Class) this.f106589b[i3 + 1]);
        this.f106589b[i3] = b;
        return b;
    }

    /* renamed from: l */
    public final Object mo137510l(int i) {
        int i2 = i / 3;
        return this.f106589b[i2 + i2];
    }

    /* renamed from: m */
    public final Object mo137511m(Object obj, int i) {
        C41987hb k = mo137509k(i);
        int U = mo137507U(i) & 1048575;
        if (!mo137521y(obj, i)) {
            return k.mo136568f();
        }
        Object object = f106587q.getObject(obj, (long) U);
        if (m171239B(object)) {
            return object;
        }
        Object f = k.mo136568f();
        if (object != null) {
            k.mo136566d(f, object);
        }
        return f;
    }

    /* renamed from: n */
    public final Object mo137512n(Object obj, int i, int i2) {
        C41987hb k = mo137509k(i2);
        if (!mo137497C(obj, i, i2)) {
            return k.mo136568f();
        }
        Object object = f106587q.getObject(obj, (long) (mo137507U(i2) & 1048575));
        if (m171239B(object)) {
            return object;
        }
        Object f = k.mo136568f();
        if (object != null) {
            k.mo136566d(f, object);
        }
        return f;
    }

    /* renamed from: q */
    public final void mo137513q(Object obj, Object obj2, int i) {
        if (mo137521y(obj2, i)) {
            Unsafe unsafe = f106587q;
            long U = (long) (mo137507U(i) & 1048575);
            Object object = unsafe.getObject(obj2, U);
            if (object != null) {
                C41987hb k = mo137509k(i);
                if (!mo137521y(obj, i)) {
                    if (!m171239B(object)) {
                        unsafe.putObject(obj, U, object);
                    } else {
                        Object f = k.mo136568f();
                        k.mo136566d(f, object);
                        unsafe.putObject(obj, U, f);
                    }
                    mo137515s(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, U);
                if (!m171239B(object2)) {
                    Object f2 = k.mo136568f();
                    k.mo136566d(f2, object2);
                    unsafe.putObject(obj, U, f2);
                    object2 = f2;
                }
                k.mo136566d(object2, object);
                return;
            }
            int i2 = this.f106588a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i2 + " is present but null: " + obj3);
        }
    }

    /* renamed from: r */
    public final void mo137514r(Object obj, Object obj2, int i) {
        int i2 = this.f106588a[i];
        if (mo137497C(obj2, i2, i)) {
            Unsafe unsafe = f106587q;
            long U = (long) (mo137507U(i) & 1048575);
            Object object = unsafe.getObject(obj2, U);
            if (object != null) {
                C41987hb k = mo137509k(i);
                if (!mo137497C(obj, i2, i)) {
                    if (!m171239B(object)) {
                        unsafe.putObject(obj, U, object);
                    } else {
                        Object f = k.mo136568f();
                        k.mo136566d(f, object);
                        unsafe.putObject(obj, U, f);
                    }
                    mo137516t(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, U);
                if (!m171239B(object2)) {
                    Object f2 = k.mo136568f();
                    k.mo136566d(f2, object2);
                    unsafe.putObject(obj, U, f2);
                    object2 = f2;
                }
                k.mo136566d(object2, object);
                return;
            }
            int i3 = this.f106588a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    /* renamed from: s */
    public final void mo137515s(Object obj, int i) {
        int R = mo137505R(i);
        long j = (long) (1048575 & R);
        if (j != 1048575) {
            C42006ic.m170311v(obj, j, (1 << (R >>> 20)) | C42006ic.m170297h(obj, j));
        }
    }

    /* renamed from: t */
    public final void mo137516t(Object obj, int i, int i2) {
        C42006ic.m170311v(obj, (long) (mo137505R(i2) & 1048575), i);
    }

    /* renamed from: u */
    public final void mo137517u(Object obj, int i, Object obj2) {
        f106587q.putObject(obj, (long) (mo137507U(i) & 1048575), obj2);
        mo137515s(obj, i);
    }

    /* renamed from: v */
    public final void mo137518v(Object obj, int i, int i2, Object obj2) {
        f106587q.putObject(obj, (long) (mo137507U(i2) & 1048575), obj2);
        mo137516t(obj, i, i2);
    }

    /* renamed from: w */
    public final void mo137519w(C42112oc ocVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            C42144qa qaVar = (C42144qa) mo137510l(i2);
            throw null;
        }
    }

    /* renamed from: x */
    public final boolean mo137520x(Object obj, Object obj2, int i) {
        return mo137521y(obj, i) == mo137521y(obj2, i);
    }

    /* renamed from: y */
    public final boolean mo137521y(Object obj, int i) {
        int R = mo137505R(i);
        long j = (long) (R & 1048575);
        if (j == 1048575) {
            int U = mo137507U(i);
            long j2 = (long) (U & 1048575);
            switch (m171247T(U)) {
                case 0:
                    if (Double.doubleToRawLongBits(C42006ic.m170295f(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(C42006ic.m170296g(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C42006ic.m170298i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C42006ic.m170298i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C42006ic.m170297h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C42006ic.m170298i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C42006ic.m170297h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C42006ic.m170286B(obj, j2);
                case 8:
                    Object k = C42006ic.m170300k(obj, j2);
                    if (k instanceof String) {
                        if (!((String) k).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(k instanceof zzka)) {
                        throw new IllegalArgumentException();
                    } else if (!zzka.f106708a.equals(k)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (C42006ic.m170300k(obj, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zzka.f106708a.equals(C42006ic.m170300k(obj, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (C42006ic.m170297h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C42006ic.m170297h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C42006ic.m170297h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C42006ic.m170298i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C42006ic.m170297h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C42006ic.m170298i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C42006ic.m170300k(obj, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((C42006ic.m170297h(obj, j) & (1 << (R >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: z */
    public final boolean mo137522z(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? mo137521y(obj, i) : (i3 & i4) != 0;
    }
}
