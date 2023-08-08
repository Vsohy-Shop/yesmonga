package com.google.android.gms.location;

import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.d0 */
public final class C30324d0 extends C30354k {

    /* renamed from: a */
    public final /* synthetic */ C31049l f72774a;

    /* renamed from: b */
    public final /* synthetic */ C30327e f72775b;

    public C30324d0(C30327e eVar, C31049l lVar) {
        this.f72775b = eVar;
        this.f72774a = lVar;
    }

    public final void onLocationAvailability(LocationAvailability locationAvailability) {
    }

    public final void onLocationResult(LocationResult locationResult) {
        this.f72774a.mo87745e(locationResult.mo85593W());
        this.f72775b.mo85677L(this);
    }
}
