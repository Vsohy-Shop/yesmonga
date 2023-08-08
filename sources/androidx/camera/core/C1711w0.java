package androidx.camera.core;

import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1689t0;
import androidx.camera.core.impl.C1500r0;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.p027os.OperationCanceledException;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.w0 */
public abstract class C1711w0 implements C1500r0.C1501a {

    /* renamed from: f */
    public static final String f4754f = "ImageAnalysisAnalyzer";
    @C0323b0("mAnalyzerLock")

    /* renamed from: a */
    public C1689t0.C1690a f4755a;

    /* renamed from: b */
    public volatile int f4756b;
    @C0323b0("mAnalyzerLock")

    /* renamed from: c */
    public Executor f4757c;

    /* renamed from: d */
    public final Object f4758d = new Object();

    /* renamed from: e */
    public boolean f4759e = true;

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m6931i(C1353a2 a2Var, C1689t0.C1690a aVar, CallbackToFutureAdapter.C16559a aVar2) {
        if (this.f4759e) {
            aVar.mo5700a(new C1379c3(a2Var, C1412h2.m5903d(a2Var.mo4977q3().mo5101b(), a2Var.mo4977q3().getTimestamp(), this.f4756b)));
            aVar2.mo48125c(null);
            return;
        }
        aVar2.mo48128f(new OperationCanceledException("ImageAnalysis is detached"));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Object m6932j(Executor executor, C1353a2 a2Var, C1689t0.C1690a aVar, CallbackToFutureAdapter.C16559a aVar2) throws Exception {
        executor.execute(new C1706v0(this, a2Var, aVar, aVar2));
        return "analyzeImage";
    }

    /* renamed from: a */
    public void mo4997a(@C0359n0 C1500r0 r0Var) {
        try {
            C1353a2 d = mo5748d(r0Var);
            if (d != null) {
                mo5753k(d);
            }
        } catch (IllegalStateException e) {
            C1417i2.m5914d(f4754f, "Failed to acquire image.", e);
        }
    }

    @C0363p0
    /* renamed from: d */
    public abstract C1353a2 mo5748d(@C0359n0 C1500r0 r0Var);

    /* renamed from: e */
    public C32487a<Void> mo5749e(C1353a2 a2Var) {
        Executor executor;
        C1689t0.C1690a aVar;
        synchronized (this.f4758d) {
            executor = this.f4757c;
            aVar = this.f4755a;
        }
        if (aVar == null || executor == null) {
            return C1548f.m6477f(new OperationCanceledException("No analyzer or executor currently set."));
        }
        return CallbackToFutureAdapter.m74987a(new C1701u0(this, executor, a2Var, aVar));
    }

    /* renamed from: f */
    public void mo5750f() {
        this.f4759e = true;
    }

    /* renamed from: g */
    public abstract void mo5751g();

    /* renamed from: h */
    public void mo5752h() {
        this.f4759e = false;
        mo5751g();
    }

    /* renamed from: k */
    public abstract void mo5753k(@C0359n0 C1353a2 a2Var);

    /* renamed from: l */
    public void mo5754l(@C0363p0 Executor executor, @C0363p0 C1689t0.C1690a aVar) {
        synchronized (this.f4758d) {
            if (aVar == null) {
                mo5751g();
            }
            this.f4755a = aVar;
            this.f4757c = executor;
        }
    }

    /* renamed from: m */
    public void mo5755m(int i) {
        this.f4756b = i;
    }
}
