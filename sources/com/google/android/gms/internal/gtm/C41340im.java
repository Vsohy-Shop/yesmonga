package com.google.android.gms.internal.gtm;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.gtm.im */
public final class C41340im {

    /* renamed from: a */
    public static final Unsafe f104685a;

    /* renamed from: b */
    public static final Class<?> f104686b = C41143ah.m167083a();

    /* renamed from: c */
    public static final boolean f104687c;

    /* renamed from: d */
    public static final boolean f104688d;

    /* renamed from: e */
    public static final C41316hm f104689e;

    /* renamed from: f */
    public static final boolean f104690f;

    /* renamed from: g */
    public static final boolean f104691g;

    /* renamed from: h */
    public static final long f104692h = ((long) m167742E(byte[].class));

    /* renamed from: i */
    public static final boolean f104693i;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0137  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = m167754l()
            f104685a = r1
            java.lang.Class r2 = com.google.android.gms.internal.gtm.C41143ah.m167083a()
            f104686b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = m167738A(r2)
            f104687c = r3
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = m167738A(r4)
            f104688d = r4
            r5 = 0
            if (r1 != 0) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            if (r3 == 0) goto L_0x002a
            com.google.android.gms.internal.gtm.gm r5 = new com.google.android.gms.internal.gtm.gm
            r5.<init>(r1)
            goto L_0x0031
        L_0x002a:
            if (r4 == 0) goto L_0x0031
            com.google.android.gms.internal.gtm.fm r5 = new com.google.android.gms.internal.gtm.fm
            r5.<init>(r1)
        L_0x0031:
            f104689e = r5
            java.lang.String r1 = "getLong"
            java.lang.String r3 = "objectFieldOffset"
            java.lang.Class<java.lang.reflect.Field> r4 = java.lang.reflect.Field.class
            r6 = 2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r8 = 1
            r9 = 0
            if (r5 != 0) goto L_0x0042
        L_0x0040:
            r2 = r9
            goto L_0x0069
        L_0x0042:
            sun.misc.Unsafe r5 = r5.f104665a
            if (r5 != 0) goto L_0x0047
            goto L_0x0040
        L_0x0047:
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x0064 }
            r10[r9] = r4     // Catch:{ all -> 0x0064 }
            r5.getMethod(r3, r10)     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x0064 }
            r10[r9] = r7     // Catch:{ all -> 0x0064 }
            r10[r8] = r2     // Catch:{ all -> 0x0064 }
            r5.getMethod(r1, r10)     // Catch:{ all -> 0x0064 }
            java.lang.reflect.Field r2 = m167744b()     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x0062
            goto L_0x0040
        L_0x0062:
            r2 = r8
            goto L_0x0069
        L_0x0064:
            r2 = move-exception
            m167755m(r2)
            goto L_0x0040
        L_0x0069:
            f104690f = r2
            com.google.android.gms.internal.gtm.hm r2 = f104689e
            if (r2 != 0) goto L_0x0072
        L_0x006f:
            r0 = r9
            goto L_0x00e6
        L_0x0072:
            sun.misc.Unsafe r2 = r2.f104665a
            if (r2 != 0) goto L_0x0077
            goto L_0x006f
        L_0x0077:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ all -> 0x00e1 }
            r5[r9] = r4     // Catch:{ all -> 0x00e1 }
            r2.getMethod(r3, r5)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x00e1 }
            r3[r9] = r0     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = "arrayBaseOffset"
            r2.getMethod(r4, r3)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x00e1 }
            r3[r9] = r0     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "arrayIndexScale"
            r2.getMethod(r0, r3)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e1 }
            r0[r9] = r7     // Catch:{ all -> 0x00e1 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e1 }
            r0[r8] = r3     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = "getInt"
            r2.getMethod(r4, r0)     // Catch:{ all -> 0x00e1 }
            r0 = 3
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x00e1 }
            r4[r9] = r7     // Catch:{ all -> 0x00e1 }
            r4[r8] = r3     // Catch:{ all -> 0x00e1 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e1 }
            r4[r6] = r5     // Catch:{ all -> 0x00e1 }
            java.lang.String r5 = "putInt"
            r2.getMethod(r5, r4)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e1 }
            r4[r9] = r7     // Catch:{ all -> 0x00e1 }
            r4[r8] = r3     // Catch:{ all -> 0x00e1 }
            r2.getMethod(r1, r4)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ all -> 0x00e1 }
            r1[r9] = r7     // Catch:{ all -> 0x00e1 }
            r1[r8] = r3     // Catch:{ all -> 0x00e1 }
            r1[r6] = r3     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = "putLong"
            r2.getMethod(r4, r1)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e1 }
            r1[r9] = r7     // Catch:{ all -> 0x00e1 }
            r1[r8] = r3     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = "getObject"
            r2.getMethod(r4, r1)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ all -> 0x00e1 }
            r0[r9] = r7     // Catch:{ all -> 0x00e1 }
            r0[r8] = r3     // Catch:{ all -> 0x00e1 }
            r0[r6] = r7     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "putObject"
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00e1 }
            r0 = r8
            goto L_0x00e6
        L_0x00e1:
            r0 = move-exception
            m167755m(r0)
            goto L_0x006f
        L_0x00e6:
            f104691g = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m167742E(r0)
            long r0 = (long) r0
            f104692h = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            m167742E(r0)
            m167743a(r0)
            java.lang.Class<int[]> r0 = int[].class
            m167742E(r0)
            m167743a(r0)
            java.lang.Class<long[]> r0 = long[].class
            m167742E(r0)
            m167743a(r0)
            java.lang.Class<float[]> r0 = float[].class
            m167742E(r0)
            m167743a(r0)
            java.lang.Class<double[]> r0 = double[].class
            m167742E(r0)
            m167743a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            m167742E(r0)
            m167743a(r0)
            java.lang.reflect.Field r0 = m167744b()
            if (r0 == 0) goto L_0x012e
            com.google.android.gms.internal.gtm.hm r1 = f104689e
            if (r1 == 0) goto L_0x012e
            r1.mo135469l(r0)
        L_0x012e:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r8 = r9
        L_0x0138:
            f104693i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41340im.<clinit>():void");
    }

    /* renamed from: A */
    public static boolean m167738A(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C41143ah.f104441a;
        try {
            Class<?> cls3 = f104686b;
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

    /* renamed from: B */
    public static boolean m167739B(Object obj, long j) {
        return f104689e.mo135387g(obj, j);
    }

    /* renamed from: C */
    public static boolean m167740C() {
        return f104691g;
    }

    /* renamed from: D */
    public static boolean m167741D() {
        return f104690f;
    }

    /* renamed from: E */
    public static int m167742E(Class<?> cls) {
        if (f104691g) {
            return f104689e.mo135465h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m167743a(Class<?> cls) {
        if (f104691g) {
            return f104689e.mo135466i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m167744b() {
        int i = C41143ah.f104441a;
        Class<Buffer> cls = Buffer.class;
        Field c = m167745c(cls, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m167745c(cls, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    public static Field m167745c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m167746d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C41316hm hmVar = f104689e;
        int j3 = hmVar.mo135467j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        hmVar.mo135471n(obj, j2, ((255 & b) << i) | (j3 & (~(255 << i))));
    }

    /* renamed from: e */
    public static void m167747e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C41316hm hmVar = f104689e;
        int i = (((int) j) & 3) << 3;
        hmVar.mo135471n(obj, j2, ((255 & b) << i) | (hmVar.mo135467j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    public static double m167748f(Object obj, long j) {
        return f104689e.mo135381a(obj, j);
    }

    /* renamed from: g */
    public static float m167749g(Object obj, long j) {
        return f104689e.mo135382b(obj, j);
    }

    /* renamed from: h */
    public static int m167750h(Object obj, long j) {
        return f104689e.mo135467j(obj, j);
    }

    /* renamed from: i */
    public static long m167751i(Object obj, long j) {
        return f104689e.mo135468k(obj, j);
    }

    /* renamed from: j */
    public static <T> T m167752j(Class<T> cls) {
        try {
            return f104685a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m167753k(Object obj, long j) {
        return f104689e.mo135470m(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m167754l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C41244em());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m167755m(Throwable th) {
        Logger logger = Logger.getLogger(C41340im.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    /* renamed from: r */
    public static void m167760r(Object obj, long j, boolean z) {
        f104689e.mo135383c(obj, j, z);
    }

    /* renamed from: s */
    public static void m167761s(byte[] bArr, long j, byte b) {
        f104689e.mo135384d(bArr, f104692h + j, b);
    }

    /* renamed from: t */
    public static void m167762t(Object obj, long j, double d) {
        f104689e.mo135385e(obj, j, d);
    }

    /* renamed from: u */
    public static void m167763u(Object obj, long j, float f) {
        f104689e.mo135386f(obj, j, f);
    }

    /* renamed from: v */
    public static void m167764v(Object obj, long j, int i) {
        f104689e.mo135471n(obj, j, i);
    }

    /* renamed from: w */
    public static void m167765w(Object obj, long j, long j2) {
        f104689e.mo135472o(obj, j, j2);
    }

    /* renamed from: x */
    public static void m167766x(Object obj, long j, Object obj2) {
        f104689e.mo135473p(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m167767y(Object obj, long j) {
        if (((byte) ((f104689e.mo135467j(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m167768z(Object obj, long j) {
        if (((byte) ((f104689e.mo135467j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}
