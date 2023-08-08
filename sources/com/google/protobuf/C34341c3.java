package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.c3 */
public final class C34341c3 {

    /* renamed from: a */
    public static final Unsafe f83215a = m138970T();

    /* renamed from: b */
    public static final Class<?> f83216b = C34354e.m139157b();

    /* renamed from: c */
    public static final boolean f83217c = m139013s(Long.TYPE);

    /* renamed from: d */
    public static final boolean f83218d = m139013s(Integer.TYPE);

    /* renamed from: e */
    public static final C34346e f83219e = m138966P();

    /* renamed from: f */
    public static final boolean f83220f = m139022w0();

    /* renamed from: g */
    public static final boolean f83221g = m139020v0();

    /* renamed from: h */
    public static final long f83222h;

    /* renamed from: i */
    public static final long f83223i;

    /* renamed from: j */
    public static final long f83224j;

    /* renamed from: k */
    public static final long f83225k;

    /* renamed from: l */
    public static final long f83226l;

    /* renamed from: m */
    public static final long f83227m;

    /* renamed from: n */
    public static final long f83228n;

    /* renamed from: o */
    public static final long f83229o;

    /* renamed from: p */
    public static final long f83230p;

    /* renamed from: q */
    public static final long f83231q;

    /* renamed from: r */
    public static final long f83232r;

    /* renamed from: s */
    public static final long f83233s;

    /* renamed from: t */
    public static final long f83234t;

    /* renamed from: u */
    public static final long f83235u = m139017u(m139005o());

    /* renamed from: v */
    public static final int f83236v = 8;

    /* renamed from: w */
    public static final int f83237w = 7;

    /* renamed from: x */
    public static final int f83238x;

    /* renamed from: y */
    public static final boolean f83239y;

    /* renamed from: com.google.protobuf.c3$a */
    public static class C34342a implements PrivilegedExceptionAction<Unsafe> {
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

    /* renamed from: com.google.protobuf.c3$b */
    public static final class C34343b extends C34346e {

        /* renamed from: b */
        public static final long f83240b = -1;

        public C34343b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: C */
        public static int m139027C(long j) {
            return (int) (j & -1);
        }

        /* renamed from: B */
        public boolean mo100983B() {
            return false;
        }

        /* renamed from: c */
        public void mo100984c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo100985d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public boolean mo100986e(Object obj, long j) {
            if (C34341c3.f83239y) {
                return C34341c3.m139024y(obj, j);
            }
            return C34341c3.m139025z(obj, j);
        }

