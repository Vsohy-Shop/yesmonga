package androidx.camera.lifecycle;

import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1624j;
import androidx.camera.core.C1641m;
import androidx.camera.core.CameraControl;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C1464j;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.C19428i0;
import androidx.lifecycle.C19475v;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

final class LifecycleCamera implements C19475v, C1624j {

    /* renamed from: a */
    public final Object f4813a = new Object();
    @C0323b0("mLock")

    /* renamed from: b */
    public final C19499w f4814b;

    /* renamed from: c */
    public final CameraUseCaseAdapter f4815c;
    @C0323b0("mLock")

    /* renamed from: d */
    public volatile boolean f4816d = false;
    @C0323b0("mLock")

    /* renamed from: e */
    public boolean f4817e = false;
    @C0323b0("mLock")

    /* renamed from: f */
    public boolean f4818f = false;

    public LifecycleCamera(C19499w wVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f4814b = wVar;
        this.f4815c = cameraUseCaseAdapter;
        if (wVar.getLifecycle().mo57465b().mo57474q(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.mo5577g();
        } else {
            cameraUseCaseAdapter.mo5581p();
        }
        wVar.getLifecycle().mo57464a(this);
    }

    @C0359n0
    /* renamed from: a */
    public CameraControl mo5119a() {
        return this.f4815c.mo5119a();
    }

    @C0359n0
    /* renamed from: b */
    public C1464j mo5120b() {
        return this.f4815c.mo5120b();
    }

    @C0359n0
    /* renamed from: c */
    public C1641m mo5121c() {
        return this.f4815c.mo5121c();
    }

    /* renamed from: d */
    public void mo5122d(@C0363p0 C1464j jVar) throws CameraUseCaseAdapter.CameraException {
        this.f4815c.mo5122d(jVar);
    }

    @C0359n0
    /* renamed from: e */
    public LinkedHashSet<CameraInternal> mo5123e() {
        return this.f4815c.mo5123e();
    }

    /* renamed from: g */
    public void mo5772g(Collection<UseCase> collection) throws CameraUseCaseAdapter.CameraException {
        synchronized (this.f4813a) {
            this.f4815c.mo5576f(collection);
        }
    }

    /* renamed from: n */
    public CameraUseCaseAdapter mo5773n() {
        return this.f4815c;
    }

    /* renamed from: o */
    public C19499w mo5774o() {
        C19499w wVar;
        synchronized (this.f4813a) {
            wVar = this.f4814b;
        }
        return wVar;
    }

    @C19428i0(Lifecycle.C19372Event.ON_DESTROY)
    public void onDestroy(C19499w wVar) {
        synchronized (this.f4813a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f4815c;
            cameraUseCaseAdapter.mo5586v(cameraUseCaseAdapter.mo5584t());
        }
    }

    @C19428i0(Lifecycle.C19372Event.ON_START)
    public void onStart(C19499w wVar) {
        synchronized (this.f4813a) {
            if (!this.f4817e && !this.f4818f) {
                this.f4815c.mo5577g();
                this.f4816d = true;
            }
        }
    }

    @C19428i0(Lifecycle.C19372Event.ON_STOP)
    public void onStop(C19499w wVar) {
        synchronized (this.f4813a) {
            if (!this.f4817e && !this.f4818f) {
                this.f4815c.mo5581p();
                this.f4816d = false;
            }
        }
    }

    @C0359n0
    /* renamed from: p */
    public List<UseCase> mo5778p() {
        List<UseCase> unmodifiableList;
        synchronized (this.f4813a) {
            unmodifiableList = Collections.unmodifiableList(this.f4815c.mo5584t());
        }
        return unmodifiableList;
    }

    /* renamed from: q */
    public boolean mo5779q() {
        boolean z;
        synchronized (this.f4813a) {
            z = this.f4816d;
        }
        return z;
    }

    /* renamed from: r */
    public boolean mo5780r(@C0359n0 UseCase useCase) {
        boolean contains;
        synchronized (this.f4813a) {
            contains = this.f4815c.mo5584t().contains(useCase);
        }
        return contains;
    }

    /* renamed from: s */
    public void mo5781s() {
        synchronized (this.f4813a) {
            this.f4818f = true;
            this.f4816d = false;
            this.f4814b.getLifecycle().mo57467d(this);
        }
    }

    /* renamed from: t */
    public void mo5782t() {
        synchronized (this.f4813a) {
            if (!this.f4817e) {
                onStop(this.f4814b);
                this.f4817e = true;
            }
        }
    }

    /* renamed from: u */
    public void mo5783u(Collection<UseCase> collection) {
        synchronized (this.f4813a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f4815c.mo5584t());
            this.f4815c.mo5586v(arrayList);
        }
    }

    /* renamed from: w */
    public void mo5784w() {
        synchronized (this.f4813a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f4815c;
            cameraUseCaseAdapter.mo5586v(cameraUseCaseAdapter.mo5584t());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5785x() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4813a
            monitor-enter(r0)
            boolean r1 = r3.f4817e     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0009:
            r1 = 0
            r3.f4817e = r1     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.w r1 = r3.f4814b     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.Lifecycle$State r1 = r1.mo57465b()     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.mo57474q(r2)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            androidx.lifecycle.w r1 = r3.f4814b     // Catch:{ all -> 0x0025 }
            r3.onStart(r1)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCamera.mo5785x():void");
    }
}
