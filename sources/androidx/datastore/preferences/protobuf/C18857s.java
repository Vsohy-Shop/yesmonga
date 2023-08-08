package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: androidx.datastore.preferences.protobuf.s */
public final class C18857s {

    /* renamed from: a */
    public static final int f47995a = 1024;

    /* renamed from: b */
    public static final int f47996b = 16384;

    /* renamed from: c */
    public static final float f47997c = 0.5f;

    /* renamed from: d */
    public static final ThreadLocal<SoftReference<byte[]>> f47998d = new ThreadLocal<>();

    /* renamed from: e */
    public static final Class<?> f47999e;

    /* renamed from: f */
    public static final long f48000f;

    static {
        Class<?> f = m87402f("java.io.FileOutputStream");
        f47999e = f;
        f48000f = m87399c(f);
    }

    /* renamed from: a */
    public static void m87397a() {
        f47998d.set((Object) null);
    }

    /* renamed from: b */
    public static byte[] m87398b() {
        SoftReference softReference = f47998d.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: c */
    public static long m87399c(Class<?> cls) {
        if (cls == null) {
            return -1;
        }
        try {
            if (C18923z3.m88372S()) {
                return C18923z3.m88376W(cls.getDeclaredField("channel"));
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static byte[] m87400d(int i) {
        int max = Math.max(i, 1024);
        byte[] b = m87398b();
        if (b == null || m87401e(max, b.length)) {
            b = new byte[max];
            if (max <= 16384) {
                m87403g(b);
            }
        }
        return b;
    }

    /* renamed from: e */
    public static boolean m87401e(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* renamed from: f */
    public static Class<?> m87402f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static void m87403g(byte[] bArr) {
        f47998d.set(new SoftReference(bArr));
    }

    /* renamed from: h */
    public static void m87404h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m87405i(byteBuffer, outputStream)) {
                byte[] d = m87400d(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), d.length);
                    byteBuffer.get(d, 0, min);
                    outputStream.write(d, 0, min);
                }
            }
        } finally {
            byteBuffer.position(position);
        }
    }

    /* renamed from: i */
    public static boolean m87405i(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j = f48000f;
        if (j < 0 || !f47999e.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) C18923z3.m88368O(outputStream, j);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
