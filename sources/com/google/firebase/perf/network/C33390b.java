package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C33381i;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.firebase.perf.network.b */
public final class C33390b extends OutputStream {

    /* renamed from: a */
    public final OutputStream f81145a;

    /* renamed from: b */
    public final Timer f81146b;

    /* renamed from: c */
    public C33381i f81147c;

    /* renamed from: d */
    public long f81148d = -1;

    public C33390b(OutputStream outputStream, C33381i iVar, Timer timer) {
        this.f81145a = outputStream;
        this.f81147c = iVar;
        this.f81146b = timer;
    }

    public void close() throws IOException {
        long j = this.f81148d;
        if (j != -1) {
            this.f81147c.mo96549s(j);
        }
        this.f81147c.mo96553w(this.f81146b.mo96891c());
        try {
            this.f81145a.close();
        } catch (IOException e) {
            this.f81147c.mo96554x(this.f81146b.mo96891c());
            C33396h.m134675d(this.f81147c);
            throw e;
        }
    }

    public void flush() throws IOException {
        try {
            this.f81145a.flush();
        } catch (IOException e) {
            this.f81147c.mo96554x(this.f81146b.mo96891c());
            C33396h.m134675d(this.f81147c);
            throw e;
        }
    }

    public void write(int i) throws IOException {
        try {
            this.f81145a.write(i);
            long j = this.f81148d + 1;
            this.f81148d = j;
            this.f81147c.mo96549s(j);
        } catch (IOException e) {
            this.f81147c.mo96554x(this.f81146b.mo96891c());
            C33396h.m134675d(this.f81147c);
            throw e;
        }
    }

    public void write(byte[] bArr) throws IOException {
        try {
            this.f81145a.write(bArr);
            long length = this.f81148d + ((long) bArr.length);
            this.f81148d = length;
            this.f81147c.mo96549s(length);
        } catch (IOException e) {
            this.f81147c.mo96554x(this.f81146b.mo96891c());
            C33396h.m134675d(this.f81147c);
            throw e;
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f81145a.write(bArr, i, i2);
            long j = this.f81148d + ((long) i2);
            this.f81148d = j;
            this.f81147c.mo96549s(j);
        } catch (IOException e) {
            this.f81147c.mo96554x(this.f81146b.mo96891c());
            C33396h.m134675d(this.f81147c);
            throw e;
        }
    }
}
