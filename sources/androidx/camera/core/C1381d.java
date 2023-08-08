package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.C1500r0;
import androidx.camera.core.impl.utils.C1565i;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.d */
public final class C1381d implements C1500r0 {
    @C0323b0("this")

    /* renamed from: a */
    public final ImageReader f4013a;

    public C1381d(ImageReader imageReader) {
        this.f4013a = imageReader;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m5864j(C1500r0.C1501a aVar) {
        aVar.mo4997a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m5865k(Executor executor, C1500r0.C1501a aVar, ImageReader imageReader) {
        executor.execute(new C1357b(this, aVar));
    }

    @C0363p0
    /* renamed from: a */
    public synchronized Surface mo5002a() {
        return this.f4013a.getSurface();
    }

    @C0363p0
    /* renamed from: c */
    public synchronized C1353a2 mo5003c() {
        Image image;
        try {
            image = this.f4013a.acquireLatestImage();
        } catch (RuntimeException e) {
            if (mo5077i(e)) {
                image = null;
            } else {
                throw e;
            }
        }
        if (image == null) {
            return null;
        }
        return new C1347a(image);
    }

    public synchronized void close() {
        this.f4013a.close();
    }

    /* renamed from: d */
    public synchronized void mo5005d() {
        this.f4013a.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
    }

    /* renamed from: e */
    public synchronized int mo5006e() {
        return this.f4013a.getMaxImages();
    }

    /* renamed from: f */
    public synchronized void mo5007f(@C0359n0 C1500r0.C1501a aVar, @C0359n0 Executor executor) {
        this.f4013a.setOnImageAvailableListener(new C1374c(this, executor, aVar), C1565i.m6504a());
    }

    @C0363p0
    /* renamed from: g */
    public synchronized C1353a2 mo5008g() {
        Image image;
        try {
            image = this.f4013a.acquireNextImage();
        } catch (RuntimeException e) {
            if (mo5077i(e)) {
                image = null;
            } else {
                throw e;
            }
        }
        if (image == null) {
            return null;
        }
        return new C1347a(image);
    }

    public synchronized int getHeight() {
        return this.f4013a.getHeight();
    }

    public synchronized int getImageFormat() {
        return this.f4013a.getImageFormat();
    }

    public synchronized int getWidth() {
        return this.f4013a.getWidth();
    }

    /* renamed from: i */
    public final boolean mo5077i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }
}
