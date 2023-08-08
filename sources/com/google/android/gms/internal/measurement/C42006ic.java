package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ic */
public final class C42006ic {

    /* renamed from: a */
    public static final Unsafe f106214a;

    /* renamed from: b */
    public static final Class f106215b = Memory.class;

    /* renamed from: c */
    public static final boolean f106216c;

    /* renamed from: d */
    public static final C41988hc f106217d;

    /* renamed from: e */
    public static final boolean f106218e;

    /* renamed from: f */
    public static final boolean f106219f;

    /* renamed from: g */
    public static final long f106220g = ((long) m170289E(byte[].class));

    /* renamed from: h */
    public static final boolean f106221h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0130  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = m170301l()
            f106214a = r1
            int r2 = com.google.android.gms.internal.measurement.C41984h8.f106189a
            java.lang.Class<libcore.io.Memory> r2 = libcore.io.Memory.class
            f106215b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = m170285A(r2)
            f106216c = r3
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = m170285A(r4)
            r5 = 0
            if (r1 != 0) goto L_0x0020
            goto L_0x002f
        L_0x0020:
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.internal.measurement.gc r5 = new com.google.android.gms.internal.measurement.gc
            r5.<init>(r1)
            goto L_0x002f
        L_0x0028:
            if (r4 == 0) goto L_0x002f
            com.google.android.gms.internal.measurement.fc r5 = new com.google.android.gms.internal.measurement.fc
            r5.<init>(r1)
        L_0x002f:
            f106217d = r5
            java.lang.String r1 = "getLong"
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            java.lang.String r4 = "objectFieldOffset"
            r6 = 2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r8 = 1
            r9 = 0
            if (r5 != 0) goto L_0x0040
        L_0x003e:
            r2 = r9
            goto L_0x0064
        L_0x0040:
            sun.misc.Unsafe r5 = r5.f106192a
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x005f }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x005f }
            r10[r9] = r3     // Catch:{ all -> 0x005f }
            r5.getMethod(r4, r10)     // Catch:{ all -> 0x005f }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x005f }
            r10[r9] = r7     // Catch:{ all -> 0x005f }
            r10[r8] = r2     // Catch:{ all -> 0x005f }
            r5.getMethod(r1, r10)     // Catch:{ all -> 0x005f }
            java.lang.reflect.Field r2 = m170291b()     // Catch:{ all -> 0x005f }
            if (r2 != 0) goto L_0x005d
            goto L_0x003e
        L_0x005d:
            r2 = r8
            goto L_0x0064
        L_0x005f:
            r2 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C42006ic.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r2.toString()))
            goto L_0x003e
        L_0x0064:
            f106218e = r2
            com.google.android.gms.internal.measurement.hc r2 = f106217d
            if (r2 != 0) goto L_0x006c
        L_0x006a:
            r0 = r9
            goto L_0x00dd
        L_0x006c:
            sun.misc.Unsafe r2 = r2.f106192a
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r5[r9] = r3     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r4, r5)     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r4[r9] = r0     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r3, r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r4[r9] = r0     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r3, r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "getInt"
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r3[r9] = r7     // Catch:{ all -> 0x00d8 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x00d8 }
            r3[r8] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r3)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "putInt"
            r3 = 3
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d8 }
            r5[r9] = r7     // Catch:{ all -> 0x00d8 }
            r5[r8] = r4     // Catch:{ all -> 0x00d8 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00d8 }
            r5[r6] = r10     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r5)     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r0[r9] = r7     // Catch:{ all -> 0x00d8 }
            r0[r8] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "putLong"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r4     // Catch:{ all -> 0x00d8 }
            r1[r6] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "getObject"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "putObject"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r4     // Catch:{ all -> 0x00d8 }
            r1[r6] = r7     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d8 }
            r0 = r8
            goto L_0x00dd
        L_0x00d8:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C42006ic.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x006a
        L_0x00dd:
            f106219f = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m170289E(r0)
            long r0 = (long) r0
            f106220g = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            m170289E(r0)
            m170290a(r0)
            java.lang.Class<int[]> r0 = int[].class
            m170289E(r0)
            m170290a(r0)
            java.lang.Class<long[]> r0 = long[].class
            m170289E(r0)
            m170290a(r0)
            java.lang.Class<float[]> r0 = float[].class
            m170289E(r0)
            m170290a(r0)
            java.lang.Class<double[]> r0 = double[].class
            m170289E(r0)
            m170290a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            m170289E(r0)
            m170290a(r0)
            java.lang.reflect.Field r0 = m170291b()
            if (r0 == 0) goto L_0x0127
            com.google.android.gms.internal.measurement.hc r1 = f106217d
            if (r1 == 0) goto L_0x0127
            sun.misc.Unsafe r1 = r1.f106192a
            r1.objectFieldOffset(r0)
        L_0x0127:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r8 = r9
        L_0x0131:
            f106221h = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42006ic.<clinit>():void");
    }

    /* renamed from: A */
    public static boolean m170285A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C41984h8.f106189a;
        try {
            Class cls3 = f106215b;
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
    public static boolean m170286B(Object obj, long j) {
        return f106217d.mo136777g(obj, j);
    }

    /* renamed from: C */
    public static boolean m170287C() {
        return f106219f;
    }

    /* renamed from: D */
    public static boolean m170288D() {
        return f106218e;
    }

    /* renamed from: E */
    public static int m170289E(Class cls) {
        if (f106219f) {
            return f106217d.f106192a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m170290a(Class cls) {
        if (f106219f) {
            return f106217d.f106192a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m170291b() {
        int i = C41984h8.f106189a;
        Class<Buffer> cls = Buffer.class;
        Field c = m170292c(cls, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m170292c(cls, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    public static Field m170292c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m170293d(Object obj, long j, byte b) {
        C41988hc hcVar = f106217d;
        long j2 = -4 & j;
        int i = hcVar.f106192a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        hcVar.f106192a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* renamed from: e */
    public static void m170294e(Object obj, long j, byte b) {
        C41988hc hcVar = f106217d;
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        hcVar.f106192a.putInt(obj, j2, ((255 & b) << i) | (hcVar.f106192a.getInt(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    public static double m170295f(Object obj, long j) {
        return f106217d.mo136771a(obj, j);
    }

    /* renamed from: g */
    public static float m170296g(Object obj, long j) {
        return f106217d.mo136772b(obj, j);
    }

    /* renamed from: h */
    public static int m170297h(Object obj, long j) {
        return f106217d.f106192a.getInt(obj, j);
    }

    /* renamed from: i */
    public static long m170298i(Object obj, long j) {
        return f106217d.f106192a.getLong(obj, j);
    }

    /* renamed from: j */
    public static Object m170299j(Class cls) {
        try {
            return f106214a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m170300k(Object obj, long j) {
        return f106217d.f106192a.getObject(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m170301l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C41934ec());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static void m170307r(Object obj, long j, boolean z) {
        f106217d.mo136773c(obj, j, z);
    }

    /* renamed from: s */
    public static void m170308s(byte[] bArr, long j, byte b) {
        f106217d.mo136774d(bArr, f106220g + j, b);
    }

    /* renamed from: t */
    public static void m170309t(Object obj, long j, double d) {
        f106217d.mo136775e(obj, j, d);
    }

    /* renamed from: u */
    public static void m170310u(Object obj, long j, float f) {
        f106217d.mo136776f(obj, j, f);
    }

    /* renamed from: v */
    public static void m170311v(Object obj, long j, int i) {
        f106217d.f106192a.putInt(obj, j, i);
    }

    /* renamed from: w */
    public static void m170312w(Object obj, long j, long j2) {
        f106217d.f106192a.putLong(obj, j, j2);
    }

    /* renamed from: x */
    public static void m170313x(Object obj, long j, Object obj2) {
        f106217d.f106192a.putObject(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m170314y(Object obj, long j) {
        return ((byte) ((f106217d.f106192a.getInt(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m170315z(Object obj, long j) {
        return ((byte) ((f106217d.f106192a.getInt(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
