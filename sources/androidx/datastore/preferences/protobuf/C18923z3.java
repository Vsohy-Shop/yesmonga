package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.z3 */
public final class C18923z3 {

    /* renamed from: a */
    public static final Logger f48155a = Logger.getLogger(C18923z3.class.getName());

    /* renamed from: b */
    public static final Unsafe f48156b = m88371R();

    /* renamed from: c */
    public static final Class<?> f48157c = C18712e.m85799b();

    /* renamed from: d */
    public static final boolean f48158d = m88412q(Long.TYPE);

    /* renamed from: e */
    public static final boolean f48159e = m88412q(Integer.TYPE);

    /* renamed from: f */
    public static final C18928e f48160f = m88367N();

    /* renamed from: g */
    public static final boolean f48161g = m88419t0();

    /* renamed from: h */
    public static final boolean f48162h = m88417s0();

    /* renamed from: i */
    public static final long f48163i;

    /* renamed from: j */
    public static final long f48164j;

    /* renamed from: k */
    public static final long f48165k;

    /* renamed from: l */
    public static final long f48166l;

    /* renamed from: m */
    public static final long f48167m;

    /* renamed from: n */
    public static final long f48168n;

    /* renamed from: o */
    public static final long f48169o;

    /* renamed from: p */
    public static final long f48170p;

    /* renamed from: q */
    public static final long f48171q;

    /* renamed from: r */
    public static final long f48172r;

    /* renamed from: s */
    public static final long f48173s;

    /* renamed from: t */
    public static final long f48174t;

    /* renamed from: u */
    public static final long f48175u;

    /* renamed from: v */
    public static final long f48176v = m88416s(m88404m());

    /* renamed from: w */
    public static final int f48177w = 8;

    /* renamed from: x */
    public static final int f48178x = 7;

    /* renamed from: y */
    public static final int f48179y;

    /* renamed from: z */
    public static final boolean f48180z;

    /* renamed from: androidx.datastore.preferences.protobuf.z3$a */
    public static class C18924a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public Unsafe run() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z3$b */
    public static final class C18925b extends C18928e {

        /* renamed from: b */
        public static final long f48181b = -1;

        public C18925b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: A */
        public static int m88427A(long j) {
            return (int) (j & -1);
        }

        /* renamed from: c */
        public void mo55698c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo55699d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public boolean mo55700e(Object obj, long j) {
            if (C18923z3.f48180z) {
                return C18923z3.m88422w(obj, j);
            }
            return C18923z3.m88423x(obj, j);
        }

