package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.C40635v;
import com.google.android.gms.internal.location.C41811z;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.k0 */
public final /* synthetic */ class C30355k0 implements C40635v {

    /* renamed from: a */
    public final GeofencingRequest f72815a;

    /* renamed from: b */
    public final PendingIntent f72816b;

    public C30355k0(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.f72815a = geofencingRequest;
        this.f72816b = pendingIntent;
    }

    /* renamed from: a */
    public final void mo85637a(Object obj, Object obj2) {
        ((C41811z) obj).mo136260M0(this.f72815a, this.f72816b, new C30367n0((C31049l) obj2));
    }
}
