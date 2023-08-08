package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.internal.common.f */
public class C32677f implements C32733y {
    @C0363p0

    /* renamed from: a */
    public final byte[] f79302a;
    @C0359n0

    /* renamed from: b */
    public final String f79303b;
    @C0359n0

    /* renamed from: c */
    public final String f79304c;

    public C32677f(@C0359n0 String str, @C0359n0 String str2, @C0363p0 byte[] bArr) {
        this.f79303b = str;
        this.f79304c = str2;
        this.f79302a = bArr;
    }

    @C0363p0
    /* renamed from: a */
    public CrashlyticsReport.C32770e.C32772b mo94868a() {
        byte[] d = mo94871d();
        if (d == null) {
            return null;
        }
        return CrashlyticsReport.C32770e.C32772b.m132435a().mo95197b(d).mo95198c(this.f79303b).mo95196a();
    }

    @C0359n0
    /* renamed from: b */
    public String mo94869b() {
        return this.f79304c;
    }

    @C0363p0
    /* renamed from: c */
    public InputStream mo94870c() {
        if (mo94872e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f79302a);
    }

    @C0363p0
    /* renamed from: d */
    public final byte[] mo94871d() {
        GZIPOutputStream gZIPOutputStream;
        if (mo94872e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(this.f79302a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: e */
    public final boolean mo94872e() {
        byte[] bArr = this.f79302a;
        return bArr == null || bArr.length == 0;
    }
}
