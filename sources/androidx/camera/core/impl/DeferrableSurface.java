package androidx.camera.core.impl;

import android.util.Log;
import android.view.Surface;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.C1417i2;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class DeferrableSurface {

    /* renamed from: f */
    public static final String f4134f = "DeferrableSurface";

    /* renamed from: g */
    public static final boolean f4135g = C1417i2.m5917g(f4134f);

    /* renamed from: h */
    public static final AtomicInteger f4136h = new AtomicInteger(0);

    /* renamed from: i */
    public static final AtomicInteger f4137i = new AtomicInteger(0);

    /* renamed from: a */
    public final Object f4138a = new Object();
    @C0323b0("mLock")

    /* renamed from: b */
    public int f4139b = 0;
    @C0323b0("mLock")

    /* renamed from: c */
    public boolean f4140c = false;
    @C0323b0("mLock")

    /* renamed from: d */
    public CallbackToFutureAdapter.C16559a<Void> f4141d;

    /* renamed from: e */
    public final C32487a<Void> f4142e;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SurfaceClosedException extends Exception {
        DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(@C0359n0 String str, @C0359n0 DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        @C0359n0
        /* renamed from: a */
        public DeferrableSurface mo5143a() {
            return this.mDeferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(@C0359n0 String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        C32487a<Void> a = CallbackToFutureAdapter.m74987a(new C1440c0(this));
        this.f4142e = a;
        if (C1417i2.m5917g(f4134f)) {
            mo5142k("Surface created", f4137i.incrementAndGet(), f4136h.get());
            a.mo5489q(new C1443d0(this, Log.getStackTraceString(new Exception())), C1525a.m6437a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object m5988i(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        synchronized (this.f4138a) {
            this.f4141d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m5989j(String str) {
        try {
            this.f4142e.get();
            mo5142k("Surface terminated", f4137i.decrementAndGet(), f4136h.get());
        } catch (Exception e) {
            C1417i2.m5913c(f4134f, "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f4138a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", new Object[]{this, Boolean.valueOf(this.f4140c), Integer.valueOf(this.f4139b)}), e);
            }
        }
    }

    /* renamed from: c */
    public final void mo5136c() {
        CallbackToFutureAdapter.C16559a<Void> aVar;
        synchronized (this.f4138a) {
            if (!this.f4140c) {
                this.f4140c = true;
                if (this.f4139b == 0) {
                    aVar = this.f4141d;
                    this.f4141d = null;
                } else {
                    aVar = null;
                }
                if (C1417i2.m5917g(f4134f)) {
                    C1417i2.m5911a(f4134f, "surface closed,  useCount=" + this.f4139b + " closed=true " + this);
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.mo48125c(null);
        }
    }

    /* renamed from: d */
    public void mo5137d() {
        CallbackToFutureAdapter.C16559a<Void> aVar;
        synchronized (this.f4138a) {
            int i = this.f4139b;
            if (i != 0) {
                int i2 = i - 1;
                this.f4139b = i2;
                if (i2 != 0 || !this.f4140c) {
                    aVar = null;
                } else {
                    aVar = this.f4141d;
                    this.f4141d = null;
                }
                if (C1417i2.m5917g(f4134f)) {
                    C1417i2.m5911a(f4134f, "use count-1,  useCount=" + this.f4139b + " closed=" + this.f4140c + " " + this);
                    if (this.f4139b == 0) {
                        mo5142k("Surface no longer in use", f4137i.get(), f4136h.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.mo48125c(null);
        }
    }

    @C0359n0
    /* renamed from: e */
    public final C32487a<Surface> mo5138e() {
        synchronized (this.f4138a) {
            if (this.f4140c) {
                C32487a<Surface> f = C1548f.m6477f(new SurfaceClosedException("DeferrableSurface already closed.", this));
                return f;
            }
            C32487a<Surface> l = mo4935l();
            return l;
        }
    }

    @C0359n0
    /* renamed from: f */
    public C32487a<Void> mo5139f() {
        return C1548f.m6481j(this.f4142e);
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: g */
    public int mo5140g() {
        int i;
        synchronized (this.f4138a) {
            i = this.f4139b;
        }
        return i;
    }

    /* renamed from: h */
    public void mo5141h() throws SurfaceClosedException {
        synchronized (this.f4138a) {
            int i = this.f4139b;
            if (i == 0) {
                if (this.f4140c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
            }
            this.f4139b = i + 1;
            if (C1417i2.m5917g(f4134f)) {
                if (this.f4139b == 1) {
                    mo5142k("New surface in use", f4137i.get(), f4136h.incrementAndGet());
                }
                C1417i2.m5911a(f4134f, "use count+1, useCount=" + this.f4139b + " " + this);
            }
        }
    }

    /* renamed from: k */
    public final void mo5142k(@C0359n0 String str, int i, int i2) {
        if (!f4135g && C1417i2.m5917g(f4134f)) {
            C1417i2.m5911a(f4134f, "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C1417i2.m5911a(f4134f, str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    @C0359n0
    /* renamed from: l */
    public abstract C32487a<Surface> mo4935l();
}
