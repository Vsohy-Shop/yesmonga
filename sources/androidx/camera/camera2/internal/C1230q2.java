package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.camera.core.C1417i2;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1545d;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.camera2.internal.q2 */
public class C1230q2 extends C1211m2 {

    /* renamed from: y */
    public static final String f3527y = "SyncCaptureSessionImpl";

    /* renamed from: p */
    public final Object f3528p = new Object();
    @C0359n0

    /* renamed from: q */
    public final Set<String> f3529q;
    @C0359n0

    /* renamed from: r */
    public final C32487a<Void> f3530r;

    /* renamed from: s */
    public CallbackToFutureAdapter.C16559a<Void> f3531s;
    @C0363p0
    @C0323b0("mObjectLock")

    /* renamed from: t */
    public List<DeferrableSurface> f3532t;
    @C0363p0
    @C0323b0("mObjectLock")

    /* renamed from: u */
    public C32487a<Void> f3533u;
    @C0363p0
    @C0323b0("mObjectLock")

    /* renamed from: v */
    public C32487a<List<Surface>> f3534v;
    @C0323b0("mObjectLock")

    /* renamed from: w */
    public boolean f3535w;

    /* renamed from: x */
    public final CameraCaptureSession.CaptureCallback f3536x = new C1231a();

    /* renamed from: androidx.camera.camera2.internal.q2$a */
    public class C1231a extends CameraCaptureSession.CaptureCallback {
        public C1231a() {
        }

        public void onCaptureSequenceAborted(@C0359n0 CameraCaptureSession cameraCaptureSession, int i) {
            CallbackToFutureAdapter.C16559a<Void> aVar = C1230q2.this.f3531s;
            if (aVar != null) {
                aVar.mo48126d();
                C1230q2.this.f3531s = null;
            }
        }

