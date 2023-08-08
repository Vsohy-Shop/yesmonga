package com.bumptech.glide.request;

import androidx.annotation.C0323b0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.request.RequestCoordinator;

/* renamed from: com.bumptech.glide.request.b */
public final class C22554b implements RequestCoordinator, C22557e {

    /* renamed from: a */
    public final Object f57868a;
    @C0363p0

    /* renamed from: b */
    public final RequestCoordinator f57869b;

    /* renamed from: c */
    public volatile C22557e f57870c;

    /* renamed from: d */
    public volatile C22557e f57871d;
    @C0323b0("requestLock")

    /* renamed from: e */
    public RequestCoordinator.RequestState f57872e;
    @C0323b0("requestLock")

    /* renamed from: f */
    public RequestCoordinator.RequestState f57873f;

    public C22554b(Object obj, @C0363p0 RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f57872e = requestState;
        this.f57873f = requestState;
        this.f57868a = obj;
        this.f57869b = requestCoordinator;
    }

    /* renamed from: Z */
    public void mo66704Z() {
        synchronized (this.f57868a) {
            RequestCoordinator.RequestState requestState = this.f57872e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.f57775a;
            if (requestState == requestState2) {
                this.f57872e = RequestCoordinator.RequestState.PAUSED;
                this.f57870c.mo66704Z();
            }
            if (this.f57873f == requestState2) {
                this.f57873f = RequestCoordinator.RequestState.PAUSED;
                this.f57871d.mo66704Z();
            }
        }
    }

    /* renamed from: a */
    public boolean mo66694a() {
        boolean z;
        synchronized (this.f57868a) {
            if (!this.f57870c.mo66705a()) {
                if (!this.f57871d.mo66705a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo66706b() {
        boolean z;
        synchronized (this.f57868a) {
            RequestCoordinator.RequestState requestState = this.f57872e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            if (requestState != requestState2) {
                if (this.f57873f != requestState2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo66695c(C22557e eVar) {
        boolean z;
        synchronized (this.f57868a) {
            if (!mo66820m() || !mo66818k(eVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public void clear() {
        synchronized (this.f57868a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f57872e = requestState;
            this.f57870c.clear();
            if (this.f57873f != requestState) {
                this.f57873f = requestState;
                this.f57871d.clear();
            }
        }
    }

    /* renamed from: d */
    public boolean mo66696d(C22557e eVar) {
        boolean z;
        synchronized (this.f57868a) {
            if (!mo66821n() || !mo66818k(eVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66697e(com.bumptech.glide.request.C22557e r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f57868a
            monitor-enter(r0)
            com.bumptech.glide.request.e r1 = r2.f57871d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x002b }
            r2.f57872e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f57873f     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.f57775a     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f57873f = r1     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.e r3 = r2.f57871d     // Catch:{ all -> 0x002b }
            r3.mo66714i()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x002b }
            r2.f57873f = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f57869b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo66697e(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22554b.mo66697e(com.bumptech.glide.request.e):void");
    }

    /* renamed from: f */
    public boolean mo66711f() {
        boolean z;
        synchronized (this.f57868a) {
            RequestCoordinator.RequestState requestState = this.f57872e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            if (requestState == requestState2 && this.f57873f == requestState2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    public void mo66698g(C22557e eVar) {
        synchronized (this.f57868a) {
            if (eVar.equals(this.f57870c)) {
                this.f57872e = RequestCoordinator.RequestState.SUCCESS;
            } else if (eVar.equals(this.f57871d)) {
                this.f57873f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f57869b;
            if (requestCoordinator != null) {
                requestCoordinator.mo66698g(this);
            }
        }
    }

    public RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f57868a) {
            RequestCoordinator requestCoordinator2 = this.f57869b;
            if (requestCoordinator2 != null) {
                requestCoordinator = requestCoordinator2.getRoot();
            } else {
                requestCoordinator = this;
            }
        }
        return requestCoordinator;
    }

    /* renamed from: h */
    public boolean mo66713h(C22557e eVar) {
        if (!(eVar instanceof C22554b)) {
            return false;
        }
        C22554b bVar = (C22554b) eVar;
        if (!this.f57870c.mo66713h(bVar.f57870c) || !this.f57871d.mo66713h(bVar.f57871d)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void mo66714i() {
        synchronized (this.f57868a) {
            RequestCoordinator.RequestState requestState = this.f57872e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.f57775a;
            if (requestState != requestState2) {
                this.f57872e = requestState2;
                this.f57870c.mo66714i();
            }
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f57868a) {
            RequestCoordinator.RequestState requestState = this.f57872e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.f57775a;
            if (requestState != requestState2) {
                if (this.f57873f != requestState2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo66700j(C22557e eVar) {
        boolean z;
        synchronized (this.f57868a) {
            if (!mo66819l() || !mo66818k(eVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    @C0323b0("requestLock")
    /* renamed from: k */
    public final boolean mo66818k(C22557e eVar) {
        if (eVar.equals(this.f57870c) || (this.f57872e == RequestCoordinator.RequestState.FAILED && eVar.equals(this.f57871d))) {
            return true;
        }
        return false;
    }

    @C0323b0("requestLock")
    /* renamed from: l */
    public final boolean mo66819l() {
        RequestCoordinator requestCoordinator = this.f57869b;
        return requestCoordinator == null || requestCoordinator.mo66700j(this);
    }

    @C0323b0("requestLock")
    /* renamed from: m */
    public final boolean mo66820m() {
        RequestCoordinator requestCoordinator = this.f57869b;
        return requestCoordinator == null || requestCoordinator.mo66695c(this);
    }

    @C0323b0("requestLock")
    /* renamed from: n */
    public final boolean mo66821n() {
        RequestCoordinator requestCoordinator = this.f57869b;
        return requestCoordinator == null || requestCoordinator.mo66696d(this);
    }

    /* renamed from: o */
    public void mo66822o(C22557e eVar, C22557e eVar2) {
        this.f57870c = eVar;
        this.f57871d = eVar2;
    }
}
