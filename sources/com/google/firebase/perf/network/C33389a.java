package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C33381i;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.firebase.perf.network.a */
public final class C33389a extends InputStream {

    /* renamed from: a */
    public final InputStream f81139a;

    /* renamed from: b */
    public final C33381i f81140b;

    /* renamed from: c */
    public final Timer f81141c;

    /* renamed from: d */
    public long f81142d = -1;

    /* renamed from: e */
    public long f81143e;

    /* renamed from: f */
    public long f81144f = -1;

    public C33389a(InputStream inputStream, C33381i iVar, Timer timer) {
        this.f81141c = timer;
        this.f81139a = inputStream;
        this.f81140b = iVar;
        this.f81143e = iVar.mo96537f();
    }

    public int available() throws IOException {
        try {
            return this.f81139a.available();
        } catch (IOException e) {
            this.f81140b.mo96554x(this.f81141c.mo96891c());
            C33396h.m134675d(this.f81140b);
            throw e;
        }
    }

    public void close() throws IOException {
        long c = this.f81141c.mo96891c();
        if (this.f81144f == -1) {
            this.f81144f = c;
        }
        try {
            this.f81139a.close();
            long j = this.f81142d;
            if (j != -1) {
                this.f81140b.mo96552v(j);
            }
            long j2 = this.f81143e;
            if (j2 != -1) {
                this.f81140b.mo96555y(j2);
            }
            this.f81140b.mo96554x(this.f81144f);
            this.f81140b.mo96534b();
        } catch (IOException e) {
            this.f81140b.mo96554x(this.f81141c.mo96891c());
            C33396h.m134675d(this.f81140b);
            throw e;
        }
    }

    public void mark(int i) {
        this.f81139a.mark(i);
    }

    public boolean markSupported() {
        return this.f81139a.markSupported();
    }

    public int read() throws IOException {
        try {
            int read = this.f81139a.read();
            long c = this.f81141c.mo96891c();
            if (this.f81143e == -1) {
                this.f81143e = c;
            }
            if (read == -1 && this.f81144f == -1) {
                this.f81144f = c;
                this.f81140b.mo96554x(c);
                this.f81140b.mo96534b();
            } else {
                long j = this.f81142d + 1;
                this.f81142d = j;
                this.f81140b.mo96552v(j);
            }
            return read;
        } catch (IOException e) {
            this.f81140b.mo96554x(this.f81141c.mo96891c());
            C33396h.m134675d(this.f81140b);
            throw e;
        }
    }

    public void reset() throws IOException {
        try {
            this.f81139a.reset();
        } catch (IOException e) {
            this.f81140b.mo96554x(this.f81141c.mo96891c());
            C33396h.m134675d(this.f81140b);
            throw e;
        }
    }

    public long skip(long j) throws IOException {
        try {
            long skip = this.f81139a.skip(j);
            long c = this.f81141c.mo96891c();
            if (this.f81143e == -1) {
                this.f81143e = c;
            }
            if (skip == -1 && this.f81144f == -1) {
                this.f81144f = c;
                this.f81140b.mo96554x(c);
            } else {
                long j2 = this.f81142d + skip;
                this.f81142d = j2;
                this.f81140b.mo96552v(j2);
            }
            return skip;
        } catch (IOException e) {
            this.f81140b.mo96554x(this.f81141c.mo96891c());
            C33396h.m134675d(this.f81140b);
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.f81139a.read(bArr, i, i2);
            long c = this.f81141c.mo96891c();
            if (this.f81143e == -1) {
                this.f81143e = c;
            }
            if (read == -1 && this.f81144f == -1) {
                this.f81144f = c;
                this.f81140b.mo96554x(c);
                this.f81140b.mo96534b();
            } else {
                long j = this.f81142d + ((long) read);
                this.f81142d = j;
                this.f81140b.mo96552v(j);
            }
            return read;
        } catch (IOException e) {
            this.f81140b.mo96554x(this.f81141c.mo96891c());
            C33396h.m134675d(this.f81140b);
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.f81139a.read(bArr);
            long c = this.f81141c.mo96891c();
            if (this.f81143e == -1) {
                this.f81143e = c;
            }
            if (read == -1 && this.f81144f == -1) {
                this.f81144f = c;
                this.f81140b.mo96554x(c);
                this.f81140b.mo96534b();
            } else {
                long j = this.f81142d + ((long) read);
                this.f81142d = j;
                this.f81140b.mo96552v(j);
            }
            return read;
        } catch (IOException e) {
            this.f81140b.mo96554x(this.f81141c.mo96891c());
            C33396h.m134675d(this.f81140b);
            throw e;
        }
    }
}
