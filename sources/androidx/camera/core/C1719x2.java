package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.C1430a0;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1459h1;
import androidx.camera.core.impl.C1500r0;
import androidx.camera.core.impl.C1587z;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1548f;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.core.x2 */
public final class C1719x2 extends DeferrableSurface {

    /* renamed from: v */
    public static final String f4776v = "ProcessingSurfaceTextur";

    /* renamed from: w */
    public static final int f4777w = 2;

    /* renamed from: j */
    public final Object f4778j = new Object();

    /* renamed from: k */
    public final C1500r0.C1501a f4779k;
    @C0323b0("mLock")

    /* renamed from: l */
    public boolean f4780l;
    @C0359n0

    /* renamed from: m */
    public final Size f4781m;
    @C0323b0("mLock")

    /* renamed from: n */
    public final C1638l2 f4782n;
    @C0323b0("mLock")

    /* renamed from: o */
    public final Surface f4783o;

    /* renamed from: p */
    public final Handler f4784p;

    /* renamed from: q */
    public final C1430a0 f4785q;
    @C0323b0("mLock")
    @C0359n0

    /* renamed from: r */
    public final C1587z f4786r;

    /* renamed from: s */
    public final C1448f f4787s;

    /* renamed from: t */
    public final DeferrableSurface f4788t;

    /* renamed from: u */
    public String f4789u;

    /* renamed from: androidx.camera.core.x2$a */
    public class C1720a implements C1544c<Surface> {
        public C1720a() {
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            C1417i2.m5914d(C1719x2.f4776v, "Failed to extract Listenable<Surface>.", th);
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Surface surface) {
            synchronized (C1719x2.this.f4778j) {
                C1719x2.this.f4786r.mo5571a(surface, 1);
            }
        }
    }

    public C1719x2(int i, int i2, int i3, @C0363p0 Handler handler, @C0359n0 C1430a0 a0Var, @C0359n0 C1587z zVar, @C0359n0 DeferrableSurface deferrableSurface, @C0359n0 String str) {
        C1708v2 v2Var = new C1708v2(this);
        this.f4779k = v2Var;
        this.f4780l = false;
        Size size = new Size(i, i2);
        this.f4781m = size;
        if (handler != null) {
            this.f4784p = handler;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.f4784p = new Handler(myLooper);
            } else {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
        }
        ScheduledExecutorService g = C1525a.m6443g(this.f4784p);
        C1638l2 l2Var = new C1638l2(i, i2, i3, 2);
        this.f4782n = l2Var;
        l2Var.mo5007f(v2Var, g);
        this.f4783o = l2Var.mo5002a();
        this.f4787s = l2Var.mo5619m();
        this.f4786r = zVar;
        zVar.mo5572b(size);
        this.f4785q = a0Var;
        this.f4788t = deferrableSurface;
        this.f4789u = str;
        C1548f.m6473b(deferrableSurface.mo5138e(), new C1720a(), C1525a.m6437a());
        mo5139f().mo5489q(new C1713w2(this), C1525a.m6437a());
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m6952q(C1500r0 r0Var) {
        synchronized (this.f4778j) {
            mo5761p(r0Var);
        }
    }

    @C0359n0
    /* renamed from: l */
    public C32487a<Surface> mo4935l() {
        C32487a<Surface> h;
        synchronized (this.f4778j) {
            h = C1548f.m6479h(this.f4783o);
        }
        return h;
    }

    @C0363p0
    /* renamed from: o */
    public C1448f mo5760o() {
        C1448f fVar;
        synchronized (this.f4778j) {
            if (!this.f4780l) {
                fVar = this.f4787s;
            } else {
                throw new IllegalStateException("ProcessingSurface already released!");
            }
        }
        return fVar;
    }

    @C0323b0("mLock")
    /* renamed from: p */
    public void mo5761p(C1500r0 r0Var) {
        C1353a2 a2Var;
        if (!this.f4780l) {
            try {
                a2Var = r0Var.mo5008g();
            } catch (IllegalStateException e) {
                C1417i2.m5914d(f4776v, "Failed to acquire next image.", e);
                a2Var = null;
            }
            if (a2Var != null) {
                C1741z1 q3 = a2Var.mo4977q3();
                if (q3 == null) {
                    a2Var.close();
                    return;
                }
                Integer d = q3.mo5101b().mo5239d(this.f4789u);
                if (d == null) {
                    a2Var.close();
                } else if (this.f4785q.getId() != d.intValue()) {
                    C1417i2.m5924n(f4776v, "ImageProxyBundle does not contain this id: " + d);
                    a2Var.close();
                } else {
                    C1459h1 h1Var = new C1459h1(a2Var, this.f4789u);
                    this.f4786r.mo5573c(h1Var);
                    h1Var.mo5223c();
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo5762r() {
        synchronized (this.f4778j) {
            if (!this.f4780l) {
                this.f4782n.close();
                this.f4783o.release();
                this.f4788t.mo5136c();
                this.f4780l = true;
            }
        }
    }
}
