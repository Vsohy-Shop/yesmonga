package com.bumptech.glide.request;

import androidx.annotation.C0323b0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.request.RequestCoordinator;

/* renamed from: com.bumptech.glide.request.j */
public class C22563j implements RequestCoordinator, C22557e {
    @C0363p0

    /* renamed from: a */
    public final RequestCoordinator f57893a;

    /* renamed from: b */
    public final Object f57894b;

    /* renamed from: c */
    public volatile C22557e f57895c;

    /* renamed from: d */
    public volatile C22557e f57896d;
    @C0323b0("requestLock")

    /* renamed from: e */
    public RequestCoordinator.RequestState f57897e;
    @C0323b0("requestLock")

    /* renamed from: f */
    public RequestCoordinator.RequestState f57898f;
    @C0323b0("requestLock")

    /* renamed from: g */
    public boolean f57899g;

    public C22563j(Object obj, @C0363p0 RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f57897e = requestState;
        this.f57898f = requestState;
        this.f57894b = obj;
        this.f57893a = requestCoordinator;
    }

    /* renamed from: Z */
    public void mo66704Z() {
        synchronized (this.f57894b) {
            if (!this.f57898f.mo66701g()) {
                this.f57898f = RequestCoordinator.RequestState.PAUSED;
                this.f57896d.mo66704Z();
            }
            if (!this.f57897e.mo66701g()) {
                this.f57897e = RequestCoordinator.RequestState.PAUSED;
                this.f57895c.mo66704Z();
            }
        }
    }

    /* renamed from: a */
    public boolean mo66694a() {
        boolean z;
        synchronized (this.f57894b) {
            if (!this.f57896d.mo66705a()) {
                if (!this.f57895c.mo66705a()) {
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
        synchronized (this.f57894b) {
            if (this.f57897e == RequestCoordinator.RequestState.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo66695c(C22557e eVar) {
        boolean z;
        synchronized (this.f57894b) {
            if (!mo66837l() || !eVar.equals(this.f57895c) || mo66694a()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public void clear() {
        synchronized (this.f57894b) {
            this.f57899g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f57897e = requestState;
            this.f57898f = requestState;
            this.f57896d.clear();
            this.f57895c.clear();
        }
    }

    /* renamed from: d */
    public boolean mo66696d(C22557e eVar) {
        boolean z;
        synchronized (this.f57894b) {
            if (!mo66838m() || (!eVar.equals(this.f57895c) && this.f57897e == RequestCoordinator.RequestState.SUCCESS)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66697e(com.bumptech.glide.request.C22557e r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f57894b
            monitor-enter(r0)
            com.bumptech.glide.request.e r1 = r2.f57895c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x001e }
            r2.f57898f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x001e }
            r2.f57897e = r3     // Catch:{ all -> 0x001e }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f57893a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo66697e(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22563j.mo66697e(com.bumptech.glide.request.e):void");
    }

    /* renamed from: f */
    public boolean mo66711f() {
        boolean z;
        synchronized (this.f57894b) {
            if (this.f57897e == RequestCoordinator.RequestState.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66698g(com.bumptech.glide.request.C22557e r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f57894b
            monitor-enter(r0)
            com.bumptech.glide.request.e r1 = r2.f57896d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f57898f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f57897e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f57893a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.mo66698g(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f57898f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.mo66701g()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            com.bumptech.glide.request.e r3 = r2.f57896d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22563j.mo66698g(com.bumptech.glide.request.e):void");
    }

    public RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f57894b) {
            RequestCoordinator requestCoordinator2 = this.f57893a;
            if (requestCoordinator2 != null) {
                requestCoordinator = requestCoordinator2.getRoot();
            } else {
                requestCoordinator = this;
            }
        }
        return requestCoordinator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo66713h(com.bumptech.glide.request.C22557e r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.C22563j
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.bumptech.glide.request.j r4 = (com.bumptech.glide.request.C22563j) r4
            com.bumptech.glide.request.e r0 = r3.f57895c
            if (r0 != 0) goto L_0x0010
            com.bumptech.glide.request.e r0 = r4.f57895c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            com.bumptech.glide.request.e r0 = r3.f57895c
            com.bumptech.glide.request.e r2 = r4.f57895c
            boolean r0 = r0.mo66713h(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            com.bumptech.glide.request.e r0 = r3.f57896d
            if (r0 != 0) goto L_0x0023
            com.bumptech.glide.request.e r4 = r4.f57896d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            com.bumptech.glide.request.e r0 = r3.f57896d
            com.bumptech.glide.request.e r4 = r4.f57896d
            boolean r4 = r0.mo66713h(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22563j.mo66713h(com.bumptech.glide.request.e):boolean");
    }

    /* renamed from: i */
    public void mo66714i() {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2;
        synchronized (this.f57894b) {
            this.f57899g = true;
            try {
                if (!(this.f57897e == RequestCoordinator.RequestState.SUCCESS || this.f57898f == (requestState2 = RequestCoordinator.RequestState.f57775a))) {
                    this.f57898f = requestState2;
                    this.f57896d.mo66714i();
                }
                if (this.f57899g && this.f57897e != (requestState = RequestCoordinator.RequestState.f57775a)) {
                    this.f57897e = requestState;
                    this.f57895c.mo66714i();
                }
            } finally {
                this.f57899g = false;
            }
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f57894b) {
            if (this.f57897e == RequestCoordinator.RequestState.f57775a) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo66700j(C22557e eVar) {
        boolean z;
        synchronized (this.f57894b) {
            if (!mo66836k() || !eVar.equals(this.f57895c) || this.f57897e == RequestCoordinator.RequestState.PAUSED) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    @C0323b0("requestLock")
    /* renamed from: k */
    public final boolean mo66836k() {
        RequestCoordinator requestCoordinator = this.f57893a;
        return requestCoordinator == null || requestCoordinator.mo66700j(this);
    }

    @C0323b0("requestLock")
    /* renamed from: l */
    public final boolean mo66837l() {
        RequestCoordinator requestCoordinator = this.f57893a;
        return requestCoordinator == null || requestCoordinator.mo66695c(this);
    }

    @C0323b0("requestLock")
    /* renamed from: m */
    public final boolean mo66838m() {
        RequestCoordinator requestCoordinator = this.f57893a;
        return requestCoordinator == null || requestCoordinator.mo66696d(this);
    }

    /* renamed from: n */
    public void mo66839n(C22557e eVar, C22557e eVar2) {
        this.f57895c = eVar;
        this.f57896d = eVar2;
    }
}
