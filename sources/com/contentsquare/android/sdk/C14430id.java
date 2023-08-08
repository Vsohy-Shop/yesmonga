package com.contentsquare.android.sdk;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.contentsquare.android.sdk.id */
public abstract class C14430id {

    /* renamed from: a */
    public String f35652a;

    /* renamed from: b */
    public final long f35653b;

    /* renamed from: c */
    public final ByteArrayOutputStream f35654c = new ByteArrayOutputStream();

    public C14430id(String str, long j) {
        this.f35652a = str;
        this.f35653b = j;
    }

    /* renamed from: b */
    public static C14430id m62114b(String str) {
        return new C14897yd(str);
    }

    /* renamed from: d */
    public static void m62115d(Context context, byte[] bArr) {
    }

    /* renamed from: a */
    public C14273da mo35548a(Context context) {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(this.f35654c);
        try {
            byte[] i = mo35554i();
            m62115d(context, i);
            gZIPOutputStream.write(i);
            gZIPOutputStream.close();
            C14273da daVar = new C14273da(this.f35654c.toByteArray(), this.f35652a);
            this.f35654c.reset();
            gZIPOutputStream.close();
            return daVar;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: c */
    public String mo35549c() {
        return this.f35652a;
    }

    /* renamed from: e */
    public abstract void mo35550e(C14374ga gaVar);

    /* renamed from: f */
    public abstract boolean mo35551f(C14374ga gaVar, int i);

    /* renamed from: g */
    public long mo35552g() {
        return this.f35653b;
    }

    /* renamed from: h */
    public abstract boolean mo35553h();

    /* renamed from: i */
    public abstract byte[] mo35554i();
}
