package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;
import com.contentsquare.android.sdk.C14719t0;
import com.contentsquare.android.sdk.C14782uf;
import com.contentsquare.android.sdk.C14880y2;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.contentsquare.android.sdk.fc */
public final class C14344fc<T> implements C14398h8<T> {

    /* renamed from: r */
    public static final int[] f35419r = new int[0];

    /* renamed from: s */
    public static final Unsafe f35420s = C14634q4.m63011A();

    /* renamed from: a */
    public final int[] f35421a;

    /* renamed from: b */
    public final Object[] f35422b;

    /* renamed from: c */
    public final int f35423c;

    /* renamed from: d */
    public final int f35424d;

    /* renamed from: e */
    public final C14218ba f35425e;

    /* renamed from: f */
    public final boolean f35426f;

    /* renamed from: g */
    public final boolean f35427g;

    /* renamed from: h */
    public final boolean f35428h;

    /* renamed from: i */
    public final boolean f35429i;

    /* renamed from: j */
    public final int[] f35430j;

    /* renamed from: k */
    public final int f35431k;

    /* renamed from: l */
    public final int f35432l;

    /* renamed from: m */
    public final C14612p7 f35433m;

    /* renamed from: n */
    public final C14503ld f35434n;

    /* renamed from: o */
    public final C14436j0<?, ?> f35435o;

    /* renamed from: p */
    public final C14517m3<?> f35436p;

    /* renamed from: q */
    public final C14393h4 f35437q;

    public C14344fc(int[] iArr, Object[] objArr, int i, int i2, C14218ba baVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C14612p7 p7Var, C14503ld ldVar, C14436j0<?, ?> j0Var, C14517m3<?> m3Var, C14393h4 h4Var) {
        this.f35421a = iArr;
        this.f35422b = objArr;
        this.f35423c = i;
        this.f35424d = i2;
        this.f35427g = baVar instanceof C14359g4;
        this.f35428h = z;
        this.f35426f = m3Var != null && m3Var.mo35032h(baVar);
        this.f35429i = z2;
        this.f35430j = iArr2;
        this.f35431k = i3;
        this.f35432l = i4;
        this.f35433m = p7Var;
        this.f35434n = ldVar;
        this.f35435o = j0Var;
        this.f35436p = m3Var;
        this.f35425e = baVar;
        this.f35437q = h4Var;
    }

    /* renamed from: D */
    public static boolean m61650D(Object obj, int i, C14398h8 h8Var) {
        return h8Var.mo35211b(C14634q4.m63030T(obj, m61659f0(i)));
    }

    /* renamed from: E */
    public static <T> boolean m61651E(T t, long j) {
        return C14634q4.m63018H(t, j);
    }

    /* renamed from: G */
    public static <T> double m61652G(T t, long j) {
        return C14634q4.m63026P(t, j);
    }

    /* renamed from: N */
    public static <T> float m61653N(T t, long j) {
        return C14634q4.m63027Q(t, j);
    }

    /* renamed from: S */
    public static <T> int m61654S(T t, long j) {
        return C14634q4.m63028R(t, j);
    }

