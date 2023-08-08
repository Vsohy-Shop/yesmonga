package com.bumptech.glide.util;

import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.util.e */
public final class C22620e extends InputStream {
    @C0323b0("POOL")

    /* renamed from: c */
    public static final Queue<C22620e> f58008c = C22635o.m102631f(0);

    /* renamed from: a */
    public InputStream f58009a;

    /* renamed from: b */
    public IOException f58010b;

    /* renamed from: a */
    public static void m102593a() {
        synchronized (f58008c) {
            while (true) {
                Queue<C22620e> queue = f58008c;
                if (!queue.isEmpty()) {
                    queue.remove();
                }
            }
        }
    }

    @C0359n0
    /* renamed from: c */
    public static C22620e m102594c(@C0359n0 InputStream inputStream) {
        C22620e poll;
        Queue<C22620e> queue = f58008c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C22620e();
        }
        poll.mo66977d(inputStream);
        return poll;
    }

    public int available() throws IOException {
        return this.f58009a.available();
    }

    @C0363p0
    /* renamed from: b */
    public IOException mo66975b() {
        return this.f58010b;
    }

    public void close() throws IOException {
        this.f58009a.close();
    }

    /* renamed from: d */
    public void mo66977d(@C0359n0 InputStream inputStream) {
        this.f58009a = inputStream;
    }

    public void mark(int i) {
        this.f58009a.mark(i);
    }

    public boolean markSupported() {
        return this.f58009a.markSupported();
    }

    public int read() throws IOException {
        try {
            return this.f58009a.read();
        } catch (IOException e) {
            this.f58010b = e;
            throw e;
        }
    }

    public void release() {
        this.f58010b = null;
        this.f58009a = null;
        Queue<C22620e> queue = f58008c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public synchronized void reset() throws IOException {
        this.f58009a.reset();
    }

    public long skip(long j) throws IOException {
        try {
            return this.f58009a.skip(j);
        } catch (IOException e) {
            this.f58010b = e;
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f58009a.read(bArr);
        } catch (IOException e) {
            this.f58010b = e;
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f58009a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f58010b = e;
            throw e;
        }
    }
}
