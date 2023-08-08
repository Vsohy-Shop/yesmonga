package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.internal.common.z */
public class C32734z {
    /* renamed from: a */
    public static void m132222a(@C0363p0 InputStream inputStream, @C0359n0 File file) throws IOException {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            CommonUtils.m131924f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        CommonUtils.m131924f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.m131924f(gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static void m132223b(File file, List<C32733y> list) {
        for (C32733y next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.mo94870c();
                if (inputStream != null) {
                    m132222a(inputStream, new File(file, next.mo94869b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                CommonUtils.m131924f(inputStream);
                throw th;
            }
            CommonUtils.m131924f(inputStream);
        }
    }
}
