package androidx.camera.view.transform;

import android.content.ContentResolver;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.camera.core.impl.utils.C1516d;
import androidx.camera.view.C1803j0;
import androidx.camera.view.C1805k0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@C1803j0
/* renamed from: androidx.camera.view.transform.b */
public final class C1819b {

    /* renamed from: a */
    public boolean f5003a;

    @C0359n0
    /* renamed from: a */
    public C1821d mo5983a(@C0359n0 ContentResolver contentResolver, @C0359n0 Uri uri) throws IOException {
        InputStream openInputStream = contentResolver.openInputStream(uri);
        try {
            C1821d c = mo5985c(openInputStream);
            if (openInputStream != null) {
                openInputStream.close();
            }
            return c;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @C0359n0
    /* renamed from: b */
    public C1821d mo5984b(@C0359n0 File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            C1821d c = mo5985c(fileInputStream);
            fileInputStream.close();
            return c;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @C0359n0
    /* renamed from: c */
    public C1821d mo5985c(@C0359n0 InputStream inputStream) throws IOException {
        C1516d j = C1516d.m6382j(inputStream);
        Rect rect = new Rect(0, 0, j.mo5410t(), j.mo5404n());
        Matrix b = C1805k0.m7195b(rect);
        if (this.f5003a) {
            b.postConcat(C1805k0.m7194a(j.mo5407q(), j.mo5410t(), j.mo5404n()));
        }
        return new C1821d(b, C1805k0.m7202i(rect));
    }

    /* renamed from: d */
    public boolean mo5986d() {
        return this.f5003a;
    }

    /* renamed from: e */
    public void mo5987e(boolean z) {
        this.f5003a = z;
    }
}
