package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.c */
public final class C33169c {

    /* renamed from: a */
    public static final int f80516a = 8192;

    /* renamed from: b */
    public static final int f80517b = 2147483639;

    /* renamed from: c */
    public static final int f80518c = 20;

    /* renamed from: a */
    public static byte[] m133799a(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static byte[] m133800b() {
        return new byte[8192];
    }

    /* renamed from: c */
    public static InputStream m133801c(InputStream inputStream, long j) {
        return new C33170a(inputStream, j);
    }

    /* renamed from: d */
    public static int m133802d(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: e */
    public static byte[] m133803e(InputStream inputStream) throws IOException {
        return m133804f(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: f */
    public static byte[] m133804f(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int i2;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return m133799a(queue, i);
                }
                i3 += read;
                i += read;
            }
            long j = (long) min;
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            min = m133802d(j * ((long) i2));
        }
        if (inputStream.read() == -1) {
            return m133799a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: com.google.firebase.messaging.c$a */
    public static final class C33170a extends FilterInputStream {

        /* renamed from: a */
        public long f80519a;

        /* renamed from: b */
        public long f80520b = -1;

        public C33170a(InputStream inputStream, long j) {
            super(inputStream);
            this.f80519a = j;
        }

        public int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f80519a);
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f80520b = this.f80519a;
        }

        public int read() throws IOException {
            if (this.f80519a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f80519a--;
            }
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f80520b != -1) {
                this.in.reset();
                this.f80519a = this.f80520b;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.f80519a));
            this.f80519a -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f80519a;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f80519a -= (long) read;
            }
            return read;
        }
    }
}
