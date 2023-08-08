package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class a10<T> implements j10<T> {

    /* renamed from: p */
    public static final int[] f71124p = new int[0];

    /* renamed from: q */
    public static final Unsafe f71125q = C29725t.m121140l();

    /* renamed from: a */
    public final int[] f71126a;

    /* renamed from: b */
    public final Object[] f71127b;

    /* renamed from: c */
    public final int f71128c;

    /* renamed from: d */
    public final int f71129d;

    /* renamed from: e */
    public final x00 f71130e;

    /* renamed from: f */
    public final boolean f71131f;

    /* renamed from: g */
    public final boolean f71132g;

    /* renamed from: h */
    public final int[] f71133h;

    /* renamed from: i */
    public final int f71134i;

    /* renamed from: j */
    public final int f71135j;

    /* renamed from: k */
    public final k00 f71136k;

    /* renamed from: l */
    public final C29355j<?, ?> f71137l;

    /* renamed from: m */
    public final C29945yy<?> f71138m;

    /* renamed from: n */
    public final d10 f71139n;

    /* renamed from: o */
    public final s00 f71140o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.google.android.gms.internal.mlkit_vision_text_bundled_common.d10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.mlkit_vision_text_bundled_common.s00} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?>] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v11, types: [com.google.android.gms.internal.mlkit_vision_text_bundled_common.k00] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.mlkit_vision_text_bundled_common.j<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a10(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.mlkit_vision_text_bundled_common.d10 r17, com.google.android.gms.internal.mlkit_vision_text_bundled_common.k00 r18, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29355j<?, ?> r19, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29945yy<?> r20, com.google.android.gms.internal.mlkit_vision_text_bundled_common.s00 r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.f71126a = r3
            r3 = r7
            r0.f71127b = r3
            r3 = r8
            r0.f71128c = r3
            r3 = r9
            r0.f71129d = r3
            r3 = r11
            r0.f71132g = r3
            r3 = 0
            if (r2 == 0) goto L_0x0020
            boolean r4 = r2.mo84923g(r10)
            if (r4 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            r0.f71131f = r3
            r3 = r13
            r0.f71133h = r3
            r3 = r14
            r0.f71134i = r3
            r3 = r15
            r0.f71135j = r3
            r3 = r16
            r0.f71139n = r3
            r3 = r17
            r0.f71136k = r3
            r3 = r18
            r0.f71137l = r3
            r0.f71138m = r2
            r0.f71130e = r1
            r1 = r20
            r0.f71140o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00, boolean, boolean, int[], int, int, com.google.android.gms.internal.mlkit_vision_text_bundled_common.d10, com.google.android.gms.internal.mlkit_vision_text_bundled_common.k00, com.google.android.gms.internal.mlkit_vision_text_bundled_common.j, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy, com.google.android.gms.internal.mlkit_vision_text_bundled_common.s00, byte[]):void");
    }

    /* renamed from: B */
    public static <T> boolean m120087B(T t, long j) {
        return ((Boolean) C29725t.m121139k(t, j)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return r2 + 4;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m120088C(byte[] r1, int r2, int r3, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaay r4, java.lang.Class<?> r5, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29944yx r6) throws java.io.IOException {
        /*
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaay r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaay.DOUBLE
            int r4 = r4.ordinal()
            switch(r4) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x0094;
                case 2: goto L_0x0087;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x006f;
                case 6: goto L_0x0064;
                case 7: goto L_0x004e;
                case 8: goto L_0x0049;
                case 9: goto L_0x0009;
                case 10: goto L_0x003b;
                case 11: goto L_0x0035;
                case 12: goto L_0x007a;
                case 13: goto L_0x007a;
                case 14: goto L_0x0064;
                case 15: goto L_0x006f;
                case 16: goto L_0x0023;
                case 17: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0011:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r1, r2, r6)
            long r2 = r6.f71562b
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120854b(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f71563c = r2
            goto L_0x00b5
        L_0x0023:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r1, r2, r6)
            int r2 = r6.f71561a
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120853a(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f71563c = r2
            goto L_0x00b5
        L_0x0035:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121546a(r1, r2, r6)
            goto L_0x00b5
        L_0x003b:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.g10 r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.g10.m120414a()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r4 = r4.mo84636b(r5)
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121549d(r4, r1, r2, r3, r6)
            goto L_0x00b5
        L_0x0049:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121553h(r1, r2, r6)
            goto L_0x00b5
        L_0x004e:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r1, r2, r6)
            long r2 = r6.f71562b
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x005c
            r2 = 1
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.f71563c = r2
            goto L_0x00b5
        L_0x0064:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.f71563c = r1
            goto L_0x00a2
        L_0x006f:
            long r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.f71563c = r1
            goto L_0x00b3
        L_0x007a:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r1, r2, r6)
            int r2 = r6.f71561a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f71563c = r2
            goto L_0x00b5
        L_0x0087:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r1, r2, r6)
            long r2 = r6.f71562b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f71563c = r2
            goto L_0x00b5
        L_0x0094:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r1, r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.f71563c = r1
        L_0x00a2:
            int r1 = r2 + 4
            goto L_0x00b5
        L_0x00a5:
            long r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r1, r2)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.f71563c = r1
        L_0x00b3:
            int r1 = r2 + 8
        L_0x00b5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.m120088C(byte[], int, int, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaay, java.lang.Class, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yx):int");
    }

    /* renamed from: D */
    public static final void m120089D(int i, Object obj, C29947z zVar) throws IOException {
        if (obj instanceof String) {
            zVar.mo84873v(i, (String) obj);
        } else {
            zVar.mo84856e(i, (zbwp) obj);
        }
    }

    /* renamed from: F */
    public static C29392k m120090F(Object obj) {
        C29502mz mzVar = (C29502mz) obj;
        C29392k kVar = mzVar.zbc;
        if (kVar != C29392k.m120586c()) {
            return kVar;
        }
        C29392k e = C29392k.m120588e();
        mzVar.zbc = e;
        return e;
    }

    /* renamed from: G */
    public static <T> a10<T> m120091G(Class<T> cls, u00 u00, d10 d10, k00 k00, C29355j<?, ?> jVar, C29945yy<?> yyVar, s00 s00) {
        if (u00 instanceof i10) {
            return m120092H((i10) u00, d10, k00, jVar, yyVar, s00);
        }
        C29282h hVar = (C29282h) u00;
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
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10<T> m120092H(com.google.android.gms.internal.mlkit_vision_text_bundled_common.i10 r34, com.google.android.gms.internal.mlkit_vision_text_bundled_common.d10 r35, com.google.android.gms.internal.mlkit_vision_text_bundled_common.k00 r36, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29355j<?, ?> r37, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29945yy<?> r38, com.google.android.gms.internal.mlkit_vision_text_bundled_common.s00 r39) {
        /*
            int r0 = r34.mo84659z()
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r2
        L_0x000b:
            java.lang.String r0 = r34.mo84674a()
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
            int[] r6 = f71124p
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
            sun.misc.Unsafe r15 = f71125q
            java.lang.Object[] r17 = r34.mo84675b()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r18 = r34.mo84658i()
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
            java.lang.reflect.Field r12 = m120098o(r2, r12)
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
            java.lang.reflect.Field r8 = m120098o(r2, r8)
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
            java.lang.reflect.Field r8 = m120098o(r2, r8)
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
            java.lang.reflect.Field r11 = m120098o(r2, r11)
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
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10 r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10
            r4 = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r9 = r34.mo84658i()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.m120092H(com.google.android.gms.internal.mlkit_vision_text_bundled_common.i10, com.google.android.gms.internal.mlkit_vision_text_bundled_common.d10, com.google.android.gms.internal.mlkit_vision_text_bundled_common.k00, com.google.android.gms.internal.mlkit_vision_text_bundled_common.j, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy, com.google.android.gms.internal.mlkit_vision_text_bundled_common.s00):com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10");
    }

    /* renamed from: I */
    public static <T> double m120093I(T t, long j) {
        return ((Double) C29725t.m121139k(t, j)).doubleValue();
    }

    /* renamed from: J */
    public static <T> float m120094J(T t, long j) {
        return ((Float) C29725t.m121139k(t, j)).floatValue();
    }

    /* renamed from: M */
    public static <T> int m120095M(T t, long j) {
        return ((Integer) C29725t.m121139k(t, j)).intValue();
    }

    /* renamed from: i */
    public static int m120096i(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: k */
    public static <T> long m120097k(T t, long j) {
        return ((Long) C29725t.m121139k(t, j)).longValue();
    }

    /* renamed from: o */
    public static Field m120098o(Class<?> cls, String str) {
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
    public static boolean m120099z(Object obj, int i, j10 j10) {
        return j10.mo84486d(C29725t.m121139k(obj, (long) (i & 1048575)));
    }

    /* renamed from: A */
    public final boolean mo84471A(T t, int i, int i2) {
        if (C29725t.m121136h(t, (long) (mo84481T(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0368, code lost:
        if (r1 != r4) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0383, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03af, code lost:
        if (r1 != r15) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d1, code lost:
        if (r1 != r15) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f0, code lost:
        r2 = r7 | r23;
        r7 = r31;
        r3 = r6;
        r4 = r8;
        r6 = r2;
        r2 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x021b, code lost:
        r3 = r2;
        r20 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0297, code lost:
        r6 = r7 | r23;
        r7 = r31;
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x029c, code lost:
        r2 = r12;
        r3 = r14;
        r14 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02a2, code lost:
        r20 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c0, code lost:
        r0 = r33;
        r21 = r7;
        r27 = r11;
        r26 = r19;
        r7 = r31;
        r19 = r8;
        r8 = r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo84472E(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29944yx r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r0 = r29
            r13 = r30
            r14 = r32
            r12 = r33
            r10 = r34
            sun.misc.Unsafe r11 = f71125q
            r16 = 0
            r1 = r31
            r2 = r16
            r4 = r2
            r6 = r4
            r3 = -1
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            r17 = 0
            if (r1 >= r14) goto L_0x043f
            int r2 = r1 + 1
            byte r1 = r13[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121556k(r1, r13, r2, r10)
            int r2 = r10.f71561a
            r5 = r2
            r2 = r1
            goto L_0x002e
        L_0x002d:
            r5 = r1
        L_0x002e:
            int r1 = r5 >>> 3
            r9 = r5 & 7
            r8 = 3
            if (r1 <= r3) goto L_0x003b
            int r4 = r4 / r8
            int r3 = r15.mo84480S(r1, r4)
            goto L_0x003f
        L_0x003b:
            int r3 = r15.mo84479R(r1)
        L_0x003f:
            r4 = -1
            if (r3 != r4) goto L_0x0051
            r20 = r1
            r3 = r2
            r26 = r4
            r8 = r5
            r21 = r6
            r27 = r11
            r0 = r12
            r19 = r16
            goto L_0x03d4
        L_0x0051:
            int[] r4 = r15.f71126a
            int r20 = r3 + 1
            r4 = r4[r20]
            int r8 = m120096i(r4)
            r20 = r1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r4 & r18
            r22 = r4
            r21 = r5
            long r4 = (long) r1
            r1 = 17
            if (r8 > r1) goto L_0x02cf
            int[] r1 = r15.f71126a
            int r23 = r3 + 2
            r1 = r1[r23]
            int r23 = r1 >>> 20
            r12 = 1
            int r23 = r12 << r23
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r12
            if (r1 == r7) goto L_0x0089
            if (r7 == r12) goto L_0x0082
            long r12 = (long) r7
            r11.putInt(r0, r12, r6)
        L_0x0082:
            long r6 = (long) r1
            int r6 = r11.getInt(r0, r6)
            r12 = r1
            goto L_0x008a
        L_0x0089:
            r12 = r7
        L_0x008a:
            r7 = r6
            r1 = 5
            switch(r8) {
                case 0: goto L_0x027b;
                case 1: goto L_0x025f;
                case 2: goto L_0x0239;
                case 3: goto L_0x0239;
                case 4: goto L_0x0220;
                case 5: goto L_0x01fa;
                case 6: goto L_0x01da;
                case 7: goto L_0x01b9;
                case 8: goto L_0x0196;
                case 9: goto L_0x0167;
                case 10: goto L_0x014e;
                case 11: goto L_0x0220;
                case 12: goto L_0x0115;
                case 13: goto L_0x01da;
                case 14: goto L_0x01fa;
                case 15: goto L_0x00f9;
                case 16: goto L_0x00bf;
                default: goto L_0x008f;
            }
        L_0x008f:
            r13 = r30
            r8 = r3
            r31 = r12
            r14 = r20
            r12 = r21
            r1 = 3
            r19 = -1
            r3 = r2
            if (r9 != r1) goto L_0x02a2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r1 = r15.mo84493m(r8)
            int r2 = r14 << 3
            r6 = r2 | 4
            r2 = r30
            r20 = r14
            r13 = r4
            r4 = r32
            r5 = r6
            r6 = r34
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121548c(r1, r2, r3, r4, r5, r6)
            r2 = r7 & r23
            if (r2 != 0) goto L_0x02a5
            java.lang.Object r2 = r10.f71563c
            r11.putObject(r0, r13, r2)
            goto L_0x02b2
        L_0x00bf:
            if (r9 != 0) goto L_0x00ed
            r13 = r30
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r13, r2, r10)
            long r1 = r10.f71562b
            long r24 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120854b(r1)
            r9 = r20
            r1 = r11
            r2 = r29
            r6 = r3
            r19 = -1
            r3 = r4
            r17 = r8
            r31 = r12
            r12 = r21
            r8 = r6
            r5 = r24
            r1.putLong(r2, r3, r5)
            r6 = r7 | r23
            r7 = r31
            r4 = r8
            r3 = r9
            r2 = r12
            r1 = r17
            goto L_0x031c
        L_0x00ed:
            r13 = r30
            r8 = r3
            r31 = r12
            r12 = r21
            r19 = -1
            r3 = r2
            goto L_0x02c0
        L_0x00f9:
            r13 = r30
            r8 = r3
            r31 = r12
            r6 = r20
            r12 = r21
            r19 = -1
            if (r9 != 0) goto L_0x021b
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r13, r2, r10)
            int r2 = r10.f71561a
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120853a(r2)
            r11.putInt(r0, r4, r2)
            goto L_0x01f0
        L_0x0115:
            r13 = r30
            r8 = r3
            r31 = r12
            r6 = r20
            r12 = r21
            r19 = -1
            if (r9 != 0) goto L_0x021b
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r13, r2, r10)
            int r2 = r10.f71561a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.qz r3 = r15.mo84492l(r8)
            if (r3 == 0) goto L_0x0149
            boolean r3 = r3.mo84506a(r2)
            if (r3 == 0) goto L_0x0135
            goto L_0x0149
        L_0x0135:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.k r3 = m120090F(r29)
            long r4 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3.mo84698h(r12, r2)
            r3 = r6
            r6 = r7
            r4 = r8
            r2 = r12
            r7 = r31
            goto L_0x031c
        L_0x0149:
            r11.putInt(r0, r4, r2)
            goto L_0x01f0
        L_0x014e:
            r13 = r30
            r8 = r3
            r31 = r12
            r6 = r20
            r12 = r21
            r1 = 2
            r19 = -1
            if (r9 != r1) goto L_0x021b
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121546a(r13, r2, r10)
            java.lang.Object r2 = r10.f71563c
            r11.putObject(r0, r4, r2)
            goto L_0x01f0
        L_0x0167:
            r13 = r30
            r8 = r3
            r31 = r12
            r6 = r20
            r12 = r21
            r1 = 2
            r19 = -1
            if (r9 != r1) goto L_0x021b
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r1 = r15.mo84493m(r8)
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121549d(r1, r13, r2, r14, r10)
            r2 = r7 & r23
            if (r2 != 0) goto L_0x0188
            java.lang.Object r2 = r10.f71563c
            r11.putObject(r0, r4, r2)
            goto L_0x01f0
        L_0x0188:
            java.lang.Object r2 = r11.getObject(r0, r4)
            java.lang.Object r3 = r10.f71563c
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121349g(r2, r3)
            r11.putObject(r0, r4, r2)
            goto L_0x01f0
        L_0x0196:
            r13 = r30
            r8 = r3
            r31 = r12
            r6 = r20
            r12 = r21
            r1 = 2
            r19 = -1
            if (r9 != r1) goto L_0x021b
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r22 & r1
            if (r1 != 0) goto L_0x01af
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121552g(r13, r2, r10)
            goto L_0x01b3
        L_0x01af:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121553h(r13, r2, r10)
        L_0x01b3:
            java.lang.Object r2 = r10.f71563c
            r11.putObject(r0, r4, r2)
            goto L_0x01f0
        L_0x01b9:
            r13 = r30
            r8 = r3
            r31 = r12
            r6 = r20
            r12 = r21
            r19 = -1
            if (r9 != 0) goto L_0x021b
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r13, r2, r10)
            long r2 = r10.f71562b
            r20 = 0
            int r2 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x01d4
            r2 = 1
            goto L_0x01d6
        L_0x01d4:
            r2 = r16
        L_0x01d6:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121146r(r0, r4, r2)
            goto L_0x01f0
        L_0x01da:
            r13 = r30
            r8 = r3
            r31 = r12
            r6 = r20
            r12 = r21
            r19 = -1
            if (r9 != r1) goto L_0x021b
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r13, r2)
            r11.putInt(r0, r4, r1)
            int r1 = r2 + 4
        L_0x01f0:
            r2 = r7 | r23
            r7 = r31
            r3 = r6
            r4 = r8
            r6 = r2
            r2 = r12
            goto L_0x031c
        L_0x01fa:
            r13 = r30
            r8 = r3
            r31 = r12
            r6 = r20
            r12 = r21
            r1 = 1
            r19 = -1
            if (r9 != r1) goto L_0x021b
            long r20 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r13, r2)
            r1 = r11
            r9 = r2
            r2 = r29
            r3 = r4
            r14 = r6
            r5 = r20
            r1.putLong(r2, r3, r5)
            int r1 = r9 + 8
            goto L_0x0297
        L_0x021b:
            r3 = r2
            r20 = r6
            goto L_0x02c0
        L_0x0220:
            r13 = r30
            r8 = r3
            r31 = r12
            r14 = r20
            r12 = r21
            r19 = -1
            r3 = r2
            if (r9 != 0) goto L_0x02a2
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r13, r3, r10)
            int r2 = r10.f71561a
            r11.putInt(r0, r4, r2)
            goto L_0x0297
        L_0x0239:
            r13 = r30
            r8 = r3
            r31 = r12
            r14 = r20
            r12 = r21
            r19 = -1
            r3 = r2
            if (r9 != 0) goto L_0x02a2
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r13, r3, r10)
            long r2 = r10.f71562b
            r1 = r11
            r20 = r2
            r2 = r29
            r3 = r4
            r5 = r20
            r1.putLong(r2, r3, r5)
            r6 = r7 | r23
            r7 = r31
            r4 = r8
            r1 = r9
            goto L_0x029c
        L_0x025f:
            r13 = r30
            r8 = r3
            r31 = r12
            r14 = r20
            r12 = r21
            r19 = -1
            r3 = r2
            if (r9 != r1) goto L_0x02a2
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r13, r3)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121149u(r0, r4, r1)
            int r1 = r3 + 4
            goto L_0x0297
        L_0x027b:
            r13 = r30
            r8 = r3
            r31 = r12
            r14 = r20
            r12 = r21
            r1 = 1
            r19 = -1
            r3 = r2
            if (r9 != r1) goto L_0x02a2
            long r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r13, r3)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121148t(r0, r4, r1)
            int r1 = r3 + 8
        L_0x0297:
            r6 = r7 | r23
            r7 = r31
            r4 = r8
        L_0x029c:
            r2 = r12
            r3 = r14
            r14 = r32
            goto L_0x031c
        L_0x02a2:
            r20 = r14
            goto L_0x02c0
        L_0x02a5:
            java.lang.Object r2 = r11.getObject(r0, r13)
            java.lang.Object r3 = r10.f71563c
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121349g(r2, r3)
            r11.putObject(r0, r13, r2)
        L_0x02b2:
            r6 = r7 | r23
            r13 = r30
            r7 = r31
            r14 = r32
            r4 = r8
            r2 = r12
            r3 = r20
            goto L_0x031c
        L_0x02c0:
            r0 = r33
            r21 = r7
            r27 = r11
            r26 = r19
            r7 = r31
            r19 = r8
            r8 = r12
            goto L_0x03d4
        L_0x02cf:
            r13 = r4
            r5 = r8
            r12 = r21
            r19 = -1
            r8 = r3
            r3 = r2
            r1 = 27
            if (r5 != r1) goto L_0x0331
            r1 = 2
            if (r9 != r1) goto L_0x0320
            java.lang.Object r1 = r11.getObject(r0, r13)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wz r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29872wz) r1
            boolean r2 = r1.mo84839z()
            if (r2 != 0) goto L_0x02fb
            int r2 = r1.size()
            if (r2 != 0) goto L_0x02f3
            r2 = 10
            goto L_0x02f4
        L_0x02f3:
            int r2 = r2 + r2
        L_0x02f4:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wz r1 = r1.mo84516P1(r2)
            r11.putObject(r0, r13, r1)
        L_0x02fb:
            r9 = r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r1 = r15.mo84493m(r8)
            r2 = r12
            r4 = r3
            r3 = r30
            r5 = r32
            r21 = r6
            r6 = r9
            r23 = r7
            r7 = r34
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121550e(r1, r2, r3, r4, r5, r6, r7)
            r13 = r30
            r14 = r32
            r4 = r8
            r3 = r20
            r6 = r21
            r7 = r23
        L_0x031c:
            r12 = r33
            goto L_0x001a
        L_0x0320:
            r21 = r6
            r23 = r7
            r0 = r33
            r15 = r3
            r27 = r11
            r18 = r12
            r26 = r19
            r19 = r8
            goto L_0x03b2
        L_0x0331:
            r4 = r3
            r21 = r6
            r23 = r7
            r1 = 49
            if (r5 > r1) goto L_0x0385
            r6 = r22
            long r6 = (long) r6
            r1 = r28
            r2 = r29
            r3 = r30
            r31 = r4
            r22 = r5
            r5 = r32
            r24 = r6
            r6 = r12
            r7 = r20
            r26 = r19
            r19 = r8
            r8 = r9
            r9 = r19
            r0 = r10
            r27 = r11
            r10 = r24
            r0 = r33
            r18 = r12
            r12 = r22
            r15 = r34
            int r1 = r1.mo84478Q(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r15)
            r15 = r31
            if (r1 == r15) goto L_0x0383
        L_0x036a:
            r15 = r28
            r13 = r30
            r14 = r32
            r10 = r34
            r12 = r0
            r2 = r18
            r4 = r19
            r3 = r20
            r6 = r21
            r7 = r23
            r11 = r27
            r0 = r29
            goto L_0x001a
        L_0x0383:
            r3 = r1
            goto L_0x03b3
        L_0x0385:
            r0 = r33
            r15 = r4
            r27 = r11
            r18 = r12
            r26 = r19
            r6 = r22
            r22 = r5
            r19 = r8
            r1 = 50
            r10 = r22
            if (r10 != r1) goto L_0x03b8
            r1 = 2
            if (r9 != r1) goto L_0x03b2
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r15
            r5 = r32
            r6 = r19
            r7 = r13
            r9 = r34
            int r1 = r1.mo84475N(r2, r3, r4, r5, r6, r7, r9)
            if (r1 == r15) goto L_0x0383
            goto L_0x036a
        L_0x03b2:
            r3 = r15
        L_0x03b3:
            r8 = r18
            r7 = r23
            goto L_0x03d4
        L_0x03b8:
            r1 = r28
            r2 = r29
            r3 = r30
            r11 = r6
            r4 = r15
            r5 = r32
            r6 = r18
            r7 = r20
            r8 = r9
            r9 = r11
            r11 = r13
            r13 = r19
            r14 = r34
            int r1 = r1.mo84476O(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            if (r1 == r15) goto L_0x0383
            goto L_0x036a
        L_0x03d4:
            if (r8 != r0) goto L_0x03e2
            if (r0 == 0) goto L_0x03e2
            r9 = r28
            r10 = r29
            r1 = r3
            r2 = r8
            r6 = r21
            goto L_0x0448
        L_0x03e2:
            r9 = r28
            boolean r1 = r9.f71131f
            if (r1 == 0) goto L_0x0419
            r10 = r34
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy r1 = r10.f71564d
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29908xy.m121340a()
            if (r1 == r2) goto L_0x0419
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r1 = r9.f71130e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy r2 = r10.f71564d
            r11 = r20
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.kz r1 = r2.mo84913c(r1, r11)
            if (r1 != 0) goto L_0x0410
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.k r5 = m120090F(r29)
            r1 = r8
            r2 = r30
            r4 = r32
            r6 = r34
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121554i(r1, r2, r3, r4, r5, r6)
            r10 = r29
            goto L_0x042c
        L_0x0410:
            r10 = r29
            r0 = r10
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.iz r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29354iz) r0
            r0.mo84677v()
            throw r17
        L_0x0419:
            r10 = r29
            r11 = r20
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.k r5 = m120090F(r29)
            r1 = r8
            r2 = r30
            r4 = r32
            r6 = r34
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121554i(r1, r2, r3, r4, r5, r6)
        L_0x042c:
            r13 = r30
            r14 = r32
            r12 = r0
            r2 = r8
            r15 = r9
            r0 = r10
            r3 = r11
            r4 = r19
            r6 = r21
            r11 = r27
            r10 = r34
            goto L_0x001a
        L_0x043f:
            r10 = r0
            r21 = r6
            r23 = r7
            r27 = r11
            r0 = r12
            r9 = r15
        L_0x0448:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r3) goto L_0x0453
            long r4 = (long) r7
            r7 = r27
            r7.putInt(r10, r4, r6)
        L_0x0453:
            int r4 = r9.f71134i
            r5 = r17
        L_0x0457:
            int r6 = r9.f71135j
            if (r4 >= r6) goto L_0x04e9
            int[] r6 = r9.f71133h
            r6 = r6[r4]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j<?, ?> r7 = r9.f71137l
            int[] r8 = r9.f71126a
            r8 = r8[r6]
            int r11 = r9.mo84491j(r6)
            r11 = r11 & r3
            long r11 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r10, r11)
            if (r11 != 0) goto L_0x0472
            goto L_0x04e2
        L_0x0472:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.qz r12 = r9.mo84492l(r6)
            if (r12 == 0) goto L_0x04e2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbyz r11 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbyz) r11
            java.lang.Object r6 = r9.mo84494n(r6)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.q00 r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.q00) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.p00 r6 = r6.mo84794c()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x048c:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x04e2
            java.lang.Object r13 = r11.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getValue()
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            boolean r14 = r12.mo84506a(r14)
            if (r14 != 0) goto L_0x048c
            if (r5 != 0) goto L_0x04ae
            java.lang.Object r5 = r7.mo84682e()
        L_0x04ae:
            java.lang.Object r14 = r13.getKey()
            java.lang.Object r15 = r13.getValue()
            int r14 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.q00.m120911b(r6, r14, r15)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r15 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp.f71626a
            byte[] r14 = new byte[r14]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.ry r15 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121017h(r14)
            java.lang.Object r3 = r13.getKey()     // Catch:{ IOException -> 0x04db }
            java.lang.Object r13 = r13.getValue()     // Catch:{ IOException -> 0x04db }
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.q00.m120913e(r15, r6, r3, r13)     // Catch:{ IOException -> 0x04db }
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29353iy.m120524a(r15, r14)
            r7.mo84683f(r5, r8, r3)
            r11.remove()
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x048c
        L_0x04db:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x04e2:
            int r4 = r4 + 1
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0457
        L_0x04e9:
            if (r5 == 0) goto L_0x04f0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j<?, ?> r3 = r9.f71137l
            r3.mo84686i(r10, r5)
        L_0x04f0:
            if (r0 != 0) goto L_0x04fc
            r3 = r32
            if (r1 != r3) goto L_0x04f7
            goto L_0x0502
        L_0x04f7:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121513e()
            throw r0
        L_0x04fc:
            r3 = r32
            if (r1 > r3) goto L_0x0503
            if (r2 != r0) goto L_0x0503
        L_0x0502:
            return r1
        L_0x0503:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121513e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.mo84472E(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yx):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0303, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x046a, code lost:
        r8 = r8 + (r9 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b4, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04df, code lost:
        r8 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04e0, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0507, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0514, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0522, code lost:
        r7 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0526, code lost:
        r3 = r3 + 3;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo84473K(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f71125q
            r1 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r2
        L_0x000a:
            int[] r7 = r14.f71126a
            int r7 = r7.length
            if (r3 >= r7) goto L_0x052a
            int r7 = r14.mo84491j(r3)
            int[] r8 = r14.f71126a
            r8 = r8[r3]
            int r9 = m120096i(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0035
            int[] r10 = r14.f71126a
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
                case 0: goto L_0x0518;
                case 1: goto L_0x050a;
                case 2: goto L_0x04f5;
                case 3: goto L_0x04e2;
                case 4: goto L_0x04cd;
                case 5: goto L_0x04c2;
                case 6: goto L_0x04b7;
                case 7: goto L_0x04aa;
                case 8: goto L_0x0480;
                case 9: goto L_0x046e;
                case 10: goto L_0x0452;
                case 11: goto L_0x043e;
                case 12: goto L_0x042a;
                case 13: goto L_0x041e;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f9;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03ce;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b6;
                case 20: goto L_0x03ab;
                case 21: goto L_0x03a0;
                case 22: goto L_0x0395;
                case 23: goto L_0x038a;
                case 24: goto L_0x037f;
                case 25: goto L_0x0374;
                case 26: goto L_0x0369;
                case 27: goto L_0x035a;
                case 28: goto L_0x034e;
                case 29: goto L_0x0342;
                case 30: goto L_0x0336;
                case 31: goto L_0x032a;
                case 32: goto L_0x031e;
                case 33: goto L_0x0312;
                case 34: goto L_0x0306;
                case 35: goto L_0x02ef;
                case 36: goto L_0x02da;
                case 37: goto L_0x02c5;
                case 38: goto L_0x02b0;
                case 39: goto L_0x029b;
                case 40: goto L_0x0286;
                case 41: goto L_0x0270;
                case 42: goto L_0x025a;
                case 43: goto L_0x0244;
                case 44: goto L_0x022e;
                case 45: goto L_0x0218;
                case 46: goto L_0x0202;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d6;
                case 49: goto L_0x01c6;
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
            goto L_0x0526
        L_0x003f:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r9 = r14.mo84493m(r3)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121007H(r8, r7, r9)
            goto L_0x03cb
        L_0x0055:
            boolean r9 = r14.mo84471A(r15, r8, r3)
            if (r9 == 0) goto L_0x0526
            long r9 = m120097k(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r9)
            goto L_0x04df
        L_0x006f:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = m120095M(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x04df
        L_0x008a:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0522
        L_0x0098:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0514
        L_0x00a6:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = m120095M(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121009J(r7)
            goto L_0x04df
        L_0x00bc:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = m120095M(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x04df
        L_0x00d2:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = r7.mo84991i()
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x046a
        L_0x00ee:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r9 = r14.mo84493m(r3)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120668Q(r8, r7, r9)
            goto L_0x03cb
        L_0x0102:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp
            if (r9 == 0) goto L_0x0122
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = r7.mo84991i()
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x046a
        L_0x0122:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121013d(r7)
            goto L_0x04df
        L_0x0130:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x04b4
        L_0x013e:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0514
        L_0x014c:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0522
        L_0x015a:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = m120095M(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121009J(r7)
            goto L_0x04df
        L_0x0170:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            long r9 = m120097k(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r9)
            goto L_0x0507
        L_0x0186:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            long r9 = m120097k(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r9)
            goto L_0x0507
        L_0x019c:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0514
        L_0x01aa:
            boolean r7 = r14.mo84471A(r15, r8, r3)
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0522
        L_0x01b8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.mo84494n(r3)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.s00.m121057a(r8, r7, r9)
            goto L_0x03cb
        L_0x01c6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r9 = r14.mo84493m(r3)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120663L(r8, r7, r9)
            goto L_0x03cb
        L_0x01d6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120673V(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x01ec:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120671T(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x0202:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120662K(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x0218:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120660I(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x022e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120658G(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x0244:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120676Y(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x025a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120655D(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x0270:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120660I(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x0286:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120662K(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x029b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120665N(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x02b0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120679a0(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x02c5:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120667P(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x02da:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120660I(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0303
        L_0x02ef:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120662K(r7)
            if (r7 <= 0) goto L_0x0526
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
        L_0x0303:
            int r8 = r8 + r9
            goto L_0x04df
        L_0x0306:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120672U(r8, r7, r1)
            goto L_0x03cb
        L_0x0312:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120670S(r8, r7, r1)
            goto L_0x03cb
        L_0x031e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120661J(r8, r7, r1)
            goto L_0x03cb
        L_0x032a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120659H(r8, r7, r1)
            goto L_0x03cb
        L_0x0336:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120657F(r8, r7, r1)
            goto L_0x03cb
        L_0x0342:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120675X(r8, r7, r1)
            goto L_0x03cb
        L_0x034e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120656E(r8, r7)
            goto L_0x03cb
        L_0x035a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r9 = r14.mo84493m(r3)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120669R(r8, r7, r9)
            goto L_0x03cb
        L_0x0369:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120674W(r8, r7)
            goto L_0x03cb
        L_0x0374:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120652A(r8, r7, r1)
            goto L_0x03cb
        L_0x037f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120659H(r8, r7, r1)
            goto L_0x03cb
        L_0x038a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120661J(r8, r7, r1)
            goto L_0x03cb
        L_0x0395:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120664M(r8, r7, r1)
            goto L_0x03cb
        L_0x03a0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120677Z(r8, r7, r1)
            goto L_0x03cb
        L_0x03ab:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120666O(r8, r7, r1)
            goto L_0x03cb
        L_0x03b6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120659H(r8, r7, r1)
            goto L_0x03cb
        L_0x03c1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120661J(r8, r7, r1)
        L_0x03cb:
            int r4 = r4 + r7
            goto L_0x0526
        L_0x03ce:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r9 = r14.mo84493m(r3)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121007H(r8, r7, r9)
            goto L_0x03cb
        L_0x03e1:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0526
            long r9 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r9)
            goto L_0x04df
        L_0x03f9:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x04df
        L_0x0412:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0522
        L_0x041e:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0514
        L_0x042a:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121009J(r7)
            goto L_0x04df
        L_0x043e:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x04df
        L_0x0452:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = r7.mo84991i()
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
        L_0x046a:
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x04e0
        L_0x046e:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r9 = r14.mo84493m(r3)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120668Q(r8, r7, r9)
            goto L_0x03cb
        L_0x0480:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp
            if (r9 == 0) goto L_0x049d
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = r7.mo84991i()
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x046a
        L_0x049d:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121013d(r7)
            goto L_0x04df
        L_0x04aa:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
        L_0x04b4:
            int r7 = r7 + r11
            goto L_0x03cb
        L_0x04b7:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0514
        L_0x04c2:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            goto L_0x0522
        L_0x04cd:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121009J(r7)
        L_0x04df:
            int r8 = r8 + r7
        L_0x04e0:
            int r4 = r4 + r8
            goto L_0x0526
        L_0x04e2:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r9)
            goto L_0x0507
        L_0x04f5:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r9)
        L_0x0507:
            int r7 = r7 + r8
            goto L_0x03cb
        L_0x050a:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
        L_0x0514:
            int r7 = r7 + 4
            goto L_0x03cb
        L_0x0518:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0526
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r7)
        L_0x0522:
            int r7 = r7 + 8
            goto L_0x03cb
        L_0x0526:
            int r3 = r3 + 3
            goto L_0x000a
        L_0x052a:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j<?, ?> r0 = r14.f71137l
            java.lang.Object r2 = r0.mo84680c(r15)
            int r0 = r0.mo84678a(r2)
            int r4 = r4 + r0
            boolean r0 = r14.f71131f
            if (r0 == 0) goto L_0x0587
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?> r0 = r14.f71138m
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.cz r15 = r0.mo84918b(r15)
            r0 = r1
        L_0x0540:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.g<T, java.lang.Object> r2 = r15.f71192a
            int r2 = r2.mo84616b()
            if (r1 >= r2) goto L_0x0560
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.g<T, java.lang.Object> r2 = r15.f71192a
            java.util.Map$Entry r2 = r2.mo84624h(r1)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.bz r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29096bz) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29133cz.m120263c(r3, r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L_0x0540
        L_0x0560:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.g<T, java.lang.Object> r15 = r15.f71192a
            java.lang.Iterable r15 = r15.mo84617c()
            java.util.Iterator r15 = r15.iterator()
        L_0x056a:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0586
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.bz r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29096bz) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29133cz.m120263c(r2, r1)
            int r0 = r0 + r1
            goto L_0x056a
        L_0x0586:
            int r4 = r4 + r0
        L_0x0587:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.mo84473K(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fd, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0475, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c5, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f7, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f8, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0523, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0532, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0542, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0546, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo84474L(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f71125q
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f71126a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x054a
            int r4 = r11.mo84491j(r2)
            int r5 = m120096i(r4)
            int[] r6 = r11.f71126a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbxi r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbxi.DOUBLE_LIST_PACKED
            int r4 = r4.mo85003i()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbxi r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbxi.SINT64_LIST_PACKED
            int r4 = r4.mo85003i()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f71126a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0536;
                case 1: goto L_0x0526;
                case 2: goto L_0x050f;
                case 3: goto L_0x04fa;
                case 4: goto L_0x04e3;
                case 5: goto L_0x04d6;
                case 6: goto L_0x04c9;
                case 7: goto L_0x04b9;
                case 8: goto L_0x048d;
                case 9: goto L_0x0479;
                case 10: goto L_0x045b;
                case 11: goto L_0x0445;
                case 12: goto L_0x042f;
                case 13: goto L_0x0421;
                case 14: goto L_0x0413;
                case 15: goto L_0x03f8;
                case 16: goto L_0x03dd;
                case 17: goto L_0x03c8;
                case 18: goto L_0x03bb;
                case 19: goto L_0x03b0;
                case 20: goto L_0x03a5;
                case 21: goto L_0x039a;
                case 22: goto L_0x038f;
                case 23: goto L_0x0384;
                case 24: goto L_0x0379;
                case 25: goto L_0x036e;
                case 26: goto L_0x0363;
                case 27: goto L_0x0354;
                case 28: goto L_0x0348;
                case 29: goto L_0x033c;
                case 30: goto L_0x0330;
                case 31: goto L_0x0324;
                case 32: goto L_0x0318;
                case 33: goto L_0x030c;
                case 34: goto L_0x0300;
                case 35: goto L_0x02e9;
                case 36: goto L_0x02d4;
                case 37: goto L_0x02bf;
                case 38: goto L_0x02aa;
                case 39: goto L_0x0295;
                case 40: goto L_0x0280;
                case 41: goto L_0x026a;
                case 42: goto L_0x0254;
                case 43: goto L_0x023e;
                case 44: goto L_0x0228;
                case 45: goto L_0x0212;
                case 46: goto L_0x01fc;
                case 47: goto L_0x01e6;
                case 48: goto L_0x01d0;
                case 49: goto L_0x01c0;
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
            goto L_0x0546
        L_0x0038:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00) r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r5 = r11.mo84493m(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121007H(r6, r4, r5)
            goto L_0x03c5
        L_0x004e:
            boolean r5 = r11.mo84471A(r12, r6, r2)
            if (r5 == 0) goto L_0x0546
            long r7 = m120097k(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r6)
            goto L_0x04f7
        L_0x0069:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = m120095M(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x04f7
        L_0x0084:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0542
        L_0x0092:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0532
        L_0x00a0:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = m120095M(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121009J(r4)
            goto L_0x04f7
        L_0x00b6:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = m120095M(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x04f7
        L_0x00cc:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = r4.mo84991i()
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0475
        L_0x00e8:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r5 = r11.mo84493m(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120668Q(r6, r4, r5)
            goto L_0x03c5
        L_0x00fc:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = r4.mo84991i()
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0475
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121013d(r4)
            goto L_0x04f7
        L_0x012a:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x04c5
        L_0x0138:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0532
        L_0x0146:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0542
        L_0x0154:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = m120095M(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121009J(r4)
            goto L_0x04f7
        L_0x016a:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            long r4 = m120097k(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r6)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r4)
            goto L_0x0523
        L_0x0180:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            long r4 = m120097k(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r6)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r4)
            goto L_0x0523
        L_0x0196:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0532
        L_0x01a4:
            boolean r4 = r11.mo84471A(r12, r6, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0542
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.lang.Object r5 = r11.mo84494n(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.s00.m121057a(r6, r4, r5)
            goto L_0x03c5
        L_0x01c0:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r5 = r11.mo84493m(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120663L(r6, r4, r5)
            goto L_0x03c5
        L_0x01d0:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120673V(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x01e6:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120671T(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x01fc:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120662K(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x0212:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120660I(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x0228:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120658G(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x023e:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120676Y(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x0254:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120655D(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x026a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120660I(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x0280:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120662K(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x0295:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120665N(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x02aa:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120679a0(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x02bf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120667P(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x02d4:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120660I(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x02fd
        L_0x02e9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120662K(r4)
            if (r4 <= 0) goto L_0x0546
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121014e(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
        L_0x02fd:
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0300:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120672U(r6, r4, r1)
            goto L_0x03c5
        L_0x030c:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120670S(r6, r4, r1)
            goto L_0x03c5
        L_0x0318:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120661J(r6, r4, r1)
            goto L_0x03c5
        L_0x0324:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120659H(r6, r4, r1)
            goto L_0x03c5
        L_0x0330:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120657F(r6, r4, r1)
            goto L_0x03c5
        L_0x033c:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120675X(r6, r4, r1)
            goto L_0x03c5
        L_0x0348:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120656E(r6, r4)
            goto L_0x03c5
        L_0x0354:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r5 = r11.mo84493m(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120669R(r6, r4, r5)
            goto L_0x03c5
        L_0x0363:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120674W(r6, r4)
            goto L_0x03c5
        L_0x036e:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120652A(r6, r4, r1)
            goto L_0x03c5
        L_0x0379:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120659H(r6, r4, r1)
            goto L_0x03c5
        L_0x0384:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120661J(r6, r4, r1)
            goto L_0x03c5
        L_0x038f:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120664M(r6, r4, r1)
            goto L_0x03c5
        L_0x039a:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120677Z(r6, r4, r1)
            goto L_0x03c5
        L_0x03a5:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120666O(r6, r4, r1)
            goto L_0x03c5
        L_0x03b0:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120659H(r6, r4, r1)
            goto L_0x03c5
        L_0x03bb:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120661J(r6, r4, r1)
        L_0x03c5:
            int r3 = r3 + r4
            goto L_0x0546
        L_0x03c8:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00) r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r5 = r11.mo84493m(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121007H(r6, r4, r5)
            goto L_0x03c5
        L_0x03dd:
            boolean r5 = r11.mo84502w(r12, r2)
            if (r5 == 0) goto L_0x0546
            long r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r6)
            goto L_0x04f7
        L_0x03f8:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x04f7
        L_0x0413:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0542
        L_0x0421:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0532
        L_0x042f:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121009J(r4)
            goto L_0x04f7
        L_0x0445:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x04f7
        L_0x045b:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = r4.mo84991i()
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
        L_0x0475:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f8
        L_0x0479:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r5 = r11.mo84493m(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120668Q(r6, r4, r5)
            goto L_0x03c5
        L_0x048d:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp
            if (r5 == 0) goto L_0x04ac
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = r4.mo84991i()
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0475
        L_0x04ac:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121013d(r4)
            goto L_0x04f7
        L_0x04b9:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
        L_0x04c5:
            int r4 = r4 + 1
            goto L_0x03c5
        L_0x04c9:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0532
        L_0x04d6:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
            goto L_0x0542
        L_0x04e3:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121009J(r4)
        L_0x04f7:
            int r5 = r5 + r4
        L_0x04f8:
            int r3 = r3 + r5
            goto L_0x0546
        L_0x04fa:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r6)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r4)
            goto L_0x0523
        L_0x050f:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r6)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121016g(r4)
        L_0x0523:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0546
        L_0x0526:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
        L_0x0532:
            int r4 = r4 + 4
            goto L_0x03c5
        L_0x0536:
            boolean r4 = r11.mo84502w(r12, r2)
            if (r4 == 0) goto L_0x0546
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29686ry.m121015f(r4)
        L_0x0542:
            int r4 = r4 + 8
            goto L_0x03c5
        L_0x0546:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x054a:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j<?, ?> r0 = r11.f71137l
            java.lang.Object r12 = r0.mo84680c(r12)
            int r12 = r0.mo84678a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.mo84474L(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> int mo84475N(T r17, byte[] r18, int r19, int r20, int r21, long r22, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29944yx r24) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r17
            r6 = r18
            r7 = r20
            r1 = r22
            r8 = r24
            sun.misc.Unsafe r3 = f71125q
            r9 = r16
            r4 = r21
            java.lang.Object r4 = r9.mo84494n(r4)
            java.lang.Object r5 = r3.getObject(r0, r1)
            r10 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbyz r10 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbyz) r10
            boolean r10 = r10.mo85012h()
            if (r10 != 0) goto L_0x0030
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbyz r10 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbyz.m121517b()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbyz r10 = r10.mo85006c()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.s00.m121058b(r10, r5)
            r3.putObject(r0, r1, r10)
            r5 = r10
        L_0x0030:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.q00 r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.q00) r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.p00 r10 = r4.mo84794c()
            r11 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbyz r11 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbyz) r11
            r0 = r19
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r6, r0, r8)
            int r1 = r8.f71561a
            if (r1 < 0) goto L_0x00b0
            int r2 = r7 - r0
            if (r1 > r2) goto L_0x00b0
            int r12 = r0 + r1
            K r1 = r10.f71395b
            V r2 = r10.f71397d
            r13 = r1
            r14 = r2
        L_0x004f:
            if (r0 >= r12) goto L_0x00a5
            int r1 = r0 + 1
            byte r0 = r6[r0]
            if (r0 >= 0) goto L_0x0060
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121556k(r0, r6, r1, r8)
            int r1 = r8.f71561a
            r15 = r1
            r1 = r0
            r0 = r15
        L_0x0060:
            r2 = r0 & 7
            int r3 = r0 >>> 3
            r4 = 1
            if (r3 == r4) goto L_0x0088
            r4 = 2
            if (r3 == r4) goto L_0x006b
            goto L_0x00a0
        L_0x006b:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaay r3 = r10.f71396c
            int r3 = r3.mo84925i()
            if (r2 != r3) goto L_0x00a0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaay r3 = r10.f71396c
            V r0 = r10.f71397d
            java.lang.Class r4 = r0.getClass()
            r0 = r18
            r2 = r20
            r5 = r24
            int r0 = m120088C(r0, r1, r2, r3, r4, r5)
            java.lang.Object r14 = r8.f71563c
            goto L_0x004f
        L_0x0088:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaay r3 = r10.f71394a
            int r3 = r3.mo84925i()
            if (r2 != r3) goto L_0x00a0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaay r3 = r10.f71394a
            r4 = 0
            r0 = r18
            r2 = r20
            r5 = r24
            int r0 = m120088C(r0, r1, r2, r3, r4, r5)
            java.lang.Object r13 = r8.f71563c
            goto L_0x004f
        L_0x00a0:
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121559n(r0, r6, r1, r7, r8)
            goto L_0x004f
        L_0x00a5:
            if (r0 != r12) goto L_0x00ab
            r11.put(r13, r14)
            return r12
        L_0x00ab:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121513e()
            throw r0
        L_0x00b0:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.mo84475N(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yx):int");
    }

    /* renamed from: O */
    public final int mo84476O(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C29944yx yxVar) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C29944yx yxVar2 = yxVar;
        Unsafe unsafe = f71125q;
        long j3 = (long) (this.f71126a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(C29981zx.m121560o(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(C29981zx.m121547b(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = C29981zx.m121558m(bArr2, i9, yxVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(yxVar2.f71562b));
                    unsafe.putInt(t2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = C29981zx.m121555j(bArr2, i9, yxVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(yxVar2.f71561a));
                    unsafe.putInt(t2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C29981zx.m121560o(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C29981zx.m121547b(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = C29981zx.m121558m(bArr2, i9, yxVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(yxVar2.f71562b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = C29981zx.m121555j(bArr2, i9, yxVar2);
                    int i14 = yxVar2.f71561a;
                    if (i14 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C29873x.m121300f(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(t2, j2, new String(bArr2, j5, i14, C29909xz.f71541a));
                        j5 += i14;
                    } else {
                        throw zbye.m121511c();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int d = C29981zx.m121549d(mo84493m(i13), bArr2, i9, i2, yxVar2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, yxVar2.f71563c);
                    } else {
                        unsafe.putObject(t2, j2, C29909xz.m121349g(object, yxVar2.f71563c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return d;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = C29981zx.m121546a(bArr2, i9, yxVar2);
                    unsafe.putObject(t2, j2, yxVar2.f71563c);
                    unsafe.putInt(t2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = C29981zx.m121555j(bArr2, i9, yxVar2);
                    int i15 = yxVar2.f71561a;
                    C29650qz l = mo84492l(i13);
                    if (l == null || l.mo84506a(i15)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i15));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m120090F(t).mo84698h(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j7 = C29981zx.m121555j(bArr2, i9, yxVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C29575oy.m120853a(yxVar2.f71561a)));
                    unsafe.putInt(t2, j3, i11);
                    return j7;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m3 = C29981zx.m121558m(bArr2, i9, yxVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C29575oy.m120854b(yxVar2.f71562b)));
                    unsafe.putInt(t2, j3, i11);
                    return m3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int c = C29981zx.m121548c(mo84493m(i13), bArr, i, i2, (i10 & -8) | 4, yxVar);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, yxVar2.f71563c);
                    } else {
                        unsafe.putObject(t2, j2, C29909xz.m121349g(object2, yxVar2.f71563c));
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
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo84477P(T r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29944yx r34) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = f71125q
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
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121556k(r0, r12, r3, r11)
            int r3 = r11.f71561a
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
            int r0 = r15.mo84480S(r5, r2)
            goto L_0x003f
        L_0x003b:
            int r0 = r15.mo84479R(r5)
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
            int[] r0 = r15.f71126a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m120096i(r1)
            r8 = r1 & r10
            long r10 = (long) r8
            r8 = 17
            r32 = r5
            if (r0 > r8) goto L_0x0213
            int[] r8 = r15.f71126a
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
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r12, r4, r11)
            long r3 = r11.f71562b
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120854b(r3)
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
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r12, r4, r11)
            int r1 = r11.f71561a
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120853a(r1)
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
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r12, r4, r11)
            int r3 = r11.f71561a
            r9.putInt(r14, r0, r3)
            goto L_0x00f2
        L_0x00df:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008d
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121546a(r12, r4, r11)
            java.lang.Object r3 = r11.f71563c
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
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r2 = r15.mo84493m(r8)
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121549d(r2, r12, r4, r13, r11)
            java.lang.Object r3 = r9.getObject(r14, r0)
            if (r3 != 0) goto L_0x0115
            java.lang.Object r3 = r11.f71563c
            r9.putObject(r14, r0, r3)
            goto L_0x00f2
        L_0x0115:
            java.lang.Object r4 = r11.f71563c
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121349g(r3, r4)
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
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121552g(r12, r4, r11)
            goto L_0x0139
        L_0x0135:
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121553h(r12, r4, r11)
        L_0x0139:
            java.lang.Object r1 = r11.f71563c
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
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r12, r4, r11)
            long r2 = r11.f71562b
            r21 = 0
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            r0 = r16
        L_0x015b:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121146r(r14, r5, r0)
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
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r12, r4)
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
            long r21 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r12, r4)
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
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r12, r4, r11)
            int r1 = r11.f71561a
            r9.putInt(r14, r5, r1)
            goto L_0x0200
        L_0x01ab:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0208
            int r17 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r12, r4, r11)
            long r2 = r11.f71562b
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
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121149u(r14, r5, r0)
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
            long r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121148t(r14, r5, r0)
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
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wz r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29872wz) r0
            boolean r1 = r0.mo84839z()
            if (r1 != 0) goto L_0x0242
            int r1 = r0.size()
            if (r1 != 0) goto L_0x023a
            r1 = 10
            goto L_0x023b
        L_0x023a:
            int r1 = r1 + r1
        L_0x023b:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wz r0 = r0.mo84516P1(r1)
            r9.putObject(r14, r5, r0)
        L_0x0242:
            r5 = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r0 = r15.mo84493m(r8)
            r1 = r17
            r2 = r31
            r3 = r4
            r4 = r33
            r15 = r20
            r6 = r34
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121550e(r0, r1, r2, r3, r4, r5, r6)
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
            int r0 = r0.mo84478Q(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
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
            int r0 = r0.mo84475N(r1, r2, r3, r4, r5, r6, r8)
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
            int r0 = r0.mo84476O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02b7
            goto L_0x02a3
        L_0x030e:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.k r4 = m120090F(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121554i(r0, r1, r2, r3, r4, r5)
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
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121513e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.mo84477P(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yx):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0450 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    /* renamed from: Q */
    public final int mo84478Q(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29944yx r29) throws java.io.IOException {
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
            sun.misc.Unsafe r11 = f71125q
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wz r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29872wz) r12
            boolean r13 = r12.mo84839z()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wz r12 = r12.mo84516P1(r13)
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
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r1 = r15.mo84493m(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121548c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f71563c
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00 r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r2 = r7.f71561a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r3, r1, r7)
            long r4 = r7.f71562b
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120854b(r4)
            r12.mo84707k(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00 r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r3, r4, r7)
            long r8 = r7.f71562b
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120854b(r8)
            r12.mo84707k(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r6 = r7.f71561a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r3, r4, r7)
            long r8 = r7.f71562b
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120854b(r8)
            r12.mo84707k(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.nz r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29539nz) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r2 = r7.f71561a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r4 = r7.f71561a
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120853a(r4)
            r12.mo84749k(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.nz r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29539nz) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r4 = r7.f71561a
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120853a(r4)
            r12.mo84749k(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r6 = r7.f71561a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r4 = r7.f71561a
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29575oy.m120853a(r4)
            r12.mo84749k(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121551f(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121557l(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.mz r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29502mz) r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.k r3 = r1.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.k r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29392k.m120586c()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.qz r4 = r15.mo84492l(r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j<?, ?> r5 = r0.f71137l
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120682c(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.k r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29392k) r3
            r1.zbc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r4 = r7.f71561a
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp.f71626a
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp.m121496M(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r6 = r7.f71561a
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r4 = r7.f71561a
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp.f71626a
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp.m121496M(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121512d()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121512d()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r1 = r15.mo84493m(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121550e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01fa
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r4 = r7.f71561a
            if (r4 < 0) goto L_0x01f5
            if (r4 != 0) goto L_0x01c2
            r12.add(r6)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.f71541a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01cc:
            int r1 = r1 + r4
        L_0x01cd:
            if (r1 >= r5) goto L_0x0450
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r8 = r7.f71561a
            if (r2 != r8) goto L_0x0450
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r4 = r7.f71561a
            if (r4 < 0) goto L_0x01f0
            if (r4 != 0) goto L_0x01e5
            r12.add(r6)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.f71541a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121512d()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121512d()
            throw r1
        L_0x01fa:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r4 = r7.f71561a
            if (r4 < 0) goto L_0x0255
            if (r4 != 0) goto L_0x0208
            r12.add(r6)
            goto L_0x021b
        L_0x0208:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29873x.m121300f(r3, r1, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.f71541a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x021a:
            r1 = r8
        L_0x021b:
            if (r1 >= r5) goto L_0x0450
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r8 = r7.f71561a
            if (r2 != r8) goto L_0x0450
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r4 = r7.f71561a
            if (r4 < 0) goto L_0x024b
            if (r4 != 0) goto L_0x0233
            r12.add(r6)
            goto L_0x021b
        L_0x0233:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29873x.m121300f(r3, r1, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.f71541a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121511c()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121512d()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121511c()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121512d()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.ay r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29059ay) r12
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r4 = r7.f71561a
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r3, r2, r7)
            long r5 = r7.f71562b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0274
            r5 = r13
            goto L_0x0275
        L_0x0274:
            r5 = r1
        L_0x0275:
            r12.mo84523h(r5)
            goto L_0x0266
        L_0x0279:
            if (r2 != r4) goto L_0x027e
        L_0x027b:
            r1 = r2
            goto L_0x0450
        L_0x027e:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.ay r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29059ay) r12
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r3, r4, r7)
            long r8 = r7.f71562b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0293
            r6 = r13
            goto L_0x0294
        L_0x0293:
            r6 = r1
        L_0x0294:
            r12.mo84523h(r6)
        L_0x0297:
            if (r4 >= r5) goto L_0x02b3
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r8 = r7.f71561a
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r3, r6, r7)
            long r8 = r7.f71562b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = r13
            goto L_0x02af
        L_0x02ae:
            r6 = r1
        L_0x02af:
            r12.mo84523h(r6)
            goto L_0x0297
        L_0x02b3:
            return r4
        L_0x02b4:
            if (r6 != r14) goto L_0x02d4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.nz r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29539nz) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r2 = r7.f71561a
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r3, r1)
            r12.mo84749k(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.nz r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29539nz) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r17, r18)
            r12.mo84749k(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r6 = r7.f71561a
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r3, r4)
            r12.mo84749k(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00 r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r2 = r7.f71561a
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r3, r1)
            r12.mo84707k(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00 r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00) r12
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r17, r18)
            r12.mo84707k(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r6 = r7.f71561a
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r3, r4)
            r12.mo84707k(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121551f(r3, r4, r12, r7)
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
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121557l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00 r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r2 = r7.f71561a
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r3, r1, r7)
            long r4 = r7.f71562b
            r12.mo84707k(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00 r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.l00) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r3, r4, r7)
            long r8 = r7.f71562b
            r12.mo84707k(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r6 = r7.f71561a
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121558m(r3, r4, r7)
            long r8 = r7.f71562b
            r12.mo84707k(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.dz r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29170dz) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r2 = r7.f71561a
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo84592i(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.dz r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29170dz) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo84592i(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r6 = r7.f71561a
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121547b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo84592i(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.ty r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29760ty) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r2 = r7.f71561a
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo84883h(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.ty r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29760ty) r12
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo84883h(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r1, r7)
            int r6 = r7.f71561a
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121560o(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo84883h(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121555j(r3, r4, r7)
            int r9 = r7.f71561a
            if (r2 == r9) goto L_0x0438
            goto L_0x044e
        L_0x0438:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121548c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f71563c
            r12.add(r8)
            goto L_0x042d
        L_0x044e:
            return r4
        L_0x044f:
            r1 = r4
        L_0x0450:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.mo84478Q(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yx):int");
    }

    /* renamed from: R */
    public final int mo84479R(int i) {
        if (i < this.f71128c || i > this.f71129d) {
            return -1;
        }
        return mo84482U(i, 0);
    }

    /* renamed from: S */
    public final int mo84480S(int i, int i2) {
        if (i < this.f71128c || i > this.f71129d) {
            return -1;
        }
        return mo84482U(i, i2);
    }

    /* renamed from: T */
    public final int mo84481T(int i) {
        return this.f71126a[i + 2];
    }

    /* renamed from: U */
    public final int mo84482U(int i, int i2) {
        int length = (this.f71126a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f71126a[i4];
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

    /* renamed from: a */
    public final int mo84483a(T t) {
        if (this.f71132g) {
            return mo84474L(t);
        }
        return mo84473K(t);
    }

    /* renamed from: b */
    public final void mo84484b(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f71126a.length; i += 3) {
            int j = mo84491j(i);
            long j2 = (long) (1048575 & j);
            int i2 = this.f71126a[i];
            switch (m120096i(j)) {
                case 0:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121148t(t, j2, C29725t.m121134f(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 1:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121149u(t, j2, C29725t.m121135g(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 2:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121151w(t, j2, C29725t.m121137i(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 3:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121151w(t, j2, C29725t.m121137i(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 4:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121150v(t, j2, C29725t.m121136h(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 5:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121151w(t, j2, C29725t.m121137i(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 6:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121150v(t, j2, C29725t.m121136h(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 7:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121146r(t, j2, C29725t.m121125B(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 8:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121152x(t, j2, C29725t.m121139k(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 9:
                    mo84495p(t, t2, i);
                    break;
                case 10:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121152x(t, j2, C29725t.m121139k(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 11:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121150v(t, j2, C29725t.m121136h(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 12:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121150v(t, j2, C29725t.m121136h(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 13:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121150v(t, j2, C29725t.m121136h(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 14:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121151w(t, j2, C29725t.m121137i(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 15:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121150v(t, j2, C29725t.m121136h(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 16:
                    if (!mo84502w(t2, i)) {
                        break;
                    } else {
                        C29725t.m121151w(t, j2, C29725t.m121137i(t2, j2));
                        mo84497r(t, i);
                        break;
                    }
                case 17:
                    mo84495p(t, t2, i);
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
                    this.f71136k.mo84635b(t, t2, j2);
                    break;
                case 50:
                    l10.m120653B(this.f71140o, t, t2, j2);
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
                    if (!mo84471A(t2, i2, i)) {
                        break;
                    } else {
                        C29725t.m121152x(t, j2, C29725t.m121139k(t2, j2));
                        mo84498s(t, i2, i);
                        break;
                    }
                case 60:
                    mo84496q(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo84471A(t2, i2, i)) {
                        break;
                    } else {
                        C29725t.m121152x(t, j2, C29725t.m121139k(t2, j2));
                        mo84498s(t, i2, i);
                        break;
                    }
                case 68:
                    mo84496q(t, t2, i);
                    break;
            }
        }
        l10.m120685f(this.f71137l, t, t2);
        if (this.f71131f) {
            l10.m120684e(this.f71138m, t, t2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0507  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84485c(T r13, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29947z r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f71132g
            if (r0 == 0) goto L_0x0525
            boolean r0 = r12.f71131f
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?> r0 = r12.f71138m
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.cz r0 = r0.mo84918b(r13)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.g<T, java.lang.Object> r2 = r0.f71192a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0022
            java.util.Iterator r0 = r0.mo84566h()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0024
        L_0x0022:
            r0 = r1
            r2 = r0
        L_0x0024:
            int[] r3 = r12.f71126a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0029:
            if (r5 >= r3) goto L_0x0505
            int r6 = r12.mo84491j(r5)
            int[] r7 = r12.f71126a
            r7 = r7[r5]
        L_0x0033:
            if (r2 == 0) goto L_0x0051
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?> r8 = r12.f71138m
            int r8 = r8.mo84917a(r2)
            if (r8 > r7) goto L_0x0051
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?> r8 = r12.f71138m
            r8.mo84922f(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0033
        L_0x004f:
            r2 = r1
            goto L_0x0033
        L_0x0051:
            int r8 = m120096i(r6)
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
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r8 = r12.mo84493m(r5)
            r14.mo84855d(r7, r6, r8)
            goto L_0x0501
        L_0x0073:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m120097k(r13, r8)
            r14.mo84851L(r7, r8)
            goto L_0x0501
        L_0x0084:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m120095M(r13, r8)
            r14.mo84876y(r7, r6)
            goto L_0x0501
        L_0x0095:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m120097k(r13, r8)
            r14.mo84842C(r7, r8)
            goto L_0x0501
        L_0x00a6:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m120095M(r13, r8)
            r14.mo84844E(r7, r6)
            goto L_0x0501
        L_0x00b7:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m120095M(r13, r8)
            r14.mo84846G(r7, r6)
            goto L_0x0501
        L_0x00c8:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m120095M(r13, r8)
            r14.mo84852a(r7, r6)
            goto L_0x0501
        L_0x00d9:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r6
            r14.mo84856e(r7, r6)
            goto L_0x0501
        L_0x00ec:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r8 = r12.mo84493m(r5)
            r14.mo84870s(r7, r6, r8)
            goto L_0x0501
        L_0x0101:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            m120089D(r7, r6, r14)
            goto L_0x0501
        L_0x0112:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = m120087B(r13, r8)
            r14.mo84877z(r7, r6)
            goto L_0x0501
        L_0x0123:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m120095M(r13, r8)
            r14.mo84858g(r7, r6)
            goto L_0x0501
        L_0x0134:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m120097k(r13, r8)
            r14.mo84854c(r7, r8)
            goto L_0x0501
        L_0x0145:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m120095M(r13, r8)
            r14.mo84865n(r7, r6)
            goto L_0x0501
        L_0x0156:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m120097k(r13, r8)
            r14.mo84866o(r7, r8)
            goto L_0x0501
        L_0x0167:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m120097k(r13, r8)
            r14.mo84843D(r7, r8)
            goto L_0x0501
        L_0x0178:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = m120094J(r13, r8)
            r14.mo84867p(r7, r6)
            goto L_0x0501
        L_0x0189:
            boolean r8 = r12.mo84471A(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = m120093I(r13, r8)
            r14.mo84848I(r7, r8)
            goto L_0x0501
        L_0x019a:
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            r12.mo84500u(r14, r7, r6, r5)
            goto L_0x0501
        L_0x01a5:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r8 = r12.mo84493m(r5)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120694o(r7, r6, r14, r8)
            goto L_0x0501
        L_0x01ba:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120701v(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01cb:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120700u(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01dc:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120699t(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01ed:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120698s(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01fe:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120690k(r7, r6, r14, r9)
            goto L_0x0501
        L_0x020f:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120703x(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0220:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120687h(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0231:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120691l(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0242:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120692m(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0253:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120695p(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0264:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120704y(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0275:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120696q(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0286:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120693n(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0297:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120689j(r7, r6, r14, r9)
            goto L_0x0501
        L_0x02a8:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120701v(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02b9:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120700u(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02ca:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120699t(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02db:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120698s(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02ec:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120690k(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02fd:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120703x(r7, r6, r14, r4)
            goto L_0x0501
        L_0x030e:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120688i(r7, r6, r14)
            goto L_0x0501
        L_0x031f:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r8 = r12.mo84493m(r5)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120697r(r7, r6, r14, r8)
            goto L_0x0501
        L_0x0334:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120702w(r7, r6, r14)
            goto L_0x0501
        L_0x0345:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120687h(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0356:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120691l(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0367:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120692m(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0378:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120695p(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0389:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120704y(r7, r6, r14, r4)
            goto L_0x0501
        L_0x039a:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120696q(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03ab:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120693n(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03bc:
            int[] r7 = r12.f71126a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120689j(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03cd:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r8 = r12.mo84493m(r5)
            r14.mo84855d(r7, r6, r8)
            goto L_0x0501
        L_0x03e2:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r13, r8)
            r14.mo84851L(r7, r8)
            goto L_0x0501
        L_0x03f3:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r13, r8)
            r14.mo84876y(r7, r6)
            goto L_0x0501
        L_0x0404:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r13, r8)
            r14.mo84842C(r7, r8)
            goto L_0x0501
        L_0x0415:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r13, r8)
            r14.mo84844E(r7, r6)
            goto L_0x0501
        L_0x0426:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r13, r8)
            r14.mo84846G(r7, r6)
            goto L_0x0501
        L_0x0437:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r13, r8)
            r14.mo84852a(r7, r6)
            goto L_0x0501
        L_0x0448:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r6
            r14.mo84856e(r7, r6)
            goto L_0x0501
        L_0x045b:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r8 = r12.mo84493m(r5)
            r14.mo84870s(r7, r6, r8)
            goto L_0x0501
        L_0x0470:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r13, r8)
            m120089D(r7, r6, r14)
            goto L_0x0501
        L_0x0481:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121125B(r13, r8)
            r14.mo84877z(r7, r6)
            goto L_0x0501
        L_0x0492:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r13, r8)
            r14.mo84858g(r7, r6)
            goto L_0x0501
        L_0x04a2:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r13, r8)
            r14.mo84854c(r7, r8)
            goto L_0x0501
        L_0x04b2:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r13, r8)
            r14.mo84865n(r7, r6)
            goto L_0x0501
        L_0x04c2:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r13, r8)
            r14.mo84866o(r7, r8)
            goto L_0x0501
        L_0x04d2:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r13, r8)
            r14.mo84843D(r7, r8)
            goto L_0x0501
        L_0x04e2:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121135g(r13, r8)
            r14.mo84867p(r7, r6)
            goto L_0x0501
        L_0x04f2:
            boolean r8 = r12.mo84502w(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121134f(r13, r8)
            r14.mo84848I(r7, r8)
        L_0x0501:
            int r5 = r5 + 3
            goto L_0x0029
        L_0x0505:
            if (r2 == 0) goto L_0x051b
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?> r3 = r12.f71138m
            r3.mo84922f(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0519
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0505
        L_0x0519:
            r2 = r1
            goto L_0x0505
        L_0x051b:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j<?, ?> r0 = r12.f71137l
            java.lang.Object r13 = r0.mo84680c(r13)
            r0.mo84689l(r13, r14)
            return
        L_0x0525:
            r12.mo84499t(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.mo84485c(java.lang.Object, com.google.android.gms.internal.mlkit_vision_text_bundled_common.z):void");
    }

    /* renamed from: d */
    public final boolean mo84486d(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f71134i) {
            int i6 = this.f71133h[i5];
            int i7 = this.f71126a[i6];
            int j = mo84491j(i6);
            int i8 = this.f71126a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f71125q.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & j) != 0 && !mo84504y(t, i6, i2, i, i10)) {
                return false;
            }
            int i11 = m120096i(j);
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (mo84471A(t2, i7, i6) && !m120099z(t2, j, mo84493m(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            zbyz zbyz = (zbyz) C29725t.m121139k(t2, (long) (j & 1048575));
                            if (!zbyz.isEmpty() && ((q00) mo84494n(i6)).mo84794c().f71396c.mo84924g() == zbaaz.MESSAGE) {
                                j10<?> j10 = null;
                                for (Object next : zbyz.values()) {
                                    if (j10 == null) {
                                        j10 = g10.m120414a().mo84636b(next.getClass());
                                    }
                                    if (!j10.mo84486d(next)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
                List list = (List) C29725t.m121139k(t2, (long) (j & 1048575));
                if (!list.isEmpty()) {
                    j10 m = mo84493m(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!m.mo84486d(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (mo84504y(t, i6, i2, i, i10) && !m120099z(t2, j, mo84493m(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f71131f || this.f71138m.mo84918b(t2).mo84572n()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo84487e(T t) {
        int i;
        int i2 = this.f71134i;
        while (true) {
            i = this.f71135j;
            if (i2 >= i) {
                break;
            }
            long j = (long) (mo84491j(this.f71133h[i2]) & 1048575);
            Object k = C29725t.m121139k(t, j);
            if (k != null) {
                ((zbyz) k).mo85008e();
                C29725t.m121152x(t, j, k);
            }
            i2++;
        }
        int length = this.f71133h.length;
        while (i < length) {
            this.f71136k.mo84634a(t, (long) this.f71133h[i]);
            i++;
        }
        this.f71137l.mo84685h(t);
        if (this.f71131f) {
            this.f71138m.mo84921e(t);
        }
    }

    /* renamed from: f */
    public final boolean mo84488f(T t, T t2) {
        boolean z;
        int length = this.f71126a.length;
        for (int i = 0; i < length; i += 3) {
            int j = mo84491j(i);
            long j2 = (long) (j & 1048575);
            switch (m120096i(j)) {
                case 0:
                    if (mo84501v(t, t2, i) && Double.doubleToLongBits(C29725t.m121134f(t, j2)) == Double.doubleToLongBits(C29725t.m121134f(t2, j2))) {
                        continue;
                    }
                case 1:
                    if (mo84501v(t, t2, i) && Float.floatToIntBits(C29725t.m121135g(t, j2)) == Float.floatToIntBits(C29725t.m121135g(t2, j2))) {
                        continue;
                    }
                case 2:
                    if (mo84501v(t, t2, i) && C29725t.m121137i(t, j2) == C29725t.m121137i(t2, j2)) {
                        continue;
                    }
                case 3:
                    if (mo84501v(t, t2, i) && C29725t.m121137i(t, j2) == C29725t.m121137i(t2, j2)) {
                        continue;
                    }
                case 4:
                    if (mo84501v(t, t2, i) && C29725t.m121136h(t, j2) == C29725t.m121136h(t2, j2)) {
                        continue;
                    }
                case 5:
                    if (mo84501v(t, t2, i) && C29725t.m121137i(t, j2) == C29725t.m121137i(t2, j2)) {
                        continue;
                    }
                case 6:
                    if (mo84501v(t, t2, i) && C29725t.m121136h(t, j2) == C29725t.m121136h(t2, j2)) {
                        continue;
                    }
                case 7:
                    if (mo84501v(t, t2, i) && C29725t.m121125B(t, j2) == C29725t.m121125B(t2, j2)) {
                        continue;
                    }
                case 8:
                    if (mo84501v(t, t2, i) && l10.m120705z(C29725t.m121139k(t, j2), C29725t.m121139k(t2, j2))) {
                        continue;
                    }
                case 9:
                    if (mo84501v(t, t2, i) && l10.m120705z(C29725t.m121139k(t, j2), C29725t.m121139k(t2, j2))) {
                        continue;
                    }
                case 10:
                    if (mo84501v(t, t2, i) && l10.m120705z(C29725t.m121139k(t, j2), C29725t.m121139k(t2, j2))) {
                        continue;
                    }
                case 11:
                    if (mo84501v(t, t2, i) && C29725t.m121136h(t, j2) == C29725t.m121136h(t2, j2)) {
                        continue;
                    }
                case 12:
                    if (mo84501v(t, t2, i) && C29725t.m121136h(t, j2) == C29725t.m121136h(t2, j2)) {
                        continue;
                    }
                case 13:
                    if (mo84501v(t, t2, i) && C29725t.m121136h(t, j2) == C29725t.m121136h(t2, j2)) {
                        continue;
                    }
                case 14:
                    if (mo84501v(t, t2, i) && C29725t.m121137i(t, j2) == C29725t.m121137i(t2, j2)) {
                        continue;
                    }
                case 15:
                    if (mo84501v(t, t2, i) && C29725t.m121136h(t, j2) == C29725t.m121136h(t2, j2)) {
                        continue;
                    }
                case 16:
                    if (mo84501v(t, t2, i) && C29725t.m121137i(t, j2) == C29725t.m121137i(t2, j2)) {
                        continue;
                    }
                case 17:
                    if (mo84501v(t, t2, i) && l10.m120705z(C29725t.m121139k(t, j2), C29725t.m121139k(t2, j2))) {
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
                    z = l10.m120705z(C29725t.m121139k(t, j2), C29725t.m121139k(t2, j2));
                    break;
                case 50:
                    z = l10.m120705z(C29725t.m121139k(t, j2), C29725t.m121139k(t2, j2));
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
                    long T = (long) (mo84481T(i) & 1048575);
                    if (C29725t.m121136h(t, T) == C29725t.m121136h(t2, T) && l10.m120705z(C29725t.m121139k(t, j2), C29725t.m121139k(t2, j2))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f71137l.mo84680c(t).equals(this.f71137l.mo84680c(t2))) {
            return false;
        }
        if (this.f71131f) {
            return this.f71138m.mo84918b(t).equals(this.f71138m.mo84918b(t2));
        }
        return true;
    }

    /* renamed from: g */
    public final void mo84489g(T t, byte[] bArr, int i, int i2, C29944yx yxVar) throws IOException {
        if (this.f71132g) {
            mo84477P(t, bArr, i, i2, yxVar);
        } else {
            mo84472E(t, bArr, i, i2, 0, yxVar);
        }
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
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo84490h(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f71126a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.mo84491j(r1)
            int[] r4 = r8.f71126a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m120096i(r3)
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
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m120097k(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m120095M(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m120097k(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m120095M(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m120095M(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m120095M(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m120087B(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121343a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m120095M(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m120097k(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m120095M(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m120097k(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m120097k(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m120094J(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.mo84471A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m120093I(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121125B(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121343a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121136h(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121137i(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121135g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121134f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29909xz.m121345c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j<?, ?> r0 = r8.f71137l
            java.lang.Object r0 = r0.mo84680c(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f71131f
            if (r0 == 0) goto L_0x024b
            int r2 = r2 * 53
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?> r0 = r8.f71138m
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.cz r9 = r0.mo84918b(r9)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.g<T, java.lang.Object> r9 = r9.f71192a
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.mo84490h(java.lang.Object):int");
    }

    /* renamed from: j */
    public final int mo84491j(int i) {
        return this.f71126a[i + 1];
    }

    /* renamed from: l */
    public final C29650qz mo84492l(int i) {
        int i2 = i / 3;
        return (C29650qz) this.f71127b[i2 + i2 + 1];
    }

    /* renamed from: m */
    public final j10 mo84493m(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        j10 j10 = (j10) this.f71127b[i3];
        if (j10 != null) {
            return j10;
        }
        j10 b = g10.m120414a().mo84636b((Class) this.f71127b[i3 + 1]);
        this.f71127b[i3] = b;
        return b;
    }

    /* renamed from: n */
    public final Object mo84494n(int i) {
        int i2 = i / 3;
        return this.f71127b[i2 + i2];
    }

    /* renamed from: p */
    public final void mo84495p(T t, T t2, int i) {
        long j = (long) (mo84491j(i) & 1048575);
        if (mo84502w(t2, i)) {
            Object k = C29725t.m121139k(t, j);
            Object k2 = C29725t.m121139k(t2, j);
            if (k != null && k2 != null) {
                C29725t.m121152x(t, j, C29909xz.m121349g(k, k2));
                mo84497r(t, i);
            } else if (k2 != null) {
                C29725t.m121152x(t, j, k2);
                mo84497r(t, i);
            }
        }
    }

    /* renamed from: q */
    public final void mo84496q(T t, T t2, int i) {
        Object obj;
        int j = mo84491j(i);
        int i2 = this.f71126a[i];
        long j2 = (long) (j & 1048575);
        if (mo84471A(t2, i2, i)) {
            if (mo84471A(t, i2, i)) {
                obj = C29725t.m121139k(t, j2);
            } else {
                obj = null;
            }
            Object k = C29725t.m121139k(t2, j2);
            if (obj != null && k != null) {
                C29725t.m121152x(t, j2, C29909xz.m121349g(obj, k));
                mo84498s(t, i2, i);
            } else if (k != null) {
                C29725t.m121152x(t, j2, k);
                mo84498s(t, i2, i);
            }
        }
    }

    /* renamed from: r */
    public final void mo84497r(T t, int i) {
        int T = mo84481T(i);
        long j = (long) (1048575 & T);
        if (j != 1048575) {
            C29725t.m121150v(t, j, (1 << (T >>> 20)) | C29725t.m121136h(t, j));
        }
    }

    /* renamed from: s */
    public final void mo84498s(T t, int i, int i2) {
        C29725t.m121150v(t, (long) (mo84481T(i2) & 1048575), i);
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
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84499t(T r18, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29947z r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f71131f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?> r3 = r0.f71138m
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.cz r3 = r3.mo84918b(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.g<T, java.lang.Object> r5 = r3.f71192a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.mo84566h()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            int[] r6 = r0.f71126a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f71125q
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x0030:
            if (r10 >= r6) goto L_0x048a
            int r13 = r0.mo84491j(r10)
            int[] r14 = r0.f71126a
            r14 = r14[r10]
            int r15 = m120096i(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0058
            int[] r4 = r0.f71126a
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
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?> r9 = r0.f71138m
            int r9 = r9.mo84917a(r5)
            if (r9 > r14) goto L_0x0077
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?> r9 = r0.f71138m
            r9.mo84922f(r2, r5)
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
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r8 = r0.mo84493m(r10)
            r2.mo84855d(r14, r4, r8)
            goto L_0x007d
        L_0x0092:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            long r8 = m120097k(r1, r8)
            r2.mo84851L(r14, r8)
            goto L_0x007d
        L_0x00a0:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m120095M(r1, r8)
            r2.mo84876y(r14, r4)
            goto L_0x007d
        L_0x00ae:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            long r8 = m120097k(r1, r8)
            r2.mo84842C(r14, r8)
            goto L_0x007d
        L_0x00bc:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m120095M(r1, r8)
            r2.mo84844E(r14, r4)
            goto L_0x007d
        L_0x00ca:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m120095M(r1, r8)
            r2.mo84846G(r14, r4)
            goto L_0x007d
        L_0x00d8:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m120095M(r1, r8)
            r2.mo84852a(r14, r4)
            goto L_0x007d
        L_0x00e6:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r4
            r2.mo84856e(r14, r4)
            goto L_0x007d
        L_0x00f6:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r8 = r0.mo84493m(r10)
            r2.mo84870s(r14, r4, r8)
            goto L_0x007d
        L_0x0109:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r7.getObject(r1, r8)
            m120089D(r14, r4, r2)
            goto L_0x007d
        L_0x0118:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            boolean r4 = m120087B(r1, r8)
            r2.mo84877z(r14, r4)
            goto L_0x007d
        L_0x0127:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m120095M(r1, r8)
            r2.mo84858g(r14, r4)
            goto L_0x007d
        L_0x0136:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            long r8 = m120097k(r1, r8)
            r2.mo84854c(r14, r8)
            goto L_0x007d
        L_0x0145:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            int r4 = m120095M(r1, r8)
            r2.mo84865n(r14, r4)
            goto L_0x007d
        L_0x0154:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            long r8 = m120097k(r1, r8)
            r2.mo84866o(r14, r8)
            goto L_0x007d
        L_0x0163:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            long r8 = m120097k(r1, r8)
            r2.mo84843D(r14, r8)
            goto L_0x007d
        L_0x0172:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            float r4 = m120094J(r1, r8)
            r2.mo84867p(r14, r4)
            goto L_0x007d
        L_0x0181:
            boolean r4 = r0.mo84471A(r1, r14, r10)
            if (r4 == 0) goto L_0x007d
            double r8 = m120093I(r1, r8)
            r2.mo84848I(r14, r8)
            goto L_0x007d
        L_0x0190:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo84500u(r2, r14, r4, r10)
            goto L_0x007d
        L_0x0199:
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r9 = r0.mo84493m(r10)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120694o(r4, r8, r2, r9)
            goto L_0x007d
        L_0x01ac:
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r14 = 1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120701v(r4, r8, r2, r14)
            goto L_0x007d
        L_0x01bc:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120700u(r4, r8, r2, r14)
            goto L_0x007d
        L_0x01cc:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120699t(r4, r8, r2, r14)
            goto L_0x007d
        L_0x01dc:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120698s(r4, r8, r2, r14)
            goto L_0x007d
        L_0x01ec:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120690k(r4, r8, r2, r14)
            goto L_0x007d
        L_0x01fc:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120703x(r4, r8, r2, r14)
            goto L_0x007d
        L_0x020c:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120687h(r4, r8, r2, r14)
            goto L_0x007d
        L_0x021c:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120691l(r4, r8, r2, r14)
            goto L_0x007d
        L_0x022c:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120692m(r4, r8, r2, r14)
            goto L_0x007d
        L_0x023c:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120695p(r4, r8, r2, r14)
            goto L_0x007d
        L_0x024c:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120704y(r4, r8, r2, r14)
            goto L_0x007d
        L_0x025c:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120696q(r4, r8, r2, r14)
            goto L_0x007d
        L_0x026c:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120693n(r4, r8, r2, r14)
            goto L_0x007d
        L_0x027c:
            r14 = 1
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120689j(r4, r8, r2, r14)
            goto L_0x007d
        L_0x028c:
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120701v(r4, r8, r2, r14)
            goto L_0x02e5
        L_0x029b:
            r14 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120700u(r4, r8, r2, r14)
            goto L_0x02e5
        L_0x02aa:
            r14 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120699t(r4, r8, r2, r14)
            goto L_0x02e5
        L_0x02b9:
            r14 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120698s(r4, r8, r2, r14)
            goto L_0x02e5
        L_0x02c8:
            r14 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120690k(r4, r8, r2, r14)
            goto L_0x02e5
        L_0x02d7:
            r14 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120703x(r4, r8, r2, r14)
        L_0x02e5:
            r15 = r14
            goto L_0x0483
        L_0x02e8:
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120688i(r4, r8, r2)
            goto L_0x007d
        L_0x02f7:
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r9 = r0.mo84493m(r10)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120697r(r4, r8, r2, r9)
            goto L_0x007d
        L_0x030a:
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120702w(r4, r8, r2)
            goto L_0x007d
        L_0x0319:
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120687h(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0329:
            r15 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120691l(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0339:
            r15 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120692m(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0349:
            r15 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120695p(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0359:
            r15 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120704y(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0369:
            r15 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120696q(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0379:
            r15 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120693n(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0389:
            r15 = 0
            int[] r4 = r0.f71126a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.l10.m120689j(r4, r8, r2, r15)
            goto L_0x0483
        L_0x0399:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r8 = r0.mo84493m(r10)
            r2.mo84855d(r14, r4, r8)
            goto L_0x0483
        L_0x03aa:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            long r8 = r7.getLong(r1, r8)
            r2.mo84851L(r14, r8)
            goto L_0x0483
        L_0x03b7:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo84876y(r14, r4)
            goto L_0x0483
        L_0x03c4:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            long r8 = r7.getLong(r1, r8)
            r2.mo84842C(r14, r8)
            goto L_0x0483
        L_0x03d1:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo84844E(r14, r4)
            goto L_0x0483
        L_0x03de:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo84846G(r14, r4)
            goto L_0x0483
        L_0x03eb:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo84852a(r14, r4)
            goto L_0x0483
        L_0x03f8:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp) r4
            r2.mo84856e(r14, r4)
            goto L_0x0483
        L_0x0407:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r8 = r0.mo84493m(r10)
            r2.mo84870s(r14, r4, r8)
            goto L_0x0483
        L_0x0418:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            java.lang.Object r4 = r7.getObject(r1, r8)
            m120089D(r14, r4, r2)
            goto L_0x0483
        L_0x0424:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            boolean r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121125B(r1, r8)
            r2.mo84877z(r14, r4)
            goto L_0x0483
        L_0x0430:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo84858g(r14, r4)
            goto L_0x0483
        L_0x043c:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            long r8 = r7.getLong(r1, r8)
            r2.mo84854c(r14, r8)
            goto L_0x0483
        L_0x0448:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            int r4 = r7.getInt(r1, r8)
            r2.mo84865n(r14, r4)
            goto L_0x0483
        L_0x0454:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            long r8 = r7.getLong(r1, r8)
            r2.mo84866o(r14, r8)
            goto L_0x0483
        L_0x0460:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            long r8 = r7.getLong(r1, r8)
            r2.mo84843D(r14, r8)
            goto L_0x0483
        L_0x046c:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            float r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121135g(r1, r8)
            r2.mo84867p(r14, r4)
            goto L_0x0483
        L_0x0478:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0483
            double r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121134f(r1, r8)
            r2.mo84848I(r14, r8)
        L_0x0483:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0030
        L_0x048a:
            if (r5 == 0) goto L_0x04a1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.yy<?> r4 = r0.f71138m
            r4.mo84922f(r2, r5)
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
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.j<?, ?> r3 = r0.f71137l
            java.lang.Object r1 = r3.mo84680c(r1)
            r3.mo84689l(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.a10.mo84499t(java.lang.Object, com.google.android.gms.internal.mlkit_vision_text_bundled_common.z):void");
    }

    /* renamed from: u */
    public final <K, V> void mo84500u(C29947z zVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zVar.mo84859h(i, ((q00) mo84494n(i2)).mo84794c(), (zbyz) obj);
        }
    }

    /* renamed from: v */
    public final boolean mo84501v(T t, T t2, int i) {
        return mo84502w(t, i) == mo84502w(t2, i);
    }

    /* renamed from: w */
    public final boolean mo84502w(T t, int i) {
        int T = mo84481T(i);
        long j = (long) (T & 1048575);
        if (j == 1048575) {
            int j2 = mo84491j(i);
            long j3 = (long) (j2 & 1048575);
            switch (m120096i(j2)) {
                case 0:
                    if (C29725t.m121134f(t, j3) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (C29725t.m121135g(t, j3) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C29725t.m121137i(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C29725t.m121137i(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C29725t.m121136h(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C29725t.m121137i(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C29725t.m121136h(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C29725t.m121125B(t, j3);
                case 8:
                    Object k = C29725t.m121139k(t, j3);
                    if (k instanceof String) {
                        if (!((String) k).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(k instanceof zbwp)) {
                        throw new IllegalArgumentException();
                    } else if (!zbwp.f71626a.equals(k)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (C29725t.m121139k(t, j3) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zbwp.f71626a.equals(C29725t.m121139k(t, j3))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (C29725t.m121136h(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C29725t.m121136h(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C29725t.m121136h(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C29725t.m121137i(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C29725t.m121136h(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C29725t.m121137i(t, j3) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C29725t.m121139k(t, j3) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((C29725t.m121136h(t, j) & (1 << (T >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: x */
    public final T mo84503x() {
        return ((C29502mz) this.f71130e).mo84505l(4, (Object) null, (Object) null);
    }

    /* renamed from: y */
    public final boolean mo84504y(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? mo84502w(t, i) : (i3 & i4) != 0;
    }
}
