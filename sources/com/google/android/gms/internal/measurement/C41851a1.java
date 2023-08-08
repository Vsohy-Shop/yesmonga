package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.a1 */
public final class C41851a1 extends C41959g1 {

    /* renamed from: n */
    public final AtomicReference f105985n = new AtomicReference();

    /* renamed from: o */
    public boolean f105986o;

    /* renamed from: E8 */
    public static final Object m169583E8(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get(C28515a1.f68703k)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()});
            throw e;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo136496H0(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f105985n
            monitor-enter(r0)
            boolean r1 = r2.f105986o     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f105985n     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f105985n     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41851a1.mo136496H0(long):android.os.Bundle");
    }

    /* renamed from: O0 */
    public final Long mo136497O0(long j) {
        return (Long) m169583E8(mo136496H0(j), Long.class);
    }

    /* renamed from: T6 */
    public final String mo136498T6(long j) {
        return (String) m169583E8(mo136496H0(j), String.class);
    }

    /* renamed from: s6 */
    public final void mo136499s6(Bundle bundle) {
        synchronized (this.f105985n) {
            try {
                this.f105985n.set(bundle);
                this.f105986o = true;
                this.f105985n.notify();
            } catch (Throwable th) {
                this.f105985n.notify();
                throw th;
            }
        }
    }
}
