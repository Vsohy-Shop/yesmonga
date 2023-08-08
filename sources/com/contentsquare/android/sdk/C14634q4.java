package com.contentsquare.android.sdk;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.contentsquare.android.sdk.q4 */
public final class C14634q4 {

    /* renamed from: a */
    public static final Unsafe f36233a = m63011A();

    /* renamed from: b */
    public static final Class<?> f36234b = C14615p9.m62949a();

    /* renamed from: c */
    public static final boolean f36235c = m63014D(Long.TYPE);

    /* renamed from: d */
    public static final boolean f36236d = m63014D(Integer.TYPE);

    /* renamed from: e */
    public static final C14639e f36237e = m63053w();

    /* renamed from: f */
    public static final boolean f36238f = m63024N();

    /* renamed from: g */
    public static final boolean f36239g = m63021K();

    /* renamed from: h */
    public static final long f36240h;

    /* renamed from: i */
    public static final long f36241i;

    /* renamed from: j */
    public static final long f36242j;

    /* renamed from: k */
    public static final long f36243k;

    /* renamed from: l */
    public static final long f36244l;

    /* renamed from: m */
    public static final long f36245m;

    /* renamed from: n */
    public static final long f36246n;

    /* renamed from: o */
    public static final long f36247o;

    /* renamed from: p */
    public static final long f36248p;

    /* renamed from: q */
    public static final long f36249q;

    /* renamed from: r */
    public static final long f36250r;

    /* renamed from: s */
    public static final long f36251s;

    /* renamed from: t */
    public static final long f36252t;

    /* renamed from: u */
    public static final long f36253u = m63033c(m63048r());

    /* renamed from: v */
    public static final int f36254v;

    /* renamed from: w */
    public static final boolean f36255w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.contentsquare.android.sdk.q4$a */
    public static class C14635a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public Unsafe run() {
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

    /* renamed from: com.contentsquare.android.sdk.q4$b */
    public static final class C14636b extends C14639e {
        public C14636b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo36204c(Object obj, long j, byte b) {
            if (C14634q4.f36255w) {
                C14634q4.m63054x(obj, j, b);
            } else {
                C14634q4.m63012B(obj, j, b);
            }
        }

