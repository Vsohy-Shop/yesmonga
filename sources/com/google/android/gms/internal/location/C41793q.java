package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.location.C30354k;
import com.google.android.gms.location.LocationAvailability;

/* renamed from: com.google.android.gms.internal.location.q */
public final class C41793q implements C40592n.C40594b<C30354k> {

    /* renamed from: a */
    public final /* synthetic */ LocationAvailability f105913a;

    public C41793q(C41795r rVar, LocationAvailability locationAvailability) {
        this.f105913a = locationAvailability;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo133900a(Object obj) {
        ((C30354k) obj).onLocationAvailability(this.f105913a);
    }

    /* renamed from: b */
    public final void mo133901b() {
    }
}
