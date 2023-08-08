package androidx.camera.core.impl;

import androidx.annotation.C0323b0;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.C1624j;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.C18001r;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.camera.core.impl.v */
public final class C1568v {

    /* renamed from: f */
    public static final String f4469f = "CameraStateRegistry";

    /* renamed from: a */
    public final StringBuilder f4470a = new StringBuilder();

    /* renamed from: b */
    public final Object f4471b = new Object();

    /* renamed from: c */
    public final int f4472c;
    @C0323b0("mLock")

    /* renamed from: d */
    public final Map<C1624j, C1569a> f4473d = new HashMap();
    @C0323b0("mLock")

    /* renamed from: e */
    public int f4474e;

    /* renamed from: androidx.camera.core.impl.v$a */
    public static class C1569a {

        /* renamed from: a */
        public CameraInternal.State f4475a;

        /* renamed from: b */
        public final Executor f4476b;

        /* renamed from: c */
        public final C1570b f4477c;

        public C1569a(@C0363p0 CameraInternal.State state, @C0359n0 Executor executor, @C0359n0 C1570b bVar) {
            this.f4475a = state;
            this.f4476b = executor;
            this.f4477c = bVar;
        }

        /* renamed from: a */
        public CameraInternal.State mo5526a() {
            return this.f4475a;
        }

        /* renamed from: b */
        public void mo5527b() {
            try {
                Executor executor = this.f4476b;
                C1570b bVar = this.f4477c;
                Objects.requireNonNull(bVar);
                executor.execute(new C1506u(bVar));
            } catch (RejectedExecutionException e) {
                C1417i2.m5914d(C1568v.f4469f, "Unable to notify camera.", e);
            }
        }

        /* renamed from: c */
        public CameraInternal.State mo5528c(@C0363p0 CameraInternal.State state) {
            CameraInternal.State state2 = this.f4475a;
            this.f4475a = state;
            return state2;
        }
    }

    /* renamed from: androidx.camera.core.impl.v$b */
    public interface C1570b {
        /* renamed from: a */
        void mo4164a();
    }

    public C1568v(int i) {
        this.f4472c = i;
        synchronized ("mLock") {
            this.f4474e = i;
        }
    }

