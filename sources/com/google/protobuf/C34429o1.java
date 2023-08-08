package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34363f1;
import com.google.protobuf.C34382j;
import com.google.protobuf.C34471v0;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.o1 */
public final class C34429o1<T> implements C34372g2<T> {

    /* renamed from: A */
    public static final Unsafe f83403A = C34341c3.m138970T();

    /* renamed from: r */
    public static final int f83404r = 3;

    /* renamed from: s */
    public static final int f83405s = 20;

    /* renamed from: t */
    public static final int f83406t = 1048575;

    /* renamed from: u */
    public static final int f83407u = 267386880;

    /* renamed from: v */
    public static final int f83408v = 268435456;

    /* renamed from: w */
    public static final int f83409w = 536870912;

    /* renamed from: x */
    public static final int f83410x = 1048575;

    /* renamed from: y */
    public static final int[] f83411y = new int[0];

    /* renamed from: z */
    public static final int f83412z = 51;

    /* renamed from: a */
    public final int[] f83413a;

    /* renamed from: b */
    public final Object[] f83414b;

    /* renamed from: c */
    public final int f83415c;

    /* renamed from: d */
    public final int f83416d;

    /* renamed from: e */
    public final C34412l1 f83417e;

    /* renamed from: f */
    public final boolean f83418f;

    /* renamed from: g */
    public final boolean f83419g;

    /* renamed from: h */
    public final boolean f83420h;

    /* renamed from: i */
    public final boolean f83421i;

    /* renamed from: j */
    public final int[] f83422j;

    /* renamed from: k */
    public final int f83423k;

    /* renamed from: l */
    public final int f83424l;

    /* renamed from: m */
    public final C34463t1 f83425m;

    /* renamed from: n */
    public final C34331b1 f83426n;

    /* renamed from: o */
    public final C34501x2<?, ?> f83427o;

    /* renamed from: p */
    public final C34374h0<?> f83428p;

    /* renamed from: q */
    public final C34371g1 f83429q;

