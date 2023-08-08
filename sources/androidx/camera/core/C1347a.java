package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1353a2;
import androidx.camera.core.impl.C1472k1;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.core.a */
public final class C1347a implements C1353a2 {
    @C0323b0("this")

    /* renamed from: a */
    public final Image f3901a;
    @C0323b0("this")

    /* renamed from: b */
    public final C1348a[] f3902b;

    /* renamed from: c */
    public final C1741z1 f3903c;

    /* renamed from: androidx.camera.core.a$a */
    public static final class C1348a implements C1353a2.C1354a {
        @C0323b0("this")

        /* renamed from: a */
        public final Image.Plane f3904a;

        public C1348a(Image.Plane plane) {
            this.f3904a = plane;
        }

        @C0359n0
        /* renamed from: e */
        public synchronized ByteBuffer mo4906e() {
            return this.f3904a.getBuffer();
        }

        /* renamed from: f */
        public synchronized int mo4907f() {
            return this.f3904a.getRowStride();
        }

        /* renamed from: g */
        public synchronized int mo4908g() {
            return this.f3904a.getPixelStride();
        }
    }

    public C1347a(Image image) {
        this.f3901a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f3902b = new C1348a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f3902b[i] = new C1348a(planes[i]);
            }
        } else {
            this.f3902b = new C1348a[0];
        }
        this.f3903c = C1412h2.m5903d(C1472k1.m6168b(), image.getTimestamp(), 0);
    }

    @C0359n0
    /* renamed from: I2 */
    public synchronized Rect mo4973I2() {
        return this.f3901a.getCropRect();
    }

    public synchronized void close() {
        this.f3901a.close();
    }

    public synchronized int getFormat() {
        return this.f3901a.getFormat();
    }

    public synchronized int getHeight() {
        return this.f3901a.getHeight();
    }

    @C1415i0
    public synchronized Image getImage() {
        return this.f3901a;
    }

    public synchronized int getWidth() {
        return this.f3901a.getWidth();
    }

    @C0359n0
    /* renamed from: o2 */
    public synchronized C1353a2.C1354a[] mo4911o2() {
        return this.f3902b;
    }

    @C0359n0
    /* renamed from: q3 */
    public C1741z1 mo4977q3() {
        return this.f3903c;
    }

    /* renamed from: y1 */
    public synchronized void mo4978y1(@C0363p0 Rect rect) {
        this.f3901a.setCropRect(rect);
    }
}