        public void onCaptureStarted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, long j, long j2) {
            CallbackToFutureAdapter.C16559a<Void> aVar = C1230q2.this.f3531s;
            if (aVar != null) {
                aVar.mo48125c(null);
                C1230q2.this.f3531s = null;
            }
        }
    }

    public C1230q2(@C0359n0 Set<String> set, @C0359n0 C1209m1 m1Var, @C0359n0 Executor executor, @C0359n0 ScheduledExecutorService scheduledExecutorService, @C0359n0 Handler handler) {
        super(m1Var, executor, scheduledExecutorService, handler);
        this.f3529q = set;
        if (set.contains(C1237r2.f3549d)) {
            this.f3530r = CallbackToFutureAdapter.m74987a(new C1225p2(this));
        } else {
            this.f3530r = C1548f.m6479h(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m5079J() {
        mo4614T("Session call super.close()");
        super.close();
    }

    /* renamed from: U */
    public static void m5083U(@C0359n0 Set<C1185g2> set) {
        for (C1185g2 next : set) {
            next.mo4516f().mo4530v(next);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ Object m5084X(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3531s = aVar;
        return "StartStreamingFuture[session=" + this + "]";
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ C32487a m5085Y(CameraDevice cameraDevice, C1122z zVar, List list, List list2) throws Exception {
        return super.mo4570l(cameraDevice, zVar, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4613S() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3528p
            monitor-enter(r0)
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r1 = r3.f3532t     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "deferrableSurface == null, maybe forceClose, skip close"
            r3.mo4614T(r1)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x000e:
            java.util.Set<java.lang.String> r1 = r3.f3529q     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = "deferrableSurface_close"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0033
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r1 = r3.f3532t     // Catch:{ all -> 0x0035 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0035 }
        L_0x001e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0035 }
            androidx.camera.core.impl.DeferrableSurface r2 = (androidx.camera.core.impl.DeferrableSurface) r2     // Catch:{ all -> 0x0035 }
            r2.mo5136c()     // Catch:{ all -> 0x0035 }
            goto L_0x001e
        L_0x002e:
            java.lang.String r1 = "deferrableSurface closed"
            r3.mo4614T(r1)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C1230q2.mo4613S():void");
    }

    /* renamed from: T */
    public void mo4614T(String str) {
        C1417i2.m5911a(f3527y, "[" + this + "] " + str);
    }

    /* renamed from: V */
    public final void mo4615V(@C0359n0 Set<C1185g2> set) {
        for (C1185g2 next : set) {
            next.mo4516f().mo4201w(next);
        }
    }

    /* renamed from: W */
    public final List<C32487a<Void>> mo4616W(@C0359n0 String str, List<C1185g2> list) {
        ArrayList arrayList = new ArrayList();
        for (C1185g2 o : list) {
            arrayList.add(o.mo4522o(str));
        }
        return arrayList;
    }

    public void close() {
        mo4614T("Session call close()");
        if (this.f3529q.contains(C1237r2.f3549d)) {
            synchronized (this.f3528p) {
                if (!this.f3535w) {
                    this.f3530r.cancel(true);
                }
            }
        }
        this.f3530r.mo5489q(new C1217n2(this), mo4569a());
    }

    /* renamed from: k */
    public int mo4521k(@C0359n0 CaptureRequest captureRequest, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        int k;
        if (!this.f3529q.contains(C1237r2.f3549d)) {
            return super.mo4521k(captureRequest, captureCallback);
        }
        synchronized (this.f3528p) {
            this.f3535w = true;
            k = super.mo4521k(captureRequest, C1233r0.m5098b(this.f3536x, captureCallback));
        }
        return k;
    }

    @C0359n0
    /* renamed from: l */
    public C32487a<Void> mo4570l(@C0359n0 CameraDevice cameraDevice, @C0359n0 C1122z zVar, @C0359n0 List<DeferrableSurface> list) {
        C32487a<Void> j;
        synchronized (this.f3528p) {
            C1545d<T> f = C1545d.m6463b(C1548f.m6485n(mo4616W(C1237r2.f3549d, this.f3471b.mo4551e()))).mo5486f(new C1221o2(this, cameraDevice, zVar, list), C1525a.m6437a());
            this.f3533u = f;
            j = C1548f.m6481j(f);
        }
        return j;
    }

    @C0359n0
    /* renamed from: n */
    public C32487a<List<Surface>> mo4572n(@C0359n0 List<DeferrableSurface> list, long j) {
        C32487a<List<Surface>> j2;
        synchronized (this.f3528p) {
            this.f3532t = list;
            j2 = C1548f.m6481j(super.mo4572n(list, j));
        }
        return j2;
    }

    @C0359n0
    /* renamed from: o */
    public C32487a<Void> mo4522o(@C0359n0 String str) {
        str.hashCode();
        if (!str.equals(C1237r2.f3549d)) {
            return super.mo4522o(str);
        }
        return C1548f.m6481j(this.f3530r);
    }

    public boolean stop() {
        boolean stop;
        synchronized (this.f3528p) {
            if (mo4567I()) {
                mo4613S();
            } else {
                C32487a<Void> aVar = this.f3533u;
                if (aVar != null) {
                    aVar.cancel(true);
                }
                C32487a<List<Surface>> aVar2 = this.f3534v;
                if (aVar2 != null) {
                    aVar2.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }

    /* renamed from: v */
    public void mo4530v(@C0359n0 C1185g2 g2Var) {
        mo4613S();
        mo4614T("onClosed()");
        super.mo4530v(g2Var);
    }

    /* renamed from: x */
    public void mo4202x(@C0359n0 C1185g2 g2Var) {
        C1185g2 next;
        C1185g2 next2;
        mo4614T("Session onConfigured()");
        if (this.f3529q.contains(C1237r2.f3547b)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<C1185g2> it = this.f3471b.mo4552f().iterator();
            while (it.hasNext() && (next2 = it.next()) != g2Var) {
                linkedHashSet.add(next2);
            }
            mo4615V(linkedHashSet);
        }
        super.mo4202x(g2Var);
        if (this.f3529q.contains(C1237r2.f3547b)) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<C1185g2> it2 = this.f3471b.mo4550d().iterator();
            while (it2.hasNext() && (next = it2.next()) != g2Var) {
                linkedHashSet2.add(next);
            }
            m5083U(linkedHashSet2);
        }
    }
}