    /* renamed from: a */
    public static boolean m6509a(@C0363p0 CameraInternal.State state) {
        return state != null && state.mo5124g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (r5.hasNext() == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        ((androidx.camera.core.impl.C1568v.C1569a) r5.next()).mo5527b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5520b(@androidx.annotation.C0359n0 androidx.camera.core.C1624j r5, @androidx.annotation.C0359n0 androidx.camera.core.impl.CameraInternal.State r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4471b
            monitor-enter(r0)
            int r1 = r4.f4474e     // Catch:{ all -> 0x007e }
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.RELEASED     // Catch:{ all -> 0x007e }
            if (r6 != r2) goto L_0x000e
            androidx.camera.core.impl.CameraInternal$State r2 = r4.mo5524f(r5)     // Catch:{ all -> 0x007e }
            goto L_0x0012
        L_0x000e:
            androidx.camera.core.impl.CameraInternal$State r2 = r4.mo5525g(r5, r6)     // Catch:{ all -> 0x007e }
        L_0x0012:
            if (r2 != r6) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            return
        L_0x0016:
            r2 = 1
            if (r1 >= r2) goto L_0x0050
            int r1 = r4.f4474e     // Catch:{ all -> 0x007e }
            if (r1 <= 0) goto L_0x0050
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x007e }
            r5.<init>()     // Catch:{ all -> 0x007e }
            java.util.Map<androidx.camera.core.j, androidx.camera.core.impl.v$a> r6 = r4.f4473d     // Catch:{ all -> 0x007e }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x007e }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x007e }
        L_0x002c:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x007e }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x007e }
            androidx.camera.core.impl.v$a r2 = (androidx.camera.core.impl.C1568v.C1569a) r2     // Catch:{ all -> 0x007e }
            androidx.camera.core.impl.CameraInternal$State r2 = r2.mo5526a()     // Catch:{ all -> 0x007e }
            androidx.camera.core.impl.CameraInternal$State r3 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch:{ all -> 0x007e }
            if (r2 != r3) goto L_0x002c
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x007e }
            androidx.camera.core.impl.v$a r1 = (androidx.camera.core.impl.C1568v.C1569a) r1     // Catch:{ all -> 0x007e }
            r5.add(r1)     // Catch:{ all -> 0x007e }
            goto L_0x002c
        L_0x0050:
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch:{ all -> 0x007e }
            if (r6 != r1) goto L_0x0065
            int r6 = r4.f4474e     // Catch:{ all -> 0x007e }
            if (r6 <= 0) goto L_0x0065
            java.util.Map<androidx.camera.core.j, androidx.camera.core.impl.v$a> r6 = r4.f4473d     // Catch:{ all -> 0x007e }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x007e }
            androidx.camera.core.impl.v$a r5 = (androidx.camera.core.impl.C1568v.C1569a) r5     // Catch:{ all -> 0x007e }
            java.util.List r5 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x007e }
            goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x007d
            java.util.Iterator r5 = r5.iterator()
        L_0x006d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007d
            java.lang.Object r6 = r5.next()
            androidx.camera.core.impl.v$a r6 = (androidx.camera.core.impl.C1568v.C1569a) r6
            r6.mo5527b()
            goto L_0x006d
        L_0x007d:
            return
        L_0x007e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C1568v.mo5520b(androidx.camera.core.j, androidx.camera.core.impl.CameraInternal$State):void");
    }

    @C0348i1
    @C0323b0("mLock")
    /* renamed from: c */
    public final void mo5521c() {
        String str;
        if (C1417i2.m5917g(f4469f)) {
            this.f4470a.setLength(0);
            this.f4470a.append("Recalculating open cameras:\n");
            this.f4470a.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{"Camera", "State"}));
            this.f4470a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry next : this.f4473d.entrySet()) {
            if (C1417i2.m5917g(f4469f)) {
                if (((C1569a) next.getValue()).mo5526a() != null) {
                    str = ((C1569a) next.getValue()).mo5526a().toString();
                } else {
                    str = "UNKNOWN";
                }
                this.f4470a.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{((C1624j) next.getKey()).toString(), str}));
            }
            if (m6509a(((C1569a) next.getValue()).mo5526a())) {
                i++;
            }
        }
        if (C1417i2.m5917g(f4469f)) {
            this.f4470a.append("-------------------------------------------------------------------\n");
            this.f4470a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f4472c)}));
            C1417i2.m5911a(f4469f, this.f4470a.toString());
        }
        this.f4474e = Math.max(this.f4472c - i, 0);
    }

    /* renamed from: d */
    public void mo5522d(@C0359n0 C1624j jVar, @C0359n0 Executor executor, @C0359n0 C1570b bVar) {
        boolean z;
        synchronized (this.f4471b) {
            if (!this.f4473d.containsKey(jVar)) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, "Camera is already registered: " + jVar);
            this.f4473d.put(jVar, new C1569a((CameraInternal.State) null, executor, bVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5523e(@androidx.annotation.C0359n0 androidx.camera.core.C1624j r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f4471b
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.j, androidx.camera.core.impl.v$a> r1 = r9.f4473d     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ all -> 0x009b }
            androidx.camera.core.impl.v$a r1 = (androidx.camera.core.impl.C1568v.C1569a) r1     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = androidx.core.util.C18001r.m81776m(r1, r2)     // Catch:{ all -> 0x009b }
            androidx.camera.core.impl.v$a r1 = (androidx.camera.core.impl.C1568v.C1569a) r1     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = androidx.camera.core.C1417i2.m5917g(r2)     // Catch:{ all -> 0x009b }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0052
            java.lang.StringBuilder r2 = r9.f4470a     // Catch:{ all -> 0x009b }
            r2.setLength(r4)     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r2 = r9.f4470a     // Catch:{ all -> 0x009b }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x009b }
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x009b }
            r7[r4] = r10     // Catch:{ all -> 0x009b }
            int r10 = r9.f4474e     // Catch:{ all -> 0x009b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x009b }
            r7[r3] = r10     // Catch:{ all -> 0x009b }
            androidx.camera.core.impl.CameraInternal$State r10 = r1.mo5526a()     // Catch:{ all -> 0x009b }
            boolean r10 = m6509a(r10)     // Catch:{ all -> 0x009b }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x009b }
            r8 = 2
            r7[r8] = r10     // Catch:{ all -> 0x009b }
            androidx.camera.core.impl.CameraInternal$State r10 = r1.mo5526a()     // Catch:{ all -> 0x009b }
            r8 = 3
            r7[r8] = r10     // Catch:{ all -> 0x009b }
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch:{ all -> 0x009b }
            r2.append(r10)     // Catch:{ all -> 0x009b }
        L_0x0052:
            int r10 = r9.f4474e     // Catch:{ all -> 0x009b }
            if (r10 > 0) goto L_0x0063
            androidx.camera.core.impl.CameraInternal$State r10 = r1.mo5526a()     // Catch:{ all -> 0x009b }
            boolean r10 = m6509a(r10)     // Catch:{ all -> 0x009b }
            if (r10 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r10 = r4
            goto L_0x0069
        L_0x0063:
            androidx.camera.core.impl.CameraInternal$State r10 = androidx.camera.core.impl.CameraInternal.State.OPENING     // Catch:{ all -> 0x009b }
            r1.mo5528c(r10)     // Catch:{ all -> 0x009b }
            r10 = r3
        L_0x0069:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.C1417i2.m5917g(r1)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0094
            java.lang.StringBuilder r1 = r9.f4470a     // Catch:{ all -> 0x009b }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x009b }
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x009b }
            if (r10 == 0) goto L_0x007e
            java.lang.String r6 = "SUCCESS"
            goto L_0x0080
        L_0x007e:
            java.lang.String r6 = "FAIL"
        L_0x0080:
            r3[r4] = r6     // Catch:{ all -> 0x009b }
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch:{ all -> 0x009b }
            r1.append(r2)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.f4470a     // Catch:{ all -> 0x009b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x009b }
            androidx.camera.core.C1417i2.m5911a(r1, r2)     // Catch:{ all -> 0x009b }
        L_0x0094:
            if (r10 == 0) goto L_0x0099
            r9.mo5521c()     // Catch:{ all -> 0x009b }
        L_0x0099:
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            return r10
        L_0x009b:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C1568v.mo5523e(androidx.camera.core.j):boolean");
    }

    @C0363p0
    @C0323b0("mLock")
    /* renamed from: f */
    public final CameraInternal.State mo5524f(C1624j jVar) {
        C1569a remove = this.f4473d.remove(jVar);
        if (remove == null) {
            return null;
        }
        mo5521c();
        return remove.mo5526a();
    }

    @C0363p0
    @C0323b0("mLock")
    /* renamed from: g */
    public final CameraInternal.State mo5525g(@C0359n0 C1624j jVar, @C0359n0 CameraInternal.State state) {
        boolean z;
        CameraInternal.State c = ((C1569a) C18001r.m81776m(this.f4473d.get(jVar), "Cannot update state of camera which has not yet been registered. Register with CameraAvailabilityRegistry.registerCamera()")).mo5528c(state);
        CameraInternal.State state2 = CameraInternal.State.OPENING;
        if (state == state2) {
            if (m6509a(state) || c == state2) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, "Cannot mark camera as opening until camera was successful at calling CameraAvailabilityRegistry.tryOpen()");
        }
        if (c != state) {
            mo5521c();
        }
        return c;
    }
}
