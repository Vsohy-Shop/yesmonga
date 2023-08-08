package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1353a2;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.camera.core.p0 */
public abstract class C1663p0 implements C1353a2 {
    @C0323b0("this")

    /* renamed from: a */
    public final C1353a2 f4637a;
    @C0323b0("this")

    /* renamed from: b */
    public final Set<C1664a> f4638b = new HashSet();

    /* renamed from: androidx.camera.core.p0$a */
    public interface C1664a {
        /* renamed from: b */
        void mo4882b(C1353a2 a2Var);
    }

    public C1663p0(C1353a2 a2Var) {
        this.f4637a = a2Var;
    }

    @C0359n0
    /* renamed from: I2 */
    public synchronized Rect mo4973I2() {
        return this.f4637a.mo4973I2();
    }

    /* renamed from: a */
    public synchronized void mo5656a(C1664a aVar) {
        this.f4638b.add(aVar);
    }

    /* renamed from: b */
    public void mo5657b() {
        HashSet<C1664a> hashSet;
        synchronized (this) {
            hashSet = new HashSet<>(this.f4638b);
        }
        for (C1664a b : hashSet) {
            b.mo4882b(this);
        }
    }

    public void close() {
        synchronized (this) {
            this.f4637a.close();
        }
        mo5657b();
    }

    public synchronized int getFormat() {
        return this.f4637a.getFormat();
    }

    public synchronized int getHeight() {
        return this.f4637a.getHeight();
    }

    @C1415i0
    public synchronized Image getImage() {
        return this.f4637a.getImage();
    }

    public synchronized int getWidth() {
        return this.f4637a.getWidth();
    }

    @C0359n0
    /* renamed from: o2 */
    public synchronized C1353a2.C1354a[] mo4911o2() {
        return this.f4637a.mo4911o2();
    }

    @C0359n0
    /* renamed from: q3 */
    public synchronized C1741z1 mo4977q3() {
        return this.f4637a.mo4977q3();
    }

    /* renamed from: y1 */
    public synchronized void mo4978y1(@C0363p0 Rect rect) {
        this.f4637a.mo4978y1(rect);
    }
}