    /* renamed from: com.google.protobuf.o1$a */
    public static /* synthetic */ class C34430a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83430a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f83430a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f83430a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.C34430a.<clinit>():void");
        }
    }

    public C34429o1(int[] iArr, Object[] objArr, int i, int i2, C34412l1 l1Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C34463t1 t1Var, C34331b1 b1Var, C34501x2<?, ?> x2Var, C34374h0<?> h0Var, C34371g1 g1Var) {
        boolean z3;
        this.f83413a = iArr;
        this.f83414b = objArr;
        this.f83415c = i;
        this.f83416d = i2;
        this.f83419g = l1Var instanceof GeneratedMessageLite;
        this.f83420h = z;
        if (h0Var == null || !h0Var.mo101128e(l1Var)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f83418f = z3;
        this.f83421i = z2;
        this.f83422j = iArr2;
        this.f83423k = i3;
        this.f83424l = i4;
        this.f83425m = t1Var;
        this.f83426n = b1Var;
        this.f83427o = x2Var;
        this.f83428p = h0Var;
        this.f83417e = l1Var;
        this.f83429q = g1Var;
    }

    /* renamed from: B */
    public static <T> int m139999B(T t, long j) {
        return C34341c3.m138961K(t, j);
    }

    /* renamed from: C */
    public static boolean m140000C(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: F */
    public static boolean m140001F(Object obj, int i, C34372g2 g2Var) {
        return g2Var.mo101116c(C34341c3.m138967Q(obj, m140008W(i)));
    }

    /* renamed from: K */
    public static boolean m140002K(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: L */
    public static List<?> m140003L(Object obj, long j) {
        return (List) C34341c3.m138967Q(obj, j);
    }

    /* renamed from: M */
    public static <T> long m140004M(T t, long j) {
        return C34341c3.m138964N(t, j);
    }

    /* renamed from: S */
    public static <T> C34429o1<T> m140005S(Class<T> cls, C34386j1 j1Var, C34463t1 t1Var, C34331b1 b1Var, C34501x2<?, ?> x2Var, C34374h0<?> h0Var, C34371g1 g1Var) {
        if (j1Var instanceof C34359e2) {
            return m140007U((C34359e2) j1Var, t1Var, b1Var, x2Var, h0Var, g1Var);
        }
        return m140006T((C34435p2) j1Var, t1Var, b1Var, x2Var, h0Var, g1Var);
    }

    /* renamed from: T */
    public static <T> C34429o1<T> m140006T(C34435p2 p2Var, C34463t1 t1Var, C34331b1 b1Var, C34501x2<?, ?> x2Var, C34374h0<?> h0Var, C34371g1 g1Var) {
        boolean z;
        int i;
        int i2;
        int[] iArr;
        int i3;
        if (p2Var.getSyntax() == ProtoSyntax.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        C34400k0[] d = p2Var.mo101494d();
        if (d.length == 0) {
            i2 = 0;
            i = 0;
        } else {
            i2 = d[0].mo101220h0();
            i = d[d.length - 1].mo101220h0();
        }
        int length = d.length;
        int[] iArr2 = new int[(length * 3)];
        Object[] objArr = new Object[(length * 2)];
        int i4 = 0;
        int i5 = 0;
        for (C34400k0 k0Var : d) {
            if (k0Var.mo101228u0() == FieldType.MAP) {
                i4++;
            } else if (k0Var.mo101228u0().mo100407w() >= 18 && k0Var.mo101228u0().mo100407w() <= 49) {
                i5++;
            }
        }
        int[] iArr3 = null;
        if (i4 > 0) {
            iArr = new int[i4];
        } else {
            iArr = null;
        }
        if (i5 > 0) {
            iArr3 = new int[i5];
        }
        int[] c = p2Var.mo101493c();
        if (c == null) {
            c = f83411y;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i6 < d.length) {
            C34400k0 k0Var2 = d[i6];
            int h0 = k0Var2.mo101220h0();
            m140018s0(k0Var2, iArr2, i7, objArr);
            if (i8 < c.length && c[i8] == h0) {
                c[i8] = i7;
                i8++;
            }
            if (k0Var2.mo101228u0() == FieldType.MAP) {
                iArr[i9] = i7;
                i9++;
            } else if (k0Var2.mo101228u0().mo100407w() >= 18 && k0Var2.mo101228u0().mo100407w() <= 49) {
                i3 = i7;
                iArr3[i10] = (int) C34341c3.m138976Z(k0Var2.mo101218f0());
                i10++;
                i6++;
                i7 = i3 + 3;
            }
            i3 = i7;
            i6++;
            i7 = i3 + 3;
        }
        if (iArr == null) {
            iArr = f83411y;
        }
        if (iArr3 == null) {
            iArr3 = f83411y;
        }
        int[] iArr4 = new int[(c.length + iArr.length + iArr3.length)];
        System.arraycopy(c, 0, iArr4, 0, c.length);
        System.arraycopy(iArr, 0, iArr4, c.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, c.length + iArr.length, iArr3.length);
        return new C34429o1(iArr2, objArr, i2, i, p2Var.mo101042b(), z, true, iArr4, c.length, c.length + iArr.length, t1Var, b1Var, x2Var, h0Var, g1Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x036d  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.protobuf.C34429o1<T> m140007U(com.google.protobuf.C34359e2 r34, com.google.protobuf.C34463t1 r35, com.google.protobuf.C34331b1 r36, com.google.protobuf.C34501x2<?, ?> r37, com.google.protobuf.C34374h0<?> r38, com.google.protobuf.C34371g1 r39) {
        /*
            com.google.protobuf.ProtoSyntax r0 = r34.getSyntax()
            com.google.protobuf.ProtoSyntax r1 = com.google.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r34.mo101044d()
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
            if (r6 != 0) goto L_0x0058
            int[] r6 = f83411y
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0162
        L_0x0058:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0077
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0064:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0074
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0064
        L_0x0074:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0077:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0096
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0083:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0093
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0083
        L_0x0093:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0096:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a2:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a2
        L_0x00b2:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b5:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c1:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c1
        L_0x00d1:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d4:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e0:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f0
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e0
        L_0x00f0:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f3:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0112
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ff:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010f
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ff
        L_0x010f:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0112:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0133
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011e:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012f
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011e
        L_0x012f:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0133:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0156
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013f:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0151
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013f
        L_0x0151:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0156:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0162:
            sun.misc.Unsafe r15 = f83403A
            java.lang.Object[] r17 = r34.mo101043c()
            com.google.protobuf.l1 r18 = r34.mo101042b()
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
        L_0x0181:
            if (r4 >= r1) goto L_0x03bd
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a9
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0191:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0191
        L_0x01a3:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ab
        L_0x01a9:
            r3 = r24
        L_0x01ab:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b9:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d2
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b9
        L_0x01d2:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01dc
        L_0x01d8:
            r28 = r1
            r1 = r24
        L_0x01dc:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e9
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e9:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0286
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0218
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x01fe:
            int r33 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0213
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r32
            r1 = r1 | r12
            int r32 = r32 + 13
            r14 = r33
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fe
        L_0x0213:
            int r12 = r14 << r32
            r1 = r1 | r12
            r14 = r33
        L_0x0218:
            int r12 = r5 + -51
            r32 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0238
            r14 = 17
            if (r12 != r14) goto L_0x0225
            goto L_0x0238
        L_0x0225:
            r14 = 12
            if (r12 != r14) goto L_0x0246
            if (r10 != 0) goto L_0x0246
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0244
        L_0x0238:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0244:
            r16 = r14
        L_0x0246:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0251
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0259
        L_0x0251:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m140016o0(r2, r12)
            r17[r1] = r12
        L_0x0259:
            r14 = r8
            r33 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r1 = r1 + 1
            r9 = r17[r1]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026c
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0274
        L_0x026c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m140016o0(r2, r9)
            r17[r1] = r9
        L_0x0274:
            r1 = r8
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r31 = r0
            r9 = r8
            r0 = r10
            r29 = r32
            r25 = 1
            r8 = r1
            r1 = 0
            goto L_0x0386
        L_0x0286:
            r14 = r8
            r33 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m140016o0(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x02fe
            r12 = 17
            if (r5 != r12) goto L_0x029c
            goto L_0x02fe
        L_0x029c:
            r12 = 27
            if (r5 == r12) goto L_0x02ed
            r12 = 49
            if (r5 != r12) goto L_0x02a5
            goto L_0x02ed
        L_0x02a5:
            r12 = 12
            if (r5 == r12) goto L_0x02dc
            r12 = 30
            if (r5 == r12) goto L_0x02dc
            r12 = 44
            if (r5 != r12) goto L_0x02b2
            goto L_0x02dc
        L_0x02b2:
            r12 = 50
            if (r5 != r12) goto L_0x02d2
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02d5
            int r22 = r22 + 1
            int r8 = r27 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02d2:
            r25 = 1
            goto L_0x030c
        L_0x02d5:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x030d
        L_0x02dc:
            if (r10 != 0) goto L_0x02d2
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02fb
        L_0x02ed:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02fb:
            r12 = r27
            goto L_0x030d
        L_0x02fe:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x030c:
            r12 = r8
        L_0x030d:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x031d
            r9 = r25
            goto L_0x031e
        L_0x031d:
            r9 = 0
        L_0x031e:
            if (r9 == 0) goto L_0x036d
            r9 = 17
            if (r5 > r9) goto L_0x036d
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0349
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0333:
            int r29 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0345
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r26
            r1 = r1 | r9
            int r26 = r26 + 13
            r9 = r29
            goto L_0x0333
        L_0x0345:
            int r9 = r9 << r26
            r1 = r1 | r9
            goto L_0x034b
        L_0x0349:
            r29 = r9
        L_0x034b:
            int r9 = r6 * 2
            int r26 = r1 / 32
            int r9 = r9 + r26
            r12 = r17[r9]
            r31 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035c
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0364
        L_0x035c:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m140016o0(r2, r12)
            r17[r9] = r12
        L_0x0364:
            r0 = r10
            long r9 = r15.objectFieldOffset(r12)
            int r9 = (int) r9
            int r1 = r1 % 32
            goto L_0x0376
        L_0x036d:
            r31 = r0
            r0 = r10
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r1
            r1 = 0
        L_0x0376:
            r10 = 18
            if (r5 < r10) goto L_0x0384
            r10 = 49
            if (r5 > r10) goto L_0x0384
            int r10 = r23 + 1
            r13[r23] = r8
            r23 = r10
        L_0x0384:
            r16 = r27
        L_0x0386:
            int r10 = r21 + 1
            r7[r21] = r4
            int r4 = r10 + 1
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0393
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0394
        L_0x0393:
            r12 = 0
        L_0x0394:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039b
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039c
        L_0x039b:
            r3 = 0
        L_0x039c:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r8
            r7[r10] = r3
            int r21 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r9
            r7[r4] = r1
            r10 = r0
            r8 = r14
            r14 = r24
            r1 = r28
            r4 = r29
            r12 = r30
            r0 = r31
            r9 = r33
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0181
        L_0x03bd:
            r33 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            com.google.protobuf.o1 r1 = new com.google.protobuf.o1
            com.google.protobuf.l1 r9 = r34.mo101042b()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.m140007U(com.google.protobuf.e2, com.google.protobuf.t1, com.google.protobuf.b1, com.google.protobuf.x2, com.google.protobuf.h0, com.google.protobuf.g1):com.google.protobuf.o1");
    }

    /* renamed from: W */
    public static long m140008W(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: X */
    public static <T> boolean m140009X(T t, long j) {
        return ((Boolean) C34341c3.m138967Q(t, j)).booleanValue();
    }

    /* renamed from: Y */
    public static <T> double m140010Y(T t, long j) {
        return ((Double) C34341c3.m138967Q(t, j)).doubleValue();
    }

    /* renamed from: Z */
    public static <T> float m140011Z(T t, long j) {
        return ((Float) C34341c3.m138967Q(t, j)).floatValue();
    }

    /* renamed from: a0 */
    public static <T> int m140012a0(T t, long j) {
        return ((Integer) C34341c3.m138967Q(t, j)).intValue();
    }

    /* renamed from: b0 */
    public static <T> long m140013b0(T t, long j) {
        return ((Long) C34341c3.m138967Q(t, j)).longValue();
    }

    /* renamed from: l */
    public static <T> boolean m140014l(T t, long j) {
        return C34341c3.m139021w(t, j);
    }

    /* renamed from: o */
    public static <T> double m140015o(T t, long j) {
        return C34341c3.m138956F(t, j);
    }

    /* renamed from: o0 */
    public static Field m140016o0(Class<?> cls, String str) {
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

    /* renamed from: s */
    public static <T> float m140017s(T t, long j) {
        return C34341c3.m138958H(t, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m140018s0(com.google.protobuf.C34400k0 r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.w1 r0 = r8.mo101224n0()
            r1 = 0
            if (r0 == 0) goto L_0x0025
            com.google.protobuf.FieldType r2 = r8.mo101228u0()
            int r2 = r2.mo100407w()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.mo101661c()
            long r3 = com.google.protobuf.C34341c3.m138976Z(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.mo101659a()
            long r4 = com.google.protobuf.C34341c3.m138976Z(r0)
        L_0x0022:
            int r0 = (int) r4
            r4 = r1
            goto L_0x006c
        L_0x0025:
            com.google.protobuf.FieldType r0 = r8.mo101228u0()
            java.lang.reflect.Field r2 = r8.mo101218f0()
            long r2 = com.google.protobuf.C34341c3.m138976Z(r2)
            int r3 = (int) r2
            int r2 = r0.mo100407w()
            boolean r4 = r0.mo100408y()
            if (r4 != 0) goto L_0x005a
            boolean r0 = r0.mo100409z()
            if (r0 != 0) goto L_0x005a
            java.lang.reflect.Field r0 = r8.mo101226p0()
            if (r0 != 0) goto L_0x004c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0051
        L_0x004c:
            long r4 = com.google.protobuf.C34341c3.m138976Z(r0)
            int r0 = (int) r4
        L_0x0051:
            int r4 = r8.mo101227t0()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L_0x006c
        L_0x005a:
            java.lang.reflect.Field r0 = r8.mo101215Z()
            if (r0 != 0) goto L_0x0063
            r0 = r1
            r4 = r0
            goto L_0x006c
        L_0x0063:
            java.lang.reflect.Field r0 = r8.mo101215Z()
            long r4 = com.google.protobuf.C34341c3.m138976Z(r0)
            goto L_0x0022
        L_0x006c:
            int r5 = r8.mo101220h0()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.mo101213A0()
            if (r6 == 0) goto L_0x007d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x007e
        L_0x007d:
            r6 = r1
        L_0x007e:
            boolean r7 = r8.mo101214F0()
            if (r7 == 0) goto L_0x0086
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0086:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.mo101223m0()
            java.lang.Object r0 = r8.mo101222j0()
            if (r0 == 0) goto L_0x00be
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.mo101222j0()
            r11[r10] = r0
            if (r9 == 0) goto L_0x00af
            int r10 = r10 + 1
            r11[r10] = r9
            goto L_0x00db
        L_0x00af:
            com.google.protobuf.v0$e r9 = r8.mo101217e0()
            if (r9 == 0) goto L_0x00db
            int r10 = r10 + 1
            com.google.protobuf.v0$e r8 = r8.mo101217e0()
            r11[r10] = r8
            goto L_0x00db
        L_0x00be:
            if (r9 == 0) goto L_0x00c9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            goto L_0x00db
        L_0x00c9:
            com.google.protobuf.v0$e r9 = r8.mo101217e0()
            if (r9 == 0) goto L_0x00db
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.v0$e r8 = r8.mo101217e0()
            r11[r10] = r8
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.m140018s0(com.google.protobuf.k0, int[], int, java.lang.Object[]):void");
    }

    /* renamed from: t0 */
    public static int m140019t0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: w */
    public static C34505y2 m140020w(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C34505y2 y2Var = generatedMessageLite.unknownFields;
        if (y2Var != C34505y2.m140700c()) {
            return y2Var;
        }
        C34505y2 n = C34505y2.m140704n();
        generatedMessageLite.unknownFields = n;
        return n;
    }

    /* renamed from: A */
    public final <UT, UB> int mo101426A(C34501x2<UT, UB> x2Var, T t) {
        return x2Var.mo101682h(x2Var.mo101681g(t));
    }

    /* renamed from: A0 */
    public final <UT, UB> void mo101427A0(C34501x2<UT, UB> x2Var, T t, Writer writer) throws IOException {
        x2Var.mo101694t(x2Var.mo101681g(t), writer);
    }

    /* renamed from: D */
    public final boolean mo101428D(T t, int i) {
        int j0 = mo101447j0(i);
        long j = (long) (1048575 & j0);
        if (j == 1048575) {
            int u0 = mo101463u0(i);
            long W = m140008W(u0);
            switch (m140019t0(u0)) {
                case 0:
                    if (C34341c3.m138956F(t, W) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (C34341c3.m138958H(t, W) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C34341c3.m138964N(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C34341c3.m138964N(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C34341c3.m138961K(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C34341c3.m138964N(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C34341c3.m138961K(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C34341c3.m139021w(t, W);
                case 8:
                    Object Q = C34341c3.m138967Q(t, W);
                    if (Q instanceof String) {
                        return !((String) Q).isEmpty();
                    }
                    if (Q instanceof ByteString) {
                        return !ByteString.f82785d.equals(Q);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C34341c3.m138967Q(t, W) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !ByteString.f82785d.equals(C34341c3.m138967Q(t, W));
                case 11:
                    if (C34341c3.m138961K(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C34341c3.m138961K(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C34341c3.m138961K(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C34341c3.m138964N(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C34341c3.m138961K(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C34341c3.m138964N(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C34341c3.m138967Q(t, W) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((C34341c3.m138961K(t, j) & (1 << (j0 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: E */
    public final boolean mo101429E(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? mo101428D(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: G */
    public final <N> boolean mo101430G(Object obj, int i, int i2) {
        List list = (List) C34341c3.m138967Q(obj, m140008W(i));
        if (list.isEmpty()) {
            return true;
        }
        C34372g2 v = mo101464v(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!v.mo101116c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public final boolean mo101431H(T t, int i, int i2) {
        Map<?, ?> e = this.f83429q.mo101110e(C34341c3.m138967Q(t, m140008W(i)));
        if (e.isEmpty()) {
            return true;
        }
        if (this.f83429q.mo101107b(mo101462u(i2)).f83270c.mo100782g() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        C34372g2<?> g2Var = null;
        for (Object next : e.values()) {
            if (g2Var == null) {
                g2Var = C34325a2.m138828a().mo100881i(next.getClass());
            }
            if (!g2Var.mo101116c(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public final boolean mo101432I(T t, T t2, int i) {
        long j0 = (long) (mo101447j0(i) & 1048575);
        if (C34341c3.m138961K(t, j0) == C34341c3.m138961K(t2, j0)) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean mo101433J(T t, int i, int i2) {
        if (C34341c3.m138961K(t, (long) (mo101447j0(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: N */
    public final <UT, UB, ET extends com.google.protobuf.C34425o0.C34428c<ET>> void mo101434N(com.google.protobuf.C34501x2<UT, UB> r17, com.google.protobuf.C34374h0<ET> r18, T r19, com.google.protobuf.C34366f2 r20, com.google.protobuf.C34368g0 r21) throws java.io.IOException {
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
            int r1 = r20.mo101099z()     // Catch:{ all -> 0x0612 }
            int r3 = r8.mo101445h0(r1)     // Catch:{ all -> 0x0612 }
            if (r3 >= 0) goto L_0x008e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f83423k
        L_0x001e:
            int r1 = r8.f83424l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f83422j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo101457q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo101689o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f83418f     // Catch:{ all -> 0x0612 }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            com.google.protobuf.l1 r2 = r8.f83417e     // Catch:{ all -> 0x0612 }
            r15 = r18
            java.lang.Object r1 = r15.mo101125b(r11, r2, r1)     // Catch:{ all -> 0x0612 }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005c
            if (r14 != 0) goto L_0x004d
            com.google.protobuf.o0 r1 = r18.mo101127d(r19)     // Catch:{ all -> 0x0612 }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.mo101130g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0612 }
            goto L_0x000d
        L_0x005c:
            boolean r1 = r9.mo101691q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r20.mo101057E()     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0069:
            if (r13 != 0) goto L_0x0070
            java.lang.Object r1 = r9.mo101680f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x0070:
            boolean r1 = r9.mo101687m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0077:
            int r0 = r8.f83423k
        L_0x0079:
            int r1 = r8.f83424l
            if (r0 >= r1) goto L_0x0088
            int[] r1 = r8.f83422j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo101457q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0079
        L_0x0088:
            if (r13 == 0) goto L_0x008d
            r9.mo101689o(r10, r13)
        L_0x008d:
            return
        L_0x008e:
            r15 = r18
            int r4 = r8.mo101463u0(r3)     // Catch:{ all -> 0x0612 }
            int r2 = m140019t0(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            switch(r2) {
                case 0: goto L_0x059d;
                case 1: goto L_0x058d;
                case 2: goto L_0x057d;
                case 3: goto L_0x056d;
                case 4: goto L_0x055d;
                case 5: goto L_0x054d;
                case 6: goto L_0x053d;
                case 7: goto L_0x052d;
                case 8: goto L_0x0525;
                case 9: goto L_0x04ee;
                case 10: goto L_0x04de;
                case 11: goto L_0x04ce;
                case 12: goto L_0x04ab;
                case 13: goto L_0x049b;
                case 14: goto L_0x048b;
                case 15: goto L_0x047b;
                case 16: goto L_0x046b;
                case 17: goto L_0x0434;
                case 18: goto L_0x0425;
                case 19: goto L_0x0416;
                case 20: goto L_0x0407;
                case 21: goto L_0x03f8;
                case 22: goto L_0x03e9;
                case 23: goto L_0x03da;
                case 24: goto L_0x03cb;
                case 25: goto L_0x03bc;
                case 26: goto L_0x03b7;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0396;
                case 29: goto L_0x0387;
                case 30: goto L_0x0370;
                case 31: goto L_0x0361;
                case 32: goto L_0x0352;
                case 33: goto L_0x0343;
                case 34: goto L_0x0334;
                case 35: goto L_0x0325;
                case 36: goto L_0x0316;
                case 37: goto L_0x0307;
                case 38: goto L_0x02f8;
                case 39: goto L_0x02e9;
                case 40: goto L_0x02da;
                case 41: goto L_0x02cb;
                case 42: goto L_0x02bc;
                case 43: goto L_0x02ad;
                case 44: goto L_0x0296;
                case 45: goto L_0x0287;
                case 46: goto L_0x0278;
                case 47: goto L_0x0269;
                case 48: goto L_0x025a;
                case 49: goto L_0x0244;
                case 50: goto L_0x0233;
                case 51: goto L_0x021f;
                case 52: goto L_0x020b;
                case 53: goto L_0x01f7;
                case 54: goto L_0x01e3;
                case 55: goto L_0x01cf;
                case 56: goto L_0x01bb;
                case 57: goto L_0x01a7;
                case 58: goto L_0x0193;
                case 59: goto L_0x018b;
                case 60: goto L_0x0152;
                case 61: goto L_0x0142;
                case 62: goto L_0x012e;
                case 63: goto L_0x0107;
                case 64: goto L_0x00f3;
                case 65: goto L_0x00df;
                case 66: goto L_0x00cb;
                case 67: goto L_0x00b7;
                case 68: goto L_0x00a3;
                default: goto L_0x009b;
            }     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x009b:
            if (r13 != 0) goto L_0x05ae
            java.lang.Object r1 = r17.mo101688n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x05ad
        L_0x00a3:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.g2 r2 = r8.mo101464v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo101069Q(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00b7:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo101097x()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00cb:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo101082k()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00df:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo101076e()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00f3:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo101058F()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0107:
            int r2 = r20.mo101081j()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.v0$e r5 = r8.mo101461t(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x011e
            boolean r5 = r5.mo93189a(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            java.lang.Object r13 = com.google.protobuf.C34381i2.m139328Q(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x011e:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x012e:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo101078g()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0142:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.ByteString r2 = r20.mo101085n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0152:
            boolean r2 = r8.mo101433J(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r2 == 0) goto L_0x0174
            long r5 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = com.google.protobuf.C34341c3.m138967Q(r10, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.g2 r5 = r8.mo101464v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r5 = r0.mo101071S(r5, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = com.google.protobuf.C34471v0.m140591v(r2, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x0186
        L_0x0174:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.g2 r2 = r8.mo101464v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo101071S(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x0186:
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x018b:
            r8.mo101452m0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0193:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r2 = r20.mo101075d()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01a7:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo101093t()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01bb:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo101072a()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01cf:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo101086o()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01e3:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo101089r()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01f7:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo101061I()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x020b:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r2 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x021f:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r6 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101458q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0233:
            java.lang.Object r4 = r8.mo101462u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mo101435O(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0244:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.g2 r6 = r8.mo101464v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.mo101449k0(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x025a:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101074c(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0269:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101088q(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0278:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101094u(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0287:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101073b(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0296:
            com.google.protobuf.b1 r2 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.mo100959e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101080i(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.v0$e r3 = r8.mo101461t(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = com.google.protobuf.C34381i2.m139310C(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02ad:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101092s(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02bc:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101083l(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02cb:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101096w(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02da:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101087p(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02e9:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101095v(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02f8:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101077f(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0307:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101079h(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0316:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101055C(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0325:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101060H(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0334:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101074c(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0343:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101088q(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0352:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101094u(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0361:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101073b(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0370:
            com.google.protobuf.b1 r2 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.mo100959e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101080i(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.v0$e r3 = r8.mo101461t(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = com.google.protobuf.C34381i2.m139310C(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0387:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101092s(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0396:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101059G(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03a5:
            com.google.protobuf.g2 r5 = r8.mo101464v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.mo101450l0(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03b7:
            r8.mo101454n0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03bc:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101083l(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03cb:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101096w(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03da:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101087p(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03e9:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101095v(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03f8:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101077f(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0407:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101079h(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0416:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101055C(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0425:
            com.google.protobuf.b1 r1 = r8.f83426n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo100959e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo101060H(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0434:
            boolean r1 = r8.mo101428D(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0457
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.C34341c3.m138967Q(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.g2 r2 = r8.mo101464v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo101069Q(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.C34471v0.m140591v(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0457:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.g2 r4 = r8.mo101464v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.mo101069Q(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x046b:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo101097x()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139012r0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x047b:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo101082k()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139006o0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x048b:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo101076e()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139012r0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x049b:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo101058F()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139006o0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ab:
            int r2 = r20.mo101081j()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.v0$e r5 = r8.mo101461t(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04c2
            boolean r5 = r5.mo93189a(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04bc
            goto L_0x04c2
        L_0x04bc:
            java.lang.Object r13 = com.google.protobuf.C34381i2.m139328Q(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04c2:
            long r4 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139006o0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ce:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo101078g()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139006o0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04de:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.ByteString r4 = r20.mo101085n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ee:
            boolean r1 = r8.mo101428D(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0511
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.C34341c3.m138967Q(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.g2 r2 = r8.mo101464v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo101071S(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.C34471v0.m140591v(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0511:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.g2 r4 = r8.mo101464v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.mo101071S(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139016t0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0525:
            r8.mo101452m0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x052d:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r4 = r20.mo101075d()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m138978a0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x053d:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo101093t()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139006o0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x054d:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo101072a()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139012r0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x055d:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo101086o()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139006o0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x056d:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo101089r()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139012r0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x057d:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo101061I()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139012r0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x058d:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r4 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m139000l0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x059d:
            long r1 = m140008W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r4 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C34341c3.m138996j0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo101456p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x05ad:
            r13 = r1
        L_0x05ae:
            boolean r1 = r9.mo101687m(r13, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f83423k
        L_0x05b6:
            int r1 = r8.f83424l
            if (r0 >= r1) goto L_0x05c5
            int[] r1 = r8.f83422j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo101457q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b6
        L_0x05c5:
            if (r13 == 0) goto L_0x05ca
            r9.mo101689o(r10, r13)
        L_0x05ca:
            return
        L_0x05cb:
            boolean r1 = r9.mo101691q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x05ee
            boolean r1 = r20.mo101057E()     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f83423k
        L_0x05d9:
            int r1 = r8.f83424l
            if (r0 >= r1) goto L_0x05e8
            int[] r1 = r8.f83422j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo101457q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05d9
        L_0x05e8:
            if (r13 == 0) goto L_0x05ed
            r9.mo101689o(r10, r13)
        L_0x05ed:
            return
        L_0x05ee:
            if (r13 != 0) goto L_0x05f5
            java.lang.Object r1 = r9.mo101680f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x05f5:
            boolean r1 = r9.mo101687m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f83423k
        L_0x05fd:
            int r1 = r8.f83424l
            if (r0 >= r1) goto L_0x060c
            int[] r1 = r8.f83422j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo101457q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fd
        L_0x060c:
            if (r13 == 0) goto L_0x0611
            r9.mo101689o(r10, r13)
        L_0x0611:
            return
        L_0x0612:
            r0 = move-exception
            int r1 = r8.f83423k
        L_0x0615:
            int r2 = r8.f83424l
            if (r1 >= r2) goto L_0x0624
            int[] r2 = r8.f83422j
            r2 = r2[r1]
            java.lang.Object r13 = r8.mo101457q(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0615
        L_0x0624:
            if (r13 == 0) goto L_0x0629
            r9.mo101689o(r10, r13)
        L_0x0629:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101434N(com.google.protobuf.x2, com.google.protobuf.h0, java.lang.Object, com.google.protobuf.f2, com.google.protobuf.g0):void");
    }

    /* renamed from: O */
    public final <K, V> void mo101435O(Object obj, int i, Object obj2, C34368g0 g0Var, C34366f2 f2Var) throws IOException {
        long W = m140008W(mo101463u0(i));
        Object Q = C34341c3.m138967Q(obj, W);
        if (Q == null) {
            Q = this.f83429q.mo101109d(obj2);
            C34341c3.m139016t0(obj, W, Q);
        } else if (this.f83429q.mo101113h(Q)) {
            Object d = this.f83429q.mo101109d(obj2);
            this.f83429q.mo101106a(d, Q);
            C34341c3.m139016t0(obj, W, d);
            Q = d;
        }
        f2Var.mo101066N(this.f83429q.mo101108c(Q), this.f83429q.mo101107b(obj2), g0Var);
    }

    /* renamed from: P */
    public final void mo101436P(T t, T t2, int i) {
        long W = m140008W(mo101463u0(i));
        if (mo101428D(t2, i)) {
            Object Q = C34341c3.m138967Q(t, W);
            Object Q2 = C34341c3.m138967Q(t2, W);
            if (Q != null && Q2 != null) {
                C34341c3.m139016t0(t, W, C34471v0.m140591v(Q, Q2));
                mo101456p0(t, i);
            } else if (Q2 != null) {
                C34341c3.m139016t0(t, W, Q2);
                mo101456p0(t, i);
            }
        }
    }

    /* renamed from: Q */
    public final void mo101437Q(T t, T t2, int i) {
        Object obj;
        int u0 = mo101463u0(i);
        int V = mo101439V(i);
        long W = m140008W(u0);
        if (mo101433J(t2, V, i)) {
            if (mo101433J(t, V, i)) {
                obj = C34341c3.m138967Q(t, W);
            } else {
                obj = null;
            }
            Object Q = C34341c3.m138967Q(t2, W);
            if (obj != null && Q != null) {
                C34341c3.m139016t0(t, W, C34471v0.m140591v(obj, Q));
                mo101458q0(t, V, i);
            } else if (Q != null) {
                C34341c3.m139016t0(t, W, Q);
                mo101458q0(t, V, i);
            }
        }
    }

    /* renamed from: R */
    public final void mo101438R(T t, T t2, int i) {
        int u0 = mo101463u0(i);
        long W = m140008W(u0);
        int V = mo101439V(i);
        switch (m140019t0(u0)) {
            case 0:
                if (mo101428D(t2, i)) {
                    C34341c3.m138996j0(t, W, C34341c3.m138956F(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 1:
                if (mo101428D(t2, i)) {
                    C34341c3.m139000l0(t, W, C34341c3.m138958H(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 2:
                if (mo101428D(t2, i)) {
                    C34341c3.m139012r0(t, W, C34341c3.m138964N(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 3:
                if (mo101428D(t2, i)) {
                    C34341c3.m139012r0(t, W, C34341c3.m138964N(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 4:
                if (mo101428D(t2, i)) {
                    C34341c3.m139006o0(t, W, C34341c3.m138961K(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 5:
                if (mo101428D(t2, i)) {
                    C34341c3.m139012r0(t, W, C34341c3.m138964N(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 6:
                if (mo101428D(t2, i)) {
                    C34341c3.m139006o0(t, W, C34341c3.m138961K(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 7:
                if (mo101428D(t2, i)) {
                    C34341c3.m138978a0(t, W, C34341c3.m139021w(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 8:
                if (mo101428D(t2, i)) {
                    C34341c3.m139016t0(t, W, C34341c3.m138967Q(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 9:
                mo101436P(t, t2, i);
                return;
            case 10:
                if (mo101428D(t2, i)) {
                    C34341c3.m139016t0(t, W, C34341c3.m138967Q(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 11:
                if (mo101428D(t2, i)) {
                    C34341c3.m139006o0(t, W, C34341c3.m138961K(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 12:
                if (mo101428D(t2, i)) {
                    C34341c3.m139006o0(t, W, C34341c3.m138961K(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 13:
                if (mo101428D(t2, i)) {
                    C34341c3.m139006o0(t, W, C34341c3.m138961K(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 14:
                if (mo101428D(t2, i)) {
                    C34341c3.m139012r0(t, W, C34341c3.m138964N(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 15:
                if (mo101428D(t2, i)) {
                    C34341c3.m139006o0(t, W, C34341c3.m138961K(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 16:
                if (mo101428D(t2, i)) {
                    C34341c3.m139012r0(t, W, C34341c3.m138964N(t2, W));
                    mo101456p0(t, i);
                    return;
                }
                return;
            case 17:
                mo101436P(t, t2, i);
                return;
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
                this.f83426n.mo100958d(t, t2, W);
                return;
            case 50:
                C34381i2.m139320I(this.f83429q, t, t2, W);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (mo101433J(t2, V, i)) {
                    C34341c3.m139016t0(t, W, C34341c3.m138967Q(t2, W));
                    mo101458q0(t, V, i);
                    return;
                }
                return;
            case 60:
                mo101437Q(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (mo101433J(t2, V, i)) {
                    C34341c3.m139016t0(t, W, C34341c3.m138967Q(t2, W));
                    mo101458q0(t, V, i);
                    return;
                }
                return;
            case 68:
                mo101437Q(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: V */
    public final int mo101439V(int i) {
        return this.f83413a[i];
    }

    /* renamed from: a */
    public void mo101114a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f83413a.length; i += 3) {
            mo101438R(t, t2, i);
        }
        C34381i2.m139321J(this.f83427o, t, t2);
        if (this.f83418f) {
            C34381i2.m139319H(this.f83428p, t, t2);
        }
    }

    /* renamed from: b */
    public void mo101115b(T t) {
        int i;
        int i2 = this.f83423k;
        while (true) {
            i = this.f83424l;
            if (i2 >= i) {
                break;
            }
            long W = m140008W(mo101463u0(this.f83422j[i2]));
            Object Q = C34341c3.m138967Q(t, W);
            if (Q != null) {
                C34341c3.m139016t0(t, W, this.f83429q.mo101111f(Q));
            }
            i2++;
        }
        int length = this.f83422j.length;
        while (i < length) {
            this.f83426n.mo100957c(t, (long) this.f83422j[i]);
            i++;
        }
        this.f83427o.mo101684j(t);
        if (this.f83418f) {
            this.f83428p.mo101129f(t);
        }
    }

    /* renamed from: c */
    public final boolean mo101116c(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f83423k) {
            int i6 = this.f83422j[i5];
            int V = mo101439V(i6);
            int u0 = mo101463u0(i6);
            int i7 = this.f83413a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f83403A.getInt(t2, (long) i8);
                }
                i = i4;
                i2 = i8;
            } else {
                i2 = i3;
                i = i4;
            }
            if (m140002K(u0) && !mo101429E(t, i6, i2, i, i9)) {
                return false;
            }
            int t0 = m140019t0(u0);
            if (t0 != 9 && t0 != 17) {
                if (t0 != 27) {
                    if (t0 == 60 || t0 == 68) {
                        if (mo101433J(t2, V, i6) && !m140001F(t2, u0, mo101464v(i6))) {
                            return false;
                        }
                    } else if (t0 != 49) {
                        if (t0 == 50 && !mo101431H(t2, u0, i6)) {
                            return false;
                        }
                    }
                }
                if (!mo101430G(t2, u0, i6)) {
                    return false;
                }
            } else if (mo101429E(t, i6, i2, i, i9) && !m140001F(t2, u0, mo101464v(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f83418f || this.f83428p.mo101126c(t2).mo101383E()) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public final <K, V> int mo101440c0(T t, byte[] bArr, int i, int i2, int i3, long j, C34382j.C34384b bVar) throws IOException {
        T t2 = t;
        long j2 = j;
        Unsafe unsafe = f83403A;
        int i4 = i3;
        Object u = mo101462u(i3);
        Object object = unsafe.getObject(t, j2);
        if (this.f83429q.mo101113h(object)) {
            Object d = this.f83429q.mo101109d(u);
            this.f83429q.mo101106a(d, object);
            unsafe.putObject(t, j2, d);
            object = d;
        }
        return mo101451m(bArr, i, i2, this.f83429q.mo101107b(u), this.f83429q.mo101108c(object), bVar);
    }

    /* renamed from: d */
    public int mo101117d(T t) {
        return this.f83420h ? mo101471z(t) : mo101469y(t);
    }

    /* renamed from: d0 */
    public final int mo101441d0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C34382j.C34384b bVar) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C34382j.C34384b bVar2 = bVar;
        Unsafe unsafe = f83403A;
        long j3 = (long) (this.f83413a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(C34382j.m139407d(bArr, i)));
                    int i14 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(C34382j.m139415l(bArr, i)));
                    int i15 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int L = C34382j.m139401L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(bVar2.f83293b));
                    unsafe.putInt(t2, j3, i11);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int I = C34382j.m139398I(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(bVar2.f83292a));
                    unsafe.putInt(t2, j3, i11);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C34382j.m139413j(bArr, i)));
                    int i16 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C34382j.m139411h(bArr, i)));
                    int i17 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int L2 = C34382j.m139401L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(bVar2.f83293b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return L2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int I2 = C34382j.m139398I(bArr2, i9, bVar2);
                    int i18 = bVar2.f83292a;
                    if (i18 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || Utf8.m138643u(bArr2, I2, I2 + i18)) {
                        unsafe.putObject(t2, j2, new String(bArr2, I2, i18, C34471v0.f83529a));
                        I2 += i18;
                    } else {
                        throw InvalidProtocolBufferException.m138415e();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return I2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int p = C34382j.m139419p(mo101464v(i13), bArr2, i9, i2, bVar2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, bVar2.f83294c);
                    } else {
                        unsafe.putObject(t2, j2, C34471v0.m140591v(object, bVar2.f83294c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return p;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int b = C34382j.m139405b(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, bVar2.f83294c);
                    unsafe.putInt(t2, j3, i11);
                    return b;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int I3 = C34382j.m139398I(bArr2, i9, bVar2);
                    int i19 = bVar2.f83292a;
                    C34471v0.C34476e t3 = mo101461t(i13);
                    if (t3 == null || t3.mo93189a(i19)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i19));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m140020w(t).mo101718q(i10, Long.valueOf((long) i19));
                    }
                    return I3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int I4 = C34382j.m139398I(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C34448s.m140146b(bVar2.f83292a)));
                    unsafe.putInt(t2, j3, i11);
                    return I4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int L3 = C34382j.m139401L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C34448s.m140147c(bVar2.f83293b)));
                    unsafe.putInt(t2, j3, i11);
                    return L3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int n = C34382j.m139417n(mo101464v(i13), bArr, i, i2, (i10 & -8) | 4, bVar);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, bVar2.f83294c);
                    } else {
                        unsafe.putObject(t2, j2, C34471v0.m140591v(object2, bVar2.f83294c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return n;
                }
                break;
        }
        return i9;
    }

    /* renamed from: e */
    public T mo101118e() {
        return this.f83425m.mo101595a(this.f83417e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03b9, code lost:
        if (r0 != r15) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03f9, code lost:
        if (r0 != r15) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x041b, code lost:
        if (r0 != r15) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x041e, code lost:
        r8 = r35;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0246, code lost:
        r1 = r6 | r21;
        r14 = r4;
        r13 = r5;
        r2 = r7;
        r3 = r11;
        r6 = r24;
        r11 = r35;
        r5 = r1;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02c7, code lost:
        r3 = r11;
        r14 = r13;
        r1 = r17;
        r6 = r24;
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x030b, code lost:
        r5 = r6 | r21;
        r13 = r34;
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0310, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0311, code lost:
        r3 = r11;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0316, code lost:
        r8 = r35;
        r2 = r3;
        r23 = r6;
        r21 = r7;
        r27 = r10;
        r9 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo101442e0(T r31, byte[] r32, int r33, int r34, int r35, com.google.protobuf.C34382j.C34384b r36) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f83403A
            r16 = 0
            r0 = r33
            r2 = r16
            r3 = r2
            r5 = r3
            r1 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x0479
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.protobuf.C34382j.m139397H(r0, r12, r3, r9)
            int r3 = r9.f83292a
            r4 = r3
            r3 = r0
            goto L_0x002c
        L_0x002b:
            r4 = r0
        L_0x002c:
            int r0 = r4 >>> 3
            r8 = r4 & 7
            r7 = 3
            if (r0 <= r1) goto L_0x0039
            int r2 = r2 / r7
            int r1 = r15.mo101446i0(r0, r2)
            goto L_0x003d
        L_0x0039:
            int r1 = r15.mo101445h0(r0)
        L_0x003d:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x0052
            r17 = r0
            r18 = r1
            r2 = r3
            r9 = r4
            r23 = r5
            r24 = r6
            r27 = r10
            r8 = r11
            r21 = r16
            goto L_0x0422
        L_0x0052:
            int[] r1 = r15.f83413a
            int r19 = r2 + 1
            r1 = r1[r19]
            int r7 = m140019t0(r1)
            long r11 = m140008W(r1)
            r19 = r4
            r4 = 17
            r20 = r1
            if (r7 > r4) goto L_0x0322
            int[] r4 = r15.f83413a
            int r21 = r2 + 2
            r4 = r4[r21]
            int r21 = r4 >>> 20
            r1 = 1
            int r21 = r1 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r13
            r17 = r2
            if (r4 == r6) goto L_0x0089
            if (r6 == r13) goto L_0x0081
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0081:
            long r1 = (long) r4
            int r5 = r10.getInt(r14, r1)
            r24 = r4
            goto L_0x008b
        L_0x0089:
            r24 = r6
        L_0x008b:
            r6 = r5
            r1 = 5
            switch(r7) {
                case 0: goto L_0x02ee;
                case 1: goto L_0x02d1;
                case 2: goto L_0x029e;
                case 3: goto L_0x029e;
                case 4: goto L_0x0280;
                case 5: goto L_0x0255;
                case 6: goto L_0x0228;
                case 7: goto L_0x01ff;
                case 8: goto L_0x01d4;
                case 9: goto L_0x0197;
                case 10: goto L_0x017d;
                case 11: goto L_0x0280;
                case 12: goto L_0x0145;
                case 13: goto L_0x0228;
                case 14: goto L_0x0255;
                case 15: goto L_0x0123;
                case 16: goto L_0x00f2;
                case 17: goto L_0x009f;
                default: goto L_0x0090;
            }
        L_0x0090:
            r12 = r32
            r4 = r14
            r7 = r17
            r11 = r19
            r18 = -1
            r17 = r0
        L_0x009b:
            r19 = r13
            goto L_0x0316
        L_0x009f:
            r2 = 3
            if (r8 != r2) goto L_0x00e6
            int r1 = r0 << 3
            r4 = r1 | 4
            r2 = r17
            com.google.protobuf.g2 r1 = r15.mo101464v(r2)
            r17 = r0
            r0 = r1
            r18 = -1
            r1 = r32
            r7 = r2
            r2 = r3
            r3 = r34
            r8 = r19
            r5 = r36
            int r0 = com.google.protobuf.C34382j.m139417n(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x00c9
            java.lang.Object r1 = r9.f83294c
            r10.putObject(r14, r11, r1)
            goto L_0x00d6
        L_0x00c9:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f83294c
            java.lang.Object r1 = com.google.protobuf.C34471v0.m140591v(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x00d6:
            r5 = r6 | r21
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r7
            r3 = r8
            r1 = r17
            r6 = r24
            goto L_0x001a
        L_0x00e6:
            r7 = r17
            r18 = -1
            r17 = r0
            r12 = r32
            r4 = r14
            r11 = r19
            goto L_0x009b
        L_0x00f2:
            r7 = r17
            r4 = r19
            r18 = -1
            r17 = r0
            if (r8 != 0) goto L_0x011c
            r1 = r11
            r12 = r32
            int r8 = com.google.protobuf.C34382j.m139401L(r12, r3, r9)
            long r13 = r9.f83293b
            long r13 = com.google.protobuf.C34448s.m140147c(r13)
            r0 = r10
            r2 = r1
            r1 = r31
            r11 = r4
            r4 = r13
            r0.putLong(r1, r2, r4)
            r5 = r6 | r21
            r14 = r31
            r13 = r34
            r2 = r7
            r0 = r8
            goto L_0x0311
        L_0x011c:
            r12 = r32
            r11 = r4
            r4 = r31
            goto L_0x009b
        L_0x0123:
            r13 = r11
            r7 = r17
            r11 = r19
            r18 = -1
            r12 = r32
            r17 = r0
            if (r8 != 0) goto L_0x0141
            int r0 = com.google.protobuf.C34382j.m139398I(r12, r3, r9)
            int r1 = r9.f83292a
            int r1 = com.google.protobuf.C34448s.m140146b(r1)
            r4 = r31
            r10.putInt(r4, r13, r1)
            goto L_0x030b
        L_0x0141:
            r4 = r31
            goto L_0x01cf
        L_0x0145:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r12 = r32
            if (r8 != 0) goto L_0x01cf
            int r0 = com.google.protobuf.C34382j.m139398I(r12, r3, r9)
            int r1 = r9.f83292a
            com.google.protobuf.v0$e r2 = r15.mo101461t(r7)
            if (r2 == 0) goto L_0x0178
            boolean r2 = r2.mo93189a(r1)
            if (r2 == 0) goto L_0x0166
            goto L_0x0178
        L_0x0166:
            com.google.protobuf.y2 r2 = m140020w(r31)
            long r13 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r2.mo101718q(r11, r1)
            r13 = r34
            r14 = r4
            r5 = r6
            goto L_0x0310
        L_0x0178:
            r10.putInt(r4, r13, r1)
            goto L_0x030b
        L_0x017d:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 2
            r12 = r32
            if (r8 != r0) goto L_0x01cf
            int r0 = com.google.protobuf.C34382j.m139405b(r12, r3, r9)
            java.lang.Object r1 = r9.f83294c
            r10.putObject(r4, r13, r1)
            goto L_0x030b
        L_0x0197:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 2
            r12 = r32
            if (r8 != r0) goto L_0x01cd
            com.google.protobuf.g2 r0 = r15.mo101464v(r7)
            r5 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.protobuf.C34382j.m139419p(r0, r12, r3, r5, r9)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x01be
            java.lang.Object r1 = r9.f83294c
            r10.putObject(r4, r13, r1)
            goto L_0x0246
        L_0x01be:
            java.lang.Object r1 = r10.getObject(r4, r13)
            java.lang.Object r2 = r9.f83294c
            java.lang.Object r1 = com.google.protobuf.C34471v0.m140591v(r1, r2)
            r10.putObject(r4, r13, r1)
            goto L_0x0246
        L_0x01cd:
            r5 = r34
        L_0x01cf:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0316
        L_0x01d4:
            r5 = r34
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r0 = 2
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r8 != r0) goto L_0x0316
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01f5
            int r0 = com.google.protobuf.C34382j.m139392C(r12, r3, r9)
            goto L_0x01f9
        L_0x01f5:
            int r0 = com.google.protobuf.C34382j.m139395F(r12, r3, r9)
        L_0x01f9:
            java.lang.Object r1 = r9.f83294c
            r10.putObject(r4, r13, r1)
            goto L_0x0246
        L_0x01ff:
            r5 = r34
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r8 != 0) goto L_0x0316
            int r0 = com.google.protobuf.C34382j.m139401L(r12, r3, r9)
            long r1 = r9.f83293b
            r25 = 0
            int r1 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r1 == 0) goto L_0x0222
            r1 = 1
            goto L_0x0224
        L_0x0222:
            r1 = r16
        L_0x0224:
            com.google.protobuf.C34341c3.m138978a0(r4, r13, r1)
            goto L_0x0246
        L_0x0228:
            r5 = r34
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r8 != r1) goto L_0x0316
            int r0 = com.google.protobuf.C34382j.m139411h(r12, r3)
            r10.putInt(r4, r13, r0)
            int r0 = r3 + 4
        L_0x0246:
            r1 = r6 | r21
            r14 = r4
            r13 = r5
            r2 = r7
            r3 = r11
            r6 = r24
            r11 = r35
            r5 = r1
            r1 = r17
            goto L_0x001a
        L_0x0255:
            r5 = r34
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r0 = 1
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r8 != r0) goto L_0x0316
            long r22 = com.google.protobuf.C34382j.m139413j(r12, r3)
            r0 = r10
            r1 = r31
            r8 = r3
            r2 = r13
            r13 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            r5 = r6 | r21
            r2 = r7
            goto L_0x02c7
        L_0x0280:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r8 != 0) goto L_0x0316
            int r0 = com.google.protobuf.C34382j.m139398I(r12, r3, r9)
            int r1 = r9.f83292a
            r10.putInt(r4, r13, r1)
            goto L_0x030b
        L_0x029e:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r8 != 0) goto L_0x0316
            int r8 = com.google.protobuf.C34382j.m139401L(r12, r3, r9)
            long r2 = r9.f83293b
            r0 = r10
            r1 = r31
            r22 = r2
            r2 = r13
            r13 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            r5 = r6 | r21
            r2 = r7
            r0 = r8
        L_0x02c7:
            r3 = r11
            r14 = r13
            r1 = r17
            r6 = r24
            r13 = r34
            goto L_0x0378
        L_0x02d1:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r8 != r1) goto L_0x0316
            float r0 = com.google.protobuf.C34382j.m139415l(r12, r3)
            com.google.protobuf.C34341c3.m139000l0(r4, r13, r0)
            int r0 = r3 + 4
            goto L_0x030b
        L_0x02ee:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r0 = 1
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r8 != r0) goto L_0x0316
            double r0 = com.google.protobuf.C34382j.m139407d(r12, r3)
            com.google.protobuf.C34341c3.m138996j0(r4, r13, r0)
            int r0 = r3 + 8
        L_0x030b:
            r5 = r6 | r21
            r13 = r34
            r14 = r4
        L_0x0310:
            r2 = r7
        L_0x0311:
            r3 = r11
            r1 = r17
            goto L_0x0376
        L_0x0316:
            r8 = r35
            r2 = r3
            r23 = r6
            r21 = r7
            r27 = r10
            r9 = r11
            goto L_0x0422
        L_0x0322:
            r17 = r0
            r4 = r14
            r18 = -1
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r32
            r0 = 27
            if (r7 != r0) goto L_0x0389
            r0 = 2
            if (r8 != r0) goto L_0x037c
            java.lang.Object r0 = r10.getObject(r4, r13)
            com.google.protobuf.v0$k r0 = (com.google.protobuf.C34471v0.C34488k) r0
            boolean r1 = r0.mo100971T()
            if (r1 != 0) goto L_0x0354
            int r1 = r0.size()
            if (r1 != 0) goto L_0x034b
            r1 = 10
            goto L_0x034d
        L_0x034b:
            int r1 = r1 * 2
        L_0x034d:
            com.google.protobuf.v0$k r0 = r0.mo100962c(r1)
            r10.putObject(r4, r13, r0)
        L_0x0354:
            r7 = r0
            com.google.protobuf.g2 r0 = r15.mo101464v(r2)
            r1 = r11
            r21 = r2
            r2 = r32
            r4 = r34
            r23 = r5
            r5 = r7
            r24 = r6
            r6 = r36
            int r0 = com.google.protobuf.C34382j.m139420q(r0, r1, r2, r3, r4, r5, r6)
            r14 = r31
            r13 = r34
            r3 = r11
            r1 = r17
            r2 = r21
            r5 = r23
        L_0x0376:
            r6 = r24
        L_0x0378:
            r11 = r35
            goto L_0x001a
        L_0x037c:
            r21 = r2
            r23 = r5
            r24 = r6
            r15 = r3
            r27 = r10
            r19 = r11
            goto L_0x03fc
        L_0x0389:
            r21 = r2
            r23 = r5
            r24 = r6
            r0 = 49
            if (r7 > r0) goto L_0x03d5
            r1 = r20
            long r5 = (long) r1
            r0 = r30
            r1 = r31
            r2 = r32
            r4 = r3
            r15 = r4
            r4 = r34
            r25 = r5
            r5 = r11
            r6 = r17
            r33 = r7
            r7 = r8
            r8 = r21
            r27 = r10
            r9 = r25
            r19 = r11
            r11 = r33
            r12 = r13
            r14 = r36
            int r0 = r0.mo101444g0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x041e
        L_0x03bb:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            r1 = r17
            r3 = r19
            r2 = r21
            r5 = r23
            r6 = r24
            r10 = r27
            goto L_0x001a
        L_0x03d5:
            r15 = r3
            r33 = r7
            r27 = r10
            r19 = r11
            r1 = r20
            r0 = 50
            r9 = r33
            if (r9 != r0) goto L_0x0402
            r0 = 2
            if (r8 != r0) goto L_0x03fc
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r21
            r6 = r13
            r8 = r36
            int r0 = r0.mo101440c0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x041e
            goto L_0x03bb
        L_0x03fc:
            r8 = r35
            r2 = r15
        L_0x03ff:
            r9 = r19
            goto L_0x0422
        L_0x0402:
            r0 = r30
            r10 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r17
            r7 = r8
            r8 = r10
            r10 = r13
            r12 = r21
            r13 = r36
            int r0 = r0.mo101441d0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x041e
            goto L_0x03bb
        L_0x041e:
            r8 = r35
            r2 = r0
            goto L_0x03ff
        L_0x0422:
            if (r9 != r8) goto L_0x0432
            if (r8 == 0) goto L_0x0432
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r30
            r0 = r2
            r3 = r9
            r5 = r23
            r6 = r24
            goto L_0x0484
        L_0x0432:
            r10 = r30
            boolean r0 = r10.f83418f
            r11 = r36
            if (r0 == 0) goto L_0x0454
            com.google.protobuf.g0 r0 = r11.f83295d
            com.google.protobuf.g0 r1 = com.google.protobuf.C34368g0.m139242d()
            if (r0 == r1) goto L_0x0454
            com.google.protobuf.l1 r5 = r10.f83417e
            com.google.protobuf.x2<?, ?> r6 = r10.f83427o
            r0 = r9
            r1 = r32
            r3 = r34
            r4 = r31
            r7 = r36
            int r0 = com.google.protobuf.C34382j.m139410g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0463
        L_0x0454:
            com.google.protobuf.y2 r4 = m140020w(r31)
            r0 = r9
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.protobuf.C34382j.m139396G(r0, r1, r2, r3, r4, r5)
        L_0x0463:
            r14 = r31
            r12 = r32
            r13 = r34
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r17
            r2 = r21
            r5 = r23
            r6 = r24
            r10 = r27
            r11 = r8
            goto L_0x001a
        L_0x0479:
            r23 = r5
            r24 = r6
            r27 = r10
            r8 = r11
            r10 = r15
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0484:
            if (r6 == r1) goto L_0x048f
            long r1 = (long) r6
            r4 = r31
            r6 = r27
            r6.putInt(r4, r1, r5)
            goto L_0x0491
        L_0x048f:
            r4 = r31
        L_0x0491:
            int r1 = r10.f83423k
            r2 = 0
        L_0x0494:
            int r5 = r10.f83424l
            if (r1 >= r5) goto L_0x04a7
            int[] r5 = r10.f83422j
            r5 = r5[r1]
            com.google.protobuf.x2<?, ?> r6 = r10.f83427o
            java.lang.Object r2 = r10.mo101457q(r4, r5, r2, r6)
            com.google.protobuf.y2 r2 = (com.google.protobuf.C34505y2) r2
            int r1 = r1 + 1
            goto L_0x0494
        L_0x04a7:
            if (r2 == 0) goto L_0x04ae
            com.google.protobuf.x2<?, ?> r1 = r10.f83427o
            r1.mo101689o(r4, r2)
        L_0x04ae:
            if (r8 != 0) goto L_0x04ba
            r1 = r34
            if (r0 != r1) goto L_0x04b5
            goto L_0x04c0
        L_0x04b5:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m138419i()
            throw r0
        L_0x04ba:
            r1 = r34
            if (r0 > r1) goto L_0x04c1
            if (r3 != r8) goto L_0x04c1
        L_0x04c0:
            return r0
        L_0x04c1:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m138419i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101442e0(java.lang.Object, byte[], int, int, int, com.google.protobuf.j$b):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo101119f(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f83413a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.mo101463u0(r1)
            int r4 = r8.mo101439V(r1)
            long r5 = m140008W(r3)
            int r3 = m140019t0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.C34341c3.m138967Q(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m140013b0(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m140012a0(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m140013b0(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m140012a0(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m140012a0(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m140012a0(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C34341c3.m138967Q(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.C34341c3.m138967Q(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C34341c3.m138967Q(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = m140009X(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140580k(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m140012a0(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m140013b0(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m140012a0(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m140013b0(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m140013b0(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = m140011Z(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.mo101433J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = m140010Y(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C34341c3.m138967Q(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C34341c3.m138967Q(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = com.google.protobuf.C34341c3.m138967Q(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C34341c3.m138964N(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C34341c3.m138961K(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C34341c3.m138964N(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C34341c3.m138961K(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C34341c3.m138961K(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C34341c3.m138961K(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C34341c3.m138967Q(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = com.google.protobuf.C34341c3.m138967Q(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C34341c3.m138967Q(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.C34341c3.m139021w(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140580k(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C34341c3.m138961K(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C34341c3.m138964N(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C34341c3.m138961K(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C34341c3.m138964N(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C34341c3.m138964N(r9, r5)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.C34341c3.m138958H(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.C34341c3.m138956F(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C34471v0.m140588s(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.protobuf.x2<?, ?> r0 = r8.f83427o
            java.lang.Object r0 = r0.mo101681g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f83418f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            com.google.protobuf.h0<?> r0 = r8.f83428p
            com.google.protobuf.o0 r9 = r0.mo101126c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101119f(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02df, code lost:
        if (r0 != r15) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0302, code lost:
        if (r0 != r15) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0305, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        r18 = r32;
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
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e0, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f8, code lost:
        r6 = r32 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fa, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fb, code lost:
        r1 = r18;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0200, code lost:
        r6 = r32;
        r2 = r4;
        r19 = r8;
        r28 = r9;
        r27 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x029a, code lost:
        if (r0 != r15) goto L_0x029c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo101443f0(T r30, byte[] r31, int r32, int r33, com.google.protobuf.C34382j.C34384b r34) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = f83403A
            r16 = 0
            r8 = -1
            r0 = r32
            r1 = r8
            r2 = r16
            r6 = r2
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0018:
            if (r0 >= r13) goto L_0x032b
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.protobuf.C34382j.m139397H(r0, r12, r3, r11)
            int r3 = r11.f83292a
            r4 = r0
            r17 = r3
            goto L_0x002d
        L_0x002a:
            r17 = r0
            r4 = r3
        L_0x002d:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003a
            int r2 = r2 / 3
            int r0 = r15.mo101446i0(r5, r2)
            goto L_0x003e
        L_0x003a:
            int r0 = r15.mo101445h0(r5)
        L_0x003e:
            r2 = r0
            if (r2 != r8) goto L_0x004c
            r2 = r4
            r18 = r5
            r27 = r8
            r28 = r9
            r19 = r16
            goto L_0x0307
        L_0x004c:
            int[] r0 = r15.f83413a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m140019t0(r1)
            long r10 = m140008W(r1)
            r8 = 17
            r32 = r5
            if (r0 > r8) goto L_0x020b
            int[] r8 = r15.f83413a
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
                case 0: goto L_0x01e3;
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
            r18 = r32
            r11 = r34
            r8 = r2
        L_0x008d:
            r32 = r6
            goto L_0x0200
        L_0x0091:
            if (r3 != 0) goto L_0x0088
            r11 = r34
            r0 = r22
            int r8 = com.google.protobuf.C34382j.m139401L(r12, r4, r11)
            long r3 = r11.f83293b
            long r4 = com.google.protobuf.C34448s.m140147c(r3)
            r0 = r9
            r1 = r30
            r17 = r8
            r8 = r2
            r2 = r22
            r18 = r32
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            goto L_0x01c9
        L_0x00b2:
            r18 = r32
            r11 = r34
            r8 = r2
            if (r3 != 0) goto L_0x008d
            int r0 = com.google.protobuf.C34382j.m139398I(r12, r4, r11)
            int r1 = r11.f83292a
            int r1 = com.google.protobuf.C34448s.m140146b(r1)
            r2 = r22
            r9.putInt(r14, r2, r1)
            r6 = r6 | r20
            goto L_0x01fa
        L_0x00cc:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            if (r3 != 0) goto L_0x008d
            int r2 = com.google.protobuf.C34382j.m139398I(r12, r4, r11)
            int r3 = r11.f83292a
            r9.putInt(r14, r0, r3)
            goto L_0x00f2
        L_0x00df:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008d
            int r2 = com.google.protobuf.C34382j.m139405b(r12, r4, r11)
            java.lang.Object r3 = r11.f83294c
            r9.putObject(r14, r0, r3)
        L_0x00f2:
            r6 = r6 | r20
            r0 = r2
            goto L_0x01fa
        L_0x00f7:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008d
            com.google.protobuf.g2 r2 = r15.mo101464v(r8)
            int r2 = com.google.protobuf.C34382j.m139419p(r2, r12, r4, r13, r11)
            java.lang.Object r3 = r9.getObject(r14, r0)
            if (r3 != 0) goto L_0x0115
            java.lang.Object r3 = r11.f83294c
            r9.putObject(r14, r0, r3)
            goto L_0x00f2
        L_0x0115:
            java.lang.Object r4 = r11.f83294c
            java.lang.Object r3 = com.google.protobuf.C34471v0.m140591v(r3, r4)
            r9.putObject(r14, r0, r3)
            goto L_0x00f2
        L_0x011f:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 2
            if (r3 != r0) goto L_0x0200
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0135
            int r0 = com.google.protobuf.C34382j.m139392C(r12, r4, r11)
            goto L_0x0139
        L_0x0135:
            int r0 = com.google.protobuf.C34382j.m139395F(r12, r4, r11)
        L_0x0139:
            java.lang.Object r1 = r11.f83294c
            r9.putObject(r14, r5, r1)
            goto L_0x01f8
        L_0x0140:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0200
            int r1 = com.google.protobuf.C34382j.m139401L(r12, r4, r11)
            long r2 = r11.f83293b
            r21 = 0
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            r0 = r16
        L_0x015b:
            com.google.protobuf.C34341c3.m138978a0(r14, r5, r0)
            r6 = r32 | r20
            r0 = r1
            goto L_0x01fa
        L_0x0163:
            r18 = r32
            r11 = r34
            r32 = r6
            r0 = r8
            r5 = r22
            r8 = r2
            if (r3 != r0) goto L_0x0200
            int r0 = com.google.protobuf.C34382j.m139411h(r12, r4)
            r9.putInt(r14, r5, r0)
            goto L_0x01e0
        L_0x0178:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != r0) goto L_0x0200
            long r21 = com.google.protobuf.C34382j.m139413j(r12, r4)
            r0 = r9
            r1 = r30
            r2 = r5
            r6 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r6 + 8
            goto L_0x01f8
        L_0x0196:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0200
            int r0 = com.google.protobuf.C34382j.m139398I(r12, r4, r11)
            int r1 = r11.f83292a
            r9.putInt(r14, r5, r1)
            goto L_0x01f8
        L_0x01ab:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0200
            int r17 = com.google.protobuf.C34382j.m139401L(r12, r4, r11)
            long r2 = r11.f83293b
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
            goto L_0x01fb
        L_0x01cd:
            r18 = r32
            r11 = r34
            r32 = r6
            r0 = r8
            r5 = r22
            r8 = r2
            if (r3 != r0) goto L_0x0200
            float r0 = com.google.protobuf.C34382j.m139415l(r12, r4)
            com.google.protobuf.C34341c3.m139000l0(r14, r5, r0)
        L_0x01e0:
            int r0 = r4 + 4
            goto L_0x01f8
        L_0x01e3:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != r0) goto L_0x0200
            double r0 = com.google.protobuf.C34382j.m139407d(r12, r4)
            com.google.protobuf.C34341c3.m138996j0(r14, r5, r0)
            int r0 = r4 + 8
        L_0x01f8:
            r6 = r32 | r20
        L_0x01fa:
            r2 = r8
        L_0x01fb:
            r1 = r18
            r8 = -1
            goto L_0x0018
        L_0x0200:
            r6 = r32
            r2 = r4
            r19 = r8
            r28 = r9
            r27 = -1
            goto L_0x0307
        L_0x020b:
            r18 = r32
            r8 = r2
            r20 = r6
            r5 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r34
            r2 = 27
            if (r0 != r2) goto L_0x0265
            r2 = 2
            if (r3 != r2) goto L_0x0258
            java.lang.Object r0 = r9.getObject(r14, r5)
            com.google.protobuf.v0$k r0 = (com.google.protobuf.C34471v0.C34488k) r0
            boolean r1 = r0.mo100971T()
            if (r1 != 0) goto L_0x023b
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0232
            r1 = 10
            goto L_0x0234
        L_0x0232:
            int r1 = r1 * 2
        L_0x0234:
            com.google.protobuf.v0$k r0 = r0.mo100962c(r1)
            r9.putObject(r14, r5, r0)
        L_0x023b:
            r5 = r0
            com.google.protobuf.g2 r0 = r15.mo101464v(r8)
            r1 = r17
            r2 = r31
            r3 = r4
            r4 = r33
            r15 = r20
            r6 = r34
            int r0 = com.google.protobuf.C34382j.m139420q(r0, r1, r2, r3, r4, r5, r6)
            r2 = r8
            r6 = r15
            r1 = r18
            r8 = -1
            r15 = r29
            goto L_0x0018
        L_0x0258:
            r15 = r4
            r26 = r7
            r19 = r8
            r28 = r9
            r23 = r20
            r27 = -1
            goto L_0x02e2
        L_0x0265:
            r15 = r20
            r2 = 49
            if (r0 > r2) goto L_0x02b0
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
            r6 = r18
            r26 = r7
            r7 = r22
            r19 = r8
            r27 = -1
            r28 = r9
            r9 = r20
            r11 = r32
            r12 = r24
            r14 = r34
            int r0 = r0.mo101444g0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0305
        L_0x029c:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r18
            r2 = r19
            r6 = r23
            r7 = r26
            goto L_0x0325
        L_0x02b0:
            r32 = r0
            r22 = r3
            r24 = r5
            r26 = r7
            r19 = r8
            r28 = r9
            r23 = r15
            r27 = -1
            r15 = r4
            r0 = 50
            r9 = r32
            if (r9 != r0) goto L_0x02e8
            r7 = r22
            r0 = 2
            if (r7 != r0) goto L_0x02e2
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r19
            r6 = r24
            r8 = r34
            int r0 = r0.mo101440c0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0305
            goto L_0x029c
        L_0x02e2:
            r2 = r15
        L_0x02e3:
            r6 = r23
            r7 = r26
            goto L_0x0307
        L_0x02e8:
            r7 = r22
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r17
            r6 = r18
            r10 = r24
            r12 = r19
            r13 = r34
            int r0 = r0.mo101441d0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0305
            goto L_0x029c
        L_0x0305:
            r2 = r0
            goto L_0x02e3
        L_0x0307:
            com.google.protobuf.y2 r4 = m140020w(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.protobuf.C34382j.m139396G(r0, r1, r2, r3, r4, r5)
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r18
            r2 = r19
        L_0x0325:
            r8 = r27
            r9 = r28
            goto L_0x0018
        L_0x032b:
            r23 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x033e
            long r1 = (long) r7
            r3 = r30
            r6 = r23
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x033e:
            r1 = r33
            if (r0 != r1) goto L_0x0343
            return r0
        L_0x0343:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m138419i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101443f0(java.lang.Object, byte[], int, int, com.google.protobuf.j$b):int");
    }

    /* renamed from: g */
    public boolean mo101120g(T t, T t2) {
        int length = this.f83413a.length;
        for (int i = 0; i < length; i += 3) {
            if (!mo101455p(t, t2, i)) {
                return false;
            }
        }
        if (!this.f83427o.mo101681g(t).equals(this.f83427o.mo101681g(t2))) {
            return false;
        }
        if (this.f83418f) {
            return this.f83428p.mo101126c(t).equals(this.f83428p.mo101126c(t2));
        }
        return true;
    }

    /* renamed from: g0 */
    public final int mo101444g0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C34382j.C34384b bVar) throws IOException {
        int i8;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i5;
        int i11 = i6;
        long j3 = j2;
        C34382j.C34384b bVar2 = bVar;
        Unsafe unsafe = f83403A;
        C34471v0.C34488k kVar = (C34471v0.C34488k) unsafe.getObject(t, j3);
        if (!kVar.mo100971T()) {
            int size = kVar.size();
            kVar = kVar.mo100962c(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j3, kVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return C34382j.m139422s(bArr, i9, kVar, bVar2);
                }
                if (i10 == 1) {
                    return C34382j.m139408e(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return C34382j.m139425v(bArr, i9, kVar, bVar2);
                }
                if (i10 == 5) {
                    return C34382j.m139416m(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return C34382j.m139429z(bArr, i9, kVar, bVar2);
                }
                if (i10 == 0) {
                    return C34382j.m139402M(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return C34382j.m139428y(bArr, i9, kVar, bVar2);
                }
                if (i10 == 0) {
                    return C34382j.m139399J(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return C34382j.m139424u(bArr, i9, kVar, bVar2);
                }
                if (i10 == 1) {
                    return C34382j.m139414k(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return C34382j.m139423t(bArr, i9, kVar, bVar2);
                }
                if (i10 == 5) {
                    return C34382j.m139412i(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return C34382j.m139421r(bArr, i9, kVar, bVar2);
                }
                if (i10 == 0) {
                    return C34382j.m139404a(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 26:
                if (i10 == 2) {
                    if ((j & 536870912) == 0) {
                        return C34382j.m139393D(i3, bArr, i, i2, kVar, bVar);
                    }
                    return C34382j.m139394E(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return C34382j.m139420q(mo101464v(i11), i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return C34382j.m139406c(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    i8 = C34382j.m139428y(bArr, i9, kVar, bVar2);
                } else if (i10 == 0) {
                    i8 = C34382j.m139399J(i3, bArr, i, i2, kVar, bVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
                C34505y2 y2Var = generatedMessageLite.unknownFields;
                if (y2Var == C34505y2.m140700c()) {
                    y2Var = null;
                }
                C34505y2 y2Var2 = (C34505y2) C34381i2.m139310C(i4, kVar, mo101461t(i11), y2Var, this.f83427o);
                if (y2Var2 != null) {
                    generatedMessageLite.unknownFields = y2Var2;
                }
                return i8;
            case 33:
            case 47:
                if (i10 == 2) {
                    return C34382j.m139426w(bArr, i9, kVar, bVar2);
                }
                if (i10 == 0) {
                    return C34382j.m139390A(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return C34382j.m139427x(bArr, i9, kVar, bVar2);
                }
                if (i10 == 0) {
                    return C34382j.m139391B(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return C34382j.m139418o(mo101464v(i11), i3, bArr, i, i2, kVar, bVar);
                }
                break;
        }
        return i9;
    }

    /* renamed from: h */
    public void mo101121h(T t, Writer writer) throws IOException {
        if (writer.mo100826u() == Writer.FieldOrder.DESCENDING) {
            mo101468x0(t, writer);
        } else if (this.f83420h) {
            mo101466w0(t, writer);
        } else {
            mo101465v0(t, writer);
        }
    }

    /* renamed from: h0 */
    public final int mo101445h0(int i) {
        if (i < this.f83415c || i > this.f83416d) {
            return -1;
        }
        return mo101460r0(i, 0);
    }

    /* renamed from: i */
    public void mo101122i(T t, C34366f2 f2Var, C34368g0 g0Var) throws IOException {
        g0Var.getClass();
        mo101434N(this.f83427o, this.f83428p, t, f2Var, g0Var);
    }

    /* renamed from: i0 */
    public final int mo101446i0(int i, int i2) {
        if (i < this.f83415c || i > this.f83416d) {
            return -1;
        }
        return mo101460r0(i, i2);
    }

    /* renamed from: j */
    public void mo101123j(T t, byte[] bArr, int i, int i2, C34382j.C34384b bVar) throws IOException {
        if (this.f83420h) {
            mo101443f0(t, bArr, i, i2, bVar);
        } else {
            mo101442e0(t, bArr, i, i2, 0, bVar);
        }
    }

    /* renamed from: j0 */
    public final int mo101447j0(int i) {
        return this.f83413a[i + 2];
    }

    /* renamed from: k */
    public final boolean mo101448k(T t, T t2, int i) {
        return mo101428D(t, i) == mo101428D(t2, i);
    }

    /* renamed from: k0 */
    public final <E> void mo101449k0(Object obj, long j, C34366f2 f2Var, C34372g2<E> g2Var, C34368g0 g0Var) throws IOException {
        f2Var.mo101063K(this.f83426n.mo100959e(obj, j), g2Var, g0Var);
    }

    /* renamed from: l0 */
    public final <E> void mo101450l0(Object obj, int i, C34366f2 f2Var, C34372g2<E> g2Var, C34368g0 g0Var) throws IOException {
        f2Var.mo101064L(this.f83426n.mo100959e(obj, m140008W(i)), g2Var, g0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> int mo101451m(byte[] r15, int r16, int r17, com.google.protobuf.C34363f1.C34365b<K, V> r18, java.util.Map<K, V> r19, com.google.protobuf.C34382j.C34384b r20) throws java.io.IOException {
        /*
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = com.google.protobuf.C34382j.m139398I(r15, r0, r10)
            int r1 = r10.f83292a
            if (r1 < 0) goto L_0x0081
            int r2 = r8 - r0
            if (r1 > r2) goto L_0x0081
            int r11 = r0 + r1
            K r1 = r9.f83269b
            V r2 = r9.f83271d
            r12 = r1
            r13 = r2
        L_0x001d:
            if (r0 >= r11) goto L_0x0074
            int r1 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.protobuf.C34382j.m139397H(r0, r15, r1, r10)
            int r1 = r10.f83292a
            r2 = r0
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0057
            r4 = 2
            if (r1 == r4) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            com.google.protobuf.WireFormat$FieldType r1 = r9.f83270c
            int r1 = r1.mo100783q()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.WireFormat$FieldType r4 = r9.f83270c
            V r0 = r9.f83271d
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.mo101453n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.f83294c
            goto L_0x001d
        L_0x0057:
            com.google.protobuf.WireFormat$FieldType r1 = r9.f83268a
            int r1 = r1.mo100783q()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.WireFormat$FieldType r4 = r9.f83268a
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.mo101453n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.f83294c
            goto L_0x001d
        L_0x006f:
            int r0 = com.google.protobuf.C34382j.m139403N(r0, r15, r2, r8, r10)
            goto L_0x001d
        L_0x0074:
            if (r0 != r11) goto L_0x007c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L_0x007c:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m138419i()
            throw r0
        L_0x0081:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m138422n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101451m(byte[], int, int, com.google.protobuf.f1$b, java.util.Map, com.google.protobuf.j$b):int");
    }

    /* renamed from: m0 */
    public final void mo101452m0(Object obj, int i, C34366f2 f2Var) throws IOException {
        if (m140000C(i)) {
            C34341c3.m139016t0(obj, m140008W(i), f2Var.mo101062J());
        } else if (this.f83419g) {
            C34341c3.m139016t0(obj, m140008W(i), f2Var.mo101098y());
        } else {
            C34341c3.m139016t0(obj, m140008W(i), f2Var.mo101085n());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r3 + 8;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo101453n(byte[] r2, int r3, int r4, com.google.protobuf.WireFormat.FieldType r5, java.lang.Class<?> r6, com.google.protobuf.C34382j.C34384b r7) throws java.io.IOException {
        /*
            r1 = this;
            int[] r0 = com.google.protobuf.C34429o1.C34430a.f83430a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L_0x0013:
            int r2 = com.google.protobuf.C34382j.m139395F(r2, r3, r7)
            goto L_0x00ae
        L_0x0019:
            int r2 = com.google.protobuf.C34382j.m139401L(r2, r3, r7)
            long r3 = r7.f83293b
            long r3 = com.google.protobuf.C34448s.m140147c(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f83294c = r3
            goto L_0x00ae
        L_0x002b:
            int r2 = com.google.protobuf.C34382j.m139398I(r2, r3, r7)
            int r3 = r7.f83292a
            int r3 = com.google.protobuf.C34448s.m140146b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f83294c = r3
            goto L_0x00ae
        L_0x003d:
            com.google.protobuf.a2 r5 = com.google.protobuf.C34325a2.m138828a()
            com.google.protobuf.g2 r5 = r5.mo100881i(r6)
            int r2 = com.google.protobuf.C34382j.m139419p(r5, r2, r3, r4, r7)
            goto L_0x00ae
        L_0x004a:
            int r2 = com.google.protobuf.C34382j.m139401L(r2, r3, r7)
            long r3 = r7.f83293b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f83294c = r3
            goto L_0x00ae
        L_0x0057:
            int r2 = com.google.protobuf.C34382j.m139398I(r2, r3, r7)
            int r3 = r7.f83292a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f83294c = r3
            goto L_0x00ae
        L_0x0064:
            float r2 = com.google.protobuf.C34382j.m139415l(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.f83294c = r2
            goto L_0x0084
        L_0x006f:
            long r4 = com.google.protobuf.C34382j.m139413j(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.f83294c = r2
            goto L_0x0091
        L_0x007a:
            int r2 = com.google.protobuf.C34382j.m139411h(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.f83294c = r2
        L_0x0084:
            int r2 = r3 + 4
            goto L_0x00ae
        L_0x0087:
            double r4 = com.google.protobuf.C34382j.m139407d(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.f83294c = r2
        L_0x0091:
            int r2 = r3 + 8
            goto L_0x00ae
        L_0x0094:
            int r2 = com.google.protobuf.C34382j.m139405b(r2, r3, r7)
            goto L_0x00ae
        L_0x0099:
            int r2 = com.google.protobuf.C34382j.m139401L(r2, r3, r7)
            long r3 = r7.f83293b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00a7
            r3 = 1
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.f83294c = r3
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101453n(byte[], int, int, com.google.protobuf.WireFormat$FieldType, java.lang.Class, com.google.protobuf.j$b):int");
    }

    /* renamed from: n0 */
    public final void mo101454n0(Object obj, int i, C34366f2 f2Var) throws IOException {
        if (m140000C(i)) {
            f2Var.mo101084m(this.f83426n.mo100959e(obj, m140008W(i)));
        } else {
            f2Var.mo101053A(this.f83426n.mo100959e(obj, m140008W(i)));
        }
    }

    /* renamed from: p */
    public final boolean mo101455p(T t, T t2, int i) {
        int u0 = mo101463u0(i);
        long W = m140008W(u0);
        switch (m140019t0(u0)) {
            case 0:
                if (!mo101448k(t, t2, i) || Double.doubleToLongBits(C34341c3.m138956F(t, W)) != Double.doubleToLongBits(C34341c3.m138956F(t2, W))) {
                    return false;
                }
                return true;
            case 1:
                if (!mo101448k(t, t2, i) || Float.floatToIntBits(C34341c3.m138958H(t, W)) != Float.floatToIntBits(C34341c3.m138958H(t2, W))) {
                    return false;
                }
                return true;
            case 2:
                if (!mo101448k(t, t2, i) || C34341c3.m138964N(t, W) != C34341c3.m138964N(t2, W)) {
                    return false;
                }
                return true;
            case 3:
                if (!mo101448k(t, t2, i) || C34341c3.m138964N(t, W) != C34341c3.m138964N(t2, W)) {
                    return false;
                }
                return true;
            case 4:
                if (!mo101448k(t, t2, i) || C34341c3.m138961K(t, W) != C34341c3.m138961K(t2, W)) {
                    return false;
                }
                return true;
            case 5:
                if (!mo101448k(t, t2, i) || C34341c3.m138964N(t, W) != C34341c3.m138964N(t2, W)) {
                    return false;
                }
                return true;
            case 6:
                if (!mo101448k(t, t2, i) || C34341c3.m138961K(t, W) != C34341c3.m138961K(t2, W)) {
                    return false;
                }
                return true;
            case 7:
                if (!mo101448k(t, t2, i) || C34341c3.m139021w(t, W) != C34341c3.m139021w(t2, W)) {
                    return false;
                }
                return true;
            case 8:
                if (!mo101448k(t, t2, i) || !C34381i2.m139325N(C34341c3.m138967Q(t, W), C34341c3.m138967Q(t2, W))) {
                    return false;
                }
                return true;
            case 9:
                if (!mo101448k(t, t2, i) || !C34381i2.m139325N(C34341c3.m138967Q(t, W), C34341c3.m138967Q(t2, W))) {
                    return false;
                }
                return true;
            case 10:
                if (!mo101448k(t, t2, i) || !C34381i2.m139325N(C34341c3.m138967Q(t, W), C34341c3.m138967Q(t2, W))) {
                    return false;
                }
                return true;
            case 11:
                if (!mo101448k(t, t2, i) || C34341c3.m138961K(t, W) != C34341c3.m138961K(t2, W)) {
                    return false;
                }
                return true;
            case 12:
                if (!mo101448k(t, t2, i) || C34341c3.m138961K(t, W) != C34341c3.m138961K(t2, W)) {
                    return false;
                }
                return true;
            case 13:
                if (!mo101448k(t, t2, i) || C34341c3.m138961K(t, W) != C34341c3.m138961K(t2, W)) {
                    return false;
                }
                return true;
            case 14:
                if (!mo101448k(t, t2, i) || C34341c3.m138964N(t, W) != C34341c3.m138964N(t2, W)) {
                    return false;
                }
                return true;
            case 15:
                if (!mo101448k(t, t2, i) || C34341c3.m138961K(t, W) != C34341c3.m138961K(t2, W)) {
                    return false;
                }
                return true;
            case 16:
                if (!mo101448k(t, t2, i) || C34341c3.m138964N(t, W) != C34341c3.m138964N(t2, W)) {
                    return false;
                }
                return true;
            case 17:
                if (!mo101448k(t, t2, i) || !C34381i2.m139325N(C34341c3.m138967Q(t, W), C34341c3.m138967Q(t2, W))) {
                    return false;
                }
                return true;
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
                return C34381i2.m139325N(C34341c3.m138967Q(t, W), C34341c3.m138967Q(t2, W));
            case 50:
                return C34381i2.m139325N(C34341c3.m138967Q(t, W), C34341c3.m138967Q(t2, W));
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
                if (!mo101432I(t, t2, i) || !C34381i2.m139325N(C34341c3.m138967Q(t, W), C34341c3.m138967Q(t2, W))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: p0 */
    public final void mo101456p0(T t, int i) {
        int j0 = mo101447j0(i);
        long j = (long) (1048575 & j0);
        if (j != 1048575) {
            C34341c3.m139006o0(t, j, (1 << (j0 >>> 20)) | C34341c3.m138961K(t, j));
        }
    }

    /* renamed from: q */
    public final <UT, UB> UB mo101457q(Object obj, int i, UB ub, C34501x2<UT, UB> x2Var) {
        C34471v0.C34476e t;
        int V = mo101439V(i);
        Object Q = C34341c3.m138967Q(obj, m140008W(mo101463u0(i)));
        if (Q == null || (t = mo101461t(i)) == null) {
            return ub;
        }
        return mo101459r(i, V, this.f83429q.mo101108c(Q), t, ub, x2Var);
    }

    /* renamed from: q0 */
    public final void mo101458q0(T t, int i, int i2) {
        C34341c3.m139006o0(t, (long) (mo101447j0(i2) & 1048575), i);
    }

    /* renamed from: r */
    public final <K, V, UT, UB> UB mo101459r(int i, int i2, Map<K, V> map, C34471v0.C34476e eVar, UB ub, C34501x2<UT, UB> x2Var) {
        C34363f1.C34365b<?, ?> b = this.f83429q.mo101107b(mo101462u(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.mo93189a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = x2Var.mo101688n();
                }
                ByteString.C34160g u0 = ByteString.m137263u0(C34363f1.m139184b(b, next.getKey(), next.getValue()));
                try {
                    C34363f1.m139188l(u0.mo99269b(), b, next.getKey(), next.getValue());
                    x2Var.mo101678d(ub, i2, u0.mo99268a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: r0 */
    public final int mo101460r0(int i, int i2) {
        int length = (this.f83413a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int V = mo101439V(i4);
            if (i == V) {
                return i4;
            }
            if (i < V) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: t */
    public final C34471v0.C34476e mo101461t(int i) {
        return (C34471v0.C34476e) this.f83414b[((i / 3) * 2) + 1];
    }

    /* renamed from: u */
    public final Object mo101462u(int i) {
        return this.f83414b[(i / 3) * 2];
    }

    /* renamed from: u0 */
    public final int mo101463u0(int i) {
        return this.f83413a[i + 1];
    }

    /* renamed from: v */
    public final C34372g2 mo101464v(int i) {
        int i2 = (i / 3) * 2;
        C34372g2 g2Var = (C34372g2) this.f83414b[i2];
        if (g2Var != null) {
            return g2Var;
        }
        C34372g2 i3 = C34325a2.m138828a().mo100881i((Class) this.f83414b[i2 + 1]);
        this.f83414b[i2] = i3;
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101465v0(T r18, com.google.protobuf.Writer r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f83418f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.h0<?> r3 = r0.f83428p
            com.google.protobuf.o0 r3 = r3.mo101126c(r1)
            boolean r5 = r3.mo101381C()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo101384H()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f83413a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f83403A
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x002e:
            if (r10 >= r6) goto L_0x048d
            int r13 = r0.mo101463u0(r10)
            int r14 = r0.mo101439V(r10)
            int r15 = m140019t0(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0056
            int[] r4 = r0.f83413a
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
            com.google.protobuf.h0<?> r9 = r0.f83428p
            int r9 = r9.mo101124a(r5)
            if (r9 > r14) goto L_0x0075
            com.google.protobuf.h0<?> r9 = r0.f83428p
            r9.mo101133j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0057
        L_0x0073:
            r5 = 0
            goto L_0x0057
        L_0x0075:
            long r8 = m140008W(r13)
            switch(r15) {
                case 0: goto L_0x047b;
                case 1: goto L_0x046f;
                case 2: goto L_0x0463;
                case 3: goto L_0x0457;
                case 4: goto L_0x044b;
                case 5: goto L_0x043f;
                case 6: goto L_0x0433;
                case 7: goto L_0x0427;
                case 8: goto L_0x041b;
                case 9: goto L_0x040a;
                case 10: goto L_0x03fb;
                case 11: goto L_0x03ee;
                case 12: goto L_0x03e1;
                case 13: goto L_0x03d4;
                case 14: goto L_0x03c7;
                case 15: goto L_0x03ba;
                case 16: goto L_0x03ad;
                case 17: goto L_0x039c;
                case 18: goto L_0x038c;
                case 19: goto L_0x037c;
                case 20: goto L_0x036c;
                case 21: goto L_0x035c;
                case 22: goto L_0x034c;
                case 23: goto L_0x033c;
                case 24: goto L_0x032c;
                case 25: goto L_0x031c;
                case 26: goto L_0x030d;
                case 27: goto L_0x02fa;
                case 28: goto L_0x02eb;
                case 29: goto L_0x02db;
                case 30: goto L_0x02cb;
                case 31: goto L_0x02bb;
                case 32: goto L_0x02ab;
                case 33: goto L_0x029b;
                case 34: goto L_0x028b;
                case 35: goto L_0x027b;
                case 36: goto L_0x026b;
                case 37: goto L_0x025b;
                case 38: goto L_0x024b;
                case 39: goto L_0x023b;
                case 40: goto L_0x022b;
                case 41: goto L_0x021b;
                case 42: goto L_0x020b;
                case 43: goto L_0x01fb;
                case 44: goto L_0x01eb;
                case 45: goto L_0x01db;
                case 46: goto L_0x01cb;
                case 47: goto L_0x01bb;
                case 48: goto L_0x01ab;
                case 49: goto L_0x0198;
                case 50: goto L_0x018f;
                case 51: goto L_0x0180;
                case 52: goto L_0x0171;
                case 53: goto L_0x0162;
                case 54: goto L_0x0153;
                case 55: goto L_0x0144;
                case 56: goto L_0x0135;
                case 57: goto L_0x0126;
                case 58: goto L_0x0117;
                case 59: goto L_0x0108;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d7;
                case 63: goto L_0x00c9;
                case 64: goto L_0x00bb;
                case 65: goto L_0x00ad;
                case 66: goto L_0x009f;
                case 67: goto L_0x0091;
                case 68: goto L_0x007f;
                default: goto L_0x007c;
            }
        L_0x007c:
            r13 = 0
            goto L_0x0486
        L_0x007f:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.g2 r8 = r0.mo101464v(r10)
            r2.mo100801O(r14, r4, r8)
            goto L_0x007c
        L_0x0091:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m140013b0(r1, r8)
            r2.mo100819n(r14, r8)
            goto L_0x007c
        L_0x009f:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m140012a0(r1, r8)
            r2.mo100798L(r14, r4)
            goto L_0x007c
        L_0x00ad:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m140013b0(r1, r8)
            r2.mo100815j(r14, r8)
            goto L_0x007c
        L_0x00bb:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m140012a0(r1, r8)
            r2.mo100831z(r14, r4)
            goto L_0x007c
        L_0x00c9:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m140012a0(r1, r8)
            r2.mo100795I(r14, r4)
            goto L_0x007c
        L_0x00d7:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m140012a0(r1, r8)
            r2.mo100821p(r14, r4)
            goto L_0x007c
        L_0x00e5:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r2.mo100802P(r14, r4)
            goto L_0x007c
        L_0x00f5:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.g2 r8 = r0.mo101464v(r10)
            r2.mo100804R(r14, r4, r8)
            goto L_0x007c
        L_0x0108:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo101472z0(r14, r4, r2)
            goto L_0x007c
        L_0x0117:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            boolean r4 = m140009X(r1, r8)
            r2.mo100830y(r14, r4)
            goto L_0x007c
        L_0x0126:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m140012a0(r1, r8)
            r2.mo100808c(r14, r4)
            goto L_0x007c
        L_0x0135:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m140013b0(r1, r8)
            r2.mo100825t(r14, r8)
            goto L_0x007c
        L_0x0144:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m140012a0(r1, r8)
            r2.mo100814i(r14, r4)
            goto L_0x007c
        L_0x0153:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m140013b0(r1, r8)
            r2.mo100812g(r14, r8)
            goto L_0x007c
        L_0x0162:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m140013b0(r1, r8)
            r2.mo100829x(r14, r8)
            goto L_0x007c
        L_0x0171:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            float r4 = m140011Z(r1, r8)
            r2.mo100792F(r14, r4)
            goto L_0x007c
        L_0x0180:
            boolean r4 = r0.mo101433J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            double r8 = m140010Y(r1, r8)
            r2.mo100822q(r14, r8)
            goto L_0x007c
        L_0x018f:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo101470y0(r2, r14, r4, r10)
            goto L_0x007c
        L_0x0198:
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.g2 r9 = r0.mo101464v(r10)
            com.google.protobuf.C34381i2.m139355i0(r4, r8, r2, r9)
            goto L_0x007c
        L_0x01ab:
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.protobuf.C34381i2.m139387y0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01bb:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139383w0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01cb:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139379u0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01db:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139375s0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01eb:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139339a0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01fb:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139313D0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x020b:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139332U(r4, r8, r2, r13)
            goto L_0x007c
        L_0x021b:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139343c0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x022b:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139347e0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x023b:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139359k0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x024b:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139317F0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x025b:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139363m0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x026b:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139351g0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x027b:
            r13 = 1
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139336Y(r4, r8, r2, r13)
            goto L_0x007c
        L_0x028b:
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.C34381i2.m139387y0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x029b:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139383w0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02ab:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139379u0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02bb:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139375s0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02cb:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139339a0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02db:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139313D0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02eb:
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139334W(r4, r8, r2)
            goto L_0x007c
        L_0x02fa:
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.g2 r9 = r0.mo101464v(r10)
            com.google.protobuf.C34381i2.m139371q0(r4, r8, r2, r9)
            goto L_0x007c
        L_0x030d:
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139309B0(r4, r8, r2)
            goto L_0x007c
        L_0x031c:
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.C34381i2.m139332U(r4, r8, r2, r13)
            goto L_0x0486
        L_0x032c:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139343c0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x033c:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139347e0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x034c:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139359k0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x035c:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139317F0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x036c:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139363m0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x037c:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139351g0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x038c:
            r13 = 0
            int r4 = r0.mo101439V(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C34381i2.m139336Y(r4, r8, r2, r13)
            goto L_0x0486
        L_0x039c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.g2 r8 = r0.mo101464v(r10)
            r2.mo100801O(r14, r4, r8)
            goto L_0x0486
        L_0x03ad:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo100819n(r14, r8)
            goto L_0x0486
        L_0x03ba:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo100798L(r14, r4)
            goto L_0x0486
        L_0x03c7:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo100815j(r14, r8)
            goto L_0x0486
        L_0x03d4:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo100831z(r14, r4)
            goto L_0x0486
        L_0x03e1:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo100795I(r14, r4)
            goto L_0x0486
        L_0x03ee:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo100821p(r14, r4)
            goto L_0x0486
        L_0x03fb:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r2.mo100802P(r14, r4)
            goto L_0x0486
        L_0x040a:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.g2 r8 = r0.mo101464v(r10)
            r2.mo100804R(r14, r4, r8)
            goto L_0x0486
        L_0x041b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo101472z0(r14, r4, r2)
            goto L_0x0486
        L_0x0427:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            boolean r4 = m140014l(r1, r8)
            r2.mo100830y(r14, r4)
            goto L_0x0486
        L_0x0433:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo100808c(r14, r4)
            goto L_0x0486
        L_0x043f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo100825t(r14, r8)
            goto L_0x0486
        L_0x044b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo100814i(r14, r4)
            goto L_0x0486
        L_0x0457:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo100812g(r14, r8)
            goto L_0x0486
        L_0x0463:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo100829x(r14, r8)
            goto L_0x0486
        L_0x046f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            float r4 = m140017s(r1, r8)
            r2.mo100792F(r14, r4)
            goto L_0x0486
        L_0x047b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            double r8 = m140015o(r1, r8)
            r2.mo100822q(r14, r8)
        L_0x0486:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002e
        L_0x048d:
            if (r5 == 0) goto L_0x04a4
            com.google.protobuf.h0<?> r4 = r0.f83428p
            r4.mo101133j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048d
        L_0x04a2:
            r5 = 0
            goto L_0x048d
        L_0x04a4:
            com.google.protobuf.x2<?, ?> r3 = r0.f83427o
            r0.mo101427A0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101465v0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101466w0(T r13, com.google.protobuf.Writer r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f83418f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.protobuf.h0<?> r0 = r12.f83428p
            com.google.protobuf.o0 r0 = r0.mo101126c(r13)
            boolean r2 = r0.mo101381C()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo101384H()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f83413a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.mo101463u0(r5)
            int r7 = r12.mo101439V(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.protobuf.h0<?> r8 = r12.f83428p
            int r8 = r8.mo101124a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.protobuf.h0<?> r8 = r12.f83428p
            r8.mo101133j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m140019t0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            com.google.protobuf.g2 r8 = r12.mo101464v(r5)
            r14.mo100801O(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            long r8 = m140013b0(r13, r8)
            r14.mo100819n(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m140012a0(r13, r8)
            r14.mo100798L(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            long r8 = m140013b0(r13, r8)
            r14.mo100815j(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m140012a0(r13, r8)
            r14.mo100831z(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m140012a0(r13, r8)
            r14.mo100795I(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m140012a0(r13, r8)
            r14.mo100821p(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            r14.mo100802P(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            com.google.protobuf.g2 r8 = r12.mo101464v(r5)
            r14.mo100804R(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            r12.mo101472z0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            boolean r6 = m140009X(r13, r8)
            r14.mo100830y(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m140012a0(r13, r8)
            r14.mo100808c(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            long r8 = m140013b0(r13, r8)
            r14.mo100825t(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m140012a0(r13, r8)
            r14.mo100814i(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            long r8 = m140013b0(r13, r8)
            r14.mo100812g(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            long r8 = m140013b0(r13, r8)
            r14.mo100829x(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            float r6 = m140011Z(r13, r8)
            r14.mo100792F(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.mo101433J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            double r8 = m140010Y(r13, r8)
            r14.mo100822q(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            r12.mo101470y0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.g2 r8 = r12.mo101464v(r5)
            com.google.protobuf.C34381i2.m139355i0(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139387y0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139383w0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139379u0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139375s0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139339a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139313D0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139332U(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139343c0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139347e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139359k0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139317F0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139363m0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139351g0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.mo101439V(r5)
            long r10 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139336Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139387y0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139383w0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139379u0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139375s0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139339a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139313D0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139334W(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.g2 r8 = r12.mo101464v(r5)
            com.google.protobuf.C34381i2.m139371q0(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139309B0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139332U(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139343c0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139347e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139359k0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139317F0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139363m0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139351g0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.mo101439V(r5)
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C34381i2.m139336Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            com.google.protobuf.g2 r8 = r12.mo101464v(r5)
            r14.mo100801O(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            long r8 = m140004M(r13, r8)
            r14.mo100819n(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m139999B(r13, r8)
            r14.mo100798L(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            long r8 = m140004M(r13, r8)
            r14.mo100815j(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m139999B(r13, r8)
            r14.mo100831z(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m139999B(r13, r8)
            r14.mo100795I(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m139999B(r13, r8)
            r14.mo100821p(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            r14.mo100802P(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            com.google.protobuf.g2 r8 = r12.mo101464v(r5)
            r14.mo100804R(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r13, r8)
            r12.mo101472z0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            boolean r6 = m140014l(r13, r8)
            r14.mo100830y(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m139999B(r13, r8)
            r14.mo100808c(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            long r8 = m140004M(r13, r8)
            r14.mo100825t(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            int r6 = m139999B(r13, r8)
            r14.mo100814i(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            long r8 = m140004M(r13, r8)
            r14.mo100812g(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            long r8 = m140004M(r13, r8)
            r14.mo100829x(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            float r6 = m140017s(r13, r8)
            r14.mo100792F(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.mo101428D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m140008W(r6)
            double r8 = m140015o(r13, r8)
            r14.mo100822q(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.protobuf.h0<?> r3 = r12.f83428p
            r3.mo101133j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.protobuf.x2<?, ?> r0 = r12.f83427o
            r12.mo101427A0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101466w0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* renamed from: x */
    public int mo101467x() {
        return this.f83413a.length * 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101468x0(T r11, com.google.protobuf.Writer r12) throws java.io.IOException {
        /*
            r10 = this;
            com.google.protobuf.x2<?, ?> r0 = r10.f83427o
            r10.mo101427A0(r0, r11, r12)
            boolean r0 = r10.f83418f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.h0<?> r0 = r10.f83428p
            com.google.protobuf.o0 r0 = r0.mo101126c(r11)
            boolean r2 = r0.mo101381C()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo101401r()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f83413a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.mo101463u0(r3)
            int r5 = r10.mo101439V(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.protobuf.h0<?> r6 = r10.f83428p
            int r6 = r6.mo101124a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.protobuf.h0<?> r6 = r10.f83428p
            r6.mo101133j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m140019t0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            com.google.protobuf.g2 r6 = r10.mo101464v(r3)
            r12.mo100801O(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            long r6 = m140013b0(r11, r6)
            r12.mo100819n(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m140012a0(r11, r6)
            r12.mo100798L(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            long r6 = m140013b0(r11, r6)
            r12.mo100815j(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m140012a0(r11, r6)
            r12.mo100831z(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m140012a0(r11, r6)
            r12.mo100795I(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m140012a0(r11, r6)
            r12.mo100821p(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r12.mo100802P(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            com.google.protobuf.g2 r6 = r10.mo101464v(r3)
            r12.mo100804R(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            r10.mo101472z0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            boolean r4 = m140009X(r11, r6)
            r12.mo100830y(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m140012a0(r11, r6)
            r12.mo100808c(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            long r6 = m140013b0(r11, r6)
            r12.mo100825t(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m140012a0(r11, r6)
            r12.mo100814i(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            long r6 = m140013b0(r11, r6)
            r12.mo100812g(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            long r6 = m140013b0(r11, r6)
            r12.mo100829x(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            float r4 = m140011Z(r11, r6)
            r12.mo100792F(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.mo101433J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            double r6 = m140010Y(r11, r6)
            r12.mo100822q(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            r10.mo101470y0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g2 r6 = r10.mo101464v(r3)
            com.google.protobuf.C34381i2.m139355i0(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139387y0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139383w0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139379u0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139375s0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139339a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139313D0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139332U(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139343c0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139347e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139359k0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139317F0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139363m0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139351g0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.mo101439V(r3)
            long r8 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139336Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139387y0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139383w0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139379u0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139375s0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139339a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139313D0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139334W(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g2 r6 = r10.mo101464v(r3)
            com.google.protobuf.C34381i2.m139371q0(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139309B0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139332U(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139343c0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139347e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139359k0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139317F0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139363m0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139351g0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.mo101439V(r3)
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C34381i2.m139336Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            com.google.protobuf.g2 r6 = r10.mo101464v(r3)
            r12.mo100801O(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            long r6 = m140004M(r11, r6)
            r12.mo100819n(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m139999B(r11, r6)
            r12.mo100798L(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            long r6 = m140004M(r11, r6)
            r12.mo100815j(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m139999B(r11, r6)
            r12.mo100831z(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m139999B(r11, r6)
            r12.mo100795I(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m139999B(r11, r6)
            r12.mo100821p(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r12.mo100802P(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            com.google.protobuf.g2 r6 = r10.mo101464v(r3)
            r12.mo100804R(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            java.lang.Object r4 = com.google.protobuf.C34341c3.m138967Q(r11, r6)
            r10.mo101472z0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            boolean r4 = m140014l(r11, r6)
            r12.mo100830y(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m139999B(r11, r6)
            r12.mo100808c(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            long r6 = m140004M(r11, r6)
            r12.mo100825t(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            int r4 = m139999B(r11, r6)
            r12.mo100814i(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            long r6 = m140004M(r11, r6)
            r12.mo100812g(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            long r6 = m140004M(r11, r6)
            r12.mo100829x(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            float r4 = m140017s(r11, r6)
            r12.mo100792F(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.mo101428D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m140008W(r4)
            double r6 = m140015o(r11, r6)
            r12.mo100822q(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.protobuf.h0<?> r11 = r10.f83428p
            r11.mo101133j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101468x0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0344, code lost:
        r4 = (r4 + r9) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0410, code lost:
        r6 = r6 + r3;
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0462, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0519, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo101469y(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f83403A
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000d:
            int[] r9 = r0.f83413a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0520
            int r9 = r0.mo101463u0(r5)
            int r10 = r0.mo101439V(r5)
            int r11 = m140019t0(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x0038
            int[] r12 = r0.f83413a
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
            boolean r12 = r0.f83421i
            if (r12 == 0) goto L_0x0054
            com.google.protobuf.FieldType r12 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r12 = r12.mo100407w()
            if (r11 < r12) goto L_0x0054
            com.google.protobuf.FieldType r12 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r12 = r12.mo100407w()
            if (r11 > r12) goto L_0x0054
            int[] r12 = r0.f83413a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r4
            goto L_0x0055
        L_0x0054:
            r12 = 0
        L_0x0055:
            r15 = 0
        L_0x0056:
            long r13 = m140008W(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x050d;
                case 1: goto L_0x0503;
                case 2: goto L_0x04f5;
                case 3: goto L_0x04e7;
                case 4: goto L_0x04d9;
                case 5: goto L_0x04cf;
                case 6: goto L_0x04c5;
                case 7: goto L_0x04ba;
                case 8: goto L_0x049e;
                case 9: goto L_0x048d;
                case 10: goto L_0x047e;
                case 11: goto L_0x0471;
                case 12: goto L_0x0464;
                case 13: goto L_0x0459;
                case 14: goto L_0x0450;
                case 15: goto L_0x0443;
                case 16: goto L_0x0436;
                case 17: goto L_0x0423;
                case 18: goto L_0x0414;
                case 19: goto L_0x0405;
                case 20: goto L_0x03f9;
                case 21: goto L_0x03ed;
                case 22: goto L_0x03e1;
                case 23: goto L_0x03d5;
                case 24: goto L_0x03c9;
                case 25: goto L_0x03bd;
                case 26: goto L_0x03b2;
                case 27: goto L_0x03a2;
                case 28: goto L_0x0396;
                case 29: goto L_0x0389;
                case 30: goto L_0x037c;
                case 31: goto L_0x036f;
                case 32: goto L_0x0362;
                case 33: goto L_0x0355;
                case 34: goto L_0x0348;
                case 35: goto L_0x0328;
                case 36: goto L_0x030b;
                case 37: goto L_0x02ee;
                case 38: goto L_0x02d1;
                case 39: goto L_0x02b3;
                case 40: goto L_0x0295;
                case 41: goto L_0x0277;
                case 42: goto L_0x0259;
                case 43: goto L_0x023b;
                case 44: goto L_0x021d;
                case 45: goto L_0x01ff;
                case 46: goto L_0x01e1;
                case 47: goto L_0x01c3;
                case 48: goto L_0x01a5;
                case 49: goto L_0x0195;
                case 50: goto L_0x0185;
                case 51: goto L_0x0177;
                case 52: goto L_0x016b;
                case 53: goto L_0x015b;
                case 54: goto L_0x014b;
                case 55: goto L_0x013b;
                case 56: goto L_0x012f;
                case 57: goto L_0x0122;
                case 58: goto L_0x0115;
                case 59: goto L_0x00f7;
                case 60: goto L_0x00e3;
                case 61: goto L_0x00d1;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00b1;
                case 64: goto L_0x00a4;
                case 65: goto L_0x0098;
                case 66: goto L_0x0088;
                case 67: goto L_0x0078;
                case 68: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0420
        L_0x0062:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.l1 r3 = (com.google.protobuf.C34412l1) r3
            com.google.protobuf.g2 r4 = r0.mo101464v(r5)
            int r3 = com.google.protobuf.CodedOutputStream.m137402t0(r10, r3, r4)
            goto L_0x041f
        L_0x0078:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m140013b0(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137362T0(r10, r3)
            goto L_0x041f
        L_0x0088:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m140012a0(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137360R0(r10, r3)
            goto L_0x041f
        L_0x0098:
            boolean r9 = r0.mo101433J(r1, r10, r5)
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m137358P0(r10, r3)
            goto L_0x041f
        L_0x00a4:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m137356N0(r10, r3)
            goto L_0x0462
        L_0x00b1:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m140012a0(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137386k0(r10, r3)
            goto L_0x041f
        L_0x00c1:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m140012a0(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137368Y0(r10, r3)
            goto L_0x041f
        L_0x00d1:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m137380g0(r10, r3)
            goto L_0x041f
        L_0x00e3:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.g2 r4 = r0.mo101464v(r5)
            int r3 = com.google.protobuf.C34381i2.m139368p(r10, r3, r4)
            goto L_0x041f
        L_0x00f7:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.ByteString
            if (r4 == 0) goto L_0x010d
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m137380g0(r10, r3)
            goto L_0x041f
        L_0x010d:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m137364V0(r10, r3)
            goto L_0x041f
        L_0x0115:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.m137370a0(r10, r3)
            goto L_0x041f
        L_0x0122:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m137390m0(r10, r3)
            goto L_0x0462
        L_0x012f:
            boolean r9 = r0.mo101433J(r1, r10, r5)
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m137394o0(r10, r3)
            goto L_0x041f
        L_0x013b:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m140012a0(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137405w0(r10, r3)
            goto L_0x041f
        L_0x014b:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m140013b0(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137371a1(r10, r3)
            goto L_0x041f
        L_0x015b:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m140013b0(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137407y0(r10, r3)
            goto L_0x041f
        L_0x016b:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m137398q0(r10, r9)
            goto L_0x041f
        L_0x0177:
            boolean r3 = r0.mo101433J(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m137382i0(r10, r3)
            goto L_0x041f
        L_0x0185:
            com.google.protobuf.g1 r3 = r0.f83429q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.mo101462u(r5)
            int r3 = r3.mo101112g(r10, r4, r9)
            goto L_0x041f
        L_0x0195:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g2 r4 = r0.mo101464v(r5)
            int r3 = com.google.protobuf.C34381i2.m139358k(r10, r3, r4)
            goto L_0x041f
        L_0x01a5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139380v(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x01b9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01b9:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x01c3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139376t(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x01d7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01d7:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x01e1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139354i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x01f5
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01f5:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x01ff:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139350g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x0213
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0213:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x021d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139346e(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x0231
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0231:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x023b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139386y(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x024f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x024f:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x0259:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139340b(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x026d
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x026d:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x0277:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139350g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x028b
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x028b:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x0295:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139354i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x02a9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02a9:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x02b3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139362m(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x02c7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02c7:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x02d1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139306A(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x02e5
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02e5:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x02ee:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139366o(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x0302
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0302:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x030b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139350g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x031f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x031f:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
            goto L_0x0344
        L_0x0328:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139354i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f83421i
            if (r4 == 0) goto L_0x033c
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x033c:
            int r4 = com.google.protobuf.CodedOutputStream.m137366X0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m137369Z0(r3)
        L_0x0344:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x0462
        L_0x0348:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.C34381i2.m139378u(r10, r3, r4)
            goto L_0x0410
        L_0x0355:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139374s(r10, r3, r4)
            goto L_0x0410
        L_0x0362:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139352h(r10, r3, r4)
            goto L_0x0410
        L_0x036f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139348f(r10, r3, r4)
            goto L_0x0410
        L_0x037c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139344d(r10, r3, r4)
            goto L_0x0410
        L_0x0389:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139384x(r10, r3, r4)
            goto L_0x041f
        L_0x0396:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139342c(r10, r3)
            goto L_0x041f
        L_0x03a2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g2 r4 = r0.mo101464v(r5)
            int r3 = com.google.protobuf.C34381i2.m139372r(r10, r3, r4)
            goto L_0x041f
        L_0x03b2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139382w(r10, r3)
            goto L_0x041f
        L_0x03bd:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.C34381i2.m139338a(r10, r3, r4)
            goto L_0x0410
        L_0x03c9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139348f(r10, r3, r4)
            goto L_0x0410
        L_0x03d5:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139352h(r10, r3, r4)
            goto L_0x0410
        L_0x03e1:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139360l(r10, r3, r4)
            goto L_0x0410
        L_0x03ed:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139388z(r10, r3, r4)
            goto L_0x0410
        L_0x03f9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139364n(r10, r3, r4)
            goto L_0x0410
        L_0x0405:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139348f(r10, r3, r4)
        L_0x0410:
            int r6 = r6 + r3
            r11 = r4
            goto L_0x0519
        L_0x0414:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C34381i2.m139352h(r10, r3, r4)
        L_0x041f:
            int r6 = r6 + r3
        L_0x0420:
            r11 = 0
            goto L_0x0519
        L_0x0423:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.l1 r3 = (com.google.protobuf.C34412l1) r3
            com.google.protobuf.g2 r4 = r0.mo101464v(r5)
            int r3 = com.google.protobuf.CodedOutputStream.m137402t0(r10, r3, r4)
            goto L_0x041f
        L_0x0436:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137362T0(r10, r3)
            goto L_0x041f
        L_0x0443:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137360R0(r10, r3)
            goto L_0x041f
        L_0x0450:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m137358P0(r10, r3)
            goto L_0x041f
        L_0x0459:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m137356N0(r10, r3)
        L_0x0462:
            int r6 = r6 + r4
            goto L_0x0420
        L_0x0464:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137386k0(r10, r3)
            goto L_0x041f
        L_0x0471:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137368Y0(r10, r3)
            goto L_0x041f
        L_0x047e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m137380g0(r10, r3)
            goto L_0x041f
        L_0x048d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.g2 r4 = r0.mo101464v(r5)
            int r3 = com.google.protobuf.C34381i2.m139368p(r10, r3, r4)
            goto L_0x041f
        L_0x049e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.ByteString
            if (r4 == 0) goto L_0x04b2
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m137380g0(r10, r3)
            goto L_0x041f
        L_0x04b2:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m137364V0(r10, r3)
            goto L_0x041f
        L_0x04ba:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.m137370a0(r10, r3)
            goto L_0x041f
        L_0x04c5:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r11 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m137390m0(r10, r11)
            goto L_0x0518
        L_0x04cf:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0519
            int r3 = com.google.protobuf.CodedOutputStream.m137394o0(r10, r3)
            goto L_0x0518
        L_0x04d9:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137405w0(r10, r3)
            goto L_0x0518
        L_0x04e7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137371a1(r10, r3)
            goto L_0x0518
        L_0x04f5:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m137407y0(r10, r3)
            goto L_0x0518
        L_0x0503:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            int r3 = com.google.protobuf.CodedOutputStream.m137398q0(r10, r9)
            goto L_0x0518
        L_0x050d:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m137382i0(r10, r3)
        L_0x0518:
            int r6 = r6 + r3
        L_0x0519:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0520:
            com.google.protobuf.x2<?, ?> r2 = r0.f83427o
            int r2 = r0.mo101426A(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f83418f
            if (r2 == 0) goto L_0x0536
            com.google.protobuf.h0<?> r2 = r0.f83428p
            com.google.protobuf.o0 r1 = r2.mo101126c(r1)
            int r1 = r1.mo101408z()
            int r6 = r6 + r1
        L_0x0536:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101469y(java.lang.Object):int");
    }

    /* renamed from: y0 */
    public final <K, V> void mo101470y0(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.mo100805S(i, this.f83429q.mo101107b(mo101462u(i2)), this.f83429q.mo101110e(obj));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo101471z(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f83403A
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f83413a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.mo101463u0(r4)
            int r7 = m140019t0(r6)
            int r8 = r15.mo101439V(r4)
            long r9 = m140008W(r6)
            com.google.protobuf.FieldType r6 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.mo100407w()
            if (r7 < r6) goto L_0x0038
            com.google.protobuf.FieldType r6 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.mo100407w()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f83413a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r1, r9)
            com.google.protobuf.l1 r6 = (com.google.protobuf.C34412l1) r6
            com.google.protobuf.g2 r7 = r15.mo101464v(r4)
            int r6 = com.google.protobuf.CodedOutputStream.m137402t0(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m140013b0(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137362T0(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m140012a0(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137360R0(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137358P0(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137356N0(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m140012a0(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137386k0(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m140012a0(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137368Y0(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r1, r9)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m137380g0(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r1, r9)
            com.google.protobuf.g2 r7 = r15.mo101464v(r4)
            int r6 = com.google.protobuf.C34381i2.m139368p(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.ByteString
            if (r7 == 0) goto L_0x00ec
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m137380g0(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.m137364V0(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137370a0(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137390m0(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137394o0(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m140012a0(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137405w0(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m140013b0(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137371a1(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m140013b0(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137407y0(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137398q0(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.mo101433J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.m137382i0(r8, r6)
            goto L_0x03c4
        L_0x0162:
            com.google.protobuf.g1 r6 = r0.f83429q
            java.lang.Object r7 = com.google.protobuf.C34341c3.m138967Q(r1, r9)
            java.lang.Object r9 = r15.mo101462u(r4)
            int r6 = r6.mo101112g(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = m140003L(r1, r9)
            com.google.protobuf.g2 r7 = r15.mo101464v(r4)
            int r6 = com.google.protobuf.C34381i2.m139358k(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139380v(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139376t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139354i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139350g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139346e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139386y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139340b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139350g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139354i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139362m(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139306A(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139366o(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139350g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C34381i2.m139354i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f83421i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = com.google.protobuf.CodedOutputStream.m137366X0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m137369Z0(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139378u(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139374s(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139352h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139348f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139344d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139384x(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139342c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = m140003L(r1, r9)
            com.google.protobuf.g2 r7 = r15.mo101464v(r4)
            int r6 = com.google.protobuf.C34381i2.m139372r(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139382w(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139338a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139348f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139352h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139360l(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139388z(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139364n(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139348f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = m140003L(r1, r9)
            int r6 = com.google.protobuf.C34381i2.m139352h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r1, r9)
            com.google.protobuf.l1 r6 = (com.google.protobuf.C34412l1) r6
            com.google.protobuf.g2 r7 = r15.mo101464v(r4)
            int r6 = com.google.protobuf.CodedOutputStream.m137402t0(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C34341c3.m138964N(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137362T0(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C34341c3.m138961K(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137360R0(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137358P0(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137356N0(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C34341c3.m138961K(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137386k0(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C34341c3.m138961K(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137368Y0(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r1, r9)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m137380g0(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r1, r9)
            com.google.protobuf.g2 r7 = r15.mo101464v(r4)
            int r6 = com.google.protobuf.C34381i2.m139368p(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C34341c3.m138967Q(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.ByteString
            if (r7 == 0) goto L_0x0469
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m137380g0(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.m137364V0(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137370a0(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137390m0(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137394o0(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C34341c3.m138961K(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137405w0(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C34341c3.m138964N(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137371a1(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C34341c3.m138964N(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m137407y0(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m137398q0(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.mo101428D(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.m137382i0(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            com.google.protobuf.x2<?, ?> r2 = r0.f83427o
            int r1 = r15.mo101426A(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34429o1.mo101471z(java.lang.Object):int");
    }

    /* renamed from: z0 */
    public final void mo101472z0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.mo100811f(i, (String) obj);
        } else {
            writer.mo100802P(i, (ByteString) obj);
        }
    }
}
