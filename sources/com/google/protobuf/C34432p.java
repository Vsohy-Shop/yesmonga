package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: com.google.protobuf.p */
public final class C34432p {

    /* renamed from: a */
    public static final int f83431a = 1024;

    /* renamed from: b */
    public static final int f83432b = 16384;

    /* renamed from: c */
    public static final float f83433c = 0.5f;

    /* renamed from: d */
    public static final ThreadLocal<SoftReference<byte[]>> f83434d = new ThreadLocal<>();

    /* renamed from: e */
    public static final Class<?> f83435e;

    /* renamed from: f */
    public static final long f83436f;

    static {
        Class<?> f = m140084f("java.io.FileOutputStream");
        f83435e = f;
        f83436f = m140081c(f);
    }

    /* renamed from: a */
    public static void m140079a() {
        f83434d.set((Object) null);
    }

    /* renamed from: b */
    public static byte[] m140080b() {
        SoftReference softReference = f83434d.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: c */
    public static long m140081c(Class<?> cls) {
        if (cls == null) {
            return -1;
        }
        try {
            if (C34341c3.m138971U()) {
                return C34341c3.m138976Z(cls.getDeclaredField("channel"));
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static byte[] m140082d(int i) {
        int max = Math.max(i, 1024);
        byte[] b = m140080b();
        if (b == null || m140083e(max, b.length)) {
            b = new byte[max];
            if (max <= 16384) {
                m140085g(b);
            }
        }
        return b;
    }

    /* renamed from: e */
    public static boolean m140083e(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* renamed from: f */
    public static Class<?> m140084f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static void m140085g(byte[] bArr) {
        f83434d.set(new SoftReference(bArr));
    }

    /* renamed from: h */
    public static void m140086h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m140087i(byteBuffer, outputStream)) {
                byte[] d = m140082d(byteBuffer.remaining());
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
    public static boolean m140087i(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j = f83436f;
        if (j < 0 || !f83435e.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) C34341c3.m138967Q(outputStream, j);
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
