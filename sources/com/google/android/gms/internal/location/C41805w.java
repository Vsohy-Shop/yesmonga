package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.location.C30372p;

/* renamed from: com.google.android.gms.internal.location.w */
public final class C41805w extends C41776j {

    /* renamed from: n */
    public C40538e.C40540b<Status> f105928n;

    public C41805w(C40538e.C40540b<Status> bVar) {
        this.f105928n = bVar;
    }

    /* renamed from: D8 */
    public final void mo136192D8(int i, String[] strArr) {
        if (this.f105928n == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        this.f105928n.mo85669a(C30372p.m122199b(C30372p.m122198a(i)));
        this.f105928n = null;
    }

    /* renamed from: r1 */
    public final void mo136193r1(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    /* renamed from: s4 */
    public final void mo136194s4(int i, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }
}
