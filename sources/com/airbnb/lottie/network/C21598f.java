package com.airbnb.lottie.network;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.utils.C21682f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.airbnb.lottie.network.f */
public class C21598f {
    @C0359n0

    /* renamed from: a */
    public final C21596d f55869a;

    public C21598f(@C0359n0 C21596d dVar) {
        this.f55869a = dVar;
    }

    /* renamed from: c */
    public static String m99544c(String str, FileExtension fileExtension, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? fileExtension.mo64517g() : fileExtension.extension);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo64526a() {
        File e = mo64529e();
        if (e.exists()) {
            File[] listFiles = e.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File delete : e.listFiles()) {
                    delete.delete();
                }
            }
            e.delete();
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @androidx.annotation.C0348i1
    @androidx.annotation.C0363p0
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<com.airbnb.lottie.network.FileExtension, java.io.InputStream> mo64527b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.mo64528d(r6)     // Catch:{ FileNotFoundException -> 0x0044 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x001c
            com.airbnb.lottie.network.FileExtension r0 = com.airbnb.lottie.network.FileExtension.ZIP
            goto L_0x001e
        L_0x001c:
            com.airbnb.lottie.network.FileExtension r0 = com.airbnb.lottie.network.FileExtension.f55865a
        L_0x001e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cache hit for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " at "
            r3.append(r6)
            java.lang.String r6 = r1.getAbsolutePath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.airbnb.lottie.utils.C21682f.m99756a(r6)
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r0, r2)
            return r6
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.network.C21598f.mo64527b(java.lang.String):android.util.Pair");
    }

    @C0363p0
    /* renamed from: d */
    public final File mo64528d(String str) throws FileNotFoundException {
        File file = new File(mo64529e(), m99544c(str, FileExtension.f55865a, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(mo64529e(), m99544c(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: e */
    public final File mo64529e() {
        File a = this.f55869a.mo64117a();
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    /* renamed from: f */
    public void mo64530f(String str, FileExtension fileExtension) {
        File file = new File(mo64529e(), m99544c(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C21682f.m99756a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C21682f.m99760e("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* renamed from: g */
    public File mo64531g(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(mo64529e(), m99544c(str, fileExtension, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
