package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18793l;
import androidx.datastore.preferences.protobuf.C18868t1;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.c2 */
public final class C18700c2<T> implements C18905x2<T> {

    /* renamed from: r */
    public static final int f47808r = 3;

    /* renamed from: s */
    public static final int f47809s = 20;

    /* renamed from: t */
    public static final int f47810t = 1048575;

    /* renamed from: u */
    public static final int f47811u = 267386880;

    /* renamed from: v */
    public static final int f47812v = 268435456;

    /* renamed from: w */
    public static final int f47813w = 536870912;

    /* renamed from: x */
    public static final int[] f47814x = new int[0];

    /* renamed from: y */
    public static final int f47815y = 51;

    /* renamed from: z */
    public static final Unsafe f47816z = C18923z3.m88371R();

    /* renamed from: a */
    public final int[] f47817a;

    /* renamed from: b */
    public final Object[] f47818b;

    /* renamed from: c */
    public final int f47819c;

    /* renamed from: d */
    public final int f47820d;

    /* renamed from: e */
    public final C18920z1 f47821e;

    /* renamed from: f */
    public final boolean f47822f;

    /* renamed from: g */
    public final boolean f47823g;

    /* renamed from: h */
    public final boolean f47824h;

    /* renamed from: i */
    public final boolean f47825i;

    /* renamed from: j */
    public final int[] f47826j;

    /* renamed from: k */
    public final int f47827k;

    /* renamed from: l */
    public final int f47828l;

    /* renamed from: m */
    public final C18777j2 f47829m;

    /* renamed from: n */
    public final C18827o1 f47830n;

    /* renamed from: o */
    public final C18888v3<?, ?> f47831o;

    /* renamed from: p */
    public final C18844q0<?> f47832p;

    /* renamed from: q */
    public final C18881u1 f47833q;