        /* renamed from: d */
        public void mo36205d(Object obj, long j, double d) {
            mo36217g(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: e */
        public void mo36206e(Object obj, long j, float f) {
            mo36216f(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: i */
        public void mo36207i(Object obj, long j, boolean z) {
            if (C14634q4.f36255w) {
                C14634q4.m63013C(obj, j, z);
            } else {
                C14634q4.m63016F(obj, j, z);
            }
        }

        /* renamed from: k */
        public boolean mo36208k(Object obj, long j) {
            return C14634q4.f36255w ? C14634q4.m63020J(obj, j) : C14634q4.m63022L(obj, j);
        }

        /* renamed from: l */
        public byte mo36209l(Object obj, long j) {
            return C14634q4.f36255w ? C14634q4.m63023M(obj, j) : C14634q4.m63025O(obj, j);
        }

        /* renamed from: n */
        public boolean mo36210n() {
            return false;
        }

        /* renamed from: o */
        public double mo36211o(Object obj, long j) {
            return Double.longBitsToDouble(mo36221r(obj, j));
        }

        /* renamed from: p */
        public float mo36212p(Object obj, long j) {
            return Float.intBitsToFloat(mo36220q(obj, j));
        }
    }

    /* renamed from: com.contentsquare.android.sdk.q4$c */
    public static final class C14637c extends C14639e {
        public C14637c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo36204c(Object obj, long j, byte b) {
            if (C14634q4.f36255w) {
                C14634q4.m63054x(obj, j, b);
            } else {
                C14634q4.m63012B(obj, j, b);
            }
        }

        /* renamed from: d */
        public void mo36205d(Object obj, long j, double d) {
            mo36217g(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: e */
        public void mo36206e(Object obj, long j, float f) {
            mo36216f(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: i */
        public void mo36207i(Object obj, long j, boolean z) {
            if (C14634q4.f36255w) {
                C14634q4.m63013C(obj, j, z);
            } else {
                C14634q4.m63016F(obj, j, z);
            }
        }

        /* renamed from: k */
        public boolean mo36208k(Object obj, long j) {
            return C14634q4.f36255w ? C14634q4.m63020J(obj, j) : C14634q4.m63022L(obj, j);
        }

        /* renamed from: l */
        public byte mo36209l(Object obj, long j) {
            return C14634q4.f36255w ? C14634q4.m63023M(obj, j) : C14634q4.m63025O(obj, j);
        }

        /* renamed from: n */
        public boolean mo36210n() {
            return false;
        }

        /* renamed from: o */
        public double mo36211o(Object obj, long j) {
            return Double.longBitsToDouble(mo36221r(obj, j));
        }

        /* renamed from: p */
        public float mo36212p(Object obj, long j) {
            return Float.intBitsToFloat(mo36220q(obj, j));
        }
    }

    /* renamed from: com.contentsquare.android.sdk.q4$d */
    public static final class C14638d extends C14639e {
        public C14638d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo36204c(Object obj, long j, byte b) {
            this.f36256a.putByte(obj, j, b);
        }

        /* renamed from: d */
        public void mo36205d(Object obj, long j, double d) {
            this.f36256a.putDouble(obj, j, d);
        }

        /* renamed from: e */
        public void mo36206e(Object obj, long j, float f) {
            this.f36256a.putFloat(obj, j, f);
        }

        /* renamed from: i */
        public void mo36207i(Object obj, long j, boolean z) {
            this.f36256a.putBoolean(obj, j, z);
        }

        /* renamed from: j */
        public boolean mo36213j() {
            Class<Object> cls = Object.class;
            if (!super.mo36213j()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f36256a.getClass();
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
                C14634q4.m63051u(th);
                return false;
            }
        }

        /* renamed from: k */
        public boolean mo36208k(Object obj, long j) {
            return this.f36256a.getBoolean(obj, j);
        }

        /* renamed from: l */
        public byte mo36209l(Object obj, long j) {
            return this.f36256a.getByte(obj, j);
        }

        /* renamed from: n */
        public boolean mo36210n() {
            Class<Object> cls = Object.class;
            if (!super.mo36210n()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f36256a.getClass();
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
                C14634q4.m63051u(th);
                return false;
            }
        }

        /* renamed from: o */
        public double mo36211o(Object obj, long j) {
            return this.f36256a.getDouble(obj, j);
        }

        /* renamed from: p */
        public float mo36212p(Object obj, long j) {
            return this.f36256a.getFloat(obj, j);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.q4$e */
    public static abstract class C14639e {

        /* renamed from: a */
        public Unsafe f36256a;

        public C14639e(Unsafe unsafe) {
            this.f36256a = unsafe;
        }

        /* renamed from: a */
        public final int mo36214a(Class<?> cls) {
            return this.f36256a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final long mo36215b(Field field) {
            return this.f36256a.objectFieldOffset(field);
        }

        /* renamed from: c */
        public abstract void mo36204c(Object obj, long j, byte b);

        /* renamed from: d */
        public abstract void mo36205d(Object obj, long j, double d);

        /* renamed from: e */
        public abstract void mo36206e(Object obj, long j, float f);

        /* renamed from: f */
        public final void mo36216f(Object obj, long j, int i) {
            this.f36256a.putInt(obj, j, i);
        }

        /* renamed from: g */
        public final void mo36217g(Object obj, long j, long j2) {
            this.f36256a.putLong(obj, j, j2);
        }

        /* renamed from: h */
        public final void mo36218h(Object obj, long j, Object obj2) {
            this.f36256a.putObject(obj, j, obj2);
        }

        /* renamed from: i */
        public abstract void mo36207i(Object obj, long j, boolean z);

        /* renamed from: j */
        public boolean mo36213j() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f36256a;
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
                C14634q4.m63051u(th);
                return false;
            }
        }

        /* renamed from: k */
        public abstract boolean mo36208k(Object obj, long j);

        /* renamed from: l */
        public abstract byte mo36209l(Object obj, long j);

        /* renamed from: m */
        public final int mo36219m(Class<?> cls) {
            return this.f36256a.arrayIndexScale(cls);
        }

        /* renamed from: n */
        public boolean mo36210n() {
            Unsafe unsafe = this.f36256a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return C14634q4.m63048r() != null;
            } catch (Throwable th) {
                C14634q4.m63051u(th);
                return false;
            }
        }

        /* renamed from: o */
        public abstract double mo36211o(Object obj, long j);

        /* renamed from: p */
        public abstract float mo36212p(Object obj, long j);

        /* renamed from: q */
        public final int mo36220q(Object obj, long j) {
            return this.f36256a.getInt(obj, j);
        }

        /* renamed from: r */
        public final long mo36221r(Object obj, long j) {
            return this.f36256a.getLong(obj, j);
        }

        /* renamed from: s */
        public final Object mo36222s(Object obj, long j) {
            return this.f36256a.getObject(obj, j);
        }
    }

    static {
        long q = (long) m63047q(byte[].class);
        f36240h = q;
        Class<boolean[]> cls = boolean[].class;
        f36241i = (long) m63047q(cls);
        f36242j = (long) m63052v(cls);
        Class<int[]> cls2 = int[].class;
        f36243k = (long) m63047q(cls2);
        f36244l = (long) m63052v(cls2);
        Class<long[]> cls3 = long[].class;
        f36245m = (long) m63047q(cls3);
        f36246n = (long) m63052v(cls3);
        Class<float[]> cls4 = float[].class;
        f36247o = (long) m63047q(cls4);
        f36248p = (long) m63052v(cls4);
        Class<double[]> cls5 = double[].class;
        f36249q = (long) m63047q(cls5);
        f36250r = (long) m63052v(cls5);
        Class<Object[]> cls6 = Object[].class;
        f36251s = (long) m63047q(cls6);
        f36252t = (long) m63052v(cls6);
        f36254v = (int) (q & 7);
    }

    /* renamed from: A */
    public static Unsafe m63011A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C14635a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: B */
    public static void m63012B(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m63040j(obj, j2, ((255 & b) << i) | (m63028R(obj, j2) & (~(255 << i))));
    }

    /* renamed from: C */
    public static void m63013C(Object obj, long j, boolean z) {
        m63054x(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: D */
    public static boolean m63014D(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C14615p9.m62951c()) {
            return false;
        }
        try {
            Class<?> cls3 = f36234b;
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

    /* renamed from: F */
    public static void m63016F(Object obj, long j, boolean z) {
        m63012B(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: G */
    public static boolean m63017G() {
        return f36239g;
    }

    /* renamed from: H */
    public static boolean m63018H(Object obj, long j) {
        return f36237e.mo36208k(obj, j);
    }

    /* renamed from: I */
    public static boolean m63019I() {
        return f36238f;
    }

    /* renamed from: J */
    public static boolean m63020J(Object obj, long j) {
        return m63023M(obj, j) != 0;
    }

    /* renamed from: K */
    public static boolean m63021K() {
        C14639e eVar = f36237e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo36213j();
    }

    /* renamed from: L */
    public static boolean m63022L(Object obj, long j) {
        return m63025O(obj, j) != 0;
    }

    /* renamed from: M */
    public static byte m63023M(Object obj, long j) {
        return (byte) ((m63028R(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: N */
    public static boolean m63024N() {
        C14639e eVar = f36237e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo36210n();
    }

    /* renamed from: O */
    public static byte m63025O(Object obj, long j) {
        return (byte) ((m63028R(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: P */
    public static double m63026P(Object obj, long j) {
        return f36237e.mo36211o(obj, j);
    }

    /* renamed from: Q */
    public static float m63027Q(Object obj, long j) {
        return f36237e.mo36212p(obj, j);
    }

    /* renamed from: R */
    public static int m63028R(Object obj, long j) {
        return f36237e.mo36220q(obj, j);
    }

    /* renamed from: S */
    public static long m63029S(Object obj, long j) {
        return f36237e.mo36221r(obj, j);
    }

    /* renamed from: T */
    public static Object m63030T(Object obj, long j) {
        return f36237e.mo36222s(obj, j);
    }

    /* renamed from: b */
    public static byte m63032b(byte[] bArr, long j) {
        return f36237e.mo36209l(bArr, f36240h + j);
    }

    /* renamed from: c */
    public static long m63033c(Field field) {
        C14639e eVar;
        if (field == null || (eVar = f36237e) == null) {
            return -1;
        }
        return eVar.mo36215b(field);
    }

    /* renamed from: d */
    public static <T> T m63034d(Class<T> cls) {
        try {
            return f36233a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    public static Field m63036f(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static void m63038h(Object obj, long j, double d) {
        f36237e.mo36205d(obj, j, d);
    }

    /* renamed from: i */
    public static void m63039i(Object obj, long j, float f) {
        f36237e.mo36206e(obj, j, f);
    }

    /* renamed from: j */
    public static void m63040j(Object obj, long j, int i) {
        f36237e.mo36216f(obj, j, i);
    }

    /* renamed from: k */
    public static void m63041k(Object obj, long j, long j2) {
        f36237e.mo36217g(obj, j, j2);
    }

    /* renamed from: l */
    public static void m63042l(Object obj, long j, Object obj2) {
        f36237e.mo36218h(obj, j, obj2);
    }

    /* renamed from: o */
    public static void m63045o(byte[] bArr, long j, byte b) {
        f36237e.mo36204c(bArr, f36240h + j, b);
    }

    /* renamed from: q */
    public static int m63047q(Class<?> cls) {
        if (f36239g) {
            return f36237e.mo36214a(cls);
        }
        return -1;
    }

    /* renamed from: r */
    public static Field m63048r() {
        Field f;
        Class<Buffer> cls = Buffer.class;
        if (C14615p9.m62951c() && (f = m63036f(cls, "effectiveDirectAddress")) != null) {
            return f;
        }
        Field f2 = m63036f(cls, "address");
        if (f2 == null || f2.getType() != Long.TYPE) {
            return null;
        }
        return f2;
    }

    /* renamed from: u */
    public static void m63051u(Throwable th) {
        Logger logger = Logger.getLogger(C14634q4.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: v */
    public static int m63052v(Class<?> cls) {
        if (f36239g) {
            return f36237e.mo36219m(cls);
        }
        return -1;
    }

    /* renamed from: w */
    public static C14639e m63053w() {
        Unsafe unsafe = f36233a;
        if (unsafe == null) {
            return null;
        }
        if (!C14615p9.m62951c()) {
            return new C14638d(unsafe);
        }
        if (f36235c) {
            return new C14637c(unsafe);
        }
        if (f36236d) {
            return new C14636b(unsafe);
        }
        return null;
    }

    /* renamed from: x */
    public static void m63054x(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int R = m63028R(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m63040j(obj, j2, ((255 & b) << i) | (R & (~(255 << i))));
    }

    /* renamed from: y */
    public static void m63055y(Object obj, long j, boolean z) {
        f36237e.mo36207i(obj, j, z);
    }
}
