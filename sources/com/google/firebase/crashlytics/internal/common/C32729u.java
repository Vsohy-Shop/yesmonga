package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.internal.common.u */
public class C32729u implements C32733y {
    @C0359n0

    /* renamed from: a */
    public final File f79458a;
    @C0359n0

    /* renamed from: b */
    public final String f79459b;
    @C0359n0

    /* renamed from: c */
    public final String f79460c;

    public C32729u(@C0359n0 String str, @C0359n0 String str2, @C0359n0 File file) {
        this.f79459b = str;
        this.f79460c = str2;
        this.f79458a = file;
    }

    @C0363p0
    /* renamed from: a */
    public CrashlyticsReport.C32770e.C32772b mo94868a() {
        byte[] d = mo95028d();
        if (d != null) {
            return CrashlyticsReport.C32770e.C32772b.m132435a().mo95197b(d).mo95198c(this.f79459b).mo95196a();
        }
        return null;
    }

    @C0359n0
    /* renamed from: b */
    public String mo94869b() {
        return this.f79460c;
    }

    @C0363p0
    /* renamed from: c */
    public InputStream mo94870c() {
        if (this.f79458a.exists() && this.f79458a.isFile()) {
            try {
                return new FileInputStream(this.f79458a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: d */
    public final byte[] mo95028d() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream c = mo94870c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (c == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (c != null) {
                            c.close();
                        }
                        return null;
                    }
                    while (true) {
                        int read = c.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            c.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    byteArrayOutputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (c != null) {
                    c.close();
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }
}