    /* renamed from: androidx.datastore.preferences.protobuf.c2$a */
    public static /* synthetic */ class C18701a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47834a;

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
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47834a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f47834a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.C18701a.<clinit>():void");
        }
    }

    public C18700c2(int[] iArr, Object[] objArr, int i, int i2, C18920z1 z1Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C18777j2 j2Var, C18827o1 o1Var, C18888v3<?, ?> v3Var, C18844q0<?> q0Var, C18881u1 u1Var) {
        boolean z3;
        this.f47817a = iArr;
        this.f47818b = objArr;
        this.f47819c = i;
        this.f47820d = i2;
        this.f47823g = z1Var instanceof GeneratedMessageLite;
        this.f47824h = z;
        if (q0Var == null || !q0Var.mo55346e(z1Var)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f47822f = z3;
        this.f47825i = z2;
        this.f47826j = iArr2;
        this.f47827k = i3;
        this.f47828l = i4;
        this.f47829m = j2Var;
        this.f47830n = o1Var;
        this.f47831o = v3Var;
        this.f47832p = q0Var;
        this.f47821e = z1Var;
        this.f47833q = u1Var;
    }

    /* renamed from: B */
    public static <T> int m85647B(T t, long j) {
        return C18923z3.m88362I(t, j);
    }

    /* renamed from: C */
    public static boolean m85648C(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: F */
    public static boolean m85649F(Object obj, int i, C18905x2 x2Var) {
        return x2Var.mo54447c(C18923z3.m88368O(obj, m85656W(i)));
    }

    /* renamed from: K */
    public static boolean m85650K(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: L */
    public static List<?> m85651L(Object obj, long j) {
        return (List) C18923z3.m88368O(obj, j);
    }

    /* renamed from: M */
    public static <T> long m85652M(T t, long j) {
        return C18923z3.m88365L(t, j);
    }

    /* renamed from: S */
    public static <T> C18700c2<T> m85653S(Class<T> cls, C18904x1 x1Var, C18777j2 j2Var, C18827o1 o1Var, C18888v3<?, ?> v3Var, C18844q0<?> q0Var, C18881u1 u1Var) {
        if (x1Var instanceof C18887v2) {
            return m85655U((C18887v2) x1Var, j2Var, o1Var, v3Var, q0Var, u1Var);
        }
        return m85654T((C18778j3) x1Var, j2Var, o1Var, v3Var, q0Var, u1Var);
    }

    /* renamed from: T */
    public static <T> C18700c2<T> m85654T(C18778j3 j3Var, C18777j2 j2Var, C18827o1 o1Var, C18888v3<?, ?> v3Var, C18844q0<?> q0Var, C18881u1 u1Var) {
        boolean z;
        int i;
        int i2;
        int[] iArr;
        int i3;
        if (j3Var.getSyntax() == ProtoSyntax.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        C18865t0[] d = j3Var.mo54864d();
        if (d.length == 0) {
            i2 = 0;
            i = 0;
        } else {
            i2 = d[0].mo55394h0();
            i = d[d.length - 1].mo55394h0();
        }
        int length = d.length;
        int[] iArr2 = new int[(length * 3)];
        Object[] objArr = new Object[(length * 2)];
        int i4 = 0;
        int i5 = 0;
        for (C18865t0 t0Var : d) {
            if (t0Var.mo55402u0() == FieldType.MAP) {
                i4++;
            } else if (t0Var.mo55402u0().mo53974w() >= 18 && t0Var.mo55402u0().mo53974w() <= 49) {
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
        int[] c = j3Var.mo54863c();
        if (c == null) {
            c = f47814x;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i6 < d.length) {
            C18865t0 t0Var2 = d[i6];
            int h0 = t0Var2.mo55394h0();
            m85666s0(t0Var2, iArr2, i7, z, objArr);
            if (i8 < c.length && c[i8] == h0) {
                c[i8] = i7;
                i8++;
            }
            if (t0Var2.mo55402u0() == FieldType.MAP) {
                iArr[i9] = i7;
                i9++;
            } else if (t0Var2.mo55402u0().mo53974w() >= 18 && t0Var2.mo55402u0().mo53974w() <= 49) {
                i3 = i7;
                iArr3[i10] = (int) C18923z3.m88376W(t0Var2.mo55392f0());
                i10++;
                i6++;
                i7 = i3 + 3;
            }
            i3 = i7;
            i6++;
            i7 = i3 + 3;
        }
        if (iArr == null) {
            iArr = f47814x;
        }
        if (iArr3 == null) {
            iArr3 = f47814x;
        }
        int[] iArr4 = new int[(c.length + iArr.length + iArr3.length)];
        System.arraycopy(c, 0, iArr4, 0, c.length);
        System.arraycopy(iArr, 0, iArr4, c.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, c.length + iArr.length, iArr3.length);
        return new C18700c2(iArr2, objArr, i2, i, j3Var.mo54862b(), z, true, iArr4, c.length, c.length + iArr.length, j2Var, o1Var, v3Var, q0Var, u1Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0391  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> androidx.datastore.preferences.protobuf.C18700c2<T> m85655U(androidx.datastore.preferences.protobuf.C18887v2 r36, androidx.datastore.preferences.protobuf.C18777j2 r37, androidx.datastore.preferences.protobuf.C18827o1 r38, androidx.datastore.preferences.protobuf.C18888v3<?, ?> r39, androidx.datastore.preferences.protobuf.C18844q0<?> r40, androidx.datastore.preferences.protobuf.C18881u1 r41) {
        /*
            androidx.datastore.preferences.protobuf.ProtoSyntax r0 = r36.getSyntax()
            androidx.datastore.preferences.protobuf.ProtoSyntax r1 = androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r36.mo55455d()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0062
            int[] r8 = f47814x
            r9 = r2
            r11 = r9
            r12 = r11
            r14 = r12
            r15 = r14
            r13 = r8
            r8 = r15
            goto L_0x0177
        L_0x0062:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0081
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x007e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x006e
        L_0x007e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0081:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x00a0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ac
        L_0x00bc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00bf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00de
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x014f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x0161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x014f
        L_0x0161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r35 = r13
            r13 = r2
            r2 = r9
            r9 = r35
        L_0x0177:
            sun.misc.Unsafe r5 = f47816z
            java.lang.Object[] r18 = r36.mo55454c()
            androidx.datastore.preferences.protobuf.z1 r19 = r36.mo54862b()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L_0x0196:
            if (r7 >= r1) goto L_0x03e9
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L_0x01ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L_0x01ab
        L_0x01c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L_0x01ce
        L_0x01ca:
            r28 = r15
            r1 = r25
        L_0x01ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01e1
        L_0x01fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L_0x0204
        L_0x0200:
            r29 = r10
            r15 = r25
        L_0x0204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L_0x0211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L_0x02b0
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L_0x0226:
            int r34 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L_0x023b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r33
            r15 = r15 | r9
            int r33 = r33 + 13
            r11 = r34
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0226
        L_0x023b:
            int r9 = r11 << r33
            r15 = r15 | r9
            r11 = r34
        L_0x0240:
            int r9 = r10 + -51
            r33 = r11
            r11 = 9
            if (r9 == r11) goto L_0x0262
            r11 = 17
            if (r9 != r11) goto L_0x024d
            goto L_0x0262
        L_0x024d:
            r11 = 12
            if (r9 != r11) goto L_0x026f
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L_0x026f
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L_0x026e
        L_0x0262:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L_0x026e:
            r14 = r11
        L_0x026f:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x027a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0282
        L_0x027a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m85664o0(r3, r9)
            r18[r15] = r9
        L_0x0282:
            r11 = r6
            r34 = r7
            long r6 = r5.objectFieldOffset(r9)
            int r6 = (int) r6
            int r15 = r15 + 1
            r7 = r18[r15]
            boolean r9 = r7 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0295
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x029d
        L_0x0295:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m85664o0(r3, r7)
            r18[r15] = r7
        L_0x029d:
            r9 = r6
            long r6 = r5.objectFieldOffset(r7)
            int r6 = (int) r6
            r32 = r0
            r19 = r3
            r0 = r4
            r3 = r6
            r6 = r9
            r9 = r10
            r7 = r33
            r15 = 0
            goto L_0x03ae
        L_0x02b0:
            r11 = r6
            r34 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m85664o0(r3, r7)
            r9 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0325
            r14 = 17
            if (r10 != r14) goto L_0x02c8
            goto L_0x0325
        L_0x02c8:
            r14 = 27
            if (r10 == r14) goto L_0x0315
            if (r10 != r9) goto L_0x02cf
            goto L_0x0315
        L_0x02cf:
            r14 = 12
            if (r10 == r14) goto L_0x0304
            r14 = 30
            if (r10 == r14) goto L_0x0304
            r14 = 44
            if (r10 != r14) goto L_0x02dc
            goto L_0x0304
        L_0x02dc:
            r14 = 50
            if (r10 != r14) goto L_0x0302
            int r14 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r6 + 1
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x02fd
            int r23 = r23 + 1
            int r6 = r27 + 1
            r27 = r18[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0331
        L_0x02fd:
            r23 = r14
            r6 = r27
            goto L_0x0331
        L_0x0302:
            r9 = 1
            goto L_0x0331
        L_0x0304:
            r14 = r4 & 1
            r9 = 1
            if (r14 != r9) goto L_0x0331
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
            goto L_0x0321
        L_0x0315:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
        L_0x0321:
            r14 = r10
            r6 = r20
            goto L_0x0332
        L_0x0325:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            java.lang.Class r20 = r7.getType()
            r12[r14] = r20
        L_0x0331:
            r14 = r10
        L_0x0332:
            long r9 = r5.objectFieldOffset(r7)
            int r7 = (int) r9
            r9 = r4 & 1
            r10 = 1
            if (r9 != r10) goto L_0x0391
            r9 = r14
            r14 = 17
            if (r9 > r14) goto L_0x038b
            int r14 = r15 + 1
            char r15 = r0.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0367
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0350:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r10) goto L_0x0362
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r19
            r15 = r15 | r14
            int r19 = r19 + 13
            r14 = r30
            goto L_0x0350
        L_0x0362:
            int r14 = r14 << r19
            r15 = r15 | r14
            r14 = r30
        L_0x0367:
            int r19 = r8 * 2
            int r30 = r15 / 32
            int r19 = r19 + r30
            r10 = r18[r19]
            r32 = r0
            boolean r0 = r10 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0378
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0380
        L_0x0378:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m85664o0(r3, r10)
            r18[r19] = r10
        L_0x0380:
            r19 = r3
            r0 = r4
            long r3 = r5.objectFieldOffset(r10)
            int r3 = (int) r3
            int r15 = r15 % 32
            goto L_0x039a
        L_0x038b:
            r32 = r0
            r19 = r3
            r0 = r4
            goto L_0x0397
        L_0x0391:
            r32 = r0
            r19 = r3
            r0 = r4
            r9 = r14
        L_0x0397:
            r14 = r15
            r3 = 0
            r15 = 0
        L_0x039a:
            r4 = 18
            if (r9 < r4) goto L_0x03a8
            r4 = 49
            if (r9 > r4) goto L_0x03a8
            int r4 = r24 + 1
            r13[r24] = r7
            r24 = r4
        L_0x03a8:
            r35 = r14
            r14 = r6
            r6 = r7
            r7 = r35
        L_0x03ae:
            int r4 = r22 + 1
            r11[r22] = r34
            int r10 = r4 + 1
            r22 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03bd
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03be
        L_0x03bd:
            r0 = 0
        L_0x03be:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03c5
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c6
        L_0x03c5:
            r1 = 0
        L_0x03c6:
            r0 = r0 | r1
            int r1 = r9 << 20
            r0 = r0 | r1
            r0 = r0 | r6
            r11[r4] = r0
            int r0 = r10 + 1
            int r1 = r15 << 20
            r1 = r1 | r3
            r11[r10] = r1
            r6 = r11
            r3 = r19
            r4 = r22
            r11 = r25
            r1 = r26
            r15 = r28
            r10 = r29
            r9 = r31
            r22 = r0
            r0 = r32
            goto L_0x0196
        L_0x03e9:
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            androidx.datastore.preferences.protobuf.c2 r0 = new androidx.datastore.preferences.protobuf.c2
            androidx.datastore.preferences.protobuf.z1 r9 = r36.mo54862b()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r2
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.m85655U(androidx.datastore.preferences.protobuf.v2, androidx.datastore.preferences.protobuf.j2, androidx.datastore.preferences.protobuf.o1, androidx.datastore.preferences.protobuf.v3, androidx.datastore.preferences.protobuf.q0, androidx.datastore.preferences.protobuf.u1):androidx.datastore.preferences.protobuf.c2");
    }

    /* renamed from: W */
    public static long m85656W(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: X */
    public static <T> boolean m85657X(T t, long j) {
        return ((Boolean) C18923z3.m88368O(t, j)).booleanValue();
    }

    /* renamed from: Y */
    public static <T> double m85658Y(T t, long j) {
        return ((Double) C18923z3.m88368O(t, j)).doubleValue();
    }

    /* renamed from: Z */
    public static <T> float m85659Z(T t, long j) {
        return ((Float) C18923z3.m88368O(t, j)).floatValue();
    }

    /* renamed from: a0 */
    public static <T> int m85660a0(T t, long j) {
        return ((Integer) C18923z3.m88368O(t, j)).intValue();
    }

    /* renamed from: b0 */
    public static <T> long m85661b0(T t, long j) {
        return ((Long) C18923z3.m88368O(t, j)).longValue();
    }

    /* renamed from: l */
    public static <T> boolean m85662l(T t, long j) {
        return C18923z3.m88420u(t, j);
    }

    /* renamed from: o */
    public static <T> double m85663o(T t, long j) {
        return C18923z3.m88357D(t, j);
    }

    /* renamed from: o0 */
    public static Field m85664o0(Class<?> cls, String str) {
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
    public static <T> float m85665s(T t, long j) {
        return C18923z3.m88359F(t, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c5  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m85666s0(androidx.datastore.preferences.protobuf.C18865t0 r8, int[] r9, int r10, boolean r11, java.lang.Object[] r12) {
        /*
            androidx.datastore.preferences.protobuf.m2 r0 = r8.mo55398n0()
            r1 = 0
            if (r0 == 0) goto L_0x0027
            androidx.datastore.preferences.protobuf.FieldType r11 = r8.mo55402u0()
            int r11 = r11.mo53974w()
            int r11 = r11 + 51
            java.lang.reflect.Field r2 = r0.mo55062c()
            long r2 = androidx.datastore.preferences.protobuf.C18923z3.m88376W(r2)
            int r2 = (int) r2
            java.lang.reflect.Field r0 = r0.mo55060a()
            long r3 = androidx.datastore.preferences.protobuf.C18923z3.m88376W(r0)
            int r0 = (int) r3
        L_0x0023:
            r3 = r2
            r2 = r0
            r0 = r1
            goto L_0x0073
        L_0x0027:
            androidx.datastore.preferences.protobuf.FieldType r0 = r8.mo55402u0()
            java.lang.reflect.Field r2 = r8.mo55392f0()
            long r2 = androidx.datastore.preferences.protobuf.C18923z3.m88376W(r2)
            int r2 = (int) r2
            int r3 = r0.mo53974w()
            if (r11 != 0) goto L_0x005d
            boolean r11 = r0.mo53975y()
            if (r11 != 0) goto L_0x005d
            boolean r11 = r0.mo53976z()
            if (r11 != 0) goto L_0x005d
            java.lang.reflect.Field r11 = r8.mo55400p0()
            long r4 = androidx.datastore.preferences.protobuf.C18923z3.m88376W(r11)
            int r0 = (int) r4
            int r11 = r8.mo55401t0()
            int r11 = java.lang.Integer.numberOfTrailingZeros(r11)
            r7 = r0
            r0 = r11
            r11 = r3
            r3 = r2
            r2 = r7
            goto L_0x0073
        L_0x005d:
            java.lang.reflect.Field r11 = r8.mo55389Z()
            if (r11 != 0) goto L_0x0068
            r0 = r1
            r11 = r3
            r3 = r2
            r2 = r0
            goto L_0x0073
        L_0x0068:
            java.lang.reflect.Field r11 = r8.mo55389Z()
            long r4 = androidx.datastore.preferences.protobuf.C18923z3.m88376W(r11)
            int r0 = (int) r4
            r11 = r3
            goto L_0x0023
        L_0x0073:
            int r4 = r8.mo55394h0()
            r9[r10] = r4
            int r4 = r10 + 1
            boolean r5 = r8.mo55387A0()
            if (r5 == 0) goto L_0x0084
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0085
        L_0x0084:
            r5 = r1
        L_0x0085:
            boolean r6 = r8.mo55388F0()
            if (r6 == 0) goto L_0x008d
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x008d:
            r1 = r1 | r5
            int r11 = r11 << 20
            r11 = r11 | r1
            r11 = r11 | r3
            r9[r4] = r11
            int r11 = r10 + 2
            int r0 = r0 << 20
            r0 = r0 | r2
            r9[r11] = r0
            java.lang.Class r9 = r8.mo55397m0()
            java.lang.Object r11 = r8.mo55396j0()
            if (r11 == 0) goto L_0x00c5
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r11 = r8.mo55396j0()
            r12[r10] = r11
            if (r9 == 0) goto L_0x00b6
            int r10 = r10 + 1
            r12[r10] = r9
            goto L_0x00e2
        L_0x00b6:
            androidx.datastore.preferences.protobuf.i1$e r9 = r8.mo55391e0()
            if (r9 == 0) goto L_0x00e2
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.i1$e r8 = r8.mo55391e0()
            r12[r10] = r8
            goto L_0x00e2
        L_0x00c5:
            if (r9 == 0) goto L_0x00d0
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r12[r10] = r9
            goto L_0x00e2
        L_0x00d0:
            androidx.datastore.preferences.protobuf.i1$e r9 = r8.mo55391e0()
            if (r9 == 0) goto L_0x00e2
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.i1$e r8 = r8.mo55391e0()
            r12[r10] = r8
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.m85666s0(androidx.datastore.preferences.protobuf.t0, int[], int, boolean, java.lang.Object[]):void");
    }

    /* renamed from: t0 */
    public static int m85667t0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: w */
    public static C18900w3 m85668w(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C18900w3 w3Var = generatedMessageLite.unknownFields;
        if (w3Var != C18900w3.m87953e()) {
            return w3Var;
        }
        C18900w3 p = C18900w3.m87957p();
        generatedMessageLite.unknownFields = p;
        return p;
    }

    /* renamed from: A */
    public final <UT, UB> int mo54431A(C18888v3<UT, UB> v3Var, T t) {
        return v3Var.mo55463h(v3Var.mo55462g(t));
    }

    /* renamed from: A0 */
    public final <UT, UB> void mo54432A0(C18888v3<UT, UB> v3Var, T t, Writer writer) throws IOException {
        v3Var.mo55475t(v3Var.mo55462g(t), writer);
    }

    /* renamed from: D */
    public final boolean mo54433D(T t, int i) {
        if (this.f47824h) {
            int u0 = mo54478u0(i);
            long W = m85656W(u0);
            switch (m85667t0(u0)) {
                case 0:
                    if (C18923z3.m88357D(t, W) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (C18923z3.m88359F(t, W) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C18923z3.m88365L(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C18923z3.m88365L(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C18923z3.m88362I(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C18923z3.m88365L(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C18923z3.m88362I(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C18923z3.m88420u(t, W);
                case 8:
                    Object O = C18923z3.m88368O(t, W);
                    if (O instanceof String) {
                        return !((String) O).isEmpty();
                    }
                    if (O instanceof ByteString) {
                        return !ByteString.f47470d.equals(O);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C18923z3.m88368O(t, W) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !ByteString.f47470d.equals(C18923z3.m88368O(t, W));
                case 11:
                    if (C18923z3.m88362I(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C18923z3.m88362I(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C18923z3.m88362I(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C18923z3.m88365L(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C18923z3.m88362I(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C18923z3.m88365L(t, W) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C18923z3.m88368O(t, W) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int j0 = mo54462j0(i);
            if ((C18923z3.m88362I(t, (long) (j0 & 1048575)) & (1 << (j0 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: E */
    public final boolean mo54434E(T t, int i, int i2, int i3) {
        if (this.f47824h) {
            return mo54433D(t, i);
        }
        if ((i2 & i3) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final <N> boolean mo54435G(Object obj, int i, int i2) {
        List list = (List) C18923z3.m88368O(obj, m85656W(i));
        if (list.isEmpty()) {
            return true;
        }
        C18905x2 v = mo54479v(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!v.mo54447c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public final boolean mo54436H(T t, int i, int i2) {
        Map<?, ?> e = this.f47833q.mo55450e(C18923z3.m88368O(t, m85656W(i)));
        if (e.isEmpty()) {
            return true;
        }
        if (this.f47833q.mo55447b(mo54477u(i2)).f48043c.mo54201g() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        C18905x2<?> x2Var = null;
        for (Object next : e.values()) {
            if (x2Var == null) {
                x2Var = C18853r2.m87361a().mo55373i(next.getClass());
            }
            if (!x2Var.mo54447c(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public final boolean mo54437I(T t, T t2, int i) {
        long j0 = (long) (mo54462j0(i) & 1048575);
        if (C18923z3.m88362I(t, j0) == C18923z3.m88362I(t2, j0)) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean mo54438J(T t, int i, int i2) {
        if (C18923z3.m88362I(t, (long) (mo54462j0(i2) & 1048575)) == i) {
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
    public final <UT, UB, ET extends androidx.datastore.preferences.protobuf.C18909y0.C18912c<ET>> void mo54439N(androidx.datastore.preferences.protobuf.C18888v3<UT, UB> r17, androidx.datastore.preferences.protobuf.C18844q0<ET> r18, T r19, androidx.datastore.preferences.protobuf.C18899w2 r20, androidx.datastore.preferences.protobuf.C18836p0 r21) throws java.io.IOException {
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
            int r1 = r20.mo55015z()     // Catch:{ all -> 0x0612 }
            int r3 = r8.mo54458h0(r1)     // Catch:{ all -> 0x0612 }
            if (r3 >= 0) goto L_0x008e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f47827k
        L_0x001e:
            int r1 = r8.f47828l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f47826j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo54472q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo55470o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f47822f     // Catch:{ all -> 0x0612 }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            androidx.datastore.preferences.protobuf.z1 r2 = r8.f47821e     // Catch:{ all -> 0x0612 }
            r15 = r18
            java.lang.Object r1 = r15.mo55343b(r11, r2, r1)     // Catch:{ all -> 0x0612 }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005c
            if (r14 != 0) goto L_0x004d
            androidx.datastore.preferences.protobuf.y0 r1 = r18.mo55345d(r19)     // Catch:{ all -> 0x0612 }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.mo55348g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0612 }
            goto L_0x000d
        L_0x005c:
            boolean r1 = r9.mo55472q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r20.mo54950E()     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0069:
            if (r13 != 0) goto L_0x0070
            java.lang.Object r1 = r9.mo55461f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x0070:
            boolean r1 = r9.mo55468m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0077:
            int r0 = r8.f47827k
        L_0x0079:
            int r1 = r8.f47828l
            if (r0 >= r1) goto L_0x0088
            int[] r1 = r8.f47826j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo54472q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0079
        L_0x0088:
            if (r13 == 0) goto L_0x008d
            r9.mo55470o(r10, r13)
        L_0x008d:
            return
        L_0x008e:
            r15 = r18
            int r4 = r8.mo54478u0(r3)     // Catch:{ all -> 0x0612 }
            int r2 = m85667t0(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
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
            java.lang.Object r1 = r17.mo55469n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x05ad
        L_0x00a3:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.x2 r2 = r8.mo54479v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo54958M(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00b7:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo55013x()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00cb:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo54990k()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00df:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo54978e()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00f3:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo54951F()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0107:
            int r2 = r20.mo54988j()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1$e r5 = r8.mo54476t(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x011e
            boolean r5 = r5.mo53933a(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.C18922z2.m88292Q(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x011e:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x012e:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo54982g()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0142:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.ByteString r2 = r20.mo54996n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0152:
            boolean r2 = r8.mo54438J(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r2 == 0) goto L_0x0174
            long r5 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r10, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.x2 r5 = r8.mo54479v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r5 = r0.mo54956K(r5, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.C18753i1.m86358v(r2, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x0186
        L_0x0174:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.x2 r2 = r8.mo54479v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo54956K(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x0186:
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x018b:
            r8.mo54467m0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0193:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r2 = r20.mo54976d()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01a7:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo55009t()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01bb:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo54970a()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01cf:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo54998o()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01e3:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo55004r()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01f7:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo54954I()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x020b:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r2 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x021f:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r6 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54473q0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0233:
            java.lang.Object r4 = r8.mo54477u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mo54440O(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0244:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.x2 r6 = r8.mo54479v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.mo54464k0(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x025a:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54974c(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0269:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55002q(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0278:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55010u(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0287:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54972b(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0296:
            androidx.datastore.preferences.protobuf.o1 r2 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.mo55211e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54986i(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1$e r3 = r8.mo54476t(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.C18922z2.m88274C(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02ad:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55008s(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02bc:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54992l(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02cb:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55012w(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02da:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55000p(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02e9:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55011v(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02f8:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54980f(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0307:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54984h(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0316:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54949C(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0325:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54953H(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0334:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54974c(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0343:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55002q(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0352:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55010u(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0361:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54972b(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0370:
            androidx.datastore.preferences.protobuf.o1 r2 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.mo55211e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54986i(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1$e r3 = r8.mo54476t(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.C18922z2.m88274C(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0387:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55008s(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0396:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54952G(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03a5:
            androidx.datastore.preferences.protobuf.x2 r5 = r8.mo54479v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.mo54465l0(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03b7:
            r8.mo54469n0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03bc:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54992l(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03cb:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55012w(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03da:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55000p(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03e9:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo55011v(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03f8:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54980f(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0407:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54984h(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0416:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54949C(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0425:
            androidx.datastore.preferences.protobuf.o1 r1 = r8.f47830n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo55211e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo54953H(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0434:
            boolean r1 = r8.mo54433D(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0457
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.x2 r2 = r8.mo54479v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo54958M(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C18753i1.m86358v(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0457:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.x2 r4 = r8.mo54479v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.mo54958M(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x046b:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo55013x()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88409o0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x047b:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo54990k()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88403l0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x048b:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo54978e()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88409o0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x049b:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo54951F()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88403l0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ab:
            int r2 = r20.mo54988j()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1$e r5 = r8.mo54476t(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04c2
            boolean r5 = r5.mo53933a(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04bc
            goto L_0x04c2
        L_0x04bc:
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.C18922z2.m88292Q(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04c2:
            long r4 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88403l0(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ce:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo54982g()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88403l0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04de:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.ByteString r4 = r20.mo54996n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ee:
            boolean r1 = r8.mo54433D(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0511
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.x2 r2 = r8.mo54479v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo54956K(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C18753i1.m86358v(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0511:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.x2 r4 = r8.mo54479v(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.mo54956K(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0525:
            r8.mo54467m0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x052d:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r4 = r20.mo54976d()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88377X(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x053d:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo55009t()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88403l0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x054d:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo54970a()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88409o0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x055d:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo54998o()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88403l0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x056d:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo55004r()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88409o0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x057d:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo54954I()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88409o0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x058d:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r4 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88397i0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x059d:
            long r1 = m85656W(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r4 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.C18923z3.m88393g0(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo54471p0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x05ad:
            r13 = r1
        L_0x05ae:
            boolean r1 = r9.mo55468m(r13, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f47827k
        L_0x05b6:
            int r1 = r8.f47828l
            if (r0 >= r1) goto L_0x05c5
            int[] r1 = r8.f47826j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo54472q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b6
        L_0x05c5:
            if (r13 == 0) goto L_0x05ca
            r9.mo55470o(r10, r13)
        L_0x05ca:
            return
        L_0x05cb:
            boolean r1 = r9.mo55472q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x05ee
            boolean r1 = r20.mo54950E()     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f47827k
        L_0x05d9:
            int r1 = r8.f47828l
            if (r0 >= r1) goto L_0x05e8
            int[] r1 = r8.f47826j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo54472q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05d9
        L_0x05e8:
            if (r13 == 0) goto L_0x05ed
            r9.mo55470o(r10, r13)
        L_0x05ed:
            return
        L_0x05ee:
            if (r13 != 0) goto L_0x05f5
            java.lang.Object r1 = r9.mo55461f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x05f5:
            boolean r1 = r9.mo55468m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f47827k
        L_0x05fd:
            int r1 = r8.f47828l
            if (r0 >= r1) goto L_0x060c
            int[] r1 = r8.f47826j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo54472q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fd
        L_0x060c:
            if (r13 == 0) goto L_0x0611
            r9.mo55470o(r10, r13)
        L_0x0611:
            return
        L_0x0612:
            r0 = move-exception
            int r1 = r8.f47827k
        L_0x0615:
            int r2 = r8.f47828l
            if (r1 >= r2) goto L_0x0624
            int[] r2 = r8.f47826j
            r2 = r2[r1]
            java.lang.Object r13 = r8.mo54472q(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0615
        L_0x0624:
            if (r13 == 0) goto L_0x0629
            r9.mo55470o(r10, r13)
        L_0x0629:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54439N(androidx.datastore.preferences.protobuf.v3, androidx.datastore.preferences.protobuf.q0, java.lang.Object, androidx.datastore.preferences.protobuf.w2, androidx.datastore.preferences.protobuf.p0):void");
    }

    /* renamed from: O */
    public final <K, V> void mo54440O(Object obj, int i, Object obj2, C18836p0 p0Var, C18899w2 w2Var) throws IOException {
        long W = m85656W(mo54478u0(i));
        Object O = C18923z3.m88368O(obj, W);
        if (O == null) {
            O = this.f47833q.mo55449d(obj2);
            C18923z3.m88413q0(obj, W, O);
        } else if (this.f47833q.mo55453h(O)) {
            Object d = this.f47833q.mo55449d(obj2);
            this.f47833q.mo55446a(d, O);
            C18923z3.m88413q0(obj, W, d);
            O = d;
        }
        w2Var.mo54963R(this.f47833q.mo55448c(O), this.f47833q.mo55447b(obj2), p0Var);
    }

    /* renamed from: P */
    public final void mo54441P(T t, T t2, int i) {
        long W = m85656W(mo54478u0(i));
        if (mo54433D(t2, i)) {
            Object O = C18923z3.m88368O(t, W);
            Object O2 = C18923z3.m88368O(t2, W);
            if (O != null && O2 != null) {
                C18923z3.m88413q0(t, W, C18753i1.m86358v(O, O2));
                mo54471p0(t, i);
            } else if (O2 != null) {
                C18923z3.m88413q0(t, W, O2);
                mo54471p0(t, i);
            }
        }
    }

    /* renamed from: Q */
    public final void mo54442Q(T t, T t2, int i) {
        int u0 = mo54478u0(i);
        int V = mo54444V(i);
        long W = m85656W(u0);
        if (mo54438J(t2, V, i)) {
            Object O = C18923z3.m88368O(t, W);
            Object O2 = C18923z3.m88368O(t2, W);
            if (O != null && O2 != null) {
                C18923z3.m88413q0(t, W, C18753i1.m86358v(O, O2));
                mo54473q0(t, V, i);
            } else if (O2 != null) {
                C18923z3.m88413q0(t, W, O2);
                mo54473q0(t, V, i);
            }
        }
    }

    /* renamed from: R */
    public final void mo54443R(T t, T t2, int i) {
        int u0 = mo54478u0(i);
        long W = m85656W(u0);
        int V = mo54444V(i);
        switch (m85667t0(u0)) {
            case 0:
                if (mo54433D(t2, i)) {
                    C18923z3.m88393g0(t, W, C18923z3.m88357D(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 1:
                if (mo54433D(t2, i)) {
                    C18923z3.m88397i0(t, W, C18923z3.m88359F(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 2:
                if (mo54433D(t2, i)) {
                    C18923z3.m88409o0(t, W, C18923z3.m88365L(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 3:
                if (mo54433D(t2, i)) {
                    C18923z3.m88409o0(t, W, C18923z3.m88365L(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 4:
                if (mo54433D(t2, i)) {
                    C18923z3.m88403l0(t, W, C18923z3.m88362I(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 5:
                if (mo54433D(t2, i)) {
                    C18923z3.m88409o0(t, W, C18923z3.m88365L(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 6:
                if (mo54433D(t2, i)) {
                    C18923z3.m88403l0(t, W, C18923z3.m88362I(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 7:
                if (mo54433D(t2, i)) {
                    C18923z3.m88377X(t, W, C18923z3.m88420u(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 8:
                if (mo54433D(t2, i)) {
                    C18923z3.m88413q0(t, W, C18923z3.m88368O(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 9:
                mo54441P(t, t2, i);
                return;
            case 10:
                if (mo54433D(t2, i)) {
                    C18923z3.m88413q0(t, W, C18923z3.m88368O(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 11:
                if (mo54433D(t2, i)) {
                    C18923z3.m88403l0(t, W, C18923z3.m88362I(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 12:
                if (mo54433D(t2, i)) {
                    C18923z3.m88403l0(t, W, C18923z3.m88362I(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 13:
                if (mo54433D(t2, i)) {
                    C18923z3.m88403l0(t, W, C18923z3.m88362I(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 14:
                if (mo54433D(t2, i)) {
                    C18923z3.m88409o0(t, W, C18923z3.m88365L(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 15:
                if (mo54433D(t2, i)) {
                    C18923z3.m88403l0(t, W, C18923z3.m88362I(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 16:
                if (mo54433D(t2, i)) {
                    C18923z3.m88409o0(t, W, C18923z3.m88365L(t2, W));
                    mo54471p0(t, i);
                    return;
                }
                return;
            case 17:
                mo54441P(t, t2, i);
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
                this.f47830n.mo55210d(t, t2, W);
                return;
            case 50:
                C18922z2.m88284I(this.f47833q, t, t2, W);
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
                if (mo54438J(t2, V, i)) {
                    C18923z3.m88413q0(t, W, C18923z3.m88368O(t2, W));
                    mo54473q0(t, V, i);
                    return;
                }
                return;
            case 60:
                mo54442Q(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (mo54438J(t2, V, i)) {
                    C18923z3.m88413q0(t, W, C18923z3.m88368O(t2, W));
                    mo54473q0(t, V, i);
                    return;
                }
                return;
            case 68:
                mo54442Q(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: V */
    public final int mo54444V(int i) {
        return this.f47817a[i];
    }

    /* renamed from: a */
    public void mo54445a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f47817a.length; i += 3) {
            mo54443R(t, t2, i);
        }
        if (!this.f47824h) {
            C18922z2.m88285J(this.f47831o, t, t2);
            if (this.f47822f) {
                C18922z2.m88283H(this.f47832p, t, t2);
            }
        }
    }

    /* renamed from: b */
    public void mo54446b(T t) {
        int i;
        int i2 = this.f47827k;
        while (true) {
            i = this.f47828l;
            if (i2 >= i) {
                break;
            }
            long W = m85656W(mo54478u0(this.f47826j[i2]));
            Object O = C18923z3.m88368O(t, W);
            if (O != null) {
                C18923z3.m88413q0(t, W, this.f47833q.mo55451f(O));
            }
            i2++;
        }
        int length = this.f47826j.length;
        while (i < length) {
            this.f47830n.mo55209c(t, (long) this.f47826j[i]);
            i++;
        }
        this.f47831o.mo55465j(t);
        if (this.f47822f) {
            this.f47832p.mo55347f(t);
        }
    }

    /* renamed from: c */
    public final boolean mo54447c(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f47827k; i4++) {
            int i5 = this.f47826j[i4];
            int V = mo54444V(i5);
            int u0 = mo54478u0(i5);
            if (!this.f47824h) {
                int i6 = this.f47817a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = f47816z.getInt(t, (long) i7);
                    i2 = i7;
                }
            } else {
                i = 0;
            }
            if (m85650K(u0) && !mo54434E(t, i5, i3, i)) {
                return false;
            }
            int t0 = m85667t0(u0);
            if (t0 != 9 && t0 != 17) {
                if (t0 != 27) {
                    if (t0 == 60 || t0 == 68) {
                        if (mo54438J(t, V, i5) && !m85649F(t, u0, mo54479v(i5))) {
                            return false;
                        }
                    } else if (t0 != 49) {
                        if (t0 == 50 && !mo54436H(t, u0, i5)) {
                            return false;
                        }
                    }
                }
                if (!mo54435G(t, u0, i5)) {
                    return false;
                }
            } else if (mo54434E(t, i5, i3, i) && !m85649F(t, u0, mo54479v(i5))) {
                return false;
            }
        }
        if (!this.f47822f || this.f47832p.mo55344c(t).mo55610E()) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public final <K, V> int mo54448c0(T t, byte[] bArr, int i, int i2, int i3, long j, C18793l.C18795b bVar) throws IOException {
        T t2 = t;
        long j2 = j;
        Unsafe unsafe = f47816z;
        int i4 = i3;
        Object u = mo54477u(i3);
        Object object = unsafe.getObject(t, j2);
        if (this.f47833q.mo55453h(object)) {
            Object d = this.f47833q.mo55449d(u);
            this.f47833q.mo55446a(d, object);
            unsafe.putObject(t, j2, d);
            object = d;
        }
        return mo54466m(bArr, i, i2, this.f47833q.mo55447b(u), this.f47833q.mo55448c(object), bVar);
    }

    /* renamed from: d */
    public int mo54449d(T t) {
        return this.f47824h ? mo54486z(t) : mo54484y(t);
    }

    /* renamed from: d0 */
    public final int mo54450d0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C18793l.C18795b bVar) throws IOException {
        boolean z;
        Object obj;
        Object obj2;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C18793l.C18795b bVar2 = bVar;
        Unsafe unsafe = f47816z;
        long j3 = (long) (this.f47817a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(C18793l.m86505d(bArr, i)));
                    int i14 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(C18793l.m86513l(bArr, i)));
                    int i15 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int L = C18793l.m86499L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(bVar2.f47907b));
                    unsafe.putInt(t2, j3, i11);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int I = C18793l.m86496I(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(bVar2.f47906a));
                    unsafe.putInt(t2, j3, i11);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C18793l.m86511j(bArr, i)));
                    int i16 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C18793l.m86509h(bArr, i)));
                    int i17 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int L2 = C18793l.m86499L(bArr2, i9, bVar2);
                    if (bVar2.f47907b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(t2, j2, Boolean.valueOf(z));
                    unsafe.putInt(t2, j3, i11);
                    return L2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int I2 = C18793l.m86496I(bArr2, i9, bVar2);
                    int i18 = bVar2.f47906a;
                    if (i18 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || Utf8.m85210u(bArr2, I2, I2 + i18)) {
                        unsafe.putObject(t2, j2, new String(bArr2, I2, i18, C18753i1.f47860a));
                        I2 += i18;
                    } else {
                        throw InvalidProtocolBufferException.m85087d();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return I2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int p = C18793l.m86517p(mo54479v(i13), bArr2, i9, i2, bVar2);
                    if (unsafe.getInt(t2, j3) == i11) {
                        obj = unsafe.getObject(t2, j2);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        unsafe.putObject(t2, j2, bVar2.f47908c);
                    } else {
                        unsafe.putObject(t2, j2, C18753i1.m86358v(obj, bVar2.f47908c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return p;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int b = C18793l.m86503b(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, bVar2.f47908c);
                    unsafe.putInt(t2, j3, i11);
                    return b;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int I3 = C18793l.m86496I(bArr2, i9, bVar2);
                    int i19 = bVar2.f47906a;
                    C18753i1.C18758e t3 = mo54476t(i13);
                    if (t3 == null || t3.mo53933a(i19)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i19));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m85668w(t).mo55571r(i10, Long.valueOf((long) i19));
                    }
                    return I3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int I4 = C18793l.m86496I(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C18889w.m87620b(bVar2.f47906a)));
                    unsafe.putInt(t2, j3, i11);
                    return I4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int L3 = C18793l.m86499L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C18889w.m87621c(bVar2.f47907b)));
                    unsafe.putInt(t2, j3, i11);
                    return L3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int n = C18793l.m86515n(mo54479v(i13), bArr, i, i2, (i10 & -8) | 4, bVar);
                    if (unsafe.getInt(t2, j3) == i11) {
                        obj2 = unsafe.getObject(t2, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(t2, j2, bVar2.f47908c);
                    } else {
                        unsafe.putObject(t2, j2, C18753i1.m86358v(obj2, bVar2.f47908c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return n;
                }
                break;
        }
        return i9;
    }

    /* renamed from: e */
    public T mo54451e() {
        return this.f47829m.mo54860a(this.f47821e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0359, code lost:
        if (r0 != r15) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03a2, code lost:
        if (r0 != r15) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03c5, code lost:
        if (r0 != r15) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03c8, code lost:
        r2 = r0;
        r8 = r18;
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fc, code lost:
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0162, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0205, code lost:
        r6 = r6 | r20;
        r2 = r8;
        r3 = r13;
        r1 = r17;
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x022f, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0269, code lost:
        r6 = r6 | r20;
        r2 = r8;
        r0 = r11;
        r3 = r13;
        r1 = r17;
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0272, code lost:
        r11 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a8, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02aa, code lost:
        r6 = r6 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ac, code lost:
        r11 = r35;
        r2 = r8;
        r3 = r13;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b4, code lost:
        r0 = r35;
        r22 = r6;
        r19 = r7;
        r20 = r8;
        r28 = r10;
        r2 = r11;
        r8 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03fe  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo54452e0(T r31, byte[] r32, int r33, int r34, int r35, androidx.datastore.preferences.protobuf.C18793l.C18795b r36) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f47816z
            r16 = 0
            r0 = r33
            r2 = r16
            r3 = r2
            r6 = r3
            r1 = -1
            r7 = -1
        L_0x0018:
            if (r0 >= r13) goto L_0x0421
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86495H(r0, r12, r3, r9)
            int r3 = r9.f47906a
            r4 = r0
            r5 = r3
            goto L_0x002b
        L_0x0029:
            r5 = r0
            r4 = r3
        L_0x002b:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0038
            int r2 = r2 / r8
            int r1 = r15.mo54460i0(r3, r2)
            goto L_0x003c
        L_0x0038:
            int r1 = r15.mo54458h0(r3)
        L_0x003c:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004f
            r17 = r3
            r2 = r4
            r8 = r5
            r22 = r6
            r19 = r7
            r28 = r10
            r0 = r11
            r20 = r16
            goto L_0x03cd
        L_0x004f:
            int[] r1 = r15.f47817a
            int r18 = r2 + 1
            r1 = r1[r18]
            int r8 = m85667t0(r1)
            long r11 = m85656W(r1)
            r18 = r5
            r5 = 17
            r19 = r1
            if (r8 > r5) goto L_0x02c2
            int[] r5 = r15.f47817a
            int r20 = r2 + 2
            r5 = r5[r20]
            int r20 = r5 >>> 20
            r1 = 1
            int r20 = r1 << r20
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r22
            if (r5 == r7) goto L_0x0087
            r13 = -1
            r17 = r2
            if (r7 == r13) goto L_0x0080
            long r1 = (long) r7
            r10.putInt(r14, r1, r6)
        L_0x0080:
            long r1 = (long) r5
            int r6 = r10.getInt(r14, r1)
            r7 = r5
            goto L_0x008a
        L_0x0087:
            r17 = r2
            r13 = -1
        L_0x008a:
            r1 = 5
            switch(r8) {
                case 0: goto L_0x0290;
                case 1: goto L_0x0276;
                case 2: goto L_0x024d;
                case 3: goto L_0x024d;
                case 4: goto L_0x0232;
                case 5: goto L_0x020e;
                case 6: goto L_0x01eb;
                case 7: goto L_0x01c6;
                case 8: goto L_0x019f;
                case 9: goto L_0x0167;
                case 10: goto L_0x014b;
                case 11: goto L_0x0232;
                case 12: goto L_0x011a;
                case 13: goto L_0x01eb;
                case 14: goto L_0x020e;
                case 15: goto L_0x0100;
                case 16: goto L_0x00df;
                case 17: goto L_0x009d;
                default: goto L_0x008e;
            }
        L_0x008e:
            r12 = r32
            r11 = r4
            r8 = r17
            r17 = r3
            r29 = r18
            r18 = r13
            r13 = r29
            goto L_0x02b4
        L_0x009d:
            r2 = 3
            if (r0 != r2) goto L_0x00d8
            int r0 = r3 << 3
            r5 = r0 | 4
            r2 = r17
            androidx.datastore.preferences.protobuf.x2 r0 = r15.mo54479v(r2)
            r1 = r32
            r8 = r2
            r2 = r4
            r17 = r3
            r3 = r34
            r4 = r5
            r13 = r18
            r5 = r36
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86515n(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x00c5
            java.lang.Object r1 = r9.f47908c
            r10.putObject(r14, r11, r1)
            goto L_0x00d2
        L_0x00c5:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f47908c
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C18753i1.m86358v(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x00d2:
            r6 = r6 | r20
            r12 = r32
            goto L_0x02ac
        L_0x00d8:
            r8 = r17
            r13 = r18
            r17 = r3
            goto L_0x00fc
        L_0x00df:
            r8 = r17
            r13 = r18
            r17 = r3
            if (r0 != 0) goto L_0x00fc
            r2 = r11
            r12 = r32
            int r11 = androidx.datastore.preferences.protobuf.C18793l.m86499L(r12, r4, r9)
            long r0 = r9.f47907b
            long r4 = androidx.datastore.preferences.protobuf.C18889w.m87621c(r0)
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
            goto L_0x0269
        L_0x00fc:
            r12 = r32
            goto L_0x0162
        L_0x0100:
            r8 = r17
            r13 = r18
            r17 = r3
            r2 = r11
            r12 = r32
            if (r0 != 0) goto L_0x0162
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r12, r4, r9)
            int r1 = r9.f47906a
            int r1 = androidx.datastore.preferences.protobuf.C18889w.m87620b(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x02aa
        L_0x011a:
            r8 = r17
            r13 = r18
            r17 = r3
            r2 = r11
            r12 = r32
            if (r0 != 0) goto L_0x0162
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r12, r4, r9)
            int r1 = r9.f47906a
            androidx.datastore.preferences.protobuf.i1$e r4 = r15.mo54476t(r8)
            if (r4 == 0) goto L_0x0146
            boolean r4 = r4.mo53933a(r1)
            if (r4 == 0) goto L_0x0138
            goto L_0x0146
        L_0x0138:
            androidx.datastore.preferences.protobuf.w3 r2 = m85668w(r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo55571r(r13, r1)
            goto L_0x02ac
        L_0x0146:
            r10.putInt(r14, r2, r1)
            goto L_0x02aa
        L_0x014b:
            r8 = r17
            r13 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r32
            if (r0 != r1) goto L_0x0162
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86503b(r12, r4, r9)
            java.lang.Object r1 = r9.f47908c
            r10.putObject(r14, r2, r1)
            goto L_0x02aa
        L_0x0162:
            r11 = r4
            r18 = -1
            goto L_0x02b4
        L_0x0167:
            r8 = r17
            r13 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r32
            if (r0 != r1) goto L_0x0199
            androidx.datastore.preferences.protobuf.x2 r0 = r15.mo54479v(r8)
            r11 = r34
            r18 = -1
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86517p(r0, r12, r4, r11, r9)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x018a
            java.lang.Object r1 = r9.f47908c
            r10.putObject(r14, r2, r1)
            goto L_0x0205
        L_0x018a:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f47908c
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C18753i1.m86358v(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0205
        L_0x0199:
            r11 = r34
            r18 = -1
            goto L_0x022f
        L_0x019f:
            r8 = r17
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r34
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != r1) goto L_0x022f
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x01bc
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86490C(r12, r4, r9)
            goto L_0x01c0
        L_0x01bc:
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86493F(r12, r4, r9)
        L_0x01c0:
            java.lang.Object r1 = r9.f47908c
            r10.putObject(r14, r2, r1)
            goto L_0x0205
        L_0x01c6:
            r8 = r17
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r34
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != 0) goto L_0x022f
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86499L(r12, r4, r9)
            long r4 = r9.f47907b
            r23 = 0
            int r1 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r1 == 0) goto L_0x01e5
            r1 = 1
            goto L_0x01e7
        L_0x01e5:
            r1 = r16
        L_0x01e7:
            androidx.datastore.preferences.protobuf.C18923z3.m88377X(r14, r2, r1)
            goto L_0x0205
        L_0x01eb:
            r8 = r17
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r34
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != r1) goto L_0x022f
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86509h(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0205:
            r6 = r6 | r20
            r2 = r8
            r3 = r13
            r1 = r17
            r13 = r11
            goto L_0x0272
        L_0x020e:
            r8 = r17
            r1 = 1
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r34
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != r1) goto L_0x022f
            long r21 = androidx.datastore.preferences.protobuf.C18793l.m86511j(r12, r4)
            r0 = r10
            r1 = r31
            r11 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x02a8
        L_0x022f:
            r11 = r4
            goto L_0x02b4
        L_0x0232:
            r8 = r17
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r4
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != 0) goto L_0x02b4
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r12, r11, r9)
            int r1 = r9.f47906a
            r10.putInt(r14, r2, r1)
            goto L_0x02aa
        L_0x024d:
            r8 = r17
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r4
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != 0) goto L_0x02b4
            int r11 = androidx.datastore.preferences.protobuf.C18793l.m86499L(r12, r11, r9)
            long r4 = r9.f47907b
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
        L_0x0269:
            r6 = r6 | r20
            r2 = r8
            r0 = r11
            r3 = r13
            r1 = r17
            r13 = r34
        L_0x0272:
            r11 = r35
            goto L_0x0018
        L_0x0276:
            r8 = r17
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r4
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != r1) goto L_0x02b4
            float r0 = androidx.datastore.preferences.protobuf.C18793l.m86513l(r12, r11)
            androidx.datastore.preferences.protobuf.C18923z3.m88397i0(r14, r2, r0)
            int r0 = r11 + 4
            goto L_0x02aa
        L_0x0290:
            r8 = r17
            r1 = 1
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r4
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != r1) goto L_0x02b4
            double r0 = androidx.datastore.preferences.protobuf.C18793l.m86505d(r12, r11)
            androidx.datastore.preferences.protobuf.C18923z3.m88393g0(r14, r2, r0)
        L_0x02a8:
            int r0 = r11 + 8
        L_0x02aa:
            r6 = r6 | r20
        L_0x02ac:
            r11 = r35
            r2 = r8
            r3 = r13
            r1 = r17
            goto L_0x0311
        L_0x02b4:
            r0 = r35
            r22 = r6
            r19 = r7
            r20 = r8
            r28 = r10
            r2 = r11
            r8 = r13
            goto L_0x03cd
        L_0x02c2:
            r5 = r2
            r17 = r3
            r2 = r11
            r13 = r18
            r18 = -1
            r12 = r32
            r11 = r4
            r1 = 27
            if (r8 != r1) goto L_0x0322
            r1 = 2
            if (r0 != r1) goto L_0x0315
            java.lang.Object r0 = r10.getObject(r14, r2)
            androidx.datastore.preferences.protobuf.i1$k r0 = (androidx.datastore.preferences.protobuf.C18753i1.C18770k) r0
            boolean r1 = r0.mo54405T()
            if (r1 != 0) goto L_0x02f2
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02e9
            r1 = 10
            goto L_0x02eb
        L_0x02e9:
            int r1 = r1 * 2
        L_0x02eb:
            androidx.datastore.preferences.protobuf.i1$k r0 = r0.mo54630c(r1)
            r10.putObject(r14, r2, r0)
        L_0x02f2:
            r8 = r0
            androidx.datastore.preferences.protobuf.x2 r0 = r15.mo54479v(r5)
            r1 = r13
            r2 = r32
            r3 = r11
            r4 = r34
            r20 = r5
            r5 = r8
            r22 = r6
            r6 = r36
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86518q(r0, r1, r2, r3, r4, r5, r6)
            r11 = r35
            r3 = r13
            r1 = r17
            r2 = r20
            r6 = r22
        L_0x0311:
            r13 = r34
            goto L_0x0018
        L_0x0315:
            r20 = r5
            r22 = r6
            r19 = r7
            r28 = r10
            r15 = r11
            r18 = r13
            goto L_0x03a5
        L_0x0322:
            r20 = r5
            r22 = r6
            r1 = 49
            if (r8 > r1) goto L_0x0375
            r1 = r19
            long r5 = (long) r1
            r4 = r0
            r0 = r30
            r1 = r31
            r23 = r2
            r2 = r32
            r3 = r11
            r33 = r4
            r4 = r34
            r25 = r5
            r5 = r13
            r6 = r17
            r19 = r7
            r7 = r33
            r27 = r8
            r8 = r20
            r28 = r10
            r9 = r25
            r15 = r11
            r11 = r27
            r18 = r13
            r12 = r23
            r14 = r36
            int r0 = r0.mo54456g0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x03c8
        L_0x035b:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            r1 = r17
            r3 = r18
            r7 = r19
            r2 = r20
            r6 = r22
        L_0x0371:
            r10 = r28
            goto L_0x0018
        L_0x0375:
            r33 = r0
            r23 = r2
            r27 = r8
            r28 = r10
            r15 = r11
            r18 = r13
            r1 = r19
            r19 = r7
            r0 = 50
            r9 = r27
            if (r9 != r0) goto L_0x03ab
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x03a5
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r20
            r6 = r23
            r8 = r36
            int r0 = r0.mo54448c0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x03c8
            goto L_0x035b
        L_0x03a5:
            r0 = r35
            r2 = r15
            r8 = r18
            goto L_0x03cd
        L_0x03ab:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r17
            r10 = r23
            r12 = r20
            r13 = r36
            int r0 = r0.mo54450d0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03c8
            goto L_0x035b
        L_0x03c8:
            r2 = r0
            r8 = r18
            r0 = r35
        L_0x03cd:
            if (r8 != r0) goto L_0x03db
            if (r0 == 0) goto L_0x03db
            r9 = r30
            r10 = r0
            r0 = r2
            r3 = r8
            r7 = r19
            r6 = r22
            goto L_0x0429
        L_0x03db:
            r9 = r30
            r10 = r0
            boolean r0 = r9.f47822f
            r11 = r36
            if (r0 == 0) goto L_0x03fe
            androidx.datastore.preferences.protobuf.p0 r0 = r11.f47909d
            androidx.datastore.preferences.protobuf.p0 r1 = androidx.datastore.preferences.protobuf.C18836p0.m87223d()
            if (r0 == r1) goto L_0x03fe
            androidx.datastore.preferences.protobuf.z1 r5 = r9.f47821e
            androidx.datastore.preferences.protobuf.v3<?, ?> r6 = r9.f47831o
            r0 = r8
            r1 = r32
            r3 = r34
            r4 = r31
            r7 = r36
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86508g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x040d
        L_0x03fe:
            androidx.datastore.preferences.protobuf.w3 r4 = m85668w(r31)
            r0 = r8
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86494G(r0, r1, r2, r3, r4, r5)
        L_0x040d:
            r14 = r31
            r12 = r32
            r13 = r34
            r3 = r8
            r15 = r9
            r9 = r11
            r1 = r17
            r7 = r19
            r2 = r20
            r6 = r22
            r11 = r10
            goto L_0x0371
        L_0x0421:
            r22 = r6
            r19 = r7
            r28 = r10
            r10 = r11
            r9 = r15
        L_0x0429:
            r1 = -1
            if (r7 == r1) goto L_0x0435
            long r1 = (long) r7
            r4 = r31
            r5 = r28
            r5.putInt(r4, r1, r6)
            goto L_0x0437
        L_0x0435:
            r4 = r31
        L_0x0437:
            int r1 = r9.f47827k
            r2 = 0
        L_0x043a:
            int r5 = r9.f47828l
            if (r1 >= r5) goto L_0x044d
            int[] r5 = r9.f47826j
            r5 = r5[r1]
            androidx.datastore.preferences.protobuf.v3<?, ?> r6 = r9.f47831o
            java.lang.Object r2 = r9.mo54472q(r4, r5, r2, r6)
            androidx.datastore.preferences.protobuf.w3 r2 = (androidx.datastore.preferences.protobuf.C18900w3) r2
            int r1 = r1 + 1
            goto L_0x043a
        L_0x044d:
            if (r2 == 0) goto L_0x0454
            androidx.datastore.preferences.protobuf.v3<?, ?> r1 = r9.f47831o
            r1.mo55470o(r4, r2)
        L_0x0454:
            if (r10 != 0) goto L_0x0460
            r1 = r34
            if (r0 != r1) goto L_0x045b
            goto L_0x0466
        L_0x045b:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85091h()
            throw r0
        L_0x0460:
            r1 = r34
            if (r0 > r1) goto L_0x0467
            if (r3 != r10) goto L_0x0467
        L_0x0466:
            return r0
        L_0x0467:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85091h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54452e0(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.l$b):int");
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
    public int mo54453f(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f47817a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.mo54478u0(r1)
            int r4 = r8.mo54444V(r1)
            long r5 = m85656W(r3)
            int r3 = m85667t0(r3)
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
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m85661b0(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m85660a0(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m85661b0(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m85660a0(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m85660a0(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m85660a0(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = m85657X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86347k(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m85660a0(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m85661b0(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m85660a0(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m85661b0(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m85661b0(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = m85659Z(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.mo54438J(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = m85658Y(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.C18923z3.m88365L(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C18923z3.m88362I(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.C18923z3.m88365L(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C18923z3.m88362I(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C18923z3.m88362I(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C18923z3.m88362I(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = androidx.datastore.preferences.protobuf.C18923z3.m88420u(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86347k(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C18923z3.m88362I(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.C18923z3.m88365L(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C18923z3.m88362I(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.C18923z3.m88365L(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.C18923z3.m88365L(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = androidx.datastore.preferences.protobuf.C18923z3.m88359F(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = androidx.datastore.preferences.protobuf.C18923z3.m88357D(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.C18753i1.m86355s(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.v3<?, ?> r0 = r8.f47831o
            java.lang.Object r0 = r0.mo55462g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f47822f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.q0<?> r0 = r8.f47832p
            androidx.datastore.preferences.protobuf.y0 r9 = r0.mo55344c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54453f(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0155, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0157, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01de, code lost:
        if (r0 != r15) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x020c, code lost:
        if (r0 != r15) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022b, code lost:
        if (r0 != r15) goto L_0x023f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo54454f0(T r28, byte[] r29, int r30, int r31, androidx.datastore.preferences.protobuf.C18793l.C18795b r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            sun.misc.Unsafe r9 = f47816z
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = r10
            r2 = r16
        L_0x0014:
            if (r0 >= r13) goto L_0x0253
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0026
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86495H(r0, r12, r3, r11)
            int r3 = r11.f47906a
            r8 = r0
            r17 = r3
            goto L_0x0029
        L_0x0026:
            r17 = r0
            r8 = r3
        L_0x0029:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0036
            int r2 = r2 / 3
            int r0 = r15.mo54460i0(r7, r2)
            goto L_0x003a
        L_0x0036:
            int r0 = r15.mo54458h0(r7)
        L_0x003a:
            r4 = r0
            if (r4 != r10) goto L_0x0048
            r24 = r7
            r2 = r8
            r18 = r9
            r26 = r10
            r19 = r16
            goto L_0x022f
        L_0x0048:
            int[] r0 = r15.f47817a
            int r1 = r4 + 1
            r5 = r0[r1]
            int r3 = m85667t0(r5)
            long r1 = m85656W(r5)
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0164
            r0 = 1
            switch(r3) {
                case 0: goto L_0x014a;
                case 1: goto L_0x013b;
                case 2: goto L_0x0129;
                case 3: goto L_0x0129;
                case 4: goto L_0x011b;
                case 5: goto L_0x010b;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00e3;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00ab;
                case 10: goto L_0x009e;
                case 11: goto L_0x011b;
                case 12: goto L_0x008f;
                case 13: goto L_0x00fa;
                case 14: goto L_0x010b;
                case 15: goto L_0x007c;
                case 16: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x01a0
        L_0x0061:
            if (r6 != 0) goto L_0x01a0
            int r6 = androidx.datastore.preferences.protobuf.C18793l.m86499L(r12, r8, r11)
            r19 = r1
            long r0 = r11.f47907b
            long r21 = androidx.datastore.preferences.protobuf.C18889w.m87621c(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x0139
        L_0x007c:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015c
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r12, r8, r11)
            int r1 = r11.f47906a
            int r1 = androidx.datastore.preferences.protobuf.C18889w.m87620b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x0157
        L_0x008f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015c
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r12, r8, r11)
            int r1 = r11.f47906a
            r9.putInt(r14, r2, r1)
            goto L_0x0157
        L_0x009e:
            r2 = r1
            if (r6 != r10) goto L_0x01a0
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86503b(r12, r8, r11)
            java.lang.Object r1 = r11.f47908c
            r9.putObject(r14, r2, r1)
            goto L_0x0107
        L_0x00ab:
            r2 = r1
            if (r6 != r10) goto L_0x01a0
            androidx.datastore.preferences.protobuf.x2 r0 = r15.mo54479v(r4)
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86517p(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c2
            java.lang.Object r1 = r11.f47908c
            r9.putObject(r14, r2, r1)
            goto L_0x0107
        L_0x00c2:
            java.lang.Object r5 = r11.f47908c
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C18753i1.m86358v(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x0107
        L_0x00cc:
            r2 = r1
            if (r6 != r10) goto L_0x01a0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00d9
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86490C(r12, r8, r11)
            goto L_0x00dd
        L_0x00d9:
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86493F(r12, r8, r11)
        L_0x00dd:
            java.lang.Object r1 = r11.f47908c
            r9.putObject(r14, r2, r1)
            goto L_0x0107
        L_0x00e3:
            r2 = r1
            if (r6 != 0) goto L_0x01a0
            int r1 = androidx.datastore.preferences.protobuf.C18793l.m86499L(r12, r8, r11)
            long r5 = r11.f47907b
            r19 = 0
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r0 = r16
        L_0x00f5:
            androidx.datastore.preferences.protobuf.C18923z3.m88377X(r14, r2, r0)
            r0 = r1
            goto L_0x0107
        L_0x00fa:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01a0
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86509h(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x0107:
            r2 = r4
            r1 = r7
            goto L_0x0159
        L_0x010b:
            r2 = r1
            if (r6 != r0) goto L_0x01a0
            long r5 = androidx.datastore.preferences.protobuf.C18793l.m86511j(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0155
        L_0x011b:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015c
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r12, r8, r11)
            int r1 = r11.f47906a
            r9.putInt(r14, r2, r1)
            goto L_0x0157
        L_0x0129:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015c
            int r6 = androidx.datastore.preferences.protobuf.C18793l.m86499L(r12, r8, r11)
            long r4 = r11.f47907b
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x0139:
            r0 = r6
            goto L_0x0157
        L_0x013b:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x015c
            float r0 = androidx.datastore.preferences.protobuf.C18793l.m86513l(r12, r8)
            androidx.datastore.preferences.protobuf.C18923z3.m88397i0(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x0157
        L_0x014a:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x015c
            double r0 = androidx.datastore.preferences.protobuf.C18793l.m86505d(r12, r8)
            androidx.datastore.preferences.protobuf.C18923z3.m88393g0(r14, r2, r0)
        L_0x0155:
            int r0 = r8 + 8
        L_0x0157:
            r1 = r7
            r2 = r10
        L_0x0159:
            r10 = -1
            goto L_0x0014
        L_0x015c:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x01a7
        L_0x0164:
            r0 = 27
            if (r3 != r0) goto L_0x01ab
            if (r6 != r10) goto L_0x01a0
            java.lang.Object r0 = r9.getObject(r14, r1)
            androidx.datastore.preferences.protobuf.i1$k r0 = (androidx.datastore.preferences.protobuf.C18753i1.C18770k) r0
            boolean r3 = r0.mo54405T()
            if (r3 != 0) goto L_0x0188
            int r3 = r0.size()
            if (r3 != 0) goto L_0x017f
            r3 = 10
            goto L_0x0181
        L_0x017f:
            int r3 = r3 * 2
        L_0x0181:
            androidx.datastore.preferences.protobuf.i1$k r0 = r0.mo54630c(r3)
            r9.putObject(r14, r1, r0)
        L_0x0188:
            r5 = r0
            androidx.datastore.preferences.protobuf.x2 r0 = r15.mo54479v(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86518q(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0159
        L_0x01a0:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x01a7:
            r26 = -1
            goto L_0x020f
        L_0x01ab:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e2
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.mo54456g0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x022e
        L_0x01e0:
            goto L_0x023f
        L_0x01e2:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0211
            r7 = r30
            if (r7 != r10) goto L_0x020f
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.mo54448c0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x022e
            goto L_0x01e0
        L_0x020f:
            r2 = r15
            goto L_0x022f
        L_0x0211:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.mo54450d0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x022e
            goto L_0x01e0
        L_0x022e:
            r2 = r0
        L_0x022f:
            androidx.datastore.preferences.protobuf.w3 r4 = m85668w(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86494G(r0, r1, r2, r3, r4, r5)
        L_0x023f:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
            r10 = r26
            goto L_0x0014
        L_0x0253:
            r1 = r13
            if (r0 != r1) goto L_0x0257
            return r0
        L_0x0257:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85091h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54454f0(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.l$b):int");
    }

    /* renamed from: g */
    public boolean mo54455g(T t, T t2) {
        int length = this.f47817a.length;
        for (int i = 0; i < length; i += 3) {
            if (!mo54470p(t, t2, i)) {
                return false;
            }
        }
        if (!this.f47831o.mo55462g(t).equals(this.f47831o.mo55462g(t2))) {
            return false;
        }
        if (this.f47822f) {
            return this.f47832p.mo55344c(t).equals(this.f47832p.mo55344c(t2));
        }
        return true;
    }

    /* renamed from: g0 */
    public final int mo54456g0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C18793l.C18795b bVar) throws IOException {
        int i8;
        int i9;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i10 = i;
        int i11 = i5;
        int i12 = i6;
        long j3 = j2;
        C18793l.C18795b bVar2 = bVar;
        Unsafe unsafe = f47816z;
        C18753i1.C18770k kVar = (C18753i1.C18770k) unsafe.getObject(t, j3);
        if (!kVar.mo54405T()) {
            int size = kVar.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size * 2;
            }
            kVar = kVar.mo54630c(i9);
            unsafe.putObject(t, j3, kVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i11 == 2) {
                    return C18793l.m86520s(bArr, i10, kVar, bVar2);
                }
                if (i11 == 1) {
                    return C18793l.m86506e(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i11 == 2) {
                    return C18793l.m86523v(bArr, i10, kVar, bVar2);
                }
                if (i11 == 5) {
                    return C18793l.m86514m(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    return C18793l.m86527z(bArr, i10, kVar, bVar2);
                }
                if (i11 == 0) {
                    return C18793l.m86500M(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return C18793l.m86526y(bArr, i10, kVar, bVar2);
                }
                if (i11 == 0) {
                    return C18793l.m86497J(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    return C18793l.m86522u(bArr, i10, kVar, bVar2);
                }
                if (i11 == 1) {
                    return C18793l.m86512k(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    return C18793l.m86521t(bArr, i10, kVar, bVar2);
                }
                if (i11 == 5) {
                    return C18793l.m86510i(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i11 == 2) {
                    return C18793l.m86519r(bArr, i10, kVar, bVar2);
                }
                if (i11 == 0) {
                    return C18793l.m86502a(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 26:
                if (i11 == 2) {
                    if ((j & 536870912) == 0) {
                        return C18793l.m86491D(i3, bArr, i, i2, kVar, bVar);
                    }
                    return C18793l.m86492E(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 27:
                if (i11 == 2) {
                    return C18793l.m86518q(mo54479v(i12), i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 28:
                if (i11 == 2) {
                    return C18793l.m86504c(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i11 == 2) {
                    i8 = C18793l.m86526y(bArr, i10, kVar, bVar2);
                } else if (i11 == 0) {
                    i8 = C18793l.m86497J(i3, bArr, i, i2, kVar, bVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
                C18900w3 w3Var = generatedMessageLite.unknownFields;
                if (w3Var == C18900w3.m87953e()) {
                    w3Var = null;
                }
                C18900w3 w3Var2 = (C18900w3) C18922z2.m88274C(i4, kVar, mo54476t(i12), w3Var, this.f47831o);
                if (w3Var2 != null) {
                    generatedMessageLite.unknownFields = w3Var2;
                }
                return i8;
            case 33:
            case 47:
                if (i11 == 2) {
                    return C18793l.m86524w(bArr, i10, kVar, bVar2);
                }
                if (i11 == 0) {
                    return C18793l.m86488A(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i11 == 2) {
                    return C18793l.m86525x(bArr, i10, kVar, bVar2);
                }
                if (i11 == 0) {
                    return C18793l.m86489B(i3, bArr, i, i2, kVar, bVar);
                }
                break;
            case 49:
                if (i11 == 3) {
                    return C18793l.m86516o(mo54479v(i12), i3, bArr, i, i2, kVar, bVar);
                }
                break;
        }
        return i10;
    }

    /* renamed from: h */
    public void mo54457h(T t, C18899w2 w2Var, C18836p0 p0Var) throws IOException {
        p0Var.getClass();
        mo54439N(this.f47831o, this.f47832p, t, w2Var, p0Var);
    }

    /* renamed from: h0 */
    public final int mo54458h0(int i) {
        if (i < this.f47819c || i > this.f47820d) {
            return -1;
        }
        return mo54475r0(i, 0);
    }

    /* renamed from: i */
    public void mo54459i(T t, Writer writer) throws IOException {
        if (writer.mo54245u() == Writer.FieldOrder.DESCENDING) {
            mo54483x0(t, writer);
        } else if (this.f47824h) {
            mo54481w0(t, writer);
        } else {
            mo54480v0(t, writer);
        }
    }

    /* renamed from: i0 */
    public final int mo54460i0(int i, int i2) {
        if (i < this.f47819c || i > this.f47820d) {
            return -1;
        }
        return mo54475r0(i, i2);
    }

    /* renamed from: j */
    public void mo54461j(T t, byte[] bArr, int i, int i2, C18793l.C18795b bVar) throws IOException {
        if (this.f47824h) {
            mo54454f0(t, bArr, i, i2, bVar);
        } else {
            mo54452e0(t, bArr, i, i2, 0, bVar);
        }
    }

    /* renamed from: j0 */
    public final int mo54462j0(int i) {
        return this.f47817a[i + 2];
    }

    /* renamed from: k */
    public final boolean mo54463k(T t, T t2, int i) {
        return mo54433D(t, i) == mo54433D(t2, i);
    }

    /* renamed from: k0 */
    public final <E> void mo54464k0(Object obj, long j, C18899w2 w2Var, C18905x2<E> x2Var, C18836p0 p0Var) throws IOException {
        w2Var.mo54964S(this.f47830n.mo55211e(obj, j), x2Var, p0Var);
    }

    /* renamed from: l0 */
    public final <E> void mo54465l0(Object obj, int i, C18899w2 w2Var, C18905x2<E> x2Var, C18836p0 p0Var) throws IOException {
        w2Var.mo54957L(this.f47830n.mo55211e(obj, m85656W(i)), x2Var, p0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> int mo54466m(byte[] r15, int r16, int r17, androidx.datastore.preferences.protobuf.C18868t1.C18870b<K, V> r18, java.util.Map<K, V> r19, androidx.datastore.preferences.protobuf.C18793l.C18795b r20) throws java.io.IOException {
        /*
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r15, r0, r10)
            int r1 = r10.f47906a
            if (r1 < 0) goto L_0x0081
            int r2 = r8 - r0
            if (r1 > r2) goto L_0x0081
            int r11 = r0 + r1
            K r1 = r9.f48042b
            V r2 = r9.f48044d
            r12 = r1
            r13 = r2
        L_0x001d:
            if (r0 >= r11) goto L_0x0074
            int r1 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86495H(r0, r15, r1, r10)
            int r1 = r10.f47906a
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
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = r9.f48043c
            int r1 = r1.mo54202q()
            if (r3 != r1) goto L_0x006f
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f48043c
            V r0 = r9.f48044d
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.mo54468n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.f47908c
            goto L_0x001d
        L_0x0057:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = r9.f48041a
            int r1 = r1.mo54202q()
            if (r3 != r1) goto L_0x006f
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f48041a
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.mo54468n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.f47908c
            goto L_0x001d
        L_0x006f:
            int r0 = androidx.datastore.preferences.protobuf.C18793l.m86501N(r0, r15, r2, r8, r10)
            goto L_0x001d
        L_0x0074:
            if (r0 != r11) goto L_0x007c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L_0x007c:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85091h()
            throw r0
        L_0x0081:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85094l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54466m(byte[], int, int, androidx.datastore.preferences.protobuf.t1$b, java.util.Map, androidx.datastore.preferences.protobuf.l$b):int");
    }

    /* renamed from: m0 */
    public final void mo54467m0(Object obj, int i, C18899w2 w2Var) throws IOException {
        if (m85648C(i)) {
            C18923z3.m88413q0(obj, m85656W(i), w2Var.mo54955J());
        } else if (this.f47823g) {
            C18923z3.m88413q0(obj, m85656W(i), w2Var.mo55014y());
        } else {
            C18923z3.m88413q0(obj, m85656W(i), w2Var.mo54996n());
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
    public final int mo54468n(byte[] r2, int r3, int r4, androidx.datastore.preferences.protobuf.WireFormat.FieldType r5, java.lang.Class<?> r6, androidx.datastore.preferences.protobuf.C18793l.C18795b r7) throws java.io.IOException {
        /*
            r1 = this;
            int[] r0 = androidx.datastore.preferences.protobuf.C18700c2.C18701a.f47834a
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
            int r2 = androidx.datastore.preferences.protobuf.C18793l.m86493F(r2, r3, r7)
            goto L_0x00ae
        L_0x0019:
            int r2 = androidx.datastore.preferences.protobuf.C18793l.m86499L(r2, r3, r7)
            long r3 = r7.f47907b
            long r3 = androidx.datastore.preferences.protobuf.C18889w.m87621c(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f47908c = r3
            goto L_0x00ae
        L_0x002b:
            int r2 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r2, r3, r7)
            int r3 = r7.f47906a
            int r3 = androidx.datastore.preferences.protobuf.C18889w.m87620b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f47908c = r3
            goto L_0x00ae
        L_0x003d:
            androidx.datastore.preferences.protobuf.r2 r5 = androidx.datastore.preferences.protobuf.C18853r2.m87361a()
            androidx.datastore.preferences.protobuf.x2 r5 = r5.mo55373i(r6)
            int r2 = androidx.datastore.preferences.protobuf.C18793l.m86517p(r5, r2, r3, r4, r7)
            goto L_0x00ae
        L_0x004a:
            int r2 = androidx.datastore.preferences.protobuf.C18793l.m86499L(r2, r3, r7)
            long r3 = r7.f47907b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f47908c = r3
            goto L_0x00ae
        L_0x0057:
            int r2 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r2, r3, r7)
            int r3 = r7.f47906a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f47908c = r3
            goto L_0x00ae
        L_0x0064:
            float r2 = androidx.datastore.preferences.protobuf.C18793l.m86513l(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.f47908c = r2
            goto L_0x0084
        L_0x006f:
            long r4 = androidx.datastore.preferences.protobuf.C18793l.m86511j(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.f47908c = r2
            goto L_0x0091
        L_0x007a:
            int r2 = androidx.datastore.preferences.protobuf.C18793l.m86509h(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.f47908c = r2
        L_0x0084:
            int r2 = r3 + 4
            goto L_0x00ae
        L_0x0087:
            double r4 = androidx.datastore.preferences.protobuf.C18793l.m86505d(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.f47908c = r2
        L_0x0091:
            int r2 = r3 + 8
            goto L_0x00ae
        L_0x0094:
            int r2 = androidx.datastore.preferences.protobuf.C18793l.m86503b(r2, r3, r7)
            goto L_0x00ae
        L_0x0099:
            int r2 = androidx.datastore.preferences.protobuf.C18793l.m86499L(r2, r3, r7)
            long r3 = r7.f47907b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00a7
            r3 = 1
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.f47908c = r3
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54468n(byte[], int, int, androidx.datastore.preferences.protobuf.WireFormat$FieldType, java.lang.Class, androidx.datastore.preferences.protobuf.l$b):int");
    }

    /* renamed from: n0 */
    public final void mo54469n0(Object obj, int i, C18899w2 w2Var) throws IOException {
        if (m85648C(i)) {
            w2Var.mo54994m(this.f47830n.mo55211e(obj, m85656W(i)));
        } else {
            w2Var.mo54947A(this.f47830n.mo55211e(obj, m85656W(i)));
        }
    }

    /* renamed from: p */
    public final boolean mo54470p(T t, T t2, int i) {
        int u0 = mo54478u0(i);
        long W = m85656W(u0);
        switch (m85667t0(u0)) {
            case 0:
                if (!mo54463k(t, t2, i) || Double.doubleToLongBits(C18923z3.m88357D(t, W)) != Double.doubleToLongBits(C18923z3.m88357D(t2, W))) {
                    return false;
                }
                return true;
            case 1:
                if (!mo54463k(t, t2, i) || Float.floatToIntBits(C18923z3.m88359F(t, W)) != Float.floatToIntBits(C18923z3.m88359F(t2, W))) {
                    return false;
                }
                return true;
            case 2:
                if (!mo54463k(t, t2, i) || C18923z3.m88365L(t, W) != C18923z3.m88365L(t2, W)) {
                    return false;
                }
                return true;
            case 3:
                if (!mo54463k(t, t2, i) || C18923z3.m88365L(t, W) != C18923z3.m88365L(t2, W)) {
                    return false;
                }
                return true;
            case 4:
                if (!mo54463k(t, t2, i) || C18923z3.m88362I(t, W) != C18923z3.m88362I(t2, W)) {
                    return false;
                }
                return true;
            case 5:
                if (!mo54463k(t, t2, i) || C18923z3.m88365L(t, W) != C18923z3.m88365L(t2, W)) {
                    return false;
                }
                return true;
            case 6:
                if (!mo54463k(t, t2, i) || C18923z3.m88362I(t, W) != C18923z3.m88362I(t2, W)) {
                    return false;
                }
                return true;
            case 7:
                if (!mo54463k(t, t2, i) || C18923z3.m88420u(t, W) != C18923z3.m88420u(t2, W)) {
                    return false;
                }
                return true;
            case 8:
                if (!mo54463k(t, t2, i) || !C18922z2.m88289N(C18923z3.m88368O(t, W), C18923z3.m88368O(t2, W))) {
                    return false;
                }
                return true;
            case 9:
                if (!mo54463k(t, t2, i) || !C18922z2.m88289N(C18923z3.m88368O(t, W), C18923z3.m88368O(t2, W))) {
                    return false;
                }
                return true;
            case 10:
                if (!mo54463k(t, t2, i) || !C18922z2.m88289N(C18923z3.m88368O(t, W), C18923z3.m88368O(t2, W))) {
                    return false;
                }
                return true;
            case 11:
                if (!mo54463k(t, t2, i) || C18923z3.m88362I(t, W) != C18923z3.m88362I(t2, W)) {
                    return false;
                }
                return true;
            case 12:
                if (!mo54463k(t, t2, i) || C18923z3.m88362I(t, W) != C18923z3.m88362I(t2, W)) {
                    return false;
                }
                return true;
            case 13:
                if (!mo54463k(t, t2, i) || C18923z3.m88362I(t, W) != C18923z3.m88362I(t2, W)) {
                    return false;
                }
                return true;
            case 14:
                if (!mo54463k(t, t2, i) || C18923z3.m88365L(t, W) != C18923z3.m88365L(t2, W)) {
                    return false;
                }
                return true;
            case 15:
                if (!mo54463k(t, t2, i) || C18923z3.m88362I(t, W) != C18923z3.m88362I(t2, W)) {
                    return false;
                }
                return true;
            case 16:
                if (!mo54463k(t, t2, i) || C18923z3.m88365L(t, W) != C18923z3.m88365L(t2, W)) {
                    return false;
                }
                return true;
            case 17:
                if (!mo54463k(t, t2, i) || !C18922z2.m88289N(C18923z3.m88368O(t, W), C18923z3.m88368O(t2, W))) {
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
                return C18922z2.m88289N(C18923z3.m88368O(t, W), C18923z3.m88368O(t2, W));
            case 50:
                return C18922z2.m88289N(C18923z3.m88368O(t, W), C18923z3.m88368O(t2, W));
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
                if (!mo54437I(t, t2, i) || !C18922z2.m88289N(C18923z3.m88368O(t, W), C18923z3.m88368O(t2, W))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: p0 */
    public final void mo54471p0(T t, int i) {
        if (!this.f47824h) {
            int j0 = mo54462j0(i);
            long j = (long) (j0 & 1048575);
            C18923z3.m88403l0(t, j, C18923z3.m88362I(t, j) | (1 << (j0 >>> 20)));
        }
    }

    /* renamed from: q */
    public final <UT, UB> UB mo54472q(Object obj, int i, UB ub, C18888v3<UT, UB> v3Var) {
        C18753i1.C18758e t;
        int V = mo54444V(i);
        Object O = C18923z3.m88368O(obj, m85656W(mo54478u0(i)));
        if (O == null || (t = mo54476t(i)) == null) {
            return ub;
        }
        return mo54474r(i, V, this.f47833q.mo55448c(O), t, ub, v3Var);
    }

    /* renamed from: q0 */
    public final void mo54473q0(T t, int i, int i2) {
        C18923z3.m88403l0(t, (long) (mo54462j0(i2) & 1048575), i);
    }

    /* renamed from: r */
    public final <K, V, UT, UB> UB mo54474r(int i, int i2, Map<K, V> map, C18753i1.C18758e eVar, UB ub, C18888v3<UT, UB> v3Var) {
        C18868t1.C18870b<?, ?> b = this.f47833q.mo55447b(mo54477u(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.mo53933a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = v3Var.mo55469n();
                }
                ByteString.C18615g u0 = ByteString.m84393u0(C18868t1.m87467b(b, next.getKey(), next.getValue()));
                try {
                    C18868t1.m87471l(u0.mo53781b(), b, next.getKey(), next.getValue());
                    v3Var.mo55459d(ub, i2, u0.mo53780a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: r0 */
    public final int mo54475r0(int i, int i2) {
        int length = (this.f47817a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int V = mo54444V(i4);
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
    public final C18753i1.C18758e mo54476t(int i) {
        return (C18753i1.C18758e) this.f47818b[((i / 3) * 2) + 1];
    }

    /* renamed from: u */
    public final Object mo54477u(int i) {
        return this.f47818b[(i / 3) * 2];
    }

    /* renamed from: u0 */
    public final int mo54478u0(int i) {
        return this.f47817a[i + 1];
    }

    /* renamed from: v */
    public final C18905x2 mo54479v(int i) {
        int i2 = (i / 3) * 2;
        C18905x2 x2Var = (C18905x2) this.f47818b[i2];
        if (x2Var != null) {
            return x2Var;
        }
        C18905x2 i3 = C18853r2.m87361a().mo55373i((Class) this.f47818b[i2 + 1]);
        this.f47818b[i2] = i3;
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54480v0(T r18, androidx.datastore.preferences.protobuf.Writer r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f47822f
            if (r3 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.q0<?> r3 = r0.f47832p
            androidx.datastore.preferences.protobuf.y0 r3 = r3.mo55344c(r1)
            boolean r5 = r3.mo55608C()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo55611H()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f47817a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f47816z
            r9 = -1
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r6) goto L_0x049a
            int r12 = r0.mo54478u0(r10)
            int r13 = r0.mo54444V(r10)
            int r14 = m85667t0(r12)
            boolean r15 = r0.f47824h
            if (r15 != 0) goto L_0x005e
            r15 = 17
            if (r14 > r15) goto L_0x005e
            int[] r15 = r0.f47817a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r15 & r16
            r16 = r5
            if (r8 == r9) goto L_0x0056
            long r4 = (long) r8
            int r11 = r7.getInt(r1, r4)
            r9 = r8
        L_0x0056:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0063
        L_0x005e:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            androidx.datastore.preferences.protobuf.q0<?> r8 = r0.f47832p
            int r8 = r8.mo55342a(r5)
            if (r8 > r13) goto L_0x0081
            androidx.datastore.preferences.protobuf.q0<?> r8 = r0.f47832p
            r8.mo55351j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0063
        L_0x007f:
            r5 = 0
            goto L_0x0063
        L_0x0081:
            r15 = r5
            r8 = r6
            long r5 = m85656W(r12)
            switch(r14) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x039a;
                case 19: goto L_0x038a;
                case 20: goto L_0x037a;
                case 21: goto L_0x036a;
                case 22: goto L_0x035a;
                case 23: goto L_0x034a;
                case 24: goto L_0x033a;
                case 25: goto L_0x032a;
                case 26: goto L_0x031b;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02e9;
                case 30: goto L_0x02d9;
                case 31: goto L_0x02c9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x02a9;
                case 34: goto L_0x0299;
                case 35: goto L_0x0289;
                case 36: goto L_0x0279;
                case 37: goto L_0x0269;
                case 38: goto L_0x0259;
                case 39: goto L_0x0249;
                case 40: goto L_0x0239;
                case 41: goto L_0x0229;
                case 42: goto L_0x0219;
                case 43: goto L_0x0209;
                case 44: goto L_0x01f9;
                case 45: goto L_0x01e9;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01c9;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = 0
            goto L_0x0494
        L_0x008d:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.x2 r5 = r0.mo54479v(r10)
            r2.mo54223R(r13, r4, r5)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m85661b0(r1, r5)
            r2.mo54238n(r13, r4)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m85660a0(r1, r5)
            r2.mo54217L(r13, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m85661b0(r1, r5)
            r2.mo54234j(r13, r4)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m85660a0(r1, r5)
            r2.mo54250z(r13, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m85660a0(r1, r5)
            r2.mo54214I(r13, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m85660a0(r1, r5)
            r2.mo54240p(r13, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r2.mo54220O(r13, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.x2 r5 = r0.mo54479v(r10)
            r2.mo54221P(r13, r4, r5)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            r0.mo54487z0(r13, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            boolean r4 = m85657X(r1, r5)
            r2.mo54249y(r13, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m85660a0(r1, r5)
            r2.mo54227c(r13, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m85661b0(r1, r5)
            r2.mo54244t(r13, r4)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m85660a0(r1, r5)
            r2.mo54233i(r13, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m85661b0(r1, r5)
            r2.mo54231g(r13, r4)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m85661b0(r1, r5)
            r2.mo54248x(r13, r4)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            float r4 = m85659Z(r1, r5)
            r2.mo54211F(r13, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.mo54438J(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            double r4 = m85658Y(r1, r5)
            r2.mo54241q(r13, r4)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r7.getObject(r1, r5)
            r0.mo54485y0(r2, r13, r4, r10)
            goto L_0x008a
        L_0x01a6:
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.x2 r6 = r0.mo54479v(r10)
            androidx.datastore.preferences.protobuf.C18922z2.m88319i0(r4, r5, r2, r6)
            goto L_0x008a
        L_0x01b9:
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            androidx.datastore.preferences.protobuf.C18922z2.m88351y0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01c9:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88347w0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01d9:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88343u0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01e9:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88339s0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01f9:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88303a0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0209:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88277D0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0219:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88296U(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0229:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88307c0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0239:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88311e0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0249:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88323k0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0259:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88281F0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0269:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88327m0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0279:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88315g0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0289:
            r12 = 1
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88300Y(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0299:
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            androidx.datastore.preferences.protobuf.C18922z2.m88351y0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02a9:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88347w0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02b9:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88343u0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02c9:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88339s0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02d9:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88303a0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02e9:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88277D0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02f9:
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88298W(r4, r5, r2)
            goto L_0x008a
        L_0x0308:
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.x2 r6 = r0.mo54479v(r10)
            androidx.datastore.preferences.protobuf.C18922z2.m88335q0(r4, r5, r2, r6)
            goto L_0x008a
        L_0x031b:
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88273B0(r4, r5, r2)
            goto L_0x008a
        L_0x032a:
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            androidx.datastore.preferences.protobuf.C18922z2.m88296U(r4, r5, r2, r12)
            goto L_0x0494
        L_0x033a:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88307c0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x034a:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88311e0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x035a:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88323k0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x036a:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88281F0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x037a:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88327m0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x038a:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88315g0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x039a:
            r12 = 0
            int r4 = r0.mo54444V(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.C18922z2.m88300Y(r4, r5, r2, r12)
            goto L_0x0494
        L_0x03aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.x2 r5 = r0.mo54479v(r10)
            r2.mo54223R(r13, r4, r5)
            goto L_0x0494
        L_0x03bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.mo54238n(r13, r4)
            goto L_0x0494
        L_0x03c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.mo54217L(r13, r4)
            goto L_0x0494
        L_0x03d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.mo54234j(r13, r4)
            goto L_0x0494
        L_0x03e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.mo54250z(r13, r4)
            goto L_0x0494
        L_0x03ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.mo54214I(r13, r4)
            goto L_0x0494
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.mo54240p(r13, r4)
            goto L_0x0494
        L_0x0409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r2.mo54220O(r13, r4)
            goto L_0x0494
        L_0x0418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.x2 r5 = r0.mo54479v(r10)
            r2.mo54221P(r13, r4, r5)
            goto L_0x0494
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            r0.mo54487z0(r13, r4, r2)
            goto L_0x0494
        L_0x0435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            boolean r4 = m85662l(r1, r5)
            r2.mo54249y(r13, r4)
            goto L_0x0494
        L_0x0441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.mo54227c(r13, r4)
            goto L_0x0494
        L_0x044d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.mo54244t(r13, r4)
            goto L_0x0494
        L_0x0459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.mo54233i(r13, r4)
            goto L_0x0494
        L_0x0465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.mo54231g(r13, r4)
            goto L_0x0494
        L_0x0471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.mo54248x(r13, r4)
            goto L_0x0494
        L_0x047d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            float r4 = m85665s(r1, r5)
            r2.mo54211F(r13, r4)
            goto L_0x0494
        L_0x0489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            double r4 = m85663o(r1, r5)
            r2.mo54241q(r13, r4)
        L_0x0494:
            int r10 = r10 + 3
            r6 = r8
            r5 = r15
            goto L_0x002b
        L_0x049a:
            r16 = r5
        L_0x049c:
            if (r5 == 0) goto L_0x04b3
            androidx.datastore.preferences.protobuf.q0<?> r4 = r0.f47832p
            r4.mo55351j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x049c
        L_0x04b1:
            r5 = 0
            goto L_0x049c
        L_0x04b3:
            androidx.datastore.preferences.protobuf.v3<?, ?> r3 = r0.f47831o
            r0.mo54432A0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54480v0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54481w0(T r13, androidx.datastore.preferences.protobuf.Writer r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f47822f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            androidx.datastore.preferences.protobuf.q0<?> r0 = r12.f47832p
            androidx.datastore.preferences.protobuf.y0 r0 = r0.mo55344c(r13)
            boolean r2 = r0.mo55608C()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo55611H()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f47817a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.mo54478u0(r5)
            int r7 = r12.mo54444V(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            androidx.datastore.preferences.protobuf.q0<?> r8 = r12.f47832p
            int r8 = r8.mo55342a(r2)
            if (r8 > r7) goto L_0x004b
            androidx.datastore.preferences.protobuf.q0<?> r8 = r12.f47832p
            r8.mo55351j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m85667t0(r6)
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
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            androidx.datastore.preferences.protobuf.x2 r8 = r12.mo54479v(r5)
            r14.mo54223R(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            long r8 = m85661b0(r13, r8)
            r14.mo54238n(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85660a0(r13, r8)
            r14.mo54217L(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            long r8 = m85661b0(r13, r8)
            r14.mo54234j(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85660a0(r13, r8)
            r14.mo54250z(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85660a0(r13, r8)
            r14.mo54214I(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85660a0(r13, r8)
            r14.mo54240p(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            r14.mo54220O(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            androidx.datastore.preferences.protobuf.x2 r8 = r12.mo54479v(r5)
            r14.mo54221P(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            r12.mo54487z0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            boolean r6 = m85657X(r13, r8)
            r14.mo54249y(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85660a0(r13, r8)
            r14.mo54227c(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            long r8 = m85661b0(r13, r8)
            r14.mo54244t(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85660a0(r13, r8)
            r14.mo54233i(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            long r8 = m85661b0(r13, r8)
            r14.mo54231g(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            long r8 = m85661b0(r13, r8)
            r14.mo54248x(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            float r6 = m85659Z(r13, r8)
            r14.mo54211F(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.mo54438J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            double r8 = m85658Y(r13, r8)
            r14.mo54241q(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            r12.mo54485y0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.x2 r8 = r12.mo54479v(r5)
            androidx.datastore.preferences.protobuf.C18922z2.m88319i0(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88351y0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88347w0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88343u0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88339s0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88303a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88277D0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88296U(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88307c0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88311e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88323k0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88281F0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88327m0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88315g0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.mo54444V(r5)
            long r10 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88300Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88351y0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88347w0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88343u0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88339s0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88303a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88277D0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88298W(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.x2 r8 = r12.mo54479v(r5)
            androidx.datastore.preferences.protobuf.C18922z2.m88335q0(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88273B0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88296U(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88307c0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88311e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88323k0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88281F0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88327m0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88315g0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.mo54444V(r5)
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.C18922z2.m88300Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            androidx.datastore.preferences.protobuf.x2 r8 = r12.mo54479v(r5)
            r14.mo54223R(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            long r8 = m85652M(r13, r8)
            r14.mo54238n(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85647B(r13, r8)
            r14.mo54217L(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            long r8 = m85652M(r13, r8)
            r14.mo54234j(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85647B(r13, r8)
            r14.mo54250z(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85647B(r13, r8)
            r14.mo54214I(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85647B(r13, r8)
            r14.mo54240p(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            r14.mo54220O(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            androidx.datastore.preferences.protobuf.x2 r8 = r12.mo54479v(r5)
            r14.mo54221P(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r13, r8)
            r12.mo54487z0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            boolean r6 = m85662l(r13, r8)
            r14.mo54249y(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85647B(r13, r8)
            r14.mo54227c(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            long r8 = m85652M(r13, r8)
            r14.mo54244t(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            int r6 = m85647B(r13, r8)
            r14.mo54233i(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            long r8 = m85652M(r13, r8)
            r14.mo54231g(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            long r8 = m85652M(r13, r8)
            r14.mo54248x(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            float r6 = m85665s(r13, r8)
            r14.mo54211F(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.mo54433D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m85656W(r6)
            double r8 = m85663o(r13, r8)
            r14.mo54241q(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            androidx.datastore.preferences.protobuf.q0<?> r3 = r12.f47832p
            r3.mo55351j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            androidx.datastore.preferences.protobuf.v3<?, ?> r0 = r12.f47831o
            r12.mo54432A0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54481w0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* renamed from: x */
    public int mo54482x() {
        return this.f47817a.length * 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54483x0(T r11, androidx.datastore.preferences.protobuf.Writer r12) throws java.io.IOException {
        /*
            r10 = this;
            androidx.datastore.preferences.protobuf.v3<?, ?> r0 = r10.f47831o
            r10.mo54432A0(r0, r11, r12)
            boolean r0 = r10.f47822f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.q0<?> r0 = r10.f47832p
            androidx.datastore.preferences.protobuf.y0 r0 = r0.mo55344c(r11)
            boolean r2 = r0.mo55608C()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo55628r()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f47817a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.mo54478u0(r3)
            int r5 = r10.mo54444V(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            androidx.datastore.preferences.protobuf.q0<?> r6 = r10.f47832p
            int r6 = r6.mo55342a(r2)
            if (r6 <= r5) goto L_0x0050
            androidx.datastore.preferences.protobuf.q0<?> r6 = r10.f47832p
            r6.mo55351j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m85667t0(r4)
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
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            androidx.datastore.preferences.protobuf.x2 r6 = r10.mo54479v(r3)
            r12.mo54223R(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            long r6 = m85661b0(r11, r6)
            r12.mo54238n(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85660a0(r11, r6)
            r12.mo54217L(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            long r6 = m85661b0(r11, r6)
            r12.mo54234j(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85660a0(r11, r6)
            r12.mo54250z(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85660a0(r11, r6)
            r12.mo54214I(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85660a0(r11, r6)
            r12.mo54240p(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r12.mo54220O(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            androidx.datastore.preferences.protobuf.x2 r6 = r10.mo54479v(r3)
            r12.mo54221P(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            r10.mo54487z0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            boolean r4 = m85657X(r11, r6)
            r12.mo54249y(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85660a0(r11, r6)
            r12.mo54227c(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            long r6 = m85661b0(r11, r6)
            r12.mo54244t(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85660a0(r11, r6)
            r12.mo54233i(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            long r6 = m85661b0(r11, r6)
            r12.mo54231g(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            long r6 = m85661b0(r11, r6)
            r12.mo54248x(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            float r4 = m85659Z(r11, r6)
            r12.mo54211F(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.mo54438J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            double r6 = m85658Y(r11, r6)
            r12.mo54241q(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            r10.mo54485y0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.x2 r6 = r10.mo54479v(r3)
            androidx.datastore.preferences.protobuf.C18922z2.m88319i0(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88351y0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88347w0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88343u0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88339s0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88303a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88277D0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88296U(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88307c0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88311e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88323k0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88281F0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88327m0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88315g0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.mo54444V(r3)
            long r8 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88300Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88351y0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88347w0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88343u0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88339s0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88303a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88277D0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88298W(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.x2 r6 = r10.mo54479v(r3)
            androidx.datastore.preferences.protobuf.C18922z2.m88335q0(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88273B0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88296U(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88307c0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88311e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88323k0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88281F0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88327m0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88315g0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.mo54444V(r3)
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.C18922z2.m88300Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            androidx.datastore.preferences.protobuf.x2 r6 = r10.mo54479v(r3)
            r12.mo54223R(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            long r6 = m85652M(r11, r6)
            r12.mo54238n(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85647B(r11, r6)
            r12.mo54217L(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            long r6 = m85652M(r11, r6)
            r12.mo54234j(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85647B(r11, r6)
            r12.mo54250z(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85647B(r11, r6)
            r12.mo54214I(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85647B(r11, r6)
            r12.mo54240p(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r12.mo54220O(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            androidx.datastore.preferences.protobuf.x2 r6 = r10.mo54479v(r3)
            r12.mo54221P(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r11, r6)
            r10.mo54487z0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            boolean r4 = m85662l(r11, r6)
            r12.mo54249y(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85647B(r11, r6)
            r12.mo54227c(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            long r6 = m85652M(r11, r6)
            r12.mo54244t(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            int r4 = m85647B(r11, r6)
            r12.mo54233i(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            long r6 = m85652M(r11, r6)
            r12.mo54231g(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            long r6 = m85652M(r11, r6)
            r12.mo54248x(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            float r4 = m85665s(r11, r6)
            r12.mo54211F(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.mo54433D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m85656W(r4)
            double r6 = m85663o(r11, r6)
            r12.mo54241q(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            androidx.datastore.preferences.protobuf.q0<?> r11 = r10.f47832p
            r11.mo55351j(r12, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54483x0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0347, code lost:
        r4 = (r4 + r8) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0413, code lost:
        r6 = r6 + r3;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0465, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x051c, code lost:
        r5 = r5 + 3;
        r4 = r16;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo54484y(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r2 = f47816z
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f47817a
            int r8 = r8.length
            if (r5 >= r8) goto L_0x0522
            int r8 = r0.mo54478u0(r5)
            int r9 = r0.mo54444V(r5)
            int r10 = m85667t0(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L_0x0039
            int[] r11 = r0.f47817a
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L_0x0037
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L_0x0037:
            r14 = r15
            goto L_0x0057
        L_0x0039:
            boolean r11 = r0.f47825i
            if (r11 == 0) goto L_0x0055
            androidx.datastore.preferences.protobuf.FieldType r11 = androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r11 = r11.mo53974w()
            if (r10 < r11) goto L_0x0055
            androidx.datastore.preferences.protobuf.FieldType r11 = androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED
            int r11 = r11.mo53974w()
            if (r10 > r11) goto L_0x0055
            int[] r11 = r0.f47817a
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
            goto L_0x0056
        L_0x0055:
            r11 = 0
        L_0x0056:
            r14 = 0
        L_0x0057:
            long r12 = m85656W(r8)
            r8 = 0
            r16 = r4
            r3 = 0
            switch(r10) {
                case 0: goto L_0x0510;
                case 1: goto L_0x0506;
                case 2: goto L_0x04f8;
                case 3: goto L_0x04ea;
                case 4: goto L_0x04dc;
                case 5: goto L_0x04d2;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04bd;
                case 8: goto L_0x04a1;
                case 9: goto L_0x0490;
                case 10: goto L_0x0481;
                case 11: goto L_0x0474;
                case 12: goto L_0x0467;
                case 13: goto L_0x045c;
                case 14: goto L_0x0453;
                case 15: goto L_0x0446;
                case 16: goto L_0x0439;
                case 17: goto L_0x0426;
                case 18: goto L_0x0417;
                case 19: goto L_0x0408;
                case 20: goto L_0x03fc;
                case 21: goto L_0x03f0;
                case 22: goto L_0x03e4;
                case 23: goto L_0x03d8;
                case 24: goto L_0x03cc;
                case 25: goto L_0x03c0;
                case 26: goto L_0x03b5;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0399;
                case 29: goto L_0x038c;
                case 30: goto L_0x037f;
                case 31: goto L_0x0372;
                case 32: goto L_0x0365;
                case 33: goto L_0x0358;
                case 34: goto L_0x034b;
                case 35: goto L_0x032b;
                case 36: goto L_0x030e;
                case 37: goto L_0x02f1;
                case 38: goto L_0x02d4;
                case 39: goto L_0x02b6;
                case 40: goto L_0x0298;
                case 41: goto L_0x027a;
                case 42: goto L_0x025c;
                case 43: goto L_0x023e;
                case 44: goto L_0x0220;
                case 45: goto L_0x0202;
                case 46: goto L_0x01e4;
                case 47: goto L_0x01c6;
                case 48: goto L_0x01a8;
                case 49: goto L_0x0198;
                case 50: goto L_0x0188;
                case 51: goto L_0x017a;
                case 52: goto L_0x016e;
                case 53: goto L_0x015e;
                case 54: goto L_0x014e;
                case 55: goto L_0x013e;
                case 56: goto L_0x0132;
                case 57: goto L_0x0125;
                case 58: goto L_0x0118;
                case 59: goto L_0x00fa;
                case 60: goto L_0x00e6;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00c4;
                case 63: goto L_0x00b4;
                case 64: goto L_0x00a7;
                case 65: goto L_0x009b;
                case 66: goto L_0x008b;
                case 67: goto L_0x007b;
                case 68: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0423
        L_0x0065:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.z1 r3 = (androidx.datastore.preferences.protobuf.C18920z1) r3
            androidx.datastore.preferences.protobuf.x2 r4 = r0.mo54479v(r5)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84528t0(r9, r3, r4)
            goto L_0x0422
        L_0x007b:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            long r3 = m85661b0(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84488T0(r9, r3)
            goto L_0x0422
        L_0x008b:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            int r3 = m85660a0(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84486R0(r9, r3)
            goto L_0x0422
        L_0x009b:
            boolean r8 = r0.mo54438J(r1, r9, r5)
            if (r8 == 0) goto L_0x0423
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84484P0(r9, r3)
            goto L_0x0422
        L_0x00a7:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84482N0(r9, r3)
            goto L_0x0465
        L_0x00b4:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            int r3 = m85660a0(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84512k0(r9, r3)
            goto L_0x0422
        L_0x00c4:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            int r3 = m85660a0(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84494Y0(r9, r3)
            goto L_0x0422
        L_0x00d4:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84506g0(r9, r3)
            goto L_0x0422
        L_0x00e6:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.x2 r4 = r0.mo54479v(r5)
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88332p(r9, r3, r4)
            goto L_0x0422
        L_0x00fa:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r4 == 0) goto L_0x0110
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84506g0(r9, r3)
            goto L_0x0422
        L_0x0110:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84490V0(r9, r3)
            goto L_0x0422
        L_0x0118:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            r3 = 1
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84496a0(r9, r3)
            goto L_0x0422
        L_0x0125:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84516m0(r9, r3)
            goto L_0x0465
        L_0x0132:
            boolean r8 = r0.mo54438J(r1, r9, r5)
            if (r8 == 0) goto L_0x0423
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84520o0(r9, r3)
            goto L_0x0422
        L_0x013e:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            int r3 = m85660a0(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84531w0(r9, r3)
            goto L_0x0422
        L_0x014e:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            long r3 = m85661b0(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84497a1(r9, r3)
            goto L_0x0422
        L_0x015e:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            long r3 = m85661b0(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84533y0(r9, r3)
            goto L_0x0422
        L_0x016e:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84524q0(r9, r8)
            goto L_0x0422
        L_0x017a:
            boolean r3 = r0.mo54438J(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            r3 = 0
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84508i0(r9, r3)
            goto L_0x0422
        L_0x0188:
            androidx.datastore.preferences.protobuf.u1 r3 = r0.f47833q
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.mo54477u(r5)
            int r3 = r3.mo55452g(r9, r4, r8)
            goto L_0x0422
        L_0x0198:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            androidx.datastore.preferences.protobuf.x2 r4 = r0.mo54479v(r5)
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88322k(r9, r3, r4)
            goto L_0x0422
        L_0x01a8:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88344v(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x01bc
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01bc:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x01c6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88340t(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x01da
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01da:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x01e4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88318i(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x01f8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01f8:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x0202:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88314g(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x0216
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0216:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x0220:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88310e(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x0234
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0234:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x023e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88350y(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x0252
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0252:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x025c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88304b(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x0270
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0270:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x027a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88314g(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x028e
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x028e:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x0298:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88318i(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x02ac
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02ac:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x02b6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88326m(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x02ca
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02ca:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x02d4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88270A(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x02e8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02e8:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x02f1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88330o(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x0305
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0305:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x030e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88314g(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x0322
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0322:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
            goto L_0x0347
        L_0x032b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88318i(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f47825i
            if (r4 == 0) goto L_0x033f
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x033f:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r3)
        L_0x0347:
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L_0x0465
        L_0x034b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88342u(r9, r3, r4)
            goto L_0x0413
        L_0x0358:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88338s(r9, r3, r4)
            goto L_0x0413
        L_0x0365:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88316h(r9, r3, r4)
            goto L_0x0413
        L_0x0372:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88312f(r9, r3, r4)
            goto L_0x0413
        L_0x037f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88308d(r9, r3, r4)
            goto L_0x0413
        L_0x038c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88348x(r9, r3, r4)
            goto L_0x0422
        L_0x0399:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88306c(r9, r3)
            goto L_0x0422
        L_0x03a5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            androidx.datastore.preferences.protobuf.x2 r4 = r0.mo54479v(r5)
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88336r(r9, r3, r4)
            goto L_0x0422
        L_0x03b5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88346w(r9, r3)
            goto L_0x0422
        L_0x03c0:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88302a(r9, r3, r4)
            goto L_0x0413
        L_0x03cc:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88312f(r9, r3, r4)
            goto L_0x0413
        L_0x03d8:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88316h(r9, r3, r4)
            goto L_0x0413
        L_0x03e4:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88324l(r9, r3, r4)
            goto L_0x0413
        L_0x03f0:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88352z(r9, r3, r4)
            goto L_0x0413
        L_0x03fc:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88328n(r9, r3, r4)
            goto L_0x0413
        L_0x0408:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88312f(r9, r3, r4)
        L_0x0413:
            int r6 = r6 + r3
            r10 = r4
            goto L_0x051c
        L_0x0417:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88316h(r9, r3, r4)
        L_0x0422:
            int r6 = r6 + r3
        L_0x0423:
            r10 = 0
            goto L_0x051c
        L_0x0426:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.z1 r3 = (androidx.datastore.preferences.protobuf.C18920z1) r3
            androidx.datastore.preferences.protobuf.x2 r4 = r0.mo54479v(r5)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84528t0(r9, r3, r4)
            goto L_0x0422
        L_0x0439:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84488T0(r9, r3)
            goto L_0x0422
        L_0x0446:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84486R0(r9, r3)
            goto L_0x0422
        L_0x0453:
            r8 = r7 & r14
            if (r8 == 0) goto L_0x0423
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84484P0(r9, r3)
            goto L_0x0422
        L_0x045c:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84482N0(r9, r3)
        L_0x0465:
            int r6 = r6 + r4
            goto L_0x0423
        L_0x0467:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84512k0(r9, r3)
            goto L_0x0422
        L_0x0474:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84494Y0(r9, r3)
            goto L_0x0422
        L_0x0481:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84506g0(r9, r3)
            goto L_0x0422
        L_0x0490:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.x2 r4 = r0.mo54479v(r5)
            int r3 = androidx.datastore.preferences.protobuf.C18922z2.m88332p(r9, r3, r4)
            goto L_0x0422
        L_0x04a1:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r4 == 0) goto L_0x04b5
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84506g0(r9, r3)
            goto L_0x0422
        L_0x04b5:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84490V0(r9, r3)
            goto L_0x0422
        L_0x04bd:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            r3 = 1
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84496a0(r9, r3)
            goto L_0x0422
        L_0x04c8:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            r10 = 0
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84516m0(r9, r10)
            goto L_0x051b
        L_0x04d2:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L_0x051c
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84520o0(r9, r3)
            goto L_0x051b
        L_0x04dc:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051c
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84531w0(r9, r3)
            goto L_0x051b
        L_0x04ea:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051c
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84497a1(r9, r3)
            goto L_0x051b
        L_0x04f8:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051c
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84533y0(r9, r3)
            goto L_0x051b
        L_0x0506:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051c
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84524q0(r9, r8)
            goto L_0x051b
        L_0x0510:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051c
            r3 = 0
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84508i0(r9, r3)
        L_0x051b:
            int r6 = r6 + r3
        L_0x051c:
            int r5 = r5 + 3
            r4 = r16
            goto L_0x000a
        L_0x0522:
            androidx.datastore.preferences.protobuf.v3<?, ?> r2 = r0.f47831o
            int r2 = r0.mo54431A(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f47822f
            if (r2 == 0) goto L_0x0538
            androidx.datastore.preferences.protobuf.q0<?> r2 = r0.f47832p
            androidx.datastore.preferences.protobuf.y0 r1 = r2.mo55344c(r1)
            int r1 = r1.mo55635z()
            int r6 = r6 + r1
        L_0x0538:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54484y(java.lang.Object):int");
    }

    /* renamed from: y0 */
    public final <K, V> void mo54485y0(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.mo54222Q(i, this.f47833q.mo55447b(mo54477u(i2)), this.f47833q.mo55450e(obj));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo54486z(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f47816z
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f47817a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.mo54478u0(r4)
            int r7 = m85667t0(r6)
            int r8 = r15.mo54444V(r4)
            long r9 = m85656W(r6)
            androidx.datastore.preferences.protobuf.FieldType r6 = androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.mo53974w()
            if (r7 < r6) goto L_0x0038
            androidx.datastore.preferences.protobuf.FieldType r6 = androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.mo53974w()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f47817a
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
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r1, r9)
            androidx.datastore.preferences.protobuf.z1 r6 = (androidx.datastore.preferences.protobuf.C18920z1) r6
            androidx.datastore.preferences.protobuf.x2 r7 = r15.mo54479v(r4)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84528t0(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m85661b0(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84488T0(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m85660a0(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84486R0(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84484P0(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84482N0(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m85660a0(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84512k0(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m85660a0(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84494Y0(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r1, r9)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84506g0(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r1, r9)
            androidx.datastore.preferences.protobuf.x2 r7 = r15.mo54479v(r4)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88332p(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r1, r9)
            boolean r7 = r6 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r7 == 0) goto L_0x00ec
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84506g0(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84490V0(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84496a0(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84516m0(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84520o0(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m85660a0(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84531w0(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m85661b0(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84497a1(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m85661b0(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84533y0(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84524q0(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.mo54438J(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84508i0(r8, r6)
            goto L_0x03c4
        L_0x0162:
            androidx.datastore.preferences.protobuf.u1 r6 = r0.f47833q
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r1, r9)
            java.lang.Object r9 = r15.mo54477u(r4)
            int r6 = r6.mo55452g(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = m85651L(r1, r9)
            androidx.datastore.preferences.protobuf.x2 r7 = r15.mo54479v(r4)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88322k(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88344v(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88340t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88318i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88314g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88310e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88350y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88304b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88314g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88318i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88326m(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88270A(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88330o(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88314g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.C18922z2.m88318i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f47825i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84492X0(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84495Z0(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88342u(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88338s(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88316h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88312f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88308d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88348x(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88306c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = m85651L(r1, r9)
            androidx.datastore.preferences.protobuf.x2 r7 = r15.mo54479v(r4)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88336r(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88346w(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88302a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88312f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88316h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88324l(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88352z(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88328n(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88312f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = m85651L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88316h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r1, r9)
            androidx.datastore.preferences.protobuf.z1 r6 = (androidx.datastore.preferences.protobuf.C18920z1) r6
            androidx.datastore.preferences.protobuf.x2 r7 = r15.mo54479v(r4)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84528t0(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = androidx.datastore.preferences.protobuf.C18923z3.m88365L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84488T0(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.C18923z3.m88362I(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84486R0(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84484P0(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84482N0(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.C18923z3.m88362I(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84512k0(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.C18923z3.m88362I(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84494Y0(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r1, r9)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84506g0(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r1, r9)
            androidx.datastore.preferences.protobuf.x2 r7 = r15.mo54479v(r4)
            int r6 = androidx.datastore.preferences.protobuf.C18922z2.m88332p(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18923z3.m88368O(r1, r9)
            boolean r7 = r6 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r7 == 0) goto L_0x0469
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84506g0(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84490V0(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84496a0(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84516m0(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84520o0(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.C18923z3.m88362I(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84531w0(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = androidx.datastore.preferences.protobuf.C18923z3.m88365L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84497a1(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = androidx.datastore.preferences.protobuf.C18923z3.m88365L(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84533y0(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84524q0(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.mo54433D(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m84508i0(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            androidx.datastore.preferences.protobuf.v3<?, ?> r2 = r0.f47831o
            int r1 = r15.mo54431A(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18700c2.mo54486z(java.lang.Object):int");
    }

    /* renamed from: z0 */
    public final void mo54487z0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.mo54230f(i, (String) obj);
        } else {
            writer.mo54220O(i, (ByteString) obj);
        }
    }
}