        /* renamed from: f */
        public byte mo100987f(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public byte mo100988g(Object obj, long j) {
            if (C34341c3.f83239y) {
                return C34341c3.m138954D(obj, j);
            }
            return C34341c3.m138955E(obj, j);
        }

        /* renamed from: h */
        public double mo100989h(Object obj, long j) {
            return Double.longBitsToDouble(mo101005m(obj, j));
        }

        /* renamed from: i */
        public float mo100990i(Object obj, long j) {
            return Float.intBitsToFloat(mo101004k(obj, j));
        }

        /* renamed from: j */
        public int mo100991j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: l */
        public long mo100992l(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: o */
        public Object mo100993o(Field field) {
            try {
                return field.get((Object) null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        /* renamed from: q */
        public void mo100994q(Object obj, long j, boolean z) {
            if (C34341c3.f83239y) {
                C34341c3.m138982c0(obj, j, z);
            } else {
                C34341c3.m138984d0(obj, j, z);
            }
        }

        /* renamed from: r */
        public void mo100995r(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public void mo100996s(Object obj, long j, byte b) {
            if (C34341c3.f83239y) {
                C34341c3.m138992h0(obj, j, b);
            } else {
                C34341c3.m138994i0(obj, j, b);
            }
        }

        /* renamed from: t */
        public void mo100997t(Object obj, long j, double d) {
            mo101009y(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: u */
        public void mo100998u(Object obj, long j, float f) {
            mo101008w(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public void mo100999v(long j, int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: x */
        public void mo101000x(long j, long j2) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.c3$c */
    public static final class C34344c extends C34346e {
        public C34344c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: B */
        public boolean mo100983B() {
            return false;
        }

        /* renamed from: c */
        public void mo100984c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo100985d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public boolean mo100986e(Object obj, long j) {
            if (C34341c3.f83239y) {
                return C34341c3.m139024y(obj, j);
            }
            return C34341c3.m139025z(obj, j);
        }

        /* renamed from: f */
        public byte mo100987f(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public byte mo100988g(Object obj, long j) {
            if (C34341c3.f83239y) {
                return C34341c3.m138954D(obj, j);
            }
            return C34341c3.m138955E(obj, j);
        }

        /* renamed from: h */
        public double mo100989h(Object obj, long j) {
            return Double.longBitsToDouble(mo101005m(obj, j));
        }

        /* renamed from: i */
        public float mo100990i(Object obj, long j) {
            return Float.intBitsToFloat(mo101004k(obj, j));
        }

        /* renamed from: j */
        public int mo100991j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: l */
        public long mo100992l(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: o */
        public Object mo100993o(Field field) {
            try {
                return field.get((Object) null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        /* renamed from: q */
        public void mo100994q(Object obj, long j, boolean z) {
            if (C34341c3.f83239y) {
                C34341c3.m138982c0(obj, j, z);
            } else {
                C34341c3.m138984d0(obj, j, z);
            }
        }

        /* renamed from: r */
        public void mo100995r(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public void mo100996s(Object obj, long j, byte b) {
            if (C34341c3.f83239y) {
                C34341c3.m138992h0(obj, j, b);
            } else {
                C34341c3.m138994i0(obj, j, b);
            }
        }

        /* renamed from: t */
        public void mo100997t(Object obj, long j, double d) {
            mo101009y(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: u */
        public void mo100998u(Object obj, long j, float f) {
            mo101008w(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public void mo100999v(long j, int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: x */
        public void mo101000x(long j, long j2) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.c3$d */
    public static final class C34345d extends C34346e {
        public C34345d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: A */
        public boolean mo101001A() {
            Class<Object> cls = Object.class;
            if (!super.mo101001A()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f83241a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th) {
                C34341c3.m138974X(th);
                return false;
            }
        }

        /* renamed from: B */
        public boolean mo100983B() {
            Class<Object> cls = Object.class;
            if (!super.mo100983B()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f83241a.getClass();
                Class cls3 = Long.TYPE;
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
                C34341c3.m138974X(th);
                return false;
            }
        }

        /* renamed from: c */
        public void mo100984c(long j, byte[] bArr, long j2, long j3) {
            this.f83241a.copyMemory((Object) null, j, bArr, C34341c3.f83222h + j2, j3);
        }

        /* renamed from: d */
        public void mo100985d(byte[] bArr, long j, long j2, long j3) {
            this.f83241a.copyMemory(bArr, C34341c3.f83222h + j, (Object) null, j2, j3);
        }

        /* renamed from: e */
        public boolean mo100986e(Object obj, long j) {
            return this.f83241a.getBoolean(obj, j);
        }

        /* renamed from: f */
        public byte mo100987f(long j) {
            return this.f83241a.getByte(j);
        }

        /* renamed from: g */
        public byte mo100988g(Object obj, long j) {
            return this.f83241a.getByte(obj, j);
        }

        /* renamed from: h */
        public double mo100989h(Object obj, long j) {
            return this.f83241a.getDouble(obj, j);
        }

        /* renamed from: i */
        public float mo100990i(Object obj, long j) {
            return this.f83241a.getFloat(obj, j);
        }

        /* renamed from: j */
        public int mo100991j(long j) {
            return this.f83241a.getInt(j);
        }

        /* renamed from: l */
        public long mo100992l(long j) {
            return this.f83241a.getLong(j);
        }

        /* renamed from: o */
        public Object mo100993o(Field field) {
            return mo101006n(this.f83241a.staticFieldBase(field), this.f83241a.staticFieldOffset(field));
        }

        /* renamed from: q */
        public void mo100994q(Object obj, long j, boolean z) {
            this.f83241a.putBoolean(obj, j, z);
        }

        /* renamed from: r */
        public void mo100995r(long j, byte b) {
            this.f83241a.putByte(j, b);
        }

        /* renamed from: s */
        public void mo100996s(Object obj, long j, byte b) {
            this.f83241a.putByte(obj, j, b);
        }

        /* renamed from: t */
        public void mo100997t(Object obj, long j, double d) {
            this.f83241a.putDouble(obj, j, d);
        }

        /* renamed from: u */
        public void mo100998u(Object obj, long j, float f) {
            this.f83241a.putFloat(obj, j, f);
        }

        /* renamed from: v */
        public void mo100999v(long j, int i) {
            this.f83241a.putInt(j, i);
        }

        /* renamed from: x */
        public void mo101000x(long j, long j2) {
            this.f83241a.putLong(j, j2);
        }
    }

    /* renamed from: com.google.protobuf.c3$e */
    public static abstract class C34346e {

        /* renamed from: a */
        public Unsafe f83241a;

        public C34346e(Unsafe unsafe) {
            this.f83241a = unsafe;
        }

        /* renamed from: A */
        public boolean mo101001A() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f83241a;
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
                return true;
            } catch (Throwable th) {
                C34341c3.m138974X(th);
                return false;
            }
        }

        /* renamed from: B */
        public boolean mo100983B() {
            Unsafe unsafe = this.f83241a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (C34341c3.m139005o() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C34341c3.m138974X(th);
                return false;
            }
        }

        /* renamed from: a */
        public final int mo101002a(Class<?> cls) {
            return this.f83241a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo101003b(Class<?> cls) {
            return this.f83241a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo100984c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract void mo100985d(byte[] bArr, long j, long j2, long j3);

        /* renamed from: e */
        public abstract boolean mo100986e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo100987f(long j);

        /* renamed from: g */
        public abstract byte mo100988g(Object obj, long j);

        /* renamed from: h */
        public abstract double mo100989h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo100990i(Object obj, long j);

        /* renamed from: j */
        public abstract int mo100991j(long j);

        /* renamed from: k */
        public final int mo101004k(Object obj, long j) {
            return this.f83241a.getInt(obj, j);
        }

        /* renamed from: l */
        public abstract long mo100992l(long j);

        /* renamed from: m */
        public final long mo101005m(Object obj, long j) {
            return this.f83241a.getLong(obj, j);
        }

        /* renamed from: n */
        public final Object mo101006n(Object obj, long j) {
            return this.f83241a.getObject(obj, j);
        }

        /* renamed from: o */
        public abstract Object mo100993o(Field field);

        /* renamed from: p */
        public final long mo101007p(Field field) {
            return this.f83241a.objectFieldOffset(field);
        }

        /* renamed from: q */
        public abstract void mo100994q(Object obj, long j, boolean z);

        /* renamed from: r */
        public abstract void mo100995r(long j, byte b);

        /* renamed from: s */
        public abstract void mo100996s(Object obj, long j, byte b);

        /* renamed from: t */
        public abstract void mo100997t(Object obj, long j, double d);

        /* renamed from: u */
        public abstract void mo100998u(Object obj, long j, float f);

        /* renamed from: v */
        public abstract void mo100999v(long j, int i);

        /* renamed from: w */
        public final void mo101008w(Object obj, long j, int i) {
            this.f83241a.putInt(obj, j, i);
        }

        /* renamed from: x */
        public abstract void mo101000x(long j, long j2);

        /* renamed from: y */
        public final void mo101009y(Object obj, long j, long j2) {
            this.f83241a.putLong(obj, j, j2);
        }

        /* renamed from: z */
        public final void mo101010z(Object obj, long j, Object obj2) {
            this.f83241a.putObject(obj, j, obj2);
        }
    }

    static {
        boolean z;
        long m = (long) m139001m(byte[].class);
        f83222h = m;
        Class<boolean[]> cls = boolean[].class;
        f83223i = (long) m139001m(cls);
        f83224j = (long) m139003n(cls);
        Class<int[]> cls2 = int[].class;
        f83225k = (long) m139001m(cls2);
        f83226l = (long) m139003n(cls2);
        Class<long[]> cls3 = long[].class;
        f83227m = (long) m139001m(cls3);
        f83228n = (long) m139003n(cls3);
        Class<float[]> cls4 = float[].class;
        f83229o = (long) m139001m(cls4);
        f83230p = (long) m139003n(cls4);
        Class<double[]> cls5 = double[].class;
        f83231q = (long) m139001m(cls5);
        f83232r = (long) m139003n(cls5);
        Class<Object[]> cls6 = Object[].class;
        f83233s = (long) m139001m(cls6);
        f83234t = (long) m139003n(cls6);
        f83238x = (int) (m & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f83239y = z;
    }

    /* renamed from: A */
    public static byte m138951A(long j) {
        return f83219e.mo100987f(j);
    }

    /* renamed from: B */
    public static byte m138952B(Object obj, long j) {
        return f83219e.mo100988g(obj, j);
    }

    /* renamed from: C */
    public static byte m138953C(byte[] bArr, long j) {
        return f83219e.mo100988g(bArr, f83222h + j);
    }

    /* renamed from: D */
    public static byte m138954D(Object obj, long j) {
        return (byte) ((m138961K(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: E */
    public static byte m138955E(Object obj, long j) {
        return (byte) ((m138961K(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: F */
    public static double m138956F(Object obj, long j) {
        return f83219e.mo100989h(obj, j);
    }

    /* renamed from: G */
    public static double m138957G(double[] dArr, long j) {
        return f83219e.mo100989h(dArr, f83231q + (j * f83232r));
    }

    /* renamed from: H */
    public static float m138958H(Object obj, long j) {
        return f83219e.mo100990i(obj, j);
    }

    /* renamed from: I */
    public static float m138959I(float[] fArr, long j) {
        return f83219e.mo100990i(fArr, f83229o + (j * f83230p));
    }

    /* renamed from: J */
    public static int m138960J(long j) {
        return f83219e.mo100991j(j);
    }

    /* renamed from: K */
    public static int m138961K(Object obj, long j) {
        return f83219e.mo101004k(obj, j);
    }

    /* renamed from: L */
    public static int m138962L(int[] iArr, long j) {
        return f83219e.mo101004k(iArr, f83225k + (j * f83226l));
    }

    /* renamed from: M */
    public static long m138963M(long j) {
        return f83219e.mo100992l(j);
    }

    /* renamed from: N */
    public static long m138964N(Object obj, long j) {
        return f83219e.mo101005m(obj, j);
    }

    /* renamed from: O */
    public static long m138965O(long[] jArr, long j) {
        return f83219e.mo101005m(jArr, f83227m + (j * f83228n));
    }

    /* renamed from: P */
    public static C34346e m138966P() {
        Unsafe unsafe = f83215a;
        if (unsafe == null) {
            return null;
        }
        if (!C34354e.m139158c()) {
            return new C34345d(unsafe);
        }
        if (f83217c) {
            return new C34344c(unsafe);
        }
        if (f83218d) {
            return new C34343b(unsafe);
        }
        return null;
    }

    /* renamed from: Q */
    public static Object m138967Q(Object obj, long j) {
        return f83219e.mo101006n(obj, j);
    }

    /* renamed from: R */
    public static Object m138968R(Object[] objArr, long j) {
        return f83219e.mo101006n(objArr, f83233s + (j * f83234t));
    }

    /* renamed from: S */
    public static Object m138969S(Field field) {
        return f83219e.mo100993o(field);
    }

    /* renamed from: T */
    public static Unsafe m138970T() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C34342a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: U */
    public static boolean m138971U() {
        return f83221g;
    }

    /* renamed from: V */
    public static boolean m138972V() {
        return f83220f;
    }

    /* renamed from: W */
    public static boolean m138973W() {
        return f83217c;
    }

    /* renamed from: X */
    public static void m138974X(Throwable th) {
        Logger logger = Logger.getLogger(C34341c3.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: Y */
    public static int m138975Y(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i < 0 || i2 < 0 || i3 < 0 || i + i3 > bArr.length || i2 + i3 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (f83221g) {
            int i5 = (f83238x + i) & 7;
            while (i4 < i3 && (i5 & 7) != 0) {
                if (bArr[i + i4] != bArr2[i2 + i4]) {
                    return i4;
                }
                i4++;
                i5++;
            }
            int i6 = ((i3 - i4) & -8) + i4;
            while (i4 < i6) {
                long j = f83222h;
                long j2 = (long) i4;
                long N = m138964N(bArr, ((long) i) + j + j2);
                long N2 = m138964N(bArr2, j + ((long) i2) + j2);
                if (N != N2) {
                    return i4 + m139019v(N, N2);
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

    /* renamed from: Z */
    public static long m138976Z(Field field) {
        return f83219e.mo101007p(field);
    }

    /* renamed from: a0 */
    public static void m138978a0(Object obj, long j, boolean z) {
        f83219e.mo100994q(obj, j, z);
    }

    /* renamed from: b0 */
    public static void m138980b0(boolean[] zArr, long j, boolean z) {
        f83219e.mo100994q(zArr, f83223i + (j * f83224j), z);
    }

    /* renamed from: c0 */
    public static void m138982c0(Object obj, long j, boolean z) {
        m138992h0(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: d0 */
    public static void m138984d0(Object obj, long j, boolean z) {
        m138994i0(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: e0 */
    public static void m138986e0(long j, byte b) {
        f83219e.mo100995r(j, b);
    }

    /* renamed from: f0 */
    public static void m138988f0(Object obj, long j, byte b) {
        f83219e.mo100996s(obj, j, b);
    }

    /* renamed from: g0 */
    public static void m138990g0(byte[] bArr, long j, byte b) {
        f83219e.mo100996s(bArr, f83222h + j, b);
    }

    /* renamed from: h0 */
    public static void m138992h0(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int K = m138961K(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m139006o0(obj, j2, ((255 & b) << i) | (K & (~(255 << i))));
    }

    /* renamed from: i0 */
    public static void m138994i0(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m139006o0(obj, j2, ((255 & b) << i) | (m138961K(obj, j2) & (~(255 << i))));
    }

    /* renamed from: j0 */
    public static void m138996j0(Object obj, long j, double d) {
        f83219e.mo100997t(obj, j, d);
    }

    /* renamed from: k */
    public static long m138997k(ByteBuffer byteBuffer) {
        return f83219e.mo101005m(byteBuffer, f83235u);
    }

    /* renamed from: k0 */
    public static void m138998k0(double[] dArr, long j, double d) {
        f83219e.mo100997t(dArr, f83231q + (j * f83232r), d);
    }

    /* renamed from: l */
    public static <T> T m138999l(Class<T> cls) {
        try {
            return f83215a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: l0 */
    public static void m139000l0(Object obj, long j, float f) {
        f83219e.mo100998u(obj, j, f);
    }

    /* renamed from: m */
    public static int m139001m(Class<?> cls) {
        if (f83221g) {
            return f83219e.mo101002a(cls);
        }
        return -1;
    }

    /* renamed from: m0 */
    public static void m139002m0(float[] fArr, long j, float f) {
        f83219e.mo100998u(fArr, f83229o + (j * f83230p), f);
    }

    /* renamed from: n */
    public static int m139003n(Class<?> cls) {
        if (f83221g) {
            return f83219e.mo101003b(cls);
        }
        return -1;
    }

    /* renamed from: n0 */
    public static void m139004n0(long j, int i) {
        f83219e.mo100999v(j, i);
    }

    /* renamed from: o */
    public static Field m139005o() {
        Field t;
        Class<Buffer> cls = Buffer.class;
        if (C34354e.m139158c() && (t = m139015t(cls, "effectiveDirectAddress")) != null) {
            return t;
        }
        Field t2 = m139015t(cls, "address");
        if (t2 == null || t2.getType() != Long.TYPE) {
            return null;
        }
        return t2;
    }

    /* renamed from: o0 */
    public static void m139006o0(Object obj, long j, int i) {
        f83219e.mo101008w(obj, j, i);
    }

    /* renamed from: p */
    public static void m139007p(long j, byte[] bArr, long j2, long j3) {
        f83219e.mo100984c(j, bArr, j2, j3);
    }

    /* renamed from: p0 */
    public static void m139008p0(int[] iArr, long j, int i) {
        f83219e.mo101008w(iArr, f83225k + (j * f83226l), i);
    }

    /* renamed from: q */
    public static void m139009q(byte[] bArr, long j, long j2, long j3) {
        f83219e.mo100985d(bArr, j, j2, j3);
    }

    /* renamed from: q0 */
    public static void m139010q0(long j, long j2) {
        f83219e.mo101000x(j, j2);
    }

    /* renamed from: r */
    public static void m139011r(byte[] bArr, long j, byte[] bArr2, long j2, long j3) {
        System.arraycopy(bArr, (int) j, bArr2, (int) j2, (int) j3);
    }

    /* renamed from: r0 */
    public static void m139012r0(Object obj, long j, long j2) {
        f83219e.mo101009y(obj, j, j2);
    }

    /* renamed from: s */
    public static boolean m139013s(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C34354e.m139158c()) {
            return false;
        }
        try {
            Class<?> cls3 = f83216b;
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

    /* renamed from: s0 */
    public static void m139014s0(long[] jArr, long j, long j2) {
        f83219e.mo101009y(jArr, f83227m + (j * f83228n), j2);
    }

    /* renamed from: t */
    public static Field m139015t(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: t0 */
    public static void m139016t0(Object obj, long j, Object obj2) {
        f83219e.mo101010z(obj, j, obj2);
    }

    /* renamed from: u */
    public static long m139017u(Field field) {
        C34346e eVar;
        if (field == null || (eVar = f83219e) == null) {
            return -1;
        }
        return eVar.mo101007p(field);
    }

    /* renamed from: u0 */
    public static void m139018u0(Object[] objArr, long j, Object obj) {
        f83219e.mo101010z(objArr, f83233s + (j * f83234t), obj);
    }

    /* renamed from: v */
    public static int m139019v(long j, long j2) {
        int i;
        if (f83239y) {
            i = Long.numberOfLeadingZeros(j ^ j2);
        } else {
            i = Long.numberOfTrailingZeros(j ^ j2);
        }
        return i >> 3;
    }

    /* renamed from: v0 */
    public static boolean m139020v0() {
        C34346e eVar = f83219e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo101001A();
    }

    /* renamed from: w */
    public static boolean m139021w(Object obj, long j) {
        return f83219e.mo100986e(obj, j);
    }

    /* renamed from: w0 */
    public static boolean m139022w0() {
        C34346e eVar = f83219e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo100983B();
    }

    /* renamed from: x */
    public static boolean m139023x(boolean[] zArr, long j) {
        return f83219e.mo100986e(zArr, f83223i + (j * f83224j));
    }

    /* renamed from: y */
    public static boolean m139024y(Object obj, long j) {
        return m138954D(obj, j) != 0;
    }

    /* renamed from: z */
    public static boolean m139025z(Object obj, long j) {
        return m138955E(obj, j) != 0;
    }
}
