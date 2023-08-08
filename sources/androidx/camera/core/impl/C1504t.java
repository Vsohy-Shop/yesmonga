package androidx.camera.core.impl;

import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.t */
public final class C1504t {

    /* renamed from: f */
    public static final String f4278f = "CameraRepository";

    /* renamed from: a */
    public final Object f4279a = new Object();
    @C0323b0("mCamerasLock")

    /* renamed from: b */
    public final Map<String, CameraInternal> f4280b = new LinkedHashMap();
    @C0323b0("mCamerasLock")

    /* renamed from: c */
    public final Set<CameraInternal> f4281c = new HashSet();
    @C0323b0("mCamerasLock")

    /* renamed from: d */
    public C32487a<Void> f4282d;
    @C0323b0("mCamerasLock")

    /* renamed from: e */
    public CallbackToFutureAdapter.C16559a<Void> f4283e;

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m6305h(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        synchronized (this.f4279a) {
            this.f4283e = aVar;
        }
        return "CameraRepository-deinit";
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m6306i(CameraInternal cameraInternal) {
        synchronized (this.f4279a) {
            this.f4281c.remove(cameraInternal);
            if (this.f4281c.isEmpty()) {
                C18001r.m81775l(this.f4283e);
                this.f4283e.mo48125c(null);
                this.f4283e = null;
                this.f4282d = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return r1;
     */
    @androidx.annotation.C0359n0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.util.concurrent.C32487a<java.lang.Void> mo5319c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4279a
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r1 = r6.f4280b     // Catch:{ all -> 0x005e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0016
            com.google.common.util.concurrent.a<java.lang.Void> r1 = r6.f4282d     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0014
            r1 = 0
            com.google.common.util.concurrent.a r1 = androidx.camera.core.impl.utils.futures.C1548f.m6479h(r1)     // Catch:{ all -> 0x005e }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return r1
        L_0x0016:
            com.google.common.util.concurrent.a<java.lang.Void> r1 = r6.f4282d     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0025
            androidx.camera.core.impl.r r1 = new androidx.camera.core.impl.r     // Catch:{ all -> 0x005e }
            r1.<init>(r6)     // Catch:{ all -> 0x005e }
            com.google.common.util.concurrent.a r1 = androidx.concurrent.futures.CallbackToFutureAdapter.m74987a(r1)     // Catch:{ all -> 0x005e }
            r6.f4282d = r1     // Catch:{ all -> 0x005e }
        L_0x0025:
            java.util.Set<androidx.camera.core.impl.CameraInternal> r2 = r6.f4281c     // Catch:{ all -> 0x005e }
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r3 = r6.f4280b     // Catch:{ all -> 0x005e }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x005e }
            r2.addAll(r3)     // Catch:{ all -> 0x005e }
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r2 = r6.f4280b     // Catch:{ all -> 0x005e }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x005e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005e }
        L_0x003a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x005e }
            if (r3 == 0) goto L_0x0057
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x005e }
            androidx.camera.core.impl.CameraInternal r3 = (androidx.camera.core.impl.CameraInternal) r3     // Catch:{ all -> 0x005e }
            com.google.common.util.concurrent.a r4 = r3.release()     // Catch:{ all -> 0x005e }
            androidx.camera.core.impl.s r5 = new androidx.camera.core.impl.s     // Catch:{ all -> 0x005e }
            r5.<init>(r6, r3)     // Catch:{ all -> 0x005e }
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.C1525a.m6437a()     // Catch:{ all -> 0x005e }
            r4.mo5489q(r5, r3)     // Catch:{ all -> 0x005e }
            goto L_0x003a
        L_0x0057:
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r2 = r6.f4280b     // Catch:{ all -> 0x005e }
            r2.clear()     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return r1
        L_0x005e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C1504t.mo5319c():com.google.common.util.concurrent.a");
    }

    @C0359n0
    /* renamed from: d */
    public CameraInternal mo5320d(@C0359n0 String str) {
        CameraInternal cameraInternal;
        synchronized (this.f4279a) {
            cameraInternal = this.f4280b.get(str);
            if (cameraInternal == null) {
                throw new IllegalArgumentException("Invalid camera: " + str);
            }
        }
        return cameraInternal;
    }

    @C0359n0
    /* renamed from: e */
    public Set<String> mo5321e() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f4279a) {
            linkedHashSet = new LinkedHashSet(this.f4280b.keySet());
        }
        return linkedHashSet;
    }

    @C0359n0
    /* renamed from: f */
    public LinkedHashSet<CameraInternal> mo5322f() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.f4279a) {
            linkedHashSet = new LinkedHashSet<>(this.f4280b.values());
        }
        return linkedHashSet;
    }

    /* renamed from: g */
    public void mo5323g(@C0359n0 C1477m mVar) throws InitializationException {
        synchronized (this.f4279a) {
            try {
                for (String next : mVar.mo4718c()) {
                    C1417i2.m5911a(f4278f, "Added camera: " + next);
                    this.f4280b.put(next, mVar.mo4717b(next));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException((Throwable) e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
