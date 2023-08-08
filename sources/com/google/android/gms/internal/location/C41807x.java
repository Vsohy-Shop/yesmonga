package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.location.C30372p;

/* renamed from: com.google.android.gms.internal.location.x */
public final class C41807x extends C41776j {

    /* renamed from: n */
    public C40538e.C40540b<Status> f105931n;

    public C41807x(C40538e.C40540b<Status> bVar) {
        this.f105931n = bVar;
    }

    /* renamed from: D8 */
    public final void mo136192D8(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    /* renamed from: H0 */
    public final void mo136243H0(int i) {
        if (this.f105931n == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.f105931n.mo85669a(C30372p.m122199b(C30372p.m122198a(i)));
        this.f105931n = null;
    }

    /* renamed from: r1 */
    public final void mo136193r1(int i, String[] strArr) {
        mo136243H0(i);
    }

    /* renamed from: s4 */
    public final void mo136194s4(int i, PendingIntent pendingIntent) {
        mo136243H0(i);
    }
}
