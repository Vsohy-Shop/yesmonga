package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1663p0;
import androidx.camera.core.impl.C1500r0;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.b3 */
public class C1362b3 implements C1500r0 {

    /* renamed from: a */
    public final Object f3921a = new Object();
    @C0323b0("mLock")

    /* renamed from: b */
    public volatile int f3922b = 0;
    @C0323b0("mLock")

    /* renamed from: c */
    public volatile boolean f3923c = false;
    @C0323b0("mLock")

    /* renamed from: d */
    public final C1500r0 f3924d;
    @C0363p0

    /* renamed from: e */
    public final Surface f3925e;

    /* renamed from: f */
    public C1663p0.C1664a f3926f = new C1742z2(this);

    public C1362b3(@C0359n0 C1500r0 r0Var) {
        this.f3924d = r0Var;
        this.f3925e = r0Var.mo5002a();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m5734i(C1353a2 a2Var) {
        synchronized (this.f3921a) {
            this.f3922b--;
            if (this.f3923c && this.f3922b == 0) {
                close();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m5735j(C1500r0.C1501a aVar, C1500r0 r0Var) {
        aVar.mo4997a(this);
    }

    @C0363p0
    /* renamed from: a */
    public Surface mo5002a() {
        Surface a;
        synchronized (this.f3921a) {
            a = this.f3924d.mo5002a();
        }
        return a;
    }

    @C0363p0
    /* renamed from: c */
    public C1353a2 mo5003c() {
        C1353a2 l;
        synchronized (this.f3921a) {
            l = mo5013l(this.f3924d.mo5003c());
        }
        return l;
    }

    public void close() {
        synchronized (this.f3921a) {
            Surface surface = this.f3925e;
            if (surface != null) {
                surface.release();
            }
            this.f3924d.close();
        }
    }

    /* renamed from: d */
    public void mo5005d() {
        synchronized (this.f3921a) {
            this.f3924d.mo5005d();
        }
    }

    /* renamed from: e */
    public int mo5006e() {
        int e;
        synchronized (this.f3921a) {
            e = this.f3924d.mo5006e();
        }
        return e;
    }

    /* renamed from: f */
    public void mo5007f(@C0359n0 C1500r0.C1501a aVar, @C0359n0 Executor executor) {
        synchronized (this.f3921a) {
            this.f3924d.mo5007f(new C1355a3(this, aVar), executor);
        }
    }

    @C0363p0
    /* renamed from: g */
    public C1353a2 mo5008g() {
        C1353a2 l;
        synchronized (this.f3921a) {
            l = mo5013l(this.f3924d.mo5008g());
        }
        return l;
    }

    public int getHeight() {
        int height;
        synchronized (this.f3921a) {
            height = this.f3924d.getHeight();
        }
        return height;
    }

    public int getImageFormat() {
        int imageFormat;
        synchronized (this.f3921a) {
            imageFormat = this.f3924d.getImageFormat();
        }
        return imageFormat;
    }

    public int getWidth() {
        int width;
        synchronized (this.f3921a) {
            width = this.f3924d.getWidth();
        }
        return width;
    }

    @C0323b0("mLock")
    /* renamed from: k */
    public void mo5012k() {
        synchronized (this.f3921a) {
            this.f3923c = true;
            this.f3924d.mo5005d();
            if (this.f3922b == 0) {
                close();
            }
        }
    }

    @C0363p0
    @C0323b0("mLock")
    /* renamed from: l */
    public final C1353a2 mo5013l(@C0363p0 C1353a2 a2Var) {
        synchronized (this.f3921a) {
            if (a2Var == null) {
                return null;
            }
            this.f3922b++;
            C1393e3 e3Var = new C1393e3(a2Var);
            e3Var.mo5656a(this.f3926f);
            return e3Var;
        }
    }
}