        /* renamed from: f */
        public byte mo55701f(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public byte mo55702g(Object obj, long j) {
            if (C18923z3.f48180z) {
                return C18923z3.m88355B(obj, j);
            }
            return C18923z3.m88356C(obj, j);
        }

        /* renamed from: h */
        public double mo55703h(Object obj, long j) {
            return Double.longBitsToDouble(mo55718m(obj, j));
        }

        /* renamed from: i */
        public float mo55704i(Object obj, long j) {
            return Float.intBitsToFloat(mo55717k(obj, j));
        }

        /* renamed from: j */
        public int mo55705j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: l */
        public long mo55706l(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: o */
        public Object mo55707o(Field field) {
            try {
                return field.get((Object) null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        /* renamed from: q */
        public void mo55708q(Object obj, long j, boolean z) {
            if (C18923z3.f48180z) {
                C18923z3.m88379Z(obj, j, z);
            } else {
                C18923z3.m88381a0(obj, j, z);
            }
        }

        /* renamed from: r */
        public void mo55709r(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public void mo55710s(Object obj, long j, byte b) {
            if (C18923z3.f48180z) {
                C18923z3.m88389e0(obj, j, b);
            } else {
                C18923z3.m88391f0(obj, j, b);
            }
        }

        /* renamed from: t */
        public void mo55711t(Object obj, long j, double d) {
            mo55722y(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: u */
        public void mo55712u(Object obj, long j, float f) {
            mo55721w(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public void mo55713v(long j, int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: x */
        public void mo55714x(long j, long j2) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z3$c */
    public static final class C18926c extends C18928e {
        public C18926c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo55698c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo55699d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public boolean mo55700e(Object obj, long j) {
            if (C18923z3.f48180z) {
                return C18923z3.m88422w(obj, j);
            }
            return C18923z3.m88423x(obj, j);
        }

        /* renamed from: f */
        public byte mo55701f(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public byte mo55702g(Object obj, long j) {
            if (C18923z3.f48180z) {
                return C18923z3.m88355B(obj, j);
            }
            return C18923z3.m88356C(obj, j);
        }

        /* renamed from: h */
        public double mo55703h(Object obj, long j) {
            return Double.longBitsToDouble(mo55718m(obj, j));
        }

        /* renamed from: i */
        public float mo55704i(Object obj, long j) {
            return Float.intBitsToFloat(mo55717k(obj, j));
        }

        /* renamed from: j */
        public int mo55705j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: l */
        public long mo55706l(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: o */
        public Object mo55707o(Field field) {
            try {
                return field.get((Object) null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        /* renamed from: q */
        public void mo55708q(Object obj, long j, boolean z) {
            if (C18923z3.f48180z) {
                C18923z3.m88379Z(obj, j, z);
            } else {
                C18923z3.m88381a0(obj, j, z);
            }
        }

        /* renamed from: r */
        public void mo55709r(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public void mo55710s(Object obj, long j, byte b) {
            if (C18923z3.f48180z) {
                C18923z3.m88389e0(obj, j, b);
            } else {
                C18923z3.m88391f0(obj, j, b);
            }
        }

        /* renamed from: t */
        public void mo55711t(Object obj, long j, double d) {
            mo55722y(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: u */
        public void mo55712u(Object obj, long j, float f) {
            mo55721w(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public void mo55713v(long j, int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: x */
        public void mo55714x(long j, long j2) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z3$d */
    public static final class C18927d extends C18928e {
        public C18927d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo55698c(long j, byte[] bArr, long j2, long j3) {
            this.f48182a.copyMemory((Object) null, j, bArr, C18923z3.f48163i + j2, j3);
        }

        /* renamed from: d */
        public void mo55699d(byte[] bArr, long j, long j2, long j3) {
            this.f48182a.copyMemory(bArr, C18923z3.f48163i + j, (Object) null, j2, j3);
        }

        /* renamed from: e */
        public boolean mo55700e(Object obj, long j) {
            return this.f48182a.getBoolean(obj, j);
        }

        /* renamed from: f */
        public byte mo55701f(long j) {
            return this.f48182a.getByte(j);
        }

        /* renamed from: g */
        public byte mo55702g(Object obj, long j) {
            return this.f48182a.getByte(obj, j);
        }

        /* renamed from: h */
        public double mo55703h(Object obj, long j) {
            return this.f48182a.getDouble(obj, j);
        }

        /* renamed from: i */
        public float mo55704i(Object obj, long j) {
            return this.f48182a.getFloat(obj, j);
        }

        /* renamed from: j */
        public int mo55705j(long j) {
            return this.f48182a.getInt(j);
        }

        /* renamed from: l */
        public long mo55706l(long j) {
            return this.f48182a.getLong(j);
        }

        /* renamed from: o */
        public Object mo55707o(Field field) {
            return mo55719n(this.f48182a.staticFieldBase(field), this.f48182a.staticFieldOffset(field));
        }

        /* renamed from: q */
        public void mo55708q(Object obj, long j, boolean z) {
            this.f48182a.putBoolean(obj, j, z);
        }

        /* renamed from: r */
        public void mo55709r(long j, byte b) {
            this.f48182a.putByte(j, b);
        }

        /* renamed from: s */
        public void mo55710s(Object obj, long j, byte b) {
            this.f48182a.putByte(obj, j, b);
        }

        /* renamed from: t */
        public void mo55711t(Object obj, long j, double d) {
            this.f48182a.putDouble(obj, j, d);
        }

        /* renamed from: u */
        public void mo55712u(Object obj, long j, float f) {
            this.f48182a.putFloat(obj, j, f);
        }

        /* renamed from: v */
        public void mo55713v(long j, int i) {
            this.f48182a.putInt(j, i);
        }

        /* renamed from: x */
        public void mo55714x(long j, long j2) {
            this.f48182a.putLong(j, j2);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z3$e */
    public static abstract class C18928e {

        /* renamed from: a */
        public Unsafe f48182a;

        public C18928e(Unsafe unsafe) {
            this.f48182a = unsafe;
        }

        /* renamed from: a */
        public final int mo55715a(Class<?> cls) {
            return this.f48182a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo55716b(Class<?> cls) {
            return this.f48182a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo55698c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract void mo55699d(byte[] bArr, long j, long j2, long j3);

        /* renamed from: e */
        public abstract boolean mo55700e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo55701f(long j);

        /* renamed from: g */
        public abstract byte mo55702g(Object obj, long j);

        /* renamed from: h */
        public abstract double mo55703h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo55704i(Object obj, long j);

        /* renamed from: j */
        public abstract int mo55705j(long j);

        /* renamed from: k */
        public final int mo55717k(Object obj, long j) {
            return this.f48182a.getInt(obj, j);
        }

        /* renamed from: l */
        public abstract long mo55706l(long j);

        /* renamed from: m */
        public final long mo55718m(Object obj, long j) {
            return this.f48182a.getLong(obj, j);
        }

        /* renamed from: n */
        public final Object mo55719n(Object obj, long j) {
            return this.f48182a.getObject(obj, j);
        }

        /* renamed from: o */
        public abstract Object mo55707o(Field field);

        /* renamed from: p */
        public final long mo55720p(Field field) {
            return this.f48182a.objectFieldOffset(field);
        }

        /* renamed from: q */
        public abstract void mo55708q(Object obj, long j, boolean z);

        /* renamed from: r */
        public abstract void mo55709r(long j, byte b);

        /* renamed from: s */
        public abstract void mo55710s(Object obj, long j, byte b);

        /* renamed from: t */
        public abstract void mo55711t(Object obj, long j, double d);

        /* renamed from: u */
        public abstract void mo55712u(Object obj, long j, float f);

        /* renamed from: v */
        public abstract void mo55713v(long j, int i);

        /* renamed from: w */
        public final void mo55721w(Object obj, long j, int i) {
            this.f48182a.putInt(obj, j, i);
        }

        /* renamed from: x */
        public abstract void mo55714x(long j, long j2);

        /* renamed from: y */
        public final void mo55722y(Object obj, long j, long j2) {
            this.f48182a.putLong(obj, j, j2);
        }

        /* renamed from: z */
        public final void mo55723z(Object obj, long j, Object obj2) {
            this.f48182a.putObject(obj, j, obj2);
        }
    }

    static {
        boolean z;
        long k = (long) m88400k(byte[].class);
        f48163i = k;
        Class<boolean[]> cls = boolean[].class;
        f48164j = (long) m88400k(cls);
        f48165k = (long) m88402l(cls);
        Class<int[]> cls2 = int[].class;
        f48166l = (long) m88400k(cls2);
        f48167m = (long) m88402l(cls2);
        Class<long[]> cls3 = long[].class;
        f48168n = (long) m88400k(cls3);
        f48169o = (long) m88402l(cls3);
        Class<float[]> cls4 = float[].class;
        f48170p = (long) m88400k(cls4);
        f48171q = (long) m88402l(cls4);
        Class<double[]> cls5 = double[].class;
        f48172r = (long) m88400k(cls5);
        f48173s = (long) m88402l(cls5);
        Class<Object[]> cls6 = Object[].class;
        f48174t = (long) m88400k(cls6);
        f48175u = (long) m88402l(cls6);
        f48179y = (int) (k & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f48180z = z;
    }

    /* renamed from: A */
    public static byte m88354A(byte[] bArr, long j) {
        return f48160f.mo55702g(bArr, f48163i + j);
    }

    /* renamed from: B */
    public static byte m88355B(Object obj, long j) {
        return (byte) ((m88362I(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: C */
    public static byte m88356C(Object obj, long j) {
        return (byte) ((m88362I(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: D */
    public static double m88357D(Object obj, long j) {
        return f48160f.mo55703h(obj, j);
    }

    /* renamed from: E */
    public static double m88358E(double[] dArr, long j) {
        return f48160f.mo55703h(dArr, f48172r + (j * f48173s));
    }

    /* renamed from: F */
    public static float m88359F(Object obj, long j) {
        return f48160f.mo55704i(obj, j);
    }

    /* renamed from: G */
    public static float m88360G(float[] fArr, long j) {
        return f48160f.mo55704i(fArr, f48170p + (j * f48171q));
    }

    /* renamed from: H */
    public static int m88361H(long j) {
        return f48160f.mo55705j(j);
    }

    /* renamed from: I */
    public static int m88362I(Object obj, long j) {
        return f48160f.mo55717k(obj, j);
    }

    /* renamed from: J */
    public static int m88363J(int[] iArr, long j) {
        return f48160f.mo55717k(iArr, f48166l + (j * f48167m));
    }

    /* renamed from: K */
    public static long m88364K(long j) {
        return f48160f.mo55706l(j);
    }

    /* renamed from: L */
    public static long m88365L(Object obj, long j) {
        return f48160f.mo55718m(obj, j);
    }

    /* renamed from: M */
    public static long m88366M(long[] jArr, long j) {
        return f48160f.mo55718m(jArr, f48168n + (j * f48169o));
    }

    /* renamed from: N */
    public static C18928e m88367N() {
        Unsafe unsafe = f48156b;
        if (unsafe == null) {
            return null;
        }
        if (!C18712e.m85800c()) {
            return new C18927d(unsafe);
        }
        if (f48158d) {
            return new C18926c(unsafe);
        }
        if (f48159e) {
            return new C18925b(unsafe);
        }
        return null;
    }

    /* renamed from: O */
    public static Object m88368O(Object obj, long j) {
        return f48160f.mo55719n(obj, j);
    }

    /* renamed from: P */
    public static Object m88369P(Object[] objArr, long j) {
        return f48160f.mo55719n(objArr, f48174t + (j * f48175u));
    }

    /* renamed from: Q */
    public static Object m88370Q(Field field) {
        return f48160f.mo55707o(field);
    }

    /* renamed from: R */
    public static Unsafe m88371R() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C18924a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: S */
    public static boolean m88372S() {
        return f48162h;
    }

    /* renamed from: T */
    public static boolean m88373T() {
        return f48161g;
    }

    /* renamed from: U */
    public static boolean m88374U() {
        return f48158d;
    }

    /* renamed from: V */
    public static int m88375V(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i < 0 || i2 < 0 || i3 < 0 || i + i3 > bArr.length || i2 + i3 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (f48162h) {
            int i5 = (f48179y + i) & 7;
            while (i4 < i3 && (i5 & 7) != 0) {
                if (bArr[i + i4] != bArr2[i2 + i4]) {
                    return i4;
                }
                i4++;
                i5++;
            }
            int i6 = ((i3 - i4) & -8) + i4;
            while (i4 < i6) {
                long j = f48163i;
                long j2 = (long) i4;
                long L = m88365L(bArr, ((long) i) + j + j2);
                long L2 = m88365L(bArr2, j + ((long) i2) + j2);
                if (L != L2) {
                    return i4 + m88418t(L, L2);
                }
                i4 += 8;
            }
        }
        while (i4 < i3) {
            if (bArr[i + i4] != bArr2[i2 + i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    /* renamed from: W */
    public static long m88376W(Field field) {
        return f48160f.mo55720p(field);
    }

    /* renamed from: X */
    public static void m88377X(Object obj, long j, boolean z) {
        f48160f.mo55708q(obj, j, z);
    }

    /* renamed from: Y */
    public static void m88378Y(boolean[] zArr, long j, boolean z) {
        f48160f.mo55708q(zArr, f48164j + (j * f48165k), z);
    }

    /* renamed from: Z */
    public static void m88379Z(Object obj, long j, boolean z) {
        m88389e0(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: a0 */
    public static void m88381a0(Object obj, long j, boolean z) {
        m88391f0(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: b0 */
    public static void m88383b0(long j, byte b) {
        f48160f.mo55709r(j, b);
    }

    /* renamed from: c0 */
    public static void m88385c0(Object obj, long j, byte b) {
        f48160f.mo55710s(obj, j, b);
    }

    /* renamed from: d0 */
    public static void m88387d0(byte[] bArr, long j, byte b) {
        f48160f.mo55710s(bArr, f48163i + j, b);
    }

    /* renamed from: e0 */
    public static void m88389e0(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int I = m88362I(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m88403l0(obj, j2, ((255 & b) << i) | (I & (~(255 << i))));
    }

    /* renamed from: f0 */
    public static void m88391f0(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m88403l0(obj, j2, ((255 & b) << i) | (m88362I(obj, j2) & (~(255 << i))));
    }

    /* renamed from: g0 */
    public static void m88393g0(Object obj, long j, double d) {
        f48160f.mo55711t(obj, j, d);
    }

    /* renamed from: h0 */
    public static void m88395h0(double[] dArr, long j, double d) {
        f48160f.mo55711t(dArr, f48172r + (j * f48173s), d);
    }

    /* renamed from: i */
    public static long m88396i(ByteBuffer byteBuffer) {
        return f48160f.mo55718m(byteBuffer, f48176v);
    }

    /* renamed from: i0 */
    public static void m88397i0(Object obj, long j, float f) {
        f48160f.mo55712u(obj, j, f);
    }

    /* renamed from: j */
    public static <T> T m88398j(Class<T> cls) {
        try {
            return f48156b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: j0 */
    public static void m88399j0(float[] fArr, long j, float f) {
        f48160f.mo55712u(fArr, f48170p + (j * f48171q), f);
    }

    /* renamed from: k */
    public static int m88400k(Class<?> cls) {
        if (f48162h) {
            return f48160f.mo55715a(cls);
        }
        return -1;
    }

    /* renamed from: k0 */
    public static void m88401k0(long j, int i) {
        f48160f.mo55713v(j, i);
    }

    /* renamed from: l */
    public static int m88402l(Class<?> cls) {
        if (f48162h) {
            return f48160f.mo55716b(cls);
        }
        return -1;
    }

    /* renamed from: l0 */
    public static void m88403l0(Object obj, long j, int i) {
        f48160f.mo55721w(obj, j, i);
    }

    /* renamed from: m */
    public static Field m88404m() {
        Field r;
        Class<Buffer> cls = Buffer.class;
        if (C18712e.m85800c() && (r = m88414r(cls, "effectiveDirectAddress")) != null) {
            return r;
        }
        Field r2 = m88414r(cls, "address");
        if (r2 == null || r2.getType() != Long.TYPE) {
            return null;
        }
        return r2;
    }

    /* renamed from: m0 */
    public static void m88405m0(int[] iArr, long j, int i) {
        f48160f.mo55721w(iArr, f48166l + (j * f48167m), i);
    }

    /* renamed from: n */
    public static void m88406n(long j, byte[] bArr, long j2, long j3) {
        f48160f.mo55698c(j, bArr, j2, j3);
    }

    /* renamed from: n0 */
    public static void m88407n0(long j, long j2) {
        f48160f.mo55714x(j, j2);
    }

    /* renamed from: o */
    public static void m88408o(byte[] bArr, long j, long j2, long j3) {
        f48160f.mo55699d(bArr, j, j2, j3);
    }

    /* renamed from: o0 */
    public static void m88409o0(Object obj, long j, long j2) {
        f48160f.mo55722y(obj, j, j2);
    }

    /* renamed from: p */
    public static void m88410p(byte[] bArr, long j, byte[] bArr2, long j2, long j3) {
        System.arraycopy(bArr, (int) j, bArr2, (int) j2, (int) j3);
    }

    /* renamed from: p0 */
    public static void m88411p0(long[] jArr, long j, long j2) {
        f48160f.mo55722y(jArr, f48168n + (j * f48169o), j2);
    }

    /* renamed from: q */
    public static boolean m88412q(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C18712e.m85800c()) {
            return false;
        }
        try {
            Class<?> cls3 = f48157c;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: q0 */
    public static void m88413q0(Object obj, long j, Object obj2) {
        f48160f.mo55723z(obj, j, obj2);
    }

    /* renamed from: r */
    public static Field m88414r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r0 */
    public static void m88415r0(Object[] objArr, long j, Object obj) {
        f48160f.mo55723z(objArr, f48174t + (j * f48175u), obj);
    }

    /* renamed from: s */
    public static long m88416s(Field field) {
        C18928e eVar;
        if (field == null || (eVar = f48160f) == null) {
            return -1;
        }
        return eVar.mo55720p(field);
    }

    /* renamed from: s0 */
    public static boolean m88417s0() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = f48156b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls3 = unsafe.getClass();
            cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls3.getMethod("arrayBaseOffset", new Class[]{cls});
            cls3.getMethod("arrayIndexScale", new Class[]{cls});
            Class cls4 = Long.TYPE;
            cls3.getMethod("getInt", new Class[]{cls2, cls4});
            cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
            cls3.getMethod("getLong", new Class[]{cls2, cls4});
            cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
            cls3.getMethod("getObject", new Class[]{cls2, cls4});
            cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
            if (C18712e.m85800c()) {
                return true;
            }
            cls3.getMethod("getByte", new Class[]{cls2, cls4});
            cls3.getMethod("putByte", new Class[]{cls2, cls4, Byte.TYPE});
            cls3.getMethod("getBoolean", new Class[]{cls2, cls4});
            cls3.getMethod("putBoolean", new Class[]{cls2, cls4, Boolean.TYPE});
            cls3.getMethod("getFloat", new Class[]{cls2, cls4});
            cls3.getMethod("putFloat", new Class[]{cls2, cls4, Float.TYPE});
            cls3.getMethod("getDouble", new Class[]{cls2, cls4});
            cls3.getMethod("putDouble", new Class[]{cls2, cls4, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f48155a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: t */
    public static int m88418t(long j, long j2) {
        int i;
        if (f48180z) {
            i = Long.numberOfLeadingZeros(j ^ j2);
        } else {
            i = Long.numberOfTrailingZeros(j ^ j2);
        }
        return i >> 3;
    }

    /* renamed from: t0 */
    public static boolean m88419t0() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f48156b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (m88404m() == null) {
                return false;
            }
            if (C18712e.m85800c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger = f48155a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: u */
    public static boolean m88420u(Object obj, long j) {
        return f48160f.mo55700e(obj, j);
    }

    /* renamed from: v */
    public static boolean m88421v(boolean[] zArr, long j) {
        return f48160f.mo55700e(zArr, f48164j + (j * f48165k));
    }

    /* renamed from: w */
    public static boolean m88422w(Object obj, long j) {
        return m88355B(obj, j) != 0;
    }

    /* renamed from: x */
    public static boolean m88423x(Object obj, long j) {
        return m88356C(obj, j) != 0;
    }

    /* renamed from: y */
    public static byte m88424y(long j) {
        return f48160f.mo55701f(j);
    }

    /* renamed from: z */
    public static byte m88425z(Object obj, long j) {
        return f48160f.mo55702g(obj, j);
    }
}
