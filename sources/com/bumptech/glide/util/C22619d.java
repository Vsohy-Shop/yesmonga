package com.bumptech.glide.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

@Deprecated
/* renamed from: com.bumptech.glide.util.d */
public class C22619d extends InputStream {

    /* renamed from: c */
    public static final Queue<C22619d> f58005c = C22635o.m102631f(0);

    /* renamed from: a */
    public InputStream f58006a;

    /* renamed from: b */
    public IOException f58007b;

    /* renamed from: a */
    public static void m102589a() {
        while (true) {
            Queue<C22619d> queue = f58005c;
            if (!queue.isEmpty()) {
                queue.remove();
            } else {
                return;
            }
        }
    }

    @C0359n0
    /* renamed from: c */
    public static C22619d m102590c(@C0359n0 InputStream inputStream) {
        C22619d poll;
        Queue<C22619d> queue = f58005c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C22619d();
        }
        poll.mo66965d(inputStream);
        return poll;
    }

    public int available() throws IOException {
        return this.f58006a.available();
    }

    @C0363p0
    /* renamed from: b */
    public IOException mo66963b() {
        return this.f58007b;
    }

    public void close() throws IOException {
        this.f58006a.close();
    }

    /* renamed from: d */
    public void mo66965d(@C0359n0 InputStream inputStream) {
        this.f58006a = inputStream;
    }

    public void mark(int i) {
        this.f58006a.mark(i);
    }

    public boolean markSupported() {
        return this.f58006a.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f58006a.read(bArr);
        } catch (IOException e) {
            this.f58007b = e;
            return -1;
        }
    }

    public void release() {
        this.f58007b = null;
        this.f58006a = null;
        Queue<C22619d> queue = f58005c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public synchronized void reset() throws IOException {
        this.f58006a.reset();
    }

    public long skip(long j) {
        try {
            return this.f58006a.skip(j);
        } catch (IOException e) {
            this.f58007b = e;
            return 0;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f58006a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f58007b = e;
            return -1;
        }
    }

    public int read() {
        try {
            return this.f58006a.read();
        } catch (IOException e) {
            this.f58007b = e;
            return -1;
        }
    }
}
