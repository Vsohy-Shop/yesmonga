package com.google.android.play.core.splitcompat;

import com.google.android.play.core.internal.C32029a1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.i */
public final class C32141i implements C32143k {

    /* renamed from: a */
    public final /* synthetic */ Set f78372a;

    /* renamed from: b */
    public final /* synthetic */ C32151s f78373b;

    /* renamed from: c */
    public final /* synthetic */ ZipFile f78374c;

    public C32141i(Set set, C32151s sVar, ZipFile zipFile) {
        this.f78372a = set;
        this.f78373b = sVar;
        this.f78374c = zipFile;
    }

    /* renamed from: a */
    public final void mo92905a(C32144l lVar, File file, boolean z) throws IOException {
        FileOutputStream fileOutputStream;
        this.f78372a.add(file);
        if (!z) {
            String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", new Object[]{this.f78373b.mo92915b(), lVar.f78375a, this.f78373b.mo92914a().getAbsolutePath(), lVar.f78376b.getName(), file.getAbsolutePath()});
            ZipFile zipFile = this.f78374c;
            ZipEntry zipEntry = lVar.f78376b;
            int i = C32145m.f78378c;
            byte[] bArr = new byte[4096];
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        C32029a1.m129765a(th, th2);
                    }
                }
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }
}