    /* renamed from: W */
    public static boolean m61655W(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: Y */
    public static List<?> m61656Y(Object obj, long j) {
        return (List) C14634q4.m63030T(obj, j);
    }

    /* renamed from: a0 */
    public static boolean m61657a0(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: d0 */
    public static <T> long m61658d0(T t, long j) {
        return C14634q4.m63029S(t, j);
    }

    /* renamed from: f0 */
    public static long m61659f0(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: g0 */
    public static <T> boolean m61660g0(T t, long j) {
        return ((Boolean) C14634q4.m63030T(t, j)).booleanValue();
    }

    /* renamed from: h0 */
    public static <T> double m61661h0(T t, long j) {
        return ((Double) C14634q4.m63030T(t, j)).doubleValue();
    }

    /* renamed from: j0 */
    public static <T> float m61662j0(T t, long j) {
        return ((Float) C14634q4.m63030T(t, j)).floatValue();
    }

    /* renamed from: l0 */
    public static int m61663l0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: m */
    public static <T> C14344fc<T> m61664m(C14847x3 x3Var, C14612p7 p7Var, C14503ld ldVar, C14436j0<?, ?> j0Var, C14517m3<?> m3Var, C14393h4 h4Var) {
        boolean z = x3Var.mo34491b() == C14773u8.PROTO3;
        C14402hb[] e = x3Var.mo36805e();
        if (e.length == 0) {
            int length = e.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e.length <= 0) {
                int[] d = x3Var.mo36804d();
                if (d == null) {
                    d = f35419r;
                }
                if (e.length <= 0) {
                    int[] iArr2 = f35419r;
                    int[] iArr3 = new int[(d.length + iArr2.length + iArr2.length)];
                    System.arraycopy(d, 0, iArr3, 0, d.length);
                    System.arraycopy(iArr2, 0, iArr3, d.length, iArr2.length);
                    System.arraycopy(iArr2, 0, iArr3, d.length + iArr2.length, iArr2.length);
                    return new C14344fc(iArr, objArr, 0, 0, x3Var.mo34490a(), z, true, iArr3, d.length, d.length + iArr2.length, p7Var, ldVar, j0Var, m3Var, h4Var);
                }
                C14402hb hbVar = e[0];
                throw null;
            }
            C14402hb hbVar2 = e[0];
            throw null;
        }
        C14402hb hbVar3 = e[0];
        throw null;
    }

    /* renamed from: m0 */
    public static <T> int m61665m0(T t, long j) {
        return ((Integer) C14634q4.m63030T(t, j)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0370  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.contentsquare.android.sdk.C14344fc<T> m61666n(com.contentsquare.android.sdk.C14172a5 r34, com.contentsquare.android.sdk.C14612p7 r35, com.contentsquare.android.sdk.C14503ld r36, com.contentsquare.android.sdk.C14436j0<?, ?> r37, com.contentsquare.android.sdk.C14517m3<?> r38, com.contentsquare.android.sdk.C14393h4 r39) {
        /*
            com.contentsquare.android.sdk.u8 r0 = r34.mo34491b()
            com.contentsquare.android.sdk.u8 r1 = com.contentsquare.android.sdk.C14773u8.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r34.mo34494e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0059
            int[] r6 = f35419r
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r15 = r4
            r13 = r6
            r4 = r16
            goto L_0x0161
        L_0x0059:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0078
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0065:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0075
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0065
        L_0x0075:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0078:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0097
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0084:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0094
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0084
        L_0x0094:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0097:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b6
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a3:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a3
        L_0x00b3:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b6:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d5
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c2:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c2
        L_0x00d2:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d5:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f4
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e1:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f1
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e1
        L_0x00f1:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f4:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0113
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0100:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0110
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x0100
        L_0x0110:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0113:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0134
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011f:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0130
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011f
        L_0x0130:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0134:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0157
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0140:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0152
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0140
        L_0x0152:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0157:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
        L_0x0161:
            sun.misc.Unsafe r6 = f35420s
            java.lang.Object[] r17 = r34.mo34493d()
            com.contentsquare.android.sdk.ba r18 = r34.mo34490a()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0180:
            if (r15 >= r1) goto L_0x03c3
            int r24 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x01a8
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0190:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r15 = r15 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0190
        L_0x01a2:
            int r3 = r3 << r24
            r15 = r15 | r3
            r3 = r26
            goto L_0x01aa
        L_0x01a8:
            r3 = r24
        L_0x01aa:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b8:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d1
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b8
        L_0x01d1:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01db
        L_0x01d7:
            r28 = r1
            r1 = r24
        L_0x01db:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e8
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e8:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0285
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0217
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x01fd:
            int r33 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0212
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r32
            r1 = r1 | r12
            int r32 = r32 + 13
            r14 = r33
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fd
        L_0x0212:
            int r12 = r14 << r32
            r1 = r1 | r12
            r14 = r33
        L_0x0217:
            int r12 = r5 + -51
            r32 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0237
            r14 = 17
            if (r12 != r14) goto L_0x0224
            goto L_0x0237
        L_0x0224:
            r14 = 12
            if (r12 != r14) goto L_0x0245
            if (r10 != 0) goto L_0x0245
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0243
        L_0x0237:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0243:
            r16 = r14
        L_0x0245:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0250
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0258
        L_0x0250:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m61669r(r2, r12)
            r17[r1] = r12
        L_0x0258:
            r14 = r8
            r33 = r9
            long r8 = r6.objectFieldOffset(r12)
            int r8 = (int) r8
            int r1 = r1 + 1
            r9 = r17[r1]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026b
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0273
        L_0x026b:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m61669r(r2, r9)
            r17[r1] = r9
        L_0x0273:
            r1 = r8
            long r8 = r6.objectFieldOffset(r9)
            int r8 = (int) r8
            r31 = r0
            r0 = r10
            r9 = 0
            r25 = 1
            r10 = r8
            r8 = r1
            r1 = r32
            goto L_0x0388
        L_0x0285:
            r14 = r8
            r33 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m61669r(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x02fd
            r12 = 17
            if (r5 != r12) goto L_0x029b
            goto L_0x02fd
        L_0x029b:
            r12 = 27
            if (r5 == r12) goto L_0x02ec
            r12 = 49
            if (r5 != r12) goto L_0x02a4
            goto L_0x02ec
        L_0x02a4:
            r12 = 12
            if (r5 == r12) goto L_0x02db
            r12 = 30
            if (r5 == r12) goto L_0x02db
            r12 = 44
            if (r5 != r12) goto L_0x02b1
            goto L_0x02db
        L_0x02b1:
            r12 = 50
            if (r5 != r12) goto L_0x02d1
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02d4
            int r22 = r22 + 1
            int r8 = r27 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02d1:
            r25 = 1
            goto L_0x030b
        L_0x02d4:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x030c
        L_0x02db:
            if (r10 != 0) goto L_0x02d1
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02fa
        L_0x02ec:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02fa:
            r12 = r27
            goto L_0x030c
        L_0x02fd:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x030b:
            r12 = r8
        L_0x030c:
            long r8 = r6.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x031c
            r9 = r25
            goto L_0x031d
        L_0x031c:
            r9 = 0
        L_0x031d:
            if (r9 == 0) goto L_0x0370
            r9 = 17
            if (r5 > r9) goto L_0x0370
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0348
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0332:
            int r29 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0344
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r26
            r1 = r1 | r9
            int r26 = r26 + 13
            r9 = r29
            goto L_0x0332
        L_0x0344:
            int r9 = r9 << r26
            r1 = r1 | r9
            goto L_0x034a
        L_0x0348:
            r29 = r9
        L_0x034a:
            int r9 = r4 * 2
            int r26 = r1 / 32
            int r9 = r9 + r26
            r12 = r17[r9]
            r31 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035b
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0363
        L_0x035b:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m61669r(r2, r12)
            r17[r9] = r12
        L_0x0363:
            r0 = r10
            long r9 = r6.objectFieldOffset(r12)
            int r9 = (int) r9
            int r1 = r1 % 32
            r10 = r9
            r9 = r1
            r1 = r29
            goto L_0x0378
        L_0x0370:
            r31 = r0
            r0 = r10
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r9
            r9 = 0
        L_0x0378:
            r12 = 18
            if (r5 < r12) goto L_0x0386
            r12 = 49
            if (r5 > r12) goto L_0x0386
            int r12 = r23 + 1
            r13[r23] = r8
            r23 = r12
        L_0x0386:
            r16 = r27
        L_0x0388:
            int r12 = r21 + 1
            r7[r21] = r15
            int r15 = r12 + 1
            r21 = r1
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0397
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0398
        L_0x0397:
            r1 = 0
        L_0x0398:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039f
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a0
        L_0x039f:
            r3 = 0
        L_0x03a0:
            r1 = r1 | r3
            int r3 = r5 << 20
            r1 = r1 | r3
            r1 = r1 | r8
            r7[r12] = r1
            int r1 = r15 + 1
            int r3 = r9 << 20
            r3 = r3 | r10
            r7[r15] = r3
            r10 = r0
            r8 = r14
            r15 = r21
            r14 = r24
            r12 = r30
            r0 = r31
            r9 = r33
            r5 = 55296(0xd800, float:7.7486E-41)
            r21 = r1
            r1 = r28
            goto L_0x0180
        L_0x03c3:
            r33 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            com.contentsquare.android.sdk.fc r1 = new com.contentsquare.android.sdk.fc
            com.contentsquare.android.sdk.ba r9 = r34.mo34490a()
            r2 = 0
            r4 = r1
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r33
            r11 = r2
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14344fc.m61666n(com.contentsquare.android.sdk.a5, com.contentsquare.android.sdk.p7, com.contentsquare.android.sdk.ld, com.contentsquare.android.sdk.j0, com.contentsquare.android.sdk.m3, com.contentsquare.android.sdk.h4):com.contentsquare.android.sdk.fc");
    }

    /* renamed from: o */
    public static <T> C14344fc<T> m61667o(Class<T> cls, C14700s8 s8Var, C14612p7 p7Var, C14503ld ldVar, C14436j0<?, ?> j0Var, C14517m3<?> m3Var, C14393h4 h4Var) {
        return s8Var instanceof C14172a5 ? m61666n((C14172a5) s8Var, p7Var, ldVar, j0Var, m3Var, h4Var) : m61664m((C14847x3) s8Var, p7Var, ldVar, j0Var, m3Var, h4Var);
    }

    /* renamed from: o0 */
    public static <T> long m61668o0(T t, long j) {
        return ((Long) C14634q4.m63030T(t, j)).longValue();
    }

    /* renamed from: r */
    public static Field m61669r(Class<?> cls, String str) {
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

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35191A(T r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.mo35225k0(r8)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r1 = (long) r1
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x00e2
            int r8 = r6.mo35227n0(r8)
            long r0 = m61659f0(r8)
            int r8 = m61663l0(r8)
            r2 = 0
            switch(r8) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00be;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00a2;
                case 6: goto L_0x009a;
                case 7: goto L_0x0095;
                case 8: goto L_0x0079;
                case 9: goto L_0x0071;
                case 10: goto L_0x0065;
                case 11: goto L_0x005d;
                case 12: goto L_0x0055;
                case 13: goto L_0x004d;
                case 14: goto L_0x0043;
                case 15: goto L_0x003b;
                case 16: goto L_0x0031;
                case 17: goto L_0x0029;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L_0x0029:
            java.lang.Object r7 = com.contentsquare.android.sdk.C14634q4.m63030T(r7, r0)
            if (r7 == 0) goto L_0x0030
            r4 = r5
        L_0x0030:
            return r4
        L_0x0031:
            long r7 = com.contentsquare.android.sdk.C14634q4.m63029S(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x003a
            r4 = r5
        L_0x003a:
            return r4
        L_0x003b:
            int r7 = com.contentsquare.android.sdk.C14634q4.m63028R(r7, r0)
            if (r7 == 0) goto L_0x0042
            r4 = r5
        L_0x0042:
            return r4
        L_0x0043:
            long r7 = com.contentsquare.android.sdk.C14634q4.m63029S(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x004c
            r4 = r5
        L_0x004c:
            return r4
        L_0x004d:
            int r7 = com.contentsquare.android.sdk.C14634q4.m63028R(r7, r0)
            if (r7 == 0) goto L_0x0054
            r4 = r5
        L_0x0054:
            return r4
        L_0x0055:
            int r7 = com.contentsquare.android.sdk.C14634q4.m63028R(r7, r0)
            if (r7 == 0) goto L_0x005c
            r4 = r5
        L_0x005c:
            return r4
        L_0x005d:
            int r7 = com.contentsquare.android.sdk.C14634q4.m63028R(r7, r0)
            if (r7 == 0) goto L_0x0064
            r4 = r5
        L_0x0064:
            return r4
        L_0x0065:
            com.contentsquare.android.sdk.t0 r8 = com.contentsquare.android.sdk.C14719t0.f36442b
            java.lang.Object r7 = com.contentsquare.android.sdk.C14634q4.m63030T(r7, r0)
        L_0x006b:
            boolean r7 = r8.equals(r7)
        L_0x006f:
            r7 = r7 ^ r5
            return r7
        L_0x0071:
            java.lang.Object r7 = com.contentsquare.android.sdk.C14634q4.m63030T(r7, r0)
            if (r7 == 0) goto L_0x0078
            r4 = r5
        L_0x0078:
            return r4
        L_0x0079:
            java.lang.Object r7 = com.contentsquare.android.sdk.C14634q4.m63030T(r7, r0)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x0088
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.isEmpty()
            goto L_0x006f
        L_0x0088:
            boolean r8 = r7 instanceof com.contentsquare.android.sdk.C14719t0
            if (r8 == 0) goto L_0x008f
            com.contentsquare.android.sdk.t0 r8 = com.contentsquare.android.sdk.C14719t0.f36442b
            goto L_0x006b
        L_0x008f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L_0x0095:
            boolean r7 = com.contentsquare.android.sdk.C14634q4.m63018H(r7, r0)
            return r7
        L_0x009a:
            int r7 = com.contentsquare.android.sdk.C14634q4.m63028R(r7, r0)
            if (r7 == 0) goto L_0x00a1
            r4 = r5
        L_0x00a1:
            return r4
        L_0x00a2:
            long r7 = com.contentsquare.android.sdk.C14634q4.m63029S(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00ab
            r4 = r5
        L_0x00ab:
            return r4
        L_0x00ac:
            int r7 = com.contentsquare.android.sdk.C14634q4.m63028R(r7, r0)
            if (r7 == 0) goto L_0x00b3
            r4 = r5
        L_0x00b3:
            return r4
        L_0x00b4:
            long r7 = com.contentsquare.android.sdk.C14634q4.m63029S(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00bd
            r4 = r5
        L_0x00bd:
            return r4
        L_0x00be:
            long r7 = com.contentsquare.android.sdk.C14634q4.m63029S(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00c7
            r4 = r5
        L_0x00c7:
            return r4
        L_0x00c8:
            float r7 = com.contentsquare.android.sdk.C14634q4.m63027Q(r7, r0)
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            if (r7 == 0) goto L_0x00d3
            r4 = r5
        L_0x00d3:
            return r4
        L_0x00d4:
            double r7 = com.contentsquare.android.sdk.C14634q4.m63026P(r7, r0)
            long r7 = java.lang.Double.doubleToRawLongBits(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00e1
            r4 = r5
        L_0x00e1:
            return r4
        L_0x00e2:
            int r8 = r0 >>> 20
            int r8 = r5 << r8
            int r7 = com.contentsquare.android.sdk.C14634q4.m63028R(r7, r1)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x00ee
            r4 = r5
        L_0x00ee:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14344fc.mo35191A(java.lang.Object, int):boolean");
    }

    /* renamed from: B */
    public final <N> boolean mo35192B(Object obj, int i, int i2) {
        List list = (List) C14634q4.m63030T(obj, m61659f0(i));
        if (list.isEmpty()) {
            return true;
        }
        C14398h8 O = mo35201O(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!O.mo35211b(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public final boolean mo35193C(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? mo35191A(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: F */
    public final boolean mo35194F(T t, T t2, int i) {
        return mo35191A(t, i) == mo35191A(t2, i);
    }

    /* renamed from: H */
    public final Object mo35195H(int i) {
        return this.f35422b[(i / 3) * 2];
    }

    /* renamed from: I */
    public final void mo35196I(T t, int i) {
        int k0 = mo35225k0(i);
        long j = (long) (1048575 & k0);
        if (j != 1048575) {
            C14634q4.m63040j(t, j, (1 << (k0 >>> 20)) | C14634q4.m63028R(t, j));
        }
    }

    /* renamed from: J */
    public final void mo35197J(Object obj, int i, C14475k6 k6Var) {
        if (m61655W(i)) {
            k6Var.mo34603p1(this.f35434n.mo35829e(obj, m61659f0(i)));
        } else {
            k6Var.mo34599n1(this.f35434n.mo35829e(obj, m61659f0(i)));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x046a, code lost:
        r10 = r10 + 3;
        r8 = 1048575;
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35198K(T r18, com.contentsquare.android.sdk.C14782uf r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f35426f
            if (r3 == 0) goto L_0x0021
            com.contentsquare.android.sdk.m3<?> r3 = r0.f35436p
            com.contentsquare.android.sdk.cc r3 = r3.mo35026b(r1)
            boolean r5 = r3.mo34871t()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo34874w()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f35421a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f35420s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x002e:
            if (r10 >= r6) goto L_0x0471
            int r13 = r0.mo35227n0(r10)
            int r14 = r0.mo35212b0(r10)
            int r15 = m61663l0(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0056
            int[] r4 = r0.f35421a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0050
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0050:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r5 == 0) goto L_0x0075
            com.contentsquare.android.sdk.m3<?> r9 = r0.f35436p
            int r9 = r9.mo35025a(r5)
            if (r9 > r14) goto L_0x0075
            com.contentsquare.android.sdk.m3<?> r9 = r0.f35436p
            r9.mo35031g(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0057
        L_0x0073:
            r5 = 0
            goto L_0x0057
        L_0x0075:
            long r8 = m61659f0(r13)
            switch(r15) {
                case 0: goto L_0x045f;
                case 1: goto L_0x0453;
                case 2: goto L_0x0447;
                case 3: goto L_0x043b;
                case 4: goto L_0x042f;
                case 5: goto L_0x0423;
                case 6: goto L_0x0417;
                case 7: goto L_0x040b;
                case 8: goto L_0x03ff;
                case 9: goto L_0x03ee;
                case 10: goto L_0x03df;
                case 11: goto L_0x03d2;
                case 12: goto L_0x03c5;
                case 13: goto L_0x03b8;
                case 14: goto L_0x03ab;
                case 15: goto L_0x039e;
                case 16: goto L_0x0391;
                case 17: goto L_0x0380;
                case 18: goto L_0x0370;
                case 19: goto L_0x0360;
                case 20: goto L_0x0350;
                case 21: goto L_0x0340;
                case 22: goto L_0x0330;
                case 23: goto L_0x0320;
                case 24: goto L_0x0310;
                case 25: goto L_0x0300;
                case 26: goto L_0x02f0;
                case 27: goto L_0x02de;
                case 28: goto L_0x02d0;
                case 29: goto L_0x02c0;
                case 30: goto L_0x02b0;
                case 31: goto L_0x02a0;
                case 32: goto L_0x0290;
                case 33: goto L_0x0280;
                case 34: goto L_0x0270;
                case 35: goto L_0x0260;
                case 36: goto L_0x0250;
                case 37: goto L_0x0240;
                case 38: goto L_0x0230;
                case 39: goto L_0x0220;
                case 40: goto L_0x0210;
                case 41: goto L_0x0200;
                case 42: goto L_0x01f0;
                case 43: goto L_0x01e0;
                case 44: goto L_0x01d0;
                case 45: goto L_0x01c0;
                case 46: goto L_0x01b0;
                case 47: goto L_0x01a0;
                case 48: goto L_0x0190;
                case 49: goto L_0x017d;
                case 50: goto L_0x0174;
                case 51: goto L_0x0165;
                case 52: goto L_0x0156;
                case 53: goto L_0x0147;
                case 54: goto L_0x0138;
                case 55: goto L_0x0129;
                case 56: goto L_0x011a;
                case 57: goto L_0x010b;
                case 58: goto L_0x00fc;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00ea;
                case 61: goto L_0x00e1;
                case 62: goto L_0x00d2;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b4;
                case 65: goto L_0x00a5;
                case 66: goto L_0x0096;
                case 67: goto L_0x0087;
                case 68: goto L_0x007e;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x02fd
        L_0x007e:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            r13 = 0
            goto L_0x0384
        L_0x0087:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            long r8 = m61668o0(r1, r8)
            r2.mo35442i(r14, r8)
            goto L_0x02fd
        L_0x0096:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            int r4 = m61665m0(r1, r8)
            r2.mo35448o(r14, r4)
            goto L_0x02fd
        L_0x00a5:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            long r8 = m61668o0(r1, r8)
            r2.mo35446m(r14, r8)
            goto L_0x02fd
        L_0x00b4:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            int r4 = m61665m0(r1, r8)
            r2.mo35445l(r14, r4)
            goto L_0x02fd
        L_0x00c3:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            int r4 = m61665m0(r1, r8)
            r2.mo35428L(r14, r4)
            goto L_0x02fd
        L_0x00d2:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            int r4 = m61665m0(r1, r8)
            r2.mo35441h(r14, r4)
            goto L_0x02fd
        L_0x00e1:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            r13 = 0
            goto L_0x03e3
        L_0x00ea:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            r13 = 0
            goto L_0x03f2
        L_0x00f3:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            r13 = 0
            goto L_0x0403
        L_0x00fc:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            boolean r4 = m61660g0(r1, r8)
            r2.mo35427K(r14, r4)
            goto L_0x02fd
        L_0x010b:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            int r4 = m61665m0(r1, r8)
            r2.mo35437d(r14, r4)
            goto L_0x02fd
        L_0x011a:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            long r8 = m61668o0(r1, r8)
            r2.mo35438e(r14, r8)
            goto L_0x02fd
        L_0x0129:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            int r4 = m61665m0(r1, r8)
            r2.mo35424H(r14, r4)
            goto L_0x02fd
        L_0x0138:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            long r8 = m61668o0(r1, r8)
            r2.mo35425I(r14, r8)
            goto L_0x02fd
        L_0x0147:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            long r8 = m61668o0(r1, r8)
            r2.mo35429M(r14, r8)
            goto L_0x02fd
        L_0x0156:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            float r4 = m61662j0(r1, r8)
            r2.mo35423G(r14, r4)
            goto L_0x02fd
        L_0x0165:
            boolean r4 = r0.mo35203Q(r1, r14, r10)
            if (r4 == 0) goto L_0x02fd
            double r8 = m61661h0(r1, r8)
            r2.mo35422F(r14, r8)
            goto L_0x02fd
        L_0x0174:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo35233v(r2, r14, r4, r10)
            goto L_0x02fd
        L_0x017d:
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.h8 r9 = r0.mo35201O(r10)
            com.contentsquare.android.sdk.C14646q9.m63159l(r4, r8, r2, r9)
            goto L_0x02fd
        L_0x0190:
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.contentsquare.android.sdk.C14646q9.m63148c0(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x01a0:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63146b0(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x01b0:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63144a0(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x01c0:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63140X(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x01d0:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63120D(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x01e0:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63150d0(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x01f0:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63160m(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x0200:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63124H(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x0210:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63128L(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x0220:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63134R(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x0230:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63152e0(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x0240:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63137U(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x0250:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63131O(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x0260:
            r13 = 1
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63173z(r4, r8, r2, r13)
            goto L_0x02fd
        L_0x0270:
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.contentsquare.android.sdk.C14646q9.m63148c0(r4, r8, r2, r13)
            goto L_0x046a
        L_0x0280:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63146b0(r4, r8, r2, r13)
            goto L_0x046a
        L_0x0290:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63144a0(r4, r8, r2, r13)
            goto L_0x046a
        L_0x02a0:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63140X(r4, r8, r2, r13)
            goto L_0x046a
        L_0x02b0:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63120D(r4, r8, r2, r13)
            goto L_0x046a
        L_0x02c0:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63150d0(r4, r8, r2, r13)
            goto L_0x046a
        L_0x02d0:
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63158k(r4, r8, r2)
            goto L_0x02fd
        L_0x02de:
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.h8 r9 = r0.mo35201O(r10)
            com.contentsquare.android.sdk.C14646q9.m63172y(r4, r8, r2, r9)
            goto L_0x02fd
        L_0x02f0:
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63171x(r4, r8, r2)
        L_0x02fd:
            r13 = 0
            goto L_0x046a
        L_0x0300:
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.contentsquare.android.sdk.C14646q9.m63160m(r4, r8, r2, r13)
            goto L_0x046a
        L_0x0310:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63124H(r4, r8, r2, r13)
            goto L_0x046a
        L_0x0320:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63128L(r4, r8, r2, r13)
            goto L_0x046a
        L_0x0330:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63134R(r4, r8, r2, r13)
            goto L_0x046a
        L_0x0340:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63152e0(r4, r8, r2, r13)
            goto L_0x046a
        L_0x0350:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63137U(r4, r8, r2, r13)
            goto L_0x046a
        L_0x0360:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63131O(r4, r8, r2, r13)
            goto L_0x046a
        L_0x0370:
            r13 = 0
            int r4 = r0.mo35212b0(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.contentsquare.android.sdk.C14646q9.m63173z(r4, r8, r2, r13)
            goto L_0x046a
        L_0x0380:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
        L_0x0384:
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.contentsquare.android.sdk.h8 r8 = r0.mo35201O(r10)
            r2.mo35443j(r14, r4, r8)
            goto L_0x046a
        L_0x0391:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            long r8 = r7.getLong(r1, r8)
            r2.mo35442i(r14, r8)
            goto L_0x046a
        L_0x039e:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            int r4 = r7.getInt(r1, r8)
            r2.mo35448o(r14, r4)
            goto L_0x046a
        L_0x03ab:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            long r8 = r7.getLong(r1, r8)
            r2.mo35446m(r14, r8)
            goto L_0x046a
        L_0x03b8:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            int r4 = r7.getInt(r1, r8)
            r2.mo35445l(r14, r4)
            goto L_0x046a
        L_0x03c5:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            int r4 = r7.getInt(r1, r8)
            r2.mo35428L(r14, r4)
            goto L_0x046a
        L_0x03d2:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            int r4 = r7.getInt(r1, r8)
            r2.mo35441h(r14, r4)
            goto L_0x046a
        L_0x03df:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
        L_0x03e3:
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.contentsquare.android.sdk.t0 r4 = (com.contentsquare.android.sdk.C14719t0) r4
            r2.mo35453t(r14, r4)
            goto L_0x046a
        L_0x03ee:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
        L_0x03f2:
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.contentsquare.android.sdk.h8 r8 = r0.mo35201O(r10)
            r2.mo35439f(r14, r4, r8)
            goto L_0x046a
        L_0x03ff:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
        L_0x0403:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo35230s(r14, r4, r2)
            goto L_0x046a
        L_0x040b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            boolean r4 = m61651E(r1, r8)
            r2.mo35427K(r14, r4)
            goto L_0x046a
        L_0x0417:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            int r4 = r7.getInt(r1, r8)
            r2.mo35437d(r14, r4)
            goto L_0x046a
        L_0x0423:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            long r8 = r7.getLong(r1, r8)
            r2.mo35438e(r14, r8)
            goto L_0x046a
        L_0x042f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            int r4 = r7.getInt(r1, r8)
            r2.mo35424H(r14, r4)
            goto L_0x046a
        L_0x043b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            long r8 = r7.getLong(r1, r8)
            r2.mo35425I(r14, r8)
            goto L_0x046a
        L_0x0447:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            long r8 = r7.getLong(r1, r8)
            r2.mo35429M(r14, r8)
            goto L_0x046a
        L_0x0453:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            float r4 = m61653N(r1, r8)
            r2.mo35423G(r14, r4)
            goto L_0x046a
        L_0x045f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x046a
            double r8 = m61652G(r1, r8)
            r2.mo35422F(r14, r8)
        L_0x046a:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002e
        L_0x0471:
            if (r5 == 0) goto L_0x0488
            com.contentsquare.android.sdk.m3<?> r4 = r0.f35436p
            r4.mo35031g(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0471
        L_0x0486:
            r5 = 0
            goto L_0x0471
        L_0x0488:
            com.contentsquare.android.sdk.j0<?, ?> r3 = r0.f35435o
            r0.mo35232u(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14344fc.mo35198K(java.lang.Object, com.contentsquare.android.sdk.uf):void");
    }

    /* renamed from: L */
    public final boolean mo35199L(T t, int i, int i2) {
        if (this.f35437q.mo35489h(C14634q4.m63030T(t, m61659f0(i))).isEmpty()) {
            return true;
        }
        this.f35437q.mo35488g(mo35195H(i2));
        throw null;
    }

    /* renamed from: M */
    public final boolean mo35200M(T t, T t2, int i) {
        int n0 = mo35227n0(i);
        long f0 = m61659f0(n0);
        switch (m61663l0(n0)) {
            case 0:
                return mo35194F(t, t2, i) && Double.doubleToLongBits(C14634q4.m63026P(t, f0)) == Double.doubleToLongBits(C14634q4.m63026P(t2, f0));
            case 1:
                return mo35194F(t, t2, i) && Float.floatToIntBits(C14634q4.m63027Q(t, f0)) == Float.floatToIntBits(C14634q4.m63027Q(t2, f0));
            case 2:
                return mo35194F(t, t2, i) && C14634q4.m63029S(t, f0) == C14634q4.m63029S(t2, f0);
            case 3:
                return mo35194F(t, t2, i) && C14634q4.m63029S(t, f0) == C14634q4.m63029S(t2, f0);
            case 4:
                return mo35194F(t, t2, i) && C14634q4.m63028R(t, f0) == C14634q4.m63028R(t2, f0);
            case 5:
                return mo35194F(t, t2, i) && C14634q4.m63029S(t, f0) == C14634q4.m63029S(t2, f0);
            case 6:
                return mo35194F(t, t2, i) && C14634q4.m63028R(t, f0) == C14634q4.m63028R(t2, f0);
            case 7:
                return mo35194F(t, t2, i) && C14634q4.m63018H(t, f0) == C14634q4.m63018H(t2, f0);
            case 8:
                return mo35194F(t, t2, i) && C14646q9.m63165r(C14634q4.m63030T(t, f0), C14634q4.m63030T(t2, f0));
            case 9:
                return mo35194F(t, t2, i) && C14646q9.m63165r(C14634q4.m63030T(t, f0), C14634q4.m63030T(t2, f0));
            case 10:
                return mo35194F(t, t2, i) && C14646q9.m63165r(C14634q4.m63030T(t, f0), C14634q4.m63030T(t2, f0));
            case 11:
                return mo35194F(t, t2, i) && C14634q4.m63028R(t, f0) == C14634q4.m63028R(t2, f0);
            case 12:
                return mo35194F(t, t2, i) && C14634q4.m63028R(t, f0) == C14634q4.m63028R(t2, f0);
            case 13:
                return mo35194F(t, t2, i) && C14634q4.m63028R(t, f0) == C14634q4.m63028R(t2, f0);
            case 14:
                return mo35194F(t, t2, i) && C14634q4.m63029S(t, f0) == C14634q4.m63029S(t2, f0);
            case 15:
                return mo35194F(t, t2, i) && C14634q4.m63028R(t, f0) == C14634q4.m63028R(t2, f0);
            case 16:
                return mo35194F(t, t2, i) && C14634q4.m63029S(t, f0) == C14634q4.m63029S(t2, f0);
            case 17:
                return mo35194F(t, t2, i) && C14646q9.m63165r(C14634q4.m63030T(t, f0), C14634q4.m63030T(t2, f0));
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
            case 50:
                return C14646q9.m63165r(C14634q4.m63030T(t, f0), C14634q4.m63030T(t2, f0));
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
                return mo35204R(t, t2, i) && C14646q9.m63165r(C14634q4.m63030T(t, f0), C14634q4.m63030T(t2, f0));
            default:
                return true;
        }
    }

    /* renamed from: O */
    public final C14398h8 mo35201O(int i) {
        int i2 = (i / 3) * 2;
        C14398h8 h8Var = (C14398h8) this.f35422b[i2];
        if (h8Var != null) {
            return h8Var;
        }
        C14398h8 a = C14599od.m62876d().mo36104a((Class) this.f35422b[i2 + 1]);
        this.f35422b[i2] = a;
        return a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d0, code lost:
        r14.mo35443j(r7, com.contentsquare.android.sdk.C14634q4.m63030T(r13, m61659f0(r6)), mo35201O(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03ef, code lost:
        r14.mo35442i(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0402, code lost:
        r14.mo35448o(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0415, code lost:
        r14.mo35446m(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0428, code lost:
        r14.mo35445l(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x043b, code lost:
        r14.mo35428L(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x044e, code lost:
        r14.mo35441h(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0459, code lost:
        r14.mo35453t(r7, (com.contentsquare.android.sdk.C14719t0) com.contentsquare.android.sdk.C14634q4.m63030T(r13, m61659f0(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x046e, code lost:
        r14.mo35439f(r7, com.contentsquare.android.sdk.C14634q4.m63030T(r13, m61659f0(r6)), mo35201O(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0485, code lost:
        mo35230s(r7, com.contentsquare.android.sdk.C14634q4.m63030T(r13, m61659f0(r6)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a0, code lost:
        r14.mo35427K(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b3, code lost:
        r14.mo35437d(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04c5, code lost:
        r14.mo35438e(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04d7, code lost:
        r14.mo35424H(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04e9, code lost:
        r14.mo35425I(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04fb, code lost:
        r14.mo35429M(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x050d, code lost:
        r14.mo35423G(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x051f, code lost:
        r14.mo35422F(r7, r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35202P(T r13, com.contentsquare.android.sdk.C14782uf r14) {
        /*
            r12 = this;
            boolean r0 = r12.f35426f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.contentsquare.android.sdk.m3<?> r0 = r12.f35436p
            com.contentsquare.android.sdk.cc r0 = r0.mo35026b(r13)
            boolean r2 = r0.mo34871t()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo34874w()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f35421a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0526
            int r6 = r12.mo35227n0(r5)
            int r7 = r12.mo35212b0(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.contentsquare.android.sdk.m3<?> r8 = r12.f35436p
            int r8 = r8.mo35025a(r2)
            if (r8 > r7) goto L_0x004b
            com.contentsquare.android.sdk.m3<?> r8 = r12.f35436p
            r8.mo35031g(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m61663l0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0511;
                case 1: goto L_0x04ff;
                case 2: goto L_0x04ed;
                case 3: goto L_0x04db;
                case 4: goto L_0x04c9;
                case 5: goto L_0x04b7;
                case 6: goto L_0x04a5;
                case 7: goto L_0x0492;
                case 8: goto L_0x047f;
                case 9: goto L_0x0468;
                case 10: goto L_0x0453;
                case 11: goto L_0x0440;
                case 12: goto L_0x042d;
                case 13: goto L_0x041a;
                case 14: goto L_0x0407;
                case 15: goto L_0x03f4;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03ca;
                case 18: goto L_0x03b7;
                case 19: goto L_0x03a4;
                case 20: goto L_0x0391;
                case 21: goto L_0x037e;
                case 22: goto L_0x036b;
                case 23: goto L_0x0358;
                case 24: goto L_0x0345;
                case 25: goto L_0x0332;
                case 26: goto L_0x031f;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f5;
                case 29: goto L_0x02e2;
                case 30: goto L_0x02cf;
                case 31: goto L_0x02bc;
                case 32: goto L_0x02a9;
                case 33: goto L_0x0296;
                case 34: goto L_0x0283;
                case 35: goto L_0x0270;
                case 36: goto L_0x025d;
                case 37: goto L_0x024a;
                case 38: goto L_0x0237;
                case 39: goto L_0x0224;
                case 40: goto L_0x0211;
                case 41: goto L_0x01fe;
                case 42: goto L_0x01eb;
                case 43: goto L_0x01d8;
                case 44: goto L_0x01c5;
                case 45: goto L_0x01b2;
                case 46: goto L_0x019f;
                case 47: goto L_0x018c;
                case 48: goto L_0x0179;
                case 49: goto L_0x0162;
                case 50: goto L_0x0155;
                case 51: goto L_0x0145;
                case 52: goto L_0x0135;
                case 53: goto L_0x0125;
                case 54: goto L_0x0115;
                case 55: goto L_0x0105;
                case 56: goto L_0x00f5;
                case 57: goto L_0x00e5;
                case 58: goto L_0x00d5;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00bd;
                case 62: goto L_0x00ad;
                case 63: goto L_0x009d;
                case 64: goto L_0x008d;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0522
        L_0x0055:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x03d0
        L_0x005d:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            long r8 = m61668o0(r13, r8)
            goto L_0x03ef
        L_0x006d:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61665m0(r13, r8)
            goto L_0x0402
        L_0x007d:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            long r8 = m61668o0(r13, r8)
            goto L_0x0415
        L_0x008d:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61665m0(r13, r8)
            goto L_0x0428
        L_0x009d:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61665m0(r13, r8)
            goto L_0x043b
        L_0x00ad:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61665m0(r13, r8)
            goto L_0x044e
        L_0x00bd:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x0459
        L_0x00c5:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x046e
        L_0x00cd:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x0485
        L_0x00d5:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            boolean r6 = m61660g0(r13, r8)
            goto L_0x04a0
        L_0x00e5:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61665m0(r13, r8)
            goto L_0x04b3
        L_0x00f5:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            long r8 = m61668o0(r13, r8)
            goto L_0x04c5
        L_0x0105:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61665m0(r13, r8)
            goto L_0x04d7
        L_0x0115:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            long r8 = m61668o0(r13, r8)
            goto L_0x04e9
        L_0x0125:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            long r8 = m61668o0(r13, r8)
            goto L_0x04fb
        L_0x0135:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            float r6 = m61662j0(r13, r8)
            goto L_0x050d
        L_0x0145:
            boolean r8 = r12.mo35203Q(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            double r8 = m61661h0(r13, r8)
            goto L_0x051f
        L_0x0155:
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            r12.mo35233v(r14, r7, r6, r5)
            goto L_0x0522
        L_0x0162:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.h8 r8 = r12.mo35201O(r5)
            com.contentsquare.android.sdk.C14646q9.m63159l(r7, r6, r14, r8)
            goto L_0x0522
        L_0x0179:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63148c0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x018c:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63146b0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x019f:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63144a0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01b2:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63140X(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01c5:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63120D(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01d8:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63150d0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01eb:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63160m(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01fe:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63124H(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0211:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63128L(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0224:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63134R(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0237:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63152e0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x024a:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63137U(r7, r6, r14, r9)
            goto L_0x0522
        L_0x025d:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63131O(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0270:
            int r7 = r12.mo35212b0(r5)
            long r10 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63173z(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0283:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63148c0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0296:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63146b0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02a9:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63144a0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02bc:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63140X(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02cf:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63120D(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02e2:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63150d0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02f5:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63158k(r7, r6, r14)
            goto L_0x0522
        L_0x0308:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.h8 r8 = r12.mo35201O(r5)
            com.contentsquare.android.sdk.C14646q9.m63172y(r7, r6, r14, r8)
            goto L_0x0522
        L_0x031f:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63171x(r7, r6, r14)
            goto L_0x0522
        L_0x0332:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63160m(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0345:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63124H(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0358:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63128L(r7, r6, r14, r4)
            goto L_0x0522
        L_0x036b:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63134R(r7, r6, r14, r4)
            goto L_0x0522
        L_0x037e:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63152e0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0391:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63137U(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03a4:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63131O(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03b7:
            int r7 = r12.mo35212b0(r5)
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.contentsquare.android.sdk.C14646q9.m63173z(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03ca:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x03d0:
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            com.contentsquare.android.sdk.h8 r8 = r12.mo35201O(r5)
            r14.mo35443j(r7, r6, r8)
            goto L_0x0522
        L_0x03e1:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            long r8 = m61658d0(r13, r8)
        L_0x03ef:
            r14.mo35442i(r7, r8)
            goto L_0x0522
        L_0x03f4:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61654S(r13, r8)
        L_0x0402:
            r14.mo35448o(r7, r6)
            goto L_0x0522
        L_0x0407:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            long r8 = m61658d0(r13, r8)
        L_0x0415:
            r14.mo35446m(r7, r8)
            goto L_0x0522
        L_0x041a:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61654S(r13, r8)
        L_0x0428:
            r14.mo35445l(r7, r6)
            goto L_0x0522
        L_0x042d:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61654S(r13, r8)
        L_0x043b:
            r14.mo35428L(r7, r6)
            goto L_0x0522
        L_0x0440:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61654S(r13, r8)
        L_0x044e:
            r14.mo35441h(r7, r6)
            goto L_0x0522
        L_0x0453:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x0459:
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            com.contentsquare.android.sdk.t0 r6 = (com.contentsquare.android.sdk.C14719t0) r6
            r14.mo35453t(r7, r6)
            goto L_0x0522
        L_0x0468:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x046e:
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            com.contentsquare.android.sdk.h8 r8 = r12.mo35201O(r5)
            r14.mo35439f(r7, r6, r8)
            goto L_0x0522
        L_0x047f:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x0485:
            long r8 = m61659f0(r6)
            java.lang.Object r6 = com.contentsquare.android.sdk.C14634q4.m63030T(r13, r8)
            r12.mo35230s(r7, r6, r14)
            goto L_0x0522
        L_0x0492:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            boolean r6 = m61651E(r13, r8)
        L_0x04a0:
            r14.mo35427K(r7, r6)
            goto L_0x0522
        L_0x04a5:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61654S(r13, r8)
        L_0x04b3:
            r14.mo35437d(r7, r6)
            goto L_0x0522
        L_0x04b7:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            long r8 = m61658d0(r13, r8)
        L_0x04c5:
            r14.mo35438e(r7, r8)
            goto L_0x0522
        L_0x04c9:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            int r6 = m61654S(r13, r8)
        L_0x04d7:
            r14.mo35424H(r7, r6)
            goto L_0x0522
        L_0x04db:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            long r8 = m61658d0(r13, r8)
        L_0x04e9:
            r14.mo35425I(r7, r8)
            goto L_0x0522
        L_0x04ed:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            long r8 = m61658d0(r13, r8)
        L_0x04fb:
            r14.mo35429M(r7, r8)
            goto L_0x0522
        L_0x04ff:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            float r6 = m61653N(r13, r8)
        L_0x050d:
            r14.mo35423G(r7, r6)
            goto L_0x0522
        L_0x0511:
            boolean r8 = r12.mo35191A(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m61659f0(r6)
            double r8 = m61652G(r13, r8)
        L_0x051f:
            r14.mo35422F(r7, r8)
        L_0x0522:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0526:
            if (r2 == 0) goto L_0x053c
            com.contentsquare.android.sdk.m3<?> r3 = r12.f35436p
            r3.mo35031g(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x053a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0526
        L_0x053a:
            r2 = r1
            goto L_0x0526
        L_0x053c:
            com.contentsquare.android.sdk.j0<?, ?> r0 = r12.f35435o
            r12.mo35232u(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14344fc.mo35202P(java.lang.Object, com.contentsquare.android.sdk.uf):void");
    }

    /* renamed from: Q */
    public final boolean mo35203Q(T t, int i, int i2) {
        return C14634q4.m63028R(t, (long) (mo35225k0(i2) & 1048575)) == i;
    }

    /* renamed from: R */
    public final boolean mo35204R(T t, T t2, int i) {
        long k0 = (long) (mo35225k0(i) & 1048575);
        return C14634q4.m63028R(t, k0) == C14634q4.m63028R(t2, k0);
    }

    /* renamed from: T */
    public final void mo35205T(T t, int i, int i2) {
        C14634q4.m63040j(t, (long) (mo35225k0(i2) & 1048575), i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d6, code lost:
        r12.mo35443j(r5, com.contentsquare.android.sdk.C14634q4.m63030T(r11, m61659f0(r4)), mo35201O(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03f5, code lost:
        r12.mo35442i(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0408, code lost:
        r12.mo35448o(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x041b, code lost:
        r12.mo35446m(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x042e, code lost:
        r12.mo35445l(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0441, code lost:
        r12.mo35428L(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0454, code lost:
        r12.mo35441h(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x045f, code lost:
        r12.mo35453t(r5, (com.contentsquare.android.sdk.C14719t0) com.contentsquare.android.sdk.C14634q4.m63030T(r11, m61659f0(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0474, code lost:
        r12.mo35439f(r5, com.contentsquare.android.sdk.C14634q4.m63030T(r11, m61659f0(r4)), mo35201O(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x048b, code lost:
        mo35230s(r5, com.contentsquare.android.sdk.C14634q4.m63030T(r11, m61659f0(r4)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a6, code lost:
        r12.mo35427K(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b9, code lost:
        r12.mo35437d(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04cb, code lost:
        r12.mo35438e(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04dd, code lost:
        r12.mo35424H(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04ef, code lost:
        r12.mo35425I(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0501, code lost:
        r12.mo35429M(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0513, code lost:
        r12.mo35423G(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0525, code lost:
        r12.mo35422F(r5, r6);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35206U(T r11, com.contentsquare.android.sdk.C14782uf r12) {
        /*
            r10 = this;
            com.contentsquare.android.sdk.j0<?, ?> r0 = r10.f35435o
            r10.mo35232u(r0, r11, r12)
            boolean r0 = r10.f35426f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.contentsquare.android.sdk.m3<?> r0 = r10.f35436p
            com.contentsquare.android.sdk.cc r0 = r0.mo35026b(r11)
            boolean r2 = r0.mo34871t()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo34865j()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f35421a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x052c
            int r4 = r10.mo35227n0(r3)
            int r5 = r10.mo35212b0(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.contentsquare.android.sdk.m3<?> r6 = r10.f35436p
            int r6 = r6.mo35025a(r2)
            if (r6 <= r5) goto L_0x0050
            com.contentsquare.android.sdk.m3<?> r6 = r10.f35436p
            r6.mo35031g(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m61663l0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0517;
                case 1: goto L_0x0505;
                case 2: goto L_0x04f3;
                case 3: goto L_0x04e1;
                case 4: goto L_0x04cf;
                case 5: goto L_0x04bd;
                case 6: goto L_0x04ab;
                case 7: goto L_0x0498;
                case 8: goto L_0x0485;
                case 9: goto L_0x046e;
                case 10: goto L_0x0459;
                case 11: goto L_0x0446;
                case 12: goto L_0x0433;
                case 13: goto L_0x0420;
                case 14: goto L_0x040d;
                case 15: goto L_0x03fa;
                case 16: goto L_0x03e7;
                case 17: goto L_0x03d0;
                case 18: goto L_0x03bd;
                case 19: goto L_0x03aa;
                case 20: goto L_0x0397;
                case 21: goto L_0x0384;
                case 22: goto L_0x0371;
                case 23: goto L_0x035e;
                case 24: goto L_0x034b;
                case 25: goto L_0x0338;
                case 26: goto L_0x0325;
                case 27: goto L_0x030e;
                case 28: goto L_0x02fb;
                case 29: goto L_0x02e8;
                case 30: goto L_0x02d5;
                case 31: goto L_0x02c2;
                case 32: goto L_0x02af;
                case 33: goto L_0x029c;
                case 34: goto L_0x0289;
                case 35: goto L_0x0276;
                case 36: goto L_0x0263;
                case 37: goto L_0x0250;
                case 38: goto L_0x023d;
                case 39: goto L_0x022a;
                case 40: goto L_0x0217;
                case 41: goto L_0x0204;
                case 42: goto L_0x01f1;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cb;
                case 45: goto L_0x01b8;
                case 46: goto L_0x01a5;
                case 47: goto L_0x0192;
                case 48: goto L_0x017f;
                case 49: goto L_0x0168;
                case 50: goto L_0x015b;
                case 51: goto L_0x014b;
                case 52: goto L_0x013b;
                case 53: goto L_0x012b;
                case 54: goto L_0x011b;
                case 55: goto L_0x010b;
                case 56: goto L_0x00fb;
                case 57: goto L_0x00eb;
                case 58: goto L_0x00db;
                case 59: goto L_0x00d3;
                case 60: goto L_0x00cb;
                case 61: goto L_0x00c3;
                case 62: goto L_0x00b3;
                case 63: goto L_0x00a3;
                case 64: goto L_0x0093;
                case 65: goto L_0x0083;
                case 66: goto L_0x0073;
                case 67: goto L_0x0063;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0528
        L_0x005b:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x03d6
        L_0x0063:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            long r6 = m61668o0(r11, r6)
            goto L_0x03f5
        L_0x0073:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61665m0(r11, r6)
            goto L_0x0408
        L_0x0083:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            long r6 = m61668o0(r11, r6)
            goto L_0x041b
        L_0x0093:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61665m0(r11, r6)
            goto L_0x042e
        L_0x00a3:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61665m0(r11, r6)
            goto L_0x0441
        L_0x00b3:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61665m0(r11, r6)
            goto L_0x0454
        L_0x00c3:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x045f
        L_0x00cb:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x0474
        L_0x00d3:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x048b
        L_0x00db:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            boolean r4 = m61660g0(r11, r6)
            goto L_0x04a6
        L_0x00eb:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61665m0(r11, r6)
            goto L_0x04b9
        L_0x00fb:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            long r6 = m61668o0(r11, r6)
            goto L_0x04cb
        L_0x010b:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61665m0(r11, r6)
            goto L_0x04dd
        L_0x011b:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            long r6 = m61668o0(r11, r6)
            goto L_0x04ef
        L_0x012b:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            long r6 = m61668o0(r11, r6)
            goto L_0x0501
        L_0x013b:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            float r4 = m61662j0(r11, r6)
            goto L_0x0513
        L_0x014b:
            boolean r6 = r10.mo35203Q(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            double r6 = m61661h0(r11, r6)
            goto L_0x0525
        L_0x015b:
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            r10.mo35233v(r12, r5, r4, r3)
            goto L_0x0528
        L_0x0168:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.h8 r6 = r10.mo35201O(r3)
            com.contentsquare.android.sdk.C14646q9.m63159l(r5, r4, r12, r6)
            goto L_0x0528
        L_0x017f:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63148c0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0192:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63146b0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01a5:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63144a0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01b8:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63140X(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01cb:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63120D(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01de:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63150d0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01f1:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63160m(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0204:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63124H(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0217:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63128L(r5, r4, r12, r7)
            goto L_0x0528
        L_0x022a:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63134R(r5, r4, r12, r7)
            goto L_0x0528
        L_0x023d:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63152e0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0250:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63137U(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0263:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63131O(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0276:
            int r5 = r10.mo35212b0(r3)
            long r8 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63173z(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0289:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63148c0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x029c:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63146b0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02af:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63144a0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02c2:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63140X(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02d5:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63120D(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02e8:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63150d0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02fb:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63158k(r5, r4, r12)
            goto L_0x0528
        L_0x030e:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.h8 r6 = r10.mo35201O(r3)
            com.contentsquare.android.sdk.C14646q9.m63172y(r5, r4, r12, r6)
            goto L_0x0528
        L_0x0325:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63171x(r5, r4, r12)
            goto L_0x0528
        L_0x0338:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63160m(r5, r4, r12, r8)
            goto L_0x0528
        L_0x034b:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63124H(r5, r4, r12, r8)
            goto L_0x0528
        L_0x035e:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63128L(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0371:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63134R(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0384:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63152e0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0397:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63137U(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03aa:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63131O(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03bd:
            int r5 = r10.mo35212b0(r3)
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.contentsquare.android.sdk.C14646q9.m63173z(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03d0:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x03d6:
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            com.contentsquare.android.sdk.h8 r6 = r10.mo35201O(r3)
            r12.mo35443j(r5, r4, r6)
            goto L_0x0528
        L_0x03e7:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            long r6 = m61658d0(r11, r6)
        L_0x03f5:
            r12.mo35442i(r5, r6)
            goto L_0x0528
        L_0x03fa:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61654S(r11, r6)
        L_0x0408:
            r12.mo35448o(r5, r4)
            goto L_0x0528
        L_0x040d:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            long r6 = m61658d0(r11, r6)
        L_0x041b:
            r12.mo35446m(r5, r6)
            goto L_0x0528
        L_0x0420:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61654S(r11, r6)
        L_0x042e:
            r12.mo35445l(r5, r4)
            goto L_0x0528
        L_0x0433:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61654S(r11, r6)
        L_0x0441:
            r12.mo35428L(r5, r4)
            goto L_0x0528
        L_0x0446:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61654S(r11, r6)
        L_0x0454:
            r12.mo35441h(r5, r4)
            goto L_0x0528
        L_0x0459:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x045f:
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            com.contentsquare.android.sdk.t0 r4 = (com.contentsquare.android.sdk.C14719t0) r4
            r12.mo35453t(r5, r4)
            goto L_0x0528
        L_0x046e:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x0474:
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            com.contentsquare.android.sdk.h8 r6 = r10.mo35201O(r3)
            r12.mo35439f(r5, r4, r6)
            goto L_0x0528
        L_0x0485:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x048b:
            long r6 = m61659f0(r4)
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r11, r6)
            r10.mo35230s(r5, r4, r12)
            goto L_0x0528
        L_0x0498:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            boolean r4 = m61651E(r11, r6)
        L_0x04a6:
            r12.mo35427K(r5, r4)
            goto L_0x0528
        L_0x04ab:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61654S(r11, r6)
        L_0x04b9:
            r12.mo35437d(r5, r4)
            goto L_0x0528
        L_0x04bd:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            long r6 = m61658d0(r11, r6)
        L_0x04cb:
            r12.mo35438e(r5, r6)
            goto L_0x0528
        L_0x04cf:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            int r4 = m61654S(r11, r6)
        L_0x04dd:
            r12.mo35424H(r5, r4)
            goto L_0x0528
        L_0x04e1:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            long r6 = m61658d0(r11, r6)
        L_0x04ef:
            r12.mo35425I(r5, r6)
            goto L_0x0528
        L_0x04f3:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            long r6 = m61658d0(r11, r6)
        L_0x0501:
            r12.mo35429M(r5, r6)
            goto L_0x0528
        L_0x0505:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            float r4 = m61653N(r11, r6)
        L_0x0513:
            r12.mo35423G(r5, r4)
            goto L_0x0528
        L_0x0517:
            boolean r6 = r10.mo35191A(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m61659f0(r4)
            double r6 = m61652G(r11, r6)
        L_0x0525:
            r12.mo35422F(r5, r6)
        L_0x0528:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x052c:
            if (r2 == 0) goto L_0x0543
            com.contentsquare.android.sdk.m3<?> r11 = r10.f35436p
            r11.mo35031g(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0541
            java.lang.Object r11 = r0.next()
            r2 = r11
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x052c
        L_0x0541:
            r2 = r1
            goto L_0x052c
        L_0x0543:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14344fc.mo35206U(java.lang.Object, com.contentsquare.android.sdk.uf):void");
    }

    /* renamed from: V */
    public final void mo35207V(T t, T t2, int i) {
        long f0 = m61659f0(mo35227n0(i));
        if (mo35191A(t2, i)) {
            Object T = C14634q4.m63030T(t, f0);
            Object T2 = C14634q4.m63030T(t2, f0);
            if (T != null && T2 != null) {
                T2 = C14566o3.m62805g(T, T2);
            } else if (T2 == null) {
                return;
            }
            C14634q4.m63042l(t, f0, T2);
            mo35196I(t, i);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d0, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e1, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f2, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0203, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0214, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0225, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0236, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0238, code lost:
        r2.putInt(r1, (long) r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023c, code lost:
        r3 = r3 + (com.contentsquare.android.sdk.C14235c1.m61195r0(r10) + com.contentsquare.android.sdk.C14235c1.m61200v0(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02e9, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ee, code lost:
        if ((r8 & r15) != 0) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f0, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61179j(r10, (com.contentsquare.android.sdk.C14218ba) r2.getObject(r1, r13), mo35201O(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0307, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61174f0(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0314, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61182k0(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x031b, code lost:
        if ((r8 & r15) != 0) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x031d, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61165V(r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0325, code lost:
        if ((r8 & r15) != 0) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0327, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61172e0(r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0338, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61175g(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0346, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61190o0(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x034e, code lost:
        if ((r8 & r15) != 0) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0350, code lost:
        r3 = r2.getObject(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0354, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61183l(r10, (com.contentsquare.android.sdk.C14719t0) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x035e, code lost:
        if ((r8 & r15) != 0) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0360, code lost:
        r3 = com.contentsquare.android.sdk.C14646q9.m63143a(r10, r2.getObject(r1, r13), mo35201O(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0378, code lost:
        if ((r3 instanceof com.contentsquare.android.sdk.C14719t0) != false) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x037b, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61185m(r10, (java.lang.String) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0385, code lost:
        if ((r8 & r15) != 0) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0387, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61187n(r10, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0390, code lost:
        if ((r8 & r15) != 0) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0392, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61152A(r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x039f, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61177h(r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03d3, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61173f(r10, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03de, code lost:
        r3 = com.contentsquare.android.sdk.C14235c1.m61171e(r10, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03e4, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03e5, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (mo35203Q(r1, r10, r5) != false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (mo35203Q(r1, r10, r5) != false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (mo35203Q(r1, r10, r5) != false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        if (mo35203Q(r1, r10, r5) != false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (mo35203Q(r1, r10, r5) != false) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c5, code lost:
        if ((r3 instanceof com.contentsquare.android.sdk.C14719t0) != false) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cd, code lost:
        if (mo35203Q(r1, r10, r5) != false) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d5, code lost:
        if (mo35203Q(r1, r10, r5) != false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0152, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0164, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0176, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0188, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x019a, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ac, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01be, code lost:
        if (r0.f35429i != false) goto L_0x0238;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35208X(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f35420s
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000d:
            int[] r9 = r0.f35421a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x03ec
            int r9 = r0.mo35227n0(r5)
            int r10 = r0.mo35212b0(r5)
            int r11 = m61663l0(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x0038
            int[] r12 = r0.f35421a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r4
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0056
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0056
        L_0x0038:
            boolean r12 = r0.f35429i
            if (r12 == 0) goto L_0x0054
            com.contentsquare.android.sdk.u3 r12 = com.contentsquare.android.sdk.C14762u3.f36564d1
            int r12 = r12.mo36550g()
            if (r11 < r12) goto L_0x0054
            com.contentsquare.android.sdk.u3 r12 = com.contentsquare.android.sdk.C14762u3.f36579q1
            int r12 = r12.mo36550g()
            if (r11 > r12) goto L_0x0054
            int[] r12 = r0.f35421a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r4
            goto L_0x0055
        L_0x0054:
            r12 = 0
        L_0x0055:
            r15 = 0
        L_0x0056:
            long r13 = m61659f0(r9)
            r3 = 0
            switch(r11) {
                case 0: goto L_0x03d9;
                case 1: goto L_0x03ce;
                case 2: goto L_0x03c0;
                case 3: goto L_0x03b2;
                case 4: goto L_0x03a4;
                case 5: goto L_0x039a;
                case 6: goto L_0x038e;
                case 7: goto L_0x0383;
                case 8: goto L_0x036e;
                case 9: goto L_0x035c;
                case 10: goto L_0x034c;
                case 11: goto L_0x033e;
                case 12: goto L_0x0330;
                case 13: goto L_0x0323;
                case 14: goto L_0x0319;
                case 15: goto L_0x030c;
                case 16: goto L_0x02ff;
                case 17: goto L_0x02ec;
                case 18: goto L_0x02de;
                case 19: goto L_0x02d2;
                case 20: goto L_0x02c6;
                case 21: goto L_0x02ba;
                case 22: goto L_0x02ae;
                case 23: goto L_0x02de;
                case 24: goto L_0x02d2;
                case 25: goto L_0x02a2;
                case 26: goto L_0x0295;
                case 27: goto L_0x0286;
                case 28: goto L_0x027b;
                case 29: goto L_0x026e;
                case 30: goto L_0x0261;
                case 31: goto L_0x02d2;
                case 32: goto L_0x02de;
                case 33: goto L_0x0254;
                case 34: goto L_0x0247;
                case 35: goto L_0x0228;
                case 36: goto L_0x0217;
                case 37: goto L_0x0206;
                case 38: goto L_0x01f5;
                case 39: goto L_0x01e4;
                case 40: goto L_0x01d3;
                case 41: goto L_0x01c2;
                case 42: goto L_0x01b0;
                case 43: goto L_0x019e;
                case 44: goto L_0x018c;
                case 45: goto L_0x017a;
                case 46: goto L_0x0168;
                case 47: goto L_0x0156;
                case 48: goto L_0x0144;
                case 49: goto L_0x0134;
                case 50: goto L_0x0124;
                case 51: goto L_0x011b;
                case 52: goto L_0x0112;
                case 53: goto L_0x0102;
                case 54: goto L_0x00f2;
                case 55: goto L_0x00e2;
                case 56: goto L_0x00d9;
                case 57: goto L_0x00d1;
                case 58: goto L_0x00c9;
                case 59: goto L_0x00b9;
                case 60: goto L_0x00b1;
                case 61: goto L_0x00a9;
                case 62: goto L_0x009d;
                case 63: goto L_0x0091;
                case 64: goto L_0x0089;
                case 65: goto L_0x0081;
                case 66: goto L_0x0075;
                case 67: goto L_0x0069;
                case 68: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x0398
        L_0x0061:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            goto L_0x02f0
        L_0x0069:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            long r3 = m61668o0(r1, r13)
            goto L_0x0307
        L_0x0075:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            int r3 = m61665m0(r1, r13)
            goto L_0x0314
        L_0x0081:
            boolean r11 = r0.mo35203Q(r1, r10, r5)
            if (r11 == 0) goto L_0x0398
            goto L_0x031d
        L_0x0089:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            goto L_0x0327
        L_0x0091:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            int r3 = m61665m0(r1, r13)
            goto L_0x0338
        L_0x009d:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            int r3 = m61665m0(r1, r13)
            goto L_0x0346
        L_0x00a9:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            goto L_0x0350
        L_0x00b1:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            goto L_0x0360
        L_0x00b9:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.contentsquare.android.sdk.C14719t0
            if (r4 == 0) goto L_0x037b
            goto L_0x037a
        L_0x00c9:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            goto L_0x0387
        L_0x00d1:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            goto L_0x0392
        L_0x00d9:
            boolean r11 = r0.mo35203Q(r1, r10, r5)
            if (r11 == 0) goto L_0x0398
            r9 = 0
            goto L_0x039f
        L_0x00e2:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            int r3 = m61665m0(r1, r13)
            int r3 = com.contentsquare.android.sdk.C14235c1.m61164U(r10, r3)
            goto L_0x029f
        L_0x00f2:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            long r3 = m61668o0(r1, r13)
            int r3 = com.contentsquare.android.sdk.C14235c1.m61184l0(r10, r3)
            goto L_0x029f
        L_0x0102:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            long r3 = m61668o0(r1, r13)
            int r3 = com.contentsquare.android.sdk.C14235c1.m61153B(r10, r3)
            goto L_0x029f
        L_0x0112:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            r9 = 0
            goto L_0x03d3
        L_0x011b:
            boolean r3 = r0.mo35203Q(r1, r10, r5)
            if (r3 == 0) goto L_0x0398
            r9 = 0
            goto L_0x03de
        L_0x0124:
            com.contentsquare.android.sdk.h4 r3 = r0.f35437q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r11 = r0.mo35195H(r5)
            int r3 = r3.mo35490i(r10, r4, r11)
            goto L_0x029f
        L_0x0134:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.contentsquare.android.sdk.h8 r4 = r0.mo35201O(r5)
            int r3 = com.contentsquare.android.sdk.C14646q9.m63147c(r10, r3, r4)
            goto L_0x029f
        L_0x0144:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63136T(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x0156:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63133Q(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x0168:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63122F(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x017a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63118B(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x018c:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63169v(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x019e:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63139W(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x01b0:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63151e(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x01c2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63118B(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x01d3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63122F(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x01e4:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63126J(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63142Z(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x0206:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63130N(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x0217:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63118B(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
            goto L_0x0238
        L_0x0228:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63122F(r3)
            if (r3 <= 0) goto L_0x0398
            boolean r4 = r0.f35429i
            if (r4 == 0) goto L_0x023c
        L_0x0238:
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x023c:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61195r0(r10)
            int r10 = com.contentsquare.android.sdk.C14235c1.m61200v0(r3)
            int r4 = r4 + r10
            int r3 = r3 + r4
            goto L_0x029f
        L_0x0247:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.contentsquare.android.sdk.C14646q9.m63135S(r10, r3, r4)
            goto L_0x02e9
        L_0x0254:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63132P(r10, r3, r4)
            goto L_0x02e9
        L_0x0261:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63168u(r10, r3, r4)
            goto L_0x02e9
        L_0x026e:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63138V(r10, r3, r4)
            goto L_0x02e9
        L_0x027b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63145b(r10, r3)
            goto L_0x029f
        L_0x0286:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.contentsquare.android.sdk.h8 r4 = r0.mo35201O(r5)
            int r3 = com.contentsquare.android.sdk.C14646q9.m63167t(r10, r3, r4)
            goto L_0x029f
        L_0x0295:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63166s(r10, r3)
        L_0x029f:
            r9 = 0
            goto L_0x03e4
        L_0x02a2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.contentsquare.android.sdk.C14646q9.m63149d(r10, r3, r4)
            goto L_0x02e9
        L_0x02ae:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63125I(r10, r3, r4)
            goto L_0x02e9
        L_0x02ba:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63141Y(r10, r3, r4)
            goto L_0x02e9
        L_0x02c6:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63129M(r10, r3, r4)
            goto L_0x02e9
        L_0x02d2:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63117A(r10, r3, r4)
            goto L_0x02e9
        L_0x02de:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.contentsquare.android.sdk.C14646q9.m63121E(r10, r3, r4)
        L_0x02e9:
            r9 = r4
            goto L_0x03e4
        L_0x02ec:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
        L_0x02f0:
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.contentsquare.android.sdk.ba r3 = (com.contentsquare.android.sdk.C14218ba) r3
            com.contentsquare.android.sdk.h8 r4 = r0.mo35201O(r5)
            int r3 = com.contentsquare.android.sdk.C14235c1.m61179j(r10, r3, r4)
            goto L_0x029f
        L_0x02ff:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
            long r3 = r2.getLong(r1, r13)
        L_0x0307:
            int r3 = com.contentsquare.android.sdk.C14235c1.m61174f0(r10, r3)
            goto L_0x029f
        L_0x030c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
            int r3 = r2.getInt(r1, r13)
        L_0x0314:
            int r3 = com.contentsquare.android.sdk.C14235c1.m61182k0(r10, r3)
            goto L_0x029f
        L_0x0319:
            r11 = r8 & r15
            if (r11 == 0) goto L_0x0398
        L_0x031d:
            int r3 = com.contentsquare.android.sdk.C14235c1.m61165V(r10, r3)
            goto L_0x029f
        L_0x0323:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
        L_0x0327:
            r3 = 0
            int r4 = com.contentsquare.android.sdk.C14235c1.m61172e0(r10, r3)
            r9 = r3
            r3 = r4
            goto L_0x03e4
        L_0x0330:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
            int r3 = r2.getInt(r1, r13)
        L_0x0338:
            int r3 = com.contentsquare.android.sdk.C14235c1.m61175g(r10, r3)
            goto L_0x029f
        L_0x033e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
            int r3 = r2.getInt(r1, r13)
        L_0x0346:
            int r3 = com.contentsquare.android.sdk.C14235c1.m61190o0(r10, r3)
            goto L_0x029f
        L_0x034c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
        L_0x0350:
            java.lang.Object r3 = r2.getObject(r1, r13)
        L_0x0354:
            com.contentsquare.android.sdk.t0 r3 = (com.contentsquare.android.sdk.C14719t0) r3
            int r3 = com.contentsquare.android.sdk.C14235c1.m61183l(r10, r3)
            goto L_0x029f
        L_0x035c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
        L_0x0360:
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.contentsquare.android.sdk.h8 r4 = r0.mo35201O(r5)
            int r3 = com.contentsquare.android.sdk.C14646q9.m63143a(r10, r3, r4)
            goto L_0x029f
        L_0x036e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.contentsquare.android.sdk.C14719t0
            if (r4 == 0) goto L_0x037b
        L_0x037a:
            goto L_0x0354
        L_0x037b:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.contentsquare.android.sdk.C14235c1.m61185m(r10, r3)
            goto L_0x029f
        L_0x0383:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
        L_0x0387:
            r3 = 1
            int r3 = com.contentsquare.android.sdk.C14235c1.m61187n(r10, r3)
            goto L_0x029f
        L_0x038e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0398
        L_0x0392:
            r9 = 0
            int r3 = com.contentsquare.android.sdk.C14235c1.m61152A(r10, r9)
            goto L_0x03e4
        L_0x0398:
            r9 = 0
            goto L_0x03e5
        L_0x039a:
            r9 = 0
            r11 = r8 & r15
            if (r11 == 0) goto L_0x03e5
        L_0x039f:
            int r3 = com.contentsquare.android.sdk.C14235c1.m61177h(r10, r3)
            goto L_0x03e4
        L_0x03a4:
            r9 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x03e5
            int r3 = r2.getInt(r1, r13)
            int r3 = com.contentsquare.android.sdk.C14235c1.m61164U(r10, r3)
            goto L_0x03e4
        L_0x03b2:
            r9 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x03e5
            long r3 = r2.getLong(r1, r13)
            int r3 = com.contentsquare.android.sdk.C14235c1.m61184l0(r10, r3)
            goto L_0x03e4
        L_0x03c0:
            r9 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x03e5
            long r3 = r2.getLong(r1, r13)
            int r3 = com.contentsquare.android.sdk.C14235c1.m61153B(r10, r3)
            goto L_0x03e4
        L_0x03ce:
            r9 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x03e5
        L_0x03d3:
            r3 = 0
            int r3 = com.contentsquare.android.sdk.C14235c1.m61173f(r10, r3)
            goto L_0x03e4
        L_0x03d9:
            r9 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x03e5
        L_0x03de:
            r3 = 0
            int r3 = com.contentsquare.android.sdk.C14235c1.m61171e(r10, r3)
        L_0x03e4:
            int r6 = r6 + r3
        L_0x03e5:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x03ec:
            com.contentsquare.android.sdk.j0<?, ?> r2 = r0.f35435o
            int r2 = r0.mo35224k(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f35426f
            if (r2 == 0) goto L_0x0402
            com.contentsquare.android.sdk.m3<?> r2 = r0.f35436p
            com.contentsquare.android.sdk.cc r1 = r2.mo35026b(r1)
            int r1 = r1.mo34870s()
            int r6 = r6 + r1
        L_0x0402:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14344fc.mo35208X(java.lang.Object):int");
    }

    /* renamed from: Z */
    public final void mo35209Z(T t, T t2, int i) {
        int n0 = mo35227n0(i);
        int b0 = mo35212b0(i);
        long f0 = m61659f0(n0);
        if (mo35203Q(t2, b0, i)) {
            Object T = mo35203Q(t, b0, i) ? C14634q4.m63030T(t, f0) : null;
            Object T2 = C14634q4.m63030T(t2, f0);
            if (T != null && T2 != null) {
                T2 = C14566o3.m62805g(T, T2);
            } else if (T2 == null) {
                return;
            }
            C14634q4.m63042l(t, f0, T2);
            mo35205T(t, b0, i);
        }
    }

    /* renamed from: a */
    public T mo35210a() {
        return this.f35433m.mo35072b(this.f35425e);
    }

    /* renamed from: b */
    public final boolean mo35211b(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f35431k) {
            int i6 = this.f35430j[i5];
            int b0 = mo35212b0(i6);
            int n0 = mo35227n0(i6);
            int i7 = this.f35421a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f35420s.getInt(t2, (long) i8);
                }
                i = i4;
                i2 = i8;
            } else {
                i2 = i3;
                i = i4;
            }
            if (m61657a0(n0) && !mo35193C(t, i6, i2, i, i9)) {
                return false;
            }
            int l0 = m61663l0(n0);
            if (l0 != 9 && l0 != 17) {
                if (l0 != 27) {
                    if (l0 == 60 || l0 == 68) {
                        if (mo35203Q(t2, b0, i6) && !m61650D(t2, n0, mo35201O(i6))) {
                            return false;
                        }
                    } else if (l0 != 49) {
                        if (l0 == 50 && !mo35199L(t2, n0, i6)) {
                            return false;
                        }
                    }
                }
                if (!mo35192B(t2, n0, i6)) {
                    return false;
                }
            } else if (mo35193C(t, i6, i2, i, i9) && !m61650D(t2, n0, mo35201O(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        return !this.f35426f || this.f35436p.mo35026b(t2).mo34873v();
    }

    /* renamed from: b0 */
    public final int mo35212b0(int i) {
        return this.f35421a[i];
    }

    /* renamed from: c */
    public void mo35213c(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f35421a.length; i += 3) {
            mo35217e0(t, t2, i);
        }
        C14646q9.m63161n(this.f35435o, t, t2);
        if (this.f35426f) {
            C14646q9.m63162o(this.f35436p, t, t2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ce, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01df, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01f0, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0201, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0203, code lost:
        r0.putInt(r12, (long) r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0207, code lost:
        r4 = (com.contentsquare.android.sdk.C14235c1.m61195r0(r6) + com.contentsquare.android.sdk.C14235c1.m61200v0(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029f, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61179j(r6, (com.contentsquare.android.sdk.C14218ba) com.contentsquare.android.sdk.C14634q4.m63030T(r12, r7), mo35201O(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02b9, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61174f0(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c9, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61182k0(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02d5, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61165V(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e1, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61172e0(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02f1, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61175g(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0301, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61190o0(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x030d, code lost:
        r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0311, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61183l(r6, (com.contentsquare.android.sdk.C14719t0) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x031f, code lost:
        r4 = com.contentsquare.android.sdk.C14646q9.m63143a(r6, com.contentsquare.android.sdk.C14634q4.m63030T(r12, r7), mo35201O(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0339, code lost:
        if ((r4 instanceof com.contentsquare.android.sdk.C14719t0) != false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x033c, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61185m(r6, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x034a, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61187n(r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0356, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61152A(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0361, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61177h(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0370, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61164U(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x037f, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61184l0(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x038e, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61153B(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0399, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61173f(r6, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03a5, code lost:
        r4 = com.contentsquare.android.sdk.C14235c1.m61171e(r6, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03ab, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03ac, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        if ((r4 instanceof com.contentsquare.android.sdk.C14719t0) != false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011d, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012f, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0141, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0153, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0165, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0177, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0189, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x019b, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ac, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01bd, code lost:
        if (r11.f35429i != false) goto L_0x0203;
     */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35214c0(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f35420s
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f35421a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x03b0
            int r4 = r11.mo35227n0(r2)
            int r5 = m61663l0(r4)
            int r6 = r11.mo35212b0(r2)
            long r7 = m61659f0(r4)
            com.contentsquare.android.sdk.u3 r4 = com.contentsquare.android.sdk.C14762u3.f36564d1
            int r4 = r4.mo36550g()
            if (r5 < r4) goto L_0x0035
            com.contentsquare.android.sdk.u3 r4 = com.contentsquare.android.sdk.C14762u3.f36579q1
            int r4 = r4.mo36550g()
            if (r5 > r4) goto L_0x0035
            int[] r4 = r11.f35421a
            int r9 = r2 + 2
            r4 = r4[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r9
            goto L_0x0036
        L_0x0035:
            r4 = r1
        L_0x0036:
            r9 = 0
            switch(r5) {
                case 0: goto L_0x039f;
                case 1: goto L_0x0393;
                case 2: goto L_0x0384;
                case 3: goto L_0x0375;
                case 4: goto L_0x0366;
                case 5: goto L_0x035b;
                case 6: goto L_0x0350;
                case 7: goto L_0x0344;
                case 8: goto L_0x032d;
                case 9: goto L_0x0319;
                case 10: goto L_0x0307;
                case 11: goto L_0x02f7;
                case 12: goto L_0x02e7;
                case 13: goto L_0x02db;
                case 14: goto L_0x02cf;
                case 15: goto L_0x02bf;
                case 16: goto L_0x02af;
                case 17: goto L_0x0299;
                case 18: goto L_0x028f;
                case 19: goto L_0x0285;
                case 20: goto L_0x027b;
                case 21: goto L_0x0271;
                case 22: goto L_0x0267;
                case 23: goto L_0x028f;
                case 24: goto L_0x0285;
                case 25: goto L_0x025d;
                case 26: goto L_0x0253;
                case 27: goto L_0x0245;
                case 28: goto L_0x023b;
                case 29: goto L_0x0231;
                case 30: goto L_0x0227;
                case 31: goto L_0x0285;
                case 32: goto L_0x028f;
                case 33: goto L_0x021d;
                case 34: goto L_0x0213;
                case 35: goto L_0x01f3;
                case 36: goto L_0x01e2;
                case 37: goto L_0x01d1;
                case 38: goto L_0x01c0;
                case 39: goto L_0x01af;
                case 40: goto L_0x019e;
                case 41: goto L_0x018d;
                case 42: goto L_0x017b;
                case 43: goto L_0x0169;
                case 44: goto L_0x0157;
                case 45: goto L_0x0145;
                case 46: goto L_0x0133;
                case 47: goto L_0x0121;
                case 48: goto L_0x010f;
                case 49: goto L_0x0101;
                case 50: goto L_0x00f1;
                case 51: goto L_0x00e9;
                case 52: goto L_0x00e1;
                case 53: goto L_0x00d5;
                case 54: goto L_0x00c9;
                case 55: goto L_0x00bd;
                case 56: goto L_0x00b5;
                case 57: goto L_0x00ad;
                case 58: goto L_0x00a5;
                case 59: goto L_0x0095;
                case 60: goto L_0x008d;
                case 61: goto L_0x0085;
                case 62: goto L_0x0079;
                case 63: goto L_0x006d;
                case 64: goto L_0x0065;
                case 65: goto L_0x005d;
                case 66: goto L_0x0051;
                case 67: goto L_0x0045;
                case 68: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x03ac
        L_0x003d:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            goto L_0x029f
        L_0x0045:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            long r4 = m61668o0(r12, r7)
            goto L_0x02b9
        L_0x0051:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            int r4 = m61665m0(r12, r7)
            goto L_0x02c9
        L_0x005d:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            goto L_0x02d5
        L_0x0065:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            goto L_0x02e1
        L_0x006d:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            int r4 = m61665m0(r12, r7)
            goto L_0x02f1
        L_0x0079:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            int r4 = m61665m0(r12, r7)
            goto L_0x0301
        L_0x0085:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            goto L_0x030d
        L_0x008d:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            goto L_0x031f
        L_0x0095:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r12, r7)
            boolean r5 = r4 instanceof com.contentsquare.android.sdk.C14719t0
            if (r5 == 0) goto L_0x033c
            goto L_0x033b
        L_0x00a5:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            goto L_0x034a
        L_0x00ad:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            goto L_0x0356
        L_0x00b5:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            goto L_0x0361
        L_0x00bd:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            int r4 = m61665m0(r12, r7)
            goto L_0x0370
        L_0x00c9:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            long r4 = m61668o0(r12, r7)
            goto L_0x037f
        L_0x00d5:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            long r4 = m61668o0(r12, r7)
            goto L_0x038e
        L_0x00e1:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            goto L_0x0399
        L_0x00e9:
            boolean r4 = r11.mo35203Q(r12, r6, r2)
            if (r4 == 0) goto L_0x03ac
            goto L_0x03a5
        L_0x00f1:
            com.contentsquare.android.sdk.h4 r4 = r11.f35437q
            java.lang.Object r5 = com.contentsquare.android.sdk.C14634q4.m63030T(r12, r7)
            java.lang.Object r7 = r11.mo35195H(r2)
            int r4 = r4.mo35490i(r6, r5, r7)
            goto L_0x03ab
        L_0x0101:
            java.util.List r4 = m61656Y(r12, r7)
            com.contentsquare.android.sdk.h8 r5 = r11.mo35201O(r2)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63147c(r6, r4, r5)
            goto L_0x03ab
        L_0x010f:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63136T(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x0121:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63133Q(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x0133:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63122F(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x0145:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63118B(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x0157:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63169v(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x0169:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63139W(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x017b:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63151e(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x018d:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63118B(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x019e:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63122F(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x01af:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63126J(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x01c0:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63142Z(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x01d1:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63130N(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x01e2:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63118B(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
            goto L_0x0203
        L_0x01f3:
            java.lang.Object r5 = r0.getObject(r12, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.contentsquare.android.sdk.C14646q9.m63122F(r5)
            if (r5 <= 0) goto L_0x03ac
            boolean r7 = r11.f35429i
            if (r7 == 0) goto L_0x0207
        L_0x0203:
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0207:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61195r0(r6)
            int r6 = com.contentsquare.android.sdk.C14235c1.m61200v0(r5)
            int r4 = r4 + r6
            int r4 = r4 + r5
            goto L_0x03ab
        L_0x0213:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63135S(r6, r4, r1)
            goto L_0x03ab
        L_0x021d:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63132P(r6, r4, r1)
            goto L_0x03ab
        L_0x0227:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63168u(r6, r4, r1)
            goto L_0x03ab
        L_0x0231:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63138V(r6, r4, r1)
            goto L_0x03ab
        L_0x023b:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63145b(r6, r4)
            goto L_0x03ab
        L_0x0245:
            java.util.List r4 = m61656Y(r12, r7)
            com.contentsquare.android.sdk.h8 r5 = r11.mo35201O(r2)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63167t(r6, r4, r5)
            goto L_0x03ab
        L_0x0253:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63166s(r6, r4)
            goto L_0x03ab
        L_0x025d:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63149d(r6, r4, r1)
            goto L_0x03ab
        L_0x0267:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63125I(r6, r4, r1)
            goto L_0x03ab
        L_0x0271:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63141Y(r6, r4, r1)
            goto L_0x03ab
        L_0x027b:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63129M(r6, r4, r1)
            goto L_0x03ab
        L_0x0285:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63117A(r6, r4, r1)
            goto L_0x03ab
        L_0x028f:
            java.util.List r4 = m61656Y(r12, r7)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63121E(r6, r4, r1)
            goto L_0x03ab
        L_0x0299:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
        L_0x029f:
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r12, r7)
            com.contentsquare.android.sdk.ba r4 = (com.contentsquare.android.sdk.C14218ba) r4
            com.contentsquare.android.sdk.h8 r5 = r11.mo35201O(r2)
            int r4 = com.contentsquare.android.sdk.C14235c1.m61179j(r6, r4, r5)
            goto L_0x03ab
        L_0x02af:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
            long r4 = com.contentsquare.android.sdk.C14634q4.m63029S(r12, r7)
        L_0x02b9:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61174f0(r6, r4)
            goto L_0x03ab
        L_0x02bf:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
            int r4 = com.contentsquare.android.sdk.C14634q4.m63028R(r12, r7)
        L_0x02c9:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61182k0(r6, r4)
            goto L_0x03ab
        L_0x02cf:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
        L_0x02d5:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61165V(r6, r9)
            goto L_0x03ab
        L_0x02db:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
        L_0x02e1:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61172e0(r6, r1)
            goto L_0x03ab
        L_0x02e7:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
            int r4 = com.contentsquare.android.sdk.C14634q4.m63028R(r12, r7)
        L_0x02f1:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61175g(r6, r4)
            goto L_0x03ab
        L_0x02f7:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
            int r4 = com.contentsquare.android.sdk.C14634q4.m63028R(r12, r7)
        L_0x0301:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61190o0(r6, r4)
            goto L_0x03ab
        L_0x0307:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
        L_0x030d:
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r12, r7)
        L_0x0311:
            com.contentsquare.android.sdk.t0 r4 = (com.contentsquare.android.sdk.C14719t0) r4
            int r4 = com.contentsquare.android.sdk.C14235c1.m61183l(r6, r4)
            goto L_0x03ab
        L_0x0319:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
        L_0x031f:
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r12, r7)
            com.contentsquare.android.sdk.h8 r5 = r11.mo35201O(r2)
            int r4 = com.contentsquare.android.sdk.C14646q9.m63143a(r6, r4, r5)
            goto L_0x03ab
        L_0x032d:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
            java.lang.Object r4 = com.contentsquare.android.sdk.C14634q4.m63030T(r12, r7)
            boolean r5 = r4 instanceof com.contentsquare.android.sdk.C14719t0
            if (r5 == 0) goto L_0x033c
        L_0x033b:
            goto L_0x0311
        L_0x033c:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.contentsquare.android.sdk.C14235c1.m61185m(r6, r4)
            goto L_0x03ab
        L_0x0344:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
        L_0x034a:
            r4 = 1
            int r4 = com.contentsquare.android.sdk.C14235c1.m61187n(r6, r4)
            goto L_0x03ab
        L_0x0350:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
        L_0x0356:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61152A(r6, r1)
            goto L_0x03ab
        L_0x035b:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
        L_0x0361:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61177h(r6, r9)
            goto L_0x03ab
        L_0x0366:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
            int r4 = com.contentsquare.android.sdk.C14634q4.m63028R(r12, r7)
        L_0x0370:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61164U(r6, r4)
            goto L_0x03ab
        L_0x0375:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
            long r4 = com.contentsquare.android.sdk.C14634q4.m63029S(r12, r7)
        L_0x037f:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61184l0(r6, r4)
            goto L_0x03ab
        L_0x0384:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
            long r4 = com.contentsquare.android.sdk.C14634q4.m63029S(r12, r7)
        L_0x038e:
            int r4 = com.contentsquare.android.sdk.C14235c1.m61153B(r6, r4)
            goto L_0x03ab
        L_0x0393:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
        L_0x0399:
            r4 = 0
            int r4 = com.contentsquare.android.sdk.C14235c1.m61173f(r6, r4)
            goto L_0x03ab
        L_0x039f:
            boolean r4 = r11.mo35191A(r12, r2)
            if (r4 == 0) goto L_0x03ac
        L_0x03a5:
            r4 = 0
            int r4 = com.contentsquare.android.sdk.C14235c1.m61171e(r6, r4)
        L_0x03ab:
            int r3 = r3 + r4
        L_0x03ac:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x03b0:
            com.contentsquare.android.sdk.j0<?, ?> r0 = r11.f35435o
            int r12 = r11.mo35224k(r0, r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14344fc.mo35214c0(java.lang.Object):int");
    }

    /* renamed from: d */
    public int mo35215d(T t) {
        return this.f35428h ? mo35214c0(t) : mo35208X(t);
    }

    /* renamed from: e */
    public void mo35216e(T t) {
        int i;
        int i2 = this.f35431k;
        while (true) {
            i = this.f35432l;
            if (i2 >= i) {
                break;
            }
            long f0 = m61659f0(mo35227n0(this.f35430j[i2]));
            Object T = C14634q4.m63030T(t, f0);
            if (T != null) {
                C14634q4.m63042l(t, f0, this.f35437q.mo35487f(T));
            }
            i2++;
        }
        int length = this.f35430j.length;
        while (i < length) {
            this.f35434n.mo35827b(t, (long) this.f35430j[i]);
            i++;
        }
        this.f35435o.mo35581s(t);
        if (this.f35426f) {
            this.f35436p.mo35034j(t);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        com.contentsquare.android.sdk.C14634q4.m63042l(r6, r1, com.contentsquare.android.sdk.C14634q4.m63030T(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        com.contentsquare.android.sdk.C14634q4.m63040j(r6, r1, com.contentsquare.android.sdk.C14634q4.m63028R(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
        com.contentsquare.android.sdk.C14634q4.m63041k(r6, r1, com.contentsquare.android.sdk.C14634q4.m63029S(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e1, code lost:
        mo35196I(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        com.contentsquare.android.sdk.C14634q4.m63042l(r6, r1, com.contentsquare.android.sdk.C14634q4.m63030T(r7, r1));
        mo35205T(r6, r3, r8);
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35217e0(T r6, T r7, int r8) {
        /*
            r5 = this;
            int r0 = r5.mo35227n0(r8)
            long r1 = m61659f0(r0)
            int r3 = r5.mo35212b0(r8)
            int r0 = m61663l0(r0)
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a3;
                case 5: goto L_0x009c;
                case 6: goto L_0x0095;
                case 7: goto L_0x0087;
                case 8: goto L_0x0079;
                case 9: goto L_0x0074;
                case 10: goto L_0x006d;
                case 11: goto L_0x0066;
                case 12: goto L_0x005f;
                case 13: goto L_0x0058;
                case 14: goto L_0x0050;
                case 15: goto L_0x0049;
                case 16: goto L_0x0041;
                case 17: goto L_0x0074;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x0033;
                case 51: goto L_0x0021;
                case 52: goto L_0x0021;
                case 53: goto L_0x0021;
                case 54: goto L_0x0021;
                case 55: goto L_0x0021;
                case 56: goto L_0x0021;
                case 57: goto L_0x0021;
                case 58: goto L_0x0021;
                case 59: goto L_0x0021;
                case 60: goto L_0x001c;
                case 61: goto L_0x0015;
                case 62: goto L_0x0015;
                case 63: goto L_0x0015;
                case 64: goto L_0x0015;
                case 65: goto L_0x0015;
                case 66: goto L_0x0015;
                case 67: goto L_0x0015;
                case 68: goto L_0x001c;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x00e4
        L_0x0015:
            boolean r0 = r5.mo35203Q(r7, r3, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0027
        L_0x001c:
            r5.mo35209Z(r6, r7, r8)
            goto L_0x00e4
        L_0x0021:
            boolean r0 = r5.mo35203Q(r7, r3, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x0027:
            java.lang.Object r7 = com.contentsquare.android.sdk.C14634q4.m63030T(r7, r1)
            com.contentsquare.android.sdk.C14634q4.m63042l(r6, r1, r7)
            r5.mo35205T(r6, r3, r8)
            goto L_0x00e4
        L_0x0033:
            com.contentsquare.android.sdk.h4 r8 = r5.f35437q
            com.contentsquare.android.sdk.C14646q9.m63163p(r8, r6, r7, r1)
            goto L_0x00e4
        L_0x003a:
            com.contentsquare.android.sdk.ld r8 = r5.f35434n
            r8.mo35828c(r6, r7, r1)
            goto L_0x00e4
        L_0x0041:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x0049:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x0050:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x0058:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x005f:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x0066:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x006d:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x007f
        L_0x0074:
            r5.mo35207V(r6, r7, r8)
            goto L_0x00e4
        L_0x0079:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x007f:
            java.lang.Object r7 = com.contentsquare.android.sdk.C14634q4.m63030T(r7, r1)
            com.contentsquare.android.sdk.C14634q4.m63042l(r6, r1, r7)
            goto L_0x00e1
        L_0x0087:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            boolean r7 = com.contentsquare.android.sdk.C14634q4.m63018H(r7, r1)
            com.contentsquare.android.sdk.C14634q4.m63055y(r6, r1, r7)
            goto L_0x00e1
        L_0x0095:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x009c:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x00a3:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x00a9:
            int r7 = com.contentsquare.android.sdk.C14634q4.m63028R(r7, r1)
            com.contentsquare.android.sdk.C14634q4.m63040j(r6, r1, r7)
            goto L_0x00e1
        L_0x00b1:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x00b8:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x00be:
            long r3 = com.contentsquare.android.sdk.C14634q4.m63029S(r7, r1)
            com.contentsquare.android.sdk.C14634q4.m63041k(r6, r1, r3)
            goto L_0x00e1
        L_0x00c6:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            float r7 = com.contentsquare.android.sdk.C14634q4.m63027Q(r7, r1)
            com.contentsquare.android.sdk.C14634q4.m63039i(r6, r1, r7)
            goto L_0x00e1
        L_0x00d4:
            boolean r0 = r5.mo35191A(r7, r8)
            if (r0 == 0) goto L_0x00e4
            double r3 = com.contentsquare.android.sdk.C14634q4.m63026P(r7, r1)
            com.contentsquare.android.sdk.C14634q4.m63038h(r6, r1, r3)
        L_0x00e1:
            r5.mo35196I(r6, r8)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14344fc.mo35217e0(java.lang.Object, java.lang.Object, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r3 = com.contentsquare.android.sdk.C14634q4.m63030T(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        r2 = r2 * 53;
        r3 = m61665m0(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        r2 = r2 * 53;
        r3 = m61668o0(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        if (r3 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:
        r2 = r2 * 53;
        r3 = com.contentsquare.android.sdk.C14634q4.m63030T(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d4, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00dd, code lost:
        if (r3 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00df, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e7, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.contentsquare.android.sdk.C14634q4.m63030T(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f3, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fb, code lost:
        r3 = com.contentsquare.android.sdk.C14566o3.m62801c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0114, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011f, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0123, code lost:
        r3 = com.contentsquare.android.sdk.C14566o3.m62800b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo35218f(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f35421a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x012c
            int r3 = r8.mo35227n0(r1)
            int r4 = r8.mo35212b0(r1)
            long r5 = m61659f0(r3)
            int r3 = m61663l0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0119;
                case 1: goto L_0x010e;
                case 2: goto L_0x0107;
                case 3: goto L_0x0107;
                case 4: goto L_0x0100;
                case 5: goto L_0x0107;
                case 6: goto L_0x0100;
                case 7: goto L_0x00f5;
                case 8: goto L_0x00e7;
                case 9: goto L_0x00d9;
                case 10: goto L_0x00ce;
                case 11: goto L_0x0100;
                case 12: goto L_0x0100;
                case 13: goto L_0x0100;
                case 14: goto L_0x0107;
                case 15: goto L_0x0100;
                case 16: goto L_0x0107;
                case 17: goto L_0x00c7;
                case 18: goto L_0x00ce;
                case 19: goto L_0x00ce;
                case 20: goto L_0x00ce;
                case 21: goto L_0x00ce;
                case 22: goto L_0x00ce;
                case 23: goto L_0x00ce;
                case 24: goto L_0x00ce;
                case 25: goto L_0x00ce;
                case 26: goto L_0x00ce;
                case 27: goto L_0x00ce;
                case 28: goto L_0x00ce;
                case 29: goto L_0x00ce;
                case 30: goto L_0x00ce;
                case 31: goto L_0x00ce;
                case 32: goto L_0x00ce;
                case 33: goto L_0x00ce;
                case 34: goto L_0x00ce;
                case 35: goto L_0x00ce;
                case 36: goto L_0x00ce;
                case 37: goto L_0x00ce;
                case 38: goto L_0x00ce;
                case 39: goto L_0x00ce;
                case 40: goto L_0x00ce;
                case 41: goto L_0x00ce;
                case 42: goto L_0x00ce;
                case 43: goto L_0x00ce;
                case 44: goto L_0x00ce;
                case 45: goto L_0x00ce;
                case 46: goto L_0x00ce;
                case 47: goto L_0x00ce;
                case 48: goto L_0x00ce;
                case 49: goto L_0x00ce;
                case 50: goto L_0x00ce;
                case 51: goto L_0x00ba;
                case 52: goto L_0x00ad;
                case 53: goto L_0x009f;
                case 54: goto L_0x0098;
                case 55: goto L_0x008b;
                case 56: goto L_0x0084;
                case 57: goto L_0x007d;
                case 58: goto L_0x006f;
                case 59: goto L_0x0067;
                case 60: goto L_0x0059;
                case 61: goto L_0x0051;
                case 62: goto L_0x004a;
                case 63: goto L_0x0043;
                case 64: goto L_0x003c;
                case 65: goto L_0x0034;
                case 66: goto L_0x002d;
                case 67: goto L_0x0025;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0128
        L_0x001e:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x005f
        L_0x0025:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a5
        L_0x002d:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0034:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a5
        L_0x003c:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0043:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x004a:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0051:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00ce
        L_0x0059:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x005f:
            java.lang.Object r3 = com.contentsquare.android.sdk.C14634q4.m63030T(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d4
        L_0x0067:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00e7
        L_0x006f:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            boolean r3 = m61660g0(r9, r5)
            goto L_0x00fb
        L_0x007d:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0084:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a5
        L_0x008b:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0091:
            int r2 = r2 * 53
            int r3 = m61665m0(r9, r5)
            goto L_0x00f3
        L_0x0098:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a5
        L_0x009f:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x00a5:
            int r2 = r2 * 53
            long r3 = m61668o0(r9, r5)
            goto L_0x0123
        L_0x00ad:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            float r3 = m61662j0(r9, r5)
            goto L_0x0114
        L_0x00ba:
            boolean r3 = r8.mo35203Q(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            double r3 = m61661h0(r9, r5)
            goto L_0x011f
        L_0x00c7:
            java.lang.Object r3 = com.contentsquare.android.sdk.C14634q4.m63030T(r9, r5)
            if (r3 == 0) goto L_0x00e3
            goto L_0x00df
        L_0x00ce:
            int r2 = r2 * 53
            java.lang.Object r3 = com.contentsquare.android.sdk.C14634q4.m63030T(r9, r5)
        L_0x00d4:
            int r3 = r3.hashCode()
            goto L_0x00f3
        L_0x00d9:
            java.lang.Object r3 = com.contentsquare.android.sdk.C14634q4.m63030T(r9, r5)
            if (r3 == 0) goto L_0x00e3
        L_0x00df:
            int r7 = r3.hashCode()
        L_0x00e3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0128
        L_0x00e7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.contentsquare.android.sdk.C14634q4.m63030T(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
        L_0x00f3:
            int r2 = r2 + r3
            goto L_0x0128
        L_0x00f5:
            int r2 = r2 * 53
            boolean r3 = com.contentsquare.android.sdk.C14634q4.m63018H(r9, r5)
        L_0x00fb:
            int r3 = com.contentsquare.android.sdk.C14566o3.m62801c(r3)
            goto L_0x00f3
        L_0x0100:
            int r2 = r2 * 53
            int r3 = com.contentsquare.android.sdk.C14634q4.m63028R(r9, r5)
            goto L_0x00f3
        L_0x0107:
            int r2 = r2 * 53
            long r3 = com.contentsquare.android.sdk.C14634q4.m63029S(r9, r5)
            goto L_0x0123
        L_0x010e:
            int r2 = r2 * 53
            float r3 = com.contentsquare.android.sdk.C14634q4.m63027Q(r9, r5)
        L_0x0114:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x00f3
        L_0x0119:
            int r2 = r2 * 53
            double r3 = com.contentsquare.android.sdk.C14634q4.m63026P(r9, r5)
        L_0x011f:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0123:
            int r3 = com.contentsquare.android.sdk.C14566o3.m62800b(r3)
            goto L_0x00f3
        L_0x0128:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012c:
            int r2 = r2 * 53
            com.contentsquare.android.sdk.j0<?, ?> r0 = r8.f35435o
            java.lang.Object r0 = r0.mo35573k(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f35426f
            if (r0 == 0) goto L_0x014a
            int r2 = r2 * 53
            com.contentsquare.android.sdk.m3<?> r0 = r8.f35436p
            com.contentsquare.android.sdk.cc r9 = r0.mo35026b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14344fc.mo35218f(java.lang.Object):int");
    }

    /* renamed from: g */
    public void mo35219g(T t, C14782uf ufVar) {
        if (ufVar.mo35434a() == C14782uf.C14783a.DESCENDING) {
            mo35206U(t, ufVar);
        } else if (this.f35428h) {
            mo35202P(t, ufVar);
        } else {
            mo35198K(t, ufVar);
        }
    }

    /* renamed from: h */
    public boolean mo35220h(T t, T t2) {
        int length = this.f35421a.length;
        for (int i = 0; i < length; i += 3) {
            if (!mo35200M(t, t2, i)) {
                return false;
            }
        }
        if (!this.f35435o.mo35573k(t).equals(this.f35435o.mo35573k(t2))) {
            return false;
        }
        if (this.f35426f) {
            return this.f35436p.mo35026b(t).equals(this.f35436p.mo35026b(t2));
        }
        return true;
    }

    /* renamed from: i */
    public void mo35221i(T t, C14475k6 k6Var, C14787v2 v2Var) {
        v2Var.getClass();
        mo35231t(this.f35435o, this.f35436p, t, k6Var, v2Var);
    }

    /* renamed from: i0 */
    public final int mo35222i0(int i) {
        if (i < this.f35423c || i > this.f35424d) {
            return -1;
        }
        return mo35223j(i, 0);
    }

    /* renamed from: j */
    public final int mo35223j(int i, int i2) {
        int length = (this.f35421a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int b0 = mo35212b0(i4);
            if (i == b0) {
                return i4;
            }
            if (i < b0) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final <UT, UB> int mo35224k(C14436j0<UT, UB> j0Var, T t) {
        return j0Var.mo35578p(j0Var.mo35573k(t));
    }

    /* renamed from: k0 */
    public final int mo35225k0(int i) {
        return this.f35421a[i + 2];
    }

    /* renamed from: l */
    public final C14566o3.C14571e mo35226l(int i) {
        return (C14566o3.C14571e) this.f35422b[((i / 3) * 2) + 1];
    }

    /* renamed from: n0 */
    public final int mo35227n0(int i) {
        return this.f35421a[i + 1];
    }

    /* renamed from: p */
    public final <K, V, UT, UB> UB mo35228p(int i, int i2, Map<K, V> map, C14566o3.C14571e eVar, UB ub, C14436j0<UT, UB> j0Var) {
        this.f35437q.mo35488g(mo35195H(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.mo36035b(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = j0Var.mo35563a();
                }
                C14719t0.C14727h k0 = C14719t0.m63435k0(C14880y2.m64114b((C14880y2.C14881a) null, next.getKey(), next.getValue()));
                try {
                    C14880y2.m64115d(k0.mo36455b(), (C14880y2.C14881a) null, next.getKey(), next.getValue());
                    j0Var.mo35568f(ub, i2, k0.mo36454a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: q */
    public final <UT, UB> UB mo35229q(Object obj, int i, UB ub, C14436j0<UT, UB> j0Var) {
        C14566o3.C14571e l;
        int b0 = mo35212b0(i);
        Object T = C14634q4.m63030T(obj, m61659f0(mo35227n0(i)));
        if (T == null || (l = mo35226l(i)) == null) {
            return ub;
        }
        return mo35228p(i, b0, this.f35437q.mo35485d(T), l, ub, j0Var);
    }

    /* renamed from: s */
    public final void mo35230s(int i, Object obj, C14782uf ufVar) {
        if (obj instanceof String) {
            ufVar.mo35436c(i, (String) obj);
        } else {
            ufVar.mo35453t(i, (C14719t0) obj);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: t */
    public final <UT, UB, ET extends com.contentsquare.android.sdk.C14253cc.C14255b<ET>> void mo35231t(com.contentsquare.android.sdk.C14436j0<UT, UB> r17, com.contentsquare.android.sdk.C14517m3<ET> r18, T r19, com.contentsquare.android.sdk.C14475k6 r20, com.contentsquare.android.sdk.C14787v2 r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.mo34585g1()     // Catch:{ all -> 0x050b }
            int r3 = r8.mo35222i0(r1)     // Catch:{ all -> 0x050b }
            if (r3 >= 0) goto L_0x008f
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f35431k
        L_0x001e:
            int r1 = r8.f35432l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f35430j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo35229q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo35576n(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f35426f     // Catch:{ all -> 0x050b }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            com.contentsquare.android.sdk.ba r2 = r8.f35425e     // Catch:{ all -> 0x050b }
            r15 = r18
            java.lang.Object r1 = r15.mo35027c(r11, r2, r1)     // Catch:{ all -> 0x050b }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005d
            if (r14 != 0) goto L_0x004d
            com.contentsquare.android.sdk.cc r1 = r18.mo35033i(r19)     // Catch:{ all -> 0x050b }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r1 = r1.mo35028d(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x050b }
        L_0x005b:
            r13 = r1
            goto L_0x000d
        L_0x005d:
            boolean r1 = r9.mo35572j(r0)     // Catch:{ all -> 0x050b }
            if (r1 == 0) goto L_0x006a
            boolean r1 = r20.mo34589i1()     // Catch:{ all -> 0x050b }
            if (r1 == 0) goto L_0x0078
            goto L_0x000d
        L_0x006a:
            if (r13 != 0) goto L_0x0071
            java.lang.Object r1 = r9.mo35564b(r10)     // Catch:{ all -> 0x050b }
            r13 = r1
        L_0x0071:
            boolean r1 = r9.mo35577o(r13, r0)     // Catch:{ all -> 0x050b }
            if (r1 == 0) goto L_0x0078
            goto L_0x000d
        L_0x0078:
            int r0 = r8.f35431k
        L_0x007a:
            int r1 = r8.f35432l
            if (r0 >= r1) goto L_0x0089
            int[] r1 = r8.f35430j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo35229q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x007a
        L_0x0089:
            if (r13 == 0) goto L_0x008e
            r9.mo35576n(r10, r13)
        L_0x008e:
            return
        L_0x008f:
            r15 = r18
            int r4 = r8.mo35227n0(r3)     // Catch:{ all -> 0x050b }
            int r2 = m61663l0(r4)     // Catch:{ a -> 0x04c4 }
            switch(r2) {
                case 0: goto L_0x049a;
                case 1: goto L_0x048e;
                case 2: goto L_0x0484;
                case 3: goto L_0x047a;
                case 4: goto L_0x0470;
                case 5: goto L_0x0466;
                case 6: goto L_0x045c;
                case 7: goto L_0x0450;
                case 8: goto L_0x044c;
                case 9: goto L_0x0418;
                case 10: goto L_0x040c;
                case 11: goto L_0x0403;
                case 12: goto L_0x03e4;
                case 13: goto L_0x03db;
                case 14: goto L_0x03d2;
                case 15: goto L_0x03c5;
                case 16: goto L_0x03b8;
                case 17: goto L_0x0387;
                case 18: goto L_0x037a;
                case 19: goto L_0x036d;
                case 20: goto L_0x0360;
                case 21: goto L_0x0353;
                case 22: goto L_0x0346;
                case 23: goto L_0x0339;
                case 24: goto L_0x032c;
                case 25: goto L_0x031f;
                case 26: goto L_0x031a;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02ec;
                case 30: goto L_0x02d7;
                case 31: goto L_0x02ca;
                case 32: goto L_0x02bd;
                case 33: goto L_0x02b0;
                case 34: goto L_0x02a3;
                case 35: goto L_0x0297;
                case 36: goto L_0x028b;
                case 37: goto L_0x027f;
                case 38: goto L_0x0273;
                case 39: goto L_0x0267;
                case 40: goto L_0x025b;
                case 41: goto L_0x024f;
                case 42: goto L_0x0243;
                case 43: goto L_0x0237;
                case 44: goto L_0x0224;
                case 45: goto L_0x0218;
                case 46: goto L_0x020c;
                case 47: goto L_0x0200;
                case 48: goto L_0x01f4;
                case 49: goto L_0x01de;
                case 50: goto L_0x01cd;
                case 51: goto L_0x01bf;
                case 52: goto L_0x01b1;
                case 53: goto L_0x01a3;
                case 54: goto L_0x0195;
                case 55: goto L_0x0187;
                case 56: goto L_0x0179;
                case 57: goto L_0x016b;
                case 58: goto L_0x015d;
                case 59: goto L_0x0158;
                case 60: goto L_0x0121;
                case 61: goto L_0x0118;
                case 62: goto L_0x010b;
                case 63: goto L_0x00ef;
                case 64: goto L_0x00e2;
                case 65: goto L_0x00d5;
                case 66: goto L_0x00c8;
                case 67: goto L_0x00b8;
                case 68: goto L_0x00a4;
                default: goto L_0x009c;
            }     // Catch:{ a -> 0x04c4 }
        L_0x009c:
            if (r13 != 0) goto L_0x04a7
            java.lang.Object r1 = r17.mo35563a()     // Catch:{ a -> 0x04c4 }
            goto L_0x04a6
        L_0x00a4:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.h8 r2 = r8.mo35201O(r3)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r2 = r0.mo34591j1(r2, r11)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.C14634q4.m63042l(r10, r4, r2)     // Catch:{ a -> 0x04c4 }
        L_0x00b3:
            r8.mo35205T(r10, r1, r3)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x00b8:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            long r6 = r20.mo34574b()     // Catch:{ a -> 0x04c4 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x04c4 }
        L_0x00c4:
            com.contentsquare.android.sdk.C14634q4.m63042l(r10, r4, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x00b3
        L_0x00c8:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            int r2 = r20.mo34608s()     // Catch:{ a -> 0x04c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x00d5:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            long r6 = r20.mo34597m1()     // Catch:{ a -> 0x04c4 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x00e2:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            int r2 = r20.mo34576c()     // Catch:{ a -> 0x04c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x00ef:
            int r2 = r20.mo34590j()     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.o3$e r5 = r8.mo35226l(r3)     // Catch:{ a -> 0x04c4 }
            if (r5 == 0) goto L_0x00ff
            boolean r5 = r5.mo36035b(r2)     // Catch:{ a -> 0x04c4 }
            if (r5 == 0) goto L_0x03f5
        L_0x00ff:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04c4 }
        L_0x0107:
            com.contentsquare.android.sdk.C14634q4.m63042l(r10, r4, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x00b3
        L_0x010b:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            int r2 = r20.mo34582f()     // Catch:{ a -> 0x04c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x0118:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.t0 r2 = r20.mo34602p()     // Catch:{ a -> 0x04c4 }
            goto L_0x0107
        L_0x0121:
            boolean r2 = r8.mo35203Q(r10, r1, r3)     // Catch:{ a -> 0x04c4 }
            if (r2 == 0) goto L_0x0144
            long r5 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r2 = com.contentsquare.android.sdk.C14634q4.m63030T(r10, r5)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.h8 r5 = r8.mo35201O(r3)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r5 = r0.mo34587h1(r5, r11)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r2 = com.contentsquare.android.sdk.C14566o3.m62805g(r2, r5)     // Catch:{ a -> 0x04c4 }
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.C14634q4.m63042l(r10, r4, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x00b3
        L_0x0144:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.h8 r2 = r8.mo35201O(r3)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r2 = r0.mo34587h1(r2, r11)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.C14634q4.m63042l(r10, r4, r2)     // Catch:{ a -> 0x04c4 }
            r8.mo35196I(r10, r3)     // Catch:{ a -> 0x04c4 }
            goto L_0x00b3
        L_0x0158:
            r8.mo35234w(r10, r4, r0)     // Catch:{ a -> 0x04c4 }
            goto L_0x00b3
        L_0x015d:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            boolean r2 = r20.mo34577c1()     // Catch:{ a -> 0x04c4 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x016b:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            int r2 = r20.mo34598n()     // Catch:{ a -> 0x04c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x0179:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            long r6 = r20.mo34596m()     // Catch:{ a -> 0x04c4 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x0187:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            int r2 = r20.mo34569Y()     // Catch:{ a -> 0x04c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x0195:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            long r6 = r20.mo34594l()     // Catch:{ a -> 0x04c4 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x01a3:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            long r6 = r20.mo34588i()     // Catch:{ a -> 0x04c4 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x01b1:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            float r2 = r20.mo34572a()     // Catch:{ a -> 0x04c4 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x01bf:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            double r6 = r20.mo34581e1()     // Catch:{ a -> 0x04c4 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x04c4 }
            goto L_0x00c4
        L_0x01cd:
            java.lang.Object r4 = r8.mo35195H(r3)     // Catch:{ a -> 0x04c4 }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mo35236y(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x01de:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.h8 r6 = r8.mo35201O(r3)     // Catch:{ a -> 0x04c4 }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.mo35237z(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x01f4:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x01fa:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x02ab
        L_0x0200:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x0206:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x02b8
        L_0x020c:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x0212:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x02c5
        L_0x0218:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x021e:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x02d2
        L_0x0224:
            com.contentsquare.android.sdk.ld r2 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            java.util.List r2 = r2.mo35829e(r10, r4)     // Catch:{ a -> 0x04c4 }
            r0.mo34573a1(r2)     // Catch:{ a -> 0x04c4 }
        L_0x0231:
            com.contentsquare.android.sdk.o3$e r3 = r8.mo35226l(r3)     // Catch:{ a -> 0x04c4 }
            goto L_0x02e6
        L_0x0237:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x023d:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x02f4
        L_0x0243:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x0249:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x0327
        L_0x024f:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x0255:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x0334
        L_0x025b:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x0261:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x0341
        L_0x0267:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x026d:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x034e
        L_0x0273:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x0279:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x035b
        L_0x027f:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x0285:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x0368
        L_0x028b:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x0291:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x0375
        L_0x0297:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
        L_0x029d:
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x0382
        L_0x02a3:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x01fa
        L_0x02ab:
            r0.mo34593k1(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x02b0:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0206
        L_0x02b8:
            r0.mo34565V0(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x02bd:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0212
        L_0x02c5:
            r0.mo34583f1(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x02ca:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x021e
        L_0x02d2:
            r0.mo34601o1(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x02d7:
            com.contentsquare.android.sdk.ld r2 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            java.util.List r2 = r2.mo35829e(r10, r4)     // Catch:{ a -> 0x04c4 }
            r0.mo34573a1(r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x0231
        L_0x02e6:
            java.lang.Object r1 = com.contentsquare.android.sdk.C14646q9.m63157j(r1, r2, r3, r13, r9)     // Catch:{ a -> 0x04c4 }
            goto L_0x005b
        L_0x02ec:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x023d
        L_0x02f4:
            r0.mo34560R0(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x02f9:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            java.util.List r1 = r1.mo35829e(r10, r2)     // Catch:{ a -> 0x04c4 }
            r0.mo34562T0(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x0308:
            com.contentsquare.android.sdk.h8 r5 = r8.mo35201O(r3)     // Catch:{ a -> 0x04c4 }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.mo35235x(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x031a:
            r8.mo35197J(r10, r4, r0)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x031f:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0249
        L_0x0327:
            r0.mo34564V(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x032c:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0255
        L_0x0334:
            r0.mo34579d1(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x0339:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0261
        L_0x0341:
            r0.mo34575b1(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x0346:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x026d
        L_0x034e:
            r0.mo34571Z0(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x0353:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0279
        L_0x035b:
            r0.mo34566W(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x0360:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0285
        L_0x0368:
            r0.mo34568X0(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x036d:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0291
        L_0x0375:
            r0.mo34563U0(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x037a:
            com.contentsquare.android.sdk.ld r1 = r8.f35434n     // Catch:{ a -> 0x04c4 }
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x029d
        L_0x0382:
            r0.mo34610s1(r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x0387:
            boolean r1 = r8.mo35191A(r10, r3)     // Catch:{ a -> 0x04c4 }
            if (r1 == 0) goto L_0x03a7
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r1 = com.contentsquare.android.sdk.C14634q4.m63030T(r10, r1)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.h8 r2 = r8.mo35201O(r3)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r2 = r0.mo34591j1(r2, r11)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r1 = com.contentsquare.android.sdk.C14566o3.m62805g(r1, r2)     // Catch:{ a -> 0x04c4 }
        L_0x03a1:
            long r2 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0434
        L_0x03a7:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.h8 r4 = r8.mo35201O(r3)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r4 = r0.mo34591j1(r4, r11)     // Catch:{ a -> 0x04c4 }
        L_0x03b3:
            com.contentsquare.android.sdk.C14634q4.m63042l(r10, r1, r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0447
        L_0x03b8:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            long r4 = r20.mo34574b()     // Catch:{ a -> 0x04c4 }
        L_0x03c0:
            com.contentsquare.android.sdk.C14634q4.m63041k(r10, r1, r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0447
        L_0x03c5:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            int r4 = r20.mo34608s()     // Catch:{ a -> 0x04c4 }
        L_0x03cd:
            com.contentsquare.android.sdk.C14634q4.m63040j(r10, r1, r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0447
        L_0x03d2:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            long r4 = r20.mo34597m1()     // Catch:{ a -> 0x04c4 }
            goto L_0x03c0
        L_0x03db:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            int r4 = r20.mo34576c()     // Catch:{ a -> 0x04c4 }
            goto L_0x03cd
        L_0x03e4:
            int r2 = r20.mo34590j()     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.o3$e r5 = r8.mo35226l(r3)     // Catch:{ a -> 0x04c4 }
            if (r5 == 0) goto L_0x03fb
            boolean r5 = r5.mo36035b(r2)     // Catch:{ a -> 0x04c4 }
            if (r5 == 0) goto L_0x03f5
            goto L_0x03fb
        L_0x03f5:
            java.lang.Object r1 = com.contentsquare.android.sdk.C14646q9.m63155h(r1, r2, r13, r9)     // Catch:{ a -> 0x04c4 }
            goto L_0x005b
        L_0x03fb:
            long r4 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.C14634q4.m63040j(r10, r4, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x0447
        L_0x0403:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            int r4 = r20.mo34582f()     // Catch:{ a -> 0x04c4 }
            goto L_0x03cd
        L_0x040c:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.t0 r4 = r20.mo34602p()     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.C14634q4.m63042l(r10, r1, r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0447
        L_0x0418:
            boolean r1 = r8.mo35191A(r10, r3)     // Catch:{ a -> 0x04c4 }
            if (r1 == 0) goto L_0x0439
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r1 = com.contentsquare.android.sdk.C14634q4.m63030T(r10, r1)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.h8 r2 = r8.mo35201O(r3)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r2 = r0.mo34587h1(r2, r11)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r1 = com.contentsquare.android.sdk.C14566o3.m62805g(r1, r2)     // Catch:{ a -> 0x04c4 }
            goto L_0x03a1
        L_0x0434:
            com.contentsquare.android.sdk.C14634q4.m63042l(r10, r2, r1)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x0439:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.h8 r4 = r8.mo35201O(r3)     // Catch:{ a -> 0x04c4 }
            java.lang.Object r4 = r0.mo34587h1(r4, r11)     // Catch:{ a -> 0x04c4 }
            goto L_0x03b3
        L_0x0447:
            r8.mo35196I(r10, r3)     // Catch:{ a -> 0x04c4 }
            goto L_0x000d
        L_0x044c:
            r8.mo35234w(r10, r4, r0)     // Catch:{ a -> 0x04c4 }
            goto L_0x0447
        L_0x0450:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            boolean r4 = r20.mo34577c1()     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.C14634q4.m63055y(r10, r1, r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0447
        L_0x045c:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            int r4 = r20.mo34598n()     // Catch:{ a -> 0x04c4 }
            goto L_0x03cd
        L_0x0466:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            long r4 = r20.mo34596m()     // Catch:{ a -> 0x04c4 }
            goto L_0x03c0
        L_0x0470:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            int r4 = r20.mo34569Y()     // Catch:{ a -> 0x04c4 }
            goto L_0x03cd
        L_0x047a:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            long r4 = r20.mo34594l()     // Catch:{ a -> 0x04c4 }
            goto L_0x03c0
        L_0x0484:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            long r4 = r20.mo34588i()     // Catch:{ a -> 0x04c4 }
            goto L_0x03c0
        L_0x048e:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            float r4 = r20.mo34572a()     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.C14634q4.m63039i(r10, r1, r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0447
        L_0x049a:
            long r1 = m61659f0(r4)     // Catch:{ a -> 0x04c4 }
            double r4 = r20.mo34581e1()     // Catch:{ a -> 0x04c4 }
            com.contentsquare.android.sdk.C14634q4.m63038h(r10, r1, r4)     // Catch:{ a -> 0x04c4 }
            goto L_0x0447
        L_0x04a6:
            r13 = r1
        L_0x04a7:
            boolean r1 = r9.mo35577o(r13, r0)     // Catch:{ a -> 0x04c4 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f35431k
        L_0x04af:
            int r1 = r8.f35432l
            if (r0 >= r1) goto L_0x04be
            int[] r1 = r8.f35430j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo35229q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x04af
        L_0x04be:
            if (r13 == 0) goto L_0x04c3
            r9.mo35576n(r10, r13)
        L_0x04c3:
            return
        L_0x04c4:
            boolean r1 = r9.mo35572j(r0)     // Catch:{ all -> 0x050b }
            if (r1 == 0) goto L_0x04e7
            boolean r1 = r20.mo34589i1()     // Catch:{ all -> 0x050b }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f35431k
        L_0x04d2:
            int r1 = r8.f35432l
            if (r0 >= r1) goto L_0x04e1
            int[] r1 = r8.f35430j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo35229q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x04d2
        L_0x04e1:
            if (r13 == 0) goto L_0x04e6
            r9.mo35576n(r10, r13)
        L_0x04e6:
            return
        L_0x04e7:
            if (r13 != 0) goto L_0x04ee
            java.lang.Object r1 = r9.mo35564b(r10)     // Catch:{ all -> 0x050b }
            r13 = r1
        L_0x04ee:
            boolean r1 = r9.mo35577o(r13, r0)     // Catch:{ all -> 0x050b }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f35431k
        L_0x04f6:
            int r1 = r8.f35432l
            if (r0 >= r1) goto L_0x0505
            int[] r1 = r8.f35430j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo35229q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x04f6
        L_0x0505:
            if (r13 == 0) goto L_0x050a
            r9.mo35576n(r10, r13)
        L_0x050a:
            return
        L_0x050b:
            r0 = move-exception
            int r1 = r8.f35431k
        L_0x050e:
            int r2 = r8.f35432l
            if (r1 >= r2) goto L_0x051d
            int[] r2 = r8.f35430j
            r2 = r2[r1]
            java.lang.Object r13 = r8.mo35229q(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x050e
        L_0x051d:
            if (r13 == 0) goto L_0x0522
            r9.mo35576n(r10, r13)
        L_0x0522:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14344fc.mo35231t(com.contentsquare.android.sdk.j0, com.contentsquare.android.sdk.m3, java.lang.Object, com.contentsquare.android.sdk.k6, com.contentsquare.android.sdk.v2):void");
    }

    /* renamed from: u */
    public final <UT, UB> void mo35232u(C14436j0<UT, UB> j0Var, T t, C14782uf ufVar) {
        j0Var.mo35575m(j0Var.mo35573k(t), ufVar);
    }

    /* renamed from: v */
    public final <K, V> void mo35233v(C14782uf ufVar, int i, Object obj, int i2) {
        if (obj != null) {
            this.f35437q.mo35488g(mo35195H(i2));
            ufVar.mo35431O(i, (C14880y2.C14881a) null, this.f35437q.mo35489h(obj));
        }
    }

    /* renamed from: w */
    public final void mo35234w(Object obj, int i, C14475k6 k6Var) {
        long f0;
        Object p;
        if (m61655W(i)) {
            f0 = m61659f0(i);
            p = k6Var.mo34592k();
        } else if (this.f35427g) {
            f0 = m61659f0(i);
            p = k6Var.mo34561S0();
        } else {
            f0 = m61659f0(i);
            p = k6Var.mo34602p();
        }
        C14634q4.m63042l(obj, f0, p);
    }

    /* renamed from: x */
    public final <E> void mo35235x(Object obj, int i, C14475k6 k6Var, C14398h8<E> h8Var, C14787v2 v2Var) {
        k6Var.mo34567W0(this.f35434n.mo35829e(obj, m61659f0(i)), h8Var, v2Var);
    }

    /* renamed from: y */
    public final <K, V> void mo35236y(Object obj, int i, Object obj2, C14787v2 v2Var, C14475k6 k6Var) {
        long f0 = m61659f0(mo35227n0(i));
        Object T = C14634q4.m63030T(obj, f0);
        if (T == null) {
            T = this.f35437q.mo35483b(obj2);
            C14634q4.m63042l(obj, f0, T);
        } else if (this.f35437q.mo35486e(T)) {
            Object b = this.f35437q.mo35483b(obj2);
            this.f35437q.mo35484c(b, T);
            C14634q4.m63042l(obj, f0, b);
            T = b;
        }
        Map<?, ?> d = this.f35437q.mo35485d(T);
        this.f35437q.mo35488g(obj2);
        k6Var.mo34595l1(d, (C14880y2.C14881a) null, v2Var);
    }

    /* renamed from: z */
    public final <E> void mo35237z(Object obj, long j, C14475k6 k6Var, C14398h8<E> h8Var, C14787v2 v2Var) {
        k6Var.mo34570Y0(this.f35434n.mo35829e(obj, j), h8Var, v2Var);
    }
}
